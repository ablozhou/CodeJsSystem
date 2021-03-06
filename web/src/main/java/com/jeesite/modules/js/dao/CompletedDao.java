/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.js.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.jeesite.modules.js.entity.Completed;

/**
 * js_completedDAO接口
 * @author jo
 * @version 2018-12-13
 */
@MyBatisDao
public interface CompletedDao extends CrudDao<Completed> {
	
}