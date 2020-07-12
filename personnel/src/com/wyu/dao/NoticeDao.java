package com.wyu.dao;

import static com.wyu.util.common.Constants.NOTICETABLE;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import com.wyu.dao.provider.NoticeDynaSqlProvider;
import com.wyu.domain.Notice;

public interface NoticeDao {

	@Select("select * from "+NOTICETABLE+" ")
	List<Notice> get_List();
	@Select("select * from "+NOTICETABLE+"  where title like CONCAT('%',#{content},'%')")
	List<Notice> get_LikeList(String content);

	@SelectProvider(type=NoticeDynaSqlProvider.class,method="insert_Notice")
	void insert_Info(Notice notice);
	
	@Select("select * from "+NOTICETABLE+" where id = #{id}")
	Notice get_Info(Integer id);

	@SelectProvider(type=NoticeDynaSqlProvider.class,method="update_Notice")
	void update_NoticeInfo(Notice notice);

	@Delete(" delete from "+NOTICETABLE+" where id = #{id} ")
	void delete_Info(Integer id);

}
