package game;

import java.util.Scanner;

public class Display {
   public char arr[][]={{'1','2','3'},{'4','5','6'},{'7','8','9'}};
   public char userTurn='x';
   public int  userChoice;
   public int  row,coulm;
   public int totalMoves;
   public boolean player1=false,player2=false;
   //Display Board of game
   public void displayBoard() {
	   for(int i=0;i<3;i++) {
		   for(int j=0;j<3;j++) {
			   System.out.print("\t"+arr[i][j]+"|");
		   }
		   System.out.println();
		   System.out.println("\t____________________");
	   }
   }
  // Input Method
   public void input() {
	   Scanner sc=new Scanner(System.in);
	   if(this.userTurn=='x'||this.userTurn=='X') {
		   System.out.println("1st player Turn!");
	   }
	
	   else  {
		   System.out.println("2nd player turn!");
		   
	   }
		

	   do {
		   System.out.println("Enter your choice :");
		    this.userChoice=sc.nextInt();
		   switch(userChoice) {
		   case 1:
			   this.row=0;
			   this.coulm=0;
			   break;
		   case 2:
			   this.row=0;
			   this.coulm=1;
			   break;
		   case 3:
			   this.row=0;
			   this.coulm=2;
			   break;
		   case 4:
			   this.row=1;
			   this.coulm=0;
			   break;
		   case 5:
			   this.row=1;
			   this.coulm=1;
			   break;
		   case 6:
			   this.row=1;
			   this.coulm=2;
			   break;
		   case 7:
			   this.row=2;
			   this.coulm=0;
			   break;
		   case 8:
			   this.row=2;
			   this.coulm=1;
			   break;
		   case 9:
			   this.row=2;
			   this.coulm=2;
			   break;
			   default:
				   System.out.println("Invalid choice again Enter ::");
				   break;
		   }
		   
		   }while(this.userChoice<=0||this.userChoice>9);
   }
   // Update Board
   public void upDate() {
	    if(this.userTurn=='X'||this.userTurn=='x') {
	  if(arr[row][coulm]!='X'&& arr[row][coulm]!='O') {
		   arr[row][coulm]='X';
		   this.userTurn='o';
		 this.totalMoves++;
	   }
	   else {
		   System.out.println("DUPLICATE NUMBER");
	   }
	    }
	    else   if(this.userTurn=='o'||this.userTurn=='O') {
	  	  if(arr[row][coulm]!='X'&& arr[row][coulm]!='O') {
	  		   arr[row][coulm]='O';
	  		   this.userTurn='X';
	  		   totalMoves++;
	  	   }
	  	   else {
	  		   System.out.println("DUPLICATE NUMBER");
	  	   }
	  	    }
	    else
	    	System.out.println("Invalid Choice:!");
	 
	    		
	    	}
   // Checking Winner 
   
   public void checkWinner() {
		 for(int i=0;i<3;i++) {
			 if(arr[i][0]=='X'&&arr[i][1]=='X'&&arr[i][2]=='X') {
				 player1 =true;
			 break;
			 }
			 if(arr[0][i]=='X'&&arr[1][i]=='X'&&arr[2][i]=='X') {
				 player1=true;
				 break;
			 }
		 }
			 if(arr[0][0]=='X'&&arr[1][1]=='X'&&arr[2][2]=='X')
				 player1=true;
			 if(arr[0][2]=='X'&&arr[1][1]=='X'&&arr[2][0]=='X') {
				 player1=true;
			 }
			 
			 for(int j=0;j<3;j++) {
				 if(arr[j][0]=='O'&&arr[j][1]=='O'&&arr[j][2]=='O') {
					 player2 =true;
				 break;
				 }
				 if(arr[0][j]=='O'&&arr[1][j]=='O'&&arr[2][j]=='O') {
					 player2=true;
					 break;
				 }
			 }
				 if(arr[0][0]=='O'&&arr[1][1]=='O'&&arr[2][2]=='O') {
					 player2=true;
				 }
				 if(arr[0][2]=='O'&&arr[1][1]=='O'&&arr[2][0]=='O') {
					 player2=true;
				 }
			 
		 }
	    
	    
   
   }
   


