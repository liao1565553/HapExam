package hbi.core.sells.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import hbi.core.sells.dto.OrderHeader;
import hbi.core.sells.dto.OrderStatusData;
import hbi.core.sells.dto.ShowOrderMsg;

public interface OrderHeaderMapper extends Mapper<OrderHeader>{
	List<OrderHeader> selectByOrderHeader(OrderHeader orderHeader);
	List<ShowOrderMsg> selectByShowOrderMsg(ShowOrderMsg showOrderMsg);
	/**
	 * 获取订单所有的状态
	 * @return
	 */
	List<OrderStatusData> selectOrderStatus();
	
}
