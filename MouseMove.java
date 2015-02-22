import java.awt.*;
import java.awt.event.*;
import java.util.*;

class MouseMove {
	public static void main(String[] args) {
		//crick();
		//point();
	}
	// Crickメソッド (function)
	static void click(){
		Robot r;
		try {
			r = new Robot();
		}
		catch (AWTException e) {
			e.printStackTrace();
			return;
		}
		// クリック
		r.mousePress(InputEvent.BUTTON1_MASK);
		r.delay(100);
		r.mouseRelease(InputEvent.BUTTON1_MASK);
	}
	
	static void move(int moW,int moH,int moD){
		Robot r;
		try {
			r = new Robot();
		}
		catch (AWTException e) {
			e.printStackTrace();
			return;
		}
		PointerInfo pI = MouseInfo.getPointerInfo();
		Point point = pI.getLocation();
		
			int i = (int)point.getX();
			int h = (int)point.getY();
		// move
		while (!(i == moW && h == moH)) {
			if (i < moW){
				i++;
			}else if (i > moW) {
				i--;
			}
			if (h < moH){
				h++;
			}else if (h > moH) {
				h--;
			}
			r.mouseMove(i,h);
			r.delay(moD);
		}
		click();
		r.delay(2000);
	}
}
