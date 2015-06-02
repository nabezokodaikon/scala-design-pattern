package scaladf.creational

class Building(
  val base: Option[String],
  val frame: Option[String],
  val wood: Option[String]) {

  def this() = {
    this(None, None, None)
  }

  def toText(opt: Option[String]) = opt match {
    case Some(text) => text
    case None => "None"
  }

  override def toString() = {
    "base: %s, frame: %s, wood: %s".format(toText(base), toText(frame), toText(wood))
  }
}

trait Builder { self =>
  def setBase(): self.type
  def setFrame(): self.type
  def setWood(): self.type
  def getResult(): String
}

class JapaneseHouseBuilder extends Builder {

  var building = new Building()

  def setBase() = {
    building = new Building(Option("CONCREATE"), building.frame, building.wood)
    this
  }

  def setFrame() = {
    building = new Building(building.base, Option("WOOD"), building.wood)
    this
  }

  def setWood() = {
    building = new Building(building.base, building.frame, Option("CLAY"))
    this
  }

  def getResult() = {
    building.toString()
  }

}

class Director(val builder: Builder) {
  def build() = {
    builder.setBase().setFrame().setWood().getResult()
  }
}

