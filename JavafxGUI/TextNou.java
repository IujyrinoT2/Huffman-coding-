package JavafxGUI;

import Clase.Criptare;
import Clase.Statistica;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.Dragboard;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class TextNou {
    public static void display() {
        Stage fereastra = new Stage();

        fereastra.setTitle("Introducere text nou");
        fereastra.initModality(Modality.APPLICATION_MODAL);

        VBox layout = new VBox(10);
        Label mesaj = new Label("Trage aici fisierul text");
        mesaj.setTextFill(Color.WHITE);

        layout.getChildren().addAll(mesaj);
        layout.setPadding(new Insets(20,20,20,20));
        layout.setAlignment(Pos.CENTER);
        layout.setBackground(Background.fill(Color.rgb(53, 53, 53)));

        Scene scena = new Scene(layout);
        //scena.setFill(Color.BLACK);

        scena.setOnDragOver(e -> {
            Dragboard db = e.getDragboard();
            if(db.hasFiles()) {
                String sursa = db.getFiles().toString();
                Statistica stat = new Statistica();
                sursa = sursa.substring(1, sursa.length() - 1);
                stat.Citire(sursa);
                stat.AfFrecv();
                stat.CreareArbore();
                Criptare cript = new Criptare();
                cript.CodareHuff(stat.getRad());

                OpTabel tabelCreat = new OpTabel();
                AppFrame.tabel = tabelCreat.CreareTabel();


                Label TitluTabel = new Label("Huffman");
                TitluTabel.setFont(Font.font(16));

                VBox panouCentral = new VBox(10);

                panouCentral.setAlignment(Pos.TOP_CENTER);
                panouCentral.getChildren().add(TitluTabel);
                panouCentral.getChildren().add(AppFrame.tabel);
                AppFrame.Cadru.setCenter(panouCentral);

                fereastra.close();
            }
        });

        fereastra.setScene(scena);
        fereastra.show();
    }
}
