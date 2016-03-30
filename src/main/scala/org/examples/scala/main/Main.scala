package com.keedio.mra.consolidation.engine

import org.examples.scala.examples.WordCount

import org.slf4j.LoggerFactory

/**
 * Created by luislazaro on 22/3/16.
 * lalazaro@keedio.com
 * Keedio
 */
object Engine {
  val LOG = LoggerFactory.getLogger(getClass)

  def main(args: Array[String]) = {
    WordCount.run(args)
  }
}