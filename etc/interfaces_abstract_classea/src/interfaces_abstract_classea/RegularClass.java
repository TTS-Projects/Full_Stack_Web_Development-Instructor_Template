package interfaces_abstract_classea;


@FunctionalInterface

interface Square {
    int calculate(int x);
    //int calculate2(int x);
}

public class RegularClass implements Interface1, Interface2 {

	@Override
	public void sayHello(String first_name) {
		// TODO Auto-generated method stub
		
        int a = 5;

		
		// lambda expression to define the calculate method
        Square s = (int x) -> x * x;
 
        // parameter passed and return type must be
        // same as defined in the prototype
        int ans = s.calculate(a);
		
	}

}
