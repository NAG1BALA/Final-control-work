import model.animal_class.writer.FIleHandler;
import view.ConsoleUI;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ConsoleUI test = new ConsoleUI();
        test.setWritable(new FIleHandler());
        test.start();
    }
}