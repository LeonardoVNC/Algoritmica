# JollyJumpers
A sequence of 𝑛 > 0 integers is called a jolly jumper if the absolute values of the difference between successive elements take on all the values through 𝑛−1. For instance,

1 4 2 3

is a jolly jumper, because the absolutes differences are 3, 2, and 1 respectively. The definition implies that any sequence of a single integer is a jolly jumper. You are to write a program to determine whether or not each of a number of sequences is a jolly jumper.

**Input**

Each line of input contains an integer 
𝑛
≤
3000
n≤3000 followed by 
𝑛
n integers representing the sequence. The values in the sequence are at most 
300
000
300000 in absolute value. Input contains at most 
10
10 lines.

**Output**

For each line of input, generate a line of output saying “Jolly” or “Not jolly”.

**Sample 1**

**INPUT**

4 1 4 2 3

5 1 4 2 -1 6

**OUTPUT**

Jolly

Not jolly



[ProblemaOriginal](https://open.kattis.com/problems/jollyjumpers)