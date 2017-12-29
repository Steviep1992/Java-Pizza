/*Program name - JavaPizza
 * Programmers name - Steve Prestridge
 * Program description - Have user input name, phone number, select from radio buttons what size pizza, using check boxes input the toppings wanted
 * and display the total, when "Display" is clicked, display in a new window all of the inputs received.
  */



import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


//Initialize variables
public class JavaPizza extends JPanel
{
	private static JLabel labelTitle;
	private static JFrame Frame;
	private static JTabbedPane tab;
	private static JRadioButton small;
	private static JRadioButton medium;
	private static JRadioButton large;
	private static JPanel tab1;
	private static JPanel tab2;
	private static JPanel tab3;
	private static JPanel tab4;
	private static JPanel button;
	private static JLabel labelSize;
	private static JLabel labelToppings;
	private static JLabel labelTotalDue;
	private static JLabel labelTotal;
	private static JLabel labelName;
	private static JLabel labelPhoneNumber;
	private static JTextField textName;
	private static JTextField textPhoneNumber;
	private static JTextField textTotal;
	private static ButtonGroup radioButton;
	private static JCheckBox checkBox1;
	private static JCheckBox checkBox2;
	private static JCheckBox checkBox3;
	private static JCheckBox checkBox4;
	private static JButton displayButton;
	private static String name;
	private static String phoneNumber;
	private static double size;
	private static String pizzaSize;
	private static double total;
	private static double topping1;
	private static double topping2;
	private static double topping3;
	private static double topping4;
	private static ArrayList<String> top = new ArrayList<>();
	
	
	
