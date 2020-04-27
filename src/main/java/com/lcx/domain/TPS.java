package com.lcx.domain;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

public class TPS {
	private BigInteger id;
	
	private String name;
	
	private Integer age;
	
	private BigDecimal money;
	
	private Date created;

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public BigDecimal getMoney() {
		return money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public TPS(BigInteger id, String name, Integer age, BigDecimal money, Date created) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.money = money;
		this.created = created;
	}

	public TPS() {
		super();
	}

	@Override
	public String toString() {
		return "TPS [id=" + id + ", name=" + name + ", age=" + age + ", money=" + money + ", created=" + created + "]";
	}
	
	
}
