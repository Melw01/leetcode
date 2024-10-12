# Greedy Method

## Definition
An algorithm that decides what to do in each step, only based on current situation, without a thought of how the total problem looks like.
In other words, greedy algorithm makes the locally optimal choice in each step, hoping to find the global optimum solution in the end.

Greedy method can either be very easy or very hard.

THERE IS NO TEMPLATE FOR GREEDY METHOD.

Two properties must be true for a problem for a greedy algorithm to work:
1. **Greedy Choice Property**: the problem is so that the solution (the global optimum) can be reached by making greedy choices in each step (locally optimal choices).
2. **Optimal Substructure**: Means that the optimal solution to a problem, is a collection of optimal solutions to sub-problems. So solving smaller parts of the problem locally (by making greedy choices) contributes to the overall solution.

## Algorithms that are NOT greedy
1. Merge Sort: 
Splits the array in halves over and over again, and then merges the array parts together again in a way that results in a sorted array. These operations are not a series of locally optimal choices like greedy algorithms are.
   
2. Quick Sort: The choice of pivot element, the arranging of elements around the pivot element, and the recursive calls to do the same with the left and right side of the pivot element — those actions do not rely on making greedy choices.
   
3. BFS and DFS Traversal: These algorithms traverse a graph without making a choice locally in each step on how to continue with the traversal, and so they are not greedy algorithms.
   
4. Finding the nth Fibonacci number using memoization: This algorithm belongs to a way of solving problems called Dynamic Programming, which solves overlapping sub-problems, and then pieces them back together. Memoization is used in each step to optimize the overall algorithm, which means that at each step, this algorithm does not only consider what is the locally optimal solution, but it also takes into account that a result computed in this step, might be used in later steps.

## Problems that can be solved by Greedy
1. Selection Sort
2. Dijkstra's Algorithm

## Problems that CANNOT be solved by Greedy
1. The Traveling Salesman
2. 0/1 Knapsack Problem


