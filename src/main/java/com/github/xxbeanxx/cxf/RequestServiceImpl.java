package com.github.xxbeanxx.cxf;

import java.io.IOException;

import javax.jws.WebService;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

/**
 * @author Greg Baker
 */
@WebService(endpointInterface = "com.github.xxbeanxx.cxf.RequestService")
public class RequestServiceImpl implements RequestService {

	@Override
	public String handleRequest() {
		return "SUCCESS";
	}

	public class UTPasswordCallback implements CallbackHandler {

		@Override
		public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
			
		}
		
	}
	
}
