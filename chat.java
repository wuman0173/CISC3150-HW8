/*
Benjamin Wu
CISC 3150
HW8

Chat Program with 2 clients talk to each other, random times, with the other end receiving the message.
Have Main Driver Class, 2 Clients, and a Server. Clients go through the Server to send/receive messages.

Comments:

*/

public class chat
{
//main driver
public static void main(String[] args)
	{
	server myserver = new server;
	}

}
public class server
{
PipedWriter pipeOneWrite = new PipedWriter();
PipedWriter pipeTwoWrite = new PipedWriter();
PipedReader pipeOneRead = new PipedReader(pipeOneWrite);
PipedReader pipeTwoRead = new PipedReader(pipeTwoWrite);
}
public class clientOne
{

}
public class clientTwo
{

}
