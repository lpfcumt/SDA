

public class LoanBookTest {
	
	/*借书*/
	public static void main(String[] args){
		
		// 添加借书人信息
		Member member = new Member();
		member.setId("123456");
		member.setName("张三");
		
		// 添加书目信息
		Book book1 = new Book("001", "isBn-001", "系统设计与实现", null);
		Book book2 = new Book("002", "isBn-002", "网络营销", null);
		Book book3 = new Book("003", "isBn-003", "大学英语", null);
		Book book4 = new Book("004", "isBn-004", "高等数学", null);
		
		// 第一次借书
		System.out.println("第一次借书");
		Loan loan=member.Loan(book1);
		System.out.println("借书编号："+loan.getId());
		System.out.println("书名 ："+loan.getBook().getTitle());
		System.out.println("借书人："+loan.getMember().getName());
		System.out.println("借书时间："+loan.getLoanDate());
		System.out.println("借书期限："+loan.getDateForReturn());

		System.out.println("");
		System.out.println("");
		
		//第二次借同一本书
		System.out.println("第二次借同一本书");
		Loan loan2=member.Loan(book1);
		System.out.println(loan2);
		
		System.out.println("");
		System.out.println("");
		
		//当借书数量达到3本以上时
		System.out.println("当借书数量达到3本以上时");
		System.out.println("借第二本书");
		Loan loan3=member.Loan(book2);
		System.out.println("借书编号："+loan3.getId());
		System.out.println("书名 ："+loan3.getBook().getTitle());
		System.out.println("借书人："+loan3.getMember().getName());
		System.out.println("借书时间："+loan3.getLoanDate());
		System.out.println("借书期限："+loan3.getDateForReturn());
		System.out.println("借第三本书");
		Loan loan4=member.Loan(book3);
		System.out.println("借书编号："+loan4.getId());
		System.out.println("书名 ："+loan4.getBook().getTitle());
		System.out.println("借书人："+loan4.getMember().getName());
		System.out.println("借书时间："+loan4.getLoanDate());
		System.out.println("借书期限："+loan4.getDateForReturn());
		System.out.println("借第四本书");
		Loan loan5=member.Loan(book4);
		System.out.println(loan5);
		System.out.println("");
		System.out.println("");
		
		//还书
		System.out.println("还第一本书");
		System.out.println(book1.getLoanTo().getName());
		member.Return(book1);
		System.out.println(book1.getLoanTo());
	}
}
