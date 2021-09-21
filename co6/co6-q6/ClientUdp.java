import java.io.*;
import java.net.*;
class ClientUdp {
 public static void main(String[] args) throws
IOException {
 DatagramSocket client= new DatagramSocket();
 InetAddress
add=InetAddress.getByName("localhost");
 String str ="Hello...Server";
 byte[] bufBytes = str.getBytes();
 DatagramPacket datagramPacket=new
DatagramPacket(bufBytes,bufBytes.length,add,4220);
 client.send(datagramPacket);
 client.close();
 }
}
