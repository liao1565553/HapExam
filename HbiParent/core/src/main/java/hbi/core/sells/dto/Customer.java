package hbi.core.sells.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.hand.hap.system.dto.BaseDTO;

@SuppressWarnings("serial")
@Table(name = "hap_ar_customers")
public class Customer extends BaseDTO{
	@Id
	@Column
	@GeneratedValue
	private Long customerId;

	@Column
	@NotEmpty
	private String customerNumber;

	/**
	 * 客户名称 CUSTOMER_NAME
	 */
	@Column
	@NotEmpty
	private String customerName;

	/**
	 * 公司id
	 */
	@Column
	@NotNull
	private Long companyId;
	

	/**
	 * 启用标志
	 */
	@Column
	private String enabledFlag;

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getEnabledFlag() {
		return enabledFlag;
	}

	public void setEnabledFlag(String enabledFlag) {
		this.enabledFlag = enabledFlag;
	}

}
