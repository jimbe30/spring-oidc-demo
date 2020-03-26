package net.jmb.oidc_demo.model;

public class IdentityProviderRegistration {
	
	String registrationId;
	String clientId;
	String description;
	String authorizationURL;
	String issuerURL;
	
	public String getRegistrationId() {
		return registrationId;
	}
	public IdentityProviderRegistration setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
		return this;
	}
	public String getClientId() {
		return clientId;
	}
	public IdentityProviderRegistration setClientId(String clientId) {
		this.clientId = clientId;
		return this;
	}
	public String getDescription() {
		return description;
	}
	public IdentityProviderRegistration setDescription(String idpDescription) {
		this.description = idpDescription;
		return this;
	}
	public String getAuthorizationURL() {
		return authorizationURL;
	}
	public IdentityProviderRegistration setAuthorizationURL(String authorizationURL) {
		this.authorizationURL = authorizationURL;
		return this;
	}
	public String getIssuerURL() {
		return issuerURL;
	}
	public IdentityProviderRegistration setIssuerURL(String issuerURL) {
		this.issuerURL = issuerURL;
		return this;
	}
	

	
}