package massiv1;

public class dick {

	public static void main(String[] args) {
		int[][] n = new int[3][3];
		int[][] m = {{1,4,6},{8,9},{2,5,3}};
		
		for(int row=0;row<m.length;row++){
			for(int col=0;col<m[row].length;col++){
				System.out.print(m[row][col] + "  ");
				try{
					Thread.sleep(1000);  //задержка 1500мс
				}catch(Exception e){}
			}
			System.out.println();
		}
	}

}
