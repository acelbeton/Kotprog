


case class WorldState (request: Seq[Request]) extends Item {

  def hasRequests: Boolean = ???

  def processNextRequest: WorldState = ???

  // processNextRequest: WorldState = ???
  def players: Vector[Player] = ???

  def apply(x: Int, y: Int): Option[Placable]

  // def apply(position: Position): Option[Placable] = ???

  def width: Int = ???
  def height: Int = ???
}
