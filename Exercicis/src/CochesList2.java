import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Comparator;

public class CochesList2 {
	LinkedList<Car> lifoAutos = new LinkedList<Car>();
	LinkedList<Car> fifoAutos = new LinkedList<Car>();
	LinkedList<Car> carsList = new LinkedList<Car>();
	PriorityQueue<Car> carQueue = new PriorityQueue<Car>(6, new Comparator<Car>() {
		public int compare (Car car1, Car car2) {
			if (car1.getCilindrada() < car2.getCilindrada())
		}
	}
	
}
