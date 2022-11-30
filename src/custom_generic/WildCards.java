package custom_generic;

import java.util.ArrayList;
import java.util.List;

public class WildCards {
	public static void drawShape(List<? extends Shape> lists) {
		for(Shape s:lists) {
			s.draw();
		}
	}


	public static void main(String[] args) {
		List<Rectangle> recs=new ArrayList<>();
		List<Circle> cirs=new ArrayList<>();
		recs.add(new Rectangle());
		cirs.add(new Circle());
		
		List<ChilCircle> childCircs=new ArrayList<>();
		childCircs.add(new ChilCircle());
		
		WildCards wilds=new WildCards();
		wilds.drawShape(cirs);
		wilds.drawShape(recs);
		wilds.drawShape(childCircs);
		
	}

}
