package scaladf.creational

import org.scalatest.FunSuite

class BuilderPatternTest extends FunSuite {
  test("JapaneseHouseBuilder") {
    val builder = new JapaneseHouseBuilder()
    val director = new Director(builder)
    println(director.build())
  }
}

