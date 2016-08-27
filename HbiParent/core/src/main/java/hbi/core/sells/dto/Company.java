package hbi.core.sells.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

import com.hand.hap.system.dto.BaseDTO;

@SuppressWarnings("serial")
@Table(name = "hap_org_companys")
public class Company extends BaseDTO {

	/**
	 * 公司ID COMPANY_ID
	 */
	@Id
	@Column
	@GeneratedValue
	private Long companyId;

	/**
	 * 公司编号 COMPANY_NUMBER
	 */
	@Column
	@NotEmpty
	private String companyNumber;

	/**
	 * 公司名称 COMPANY_NAME
	 */
	@Column
	@NotEmpty
	private String companyName;

	/**
	 * 启用标志
	 */
	@Column
	private String enabledFlag;

	public Long getCompany() {
		return companyId;
	}

	public void setCompany(Long companyId) {
		this.companyId = companyId;
	}

	public String getCompanyNumber() {
		return companyNumber;
	}

	public void setCompanyNumber(String companyNumber) {
		this.companyNumber = companyNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEnabledFlag() {
		return enabledFlag;
	}

	public void setEnabledFlag(String enabledFlag) {
		this.enabledFlag = enabledFlag;
	}

}
