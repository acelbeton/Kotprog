sealed trait Duration
case class TicksLeft(ticks: Int) extends Duration

case object TillDeath extends Duration

case object Permanent extends Duration

 // def tick: Option[Duration] = ???

