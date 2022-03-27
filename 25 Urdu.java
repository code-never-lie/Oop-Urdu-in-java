import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class TextFieldCheck extends JFrame implements KeyListener{
TextFieldCheck () { 
	ta= new JTextArea();
        sp = new JScrollPane(ta);
        ta.setFont(new java.awt.Font("Arial", 1, 20));
        ta.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        ta.grabFocus();
        ta.addKeyListener(this);
        add(sp); 
        setSize(400,400);
        setVisible(true);	
}
public void keyPressed(KeyEvent e) {

}

public void keyTyped(KeyEvent e) {
  char ch=e.getKeyChar();
          if(ch==java.awt.event.KeyEvent.VK_BACK_SPACE){
                return;
            }
          else if(ch==java.awt.event.KeyEvent.VK_CONTROL){
                return;
            }
          else if(ch==java.awt.event.KeyEvent.VK_DELETE){
                return;
            }
          else if(ch==java.awt.event.KeyEvent.VK_ENTER){
                e.consume();
                return;
            }
  String text=""+ta.getText();
  System.out.println("key typed = " + e.getKeyChar());
  e.consume();
  ta.setText(keyMap(text,ch)); 
}
public void keyReleased(KeyEvent e) {

}
String keyMap(String text, char ch){
    switch(ch){
                case 'a':
                    text=text+"\u0627";
                    break;
                case 'A':
                    text=text+"\u0622";
                    break;	
		case 'b':
                    text=text+"\u0628";
                    break;
                case 'B':
                    text=text+"\u0628";
                    break;	
		case 'c':
                    text=text+"\u0686";
                    break;
		case 'C':
                    text=text+"\u062B";
                    break;		
		case 'd':
                    text=text+"\u062F";
                    break;
		case 'D':
                    text=text+"\u0688";
                    break;
		case 'e':
                    text=text+"\u0639";
                    break;
                case 'E':
                    text=text+"\u0639";
                    break;
		case 'f':
                    text=text+"\u0641";
                    break;
		case 'F':
                    text=text+"\u0641";
                    break;
		case 'g':
                    text=text+"\u06AF";
                    break;
		case 'G':
                    text=text+"\u063A";
                    break;
		case 'h':
                    text=text+"\u06BE";
                    break;
		case 'H':
                    text=text+"\u062D";
                    break;				
		case 'i':
                    text=text+"\u06CC";                    
                    break;
		case 'I':
                    text=text+"\u0627";
                    break;	
		case 'j':
                    text=text+"\u062C";
                    break;
		case 'J':
                    text=text+"\u0636";
                    break;
		case 'k':
                    text=text+"\u06A9";
                    break;
		case 'K':
                    text=text+"\u062E";
                    break;
		case 'l':
                    text=text+"\u0644";
                    break;
		case 'L':
                    text=text+"\u0644";
                    break;	
		case 'm':
                    text=text+"\u0645";
                    break;
		case 'M':
                    text=text+"\u0627";
                    break;
		case 'n':
                    text=text+"\u0646";
                    break;
		case 'N':
                    text=text+"\u06BA";
                    break;	
		case 'o':
                    text=text+"\u06C1";
                    break;
		case 'O':
                    text=text+"\u0629";
                    break;	
		case 'p':
                    text=text+"\u067E";
                    break;
		case 'P':
                    text=text+"\u0654";
                    break;	
		case 'q':
                    text=text+"\u0642";
                    break;
		case 'Q':
                    text=text+"\u0642";
                    break;	
		case 'r':
                    text=text+"\u0631";
                    break;
		case 'R':
                    text=text+"\u0691";
                    break;
		case 's':
                    text=text+"\u0633";
                    break;
		case 'S':
                    text=text+"\u0635";
                    break;
		case 't':
                    text=text+"\u062A";
                    break;
		case 'T':
                    text=text+"\u0679";
                    break;
		case 'u':
                    text=text+"\u0621";
                    break;						
		case 'U':
                    text=text+"\u0621";
                    break;
		case 'v':
                    text=text+"\u0637";
                    break;
		case 'V':
                    text=text+"\u0638";
                    break;
		case 'w':
                    text=text+"\u0648";
                    break;
		case 'W':
                    text=text+"\u0648";
                    break;												
		case 'x':
                    text=text+"\u0634";
                    break;
                case 'X':
                    text=text+"\u0698";
                    break;
		case 'y':
                    text=text+"\u06D2";
                    break;
		case 'Y':
                    text=text+"\u06D2";
                    break;
		case 'z':
                    text=text+"\u0632";
                    break;
		case 'Z':
                    text=text+"\u0630";
                    break;
                default:
                    text=text+ch;
            }
  System.out.println(text);
   return text;

}
Frame f;
JTextArea ta;
JScrollPane sp;
}
class Test {
public static void main (String o[]){
 TextFieldCheck  mc = new TextFieldCheck();
}
}

