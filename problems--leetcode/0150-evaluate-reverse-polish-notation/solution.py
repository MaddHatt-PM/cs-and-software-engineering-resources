from typing import List


class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        def add(a, b): return a + b 
        def subtract(a, b): return a - b 
        def multiply(a, b): return a * b 
        def divide(a, b): return a / b 

        ops = { '+':add, '-':subtract, '*':multiply, '/':divide }
        keys = { '+', '-', "*", '/' }

        stack = []
        for t in tokens:
            if t in keys:
                a,b = stack.pop(), stack.pop()
                stack.append(int(ops[t](b,a))) 
            else:
                stack.append(int(t))
        
        return stack.pop()

if __name__ == '__main__':
    # values = ["2","1","+","3","*"]
    # values = ["4","13","5","/","+"]
    values = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
    print (Solution().evalRPN(values))