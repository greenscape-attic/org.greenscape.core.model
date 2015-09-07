package org.greenscape.core.model;

import java.util.Date;

public class PersistedModelBase extends DocumentModelBase implements PersistedModel {

	private static final long serialVersionUID = 8837071132135265946L;

	@Override
	public String getOrganizationId() {
		return (String) getProperty(ORGANIZATION_ID);
	}

	@Override
	public PersistedModel setOrganizationId(String organizationId) {
		setProperty(ORGANIZATION_ID, organizationId);
		return this;
	}

	@Override
	public Date getCreatedDate() {
		return (Date) getProperty(CREATED_DATE);
	}

	@Override
	public PersistedModel setCreatedDate(Date date) {
		setProperty(CREATED_DATE, date);
		return this;
	}

	@Override
	public String getCreatedBy() {
		return (String) getProperty(CREATED_BY);
	}

	@Override
	public AuditedModel setcCeatedBy(String userId) {
		setProperty(CREATED_BY, userId);
		return this;
	}

	@Override
	public Date getLastModifiedDate() {
		return (Date) getProperty(LAST_MODIFIED_DATE);
	}

	@Override
	public PersistedModel setLastModifiedDate(Date date) {
		setProperty(LAST_MODIFIED_DATE, date);
		return this;
	}

	@Override
	public String getLastModifiedBy() {
		return (String) getProperty(LAST_MODIFIED_BY);
	}

	@Override
	public AuditedModel setLastModifiedBy(String userId) {
		setProperty(LAST_MODIFIED_BY, userId);
		return this;
	}
}
