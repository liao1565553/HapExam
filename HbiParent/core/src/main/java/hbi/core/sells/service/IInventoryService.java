package hbi.core.sells.service;

import java.util.List;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;

import hbi.core.sells.dto.Inventory;

public interface IInventoryService extends IBaseService<Inventory>,ProxySelf<IInventoryService>{
	List<Inventory> selectInventory(IRequest requestContext,Inventory inventory, int page, int pagesize);
}
