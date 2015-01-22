package demo.entity;

import java.io.Serializable;

/**
 * 用户信息
 */
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	/** 主键ID */
	private Long id;

	/** 年龄 */
	private Integer age;

	/** 姓名 */
	private String name;


	public void setId( Long id ) {
		this.id = id;
	}


	public Long getId() {
		return this.id;
	}


	public void setAge( Integer age ) {
		this.age = age;
	}


	public Integer getAge() {
		return this.age;
	}


	public void setName( String name ) {
		this.name = name;
	}


	public String getName() {
		return this.name;
	}

}
