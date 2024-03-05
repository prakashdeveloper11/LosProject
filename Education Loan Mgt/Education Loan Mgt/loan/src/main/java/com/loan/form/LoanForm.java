package com.loan.form;




import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;


import com.loan.dto.LoanDTO;
import com.loan.utility.DataUtility;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoanForm extends BaseForm{
	
	@NotEmpty(message = "This Field is required")
	private String firstName;

	@NotEmpty(message = "This Field is required")
	private String lastName;
	
	@NotEmpty(message = "This Field is required")
	private String address;

	@NotEmpty(message = "This Field is required")
	@Pattern( regexp="[A-Z]{5}[0-9]{4}[A-Z]{1}",message="Enter proper Pancars number")
	private String pancard;
	
	@NotEmpty(message = "This Field is required")
	@Pattern(regexp="\\d{12}",message="enter proper aadhar number")
	private String adharcard;
	
	@NotEmpty(message = "This Field is required")
	private String bplcard;
	
	@NotEmpty(message = "This Field is required")
	private String parentName;
	
	@NotEmpty(message = "This Field is required")
	private String parentOccupation;
	
	@NotEmpty(message = "This Field is required")
	private String parentIncome;
	
	@NotEmpty(message = "This Field is required")
	private String loanAmount;

	@NotEmpty(message = "This Field is required")
	private String collegeName;
	
	@NotEmpty(message = "This Field is required")
	private String branchName;
	
	@NotEmpty(message = "This Field is required")
	private String graduationPercentage;
	
	@NotEmpty(message = "This Field is required")
	private String cgpa;
	
	
	private String dropYears;
	
	
	@NotEmpty(message = "This Field is required")
	private String bankName;
	
	@NotEmpty(message = "This Field is required")
	private String accountNumber;
	
	@NotEmpty(message = "This Field is required")
	private String ifscCode;
	
	
	
	public LoanDTO getDTO() {
		LoanDTO bean=new LoanDTO();
		bean.setId(id);
		bean.setFirstName(firstName);
		bean.setLastName(lastName);
		bean.setAddress(address);
		bean.setPancard(pancard);
		bean.setAdharcard(adharcard);
		bean.setBplcard(bplcard);
		bean.setParentName(parentName);
		bean.setParentOccupation(parentOccupation);
		bean.setParentIncome(parentIncome);
		bean.setLoanAmount(DataUtility.getLong(loanAmount));
		bean.setCollegeName(collegeName);
		bean.setBranchName(branchName);
		bean.setGraduationPercentage(graduationPercentage);
		bean.setCgpa(cgpa);
		bean.setDropYears(dropYears);
		bean.setBankName(bankName);
		bean.setAccountNumber(accountNumber);
		bean.setIfscCode(ifscCode);
	

		return bean;
	}

	public void populate(LoanDTO bean) {
		id = bean.getId();
		firstName=bean.getFirstName();
		lastName=bean.getLastName();
		address = bean.getAddress();
		pancard = bean.getPancard();
		adharcard = bean.getAdharcard();
		bplcard = bean.getBplcard();
		parentName = bean.getParentName();
		parentOccupation = bean.getParentOccupation();
		parentIncome = bean.getParentIncome();
		loanAmount = DataUtility.getStringData(bean.getLoanAmount());
		collegeName = bean.getCollegeName();
		branchName = bean.getBranchName();
		graduationPercentage = bean.getGraduationPercentage();
		cgpa = bean.getCgpa();
		dropYears = bean.getDropYears();
		bankName = bean.getBankName();
		accountNumber = bean.getAccountNumber();
		ifscCode = bean.getIfscCode();
		
	}

	
	
	
	
	
	
	

}
