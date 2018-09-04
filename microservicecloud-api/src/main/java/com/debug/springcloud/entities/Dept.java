package com.debug.springcloud.entities;

import java.io.Serializable;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@SuppressWarnings("serial") 
@AllArgsConstructor //是有有参构造函数
@NoArgsConstructor  //使用无参构造函数
@Data
public  class Dept implements Serializable{
	private Long deptno;//组件
	private String dname;//部门名称
	

	private String db_source;//数据库
	
	public static void main(String[] args) {
		Dept dept = new Dept();
		dept.setDname("中国平安");
		System.out.println("dName : " +dept.getDname());
		
	}
	// 你那哪是混日子哈，那就是闯事业呢
	
}
