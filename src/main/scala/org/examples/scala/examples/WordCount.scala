package org.examples.scala.examples

import org.apache.spark.{SparkConf, SparkContext}

/**
 * Created by jjmartinez on 30/03/16.
 */
object WordCount {

  def run(args: Array[String]) {
    val sc = new SparkContext(new SparkConf().setAppName("Spark Count"))
    val threshold = args(1).toInt

    // split each document into words
    val tokenized = sc.textFile(args(0)).flatMap(_.split(" "))

    // count the occurrence of each word
    val wordCounts = tokenized.map((_, 1)).reduceByKey(_ + _)

    // filter out words with less than threshold occurrences
    val filtered = wordCounts.filter(_._2 >= threshold)

    // count characters
    val charCounts = filtered.flatMap(_._1.toCharArray).map((_, 1)).reduceByKey(_ + _)

    println("RESULTS: " + charCounts.collect().mkString(", "))
  }
}
