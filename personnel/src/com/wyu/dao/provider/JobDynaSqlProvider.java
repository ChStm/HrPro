package com.wyu.dao.provider;

import static com.wyu.util.common.Constants.JOBTABLE;

import org.apache.ibatis.jdbc.SQL;

import com.wyu.domain.Job;

public class JobDynaSqlProvider {
	// 动态插入
			public String insert_Job(Job job){
				
				return new SQL(){
					{
						INSERT_INTO(JOBTABLE);
						if(job.getJname() != null && !job.getJname().equals("")){
							VALUES("name", "#{name}");
						}
						if(job.getJremark() != null && !job.getJremark().equals("")){
							VALUES("jremark", "#{jremark}");
						}
					}
				}.toString();
			}	
			// 动态更新
			public String update_Job(Job job){
				
				return new SQL(){
					{
						UPDATE(JOBTABLE);
						if(job.getJname() != null){
							SET(" name = #{name} ");
						}
						if(job.getJremark() != null){
							SET("jremark = #{jremark} ");
						}
						WHERE("job = #{job} ");
					}
				}.toString();
			}
}
