import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        WordList wordList = new WordList();

        ShowCount counter = new ShowCount(wordList);
        ShowSpeed timer = new ShowSpeed(wordList);


        ShowCount counter2 = new ShowCount(wordList);

        //Add the showWPM
        ShowWPM showWPM = new ShowWPM(wordList);
        InlineCount inlineCount = new InlineCount(wordList);
        //Add the show words observer
        ShowWords show = new ShowWords(wordList);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press <Enter> to start");
        String readString = scanner.nextLine();



        while (readString != null) {
            System.out.print("Enter text('exit' to stop) > ");
            String line = scanner.nextLine();  // Read command line from keyboard
            if (line.equals("exit")) break;
            String[] text = line.split(" "); // Splits words into array so all can be added at once
            wordList.addWords(text);

        }

        System.out.print("Press <ENTER> to exit");
        scanner.nextLine();
        System.exit(0);  // This closes all open swing windows
    }
}
