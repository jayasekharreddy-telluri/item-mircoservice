package com.jai.springboot.dto;

import java.math.BigDecimal;

public class Voucher {

	private Long id;
	private String code;
	private BigDecimal discount;
	private String exp_date;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public BigDecimal getDiscount() {
		return discount;
	}
	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}
	
	public String getExp_date() {
		return exp_date;
	}
	public void setExp_date(String exp_date) {
		this.exp_date = exp_date;
	}
	@Override
	public String toString() {
		return "Voucher [id=" + id + ", code=" + code + ", discount=" + discount + ", exp_date=" + exp_date + "]";
	}
	

}
