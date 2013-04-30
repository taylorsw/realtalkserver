/**
 * 
 */
package com.realtalkserver.util;

/**
 * Utility class that holds Parameter Constants used for Requests and 
 * Responses from client-code.
 * 
 * @author Colin Kho
 *
 */
public class RequestParameters {
	// Google Cloud Messaging Registration ID
    public static final String PARAMETER_REG_ID = "PARAMETER_REG_ID";
    // User Name
    public static final String PARAMETER_USER = "PARAMETER_USER";
    // Password
    public static final String PARAMETER_PWORD = "PARAMETER_PWORD";
    // New Password - Used if user wants to change password
    public static final String PARAMETER_NEW_PWORD = "PARAMETER_NEW_PWORD";
    // Parameter that indicates success - return "true" or "false" for this.
    public static final String PARAMETER_SUCCESS = "success";
}