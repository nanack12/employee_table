package employeePay;

class TempEmployee extends Employee{//​1) 정규직 사원을 나타내는 자식 클래스
	
	//2) 추가로 dept, regpay, regtitle 필드와 RegEmployee()생성자
	String dept; // 부서
	Long temphour;
	
	
	public TempEmployee(String ename, String esno, String dept, Long temphour) {
		super(ename, esno);
		this.dept=dept;
		setTemphour(temphour);
	}
	
	public Long getTemphour() {
		return temphour;
	}

	public void setTemphour(Long temphour) {
		this.temphour = temphour;
	}
	
	@Override
	public String toString() { //3)변수의 값을 연결한 문자열을 반환
		return super.toString()+ String.format("부서: %s, 근무시간수: %s, 급여액: %d만원", dept, temphour, earnings(temphour));
	}


	@Override
	public long earnings(long temphour) { //4)월 임금에 10만원을 더하여 급여액을 계산하는 메소드
		
		return temphour*3;
	}
	
}
	

