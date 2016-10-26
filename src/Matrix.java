public class Matrix{
	
	public static int[][] rotate(int[][] matrix, int times){
		int x = times % 4;
		int[][] result = matrix;
		for(int i = 0; i < x; i++){
			result = rotate(result);
		}
		return result;
	}
	
	public static int[][] rotate(int[][] matrix){
		int[][] result = new int[matrix[0].length][matrix.length];
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				result[j][result[j].length - 1 - i] = matrix[i][j];
			}
		}
		return result;
	}
	
	public static void main(String[] args){
		int[][] matrix = new int[][]{
			{10, 11, 12, 13, 14}, 
			{15, 16, 17, 18, 19}, 
			{20, 21, 22, 23, 24},
			{25, 26, 27, 28, 29},
			{30, 31, 32, 33, 34}, 
			{35, 36, 37, 38, 39}
		};
		/*
		int[][] matrix = new int[][]{
			{10, 11, 12}, 
			{13, 14, 15}
		};
		*/
		int[][] rotated = rotate(matrix, 0);
		for(int i = 0; i < rotated.length; i++){
			for(int j = 0; j < rotated[i].length; j++){
				System.out.print(rotated[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		rotated = rotate(matrix, 1);
		for(int i = 0; i < rotated.length; i++){
			for(int j = 0; j < rotated[i].length; j++){
				System.out.print(rotated[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		rotated = rotate(matrix, 2);
		for(int i = 0; i < rotated.length; i++){
			for(int j = 0; j < rotated[i].length; j++){
				System.out.print(rotated[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		rotated = rotate(matrix, 3);
		for(int i = 0; i < rotated.length; i++){
			for(int j = 0; j < rotated[i].length; j++){
				System.out.print(rotated[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		rotated = rotate(matrix, 4);
		for(int i = 0; i < rotated.length; i++){
			for(int j = 0; j < rotated[i].length; j++){
				System.out.print(rotated[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		rotated = rotate(matrix, 40);
		for(int i = 0; i < rotated.length; i++){
			for(int j = 0; j < rotated[i].length; j++){
				System.out.print(rotated[i][j] + " ");
			}
			System.out.println();
		}
	}
}