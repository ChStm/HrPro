package com.wyu.dao.provider;

import static com.wyu.util.common.Constants.USERTABLE;

import org.apache.ibatis.jdbc.SQL;

import com.wyu.domain.User;

public class UserDynaSqlProvider {
			// 动态插入
			public String insert_User(User user){
				
				return new SQL(){
					{
						INSERT_INTO(USERTABLE);
						if(user.getPassword()!=null){
							VALUES("password","#{password}");
						}
						if(user.getUsername()!=null){
							VALUES("username","#{username}");
						}
					}
				}.toString();
			}	
			// 动态更新
			public String update_User(User user){
				
				return new SQL(){
					{
						UPDATE(USERTABLE);
						if(user.getPassword()!=null){
							SET("password = #{password}");
						}
						if(user.getUsername()!=null){
							SET("username = #{username}");
						}
						WHERE("number = #{number}");
					}
				}.toString();
			}
}
