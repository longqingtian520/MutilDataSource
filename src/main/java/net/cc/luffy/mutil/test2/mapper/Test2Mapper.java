package net.cc.luffy.mutil.test2.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface Test2Mapper {

	@Select("select mobile_Type from UCARE_AGENTS_INFO where imei =#{imei}")
	public String getMoBileTypeByImei(@Param("imei") String imei);
}
