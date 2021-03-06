package JavaKamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import JavaKamp.hrms.business.abstracts.SystemEmployeeService;
import JavaKamp.hrms.core.utilities.results.DataResult;
import JavaKamp.hrms.core.utilities.results.Result;
import JavaKamp.hrms.core.utilities.results.SuccessDataResult;
import JavaKamp.hrms.core.utilities.results.SuccessResult;
import JavaKamp.hrms.dataAccess.abstracts.SystemEmployeeDao;
import JavaKamp.hrms.entities.concretes.SystemEmployee;

@Service
public class SystemEmployeeManager implements SystemEmployeeService{
	
	private SystemEmployeeDao systemEmployeeDao;
	@Autowired
	public SystemEmployeeManager(SystemEmployeeDao systemEmployeeDao) {
		super();
		this.systemEmployeeDao = systemEmployeeDao;
	}

	@Override
	public DataResult<List<SystemEmployee>> getAll() {
		
		return new SuccessDataResult<List<SystemEmployee>>(this.systemEmployeeDao.findAll(),"employee listelendi");
				
	}

	@Override
	public Result add(SystemEmployee employee) {
		this.systemEmployeeDao.save(employee);
		return new SuccessResult ("Employee Added !");
	}

	@Override
	public Result update(SystemEmployee employee) {
		this.systemEmployeeDao.save(employee);
		return new SuccessResult ("Employee updated !");
	}

	@Override
	public Result delete(SystemEmployee employee) {
		this.systemEmployeeDao.delete(employee);
		return new SuccessResult ("Employee deleted !");
	}

}
