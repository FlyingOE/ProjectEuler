/*
 * Copyright (C) 2014 Pedro Vicente Gómez Sánchez.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.pedrovgs.time

/**
 *
 * Contains some util methods used to measure the time spent to execute one function.
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
object Time {

  def measure(f: => Unit) = {
    val start = System.nanoTime()
    f
    println("Time spent: " + (System.nanoTime() - start) + " ns")
  }

}
