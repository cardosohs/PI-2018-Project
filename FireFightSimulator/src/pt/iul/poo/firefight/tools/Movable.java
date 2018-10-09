package pt.iul.poo.firefight.tools;

import java.awt.Point;

import pt.iul.ista.poo.utils.Direction;

public interface Movable {
	
	
	Point moveTo (Direction d);
	
	void move (Direction d);

}
