package game;

public class ClassMAin {
 public static void main(String []args) {
	 Display object=new Display();
	 while( object.totalMoves<9) {
	 object.displayBoard();
	 object.input();
	 object.upDate();
// checking Winner 
	 object.checkWinner();
	 if(object.player1) {
		 System.out.println("PLayer 1 win ");
		 break;
	 }
	 if(object.player2) {
		 System.out.println("2 player win");
	 }
	 }
 }
}
