package hbi.core.sells.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import hbi.core.sells.dto.Company;

public interface CompanyMapper extends Mapper<Company>{
	 List<Company> selectByCompany(Company company);
}
