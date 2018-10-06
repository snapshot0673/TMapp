import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import java.awt.*;

public class FX3 extends Application
{
    Stage stage = new Stage();

    @Override
    public void start(Stage primaryStage)
    {
        Scene scene = new Scene(new Group());
        HBox root = new HBox();

        final WebView browser = new WebView();
        final WebEngine webEngine = browser.getEngine();

        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(browser);
        webEngine.loadContent("<html><head><style>* {background-color: black}</style></head><body><iframe src=\"https://discordapp.com/widget?id=484788713872687127&theme=dark\" width=\"350\" height=\"500\" allowtransparency=\"true\" frameborder=\"0\"></iframe></body></html>");
        browser.setStyle("-fx-background-color: black");

        Label Title = new Label("Tech Meltdown");
        Text Info = new Text("Here there will be listed all informations,like social media and others\n" +
                "Patreon: https://www.patreon.com/PaolosTekkit\n" +
                "Buy packages(customnames,donate,ecc..):\n" +
                "http://tekkitnuclear.tebex.io/\n" +
                "Site: paolostekkit.cubik.host\n" +
                "Server ip: 192.99.34.60:25509\n");

        root.setStyle("-fx-color: white;");

        Info.setStyle("-fx-font-family: 'Kanit';");
        VBox vBox = new VBox(Title, Info);
        vBox.setAlignment(Pos.TOP_RIGHT);
        root.getChildren().addAll(scrollPane, vBox);
        scene.setRoot(root);
        scene.getStylesheets().add("https://fonts.googleapis.com/css?family=Kanit");
        Image logo = new Image("file:logo.png");

        Title.setStyle("-fx-font-family: 'Kanit'; -fx-font-size: 20; -fx-max-width: 300px; -fx-max-height: 50px; ");

        scrollPane.setStyle("-fx-background-color: black;");


        root.setStyle("-fx-background-color: black;");

        Title.setTextFill(Color.WHITE);
        Info.setFill(Color.WHITE);

        Info.setTranslateX(-10);

        Title.setTranslateX(-100);

        stage.setTitle("Tech Meltdown app");
        stage.getIcons().add(logo);
        stage.setScene(scene);
        stage.setResizable(true);
        stage.show();
    }

    public static void FX3(String args[])
    {
        launch(args);
    }
}