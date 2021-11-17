package jp.co.sample.emp_management.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * 管理者情報登録時に使用するフォーム.
 * 
 * @author igamasayuki
 * 
 */
public class InsertAdministratorForm {
	/** 名前 */
	@NotBlank(message="名前は必須です")
	private String name;
	/** メールアドレス */
	@NotBlank(message="Eメールは必須です")
	@Email(message="メール形式にしてください")
	private String mailAddress;
	/** パスワード */
	@NotBlank(message="パスワードは必須です")
	@Pattern(regexp="^[A-Za-z0-9]+$",message="英数字で入力してください")
	@Size(min=8,message="パスワードは8文字以上で記載してください")
	private String password;
	
	/** 確認パスワード */
	
	private String passwordcheck;


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the mailAddress
	 */
	public String getMailAddress() {
		return mailAddress;
	}

	/**
	 * @param mailAddress the mailAddress to set
	 */
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	public String getPasswordcheck() {
		return passwordcheck;
	}

	public void setPasswordcheck(String passwordcheck) {
		this.passwordcheck = passwordcheck;
	}

	@Override
	public String toString() {
		return "InsertAdministratorForm [name=" + name + ", mailAddress=" + mailAddress + ", password=" + password
				+ ", passwordcheck=" + passwordcheck + "]";
	}
	
}
