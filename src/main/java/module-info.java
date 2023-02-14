module com.profesor.menu {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.profesor.menu to javafx.fxml;
    exports com.profesor.menu;
}