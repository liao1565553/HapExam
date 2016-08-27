package hbi.core.sells.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import hbi.core.sells.dto.OrderHeader;
import hbi.core.sells.dto.ShowOrderMsg;
import hbi.core.sells.mapper.OrderHeaderMapper;
import hbi.core.sells.service.IOrderHeaderService;

@Service
public class OrderHeaderServiceImpl extends BaseServiceImpl<OrderHeader> implements IOrderHeaderService{

	@Autowired
	private OrderHeaderMapper orderHeaderMapper;

	@Override
	public List<ShowOrderMsg> selectByShowOrderMsg(IRequest requestContext, ShowOrderMsg showOrderMsg, int page,
			int pagesize) {
		return orderHeaderMapper.selectByShowOrderMsg(showOrderMsg);
	}
}
