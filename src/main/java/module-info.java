module local.demoexamen.demoexamen {
    requires javafx.controls;
    requires javafx.fxml;


    opens local.demoexamen.demoexamen to javafx.fxml;
    exports local.demoexamen.demoexamen;
}