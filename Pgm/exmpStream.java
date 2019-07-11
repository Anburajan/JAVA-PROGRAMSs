import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class exmpStream {

	public static void main(String[] args) {

		List<String> stringList = Arrays.asList("1","2","3","4","5","6","7","8","9","10");
		
		int sum= stringList.stream()
				. mapToInt(e-> Integer.parseInt(e))
				.filter(e -> e % 2 ==0)
				.sum();

		/*int val = 0;
		Stream<String> strStream =stringList.stream();
		
		/*for(String str : stringList){
			val = Integer.parseInt(str);
			
			if(val % 2 == 0){
				sum = sum + val;
			}
		}
		 //this for storing list to int list.
		IntStream intStream =strStream. mapToInt(e-> Integer.parseInt(e));
		
		//
		IntStream intStream2 =intStream.filter(e -> e % 2 ==0);*/
		
		System.out.println(sum);
		
 		
				
	}

}

   