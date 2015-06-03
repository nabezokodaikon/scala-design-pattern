package scaladf.creational

class Product {
}

class ProductA extends Product {
  override def toString() = {
    "Hello ProductA!"
  }
}

class ProductB extends Product {
  override def toString() = {
    "Hello ProductB!"
  }
}

trait Creator {
  def create(): Product
  def anOperation() = {
    val product = create()
    product.toString()
  }
}

trait ACreator { //self: Creator =>
  def create() = new ProductA()
}

trait BCreator { //self: Creator =>
  def create() = new ProductB()
}

object ForACreator extends Creator with ACreator
object ForBCreator extends Creator with BCreator

