package application;

import java.util.Scanner;

import controller.GestorApoio;
import controller.GestorFichaUtente;
import controller.GestorFuncionario;
import controller.GestorUtente;

public class App 
{
	public static void main(String[] args) 
	{
		//Importar Controladores
		GestorApoio 	  gApoio       = new GestorApoio();
		GestorUtente      gUtente	   = new GestorUtente();
		GestorFichaUtente gFicha       = new GestorFichaUtente();
		GestorFuncionario gFuncionario = new GestorFuncionario();		
	
		//Dados para a utilização da app
		Scanner sc = new Scanner(System.in);
		int opc=0;
		
		do
		{
			System.out.printf("1. Adicionar novo Funcionario \n");
			System.out.printf("2. Adicionar novo Utente 	 \n");
			System.out.printf("3. Adicionar novo Apoio  	 \n");
			System.out.printf("4. Adicionar nova Ficha 	     \n");
			opc = sc.nextInt();
			
			switch(opc)
			{
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					System.out.printf("Terminando Software... \n");
					break;
			}
		
		}while(opc!=5);
	}	
}
