package scaladf.creational

trait Product1
trait Product2

trait AbstractFactory {
  def createProduct1(): Product1
  def createProduct2(): Product2
}

class ConcreteProduct1 extends Product1
class ConcreteProduct2 extends Product2

class ConcreteFactory extends AbstractFactory {
  def createProduct1() = new ConcreteProduct1()
  def createProduct2() = new ConcreteProduct2()
}
