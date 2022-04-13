package JavafxGUI;

import Clase.Criptare;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class CriptareGUI extends Criptare{
    private static String MesajCriptat;
    private static String MesajDecriptat;

    public static void display() {
        HBox PanouCentral = new HBox();

        CheckBox Codare = new CheckBox("Codare");
        CheckBox Decodare = new CheckBox("Decodare");

        // Input
        VBox PanouInput = new VBox();

        Text TitluBoxIn = new Text("Input");
        TitluBoxIn.setFont(Font.font("calibri", 16));

        TextField Input = new TextField();
        TextField Output = new TextField(); // declarare output

        Input.setMinHeight(50);
        Input.setPromptText("Intoroduceti mesajul");

        Input.setOnKeyPressed(e -> {
            if(e.getCode().equals(KeyCode.ENTER)) {
                Output.clear();
                MesajDecriptat = Input.getText();
                System.out.println(MesajDecriptat);
                Output.setText(ApelareCriptare(Codare, Decodare, Input));
            }
        });

        PanouInput.getChildren().addAll(TitluBoxIn, Input);
        PanouInput.setAlignment(Pos.CENTER);
        PanouInput.setPadding(new Insets(20));

        //Checkbox

        Codare.setOnAction(e -> {
            Codare.setSelected(true);
            Decodare.setSelected(false);
        });

        Decodare.setOnAction(e -> {
            Codare.setSelected(false);
            Decodare.setSelected(true);
        });

        VBox CheckCriptare = new VBox(10);
        CheckCriptare.getChildren().addAll(Codare, Decodare);
        CheckCriptare.setAlignment(Pos.CENTER_LEFT);

        //Output

        VBox PanouOutput = new VBox();

        Text TitluBoxOut = new Text("Output");
        TitluBoxOut.setFont(Font.font("calibri", 16));

        Output.setMinHeight(50);
        Output.setScaleShape(true);
        Output.autosize();
        Output.setEditable(false);

        PanouInput.setAlignment(Pos.CENTER);
        PanouInput.setPadding(new Insets(20));
        PanouInput.getChildren().setAll(TitluBoxIn, Input);

        PanouOutput.setAlignment(Pos.CENTER);
        PanouOutput.setPadding(new Insets(20));
        PanouOutput.getChildren().setAll(TitluBoxOut, Output);

        PanouCentral.getChildren().addAll(PanouInput, CheckCriptare, PanouOutput);
        PanouCentral.setAlignment(Pos.CENTER);

        AppFrame.Cadru.setCenter(PanouCentral);
    }

    private static String ApelareCriptare(CheckBox Codare, CheckBox Decodare, TextField Input) {
        String MesajReturnat = new String("");

        if(Codare.isSelected())
            MesajReturnat = Criptare.Encrypter(Input.getText());
        else
            if(Decodare.isSelected())
                MesajReturnat = Criptare.Decrypter(Input.getText());

        return MesajReturnat;
    }
}