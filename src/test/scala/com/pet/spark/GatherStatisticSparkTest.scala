package com.pet.spark

import org.scalatest.{FlatSpec, FunSuite}

/**
  * com.pet.spark
  *
  * @author Robert Nad
  */
class GatherStatisticSparkTest extends BaseSuitKit with GenerateData {
  it should "be equal with expected result" in {
    val data = generateDateNumbs
    val rawDS = sparkSession.createDataset[DateNumbStat](data)
    val realDS = GatherStatisticSpark.getCountEventsByDatePeriod(rawDS, "date", Seq(
      ("col7", 7),
      ("col14", 14),
      ("col30", 30),
      ("col60", 60),
      ("col180", 180),
      ("col365", 365),
    ))
    realDS.show
  }

}
