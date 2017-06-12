import java.util.ArrayList;

/**
 * @author ������
 * @since Jdk1.8
 * @describe ͬһ��ֻ�ܽ���һ��
 * @time 2017��6��12������4:34:22
 */
public class LoanOnlyOneSpecification implements ISpecification<Member> {
	private Book wantBook;
	
	public LoanOnlyOneSpecification(Book book){
		this.wantBook=book;
	}
	
	@Override
	public boolean IsSatisfiedBy(Member t) {
		// TODO Auto-generated method stub
		ArrayList<Loan> list = t.getLoans();
		for (Loan loan : list) {
			if (loan.getBook().getId()==wantBook.getId() && loan.getMember().getId()==t.getId()) {
				return false;
			}
		}
		return true;
	}

}
