trait Effect {

  case class IncreaseDamage(value: Int)

  case class ScaleDefense(percentage: Double)

  case class Poison(value: Int)

  def apply(stats: EntityStats): EntityStats = ???


}
