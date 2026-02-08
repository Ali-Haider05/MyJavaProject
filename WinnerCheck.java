package game;

public class WinnerCheck extends Display {
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

			 
		 
	 
 

