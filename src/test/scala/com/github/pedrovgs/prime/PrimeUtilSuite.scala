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

package com.github.pedrovgs.prime

import org.scalatest.FunSuite

/**
 *
 * @author Pedro Vicente Gómez Sánchez
 */
class PrimeUtilSuite extends FunSuite {

  test("2 is prime") {
    assert(PrimeUtil.isPrime(2))
  }

  test("4 is not prime") {
    assert(!PrimeUtil.isPrime(4))
  }

  test("7 is prime") {
    assert(PrimeUtil.isPrime(7))
  }

  test("10 is not prime") {
    assert(!PrimeUtil.isPrime(10))
  }

  test("7919 is prime") {
    assert(PrimeUtil.isPrime(7919))
  }

  test("10472 is not prime") {
    assert(!PrimeUtil.isPrime(10472))
  }

  test("104729 is prime") {
    assert(PrimeUtil.isPrime(104729))
  }

}
