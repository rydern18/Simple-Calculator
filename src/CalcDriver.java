import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalcDriver {
	float Num = 0;//stores first value
	int operation = 0;// This will help determine which operation our calculator will handle
	
    @FXML
    private Button btnAdd;

    @FXML
    private Button btnSum;

    @FXML
    private Button btnDiv;

    @FXML
    private TextField txt1;

    @FXML
    private Button btn0;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn6;

    @FXML
    private Button btn5;

    @FXML
    private Button btn4;

    @FXML
    private Button btn7;

    @FXML
    private Button btn8;

    @FXML
    private Button btn9;

    @FXML
    private Button btnC;

    @FXML
    void pressButton(ActionEvent event) {
    	if (event.getSource() == btn1) 
    	{
    		txt1.setText(txt1.getText() + "1");//enters 1 into text field
    	}
    	else if (event.getSource() == btn2)
    	{
    		txt1.setText(txt1.getText() + "2");//enters 2 into text field
    	} 
    	else if (event.getSource() == btn3) 
    	{
    		txt1.setText(txt1.getText() + "3");//enters 3 into text field
    	}
    	else if (event.getSource() == btn4)
    	{
    		txt1.setText(txt1.getText() + "4");//enters 4 into text field
    	}
    	else if (event.getSource() == btn5)
    	{
    		txt1.setText(txt1.getText() + "5");//enters 5 into text field
    	}
    	else if (event.getSource() == btn6)
    	{
    		txt1.setText(txt1.getText() + "6");//enters 6 into text field
    	}
    	else if (event.getSource() == btn7)
    	{
    		txt1.setText(txt1.getText() + "7");//enters 7 into text field
    	}
    	else if (event.getSource() == btn8) 
    	{
    		txt1.setText(txt1.getText() + "8");//enters 8 into text field
    	}
    	else if (event.getSource() == btn9)
    	{
    		txt1.setText(txt1.getText() + "9");//enters 9 into text field
    	}
    	else if (event.getSource() == btn0) 
    	{
    		txt1.setText(txt1.getText() + "0");//enters 0 into text field
    	}
    	else if (event.getSource() == btnC)
    	{
    		txt1.setText("");//Clears number in text field
    	}
    	else if (event.getSource() == btnAdd)
    	{
    		Num = Float.parseFloat(txt1.getText());
    		operation = 1;// will tell the calculator to do case 1 which is Addition
    		txt1.setText("");
    	} 
    	else if (event.getSource() == btnDiv)
    	{
    		Num = Float.parseFloat(txt1.getText());
    		operation = 2;// will tell the calculator to do case 2 which is Division
    		txt1.setText("");
    	} 
    	else if (event.getSource() == btnSum)
    	{
    	Float secondNum = Float.parseFloat(txt1.getText());//takes in second value and applies the desired operation based on the number given when addition or division were chosen
    		switch(operation)
    		{
    		case 1://Addition
    			float ans = Num + secondNum;
    			txt1.setText(String.valueOf(ans));//outputs value of addition
    			break;
    		case 2://Division
    			float ans1 = Num / secondNum;
    			txt1.setText(String.valueOf(ans1));//outputs value of division
    		}
    	}
    }
}
