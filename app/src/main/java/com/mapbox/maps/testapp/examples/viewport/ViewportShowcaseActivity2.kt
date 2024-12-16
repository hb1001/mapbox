package com.mapbox.maps.testapp.examples.viewport

import android.annotation.SuppressLint
import android.content.Intent
import android.content.res.Configuration
import android.content.res.Resources
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.mapbox.api.directions.v5.models.DirectionsResponse
import com.mapbox.core.constants.Constants
import com.mapbox.geojson.LineString
import com.mapbox.geojson.Point
import com.mapbox.maps.CameraOptions
import com.mapbox.maps.EdgeInsets
import com.mapbox.maps.ImageHolder
import com.mapbox.maps.logI
import com.mapbox.maps.plugin.LocationPuck2D
import com.mapbox.maps.plugin.locationcomponent.location
import com.mapbox.maps.plugin.viewport.ViewportPlugin
import com.mapbox.maps.plugin.viewport.data.FollowPuckViewportStateOptions
import com.mapbox.maps.plugin.viewport.data.OverviewViewportStateOptions
import com.mapbox.maps.plugin.viewport.state.FollowPuckViewportState
import com.mapbox.maps.plugin.viewport.state.OverviewViewportState
import com.mapbox.maps.plugin.viewport.viewport
import com.mapbox.maps.testapp.R
import com.mapbox.maps.testapp.databinding.ActivityViewportAnimationBinding
import com.mapbox.maps.testapp.examples.annotation.AnnotationUtils
import com.mapbox.maps.testapp.utils.SimulateRouteLocationProvider
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import android.location.Location
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
      180.0 * pixelDensity,
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
    // 定位请求参数
    val locationRequest = LocationRequest.create().apply {
      interval = 1000 // 更新间隔 (1秒)
      fastestInterval = 500 // 最快间隔
      priority = LocationRequest.PRIORITY_HIGH_ACCURACY
    }

    // 监听定位结果
    locationCallback = object : LocationCallback() {
      override fun onLocationResult(locationResult: LocationResult) {
        super.onLocationResult(locationResult)
//        for (location in locationResult.locations) {
//          updateLocationOnMap(mapView, location)
//        }
      }
    }
    followPuckViewportState =mapView.viewport.makeFollowPuckViewportState(
      FollowPuckViewportStateOptions.Builder()
        .pitch(0.0)
        .build()
    )
    mapView.location.updateSettings {
      locationPuck = LocationPuck2D(
        bearingImage = ImageHolder.from(R.drawable.mapbox_mylocation_icon_bearing)
      )
      puckBearingEnabled = true // 启用图标方向跟随
    }

    setupViewportPlugin(mapView.viewport)
    // 开始请求位置更新
    fusedLocationProviderClient.requestLocationUpdates(locationRequest, locationCallback, mainLooper)
  }

  private fun updateLocationOnMap(mapView: MapView, location: Location) {
    val point = Point.fromLngLat(location.longitude, location.latitude)
    mapView.mapboxMap.setCamera(
      CameraOptions.Builder()
        .center(point) // 将摄像头移动到用户位置
        .bearing(location.bearing.toDouble()) // 根据用户方向设置地图旋转角度
        .zoom(15.0) // 放大级别
        .build()
    )


  }

  override fun onDestroy() {
    super.onDestroy()
    fusedLocationProviderClient.removeLocationUpdates(locationCallback)
  }

  private fun setupViewportPlugin(viewport: ViewportPlugin) {
    // 初始化跟随和概览视图状态
    followPuckViewportState =
      viewport.makeFollowPuckViewportState(FollowPuckViewportStateOptions.Builder().build())
    // 根据屏幕方向设置不同的 padding
    followPuckViewportState.options = followPuckViewportState.options.toBuilder()
      .padding(followingPadding).build()

    // 为按钮绑定点击事件
    viewportButton.setOnClickListener {
      viewport.transitionTo(followPuckViewportState)
    }
  }
}
