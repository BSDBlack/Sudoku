package sudoku;

public class Feld {
	public static void main(String[] args){
		
		Generator();
		for (int i = 0; i < 9; i++){
			System.out.println(geloestesFeld[i][0]);
		}
	}
	
	private static int[][] geloestesFeld;
	
	
	public static void Generator(){
		
		geloestesFeld = new int[9][9];
		for(int i = 0; i < 9; i++)
		{
			for(int j = 0; j < 9; j++)
			{
				geloestesFeld[i][j] = 0;
			}
		}
		int rand;
		
		for (int y = 0; y < 9; y++){
			for (int x = 0; x < 9; x++){
				do {
				rand = (int) (Math.random() * 9 + 1);
				} while(!pruefen(rand, x, y));
				geloestesFeld[y][x] = rand;
				
			}
		}
		
	}
	
	private static boolean pruefen (int zahl, int row, int column)
	{	
		for(int i = 0; i < row; i ++)
		{
			if(geloestesFeld[i][column] == 0)
			{
				break;
			}
			if(geloestesFeld[i][column] == zahl)
			{
				return false;
			}
		}
		for(int i = 0; i < column; i ++)
		{
			if(geloestesFeld[row][i] == 0)
			{
				break;
			}
			if(geloestesFeld[row][i] == zahl)
			{
				return false;
			}
		}
		
		
		
		
		return true;
	}

}
