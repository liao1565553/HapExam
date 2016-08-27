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
public class Inventory extends BaseDTO{
	@Id
	@Column
	@GeneratedValue
	private Long inventoryItemsId;

	/**
	 * 物料编码
	 */
	@Column
	@NotEmpty
	private String itemCode;

	/**
	 * 物料单位
	 */
	@Column
	@NotEmpty
	private String itemUom;

	/**
	 * 物料描述 ITEM_DESCRIPTION
	 */
	@Column
	@NotNull
	private Long itemDescription;

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

	public Long getInventoryItemsId() {
		return inventoryItemsId;
	}

	public void setInventoryItemsId(Long inventoryItemsId) {
		this.inventoryItemsId = inventoryItemsId;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemUom() {
		return itemUom;
	}

	public void setItemUom(String itemUom) {
		this.itemUom = itemUom;
	}

	public Long getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(Long itemDescription) {
		this.itemDescription = itemDescription;
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
