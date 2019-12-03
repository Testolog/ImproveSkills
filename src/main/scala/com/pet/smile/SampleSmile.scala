package com.pet.smile

import smile.clustering._
import smile.plot._

import scala.util.Random
/**
  * com.pet.smile
  *
  * @author Robert Nad
  */
object SampleSmile extends App {
  val data = Range(0, 10)
  val randomInt: () => Int = () => Random.nextInt(5)+1

  val r = data.map(p=> Array[Double](p, p%randomInt())).toArray
  val km = kmeans(r, 5,20, 5)
  plot(km.centroids(),Range(1,6).toArray, '*', Palette.COLORS)
}

