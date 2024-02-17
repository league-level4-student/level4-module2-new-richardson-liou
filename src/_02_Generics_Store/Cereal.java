package _02_Generics_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Cereal extends Food{
	public Cereal() {
		if(new Random().nextBoolean()) {
			this.item = "cheerios.jpeg";
		}
		else {
			this.item = "luckycharms.jpeg";
		}
	}

	@Override
	public JLabel getFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
}
