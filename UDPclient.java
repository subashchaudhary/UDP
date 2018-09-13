import java.util.*;
import java.io.*;
import java.net.*;

public class UDPclient {
	public static void main(String args[]) throws Exception
	{
		//creating client Datagram Socket
		DatagramSocket ds = new DatagramSocket();
		System.out.println("Enter the message");
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		byte []msg = new byte[100];
		msg = str.getBytes();
		//getting address of local address
		InetAddress address = InetAddress.getLocalHost();
 		
		// creating packet to send
		DatagramPacket newpacket = new DatagramPacket(msg,msg.length,address,9999);
		ds.send(newpacket);
		System.out.println("Data send to server : " + address);
	}
}
