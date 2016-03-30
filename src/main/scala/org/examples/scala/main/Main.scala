package org.examples.scala.main

import org.examples.scala.examples.WordCount
import org.examples.scala.examples.StreamingWordCount

import org.slf4j.LoggerFactory

/**
 * Created by jjmartinez on 30/03/16.
 */

object Main {
  val LOG = LoggerFactory.getLogger(getClass)

  def main(args: Array[String]) = {

    args(2) match {
      case "WordCount"  => WordCount.run(args)
      case "StreamingWordCount"  => StreamingWordCount.run(args)
      case whoa  => println("Unexpected case: " + whoa.toString)
    }
  }
}