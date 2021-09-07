package com.study.spring.case02;

public class Size {
	private Integer id;
	private String name;
	public Size() {
		
	}
	public Size(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Size [id=" + id + ", name=" + name + "]";
	}
	
}
