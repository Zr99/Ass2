import javax.swing.*;

// This class opens a window on which text can be displayed
public class TextWindow {
    private static int lastYLocation = 10;
    private JTextArea textArea;

    public TextWindow(String title, int rows, int cols) {
        // Using the Swing library make a window with a text panel
        final JFrame theFrame = new JFrame();       // make the frame (window)
        theFrame.setTitle(title);
        theFrame.setSize(500, 500);
        theFrame.setLocation(10, lastYLocation);
        JPanel mainPanel = new JPanel();
        textArea = new JTextArea(rows, cols);       //create the text area
        mainPanel.add(textArea);                    //add the text area to the panel
        theFrame.getContentPane().add(mainPanel);   //add the panel to the frame
        theFrame.pack();
        theFrame.setVisible(true);
        lastYLocation += 10 + theFrame.getHeight();
    }

    public void setText(String text) { textArea.setText(text); }
    public void appendText(String text) { textArea.setText(textArea.getText() + "\n" + text); }
}
