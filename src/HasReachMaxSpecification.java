import java.util.ArrayList;

/**
 * @author ������
 * @since Jdk1.8
 * @describe �û����ֻ�ܽ���3����
 * @time 2017��6��12������4:35:12
 */
public class HasReachMaxSpecification implements ISpecification<Member> {

	@Override
	public boolean IsSatisfiedBy(Member member) {
		// TODO Auto-generated method stub
		ArrayList<Loan> list= member.getLoans();
		int n=0;
		for (Loan loan : list) {
			if (loan.getMember().getId()==member.getId()) {
				n+=1;
				if (n>=3) {
					return false;				
				}
			}
		}
		return true;
	}

}
