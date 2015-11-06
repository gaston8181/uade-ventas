package ar.com.uade.action;

import ar.com.uade.dao.UserBo;

import com.opensymphony.xwork2.ActionSupport;

public class InicioAction extends ActionSupport {

	// DI via Spring
	UserBo userBo;

	public UserBo getUserBo() {
		return userBo;
	}

	public void setUserBo(UserBo userBo) {
		this.userBo = userBo;
	}

	public String execute() throws Exception {

		userBo.printUser();

		return SUCCESS;

	}
}