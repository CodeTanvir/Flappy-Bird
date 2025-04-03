import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

import static javax.swing.text.StyleConstants.setBackground;

public class FlappyBird extends JPanel{
    int boardWidth = 360;
    int bordHeight = 640;
    FlappyBird(){
        setPreferredSize(new Dimension(boardWidth,bordHeight));
        setBackground(Color.blue);
    }
}
