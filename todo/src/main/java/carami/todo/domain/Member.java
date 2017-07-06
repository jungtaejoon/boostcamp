package carami.todo.domain;

public class Member {

	private Long id;
	private String name;
	private String email;
	private String passwd;

	public Member() {
		super();
	}

	public Member(String name, String email, String passwd) {
		super();
		this.name = name;
		this.email = email;
		this.passwd = passwd;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", email=" + email + ", passwd=" + passwd + "]";
	}

}
