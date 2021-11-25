module com.ucc.cs3318assignment {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ucc.cs3318assignment to javafx.fxml;
    exports com.ucc.cs3318assignment;
}