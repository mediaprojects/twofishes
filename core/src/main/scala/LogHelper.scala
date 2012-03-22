// Copyright 2012 Foursquare Labs Inc. All Rights Reserved.
package com.foursquare.geocoder

import com.twitter.logging.Logger
import com.twitter.logging.config._
import com.twitter.logging.config.ConsoleHandlerConfig

object LogHelper {
  def init() {
    val config = new LoggerConfig {
      node = ""
      level = Level.ERROR
      handlers = new ConsoleHandlerConfig {}
    }
    config()
  }
}

trait LogHelper {
  val logger = Logger.get(getClass)
}