import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			//User example
		    User newUser = new User("Owen", (float) 10000.47);
	        Stock AAPL = new Stock("AAPL", (float) 567.32);

	        //new Buy(newUser, AAPL, 5).buyStock();

	       /* for (int i = 0; i < newUser.getStocks().size(); i++){
	            System.out.println(newUser.getStocks().get(i).getCompanyName());
	        }
	        System.out.println(newUser.getUserName() + "'s Total money = " + newUser.getMoney());
	        System.out.println("----------------------------------------------------------------");
	        new Sell(newUser).sellStock(AAPL);

	        for (int i = 0; i < newUser.getStocks().size(); i++){
	            System.out.println(newUser.getStocks().get(i).getCompanyName());
	        }
	        System.out.println(newUser.getUserName() + "'s Total money = " + newUser.getMoney());*/
		
			JFrame mainFrame = new JFrame("Client interface");
			mainFrame.setSize(250, 270);
			mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			placeComponents(mainFrame, newUser, AAPL);
			mainFrame.setVisible(true);
		
	}

	

	private static void placeComponents(JFrame mainFrame, User newUser, Stock AAPL) {
		
		mainFrame.setLayout(null);
		
		JLabel userNameText = new JLabel("User name:");
		userNameText.setBounds(10,10 ,100, 25);
		mainFrame.add(userNameText);
		
		JLabel userName = new JLabel(newUser.getUserName());
		userName.setBounds(90,10,100 , 25);
		mainFrame.add(userName);
		
		JLabel userCashText = new JLabel("Cash:");
		userCashText.setBounds(10,40 ,100, 25);
		mainFrame.add(userCashText);
		
		JLabel userCash = new JLabel( String.valueOf(newUser.getMoney()) );
		userCash.setBounds(90,40,100 , 25);
		mainFrame.add(userCash);
		
	
		JButton buyStockButton = new JButton("Buy Shares");
		buyStockButton.setBounds(50, 90, 120, 25);
		mainFrame.add(buyStockButton);
		
		JButton sellStockButton = new JButton("Sell Shares");
		sellStockButton.setBounds(50, 130, 120, 25);
		mainFrame.add(sellStockButton);
		
		JButton displayStockButton = new JButton("Display Shares");
		displayStockButton.setBounds(50, 170, 120, 25);
		mainFrame.add(displayStockButton);
		
		/*JButton otherStockButton = new JButton("Other options");
		otherStockButton.setBounds(50, 140, 120, 25);
		mainFrame.add(otherStockButton);*/

	
		buyStockButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				 String cmd = e.getActionCommand();
				 
				    if ("Buy Shares".equals(cmd)) { 
				    	
				    	BuySharesI buyshareI = new BuySharesI();
				    	buyshareI.placeComponentsBuyShares(newUser, AAPL, userCash);
				  
				    
			}
			}
		});

		
		
		sellStockButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				 String cmd = e.getActionCommand();
				 
				    if ("Sell Shares".equals(cmd)) { 
				    	
				    	SellSharesI sellshareI = new SellSharesI();
				    	sellshareI.placeComponentsSellShares(newUser, AAPL,userCash);
				    	
			}
			}
		});
		
		
		displayStockButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				 String cmd = e.getActionCommand();
				 
				    if ("Display Shares".equals(cmd)) { 
				    	
				    	DisplaySharesI displayshareI = new DisplaySharesI();
				    	displayshareI.placeComponentsDisplayShares(newUser, AAPL);
				    	
			}
			}
		});
		/*otherStockButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 String cmd = e.getActionCommand();
				 
				    if ("Other options".equals(cmd)) {
				    	
				    	
				    
			}
			}
		});*/
		
		
		
		
	}


}






