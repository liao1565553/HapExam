package hbi.core.sells.dto;

import com.hand.hap.system.dto.BaseDTO;

public class OrderStatusData extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6220909785207762497L;

	/**
	 * 状态
	 */
	private String orderValue;

	/**
	 * 状态值
	 */
	private String orderMeaning;

	public String getOrderValue() {
		return orderValue;
	}

	public void setOrderValue(String orderValue) {
		this.orderValue = orderValue;
	}

	public String getOrderMeaning() {
		return orderMeaning;
	}

	public void setOrderMeaning(String orderMeaning) {
		this.orderMeaning = orderMeaning;
	}

}
