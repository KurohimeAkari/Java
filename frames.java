import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class frames extends JFrame implements ActionListener{

/*定義*/
JTextField text;
JTextField text2;
JLabel label;

/*基礎を作る宣言*/
public static void main(String[] args) {
int fx = 400; // Yoko
int fy = 400; // Tate
frames frames = new frames("テスト"); /*Class名 下のframeを呼び出す*/
frames.setVisible(true);
frames.setBounds(200,200,fx,fy);
}

/*中身*/
frames(String title){
setTitle(title);
JPanel p = new JPanel(); //Panel(下地呼び出し)

text = new JTextField("1",20);
text2 = new JTextField("2",20);
JButton button = new JButton("ぷっしゅ！");
button.addActionListener(this);
label = new JLabel();

/*テキストエリアとか作る中間宣言*/
p.add(text);
p.add(text2);
p.add(button);

/*ここで設置場所を決める*/
Container contentPane = getContentPane();
contentPane.add(p,BorderLayout.CENTER);
contentPane.add(label,BorderLayout.SOUTH);

}	

/*ぷっしゅ！を押した時の処理！*/
public void actionPerformed(ActionEvent e){
//label.setText(text.getText());
//System.out.print(text.getText());
int a = Integer.valueOf(text.getText()); // text一番目を"a"に代入と数式に戻す
int b = Integer.valueOf(text2.getText());
int c;
c = a + b ;
System.out.print(c);
}

}