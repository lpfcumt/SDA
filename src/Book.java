
public class Book {
	private String id;
	private String isBn;
	private String  title;
	private Member loanTo;
	
	public Book(String id, String isBn, String title, Member loanTo) {
		super();
		this.id = id;
		this.isBn = isBn;
		this.title = title;
		this.loanTo = loanTo;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIsBn() {
		return isBn;
	}
	public void setIsBn(String isBn) {
		this.isBn = isBn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Member getLoanTo() {
		return loanTo;
	}
	public void setLoanTo(Member loanTo) {
		this.loanTo = loanTo;
	}
	
	
}
