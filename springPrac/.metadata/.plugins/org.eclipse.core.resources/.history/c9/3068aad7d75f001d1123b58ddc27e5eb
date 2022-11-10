package com.study.springboot;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class ContentValidator implements Validator{

	@Override
	public boolean supports(Class<?> arg0) {
		return ContentDTO.class.isAssignableFrom(arg0);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ContentDTO dto = (ContentDTO) target;
		
//		String writerP = dto.getWriter();
//		if(writerP == null || writerP.trim().isEmpty()) {
//			System.out.println("Writer is null or Empty");
//			errors.rejectValue("writer", "trouble");
//		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "writer", "Writer is empty");
		String writerP = dto.getWriter();
		if(writerP.length() < 4) {
			errors.rejectValue("writer", "writer is too short");
		}
		
		
//		String contentP = dto.getContent();
//		if(contentP == null || contentP.trim().isEmpty()) {
//			System.out.println("Content is null or Empty");
//			errors.rejectValue("content", "trouble"); 
//		}
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "content", "Content is empty");
	}

}
