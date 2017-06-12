
import java.time.LocalDateTime;
import java.util.Date;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class Loan {
	private String id;
	private LocalDateTime loanDate;
	private LocalDateTime dateForReturn;
	private LocalDateTime returnDate;
	private Member member;
	private Book book;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public LocalDateTime getLoanDate() {
		return loanDate;
	}
	public void setLoanDate(LocalDateTime loanDate) {
		this.loanDate = loanDate;
	}
	public LocalDateTime getDateForReturn() {
		return dateForReturn;
	}
	public void setDateForReturn(LocalDateTime dateForReturn) {
		this.dateForReturn = dateForReturn;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public LocalDateTime getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(LocalDateTime returnDate) {
		this.returnDate = returnDate;
	}
	
	public Loan(){
		
	}
	
	
	
	/**
	 * @method 没有还书
	 * @author 林鹏飞
	 * @return Boolean
	 */
	public Boolean HasNotBeenReturn(){
		return returnDate==null;
	}
	
	/**
	 * @method 还书
	 * @author 林鹏飞
	 */
	public void MarkAsReturned(){
		returnDate =LocalDateTime.now();
	}
	  
	

}
