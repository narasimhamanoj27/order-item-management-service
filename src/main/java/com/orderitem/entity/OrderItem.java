package com.orderitem.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "orderitem")
public class OrderItem implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column
	@NotNull
	private String productCode;
	@Column
	@NotNull
	private String productName;
	@Column
	@NotNull
	private int Quantity;
	@Column
	@NotNull
	private Integer customerId;
	
	public OrderItem() {
	}
	
	public OrderItem(@NotNull Integer customerId, @NotNull String productCode, @NotNull String productName,
			@NotNull int quantity) {
		super();
		this.customerId = customerId;
		this.productCode = productCode;
		this.productName = productName;
		Quantity = quantity;
	}
	/**
	 * @return the customerId
	 */
	public Integer getCustomerId() {
		return customerId;
	}
	/**
	 * @param customerid the customerId to set
	 */
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	/**
	 * @return the productCode
	 */
	public String getProductCode() {
		return productCode;
	}
	/**
	 * @param productCode the productCode to set
	 */
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return Quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	
}
