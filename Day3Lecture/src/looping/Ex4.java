package looping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4 {
	static BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		
		String password;
		do {
			System.out.print("Enter Your Password :");
			password = br.readLine();
		}while(!password.equals("000"));

	}

}
