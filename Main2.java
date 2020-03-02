package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Scanner;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
        Scene scene = new Scene(root,720,405);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Cvičenie 2");
        primaryStage.show();
        Scanner in = new Scanner(System.in);

        // premenne
        int sam = 0;
        int spol = 0;
        String s1 = in.nextLine();
        int r, g, b;

        // spocitanie písmen s regex
        for (int i=0; i<s1.length(); i++) {
            String znak = s1.substring(i,i+1);
            if (znak.matches("[aeiouyäáéíóôúýAEIOUYÁÉÍÓÚÝ]")) sam++;
            if (znak.matches("[dtnlhkgďťňľcčžšjmbpvzsfrDTNLHKGĎŤŇĽCČŽŠJMBPVZSFR]")) spol++;
        }

        // podmienky aby sa nepresiahol limit 255
        if ((sam*16)<=255) {
            r = sam*16;
        } else {
            r = 255;
        }

        if ((spol*16)<=255) {
            g = spol*16;
        } else {
            g = 255;
        }

        if (((s1.length()%25)*10)<=255) {
            b = (s1.length()%25)*10;
        } else {
            b = 255;
        }

        // zmena farby
        scene.setFill(Color.rgb(r,g,b));

        //text
        Text t1 = new Text();
        t1.setText(s1);
        t1.setFont(Font.font("Calibri",35));
        t1.setFill(Color.ANTIQUEWHITE);
        // centrovanie textu
        t1.layoutXProperty().bind(scene.widthProperty().subtract(t1.prefWidth(-1)).divide(2));
        t1.layoutYProperty().bind(scene.heightProperty().subtract(t1.prefHeight(-1)).divide(2));
        root.getChildren().addAll(t1);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
