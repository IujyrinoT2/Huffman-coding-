package JavafxGUI;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

import Clase.Statistica;

public class AppFrame {
    protected static TableView tabel;

    protected static Boolean RulareNoua = false;

    protected static BorderPane Cadru = new BorderPane();

    protected static Stage fereastra = new Stage();

    protected static Scene scena;

    public static void display() {


        fereastra.setTitle("Criptare Huffman");

        // Top menu
        HBox topMenu1 = new HBox(20);
        HBox centerMenu = new HBox();

        Button butonA = new Button("Text Nou");
        butonA.setOnAction(e -> {
            RulareNoua = false;
            TextNou.display();

        });

        Button butonB = new Button("Statistica");
        Button butonC = new Button("Codificare");
        Button butonD = new Button("Analiza cod");
        topMenu1.getChildren().add(butonA);
        topMenu1.setAlignment(Pos.CENTER);
        topMenu1.getChildren().add(butonB);
        topMenu1.getChildren().add(butonC);
        topMenu1.getChildren().add(butonD);
        topMenu1.setPadding(new Insets(10,20,20,20));

        //Panou central



        Cadru.setTop(topMenu1);
        System.out.println(RulareNoua);



        scena = new Scene(Cadru, 500, 500);

        topMenu1.setBackground(Background.fill(Color.rgb(53, 53, 53)));

        fereastra.setScene(scena);
        fereastra.show();
    }

}
