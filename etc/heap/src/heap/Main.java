package heap;

public class Main {
	
	public static void main (String[] args ) {
	//in the main() method: 
	BinaryHeap bh = new BinaryHeap(); 
			
	
	int[] Nodes = {1, 12, 3, 24, 7, 19, 1, 50, 16};
	//int[] Nodes = {};
			
	for (int n : Nodes) {
		bh.Maxadd(n);
	}
			
				
	System.out.print(bh.heap);
	}

}
