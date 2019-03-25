public class gameEntry{
	private int score;
	private string name;

	public gameEntry(int s, string n){
		score = s;
		name = n;
	}

	public int getScore(){
		return score;
	}

	public string getString(){
		return name;
	}

	public string toString(){
		return name+"("+score+")";
	}


}

public class Scoreboard{
	private int numEntry = 0;
	private int[] board;

	public Scoreboard(int capacity){
		board = new int[capacity];
	}

	public void add(gameEntry e){
		if(numEntry>board.length) return;
		int temp = e.getScore();
		int index =numEntry-1 ;
		while( index >0 && board[index].getScore <= score){
	 		board[index] = board[index+1];
			index--;
		}
		board[index+1] = e; 
		numEntry++;
	}

	public gameEntry remove(int n){
		gameEntry temp = board[n];
		int index = n;
		while( index != numEntry-1 ){
			board[index] = board[index+1];
			index++;
		}
		board[index] = null;
		numEntry--;
		return temp;
	}

}