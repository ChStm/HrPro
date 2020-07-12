package com.wyu.dao.provider;

import static com.wyu.util.common.Constants.EMPLOYEETABLE;

import org.apache.ibatis.jdbc.SQL;

import com.wyu.domain.Employee;

public class EmployeeDynaSqlProvider {
			// 动态插入
			public String insert_Employee(Employee employee){
				
				return new SQL(){
					{
						INSERT_INTO(EMPLOYEETABLE);
						if(employee.getName() != null ){
							VALUES("name", "#{name}");
						}
						if(employee.getCardId()!=null){
							VALUES("card_id","#{card_id}");
						}
						if(employee.getAddress()!=null){
							VALUES("address","#{address}");
						}
						if(employee.getPostCode()!=null){
							VALUES("post_code","#{post_code}");
						}
						if(employee.getTel()!=null){
							VALUES("tel","#{tel}");
						}
						if(employee.getPhone()!=null){
							VALUES("phone","#{phone}");
						}
						if(employee.getQqNum()!=null){
							VALUES("qq_nul","#{qq_num}");
						}
						if(employee.getEmail()!=null){
							VALUES("email","#{email}");
						}
						if(employee.getSex()!=null){
							VALUES("sex","#{sex}");
						}
						if(employee.getParty()!=null){
							VALUES("party","#{party}");
						}
						if(employee.getBirthday()!=null){
							VALUES("birthday","#{birthday}");
						}
						if(employee.getRace()!=null){
							VALUES("race","#{race}");
						}
						if(employee.getEducation()!=null){
							VALUES("education","#{education}");
						}
						if(employee.getSpeciality()!=null){
							VALUES("speciality","#{speciality}");
						}
						if(employee.getHobby()!=null){
							VALUES("hobby","#{hobby}");
						}
						if(employee.getRemark()!=null){
							VALUES("remark","#{remark}");
						}
						if(employee.getCreateDate()!=null){
							VALUES("create_date","#{create_date}");
						}
						if(employee.getDeptId()!=null){
							VALUES("dept_id","#{dept_id}");
						}
						if(employee.getEmp_id()!=null){
							VALUES("job_id","#{job_id}");
						}
					}
				}.toString();
			}	
			// 动态更新
			public String update_Employee(Employee employee){
				
				return new SQL(){
					{
						UPDATE(EMPLOYEETABLE);
						if(employee.getName() != null ){
							SET("name = #{name}");
						}
						if(employee.getCardId()!=null){
							SET("card_id = #{card_id}");
						}
						if(employee.getAddress()!=null){
							SET("address = #{address}");
						}
						if(employee.getPostCode()!=null){
							SET("post_code = #{post_code}");
						}
						if(employee.getTel()!=null){
							SET("tel = #{tel}");
						}
						if(employee.getPhone()!=null){
							SET("phone = #{phone}");
						}
						if(employee.getQqNum()!=null){
							SET("qq_nul = #{qq_num}");
						}
						if(employee.getEmail()!=null){
							SET("email = #{email}");
						}
						if(employee.getSex()!=null){
							SET("sex = #{sex}");
						}
						if(employee.getParty()!=null){
							SET("party = #{party}");
						}
						if(employee.getBirthday()!=null){
							SET("birthday = #{birthday}");
						}
						if(employee.getRace()!=null){
							SET("race = #{race}");
						}
						if(employee.getEducation()!=null){
							SET("education = #{education}");
						}
						if(employee.getSpeciality()!=null){
							SET("speciality = #{speciality}");
						}
						if(employee.getHobby()!=null){
							SET("hobby = #{hobby}");
						}
						if(employee.getRemark()!=null){
							SET("remark = #{remark}");
						}
						if(employee.getCreateDate()!=null){
							SET("create_date = #{create_date}");
						}
						if(employee.getDeptId()!=null){
							SET("dept_id = #{dept_id}");
						}
						if(employee.getJobId()!=null){
							SET("job_id = #{job_id}");
						}
						
						WHERE(" emp_id = #{id} ");
					}
				}.toString();
			}
}
