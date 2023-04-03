case class ItemStack(item: Item, amount: Int) {

  def +(that: ItemStack): (ItemStack, Option[ItemStack]) = ???


}
