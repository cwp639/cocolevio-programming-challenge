# cocolevio-programming-challenge

The challenge:

In our Materials Marketplace we have many different companies all looking for the same material. However, each company is looking for a specific quantity of the material at a price they set themselves. A company approaches our team with a large amount of that material, but not enough to complete every request for it. Given the total amount of the material they have, the company asks us to find out what companies they should sell to in order to maximize their profits. This scenario happens frequently so we need to be able to compute the answer relatively quickly and with minimal processing power.

Please use the following as sample data:

https://s3.amazonaws.com/cocolevio-public/InterviewQuestionExample.PNG

The data (from the link above):

Company	  Amount	Price

A	        1		    1

B		      2		    5

C		      3	    	8

D		      4		    9

E		      5	    	10

F		      6		    17

G		      7		    17

H		      8		    20

I		      9		    24

J		      10	    30


Each company is requesting an amount of material for a specific price.

Task: Given the data above and N, the amount of material available for sale, how do we distribute the material to the companies to maximize profit

Assumptions: 
N is always less than the total amount of requested material
No negative prices or amounts of material
The price is for the entire amount of material, not per 1 material
Each company only requests one amount for one price
Array is sorted low to high by amount (low to high by price if amount is the same)
The amounts for the companies will not always be sequential (could be 1, 5, 6, 16,...)

Approach: This is an application of the knapsack problem (as described in my algorithms class). This can be performed using dynamic programming or a greedy algorithm. Since each company can only make one request, this is a 0-1 knapsack problem. I will be using dynamic programming since it is guaranteed to be optimal (although at the cost of time/processing power)

Resources used: https://en.wikipedia.org/wiki/Knapsack_problem


