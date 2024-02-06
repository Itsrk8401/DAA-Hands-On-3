# DAA-Hands-On-3

This is the representation of the working logic for the merge sort algorithm ; Implemented using the languages that I know of which are java and python . 

Also given array [5,2,4,7,1,3,2,6] as input for the implementation of sorting using merge sort algorithm . 

# In Hands-on-3.ipynb file : 
To find upper and lower bounds and analyze the time complexity, we'll consider the quadratic curve as the main component of the fitted data.

Let's denote the fitted quadratic curve as ( f(n) = an^2 + bn + c ), where (a, b) and (c) are coefficients.

# To find upper and lower bounds and analyze the time complexity:


In this code:
- We find upper and lower bounds by modifying the coefficients of the quadratic term in the fitted curve.
- We add a constant term to emphasize the relationship between the bounds and the fitted curve.
- The upper and lower bounds are then plotted alongside the actual data and the fitted curve.

# Big-O, Big-Omega, Big-Theta Analysis:
- Big-O (Upper Bound):The upper bound is O(n^2) as the fitted curve is quadratic.
- Big-Omega (Lower Bound): The lower bound is also O(n^2) since the lower bound is proportional to the quadratic term in the fitted curve.
- Big-Theta (Tight Bound): The tight bound is Theta(n^2) as both the upper and lower bounds are quadratic.

# Approximate Location of (n_0):
- By zooming in on the plot, you can observe the point where the actual data starts deviating from the fitted curve and bounds.
- (n_0) is the approximate location where the quadratic behavior becomes dominant.
- The choice of (n_0) is subjective and depends on the precision you want. It's often the point where the function's behavior changes significantly.
