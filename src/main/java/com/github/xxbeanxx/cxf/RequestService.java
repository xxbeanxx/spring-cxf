package com.github.xxbeanxx.cxf;

import javax.jws.WebService;

import org.apache.cxf.annotations.Policy;
import org.example.request.RequestType;

/**
 * @author Greg Baker
 */
@WebService
@Policy(uri = "classpath:schemas/RequestPolicy.xml")
public interface RequestService {

	String handleRequest(RequestType requestType);

}