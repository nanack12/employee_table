package employeePay;

class RegEmployee extends Employee{//​1) 정규직 사원을 나타내는 자식 클래스
	
	//2) 추가로 dept, regpay, regtitle 필드와 RegEmployee()생성자
	String dept; // 부서
	Long regpay; // 월 임금
	String regtitle; //담당업무
	
	
	public RegEmployee(String ename, String esno, String dept, String regtitle, Long regpay) {
		super(ename, esno);
		this.dept=dept;
		this.regtitle=regtitle;
		setRegpay(regpay);
	}
	

	public Long getRegpay() {
		return regpay;
	}


	public void setRegpay(Long regpay) {
		this.regpay = regpay;
	}


	@Override
	public String toString() { //3)변수의 값을 연결한 문자열을 반환
		return super.toString()+ String.format("부서: %s, 담당업무: %s, 급여액: %d만원", dept, regtitle,earnings(regpay));
	}


	@Override
	public long earnings(long pay) { //4)월 임금에 10만원을 더하여 급여액을 계산하는 메소드
		pay = regpay + 10 ;
		return pay;
	}
	
}