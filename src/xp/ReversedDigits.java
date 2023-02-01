package xp;

import java.util.Scanner;

public class ReversedDigits {

	public static void main(String[] args) {
		
		int valeurinverser = 0;
		
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("veuillez saisie un nombre entier svp");
		
		int valeur = clavier.nextInt();
		
		while (valeur != 0) {
			
			valeurinverser = valeurinverser*10;
			
			valeurinverser = valeurinverser + valeur%10;
			valeur = valeur/10;
		}
		
		System.out.println("the number :"+ valeur +"with the digits reversed is :" +valeurinverser );
		
	}
	
}
