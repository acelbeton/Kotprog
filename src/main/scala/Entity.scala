abstract class Entity(
                 id: String,
                 basestats: Effect,
                 currentHP: Int,
                 position: Position
                 ) {
  // object Mob
  def baseStats: EntityStats = ???

  def heal(hp: Int): Entity = ???

  def takeDamage(hp: Int): Option[Entity] = ???

  def addEffect(effect: Effect, duration: Duration): Entity = ???

  def removeEffects(p: Effect => Boolean): Entity = ???

  def applyEffects: EntityStats = ???

  def moveTo(position: Position): Entity = ???

  def tick: Option[Entity] = ???

  case class Player(name: String, id: String, baseStats: EntityStats, currentHP: Int, position: Position) extends Entity(name, id, baseStats, currentHP, position)

  case class Mob(name: String, id: String, baseStats: EntityStats, currentHP: Int, position: Position) extends Entity(name, id, baseStats, current
}
