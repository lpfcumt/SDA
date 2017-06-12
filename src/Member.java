import java.util.ArrayList;

public class Member {
	private String id; //借书人id
	private String name; //借书人姓名
	private ArrayList<Loan> loans = new ArrayList<>(); //借书记录
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Loan> getLoans() {
		return loans;
	}

	public void setLoans(ArrayList<Loan> loans) {
		this.loans = loans;
	}
	public Member(){
		
	}
	
	/**
	 * @method 还书
	 * @author 林鹏飞
	 * @param book
	 */
	public void Return(Book book){
		Loan loan=FindCurrentLoanFor(book);
		if (loan!=null) {
			loan.MarkAsReturned();
			book.setLoanTo(null);
		}
	}
	
	/**
	 * @method 判断能否借书
	 * @author 林鹏飞
	 * @param book
	 */
	public  Boolean CanLoan(Book book){
		ISpecification<Member> hasReachMax=new HasReachMaxSpecification();
		ISpecification<Member> loanOnlyOne=new LoanOnlyOneSpecification(book);
		return hasReachMax.IsSatisfiedBy(this) && loanOnlyOne.IsSatisfiedBy(this);
	}
	
	/**
	 * @method 借书
	 * @author 林鹏飞
	 * @param book
	 * @return Loan
	 */
	public Loan Loan(Book book){
		Loan loan = null;
		if (CanLoan(book)) {
			loan =LoanFactory.CreateLoan(book, this);
			loans.add(loan);
			book.setLoanTo(this);
		}
		return loan;
	}
	
	/**
	 * @method 判断是否借过此书并未归还
	 * @author 林鹏飞
	 * @param book
	 * @return Loan
	 */
	public Loan FindCurrentLoanFor(Book book){
		for (Loan loan : loans) {
			if (loan.getBook().getId()==book.getId()) {
				return loan;
			}
		}
		return null;
		
	}
}
