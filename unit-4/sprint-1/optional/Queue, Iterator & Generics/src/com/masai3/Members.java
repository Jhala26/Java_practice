package com.masai3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Members implements Comparable<Members> {

	private int memberId;
	private String memberName;
	private int membershipNo;
	private LocalDate membershipEnddate;
	
	Members(){
		
	}

	
	public Members(int memberId, String memberName, int membershipNo, String membershipEnddate) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.membershipNo = membershipNo;
		this.membershipEnddate = LocalDate.parse(membershipEnddate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
	}



	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getMembershipNo() {
		return membershipNo;
	}

	public void setMembershipNo(int membershipNo) {
		this.membershipNo = membershipNo;
	}

	

	public LocalDate getMembershipEnddate() {
		return membershipEnddate;
	}

	
	public void setMembershipEnddate(LocalDate membershipEnddate) {
		this.membershipEnddate = membershipEnddate;
	}

	@Override
	public String toString() {
		return "Members [memberId=" + memberId + ", memberName=" + memberName + ", membershipNo=" + membershipNo
				+ ", membershipEnddate=" + membershipEnddate + "]";
	}

	@Override
	public int hashCode() {
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Members other = (Members) obj;
		return ((memberId == other.memberId) || (membershipNo == other.membershipNo));
	}

	@Override
	public int compareTo(Members o) {
		
		LocalDate l1 = o.membershipEnddate;
		LocalDate l2 = this.membershipEnddate;
		
		int i = l1.compareTo(l2);
		
		
		if(i < 0) {
			return -1;
		}
		else {
			return 1;
		}
	}
	
	
	
	
	
}
