package model.entities;

import java.util.Date;

import model.enums.OrderStatus1;

public class Order1 {
	
	private Integer id;
	private Date moment;
	private OrderStatus1 status;
	
	public Order1() {
		
	}

	public Order1(Integer id, Date moment, OrderStatus1 status) {

		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus1 getStatus() {
		return status;
	}

	public void setStatus(OrderStatus1 status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
	
}
