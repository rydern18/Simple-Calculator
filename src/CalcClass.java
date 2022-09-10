import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalcClass extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stg) throws Exception {
		Parent p = FXMLLoader.load(getClass().getResource("FxCalc.fxml"));
		Scene sn1 = new Scene(p);
		stg.setScene(sn1);
		stg.show();
		
	}

}
