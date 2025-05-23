package com.dao;

import com.entity.GangweishenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GangweishenqingVO;
import com.entity.view.GangweishenqingView;


/**
 * 岗位申请
 * 
 * @author 
 * @email 
 * @date 2025-04-25 16:06:21
 */
public interface GangweishenqingDao extends BaseMapper<GangweishenqingEntity> {
	
	List<GangweishenqingVO> selectListVO(@Param("ew") Wrapper<GangweishenqingEntity> wrapper);
	
	GangweishenqingVO selectVO(@Param("ew") Wrapper<GangweishenqingEntity> wrapper);
	
	List<GangweishenqingView> selectListView(@Param("ew") Wrapper<GangweishenqingEntity> wrapper);

	List<GangweishenqingView> selectListView(Pagination page,@Param("ew") Wrapper<GangweishenqingEntity> wrapper);

	
	GangweishenqingView selectView(@Param("ew") Wrapper<GangweishenqingEntity> wrapper);
	

}
