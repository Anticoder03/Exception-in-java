package day11;

import java.util.Scanner;

public class InvalidNameException extends RuntimeException{
	String msg;
	public InvalidNameException(String msg) {
		super(msg);
	}
}
