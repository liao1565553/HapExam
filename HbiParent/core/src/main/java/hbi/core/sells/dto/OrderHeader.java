package hbi.core.sells.dto;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.DateTime;

import com.hand.hap.system.dto.BaseDTO;

@Table(name = "hap_om_order_headers")
public class OrderHeader extends BaseDTO {

	/**
	 * 订单头ID HEADER_ID
	 */
	@Id
	@Column
	@GeneratedValue
	private Long headerId;

	/**
	 * 订单编号 ORDER_NUMBER
	 */
	@Column
	@NotEmpty
	private String orderNumber;

	/**
	 * 公司ID COMPANY_ID
	 */
	@Column
	@NotNull
	private Long companyId;

	/**
	 * 订单日期 ORDER_DATE
	 */
	@Column
	@NotNull
	private Date orderDate;

	/**
	 * 客户ID CUSTOMER_ID
	 */
	@Column
	@NotNull
	private Long customerId;

	/**
	 * 订单状态 ORDER_STATUS
	 */
	@Column
	@NotEmpty
	private String orderStatus;

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Long getHeaderId() {
		return headerId;
	}

	public void setHeaderId(Long headerId) {
		this.headerId = headerId;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

}
