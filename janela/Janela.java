import java.awt.*;
import java.awt.event.*;

public class Janela extends Frame{
    //declaracao dos componentes
    private Label l1;
    private Label l2;
    private Label l3;
    private TextField tf1;
    private TextField tf2;
    private TextField tf3;
    private Button bt1;
    private Button bt2;
    private Button bt3;
    private Button bt4;
    private Panel p1;
    private Panel p2;

    //construtor
    public Janela(){
        //instanciando os componentes
        l1 = new Label("numero 1");
        l2 = new Label("numero 2");
        l3 = new Label("resultado");
        tf1 = new TextField();
        tf2 = new TextField();
        tf3 = new TextField();
        bt1 = new Button("+");
        bt2 = new Button("-");
        bt3 = new Button("*");
        bt4 = new Button("/");
        p1 = new Panel();
        p2 = new Panel();
        bt1.addActionListener(new AcaoBT1());
        bt2.addActionListener(new AcaoBT2());
        bt3.addActionListener(new AcaoBT3());
        bt4.addActionListener(new AcaoBT4());

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent ev){
                System.exit(0);
            }
        });

        //insere no painel 1 e 2 um layout do formato gridlayout
        p1.setLayout(new GridLayout(6,1));
        p2.setLayout(new GridLayout(1,4));
        setLayout(new BorderLayout());

        //adicionando os componentes nos paineis
        p1.add(l1);
        p1.add(tf1);
        p1.add(l2);
        p1.add(tf2);
        p1.add(l3);
        p1.add(tf3);
        p2.add(bt1);    
        p2.add(bt2);
        p2.add(bt3);
        p2.add(bt4);
        //centraliza o painel 1
        add(p1, BorderLayout.CENTER);
        //posiciona no sul o painel 2
        add(p2, BorderLayout.SOUTH);
        pack();
    }
    int n1=0, n2=0;
    float soma=0;
    class AcaoBT1 implements ActionListener{
        public void actionPerformed (ActionEvent ev){
            n1 = Integer.parseInt(tf1.getText());
            n2 = Integer.parseInt(tf2.getText());
            System.out.println(n1+n2);
        }
    }
    class AcaoBT2 implements ActionListener{
        public void actionPerformed (ActionEvent ev){
            n1 = Integer.parseInt(tf1.getText());
            n2 = Integer.parseInt(tf2.getText());
            System.out.println(n1-n2);
        }
    }
    class AcaoBT3 implements ActionListener{
        public void actionPerformed (ActionEvent ev){
            n1 = Integer.parseInt(tf1.getText());
            n2 = Integer.parseInt(tf2.getText());
            System.out.println(n1*n2);
        }
    }
    class AcaoBT4 implements ActionListener{
        public void actionPerformed (ActionEvent ev){
            n1 = Integer.parseInt(tf1.getText());
            n2 = Integer.parseInt(tf2.getText());
            System.out.println(n1/n2);
        }
    }



    //criar um objeto do tipo janela
    //abrir(executar) janela
    public static void main(String [] arg){
        Janela j1 = new Janela();
        j1.setVisible(true);
    }
} 