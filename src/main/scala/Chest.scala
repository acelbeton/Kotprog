
case class Chest(id: String, capacity: Int) {

  def isEmpty: Boolean = ???

  def apply(i: Int): Option[ItemStack] = ???

  def +(stack: ItemStack): (Chest, Option[ItemStack]) = ???

  def swap(index: Int, stack: ItemStack): (Chest, Option[ItemStack]) = ???

  def contains(item: Item): Boolean = ???

  def count(item: Item): Int = ???

}
