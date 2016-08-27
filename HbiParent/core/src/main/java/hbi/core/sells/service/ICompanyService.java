package hbi.core.sells.service;

import java.util.List;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;

import hbi.core.sells.dto.Company;

public interface ICompanyService  extends IBaseService<Company>,ProxySelf<ICompanyService>{
	public List<Company> selectAllCompany(IRequest requestContext,Company company, int page, int pagesize);
}