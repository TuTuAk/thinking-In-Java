//: gui/Borders.java
package gui; /* Added by Eclipse.py */
// Different Swing borders.

import static net.mindview.util.SwingConsole.run;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

public class Borders extends JFrame {

    public Borders() {
        setLayout(new GridLayout(2, 4));
        add(showBorder(new TitledBorder("Title")));
        add(showBorder(new EtchedBorder()));
        add(showBorder(new LineBorder(Color.BLUE)));
        add(showBorder(
                new MatteBorder(5, 5, 30, 30, Color.GREEN)));
        add(showBorder(
                new BevelBorder(BevelBorder.RAISED)));
        add(showBorder(
                new SoftBevelBorder(BevelBorder.LOWERED)));
        add(showBorder(new CompoundBorder(
                new EtchedBorder(),
                new LineBorder(Color.RED))));
    }

    static JPanel showBorder(Border b) {
        JPanel jp = new JPanel();
        jp.setLayout(new BorderLayout());
        String nm = b.getClass().toString();
        nm = nm.substring(nm.lastIndexOf('.') + 1);
        jp.add(new JLabel(nm, JLabel.CENTER),
                BorderLayout.CENTER);
        jp.setBorder(b);
        return jp;
    }

    public static void main(String[] args) {
        run(new Borders(), 500, 300);
    }
} ///:~
