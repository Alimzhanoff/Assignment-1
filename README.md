Assignment 3 - Sorting and Searching Algorithm Analysis
**Student:** Alimzhan Adilzhan
**Group:** IT-2504

Project Overview
This project implements and compares fundamental sorting and searching algorithms to analyze their performance using Big-O notation in a practical Java environment.

Selected Algorithms:
Basic Sort: Bubble Sort
Advanced Sort: Quick Sort
Searching: Linear Search

Algorithm Descriptions
1. Bubble Sort
   How it works: Iteratively steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.
   Time Complexity: O(n^2).

2. Quick Sort
   How it works: Uses a "divide and conquer" strategy by picking a 'pivot' element and partitioning the array around it.
   Time Complexity: O(n \log n) average, O(n^2) worst case.

4. Linear Search
   How it works: Sequentially checks each element of the list until a match is found or the whole list has been searched.
   Time Complexity: O(n).

Experimental Results
The algorithms were tested on random arrays of different sizes using System.nanoTime().

Bubble Sort (ns):
10 (Small) = 11,800
100 (Medium) = 334,100
1000 (Large) = 6,987,800

Quick Sort (ns)
10 (Small) = 17,200
100 (Medium) = 51,800
1000 (Large) = 703,900

Linear Search (ns)
10 (Small) = 3,300
100 (Medium) = 2,000
1000 (Large) = 16,500


Performance Analysis:

Which sorting algorithm was faster? Quick Sort was significantly faster on larger datasets (1000 elements).

Why? Because Quick Sort's O(n \log n) complexity is much more efficient than the quadratic O(n^2) complexity of Bubble Sort as n increases.

Input Size Impact: As the size increased 10x (from 100 to 1000), Bubble Sort's time increased by a much larger factor than Quick Sort's.

Searching Efficiency: Linear Search is efficient for small arrays but its time grows linearly with the number of elements.




Reflection:

During this assignment, I learned the practical difference between theoretical Big-O complexity and actual execution time. Seeing Bubble Sort take nearly 7 million nanoseconds while Quick Sort handled the same data in 700 thousand was a clear demonstration of why algorithm selection matters in software development.









