import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class Snake extends JPanel{
    int windowWidth;
    int windowHeight;

    Snake(int windowWidth, int windowHeight) {
        this.windowWidth = windowWidth;
        this.windowHeight = windowHeight;
        setPreferredSize(new Dimension(this.windowWidth, this.windowHeight));
        setBackground(Color.black);
    }
}
