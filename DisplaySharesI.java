
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DisplaySharesI {
	
	public  void placeComponentsDisplayShares( User newUser, Stock AAPL) {
		
		
	JFrame frame = new JFrame("Display Stock");
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
		
		

	
    }
	
	
	}
	}
}
