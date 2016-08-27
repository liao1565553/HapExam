package hbi.core.sells.dto;

import java.sql.Date;

import com.hand.hap.system.dto.BaseDTO;

@SuppressWarnings("serial")
public class ShowOrderMsg extends BaseDTO {
	/**
	 * 订单编号 ORDER_NUMBER
	 */
	private String orderNumber;

	/**
	 * 公司名称 COMPANY_NAME
	 */
	private String companyName;

	/**
	 * 客户名称 CUSTOMER_NAME
	 */
	private String customerName;

	/**
	 * 订单日期 ORDER_DATE
	 */
	private Date orderDate;

	/**
	 * 订单状态 ORDER_STATUS
	 */
	private String orderStatus;

	/**
	 * 订单金额
	 */
	private Integer orderAmount;

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Integer getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Integer orderAmount) {
		this.orderAmount = orderAmount;
	}

}
