import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
public class MainFrame extends Frame{
    private int x,y;
    private Button btnExit = new Button("Exit");
    private Button btnUp = new Button("Up");
    private Button btnDon = new Button("Down");
    private Button btnLft = new Button("Left");
    private Button btnRgt = new Button("Right");
    private Label lab = new Label("^_^",Label.CENTER);
public MainFrame(){
    init();
}
private void init(){
    this.setLayout(null);
    this.setLocation(100,50);
    this.setSize(450,400);
    this.setBackground(new Color(0,0,0));
    this.addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent we){
            System.exit(0);
        }
    });
    btnExit.setBounds(10,50,70,25);
    btnUp.setBounds(100,50,70,25);
    btnDon.setBounds(190,50,70,25);
    btnLft.setBounds(280,50,70,25);
    btnRgt.setBounds(370,50,70,25);
    lab.setBounds(x=200,y=180,50,50);
    btnExit.setBackground(new Color(125,125,125));
    btnUp.setBackground(new Color(125,125,125));
    btnDon.setBackground(new Color(125,125,125));
    btnLft.setBackground(new Color(125,125,125));
    btnRgt.setBackground(new Color(125,125,125));
    lab.setBackground(new Color(200,155,100));
    this.add(btnExit);
    this.add(btnUp);
    this.add(btnDon);
    this.add(btnLft);
    this.add(btnRgt);
    this.add(lab);
    btnExit.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            System.exit(0);
        }
    });
    btnUp.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            lab.setLocation(x,y = y-10);
        }
    });
    btnDon.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            lab.setLocation(x,y = y + 10);
        }
    });
    btnLft.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            lab.setLocation(x = x-10 ,y);
        }
    });
    btnRgt.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            lab.setLocation(x = x+10 ,y);
        }
    });
}
}