package com.mybatisPlus.mp.bean;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableLogic;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author BJQ
 * @since 2020-05-22
 */
/*@TableName("tbl_user")*/
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String name;
    
    @TableLogic   // 逻辑删除属性
	private Integer logicFlag ;
    
    
    public User() {
		super();
		// TODO Auto-generated constructor stub
	}
    


    public User(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
    
    

    public Integer getLogicFlag() {
		return logicFlag;
	}



	public void setLogicFlag(Integer logicFlag) {
		this.logicFlag = logicFlag;
	}



	@Override
    public String toString() {
        return "User{" +
        ", id=" + id +
        ", name=" + name +
        "}";
    }
}
