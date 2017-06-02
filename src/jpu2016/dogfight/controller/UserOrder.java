package jpu2016.dogfight.controller;

public class UserOrder {

	private int player;
	private Order order;
	
	public UserOrder(int pplayer, Order porder){
	player = pplayer;
	order = porder;
	}
	
	public int getPlayer() {
		return player;
	}

	public Order getOrder() {
		return order;
	}
	
}
