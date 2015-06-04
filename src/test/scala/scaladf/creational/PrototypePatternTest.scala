package scaladf.creational

import org.scalatest.FunSuite

class PrototypePatternTest extends FunSuite {

  test("Prototype") {
    val a = Prototype(1, 2)
    println(a)
    val b = a.copy()
    println(b)
  }

}
