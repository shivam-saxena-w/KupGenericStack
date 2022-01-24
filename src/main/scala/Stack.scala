import scala.sys.{error, exit}

trait Stack[T] {
    def push(elementToPush: T): Stack[T] = new NonEmptyStack(elementToPush, this)
    def pop(): Stack[T]
    def top : T
    def isEmpty(): Boolean
}

class EmptyStack[T] extends Stack[T] {
    override def isEmpty(): Boolean = true
    override def top: T = error("Empty Stack")
    override def pop(): Stack[T] = error("Empty Stack")
}

class NonEmptyStack[T](element: T, stackTail: Stack[T]) extends Stack[T] {
    override def isEmpty(): Boolean = false
    override def top: T = element
    override def pop(): Stack[T] = stackTail
}