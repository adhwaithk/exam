package exam3;
import java.util.Scanner;


public class ticketprice {
	private int ticketid;
	private int price;
	private static int availableTickets;

	public void setTicketid(int ticket) //setter
	{
	    ticketid = ticket;
	}
	public int getTicketid() //getter
	{
	    return ticketid;
	}


	public int getPrice() //getter
	{                       
	    return price; 
	}
	public void setPrice(int prc) //setter
	{
	    price = prc;
	    
	}

	public static int getAvailableTickets() //getter
	{                  
	        return availableTickets;
	}
	public static void setAvailableTickets(int availTicket) //setter
	{
	    if(availTicket > 0)
	        availableTickets = availTicket;
	}

	public int calculateTicketCost(int nooftickets)//Check ticket availability
	{
	    int tik = getAvailableTickets();
	    if(nooftickets > tik)
	        return -1;
	    
	 
	    tik -=  nooftickets;
	    setAvailableTickets(tik);
	    return price * nooftickets;
	    
	}
   


	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
		    ticketprice t = new ticketprice();
		    
		    System.out.println("Enter no of bookings:\n");
		    int no = s.nextInt();
		    
		    System.out.println("\nEnter the available tickets:\n");
		    int availableTicket = s.nextInt();
		    t.setAvailableTickets(availableTicket);
		    
		    do{
		        
		    System.out.println("\nEnter the ticketid:\n");
		    int tickedId = s.nextInt();
		    t.setTicketid(tickedId);
		    
		    System.out.println("\nEnter the price:\n");
		    int price = s.nextInt();
		    t.setPrice(price);
		    
		    System.out.println("\nEnter the no of tickets:\n");
		    int bookTickets = s.nextInt();
		    
		    System.out.println("\nAvailable tickets:"+t.getAvailableTickets());
		    System.out.println("\nTotal amount:"+t.calculateTicketCost(bookTickets));
		    System.out.println("\nAvailable ticket after booking:"+t.getAvailableTickets());
		    
		    no--;
		    }while(no>0);
		

	}

}
