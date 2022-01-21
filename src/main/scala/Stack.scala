class Stack[T]{
    var stackElements : List[T] = Nil
    def push(elementToPush: T) : List[T] = {
        stackElements = elementToPush :: stackElements
        stackElements
    }
    def peek() : T = stackElements.head
    def pop():Unit = stackElements = stackElements.drop(1)
    def isEmpty(): Boolean = if (stackElements.length == 0) true else false
}
