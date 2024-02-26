import java.lang.Math;

public class FibonacciNumbers{

public static void main(String... args){

// Relation between Golden Ratio and Fibonacci Numbers
/*
----------------------------------
F(i) = (1.618 ^ i) / 2.236
----------------------------------
*/

// Let's assume we have to find 10 fibonacci numbers--->

for (int i = 0; i < 10; ++i){

System.out.println((int)(Math.round(Math.pow(1.618,i)/2.236)));

}


}

}
