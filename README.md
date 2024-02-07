# DAA-Hands-On-3

This is the representation of the working logic for the merge sort algorithm ; Implemented using the languages that I know of which are java and python . 

Also given array [5,2,4,7,1,3,2,6] as input for the implementation of sorting using merge sort algorithm . 

# In Hands-on-3.ipynb file : 
To find upper and lower bounds and analyze the time complexity, I'll consider the quadratic curve as the main component of the fitted data.

Let's denote the fitted quadratic curve as ( f(n) = an^2 + bn + c ), where (a, b) and (c) are coefficients.

# To find upper and lower bounds and analyze the time complexity:


In this code:
- I find upper and lower bounds by modifying the coefficients of the quadratic term in the fitted curve.
- I add a constant term to emphasize the relationship between the bounds and the fitted curve.
- The upper and lower bounds are then plotted alongside the actual data and the fitted curve.

# Big-O, Big-Omega, Big-Theta Analysis:
- Big-O (Upper Bound):The upper bound is O(n^2) as the fitted curve is quadratic.
- Big-Omega (Lower Bound): The lower bound is also O(n^2) since the loIr bound is proportional to the quadratic term in the fitted curve.
- Big-Theta (Tight Bound): The tight bound is Theta(n^2) as both the upper and lower bounds are quadratic.

# Approximate Location of (n_0):
- By zooming in on the plot, you can observe the point where the actual data starts deviating from the fitted curve and bounds.
- (n_0) is the approximate location where the quadratic behavior becomes dominant.
- The choice of (n_0) is subjective and depends on the precision you want. It's often the point where the function's behavior changes significantly.

# If I modified the function to be:
x = f(n)
   x = 1;
   y = 1;
   for i = 1:n
        for j = 1:n
             x = x + 1;
        y = i + j;
        
# Will this increase how long it takes the algorithm to run ?
# Will it effect your results from the original code Time Complexity ? 

Yes, the modification to the function will likely increase the time it takes for the algorithm to run. Let's analyze the modified code:

In this modification, an additional operation (y = i + j) is added inside the inner loop. This operation involves addition, and its complexity is constant time. However, since it is executed (n^2) times (inside the nested loops), it contributes to the overall time complexity.

The time complexity of the original code was O(n^2), where (n) is the input size. With the modification, the time complexity would still be O(n^2) but with a larger constant factor due to the additional operation.

Therefore, the modification increases the amount of work done inside the inner loop, which can result in a longer runtime compared to the original code. The impact on the overall runtime depends on the constant factors involved in the operations and the efficiency of the underlying hardware and compiler optimizations.
