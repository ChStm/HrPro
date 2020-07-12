package com.wyu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import com.wyu.dao.provider.EmployeeDynaSqlProvider;
import com.wyu.domain.Employee;

import static com.wyu.util.common.Constants.*;

public interface EmployeeDao {
	/**
	 * 
	 * @return
	 */
	//查询
			@Select("select * from "+EMPLOYEETABLE+" ")
			List<Employee> get_List();
        	@Select("select * from "+EMPLOYEETABLE+" ")
	         List<Employee> selectAllEmployee();
	        List<Employee> getAllEmployee();

			@Select("select * from "+EMPLOYEETABLE+"  where name like CONCAT('%',#{content},'%')")
			List<Employee> get_LikeList(String content);
	        List<Employee> selectLikeAllEmployee(String content);
			
			
			@SelectProvider(type=EmployeeDynaSqlProvider.class,method="insert_Employee")
			void insert_Info(Employee employee);
			
			@Select("select * from "+EMPLOYEETABLE+" where emp_id = #{id}")
			Employee get_Info(Integer id);

			@SelectProvider(type=EmployeeDynaSqlProvider.class,method="update_Employee")
			void update_Info(Employee employee);

			@Delete(" delete from "+EMPLOYEETABLE+" where emp_id = #{id}")
			void delete_EmployeeInfo(Integer id);
}
