package com.example.modul6;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        TableView tabel = new TableView<>();
        tabel.setPlaceholder(new Label("Belum ada data !") );
        TableColumn<Mahasiswa, String> kolom1 =
                new TableColumn<>("NIM");
        kolom1.setCellValueFactory(
                new PropertyValueFactory<>("nim")
        );
        tabel.getColumns().add(kolom1);
        tabel.getItems().add(new Mahasiswa(123,"Khisyam","0045"));
        tabel.getItems().add(new Mahasiswa(231,"Syauqi","1145"));
        tabel.getItems().add(new Mahasiswa(123,"Akbar","1245"));
        tabel.getItems().add(new Mahasiswa(213,"Uus","1345"));
        tabel.getItems().add(new Mahasiswa(431,"Ali","1445"));
        tabel.getItems().add(new Mahasiswa(126,"Ronaldo","1545"));
        tabel.getItems().add(new Mahasiswa(178,"Rehan","1645"));
        tabel.getItems().add(new Mahasiswa(191,"Setiadi","1745"));
        tabel.getItems().add(new Mahasiswa(210,"Rohid","1845"));
        tabel.getItems().add(new Mahasiswa(125,"Sanz","1945"));
        TableColumn<Mahasiswa, String> kolom2 = new TableColumn<>("NAMA");
        kolom2.setCellValueFactory(
                new PropertyValueFactory<>("nama")
        );
        tabel.getColumns().add(kolom2);
        VBox vbox= new VBox(tabel);
        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}