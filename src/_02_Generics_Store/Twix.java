package _02_Generics_Store;

import javax.swing.JLabel;

public class Twix extends Candy{
	public Twix() {
		this.item = "twix.jpeg";
	}
	public JLabel getFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
}
