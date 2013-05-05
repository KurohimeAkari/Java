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
		frames.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); /*Close処理*/
	}

	/*中身*/
	frames(String title){
		setTitle(title);
		JPanel p = new JPanel(); //Panel(下地呼び出し)

		text = new JTextField("1",5);
		text2 = new JTextField("2",5);
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
		int a; 
		int b;
		int c;
		/*もし文字が入れられた処理が行われた場合*/
		try {
			a = Integer.valueOf(text.getText());
			b = Integer.valueOf(text2.getText());
		} catch (NumberFormatException er) {
			a = 0;
			b = 0;
		}
		
		c = a + b ;
		
		if (c == 0) {
			System.out.print("もしかして文字かも？");
			label.setText("もしかして文字かも？");
		} else {
			String Sc = Integer.toString(c); // Cを文字式に戻す
			System.out.print(c);
			label.setText(Sc);
		}
	}
	
}