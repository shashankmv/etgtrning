package StreamMapSort;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class JavaStreamsExample {
public static void main(String[] args) {
		
		//skip the range
		System.out.println(IntStream.range(1,5).sum());
		
		//sum of the range 
		System.out.println(IntStream.range(1,10).sum());
		
		//stream with findFirst and sorted
		
		Stream.of("Ava","Apple","Alber")
		.sorted()
		.findFirst()
		.ifPresent(System.out :: println);
		
		

	}
}
