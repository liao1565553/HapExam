package hbi.core.sells.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import hbi.core.sells.dto.Customer;

public interface CustomerMapper extends Mapper<Customer>{
	List<Customer> selectByCustomer(Customer customer);
}
