import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BuySharesI {
	
	
	
	
	public  void placeComponentsBuyShares( User newUser, Stock AAPL, JLabel userCashMain) {
		 
		 
	  	
    	JFrame frame = new JFrame("Buy Shares");
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
		
		JButton listProfit = new JButton("List profit");
		listProfit.setBounds(160, 10, 90, 25);
		frame.add(listProfit);
		
		JTextField amount= new JTextField(5);
		amount.setBounds(200, 80, 40, 25);
		frame.add(amount);
		
		buyStockButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 String cmd = e.getActionCommand();
				 int aux;
				    if ("Buy".equals(cmd)) { 
				    	if(!amount.getText().isEmpty()){
					    	aux=new Buy(newUser, AAPL,Integer.parseInt(amount.getText()) ).buyStock();
					    	if (aux<0) {
					    		JOptionPane.showMessageDialog(frame,
					    			    "Not enought found to buy the share",
					    			    "Error",
					    			    JOptionPane.ERROR_MESSAGE);
					    	}else {
					    		money.setText(String.valueOf(newUser.getMoney()));
					    		userCashMain.setText(String.valueOf(newUser.getMoney()));
					    	}
					    	
					    	
					        
				    	}
			}
			}
		});
		listProfit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 String cmd = e.getActionCommand();
				 int aux;
				    if ("List profit".equals(cmd)) { 
				    	JOptionPane.showMessageDialog(frame,
				    		    "Actual profit:" + (newUser.getMoney()-newUser.getAmountSpent()),
				    		    "Profit",
				    		    JOptionPane.PLAIN_MESSAGE);
			}
			}
		});
		
	}

}
