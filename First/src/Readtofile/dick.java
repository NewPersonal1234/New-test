package Readtofile;

import java.util.Scanner;
import java.io.File;



import javax.swing.JOptionPane;

public class dick {
	static String[][] m = new String[5][3];
	static Scanner scn;
	
	public static void main(String[] args) {
		openFile();
		readFile();
		out();	
	}

	private static void out() {
		for(int row=0;row<m.length;row++){
			for(int col=0;col<m[row].length;col++){
				System.out.print(m[row][col]+ "   ");
			}
			System.out.println();
		}
		
	}

	private static void readFile() {
		while(scn.hasNext()){   //hasNext - заставляет пройти файл до конца
			for(int row=0;row<m.length;row++){
				for(int col=0;col<m[row].length;col++){
					m[row][col] = scn.next();
				}
			}
		}
		
	}

	private static void openFile() {
		
		try {  //   проверка ошибки обязательно делаепм
			scn = new Scanner(new File("res//1.txt"));  //путь с папки программы
		} catch(Exception e){JOptionPane.showMessageDialog(null, "Файл не найден");}
			
		}
	}


