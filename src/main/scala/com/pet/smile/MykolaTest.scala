package com.pet.smile

import smile.clustering.kmeans
import smile.plot.swing._

import scala.util.Random

object MykolaTest extends App {

  val data = Seq.fill(10000)(Random.nextDouble()).toArray.map(_ * Random.nextDouble())
  val matrix = data.grouped(2).toArray

  val km = kmeans(matrix, 18)

  plot(km.centroids, '*')
  //line(km.centroids)
}
