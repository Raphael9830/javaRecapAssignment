package org.amalitech.javarecapassigment;

import java.util.Scanner;

public class Joshwheel {
	public static String code_trigger_ender_str="end";

	public static void main(String[] args) {
		
		String code_trigger_starter_str="start";
		//The program prompts user to enter start to run the program
		System.out.println("****This program prints out user input and terminates "
				+ "when user enters \"end\"****\n"
				+ "Enter \"start\" to run the program\n");
		//Program call
		re_run_kybd_input(code_trigger_starter_str);
		
	}
	
	private static void re_run_kybd_input(String code_trigger_starter_str) {
		boolean program_running_bool;
		Scanner kybd_input = new Scanner(System.in);
		String kybd_input_str=kybd_input.nextLine();
		
		// We need a trigger to start the code
		if(kybd_input_str.
				equalsIgnoreCase(code_trigger_starter_str)) {
			
			program_running_bool=true;
			System.out.println("The program has started. \n"
					+ "Waiting for your input...");
			//while loop to accept user input and print it out
			while(program_running_bool==true) {
				String userInput_str=kybd_input.nextLine();
				
			
			// We need a trigger to end the code
			if(userInput_str.equals(code_trigger_ender_str)) {
				System.out.println("The program is ending........End!");
				break;
			}
			System.out.println(userInput_str);
			
			}//END OF WHILE LOOP
		kybd_input.close();			
		}else { //the user entered the wrong start command
			
			System.out.println("You entered a wrong command. "
					+ "Enter \"start\" to run the program");
			//repeats program until user enters "end"
			re_run_kybd_input(code_trigger_starter_str);
					
		}
			
	}

}
