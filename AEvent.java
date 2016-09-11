import java.awt.*;  
import java.awt.event.*;  
  
class AEvent extends Frame implements ActionListener{  
TextField tf,tff;  
AEvent(){  
  
tf=new TextField();  
tff=new TextField();  
tf.setBounds(60,70,170,20);  
  tff.setBounds(70,80,190,39);  
Button b=new Button("copy");  
Button c=new Button("cut");  
Button d=new Button("paste");  
b.setBounds(100,120,80,30);  
c.setBounds(150,140,82,35);  
d.setBounds(170,160,87,39);  
  
b.addActionListener(this);  
c.addActionListener(this);  
d.addActionListener(this);  
add(b);add(tf);  add(c);add(d);add(tff);
  
setSize(300,300);  
setLayout(null);  
setVisible(true);  
  
}  
  
public void actionPerformed(ActionEvent e){  
 String s=e.getActionCommand();
String v=tf.getText();
if(s.equals("copy"))
{

tff.setText(v);
}  
else if(s.equals("paste"))
{

tff.setText(v);
}
else 
{

tf.setText("");
}
}
public static void main(String args[]){  
new AEvent();  
}
}