package JavaKamp.hrms.dataAccess.abstracts;



import org.springframework.data.jpa.repository.JpaRepository;


import JavaKamp.hrms.entities.concretes.Employer;



public interface EmployerDao extends JpaRepository<Employer, Integer>{
	
	Employer findByEmail(String email);
	
}
