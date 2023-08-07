package employeePay;

import java.util.ArrayList;
import java.util.Scanner;

public class TestEmployee {
		
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//1. 입력 자료 수는main(String[] args) 이용하여 입력 받는다.
		int num=0;
		ArrayList<String> list = new ArrayList<>();
		
		
		//2. 사원번호, 이름을 입력
		String name;
		String sno ;
		//3. 사원의 근무유형은 관리직(1), 정규직(2), 임시직(3)으로 구분한다.
		int worktype = 0;
		
		//4. 관리자 - 직책과 임금을 입력
		String title;
		Long staffpay;
		
		//정규직 - 부서, 업무, 임금을 입력	
		String dept;
		String regtitle;
		Long regpay; 
		
		//임시직 - 부서, 월 근무시간수	
		Long temphour;
		
		System.out.println("금성 회사 급여 입력화면");
		System.out.println("==================");
		
		System.out.printf("입력 자료 수: ");
		num=in.nextInt();
		
		
		for(int i= 0; i<num; i++) {
		System.out.printf("사원번호, 이름... ");
		sno =in.next();
		name =in.next();
		System.out.printf("사원의 근무유형: (1:CEO, 2:정규직, 3:임시직)... ");
		worktype=in.nextInt();
	
		
			switch(worktype) {
			
			case 1 :
				
				System.out.printf("직책, 월 임금:... ");
				title =in.next();
				staffpay=in.nextLong();
				
				Staff c1 = new Staff(name, sno, title, staffpay);
				name=c1.toString();
				sno=c1.toString();
				title=c1.toString();
				c1.earnings(staffpay);
				
				list.add(c1.toString());
				break;
				
			
			case 2 :
				System.out.printf("부서, 업무, 월 임금:... ");
				dept =in.next();
				regtitle =in.next();
				regpay=in.nextLong();
				
				RegEmployee c2 = new RegEmployee(name, sno, dept, regtitle, regpay);
				name=c2.toString();
				sno=c2.toString();
				dept=c2.toString();
				regtitle=c2.toString();
				c2.earnings(regpay);
				
				list.add(c2.toString());
				break;
				
			
			case 3 :	
				System.out.printf("부서, 월 근무시간 수:... ");
				dept =in.next();
				temphour=in.nextLong();
				
				TempEmployee c3 = new TempEmployee(name, sno, dept, temphour);
				name=c3.toString();
				sno=c3.toString();
				dept=c3.toString();
				c3.earnings(temphour);
				
				list.add(c3.toString());
				break;
			
			//사원번호가 잘 못 입력되면 “근무유형 오류 재입력….”을 출력하고 다시 입력을 받는다.
			default	:
				System.out.println("근무유형 오류 재입력....");
				i--;
				break;
				
			}//end switch
	
		
		}//end for
		
		System.out.println();
		System.out.println("===============");
		System.out.println("금성 회사 출력화면");
		System.out.println("===============");
		System.out.println("급여보고서");
		
		for(int i=0; i<num; i++) 
			System.out.println(list.get(i));
		
	}// end main
	
}// end TestEmployee
