# Binary-Search
<h2>Program Design</h2>
The program takes two numeric arguments: upper bound and lower bound. A target number is selected within these two bounds. Then the binary search is conducted to arrive at the target number. The program keeps tally of how many times a check was done to verify whether the target number was found.<br><br>

Dr.Vickery in "Measurement and Units of Measure" article writes that "...amount of uncertainty...is reduced by answering one yes/no question." Each time a check is done, the undertainty is reduced by half. The amount of uncertainty is best described with this formular: log2(X). The program runs the game a thousand times and you will notice that the average checks needed to arrive at the target number gets closer and closer to this formula.


<h2>Sample Output </h2>
<b>Lower bound: 1 </b>
<b>Upper bound: 100</b>

<pre>
a: 3
b: 4
Chosen integer   1: 0000
Chosen integer   2: 0001
Chosen integer   3: 001
Chosen integer   4: 010
Chosen integer   5: 011
Chosen integer   6: 1000
Chosen integer   7: 1001
Chosen integer   8: 101
Chosen integer   9: 110
Chosen integer  10: 111
a. The total number of chosen integers where only 3 questions were asked: 6.0
b. The total number of chosen integers where only 4 questions were asked: 4.0
c. The average number of questions asked: 3.4

a: 3
b: 4
a. The total number of chosen integers where only 3 questions were asked: 590.0
b. The total number of chosen integers where only 4 questions were asked: 410.0
c. The average number of questions asked: 341.0

a: 3
b: 4
a. The total number of chosen integers where only 3 questions were asked: 603.0
b. The total number of chosen integers where only 4 questions were asked: 397.0
c. The average number of questions asked: 339.7

</pre>




