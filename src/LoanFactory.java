import java.time.LocalDateTime;
import java.util.UUID;

public  class LoanFactory {
	
	
	/**
	 * @method ≤Â»ÎΩË È 
	 * @author ¡÷≈Ù∑…
	 * @param book
	 * @param member
	 * @return Loan
	 */
	public static Loan CreateLoan(Book book,Member member){
		String uuid=UUID.randomUUID().toString();
		String uuidString=uuid.replace("-", "");
		Loan loan=new Loan();
		loan.setId(uuidString);
		loan.setBook(book);
		loan.setMember(member);
		loan.setLoanDate(LocalDateTime.now());
		loan.setDateForReturn(LocalDateTime.now().plusDays(10));
		return loan;
		
	}
}
