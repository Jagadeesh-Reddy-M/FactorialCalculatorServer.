package factorialnumbersusingsocketconnection;
import java.net.Socket;
import java.io.*;
public class FactorialClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Client Started");
			Socket soc = new Socket("localhost" , 9806);
			BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a number");
			int number = Integer.parseInt(userInput.readLine());
			PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
			out.println(number);
			BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			System.out.println(in.readLine());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
