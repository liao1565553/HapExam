package hbi.core.sells.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;

import hbi.core.sells.dto.Company;
import hbi.core.sells.service.ICompanyService;

@Controller
public class CompanyController extends BaseController{
	
	@Autowired
	private ICompanyService companyService;
	
	
	@RequestMapping(value = "/sells/getCompany")
	@ResponseBody
	public ResponseData getCompany(Company company, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
			@RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
		IRequest requestContext = createRequestContext(request);
		return new ResponseData(companyService.selectAllCompany(requestContext,company, page, pagesize));
	}
	
}
