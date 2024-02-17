package _02_Generics_Store;

import javax.swing.JLabel;

public class Snickers extends Candy{
	public Snickers() {
		this.item = "snickers.jpeg";
	}
	public JLabel getFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
}
