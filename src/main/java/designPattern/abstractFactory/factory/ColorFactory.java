package designPattern.abstractFactory.factory;

import designPattern.abstractFactory.color.Color;
import designPattern.abstractFactory.color.Green;
import designPattern.abstractFactory.color.Red;
import designPattern.abstractFactory.shape.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		if(color == null){
	         return null;
	      }        
	      if(color.equalsIgnoreCase("RED")){
	         return new Red();
	      } else if(color.equalsIgnoreCase("GREEN")){
	         return new Green();
	      }
	      return null;

	}

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
