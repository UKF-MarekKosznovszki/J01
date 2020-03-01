package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Glow;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
        Scene scene = new Scene(root,720,405);
        scene.setFill(Color.BLACK);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Witcher Signs");
        primaryStage.show();

        Polyline Yrden = new Polyline(131,192,140,174,103,174,140,223,103,223,114,209);
        Yrden.setStroke(Color.rgb(237,212,244));
        Yrden.setStrokeWidth(2);
        DropShadow ds1 = new DropShadow(70,Color.rgb(87,20,126));
        ds1.setSpread(0.85);
        Yrden.setEffect(ds1);

        Polyline Quen = new Polyline(247,192,263,192,270,174,219,174,244,223,253,209);
        Quen.setStroke(Color.rgb(255,255,179));
        Quen.setStrokeWidth(2);
        DropShadow ds2 = new DropShadow(70,Color.rgb(126,111,16));
        ds2.setSpread(0.85);
        Quen.setEffect(ds2);

        Polyline Igni = new Polyline(368,192,385,223,340,223,365,174);
        Igni.setStroke(Color.rgb(253,242,238));
        Igni.setStrokeWidth(2);
        DropShadow ds3 = new DropShadow(70,Color.rgb(129,17,16));
        ds3.setSpread(0.85);
        Igni.setEffect(ds3);

        Polyline Axii = new Polyline(506,192,488,223,460,174,513,174);
        Axii.setStroke(Color.rgb(54,225,51));
        Axii.setStrokeWidth(2);
        DropShadow ds4 = new DropShadow(70,Color.rgb(14,99,8));
        ds4.setSpread(0.85);
        Axii.setEffect(ds4);

        Polyline Aard = new Polyline(607,209,592,209,580,223,635,223,606,174,598,192);
        Aard.setStroke(Color.rgb(29,255,202));
        Aard.setStrokeWidth(2);
        DropShadow ds5 = new DropShadow(70,Color.rgb(13,101,77));
        ds5.setSpread(0.85       );
        Aard.setEffect(ds5);




        root.getChildren().addAll(Yrden, Quen, Igni, Axii, Aard);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
