package store;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
			JFrame frame = new JFrame("Client interface");
			frame.setSize(250, 250);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			placeComponents(frame, newUser, AAPL);
			frame.setVisible(true);
		
	}

	

	private static void placeComponents(JFrame frame, User newUser, Stock AAPL) {
		frame.setLayout(null);
		
		JLabel userNameText = new JLabel("User name:");
		userNameText.setBounds(10,10 ,100, 25);
		frame.add(userNameText);
		
		JLabel userName = new JLabel(newUser.getUserName());
		userName.setBounds(90,10,100 , 25);
		frame.add(userName);
		
	
		JButton buyStockButton = new JButton("Buy Stock");
		buyStockButton.setBounds(50, 60, 120, 25);
		frame.add(buyStockButton);
		
		JButton sellStockButton = new JButton("Sell Stock");
		sellStockButton.setBounds(50, 100, 120, 25);
		frame.add(sellStockButton);
		
		/*JButton otherStockButton = new JButton("Other options");
		otherStockButton.setBounds(50, 140, 120, 25);
		frame.add(otherStockButton);*/

	
		buyStockButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				 String cmd = e.getActionCommand();
				 
				    if ("Buy Stock".equals(cmd)) { 
				    	
				    	JFrame frame = new JFrame("Buy Stock");
						frame.setSize(450, 200);
						//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						//this.placeComponents(frame);
						frame.setVisible(true);
						frame.setLayout(null);
						
						JLabel moneyText = new JLabel("Money:");
						moneyText.setBounds(10,10 ,100, 25);
						frame.add(moneyText);
						
						JLabel money = new JLabel( String.valueOf(newUser.getMoney()) );
						money.setBounds(70,10,100 , 25);
						frame.add(money);
						
						JLabel companyNameText = new JLabel("Company name:");
						companyNameText.setBounds(10,60 ,100, 25);
						frame.add(companyNameText);
						
						JLabel companyName = new JLabel(AAPL.getCompanyName());
						companyName.setBounds(110,60,100 , 25);
						frame.add(companyName);
						
						JLabel priceText = new JLabel("Price:");
						priceText.setBounds(10,90 ,100, 25);
						frame.add(priceText);
						
						JLabel price = new JLabel( String.valueOf(AAPL.getPrice()) );
						price.setBounds(110,90,100 , 25);
						frame.add(price);
						
						
						JButton buyStockButton = new JButton("Buy");
						buyStockButton.setBounds(240, 80, 90, 25);
						frame.add(buyStockButton);
						
						JTextField amount= new JTextField(5);
						amount.setBounds(200, 80, 40, 25);
						frame.add(amount);
						
						buyStockButton.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								 String cmd = e.getActionCommand();
								
								    if ("Buy".equals(cmd)) { 
								    	if(!amount.getText().isEmpty()){
									    	new Buy(newUser, AAPL,Integer.parseInt(amount.getText()) ).buyStock();
									    	money.setText(String.valueOf(newUser.getMoney()));
									        
								    	}
							}
							}
						});
				    
			}
			}
		});
		
		sellStockButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				 String cmd = e.getActionCommand();
				 
				    if ("Sell Stock".equals(cmd)) { 
				    	
				    	JFrame frame = new JFrame("Sell Stock");
				    	if(newUser.getStocks().size()==0){
				    		frame.setSize(450, 150);
							frame.setVisible(true);
							frame.setLayout(null);
							JLabel Text = new JLabel("No stock avaible");
							Text.setBounds(10,10 ,100, 25);
							frame.add(Text);
				    	}else{
						frame.setSize(450, 150* newUser.getStocks().size());
						frame.setVisible(true);
						frame.setLayout(null);
						
						JLabel moneyText = new JLabel("Money:");
						moneyText.setBounds(10,10 ,100, 25);
						frame.add(moneyText);
						
						JLabel money = new JLabel( String.valueOf(newUser.getMoney()) );
						money.setBounds(70,10,100 , 25);
						frame.add(money);
						
						for (int i = 0; i < newUser.getStocks().size(); i++){
							
							
							JLabel companyNameText = new JLabel("Company name:");
							companyNameText.setBounds(10,60+i*100 ,100, 25);
							frame.add(companyNameText);
							
							JLabel companyName = new JLabel(newUser.getStocks().get(i).getCompanyName());
							companyName.setBounds(110,60+i*100,100 , 25);
							frame.add(companyName);
							
							JLabel priceText = new JLabel("Price:");
							priceText.setBounds(10,90+i*100 ,100, 25);
							frame.add(priceText);
							
							JLabel price = new JLabel( String.valueOf( newUser.getStocks().get(i).getPrice() ) );
							price.setBounds(110,90+i*100,100 , 25);
							frame.add(price);
							
							
							JButton sellStockButton = new JButton("Sell");
							sellStockButton.setBounds(230, 80+i*100, 90, 25);
							frame.add(sellStockButton);
							sellStockButton.addActionListener(new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									 String cmd = e.getActionCommand();
									    if ("Sell".equals(cmd)) { 
									    	
									    		new Sell(newUser).sellStock(AAPL);
										    	money.setText(String.valueOf(newUser.getMoney()));
										        frame.remove(companyNameText);
										        frame.remove(companyName);
										        frame.remove(priceText);
										        frame.remove(price);
										        frame.remove(companyNameText);
										        frame.remove(sellStockButton);
										        frame.revalidate();
										        frame.repaint();
									    	
								}
								}
							});
				   
				        }
						
						
						
				    	}
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






