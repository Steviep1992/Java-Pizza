import javax.swing.SwingUtilities;

public class JavaPizzaMain {
	public static void main(String[] args)
	{
	
	SwingUtilities.invokeLater(new Runnable() 
		{
            public void run() 
            {
		new JavaPizza();
        	}
            
		});
			}
		}