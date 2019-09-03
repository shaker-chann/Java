package thread;

public class ErrorSellTicket extends Thread{
	private int ticket = 5;
	public void run(){
		while(true){
			System.out.println("Thread ticket = " + ticket--);
			if(ticket < 0){
				break;
				}
			}
		} 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ErrorSellTicket().start();

		new ErrorSellTicket().start();

	}

}
