package com.wyu.dao;

import static com.wyu.util.common.Constants.USERTABLE;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import com.wyu.dao.provider.UserDynaSqlProvider;
import com.wyu.domain.User;

public interface UserDao {

	@Select("select * from "+USERTABLE+" ")
	List<User> get_List();
	@Select("select * from "+USERTABLE+"  where username like CONCAT('%',#{content},'%')")
	List<User> get_LikeList(String content);

	@Select("select * from "+USERTABLE+"  where username = #{username} AND password = #{password}")
	User get_login(@Param("username") String username, @Param("password") String password);
	
	@SelectProvider(type=UserDynaSqlProvider.class,method="insert_User")
	void insert_Info(User user);
	
	@Select("select * from "+USERTABLE+" where number = #{number}")
	User get_Info(Integer user_id);

	@SelectProvider(type=UserDynaSqlProvider.class,method="update_User")
	void update_UserInfo(User user);

	@Delete(" delete from "+USERTABLE+" where number = #{number} ")
	void delete_Info(Integer user_id);

	@Select("select count(*) from "+USERTABLE+" where number = #{number}")
	User get_count(@Param("count") Integer count);

}
