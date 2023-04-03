case class Request() {
  case object Tick

  case class Join(player: Player)

  case class LeavePlayer(id: String)

  case class Die(id: String)

  case class Mine(id: String, position: Position)

  case class StoreItem(playerID: String, chestID: String)

  case class LootItem(playerID: String, chestID: String, index: Int)

  case class CraftRecipe(playerID: String, recipe: Recipe)

  case class Consume(playerID: String)

  case class MoveEntity(entityID: String, position: Position)

  case class HitEntity(attackerID: String, defenderID: String)
}
