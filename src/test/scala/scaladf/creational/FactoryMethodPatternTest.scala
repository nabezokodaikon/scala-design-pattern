package scaladf.creational

import org.scalatest.FunSuite

class FactoryMethodPatternTest extends FunSuite {

  test("ForACreator") {
    println(ForACreator.anOperation())
  }

  test("ForBCreator") {
    println(ForBCreator.anOperation())
  }

}
