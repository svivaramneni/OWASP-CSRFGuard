package org.owasp.csrfguard;

/**
 * Interface to be implemented by the classes which return CSRFGuard instance.
 * 
 * @author svivaramneni
 * @see CsrfGuard
 * @see CsrfGuardSingletonInstance
 */
public interface CsrfGuardInstanceProvider {
	public CsrfGuard getInstance();
}
