package com.wyu.dao.provider;

import org.apache.ibatis.jdbc.SQL;
import static com.wyu.util.common.Constants.DEPTTABLE;

import com.wyu.domain.Dept;

public class DeptDynaSqlProvider {
	
	// 动态插入
		public String insert_Dept(Dept dept){
			
			return new SQL(){
				{
					INSERT_INTO(DEPTTABLE);
					if(dept.getDname() != null && !dept.getDname().equals("")){
						VALUES("dname", "#{dname}");
					}
					if(dept.getDremark() != null && !dept.getDremark().equals("")){
						VALUES("dremark", "#{dremark}");
					}
				}

			}.toString();
		}	
		// 动态更新
		public String update_Dept(Dept dept){
			
			return new SQL(){
				{
					UPDATE(DEPTTABLE);
					if(dept.getDname()!= null){
						SET(" name = #{name} ");
					}
					if(dept.getDremark() != null){
						SET(" remark = #{remark} ");
					}
					WHERE("did = #{did} ");
				}
			}.toString();
		}
}
