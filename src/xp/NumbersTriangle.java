package xp;

public class NumbersTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[][] tableau;
	      int i,j;

	      tableau = new int[7][];
	      
	      for (i = 0; i < tableau.length; i++) {
	  	tableau[i] = new int[i + 1];
	  	for (j = 0; j < tableau[i].length; j++) {
	  	    tableau[i][j] = i + 1;
	              System.out.print(tableau[i][j] + " ");
	           }
	           System.out.println();
	        }  
	        System.out.println(); 
	     }
	  }
		
	


