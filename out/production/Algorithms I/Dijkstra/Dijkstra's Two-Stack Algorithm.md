 Dijkstra's two-stack algorithm is a method for evaluating arithmetic expressions written in infix notation. This is a simplified implementation of Dijkstra's two stack algorithm using an ArrayList.

ArrayLists have prebuilt *.add()* and **.remove()** functions that can be repurposed into the *.push()* and *.pop()* functions of a Stack. 

This implementation creates a "Stack" class that functions as a data structure containing two stacks: one `valueStack` and one `operatorStack`.

This algorithm can take in integer expressions containing operators `+`, `-`, `*`, `/`, and single digit integers, returning a result evaluating that expressions.

### Examples
**Input:** (9+(8 * 4)) (without whitespaces)
**Output:** 41

**Input:** (3*(8-((4/2)+5)))
**Output:** 3

### Methodology
The algorithm loops through the characters in the expression, skipping over all opening parentheses. It pushes all integers to the `valueStack`  and all operators to the `operatorStack`. Once a closing parenthesis *`)`* is passed in, the algorithm triggers an evaluation of the last two values inserted into the stack, and the last operator inserted.

### Constraints
This implementation currently only processes expressions containing single digit integers, and doesn't multiply integers separated with opening parenthesis *`(`*.