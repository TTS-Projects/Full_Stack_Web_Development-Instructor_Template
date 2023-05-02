package extra_class_topics;


public class Commands{
	

enum Command {
	  MOVE,
	  SPRINT,
	  DRIBBLE,
	  PASS,
	  SHOOT;
	}

public static void main(String[] args) {
	


	Command commandWord = Command.DRIBBLE;
	switch (commandWord) {
	   case MOVE:
	      //movePlayer(direction);
	      break;
	   case SPRINT:
	      //sprint();
	      break;
	   case DRIBBLE:
	      //dribbleBall();
		   System.out.println("Dribble");
		   //System.out.println();
	      break;
	   case PASS:
	      //pass();
	      break;
	   case SHOOT:
	       //shoot();
	       
	}
	       
}
}