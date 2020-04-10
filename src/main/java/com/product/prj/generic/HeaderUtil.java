package com.product.prj.generic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;

public class HeaderUtil {
	private static final Logger log = LoggerFactory.getLogger(HeaderUtil.class);

	private HeaderUtil() {
	}

	public static HttpHeaders createAlert(String message, String param) {
		HttpHeaders headers = new HttpHeaders();
		headers.add("X-productApp-alert", message);
		headers.add("X-productApp-params", param);
		return headers;
	}

	public static HttpHeaders createEntityCreationAlert(String entityName, String param) {
		return createAlert("productApp." + entityName + ".created", param);
	}

	public static HttpHeaders createEntityUpdateAlert(String entityName, String param) {
		return createAlert("productApp." + entityName + ".updated", param);
	}

	public static HttpHeaders createEntityDeletionAlert(String entityName, String param) {
		return createAlert("productApp." + entityName + ".deleted", param);
	}

	public static HttpHeaders createFailureAlert(String entityName, String errorKey, String defaultMessage) {
		log.error("Entity creation failed, {}", defaultMessage);
		HttpHeaders headers = new HttpHeaders();
		headers.add("X-productApp-error", "error." + errorKey);
		headers.add("X-productApp-params", entityName);
		return headers;
	}

	public static HttpHeaders createSuccessWithWarningAlert(String entityName, String errorKey, String defaultMessage) {
		log.error("Entity creation succeeded with alert, {}", defaultMessage);
		HttpHeaders headers = new HttpHeaders();
		headers.add("X-productApp-error", "error." + errorKey);
		headers.add("X-productApp-params", entityName);
		return headers;
	}

	public static HttpHeaders createFailureAlert(Exception e) {
		log.error("Entity creation failed, {}", e.getMessage());
		HttpHeaders headers = new HttpHeaders();
		headers.add("X-productApp-error", "error." + e.getMessage());
		return headers;
	}
}
