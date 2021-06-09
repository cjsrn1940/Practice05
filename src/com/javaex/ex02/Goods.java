package com.javaex.ex02;

public class Goods {

	//필드
	private String name;
	private int price;
	
	//생성자
	/*오류발생 --> 인자가 있는 생성자가 생성됨으로 기본생성자가 없어짐 --> 기본 생성자를 따로 추가해야함
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	*/
	
	//수정
	public Goods() {
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	
	//메소드 - (g/s)
	public String getName() {
		return name;
	}

	/*오류 발생 --> GoodsApp에서 접근할 수 없느 private 접근제한자이기 때문 --> public으로 변경
	private void setName(String name) {
		this.name = name;
	}
	*/
	
	//수정
	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	//메소드 - 일반
	public void showInfo() {
		System.out.println("상품명:" + name + ", 가격:" + price);
	}
	
}




