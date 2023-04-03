trait Item {


  trait Placable

  case class Consumable(name: String, maxStackSize: Int){

  }

  case class Weapon(name: String, maxStackSize: Int, damage: Int) {

  }

  case class Armor(name: String, maxStackSize: Int, defense: Int) {

  }

  case class Equipment(name: String, maxStackSize: Int) {

  }

}
