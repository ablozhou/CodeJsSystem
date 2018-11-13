/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.js.entity;

import org.hibernate.validator.constraints.Length;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * jsUserEntity
 * @author jo
 * @version 2018-11-05
 */
@Table(name="${_prefix}user", alias="a", columns={
		@Column(name="id", attrName="id", label="不能为空", isPK=true),
		@Column(name="name", attrName="name", label="不能为空", queryType=QueryType.LIKE),
		@Column(name="sex", attrName="sex", label="性别"),
		@Column(name="rank", attrName="rank", label="rank"),
		@Column(name="team_id", attrName="teamId", label="team_id"),
		@Column(includeEntity=DataEntity.class),
	}, orderBy="a.update_date DESC"
)
public class JsUser extends DataEntity<JsUser> {
	
	private static final long serialVersionUID = 1L;
	private String name;		// 不能为空
	private String sex;		// 性别
	private Integer rank;		// rank
	private String teamId;		// team_id
	
	public JsUser() {
		this(null);
	}

	public JsUser(String id){
		super(id);
	}
	
	@Length(min=0, max=20, message="不能为空长度不能超过 20 个字符")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Length(min=0, max=2, message="性别长度不能超过 2 个字符")
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}
	
	@Length(min=0, max=32, message="team_id长度不能超过 32 个字符")
	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}
	
}