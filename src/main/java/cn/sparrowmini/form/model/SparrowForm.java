package cn.sparrowmini.form.model;

import java.io.Serializable;

import javax.persistence.*;

import cn.sparrowmini.common.BaseOpLog;
import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 表单设计
 */

@Entity
@Table(name = "spr_form")
public class SparrowForm extends BaseOpLog implements Serializable{
	private static final long serialVersionUID = 1L;

	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	@Id
	@GenericGenerator(name = "id-generator", strategy = "uuid")
	@GeneratedValue(generator = "id-generator")
	private String id;

	private String name;
	private String code;
	@Column(columnDefinition = "TEXT")
	private String form;

	private FormOpenTypeEnum openType = FormOpenTypeEnum.PAGE;

	public SparrowForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}

	public FormOpenTypeEnum getOpenType() {
		return openType;
	}

	public void setOpenType(FormOpenTypeEnum openType) {
		this.openType = openType;
	}
}
