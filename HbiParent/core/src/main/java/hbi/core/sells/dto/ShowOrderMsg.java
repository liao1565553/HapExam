package hbi.core.sells.dto;

import java.sql.Date;
import java.util.List;

import com.hand.hap.system.dto.BaseDTO;

@SuppressWarnings("serial")
public class ShowOrderMsg extends BaseDTO {
	/**
	 * 订单编号 ORDER_NUMBER
	 */
	private String orderNumber;

	/**
	 * 公司Id
	 */
	private Long companyId;
	/**
	 * 公司编号 COMPANY_NUMBER
	 */
	private String companyNumber;

	/**
	 * 公司名称 COMPANY_NAME
	 */
	private String companyName;

	/**
	 * 客户编号 CUSTOMER_NUMBER
	 */
	private String customerNumber;

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
	 * 订单状态集合
	 */
	private List<String> orderStatusData;

	/**
	 * 订单金额
	 */
	private Integer orderAmount;

	/**
	 * 物料编码 ITEM_CODE
	 */
	private String inventoryCode;

	/**
	 * 物料单位 ITEM_UOM
	 * 
	 * @return
	 */
	private String inventoryUom;

	public List<String> getOrderStatusData() {
		return orderStatusData;
	}

	public void setOrderStatusData(List<String> orderStatusData) {
		this.orderStatusData = orderStatusData;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getCompanyNumber() {
		return companyNumber;
	}

	public void setCompanyNumber(String companyNumber) {
		this.companyNumber = companyNumber;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getInventoryCode() {
		return inventoryCode;
	}

	public void setInventoryCode(String inventoryCode) {
		this.inventoryCode = inventoryCode;
	}

	public String getInventoryUom() {
		return inventoryUom;
	}

	public void setInventoryUom(String inventoryUom) {
		this.inventoryUom = inventoryUom;
	}

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
