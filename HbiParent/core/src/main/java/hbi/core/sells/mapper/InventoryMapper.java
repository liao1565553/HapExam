package hbi.core.sells.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import hbi.core.sells.dto.Inventory;

public interface InventoryMapper extends Mapper<Inventory>{
	List<Inventory> selectByInventory(Inventory inventory);
}
