package rocks.cta.api.core.callables;

import java.util.Map;
import java.util.Optional;

/**
 * Represents a HTTP request in a trace / sub-trace.
 * 
 * @author Alexander Wert
 *
 */
public interface HTTPRequestProcessing extends NestingCallable {
	/**
	 * 
	 * @return the URI of the HTTP request
	 */
	String getUri();

	/**
	 * 
	 * 
	 * @return an {@link Optional} with the method of the HTTP request as value. Empty {@link Optional} if not present.
	 */
	Optional<HTTPMethod> getRequestMethod();

	/**
	 * Returns a Map of HTTP parameters. Key represents the parameter name. Value is a String array.
	 * 
	 * @return an {@link Optional} with an <b>unmodifiable map</b> of HTTP parameters as value. Empty {@link Optional} if not present.
	 */
	Optional<Map<String, String[]>> getHTTPParameters();

	/**
	 * Returns a Map of HTTP attributes. Key represents the attribute name.
	 * 
	 * @return an {@link Optional} with an <b>unmodifiable map</b> of HTTP attributes as value. Empty {@link Optional} if not present.
	 */
	Optional<Map<String, String>> getHTTPAttributes();

	/**
	 * Returns a Map of HTTP session attributes. Key represents the session attribute name.
	 * 
	 * @return an {@link Optional} with an <b>unmodifiable map</b> of HTTP session attributes as value. Empty {@link Optional} if not present.
	 */
	Optional<Map<String, String>> getHTTPSessionAttributes();

	/**
	 * Returns a Map of HTTP headers. 
	 * 
	 * @return an {@link Optional} with an <b>unmodifiable map</b> of HTTP headers as value. Empty {@link Optional} if not present.
	 */
	Optional<Map<String, String>> getHTTPHeaders();
	
	/**
	 * Enumeration of possible HTTP methods.
	 * 
	 * @author Alexander Wert
	 *
	 */
	public enum HTTPMethod {
		/**
		 * HTTP GET.
		 */
		GET,
		/**
		 * HTTP HEAD.
		 */
		HEAD,
		/**
		 * HTTP POST.
		 */
		POST,
		/**
		 * HTTP PUT.
		 */
		PUT,
		/**
		 * HTTP DELETE.
		 */
		DELETE,
		/**
		 * HTTP TRACE.
		 */
		TRACE,
		/**
		 * HTTP OPTIONS.
		 */
		OPTIONS,
		/**
		 * HTTP CONNECT.
		 */
		CONNECT,
		/**
		 * HTTP PATCH.
		 */
		PATCH
	}
}