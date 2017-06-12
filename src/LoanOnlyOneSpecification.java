import java.util.ArrayList;

/**
 * @author 林鹏飞
 * @since Jdk1.8
 * @describe 同一书只能借阅一本
 * @time 2017年6月12日下午4:34:22
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
