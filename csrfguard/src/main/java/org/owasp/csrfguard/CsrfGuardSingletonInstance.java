package org.owasp.csrfguard;

/**
 * Default implementation of the {@link CsrfGuardInstanceProvider} interface. It returns CsrfGuard instance as singleton.
 * @author svivaramneni
 * 
 */
public class CsrfGuardSingletonInstance implements CsrfGuardInstanceProvider {

	private static class SingletonHolder {
		public static final CsrfGuard instance = new CsrfGuard();
	}

	@Override
	public CsrfGuard getInstance() {
		return SingletonHolder.instance;
	}

}
