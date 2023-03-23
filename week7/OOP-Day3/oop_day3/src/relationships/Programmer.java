package relationships;
	
class Programmer {
	String name;
	//Creating HAS-A relationship with Address class
	Address programmerAddr; 
	Programmer(String name, Address addr){
		this.name=name;
		this.programmerAddr = addr;
	}
	
	public class Demo {
		public static void main(String args[]){
			Address address = new Address(630, "Hendersonville", "NC");
			Programmer object = new Programmer("Sarah", address);
			System.out.println(object.name);
			System.out.println(object.programmerAddr.streetNum);
			System.out.println(object.programmerAddr.city);
			System.out.println(object.programmerAddr.state);

		}
	}
}