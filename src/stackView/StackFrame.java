package stackView;
import javax.swing.*;
import java.*;
import java.awt.*;
import stackController.*;

public class StackFrame extends JFrame
{
	private StackController baseController;
	private StackPanel basePanel;
	public StackFrame(StackController drawController)
	{
		this.baseController = drawController;
		basePanel = new StackPanel();
		setUpFrame();
	}

	private void setUpFrame() 
	{
		this.setContentPanel(basePanel);
		this.setResizable(true);
		this.setTitle("Stack Dish Machine");
		this.setSize(400, 400);
		this.setVisible(true);
		
	}
	
	public StackController getBaseController()
	{
		return baseController;
	}
}