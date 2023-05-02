package forkjoinexample;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.concurrent.ForkJoinPool;
import java.util.Scanner;  // Import the Scanner class

public class ForkJoinPoolThread {



	public static void main(String[] args) throws InterruptedException, ExecutionException {
		giveRangeOfLongs_whenSummedInParallel_shouldBeEqualToExpectedTotal();
		
	}
	
	
	public static void giveRangeOfLongs_whenSummedInParallel_shouldBeEqualToExpectedTotal()
	  throws InterruptedException, ExecutionException {

	    long firstNum = 1;
	    long lastNum = 1000000000;

	    List<Long> aList = LongStream.rangeClosed(firstNum, lastNum).boxed()
	      .collect(Collectors.toList());

	    ForkJoinPool customThreadPool = new ForkJoinPool(4);
	    long actualTotal = customThreadPool.submit(
	      () -> aList.parallelStream().reduce(0L, Long::sum)).get();

	    System.out.println("hi");
	    System.out.println(actualTotal);

	    //assertEquals((lastNum + firstNum) * lastNum / 2, actualTotal);
	    // ((n1+ n1_000_00)+ N1_000_000)/2
	}
}
