import java.util.ArrayList;

/**
 * @author 林鹏飞
 * @since Jdk1.8
 * @describe 用户最多只能借阅3本书
 * @time 2017年6月12日下午4:35:12
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
