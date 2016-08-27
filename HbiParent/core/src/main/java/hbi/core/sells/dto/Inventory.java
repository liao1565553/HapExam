package hbi.core.sells.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.hand.hap.system.dto.BaseDTO;

@SuppressWarnings("serial")

@Table(name = "hap_inv_inventory_items")
public class Inventory extends BaseDTO {
	@Id
	@Column
	@GeneratedValue
	private Long inventoryId;

	/**
	 * 物料编码 ITEM_CODE
	 */
	@Column
	@NotEmpty
	private String inventoryCode;

	/**
	 * 物料单位 ITEM_UOM
	 */
	@Column
	@NotEmpty
	private String inventoryUom;

	/**
	 * 物料描述 ITEM_DESCRIPTION
	 */
	@Column
	@NotNull
	private String inventoryDescription;

	/**
	 * 是否能用于销售 ORDER_FLAG
	 */
	@Column
	private String orderFlag;

	/**
	 * 启用标志
	 */
	@Column
	private String enabledFlag;

	public Long getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(Long inventoryId) {
		this.inventoryId = inventoryId;
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

	public String getInventoryDescription() {
		return inventoryDescription;
	}

	public void setInventoryDescription(String inventoryDescription) {
		this.inventoryDescription = inventoryDescription;
	}

	public String getOrderFlag() {
		return orderFlag;
	}

	public void setOrderFlag(String orderFlag) {
		this.orderFlag = orderFlag;
	}

	public String getEnabledFlag() {
		return enabledFlag;
	}

	public void setEnabledFlag(String enabledFlag) {
		this.enabledFlag = enabledFlag;
	}

}
