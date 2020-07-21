package entity;

public class User {
	private String id;
	private String unumber,upassword,name,sex,email,profession;
	private String identity;

	public User() {}
	
	
	public User(String unumber, String upassword) {
	
		this.unumber = unumber;
		this.upassword = upassword;
	}



	public User(String id, String unumber, String upassword, String name, String sex, String email, String profession,
			String identity) {
		this.id = id;
		this.unumber = unumber;
		this.upassword = upassword;
		this.name = name;
		this.sex = sex;
		this.email = email;
		this.profession = profession;
		this.identity = identity;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", unumber=" + unumber + ", upassword=" + upassword + ", name=" + name + ", sex="
				+ sex + ", email=" + email + ", profession=" + profession + ", identity=" + identity + "]";
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public User(String unumber) {
		super();
		this.unumber = unumber;
	}


	public String getIdentity() {
		return identity;
	}


	public void setIdentity(String identity) {
		this.identity = identity;
	}


	public User(String unumber, String upassword, String name, String sex, String email, String profession) {
	
		this.unumber = unumber;
		this.upassword = upassword;
		this.name = name;
		this.sex = sex;
		this.email = email;
		this.profession = profession;
	}


	public User(String unumber, String upassword, String name, String sex, String email, String profession,
			String identity) {
		super();
		this.unumber = unumber;
		this.upassword = upassword;
		this.name = name;
		this.sex = sex;
		this.email = email;
		this.profession = profession;
		this.identity = identity;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	

	

	public String getUnumber() {
		return unumber;
	}


	public void setUnumber(String unumber) {
		this.unumber = unumber;
	}


	public String getUpassword() {
		return upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (identity == null) {
			if (other.identity != null)
				return false;
		} else if (!identity.equals(other.identity))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (profession == null) {
			if (other.profession != null)
				return false;
		} else if (!profession.equals(other.profession))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		if (unumber == null) {
			if (other.unumber != null)
				return false;
		} else if (!unumber.equals(other.unumber))
			return false;
		if (upassword == null) {
			if (other.upassword != null)
				return false;
		} else if (!upassword.equals(other.upassword))
			return false;
		return true;
	}
	
}
