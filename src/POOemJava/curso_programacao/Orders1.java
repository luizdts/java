package curso_programacao;

import java.util.Date;

import model.entities.Order1;
import model.enums.OrderStatus1;

public class Orders1 {

	public static void main(String[] args) {

		Order1 orders = new Order1(1080, new Date(), OrderStatus1.PENDING_PAYMENT);
		
		System.out.println(orders);
		
		OrderStatus1 os1 = OrderStatus1.DELIVERED;
		
		OrderStatus1 os2 = OrderStatus1.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
