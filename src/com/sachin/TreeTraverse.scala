package com.sachin

case class Branch(node: Int, left: Option[Branch] = None, right: Option[Branch] = None)

object TreeTraverse extends App {
  val branch = Branch(1, Some(Branch(2, Some(Branch(4)), Some(Branch(5)))), Some(Branch(3, Some(Branch(6)), Some(Branch(7)))))

  def preOrder(branch: Branch): Unit = {
    print(branch.node)
    if (branch.left.isDefined) preOrder(branch.left.get)
    if (branch.right.isDefined) preOrder(branch.right.get)
  }

  def inOrder(branch: Branch): Unit = {
    if (branch.left.isDefined) inOrder(branch.left.get)
    print(branch.node)
    if (branch.right.isDefined) inOrder(branch.right.get)
  }

  def postOrder(branch: Branch): Unit = {
    if (branch.left.isDefined) postOrder(branch.left.get)
    if (branch.right.isDefined) postOrder(branch.right.get)
    print(branch.node)
  }

  println("PreOrder -> ")
  preOrder(branch)
  println("\n\nInOrder -> ")
  inOrder(branch)
  println("\n\nPostOrder -> ")
  postOrder(branch)
}
