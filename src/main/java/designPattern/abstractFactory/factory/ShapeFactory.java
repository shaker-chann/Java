package designPattern.abstractFactory.factory;

import designPattern.abstractFactory.color.Color;
import designPattern.abstractFactory.shape.Circle;
import designPattern.abstractFactory.shape.Rectangle;
import designPattern.abstractFactory.shape.Shape;
import designPattern.abstractFactory.shape.Square;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		if(shape == null){
	         return null;
	      }        
	      if(shape.equalsIgnoreCase("CIRCLE")){
	         return new Circle();
	      } else if(shape.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();
	      } else if(shape.equalsIgnoreCase("SQUARE")){
	         return new Square();
	      }
		return null;

	}

}
