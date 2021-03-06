package cn.homeron.homerfast.biz.bean;


import cn.homeron.homerfast.common.bean.BaseBean;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 
 * @author Homer
 *
 * 创建一个实体类。
 * 
 * 如何持久化呢？
 * 
 * 1、使用@Entity进行实体类的持久化操作，当JPA检测到我们的实体类当中有
 * @Entity 注解的时候，会在数据库中生成对应的表结构信息
 * 
 * 如何指定主键以及主键的生成策略？
 * 2、使用@Id指定主键
 *
 */

@Data
@Table(name = "CAT")
@Entity
public class CatBean extends BaseBean {

	@NotBlank(message = "名字不能为空")
	@ApiModelProperty(value = "名字")
	private String catName;

	@NotNull
	@Min(value = 0, message = "年龄必须大于等于0")
	@ApiModelProperty(value = "年龄")
	private int catAge;

}
