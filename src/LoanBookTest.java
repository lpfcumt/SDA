

public class LoanBookTest {
	
	/*����*/
	public static void main(String[] args){
		
		// ��ӽ�������Ϣ
		Member member = new Member();
		member.setId("123456");
		member.setName("����");
		
		// �����Ŀ��Ϣ
		Book book1 = new Book("001", "isBn-001", "ϵͳ�����ʵ��", null);
		Book book2 = new Book("002", "isBn-002", "����Ӫ��", null);
		Book book3 = new Book("003", "isBn-003", "��ѧӢ��", null);
		Book book4 = new Book("004", "isBn-004", "�ߵ���ѧ", null);
		
		// ��һ�ν���
		System.out.println("��һ�ν���");
		Loan loan=member.Loan(book1);
		System.out.println("�����ţ�"+loan.getId());
		System.out.println("���� ��"+loan.getBook().getTitle());
		System.out.println("�����ˣ�"+loan.getMember().getName());
		System.out.println("����ʱ�䣺"+loan.getLoanDate());
		System.out.println("�������ޣ�"+loan.getDateForReturn());

		System.out.println("");
		System.out.println("");
		
		//�ڶ��ν�ͬһ����
		System.out.println("�ڶ��ν�ͬһ����");
		Loan loan2=member.Loan(book1);
		System.out.println(loan2);
		
		System.out.println("");
		System.out.println("");
		
		//�����������ﵽ3������ʱ
		System.out.println("�����������ﵽ3������ʱ");
		System.out.println("��ڶ�����");
		Loan loan3=member.Loan(book2);
		System.out.println("�����ţ�"+loan3.getId());
		System.out.println("���� ��"+loan3.getBook().getTitle());
		System.out.println("�����ˣ�"+loan3.getMember().getName());
		System.out.println("����ʱ�䣺"+loan3.getLoanDate());
		System.out.println("�������ޣ�"+loan3.getDateForReturn());
		System.out.println("���������");
		Loan loan4=member.Loan(book3);
		System.out.println("�����ţ�"+loan4.getId());
		System.out.println("���� ��"+loan4.getBook().getTitle());
		System.out.println("�����ˣ�"+loan4.getMember().getName());
		System.out.println("����ʱ�䣺"+loan4.getLoanDate());
		System.out.println("�������ޣ�"+loan4.getDateForReturn());
		System.out.println("����ı���");
		Loan loan5=member.Loan(book4);
		System.out.println(loan5);
		System.out.println("");
		System.out.println("");
		
		//����
		System.out.println("����һ����");
		System.out.println(book1.getLoanTo().getName());
		member.Return(book1);
		System.out.println(book1.getLoanTo());
	}
}
