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
O(1)<O(logn)<O(√n)<O(n)<O(nlogn)<O(n<sup>2</sup>)<O(n<sup>3</sup>)<O(2<sup>n</sup>)<O(10<sup>n</sup>)<O(n!)
<br><br>
In complexity analysis, only the dominant term is retained. Constants and scaling factors are ignored since we are concerned only about asymptotic.
