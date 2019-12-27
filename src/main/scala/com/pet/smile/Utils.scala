package com.pet.smile

import com.pet.smile.Models.Coordinate
import Math._

object Utils {

  private def deg2rad(deg: Double) = deg * Math.PI / 180.0

  def inCircle(center: Coordinate, radius: Double, coordinate: Coordinate): Boolean = {
    val lat1 = center.lat
    val lat2 = coordinate.lat
    val lon1 = center.lon
    val lon2 = coordinate.lon

    val distance = 2 * asin(sqrt(pow(sin(deg2rad( (lat1-lat2) / 2)), 2) +
      cos(deg2rad(lat1)) * cos(deg2rad(lat2)) *
        pow(sin(deg2rad((lon1 - lon2) / 2)), 2))) * 6378245

    distance <= radius
  }
}
