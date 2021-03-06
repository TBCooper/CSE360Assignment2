/**
 * Name: Tanner Cooper
 * ClassID: 353
 * Assignment 2
 * Description: This file contains the class "Calculator" which is used to
 * do a few basic calculator related tasks.
 */
package cse360assign2;

/**
 * This class uses a constructor to create a calculator object that stores
 * a global variable called "total". Total is used to hold the current value
 * of the calculator. Another variable called "history" keeps track of the operations
 * done to "total". It includes methods for addition, subtraction, multiplication,
 * division, returning the total, and showing the history of operations.
 * These methods are called add, subtract, multiply, divide, getTotal, and getHistory.
 */
public class Calculator {

	private int total; //keeps track of total value
	private String history; //history of operations as a string
	
	/**
	 * Constructor with no parameters. Initializes total to 0 and history string
	 * to start as "0".
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/**
	 * Method that returns the current value of total and has no parameters.
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Takes an input that will be added to the global variable "total".
	 * Also updates the history string to show what has been done to "total".
	 * Does not return anything.
	 * 
	 * @param  value  is an integer that is to be added to "total"
	 */
	public void add (int value) {
		total += value;
		history = history + " + " + Integer.toString(value);
	}
	
	/**
	 * Takes an input that will be subtracted from the global variable "total".
	 * Also updates the history string to show what has been done to "total".
	 * Does not return anything.
	 * 
	 * @param  value  is an integer that is to be subtracted from "total"
	 */
	public void subtract (int value) {
		total -= value;
		history = history + " - " + Integer.toString(value);
	}
	
	/**
	 * Takes an input. The global variable "total" will be multiplied by the input.
	 * Also updates the history string to show what has been done to "total".
	 * Does not return anything.
	 * 
	 * @param  value  is an integer that that will be used to multiply "total"
	 */
	public void multiply (int value) {
		total *= value;
		history = history + " * " + Integer.toString(value);
	}
	
	/**
	 * Takes an input. The global variable "total" will be divided by the input.
	 * Also updates the history string to show what has been done to "total".
	 * Does not return anything.
	 * 
	 * @param  value  is an integer that that will be used to multiply "total"
	 */
	public void divide (int value) {
		if (value == 0) {
			total = 0;
			history = "0";
		}
		else {
			total /= value;
			history = history + " / " + Integer.toString(value);
		}
	}
	
	/**
	 * A method with no input that will return the history of all operations done
	 * on the global variable "total". The operators +,-,*,/ will be used to represent
	 * addition, subtraction, multiplication, and division, respectively. For example,
	 * if the user did add(4) and subtract(2), the string will be set as "0 + 4 - 2".
	 * The return value is a string containing this string.
	 */
	public String getHistory () {
		return history;
	}
}
