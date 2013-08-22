package cn.amumu.spring.dao;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;

public class BaseDaoImpl implements BaseDao {

	@Resource
	protected SqlSessionTemplate sqlSession;

}
