sealed trait Item {
  val name: String
  val maxStackSize: Int
}


case class Placable(name: String, maxStackSize: Int) extends Item

case class Consumable(name: String, maxStackSize: Int, effects: Map[String, (Int, Int)]) extends Item

case class Weapon(name: String, damage: Int) extends Item {
  val maxStackSize = 1
}

case class Armor(name: String, defense: Int) extends Item {
  val maxStackSize = 1
}

case class Equipment(name: String, effects: Map[String, (Int, Int)]) extends Item {
  val maxStackSize = 1
}


