package hbi.core.sells.service;

import java.util.List;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;

import hbi.core.sells.dto.OrderHeader;
import hbi.core.sells.dto.ShowOrderMsg;

public interface IOrderHeaderService extends IBaseService<OrderHeader>,ProxySelf<IOrderHeaderService>{
	public List<ShowOrderMsg> selectByShowOrderMsg(IRequest requestContext, ShowOrderMsg showOrderMsg, int page, int pagesize);
}
