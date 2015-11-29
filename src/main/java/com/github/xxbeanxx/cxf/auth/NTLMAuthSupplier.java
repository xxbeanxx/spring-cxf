package com.github.xxbeanxx.cxf.auth;

import java.net.URI;

import org.apache.cxf.configuration.security.AuthorizationPolicy;
import org.apache.cxf.message.Message;
import org.apache.cxf.transport.http.auth.HttpAuthSupplier;

/**
 * @author Greg Baker
 */
public class NTLMAuthSupplier implements HttpAuthSupplier {

	public boolean requiresRequestCaching() {
		return false;
	}

	public String getAuthorization(AuthorizationPolicy authPolicy, URI url, Message message, String fullHeader) {
		// TODO Auto-generated method stub
		return null;
	}

}
