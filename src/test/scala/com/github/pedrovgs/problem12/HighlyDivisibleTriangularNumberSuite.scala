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

package com.github.pedrovgs.problem12

import org.scalatest.FunSuite

/**
 *
 * @author Pedro Vicente Gómez Sánchez
 */
class HighlyDivisibleTriangularNumberSuite extends FunSuite {

  test("First triangular number with 5 divisors is 28") {
    assert(28 === HighlyDivisibleTriangularNumber.getTriangularNumberWithDivisors(5))
  }

  test("First triangular number with over 500 divisors is 76576500") {
    assert(76576500 === HighlyDivisibleTriangularNumber.getTriangularNumberWithDivisors(500))
  }

}
