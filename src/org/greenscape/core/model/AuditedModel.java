/**
 *
 */
package org.greenscape.core.model;

import java.util.Date;

/**
 * @author Sheikh Sajid
 *
 */
public interface AuditedModel {
	String CREATED_DATE = "createdDate";
	String CREATED_BY = "createdBy";
	String LAST_MODIFIED_DATE = "lastModifiedDate";
	String LAST_MODIFIED_BY = "lastModifiedBy";

	Date getCreatedDate();

	AuditedModel setCreatedDate(Date date);

	String getCreatedBy();

	AuditedModel setcCeatedBy(String userId);

	Date getLastModifiedDate();

	AuditedModel setLastModifiedDate(Date date);

	String getLastModifiedBy();

	AuditedModel setLastModifiedBy(String userId);
}
