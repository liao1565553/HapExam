package hbi.core.sells.dto;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Table;

import com.hand.hap.system.dto.BaseDTO;


@SuppressWarnings("serial")
@Table(name="hap_om_order_lines")
public class OrderLine extends BaseDTO{
	 private Long lineId;

	    private Long headerId;

	    private Long lineNumber;

	    private Long inventoryItemId;

	    private Long orderdQuantity;

	    private String orderQuantityUom;

	    private Long unitSellingPrice;

	    private String description;

	    private Long companyId;

	    private String addition1;

	    private String addition2;

	    private String addition3;

	    private String addition4;

	    private String addition5;

	    private Long objectVersionNumber;

	    private Long requestId;

	    private Long programId;

	    private Date creationDate;

	    private Long createdBy;

	    private Long lastUpdatedBy;

	    private Date lastUpdateDate;

	    private Long lastUpdateLogin;

	    private String attributeCategory;

		public Long getLineId() {
			return lineId;
		}

		public void setLineId(Long lineId) {
			this.lineId = lineId;
		}

		public Long getHeaderId() {
			return headerId;
		}

		public void setHeaderId(Long headerId) {
			this.headerId = headerId;
		}

		public Long getLineNumber() {
			return lineNumber;
		}

		public void setLineNumber(Long lineNumber) {
			this.lineNumber = lineNumber;
		}

		public Long getInventoryItemId() {
			return inventoryItemId;
		}

		public void setInventoryItemId(Long inventoryItemId) {
			this.inventoryItemId = inventoryItemId;
		}

		public Long getOrderdQuantity() {
			return orderdQuantity;
		}

		public void setOrderdQuantity(Long orderdQuantity) {
			this.orderdQuantity = orderdQuantity;
		}

		public String getOrderQuantityUom() {
			return orderQuantityUom;
		}

		public void setOrderQuantityUom(String orderQuantityUom) {
			this.orderQuantityUom = orderQuantityUom;
		}

		public Long getUnitSellingPrice() {
			return unitSellingPrice;
		}

		public void setUnitSellingPrice(Long unitSellingPrice) {
			this.unitSellingPrice = unitSellingPrice;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getCompanyId() {
			return companyId;
		}

		public void setCompanyId(Long companyId) {
			this.companyId = companyId;
		}

		public String getAddition1() {
			return addition1;
		}

		public void setAddition1(String addition1) {
			this.addition1 = addition1;
		}

		public String getAddition2() {
			return addition2;
		}

		public void setAddition2(String addition2) {
			this.addition2 = addition2;
		}

		public String getAddition3() {
			return addition3;
		}

		public void setAddition3(String addition3) {
			this.addition3 = addition3;
		}

		public String getAddition4() {
			return addition4;
		}

		public void setAddition4(String addition4) {
			this.addition4 = addition4;
		}

		public String getAddition5() {
			return addition5;
		}

		public void setAddition5(String addition5) {
			this.addition5 = addition5;
		}

		public Long getObjectVersionNumber() {
			return objectVersionNumber;
		}

		public void setObjectVersionNumber(Long objectVersionNumber) {
			this.objectVersionNumber = objectVersionNumber;
		}

		public Long getRequestId() {
			return requestId;
		}

		public void setRequestId(Long requestId) {
			this.requestId = requestId;
		}

		public Long getProgramId() {
			return programId;
		}

		public void setProgramId(Long programId) {
			this.programId = programId;
		}

		public Date getCreationDate() {
			return creationDate;
		}

		public void setCreationDate(Date creationDate) {
			this.creationDate = creationDate;
		}

		public Long getCreatedBy() {
			return createdBy;
		}

		public void setCreatedBy(Long createdBy) {
			this.createdBy = createdBy;
		}

		public Long getLastUpdatedBy() {
			return lastUpdatedBy;
		}

		public void setLastUpdatedBy(Long lastUpdatedBy) {
			this.lastUpdatedBy = lastUpdatedBy;
		}

		public Date getLastUpdateDate() {
			return lastUpdateDate;
		}

		public void setLastUpdateDate(Date lastUpdateDate) {
			this.lastUpdateDate = lastUpdateDate;
		}

		public Long getLastUpdateLogin() {
			return lastUpdateLogin;
		}

		public void setLastUpdateLogin(Long lastUpdateLogin) {
			this.lastUpdateLogin = lastUpdateLogin;
		}

		public String getAttributeCategory() {
			return attributeCategory;
		}

		public void setAttributeCategory(String attributeCategory) {
			this.attributeCategory = attributeCategory;
		}
	    
}
