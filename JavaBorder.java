import java.awt.*;

public class JavaBorder extends Frame{
    public JavaBorder(String title)
    {
        super(title);

        setLayout(new BorderLayout());
        Button b1 = new Button("Header page");
        add(b1, BorderLayout.PAGE_START);

        Button b2= new Button("Kawasan Tengah");
        add(b2, BorderLayout.CENTER);

        Button b3= new Button("Kawasan tepi kiri");
        add(b3, BorderLayout.LINE_START);

        Button b4= new Button("Footer");
        add(b4, BorderLayout.PAGE_END);

        Button b5= new Button("kawasan tepi kanan");
        add(b5, BorderLayout.LINE_END);
    }


    public static void main(String[] args)
    {   JavaBorder screen =
            new JavaBorder("Border Layout");
        screen.setSize(500,250);
        screen.setVisible(true);
    }
}