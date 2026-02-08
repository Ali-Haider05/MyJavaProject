package game;

public class Update_Board extends Display {
 public void upDate() {
	    if(super.userTurn=='X'||super.userTurn=='x') {
	  if(arr[row][coulm]!='x'&& arr[row][coulm]!='O') {
		   arr[row][coulm]='X';
		   super.userTurn='o';
		 super.totalMoves++;
	   }
	   else {
		   System.out.println("DUPLICATE NUMBER");
	   }
	    }
	    else   if(super.userTurn=='o'||super.userTurn=='O') {
	  	  if(arr[row][coulm]!='x'&& arr[row][coulm]!='O') {
	  		   arr[row][coulm]='O';
	  		   super.userTurn='X';
	  		   totalMoves++;
	  	   }
	  	   else {
	  		   System.out.println("DUPLICATE NUMBER");
	  	   }
	  	    }
	    else
	    	System.out.println("Invalid Choice:!");
	 
	    		
	    	}
	    
	    
	  
 }

