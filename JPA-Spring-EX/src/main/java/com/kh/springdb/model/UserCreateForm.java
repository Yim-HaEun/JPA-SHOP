package com.kh.springdb.model;

import lombok.*;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.*;
//사용자 ID나 비밀번호 이메일을 회원가입할 때 필수로 넣어줬는지 확인
@Getter
@Setter

public class UserCreateForm {
	@Size(min =3, max =25)
	
	@NotEmpty(message = "사용자 또는 관리자 회원가입 체크는 필수입니다.")
	private String isRole;
	@NotEmpty(message = "사용자ID는 입력은 필수입니다.")
	private String username;
	
	@NotEmpty(message = "비밀번호입력은 필수입니다.")
	private String password1;
	@NotEmpty(message = "비밀번호 확인은 필수입니다.")
	private String password2;
	@NotEmpty(message = "이메일입력은 필수입니다.")
	@Email
	private String email;
}
