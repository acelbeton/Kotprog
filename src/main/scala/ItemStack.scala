case class ItemStack(item: Item, stack: Int) {

  def +(that: ItemStack): (ItemStack, Option[ItemStack]) = ???


}
