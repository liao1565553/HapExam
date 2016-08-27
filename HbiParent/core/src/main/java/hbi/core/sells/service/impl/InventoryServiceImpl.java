package hbi.core.sells.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import hbi.core.sells.dto.Inventory;
import hbi.core.sells.mapper.InventoryMapper;
import hbi.core.sells.service.IInventoryService;


@Service
public class InventoryServiceImpl extends BaseServiceImpl<Inventory> implements IInventoryService{
	@Autowired
	private InventoryMapper inventoryMapper;

	@Override
	public List<Inventory> selectInventory(IRequest requestContext, Inventory inventory, int page, int pagesize) {
		return inventoryMapper.selectByInventory(inventory);
	}
	
	
	
	
}
