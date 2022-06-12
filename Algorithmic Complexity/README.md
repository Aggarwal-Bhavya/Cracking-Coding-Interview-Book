## Chapter 5 - Big O
Algorithmic Complexity is a measure of how long an algorithm would take to complete given an input of size n. If an algorithm has to scale, it should compute 
the result within a finite and practical time bound even for large values of n. For this reason, complexity is calculated asymptotically as n approaches infinity.
<br>
Analysis of an algorithm's complexity is helpful when comparing algorithms or seeking improvements.
<br> <br>
Big-O notation is the prevalent notation to represent algorithmic complexity. It gives an upper bound on complexity and hence it signifies the worst-case performance 
of the algorithm. With such a notation, it's easy to compare different algorithms because the notation tells clearly how the algorithm scales when input size increases. 
This is often called the order of growth.
<br><br>
<img src="https://user-images.githubusercontent.com/87543207/173248626-4bae87a4-176a-471f-b572-961443986548.png" width="700px"><br>
O(1)<O(logn)<O(√n)<O(n)<O(nlogn)<O(n<sup>2</sup>)<O(n<sup>3</sup>)<O(2<sup>n</sup>)<O(10<sup>n</sup>)<O(n!)
<br><br>
In complexity analysis, only the dominant term is retained. Constants and scaling factors are ignored since we are concerned only about asymptotic.
<br>
Mathematically, different noatations are defined as such:
- Worst-case or upper bound: Big-O: O(n)
- Best-case or lower bound: Big-Omega: Ω(n)
- Average-case: Big-Theta: Θ(n)
- Non-tight upper bound: o(n)
- Non-tight lower bound: ω(n) 
<br>
Note: When upper or lower bounds don't coincide with average complexity, we can call them non-tight bounds. <br>
There's also <strong>amortized complexity</strong> in which complexity is calculated by averaging over a sequence of operations.
<br><br>
Programming languages, hardware and memories are external factors. Complexity is about the algorithm itself, the way it processes the data to solve a given problem. It's a software design concern at the "idea level".
<br><br>
Data structures only store data but the algorithmic complexity comes into consideration when we operate on them. The intent is to choose the right data structures so that complexity is reduced.
<img src="https://user-images.githubusercontent.com/87543207/173248563-72822ca6-f2a1-415a-acd4-3702cac54e62.png" width="750px">
<img src="https://user-images.githubusercontent.com/87543207/173248674-7219c90a-7131-467e-85e4-479ef73d577e.png" width="700px">
