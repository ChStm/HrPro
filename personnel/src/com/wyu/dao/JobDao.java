package com.wyu.dao;

import static com.wyu.util.common.Constants.JOBTABLE;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import com.wyu.dao.provider.JobDynaSqlProvider;
import com.wyu.domain.Job;

public interface JobDao {
	//查询
		@Select("select * from "+JOBTABLE+" ")
		List<Job> get_List();
		@Select("select * from "+JOBTABLE+" ")
		List<Job> getAllJob();

		@Select("select * from "+JOBTABLE+"  where name like CONCAT('%',#{content},'%')")
		List<Job> get_LikeList(String content);
		
		
		@SelectProvider(type=JobDynaSqlProvider.class,method="insert_Job")
		void insert_Info(Job job);
		
		@Select("select * from "+JOBTABLE+" where job = #{job}")
		Job get_Info(Integer id);

		@SelectProvider(type=JobDynaSqlProvider.class,method="update_Job")
		void update_JobInfo(Job job);

		@Delete(" delete from "+JOBTABLE+" where job = #{job} ")
		void delete_Info(Integer id);
}
