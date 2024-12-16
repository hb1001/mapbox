// This file is generated.

package com.mapbox.maps.extension.compose.style.layers.generated

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.mapbox.maps.extension.compose.style.ColorValue
import com.mapbox.maps.extension.compose.style.DoubleListValue
import com.mapbox.maps.extension.compose.style.DoubleValue
import com.mapbox.maps.extension.compose.style.LongValue
import com.mapbox.maps.extension.compose.style.StringValue
import com.mapbox.maps.extension.compose.style.Transition
import com.mapbox.maps.extension.compose.style.layers.Filter
import com.mapbox.maps.extension.compose.style.layers.ImageValue
import com.mapbox.maps.extension.compose.style.layers.internal.LayerNode

/**
 * The state holder for [LocationIndicatorLayer]'s layer properties.
 *
 * @see [The online documentation](https://docs.mapbox.com/style-spec/reference/layers#location-indicator)
 */
@Stable
public class LocationIndicatorLayerState private constructor(
  initialBearingImage: ImageValue,
  initialShadowImage: ImageValue,
  initialTopImage: ImageValue,
  initialAccuracyRadius: DoubleValue,
  initialAccuracyRadiusTransition: Transition,
  initialAccuracyRadiusBorderColor: ColorValue,
  initialAccuracyRadiusBorderColorTransition: Transition,
  initialAccuracyRadiusColor: ColorValue,
  initialAccuracyRadiusColorTransition: Transition,
  initialBearing: DoubleValue,
  initialBearingTransition: Transition,
  initialBearingImageSize: DoubleValue,
  initialBearingImageSizeTransition: Transition,
  initialEmphasisCircleColor: ColorValue,
  initialEmphasisCircleColorTransition: Transition,
  initialEmphasisCircleRadius: DoubleValue,
  initialEmphasisCircleRadiusTransition: Transition,
  initialImagePitchDisplacement: DoubleValue,
  initialLocation: DoubleListValue,
  initialLocationTransition: Transition,
  initialLocationIndicatorOpacity: DoubleValue,
  initialLocationIndicatorOpacityTransition: Transition,
  initialPerspectiveCompensation: DoubleValue,
  initialShadowImageSize: DoubleValue,
  initialShadowImageSizeTransition: Transition,
  initialTopImageSize: DoubleValue,
  initialTopImageSizeTransition: Transition,
  initialVisibility: VisibilityValue,
  initialMinZoom: LongValue,
  initialMaxZoom: LongValue,
  initialSourceLayer: StringValue,
  initialFilter: Filter,
) {
  /**
   * Construct an default [LocationIndicatorLayerState].
   */
  public constructor() : this(
    initialBearingImage = ImageValue.INITIAL,
    initialShadowImage = ImageValue.INITIAL,
    initialTopImage = ImageValue.INITIAL,
    initialAccuracyRadius = DoubleValue.INITIAL,
    initialAccuracyRadiusTransition = Transition.INITIAL,
    initialAccuracyRadiusBorderColor = ColorValue.INITIAL,
    initialAccuracyRadiusBorderColorTransition = Transition.INITIAL,
    initialAccuracyRadiusColor = ColorValue.INITIAL,
    initialAccuracyRadiusColorTransition = Transition.INITIAL,
    initialBearing = DoubleValue.INITIAL,
    initialBearingTransition = Transition.INITIAL,
    initialBearingImageSize = DoubleValue.INITIAL,
    initialBearingImageSizeTransition = Transition.INITIAL,
    initialEmphasisCircleColor = ColorValue.INITIAL,
    initialEmphasisCircleColorTransition = Transition.INITIAL,
    initialEmphasisCircleRadius = DoubleValue.INITIAL,
    initialEmphasisCircleRadiusTransition = Transition.INITIAL,
    initialImagePitchDisplacement = DoubleValue.INITIAL,
    initialLocation = DoubleListValue.INITIAL,
    initialLocationTransition = Transition.INITIAL,
    initialLocationIndicatorOpacity = DoubleValue.INITIAL,
    initialLocationIndicatorOpacityTransition = Transition.INITIAL,
    initialPerspectiveCompensation = DoubleValue.INITIAL,
    initialShadowImageSize = DoubleValue.INITIAL,
    initialShadowImageSizeTransition = Transition.INITIAL,
    initialTopImageSize = DoubleValue.INITIAL,
    initialTopImageSizeTransition = Transition.INITIAL,
    initialVisibility = VisibilityValue.INITIAL,
    initialMinZoom = LongValue.INITIAL,
    initialMaxZoom = LongValue.INITIAL,
    initialSourceLayer = StringValue.INITIAL,
    initialFilter = Filter.INITIAL,
  )

  /**
   *  Name of image in sprite to use as the middle of the location indicator.
   */
  public var bearingImage: ImageValue by mutableStateOf(initialBearingImage)
  /**
   *  Name of image in sprite to use as the background of the location indicator.
   */
  public var shadowImage: ImageValue by mutableStateOf(initialShadowImage)
  /**
   *  Name of image in sprite to use as the top of the location indicator.
   */
  public var topImage: ImageValue by mutableStateOf(initialTopImage)
  /**
   *  The accuracy, in meters, of the position source used to retrieve the position of the location indicator. Default value: 0.
   */
  public var accuracyRadius: DoubleValue by mutableStateOf(initialAccuracyRadius)
  /**
   *  Defines the transition of [accuracyRadius]. Default value: 0.
   */
  public var accuracyRadiusTransition: Transition by mutableStateOf(initialAccuracyRadiusTransition)
  /**
   *  The color for drawing the accuracy radius border. To adjust transparency, set the alpha component of the color accordingly. Default value: "#ffffff".
   */
  public var accuracyRadiusBorderColor: ColorValue by mutableStateOf(initialAccuracyRadiusBorderColor)
  /**
   *  Defines the transition of [accuracyRadiusBorderColor]. Default value: "#ffffff".
   */
  public var accuracyRadiusBorderColorTransition: Transition by mutableStateOf(initialAccuracyRadiusBorderColorTransition)
  /**
   *  The color for drawing the accuracy radius, as a circle. To adjust transparency, set the alpha component of the color accordingly. Default value: "#ffffff".
   */
  public var accuracyRadiusColor: ColorValue by mutableStateOf(initialAccuracyRadiusColor)
  /**
   *  Defines the transition of [accuracyRadiusColor]. Default value: "#ffffff".
   */
  public var accuracyRadiusColorTransition: Transition by mutableStateOf(initialAccuracyRadiusColorTransition)
  /**
   *  The bearing of the location indicator. Default value: 0.
   */
  public var bearing: DoubleValue by mutableStateOf(initialBearing)
  /**
   *  Defines the transition of [bearing]. Default value: 0.
   */
  public var bearingTransition: Transition by mutableStateOf(initialBearingTransition)
  /**
   *  The size of the bearing image, as a scale factor applied to the size of the specified image. Default value: 1.
   */
  public var bearingImageSize: DoubleValue by mutableStateOf(initialBearingImageSize)
  /**
   *  Defines the transition of [bearingImageSize]. Default value: 1.
   */
  public var bearingImageSizeTransition: Transition by mutableStateOf(initialBearingImageSizeTransition)
  /**
   *  The color of the circle emphasizing the indicator. To adjust transparency, set the alpha component of the color accordingly. Default value: "#ffffff".
   */
  public var emphasisCircleColor: ColorValue by mutableStateOf(initialEmphasisCircleColor)
  /**
   *  Defines the transition of [emphasisCircleColor]. Default value: "#ffffff".
   */
  public var emphasisCircleColorTransition: Transition by mutableStateOf(initialEmphasisCircleColorTransition)
  /**
   *  The radius, in pixel, of the circle emphasizing the indicator, drawn between the accuracy radius and the indicator shadow. Default value: 0.
   */
  public var emphasisCircleRadius: DoubleValue by mutableStateOf(initialEmphasisCircleRadius)
  /**
   *  Defines the transition of [emphasisCircleRadius]. Default value: 0.
   */
  public var emphasisCircleRadiusTransition: Transition by mutableStateOf(initialEmphasisCircleRadiusTransition)
  /**
   *  The displacement off the center of the top image and the shadow image when the pitch of the map is greater than 0. This helps producing a three-dimensional appearence. Default value: "0".
   */
  public var imagePitchDisplacement: DoubleValue by mutableStateOf(initialImagePitchDisplacement)
  /**
   *  An array of [latitude, longitude, altitude] position of the location indicator. Default value: [0,0,0].
   */
  public var location: DoubleListValue by mutableStateOf(initialLocation)
  /**
   *  Defines the transition of [location]. Default value: [0,0,0].
   */
  public var locationTransition: Transition by mutableStateOf(initialLocationTransition)
  /**
   *  The opacity of the entire location indicator layer. Default value: 1. Value range: [0, 1]
   */
  public var locationIndicatorOpacity: DoubleValue by mutableStateOf(initialLocationIndicatorOpacity)
  /**
   *  Defines the transition of [locationIndicatorOpacity]. Default value: 1. Value range: [0, 1]
   */
  public var locationIndicatorOpacityTransition: Transition by mutableStateOf(initialLocationIndicatorOpacityTransition)
  /**
   *  The amount of the perspective compensation, between 0 and 1. A value of 1 produces a location indicator of constant width across the screen. A value of 0 makes it scale naturally according to the viewing projection. Default value: "0.85".
   */
  public var perspectiveCompensation: DoubleValue by mutableStateOf(initialPerspectiveCompensation)
  /**
   *  The size of the shadow image, as a scale factor applied to the size of the specified image. Default value: 1.
   */
  public var shadowImageSize: DoubleValue by mutableStateOf(initialShadowImageSize)
  /**
   *  Defines the transition of [shadowImageSize]. Default value: 1.
   */
  public var shadowImageSizeTransition: Transition by mutableStateOf(initialShadowImageSizeTransition)
  /**
   *  The size of the top image, as a scale factor applied to the size of the specified image. Default value: 1.
   */
  public var topImageSize: DoubleValue by mutableStateOf(initialTopImageSize)
  /**
   *  Defines the transition of [topImageSize]. Default value: 1.
   */
  public var topImageSizeTransition: Transition by mutableStateOf(initialTopImageSizeTransition)
  /**
   *  Whether this layer is displayed. Default value: "visible".
   */
  public var visibility: VisibilityValue by mutableStateOf(initialVisibility)
  /**
   *  The minimum zoom level for the layer. At zoom levels less than the minzoom, the layer will be hidden. Value range: [0, 24]
   */
  public var minZoom: LongValue by mutableStateOf(initialMinZoom)
  /**
   *  The maximum zoom level for the layer. At zoom levels equal to or greater than the maxzoom, the layer will be hidden. Value range: [0, 24]
   */
  public var maxZoom: LongValue by mutableStateOf(initialMaxZoom)
  /**
   *  Layer to use from a vector tile source. Required for vector tile sources; prohibited for all other source types, including GeoJSON sources.
   */
  public var sourceLayer: StringValue by mutableStateOf(initialSourceLayer)
  /**
   *  An expression specifying conditions on source features. Only features that match the filter are displayed. Zoom expressions in filters are only evaluated at integer zoom levels. The `["feature-state", ...]` expression is not supported in filter expressions. The `["pitch"]` and `["distance-from-center"]` expressions are supported only for filter expressions on the symbol layer.
   */
  public var filter: Filter by mutableStateOf(initialFilter)

  @Composable
  private fun UpdateBearingImage(layerNode: LayerNode) {
    if (bearingImage.notInitial) {
      bearingImage.styleImage?.let {
        layerNode.addImage(it)
      }
      layerNode.setProperty("bearing-image", bearingImage.value)
    }
  }
  @Composable
  private fun UpdateShadowImage(layerNode: LayerNode) {
    if (shadowImage.notInitial) {
      shadowImage.styleImage?.let {
        layerNode.addImage(it)
      }
      layerNode.setProperty("shadow-image", shadowImage.value)
    }
  }
  @Composable
  private fun UpdateTopImage(layerNode: LayerNode) {
    if (topImage.notInitial) {
      topImage.styleImage?.let {
        layerNode.addImage(it)
      }
      layerNode.setProperty("top-image", topImage.value)
    }
  }
  @Composable
  private fun UpdateAccuracyRadius(layerNode: LayerNode) {
    if (accuracyRadius.notInitial) {
      layerNode.setProperty("accuracy-radius", accuracyRadius.value)
    }
  }
  @Composable
  private fun UpdateAccuracyRadiusTransition(layerNode: LayerNode) {
    if (accuracyRadiusTransition.notInitial) {
      layerNode.setProperty("accuracy-radius-transition", accuracyRadiusTransition.value)
    }
  }
  @Composable
  private fun UpdateAccuracyRadiusBorderColor(layerNode: LayerNode) {
    if (accuracyRadiusBorderColor.notInitial) {
      layerNode.setProperty("accuracy-radius-border-color", accuracyRadiusBorderColor.value)
    }
  }
  @Composable
  private fun UpdateAccuracyRadiusBorderColorTransition(layerNode: LayerNode) {
    if (accuracyRadiusBorderColorTransition.notInitial) {
      layerNode.setProperty("accuracy-radius-border-color-transition", accuracyRadiusBorderColorTransition.value)
    }
  }
  @Composable
  private fun UpdateAccuracyRadiusColor(layerNode: LayerNode) {
    if (accuracyRadiusColor.notInitial) {
      layerNode.setProperty("accuracy-radius-color", accuracyRadiusColor.value)
    }
  }
  @Composable
  private fun UpdateAccuracyRadiusColorTransition(layerNode: LayerNode) {
    if (accuracyRadiusColorTransition.notInitial) {
      layerNode.setProperty("accuracy-radius-color-transition", accuracyRadiusColorTransition.value)
    }
  }
  @Composable
  private fun UpdateBearing(layerNode: LayerNode) {
    if (bearing.notInitial) {
      layerNode.setProperty("bearing", bearing.value)
    }
  }
  @Composable
  private fun UpdateBearingTransition(layerNode: LayerNode) {
    if (bearingTransition.notInitial) {
      layerNode.setProperty("bearing-transition", bearingTransition.value)
    }
  }
  @Composable
  private fun UpdateBearingImageSize(layerNode: LayerNode) {
    if (bearingImageSize.notInitial) {
      layerNode.setProperty("bearing-image-size", bearingImageSize.value)
    }
  }
  @Composable
  private fun UpdateBearingImageSizeTransition(layerNode: LayerNode) {
    if (bearingImageSizeTransition.notInitial) {
      layerNode.setProperty("bearing-image-size-transition", bearingImageSizeTransition.value)
    }
  }
  @Composable
  private fun UpdateEmphasisCircleColor(layerNode: LayerNode) {
    if (emphasisCircleColor.notInitial) {
      layerNode.setProperty("emphasis-circle-color", emphasisCircleColor.value)
    }
  }
  @Composable
  private fun UpdateEmphasisCircleColorTransition(layerNode: LayerNode) {
    if (emphasisCircleColorTransition.notInitial) {
      layerNode.setProperty("emphasis-circle-color-transition", emphasisCircleColorTransition.value)
    }
  }
  @Composable
  private fun UpdateEmphasisCircleRadius(layerNode: LayerNode) {
    if (emphasisCircleRadius.notInitial) {
      layerNode.setProperty("emphasis-circle-radius", emphasisCircleRadius.value)
    }
  }
  @Composable
  private fun UpdateEmphasisCircleRadiusTransition(layerNode: LayerNode) {
    if (emphasisCircleRadiusTransition.notInitial) {
      layerNode.setProperty("emphasis-circle-radius-transition", emphasisCircleRadiusTransition.value)
    }
  }
  @Composable
  private fun UpdateImagePitchDisplacement(layerNode: LayerNode) {
    if (imagePitchDisplacement.notInitial) {
      layerNode.setProperty("image-pitch-displacement", imagePitchDisplacement.value)
    }
  }
  @Composable
  private fun UpdateLocation(layerNode: LayerNode) {
    if (location.notInitial) {
      layerNode.setProperty("location", location.value)
    }
  }
  @Composable
  private fun UpdateLocationTransition(layerNode: LayerNode) {
    if (locationTransition.notInitial) {
      layerNode.setProperty("location-transition", locationTransition.value)
    }
  }
  @Composable
  private fun UpdateLocationIndicatorOpacity(layerNode: LayerNode) {
    if (locationIndicatorOpacity.notInitial) {
      layerNode.setProperty("location-indicator-opacity", locationIndicatorOpacity.value)
    }
  }
  @Composable
  private fun UpdateLocationIndicatorOpacityTransition(layerNode: LayerNode) {
    if (locationIndicatorOpacityTransition.notInitial) {
      layerNode.setProperty("location-indicator-opacity-transition", locationIndicatorOpacityTransition.value)
    }
  }
  @Composable
  private fun UpdatePerspectiveCompensation(layerNode: LayerNode) {
    if (perspectiveCompensation.notInitial) {
      layerNode.setProperty("perspective-compensation", perspectiveCompensation.value)
    }
  }
  @Composable
  private fun UpdateShadowImageSize(layerNode: LayerNode) {
    if (shadowImageSize.notInitial) {
      layerNode.setProperty("shadow-image-size", shadowImageSize.value)
    }
  }
  @Composable
  private fun UpdateShadowImageSizeTransition(layerNode: LayerNode) {
    if (shadowImageSizeTransition.notInitial) {
      layerNode.setProperty("shadow-image-size-transition", shadowImageSizeTransition.value)
    }
  }
  @Composable
  private fun UpdateTopImageSize(layerNode: LayerNode) {
    if (topImageSize.notInitial) {
      layerNode.setProperty("top-image-size", topImageSize.value)
    }
  }
  @Composable
  private fun UpdateTopImageSizeTransition(layerNode: LayerNode) {
    if (topImageSizeTransition.notInitial) {
      layerNode.setProperty("top-image-size-transition", topImageSizeTransition.value)
    }
  }
  @Composable
  private fun UpdateVisibility(layerNode: LayerNode) {
    if (visibility.notInitial) {
      layerNode.setProperty("visibility", visibility.value)
    }
  }
  @Composable
  private fun UpdateMinZoom(layerNode: LayerNode) {
    if (minZoom.notInitial) {
      layerNode.setProperty("minzoom", minZoom.value)
    }
  }
  @Composable
  private fun UpdateMaxZoom(layerNode: LayerNode) {
    if (maxZoom.notInitial) {
      layerNode.setProperty("maxzoom", maxZoom.value)
    }
  }
  @Composable
  private fun UpdateSourceLayer(layerNode: LayerNode) {
    if (sourceLayer.notInitial) {
      layerNode.setProperty("source-layer", sourceLayer.value)
    }
  }
  @Composable
  private fun UpdateFilter(layerNode: LayerNode) {
    if (filter.notInitial) {
      layerNode.setProperty("filter", filter.value)
    }
  }

  @Composable
  internal fun UpdateProperties(layerNode: LayerNode) {
    UpdateBearingImage(layerNode)
    UpdateShadowImage(layerNode)
    UpdateTopImage(layerNode)
    UpdateAccuracyRadius(layerNode)
    UpdateAccuracyRadiusTransition(layerNode)
    UpdateAccuracyRadiusBorderColor(layerNode)
    UpdateAccuracyRadiusBorderColorTransition(layerNode)
    UpdateAccuracyRadiusColor(layerNode)
    UpdateAccuracyRadiusColorTransition(layerNode)
    UpdateBearing(layerNode)
    UpdateBearingTransition(layerNode)
    UpdateBearingImageSize(layerNode)
    UpdateBearingImageSizeTransition(layerNode)
    UpdateEmphasisCircleColor(layerNode)
    UpdateEmphasisCircleColorTransition(layerNode)
    UpdateEmphasisCircleRadius(layerNode)
    UpdateEmphasisCircleRadiusTransition(layerNode)
    UpdateImagePitchDisplacement(layerNode)
    UpdateLocation(layerNode)
    UpdateLocationTransition(layerNode)
    UpdateLocationIndicatorOpacity(layerNode)
    UpdateLocationIndicatorOpacityTransition(layerNode)
    UpdatePerspectiveCompensation(layerNode)
    UpdateShadowImageSize(layerNode)
    UpdateShadowImageSizeTransition(layerNode)
    UpdateTopImageSize(layerNode)
    UpdateTopImageSizeTransition(layerNode)
    UpdateVisibility(layerNode)
    UpdateMinZoom(layerNode)
    UpdateMaxZoom(layerNode)
    UpdateSourceLayer(layerNode)
    UpdateFilter(layerNode)
  }
}
// End of generated file.