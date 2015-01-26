package framesystem;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import lib.Calculation_lib;
import lib.MM1_lib;
import lib.MMS_lib;

public class FrameSystemView extends Frame implements ActionListener,WindowListener
{
    private TextField text1 = new TextField("", 10);
    private TextField text2 = new TextField("", 10);
    private TextField text3 = new TextField("", 10);
    private Button button1 = new Button("ë´ÇµéZ");
	
    //M/M/1óp
    private TextField m1 = new TextField("", 5);
    private TextField m2 = new TextField("", 5);
    private TextField m3 = new TextField("", 5);
    private Button bm = new Button("M/M/1");
    
  //M/M/Sóp
    private TextField m4 = new TextField("", 5);
    private TextField m5 = new TextField("", 5);
    private TextField m6 = new TextField("", 5);
    private TextField m7 = new TextField("", 5);
    private TextField m8 = new TextField("", 5);
    private TextField m9 = new TextField("", 5);
    private TextField m10 = new TextField("", 5);
    private TextField m11 = new TextField("", 5);  
    private Button bms = new Button("M/M/S");
    
	public FrameSystemView(FrameSystemController controller) {
		// TODO Auto-generated constructor stub
        addWindowListener(this);
        setTitle("FrameSystem");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(text1);
        add(text2);
        add(button1);
        add(new Label("ìöÇ¶"));
        add(text3);
        
        add(new Label("É…"));
        add(m1);
        add(new Label("É "));
        add(m2);
        add(bm);
        add(new Label("ïΩãœånì‡êlêî"));
        add(m3);  
        
      
        add(new Label("É…ÅL"));
        add(m4);
        add(new Label("É ÅL"));
        add(m5);
        add(new Label("s"));
        add(m6);
        add(bms);
        add(new Label("óòópó¶Éœ"));
        add(m7);
        add(new Label("ïΩãœë“ÇøêlêîLq"));
        add(m8);
        add(new Label("ïΩãœånì‡êlêîL"));
        add(m9);
        add(new Label("ïΩãœë“Çøéûä‘Wq"));
        add(m10);
        add(new Label("ïΩãœånì‡éûä‘W"));
        add(m11);
        
        button1.addActionListener(this);
        bm.addActionListener(this);
        bms.addActionListener(this);
        
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
     if(e.getSource() == button1){
       int val1 = Integer.parseInt(text1.getText());
       int val2 = Integer.parseInt(text2.getText());
       //text3.setText(String.valueOf(val1+val2));
       Calculation_lib clib =new Calculation_lib(val1, val2);
       text3.setText(String.valueOf(clib.getPlus()));
     }

     else if(e.getSource() == bm){
       double lambda = Double.parseDouble(m1.getText());
       double mu = Double.parseDouble(m2.getText());
       MM1_lib mlib = new MM1_lib(lambda, mu);    
       m3.setText(String.valueOf(mlib.getLength()));
     }
     else if(e.getSource() == bms){
         double lambda = Double.parseDouble(m4.getText());
         double mu = Double.parseDouble(m5.getText());
         int s = Integer.parseInt(m6.getText());
         MMS_lib mlibs = new MMS_lib(lambda, mu, s);    
         m7.setText(String.valueOf(mlibs.getRho()));
         m8.setText(String.valueOf(mlibs.getLq()));
         m9.setText(String.valueOf(mlibs.getL()));
         m10.setText(String.valueOf(mlibs.getWq()));
         m11.setText(String.valueOf(mlibs.getW()));
         
     }
     
     
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);

	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
