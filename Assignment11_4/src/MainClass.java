
import java.util.function.BiFunction;
public class MainClass {  
public static void main(String[] args) {  
BiFunction<Integer, Integer, Integer>adder = Arithmatic::add;  
int result = adder.apply(10, 20);  
System.out.println(result);  
}  
}  