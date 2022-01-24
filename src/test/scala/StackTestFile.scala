
import org.scalatest.funsuite.AnyFunSuite

class StackTestFile extends AnyFunSuite {
  /**
   * For testing, 2 elements are getting pushed into the stack initially
   * We need to instantiate an Empty stack in order to crate one
   */
  val stackObj = new EmptyStack[Int]

  /*** Testing stack ***/
  //  Initially we know that stack is empty
  test("Push function test"){
    val pushTest = stackObj.push(12).push(13).push(14)
    assert(pushTest.top == 14)
  }

  //  isEmpty Function test, this should return true as we have pushed 2 elements in the stack
  test("Testing isEmpty function"){
    val nonEmptyStack = stackObj.push(1)
    assert(!nonEmptyStack.isEmpty())
  }

  //  testing for top
  test("Testing for top()"){
    val topTest = stackObj.push(1).push(2)
    assert(topTest.top == 2)
  }

  //  testing pop function by emptying up the stack
  test("Popping from the stack"){
    val popTest = stackObj.push(1).push(2)
    assert(popTest.pop().pop().isEmpty())
  }
}
