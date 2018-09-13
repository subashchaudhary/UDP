import java.util.*;
import java.io.*;
import java.net.*;

public class UDPserver {
	public static void main(String args[]) throws Exception
	{	
		System.out.println("server is running");
		Scanner sc = new Scanner(System.in);
		//creating datagram socket
		DatagramSocket ds = new DatagramSocket(9999);
		
		byte []msg = new byte[20];
		//creating packet to receive the packet
		DatagramPacket dp = new DatagramPacket(msg,msg.length);
		ds.receive(dp);
		System.out.println("connection established");
		//displaying the receive message
		System.out.println("message from client: " + new String(dp.getData()));
		//close connection
		ds.close();
	}
}
