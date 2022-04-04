package JavafxGUI;

import Clase.ElemCodHuff;
import Clase.Statistica;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class OpTabel extends Statistica{

    public TableView CreareTabel() {
        System.out.println(ListaElemCodate);

        TableView Tabel = new TableView();

        TableColumn<ElemCodHuff, String> Coloana1 = new TableColumn<>("Caracter");
        Coloana1.setCellValueFactory(new PropertyValueFactory<>("caracter"));

        TableColumn<ElemCodHuff, String> Coloana2 = new TableColumn<>("Frecventa");
        Coloana2.setCellValueFactory(new PropertyValueFactory<>("frecventa"));

        TableColumn<ElemCodHuff, String> Coloana3 = new TableColumn<>("Probabilitate");
        Coloana3.setCellValueFactory(new PropertyValueFactory<>("probabilitate"));

        TableColumn<ElemCodHuff, String> Coloana4 = new TableColumn<>("Cod Huffman");
        Coloana4.setCellValueFactory(new PropertyValueFactory<>("codHuff"));

        Tabel.getColumns().add(Coloana1);
        Tabel.getColumns().add(Coloana2);
        Tabel.getColumns().add(Coloana3);
        Tabel.getColumns().add(Coloana4);

        Tabel.setItems(getElement());

        return Tabel;
    }

    public ObservableList<ElemCodHuff> getElement() {
        ObservableList<ElemCodHuff> elemente = FXCollections.observableArrayList(ListaElemCodate);
        return elemente;
    }
}
