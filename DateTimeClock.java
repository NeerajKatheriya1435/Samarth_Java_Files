import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.util.Date;
import java.text.SimpleDateFormat;
public class DateTimeClock extends JFrame{

    private JLabel dateLable;
    private JLabel timeLable;

    public DateTimeClock(){
        setTitle("Digital Clock");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.BLACK);
        setLocationRelativeTo(null);

        JPanel panel=new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setLayout(new GridLayout(2,1));

        dateLable=new JLabel("",SwingConstants.CENTER);
        dateLable.setForeground(Color.ORANGE);
        dateLable.setFont(new Font("arial",Font.BOLD,40));

        timeLable=new JLabel("",SwingConstants.CENTER);
        timeLable.setForeground(Color.ORANGE);
        timeLable.setFont(new Font("arial",Font.BOLD,35));
  
        panel.add(dateLable);
        panel.add(timeLable);

        add(panel);

        Timer timer=new Timer(1000, e->updateTime());

        timer.start();
        updateTime();

        setVisible(true);
    }

    public void updateTime(){

        Date now=new Date();

        SimpleDateFormat timeFormat=new SimpleDateFormat("H:m:s");
        SimpleDateFormat dateFormat=new SimpleDateFormat("y:M:d");

        dateLable.setText(dateFormat.format(now));
        timeLable.setText(timeFormat.format(now));
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->new DateTimeClock());
    }
}