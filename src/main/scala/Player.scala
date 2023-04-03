case class Player(capacity: Int,
                  inventory: Chest,
                  equipmentSlots: Chest,
                 )
case object Player{


  def applyEffects(): EntityStats = ??? // nembiztos, hogy jó az output

  def removeEffects(): EntityStats = ??? // nembiztos, hogy jó az output

  def respawnPosition: Position = ???

  def onCursor: ItemStack = ???

  def reachingDistance: Double = ???

}