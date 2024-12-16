package com.mapbox.maps.testapp.examples.viewport

import android.content.res.Resources
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.mapbox.maps.CameraOptions
import com.mapbox.maps.EdgeInsets
import com.mapbox.maps.ImageHolder
import com.mapbox.maps.plugin.LocationPuck2D
import com.mapbox.maps.plugin.locationcomponent.location
import com.mapbox.maps.plugin.viewport.data.FollowPuckViewportStateOptions
import com.mapbox.maps.plugin.viewport.state.FollowPuckViewportState
import com.mapbox.maps.plugin.viewport.viewport
import com.mapbox.maps.testapp.R
import com.mapbox.maps.testapp.databinding.ActivityViewportAnimationBinding
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.location.LocationCallback
import com.google.android.gms.location.LocationRequest
import com.google.android.gms.location.LocationResult
import com.mapbox.maps.MapView

class ViewportShowcaseActivity2 : AppCompatActivity() {
  private lateinit var fusedLocationProviderClient: FusedLocationProviderClient
  private lateinit var locationCallback: LocationCallback
  private lateinit var viewportButton: Button

  private lateinit var followPuckViewportState: FollowPuckViewportState

  private val pixelDensity = Resources.getSystem().displayMetrics.density
  private val followingPadding: EdgeInsets by lazy {
    EdgeInsets(
      380.0 * pixelDensity,
      40.0 * pixelDensity,
      150.0 * pixelDensity,
      40.0 * pixelDensity
    )
  }
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val binding = ActivityViewportAnimationBinding.inflate(layoutInflater)
    setContentView(binding.root)

    viewportButton = binding.switchButton
    // 初始化位置提供器
    fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this)

    // 启用实时定位
    startLocationUpdates(binding.mapView)
  }

  private fun startLocationUpdates(mapView: MapView) {
    // 可以删除
    mapView.getMapboxMap().setCamera(CameraOptions.Builder().pitch(0.0).build())

    // 定位请求参数
    val locationRequest = LocationRequest.create().apply {
      interval = 1000 // 更新间隔 (1秒)
      fastestInterval = 500 // 最快间隔
      priority = LocationRequest.PRIORITY_HIGH_ACCURACY
      smallestDisplacement = 1.0f
    }

    // 监听定位结果
    locationCallback = object : LocationCallback() {
      override fun onLocationResult(locationResult: LocationResult) {
        super.onLocationResult(locationResult)
        for (location in locationResult.locations) {
//          updateLocationOnMap(mapView, location)
          Toast.makeText(this@ViewportShowcaseActivity2, location.toString(), Toast.LENGTH_SHORT).show()
        }

      }
    }

    // 视角跟随
    followPuckViewportState =mapView.viewport.makeFollowPuckViewportState(
      FollowPuckViewportStateOptions.Builder()
        .pitch(0.0)
        .padding(followingPadding)
        .build()
    )
    mapView.location.updateSettings {
      locationPuck = LocationPuck2D(
        bearingImage = ImageHolder.from(R.drawable.mapbox_mylocation_icon_bearing)
      )
      puckBearingEnabled = true // 启用图标方向跟随
    }
    viewportButton.setOnClickListener {
      mapView.viewport.transitionTo(followPuckViewportState)
    }
    // 开始请求位置更新
    fusedLocationProviderClient.requestLocationUpdates(locationRequest, locationCallback, mainLooper)
  }

  override fun onDestroy() {
    super.onDestroy()
    fusedLocationProviderClient.removeLocationUpdates(locationCallback)
  }
}
