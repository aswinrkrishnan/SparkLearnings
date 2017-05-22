package com.ark.learning.spark

import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

/**
  * Created by aswin on 22/05/17.
  */
object DeduplicationRDD {


  def main(args: Array[String]) {

    val conf = new SparkConf().setAppName("SparkJoins").setMaster("local")
    val conext = new SparkContext(conf)

  }

}
