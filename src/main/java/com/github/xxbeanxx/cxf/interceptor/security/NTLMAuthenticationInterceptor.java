package com.github.xxbeanxx.cxf.interceptor.security;

import java.util.Map;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.NTCredentials;

/**
 * @author Greg Baker
 */
public class NTLMAuthenticationInterceptor extends AbstractPhaseInterceptor<Message> {

	private NTCredentials ntCredentials;

	public NTLMAuthenticationInterceptor(NTCredentials ntCredentials) {
		super(Phase.SEND);
		this.ntCredentials = ntCredentials;
	}

	@SuppressWarnings("unchecked")
	public void handleMessage(Message message) throws Fault {
		final Map<String, Object> context = (Map<String, Object>) message.getContextualProperty(Message.INVOCATION_CONTEXT);
		final Map<String, Object> requestContext = (Map<String, Object>) context.get(Client.REQUEST_CONTEXT);
		requestContext.put(Credentials.class.getName(), this.ntCredentials);
	}
	
}
