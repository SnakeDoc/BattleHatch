package a3.network.api.messages.impl;

import a3.network.api.messages.BasicMessage;
import a3.network.api.messages.MessageType;

public class JoinMessage extends BasicMessage {

	private static final long serialVersionUID = 8930487733152468168L;
	
	private Boolean joinSuccess = false;
	
	public JoinMessage() {
		super.setMessageType(MessageType.JOIN);
	}

	/**
	 * @return the joinSuccess
	 */
	public Boolean isJoinSuccess() {
		return joinSuccess;
	}

	/**
	 * @param joinSuccess the joinSuccess to set
	 */
	public void setJoinSuccess(Boolean joinSuccess) {
		this.joinSuccess = joinSuccess;
	}
	
}
