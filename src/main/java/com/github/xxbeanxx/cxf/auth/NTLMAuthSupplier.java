package com.github.xxbeanxx.cxf.auth;

import java.net.URI;

import org.apache.cxf.configuration.security.AuthorizationPolicy;
import org.apache.cxf.message.Message;
import org.apache.cxf.transport.http.auth.HttpAuthSupplier;
import org.apache.http.impl.auth.NTLMEngine;
import org.apache.http.impl.auth.NTLMScheme;

/**
 * @author Greg Baker
 */
public class NTLMAuthSupplier implements HttpAuthSupplier {

	NTLMScheme ntlmScheme = new NTLMScheme();
	
	public boolean requiresRequestCaching() {
		return false;
	}

	public String getAuthorization(AuthorizationPolicy authPolicy, URI url, Message message, String fullHeader) {
		return null;
	}

}
