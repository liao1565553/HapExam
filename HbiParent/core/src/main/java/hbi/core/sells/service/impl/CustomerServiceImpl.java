package hbi.core.sells.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import hbi.core.sells.dto.Customer;
import hbi.core.sells.mapper.CustomerMapper;
import hbi.core.sells.service.ICustomerService;

@Service
public class CustomerServiceImpl extends BaseServiceImpl<Customer> implements ICustomerService{

	@Autowired
	private CustomerMapper customerMapper;
	@Override
	public List<Customer> selectByCustomer(IRequest requestContext,Customer customer, int page, int pagesize) {
		return customerMapper.selectByCustomer(customer);
	}
	
}
