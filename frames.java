import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class frames extends JFrame implements ActionListener{

	/*定義*/
	JTextField[] text = new JTextField[10];
	JLabel[] label = new JLabel[10];
	JLabel[] Texlabel = new JLabel[10];
	JButton button;

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
		text[0] = new JTextField("1",5);
		text[1] = new JTextField("2",5);
		Texlabel[0] = new JLabel("やっほー");
		Texlabel[1] = new JLabel("距離");
		label[0] = new JLabel();
		button = new JButton("ぷっしゅ！");
		button.addActionListener(this);
		
		/*テキストエリアとか作る中間宣言*/
		JPanel p = new JPanel(); //Panel(下地呼び出し)
		//setLayout(new GridLayout(2,2));
		p.add(Texlabel[0]);
		p.add(text[0]);
		p.add(Texlabel[1]);
		p.add(text[1]);
		p.add(button);

		/*ここで設置場所を決める*/
		Container contentPane = getContentPane();
		contentPane.add(p,BorderLayout.CENTER);
		contentPane.add(label[0],BorderLayout.SOUTH);

	}	

		/*ぷっしゅ！を押した時の処理！*/
	public void actionPerformed(ActionEvent e){
		int a; 
		int b;
		int c;
		/*もし文字が入れられた処理が行われた場合*/
		try {
			a = Integer.valueOf(text[0].getText());
			b = Integer.valueOf(text[1].getText());
		} catch (NumberFormatException er) {
			a = 0;
			b = 0;
		}
		
		c = a + b ;
		
		if (c == 0) {
			System.out.print("もしかして文字かも？");
			label[0].setText("もしかして文字かも？");
		} else {
		/*正規ルート*/
			String Sc = Integer.toString(c); // Cを文字式に戻す
			System.out.print(c);
			label[0].setText(Sc);
		}
	}
	
}