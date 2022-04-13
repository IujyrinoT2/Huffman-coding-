package JavafxGUI;

import Clase.Statistica;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class StatisticaGUI extends Statistica {
    public static void display() {
        StackPane panouCentral = new StackPane();
        VBox lista = new VBox(10);

        Rectangle panou = new Rectangle();
        panou.setX(50);
        panou.setY(50);
        panou.setWidth(500);
        panou.setHeight(400);
        panou.setArcWidth(20);
        panou.setArcHeight(20);
        panou.setFill(Color.GREY);

        panouCentral.setAlignment(Pos.CENTER);

        Statistica stat = new Statistica();

        Text sumaProb = new Text("Suma probabilitatilor: " + Math.ceil(Statistica.SumProb) + " / " + "1");
        Text ent = new Text("\nH(A): " + stat.Entropy() + "[biti/caracter]");
        Text M = new Text("M = " + 2);
        Text lungMedie = new Text("Lungime medie cod: " + stat.LungimeMedieCod());
        Text efic = new Text("Eficienta: " + stat.Entropy() / stat.LungimeMedieCod());
        Text red = new Text("Redundanta: " + (1 - stat.Entropy() / stat.LungimeMedieCod()));

        Font font = Font.font("Calibri", FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 14);

        sumaProb.setFill(Color.WHITE);
        sumaProb.setFont(font);
        ent.setFill(Color.WHITE);
        ent.setFont(font);
        M.setFill(Color.WHITE);
        M.setFont(font);
        lungMedie.setFill(Color.WHITE);
        lungMedie.setFont(font);
        efic.setFill(Color.WHITE);
        efic.setFont(font);
        red.setFill(Color.WHITE);
        red.setFont(font);

        lista.getChildren().addAll(sumaProb, ent, M, lungMedie, efic, red);
        lista.setAlignment(Pos.CENTER);

        panouCentral.getChildren().addAll(panou, lista);

        AppFrame.Cadru.setCenter(panouCentral);
    }
}
