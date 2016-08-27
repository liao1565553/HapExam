package hbi.core.sells.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import hbi.core.sells.dto.Company;
import hbi.core.sells.mapper.CompanyMapper;
import hbi.core.sells.service.ICompanyService;

@Service
public class CompanyServiceImpl extends BaseServiceImpl<Company>implements ICompanyService {
	@Autowired
	private CompanyMapper companyMapper;

	@Override
	public List<Company> selectAllCompany(IRequest requestContext, Company company, int page, int pagesize) {
		return companyMapper.selectByCompany(company);
	}

}
