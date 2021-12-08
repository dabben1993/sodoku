package sudoku;

import javafx.application.Application;
import javafx.stage.Stage;
import sudoku.userinterface.IUserIntefaceContract;

import java.io.IOException;

public class SodokuApp extends Application {
    private IUserIntefaceContract.View uiImpl;

    @Override
    public void start(Stage primaryStage) throws Exception{
        uiImpl = new UserInterfaceImpl(primaryStage);
        try {
            SodokuBuildLogic.build(uiImpl);
        } catch (IOException e){
            e.printStackTrace();
            throw e;
        }
    }

    public static void main(String[] args) {launch(args);}
}