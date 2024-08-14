module org.ejfx.demo_fx {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens org.ejfx.demo_fx to javafx.fxml;
    exports org.ejfx.demo_fx;
}