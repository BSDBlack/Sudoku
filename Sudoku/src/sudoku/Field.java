package sudoku;

public class Field {
	public static void main(String[] args){
		
		Generator();
		for (int i = 0; i < 9; i++){
			for (int j = 0; j < 9; j++ )
			{
			System.out.print(solvedField[i][j]);
			}
			System.out.println();
		}
	}
	
	private static int countInputs;
	
	private static int[][] solvedField;
	
	private static int[][] modifiedField;
	
	private static boolean[][] permField;
	
	
	
	
	public static void Generator(){
		
		solvedField = new int[9][9];
		for(int i = 0; i < 9; i++)
		{
			for(int j = 0; j < 9; j++)
			{
				solvedField[i][j] = 0;
			}
		}
		int rand;
		int row, column;
		
		for(int i = 0; i < 81; i++) {
			for(int j = 0; j < 9; j++)
			{
				for(int k = 0; k < 9;)
				{
					rand = (int) (Math.random() * 9 + 1);
					if(IsPossible(rand, j, k))
					{
						solvedField[j][k] = rand;
						k++;
					}
//					row = (int) (Math.random() * 9);
//					column = (int) (Math.random() * 9);
//					if(IsPossible(j, row, column))
//					{
//						solvedField[row][column] = j;
//						k++;
//					}
				}
			}
			
			
//			do {
//				row = (int) (Math.random() * 9);
//				column = (int) (Math.random() * 9);
//				
//				
//			} while(!IsPossible(rand, row, column));
//			solvedField[row][column] = rand;
		}

		modifiedField = solvedField.clone();
		
	}
	
	private static boolean IsPossible (int number, int row, int column)
	{
		if(solvedField[row][column] != 0)
			return false;
		for(int i = 0; i < 9; i ++)
		{
			if(solvedField[row][i] == number)
			{
				return false;
			}
		}
		for(int i = 0; i < 9; i ++)
		{
			if(solvedField[i][column] == number)
			{
				return false;
			}
		}
		
		if(row >= 0 && row <= 2 &&
			column >= 0 && column <= 2)
		{
			for(int i = 0; i < 3; i++)
			{
				for(int j = 0; j < 3; j++)
				{
					if(solvedField[i][j] == number)
					{
						return false;
					}
				}
			}
		}
		else if(row >= 0 && row <= 2 &&
			column >= 3 && column <= 5)
		{
			for(int i = 0; i < 3; i++)
			{
				for(int j = 0; j < 3; j++)
				{
					if(solvedField[i][j+3] == number)
					{
						return false;
					}
				}
			}
		}
		else if(row >= 0 && row <= 2 &&
			column >= 6 && column <= 8)
		{
				for(int i = 0; i < 3; i++)
			{
				for(int j = 0; j < 3; j++)
				{
					if(solvedField[i][j+6] == number)
					{
						return false;
					}
				}
			}
		}
		else if(row >= 3 && row <= 5 &&
			column >= 0 && column <= 2)
		{
				for(int i = 0; i < 3; i++)
			{
				for(int j = 0; j < 3; j++)
				{
					if(solvedField[i+3][j] == number)
					{
						return false;
					}
				}
			}
		}
		else if(row >= 3 && row <= 5 &&
			column >= 3 && column <= 5)
		{
				for(int i = 0; i < 3; i++)
			{
				for(int j = 0; j < 3; j++)
				{
					if(solvedField[i+3][j+3] == number)
					{
						return false;
					}
				}
			}
		}
		else if(row >= 3 && row <= 5 &&
			column >= 6 && column <= 8)
		{
				for(int i = 0; i < 3; i++)
			{
				for(int j = 0; j < 3; j++)
				{
					if(solvedField[i+3][j+6] == number)
					{
						return false;
					}
				}
			}
		}
		else if(row >= 6 && row <= 8 &&
			column >= 0 && column <= 2)
		{
				for(int i = 0; i < 3; i++)
			{
				for(int j = 0; j < 3; j++)
				{
					if(solvedField[i+6][j] == number)
					{
						return false;
					}
				}
			}
		}
		else if(row >= 6 && row <= 8 &&
			column >= 3 && column <= 5)
		{
				for(int i = 0; i < 3; i++)
			{
				for(int j = 0; j < 3; j++)
				{
					if(solvedField[i+6][j+3] == number)
					{
						return false;
					}
				}
			}
		}
		else if(row >= 6 && row <= 8 &&
			column >= 6 && column <= 8)
		{
				for(int i = 0; i < 3; i++)
			{
				for(int j = 0; j < 3; j++)
				{
					if(solvedField[i+6][j+6] == number)
					{
						return false;
					}
				}
			}
		}
		return true;
	}

}
