module br.com.ligianedomingos.jdbcjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires java.sql;

    opens br.com.ligianedomingos.jdbcjavafx to javafx.fxml;
    exports br.com.ligianedomingos.jdbcjavafx;
}