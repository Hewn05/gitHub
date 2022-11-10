package com.study.springboot;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ContentDTO {
	private int id;
	@NotNull(message="writer is null")
	@NotEmpty(message="writer is empty")
	@Size(min=2,max=10,message="writer 두자이상 열자이하")
	private String writer;
	@NotNull(message="content is null")
	@NotEmpty(message="content is empty")
	private String content;
}
