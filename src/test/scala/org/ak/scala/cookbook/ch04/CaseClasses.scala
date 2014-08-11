package org.ak.scala.cookbook.ch04

import org.scalatest.{Matchers, FunSuite}

/**
 * @author antonk
 * @since  8/11/14 - 10:24 PM
 */
class CaseClasses
  extends FunSuite
  with Matchers
{
  // 'name' and 'age' are val by default
  case class ConstPerson(name: String, age: Int)


  test("generating accessor for field without val/var keyword") {
    val person = ConstPerson("SomeName", 42)

    person.name shouldEqual "SomeName"
    person.age shouldEqual 42
  }


  test("default toString method") {
    val person = ConstPerson("SomeName", 42)

    person.toString shouldEqual "ConstPerson(SomeName,42)"
  }
}