	public JavaPizza()
	{
		//Set the size and title of the JFrame
		Frame = new JFrame("Java Pizza");
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.setSize(400, 400);
		Frame.setVisible(true);
		//Adding the variables needed within the app
		tab = new JTabbedPane();
		tab1 = new JPanel();
		tab2 = new JPanel();
		tab3 = new JPanel();
		tab4 = new JPanel();
		button = new JPanel();
		labelTitle = new JLabel();
		labelName = new JLabel();
		labelPhoneNumber = new JLabel();
		labelSize = new JLabel();
		labelToppings = new JLabel();
		labelTotalDue = new JLabel();
		labelTotal = new JLabel();
		textName = new JTextField();
		textPhoneNumber = new JTextField();
		textTotal = new JTextField();
		small = new JRadioButton();
		medium = new JRadioButton();
		large = new JRadioButton();
		radioButton = new ButtonGroup();
		checkBox1 = new JCheckBox();
		checkBox2 = new JCheckBox();
		checkBox3 = new JCheckBox();
		checkBox4 = new JCheckBox();
		
		
		
		
		//For tab 1, set the name of the tab as well as the text and feilds
		labelTitle.setText("Welcome to Java Pizza");
		labelName.setText("Name: ");
		textName = new JTextField();
		labelPhoneNumber.setText("Phone Number: ");
		textPhoneNumber = new JTextField();
		tab.addTab("Customer", tab1);
		
		//For tab 2, set the name of the tab as well as the text and feilds
		labelSize.setText("What size pizza?");
		small = new JRadioButton("Small");
		medium = new JRadioButton("Medium");
		large = new JRadioButton("Large");
		tab.addTab("Size", tab2);
		
		
		
		//For tab 3, set the name of the tab as well as the text and feilds
		labelToppings.setText("What toppings would you like?");
		tab3.add(labelToppings);
		checkBox1 = new JCheckBox("Pepperoni");
		tab3.add(checkBox1);
		checkBox2 = new JCheckBox("Sausage");
		tab3.add(checkBox2);
		checkBox3= new JCheckBox("Mushroom");
		tab3.add(checkBox3);
		checkBox4= new JCheckBox("Onion");
		tab3.add(checkBox4);
		tab.addTab("Toppings", tab3);
		
		
		
		
		//For tab 4, set the name of the tab as well as the text and feilds
		labelTotalDue.setText("Total Due");
		labelTotal.setText("Total: ");
		textTotal = new JTextField();
		displayButton = new JButton("Display");
		
		tab.addTab("Total", tab4);
		
		//// If the index is up to 3 (tab 3) processInfo will happen which will have the total displayed in the textbox. 
		
	    ChangeListener changeListener = new ChangeListener()
	    {
	    	
	        public void stateChanged(ChangeEvent changeEvent) 
	        {
	          tab = (JTabbedPane) changeEvent.getSource();
	          int index = tab.getSelectedIndex();
	          if (index == 3)
	          {
	        	processInfo();  //Show the processInfo
	          }
	          
	        }
	        
	      };
	      
	      
	      tab.addChangeListener(changeListener);
		// adding the variables to each tab that is specified
	      tab1.add(labelTitle);
	      tab1.add(labelName);
	      tab1.add(textName);
	      tab1.add(labelPhoneNumber);
	      tab1.add(textPhoneNumber);
		
	      
	      
	      tab2.add(labelSize);
	      radioButton.add(small); //How to add radio buttons along with the name of the button
	      radioButton.add(medium);
	      radioButton.add(large);
	      tab2.add(small);
		tab2.add(medium);
		tab2.add(large);
		
		tab4.add(labelTotalDue);
		tab4.add(labelTotal);
		tab4.add(textTotal);
		button.add(displayButton);
		tab4.add(button);
		
		
		displayButton.addActionListener(new ActionListener()
	    {
	    	public void actionPerformed(ActionEvent e)
	    	{
	    		//Make size of popup display box with the title
	    		name = textName.getText();
	    		phoneNumber = textPhoneNumber.getText();
	    		//Name the frame when the "Display" button is clicked on tab 4
	    		JFrame Frame = new JFrame("Java Pizza");
	    		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    		Frame.setSize(300, 300);
	    		Frame.setVisible(true);
	    		//Create variables for the pop up display box
	    		JPanel Panel = new JPanel();
	    		JLabel Name = new JLabel();
	    		JLabel PhoneNumber = new JLabel();
	    		JLabel Size = new JLabel();
	    		JLabel Toppings = new JLabel();
	    		JLabel Total = new JLabel();
	    		
	    	
	    		//Assign the text along with what input will be shown in the display box
	    		Name.setText("Customer Name: " + name);
	    		PhoneNumber.setText("Phone Number: " + phoneNumber);
	    		Size.setText("Size: " + pizzaSize);
	    		Toppings.setText("Toppings: " + top.toString());
	    		Total.setText("Total: $" + total);
	    		
                //Set where the inputs and text will be aligned within the component
	    		Name.setAlignmentX(Component.CENTER_ALIGNMENT);
	    		PhoneNumber.setAlignmentX(Component.CENTER_ALIGNMENT);
	    		Size.setAlignmentX(Component.CENTER_ALIGNMENT);
	    		Toppings.setAlignmentX(Component.CENTER_ALIGNMENT);
	    		Total.setAlignmentX(Component.CENTER_ALIGNMENT);
	    		
	    		//Tells the new Panel what is going inside of it
	    		Panel.add(Name);
	    		Panel.add(PhoneNumber);
	    		Panel.add(Size);
	    		Panel.add(Toppings);
	    		Panel.add(Total);
	    		Frame.add(Panel);
	    	}
	    	
	    });
		//Alligns the following itmes in the center alignment
		labelTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
		labelName.setAlignmentX(Component.CENTER_ALIGNMENT);
		labelPhoneNumber.setAlignmentX(Component.CENTER_ALIGNMENT);
		labelSize.setAlignmentX(Component.CENTER_ALIGNMENT);
		labelToppings.setAlignmentX(Component.CENTER_ALIGNMENT);
		labelTotalDue.setAlignmentX(Component.CENTER_ALIGNMENT);
		labelTotal.setAlignmentX(Component.CENTER_ALIGNMENT);
		small.setAlignmentX(Component.CENTER_ALIGNMENT);
		medium.setAlignmentX(Component.CENTER_ALIGNMENT);
		large.setAlignmentX(Component.CENTER_ALIGNMENT);
		textName.setAlignmentX(Component.CENTER_ALIGNMENT);
		textPhoneNumber.setAlignmentX(Component.CENTER_ALIGNMENT);
		textTotal.setAlignmentX(Component.CENTER_ALIGNMENT);
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		//Sets the layout for each tab
		tab1.setLayout(new BoxLayout(tab1, BoxLayout.Y_AXIS));
		tab2.setLayout(new BoxLayout(tab2, BoxLayout.Y_AXIS));
		tab3.setLayout(new BoxLayout(tab3, BoxLayout.Y_AXIS));
		tab4.setLayout(new BoxLayout(tab4, BoxLayout.Y_AXIS));
				
		Frame.getContentPane().add(tab);
		Frame.add(tab);
		}
	public void processInfo()
	{
		//Assign cost for each selected size as well as checkbox (Toppings)
			if (small.isSelected() == true)
			{
				size = 8.00;
				pizzaSize = "Small";
			}
			else if (medium.isSelected() == true)
			{
				size = 10.00;
				pizzaSize = "Medium";
			}
			else if (large.isSelected() == true)
			{
				size = 12.00;
				pizzaSize = "Large";
			}

			if (checkBox1.isSelected() == true)
			{
				topping1 = 2.00;
				top.add("Pepperoni");
			}
			if (checkBox2.isSelected() == true)
			{
				topping2 = 2.00;
				top.add("Sausage");
			}
			if (checkBox3.isSelected() == true)
			{
				topping3 = 2.00;
				top.add("Mushroom");
			}
			if (checkBox4.isSelected() == true)
			{
				topping4 = 2.00;
				top.add("Onion");
			}
			//How to calculate the total
			total = size + topping1 + topping2 + topping3 + topping4;
			textTotal.setText(Double.toString(total));
	}
	
           

	
}