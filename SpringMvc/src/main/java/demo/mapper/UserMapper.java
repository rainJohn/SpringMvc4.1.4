package demo.mapper;

import org.apache.ibatis.annotations.Param;

import demo.entity.User;

/**
 * UserMapper数据库操作接口类
 */
public interface UserMapper {


	/**
	 * 查询（根据主键ID查询）
	 */
	User selectById( @Param("id") Long id );


	/**
	 * 删除（根据主键ID删除）
	 */
	int deleteById( @Param("id") Long id );


	/**
	 * 添加
	 */
	int insert( User record );


	/**
	 * 添加 （匹配有值的字段）
	 */
	int insertSelective( User record );


	/**
	 * 修改 （匹配有值的字段）
	 */
	int updateByIdSelective( User record );


	/**
	 * 修改（根据主键ID修改）
	 */
	int updateById( User record );

}