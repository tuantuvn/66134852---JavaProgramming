module JavaFX_HelloWorld002 {
	requires javafx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
}
