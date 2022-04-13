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
import org.w3c.dom.Text;

public class AppFrame {
    protected static TableView tabel;

    protected static BorderPane Cadru = new BorderPane();

    protected static Stage fereastra = new Stage();

    protected static Scene scena;

    public static void display() {

        fereastra.setTitle("Codificare Huffman");

        // Top menu
        HBox topMenu = new HBox(20);
        HBox centerMenu = new HBox();
        HBox botMenu = new HBox();

        Button butonA = new Button("Text Nou");
        butonA.setOnAction(e -> TextNou.display());

        Button butonB = new Button("Statistica");
        butonB.setOnAction(e -> StatisticaGUI.display());

        Button butonC = new Button("Codificare");
        butonC.setOnAction(e -> CriptareGUI.display());

        Button butonD = new Button("Tabel");
        try {
            butonD.setOnAction(e -> OpTabel.display());
        }
        catch (NullPointerException e) {
            Label Eroare = new Label("Tabelul este gol");
            Eroare.setTextFill(Color.RED);
            Eroare.setBackground(Background.fill(Color.GREY));

        }

        botMenu.setAlignment(Pos.CENTER);
        botMenu.getChildren().add(butonA);
        botMenu.setPadding(new Insets(10,10,10,10));

        topMenu.setAlignment(Pos.CENTER);
        topMenu.getChildren().add(butonD);
        topMenu.getChildren().add(butonB);
        topMenu.getChildren().add(butonC);
        topMenu.setPadding(new Insets(10,10,10,10));

        Cadru.setTop(topMenu);
        Cadru.setBottom(botMenu);

        scena = new Scene(Cadru, 510, 510);

        topMenu.setBackground(Background.fill(Color.rgb(53, 53, 53)));
        botMenu.setBackground(Background.fill(Color.rgb(53, 53, 53)));

        fereastra.setScene(scena);
        fereastra.show();
    }

}
