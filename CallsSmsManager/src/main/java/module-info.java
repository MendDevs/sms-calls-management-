module com.abraham.callssmsmanager {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.sql;

    opens com.abraham.callssmsmanager.controllers to javafx.fxml;
    exports com.abraham.callssmsmanager;
    exports com.abraham.callssmsmanager.controllers to javafx.fxml;
}