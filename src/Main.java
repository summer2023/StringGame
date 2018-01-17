import com.tw.Game;
import com.tw.Printer;
import com.tw.StringJudgementer;
import com.tw.StringReader;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
            Game game = new Game(new StringReader(),new Printer(),new StringJudgementer());
            game.start();
        }

}
