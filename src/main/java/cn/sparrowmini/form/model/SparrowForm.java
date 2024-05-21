package cn.sparrowmini.form.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

import cn.sparrowmini.common.BaseOpLog;
import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 表单设计
 */

@Entity
@Table(name = "spr_form")
public class SparrowForm extends BaseForm implements Serializable{
	private static final long serialVersionUID = 1L;

	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	@Id
	@GenericGenerator(name = "id-generator", strategy = "uuid")
	@GeneratedValue(generator = "id-generator")
	private String id;

	public SparrowForm() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
