
import org.scalatest.funsuite.AnyFunSuite

class StackTestFile extends AnyFunSuite {
  /** For testing, 2 elements are getting pusshed into the stack initially **/
  val stackObj = new Stack[Int]
  stackObj.push(1)
  stackObj.push(2)
  
  /*** Testing stack ***/
  test("Pushing an object"){
    assert(stackObj.push(3) == List(3,2,1))
  }

  test("Testing isEmpty function"){
    assert(stackObj.isEmpty() == false)
  }

  test("Testing for peek()"){
    assert(stackObj.peek() == 3)
  }

  test("Popping from the stack"){
    stackObj.pop()
    stackObj.pop()
    stackObj.pop()
    assert(stackObj.stackElements == List())
  }
  
  /**Tryig to pop from an empty stack***/
  test("Popping from empty stack"){
    stackObj.pop()
    assert(stackObj.stackElements == List())
  }
}
