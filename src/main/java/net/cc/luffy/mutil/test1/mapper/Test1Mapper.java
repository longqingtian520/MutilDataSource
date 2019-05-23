package net.cc.luffy.mutil.test1.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface Test1Mapper {

	@Select("select uid from device_on_off where id = #{id}")
	public String getUidById(@Param("id") int id);
}
