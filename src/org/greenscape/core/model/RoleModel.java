/**
 * 
 */
package org.greenscape.core.model;

/**
 * @author Sheikh Sajid
 * 
 */
public interface RoleModel extends PersistedModel {
	String MODEL_NAME = "Role";
	String NAME = "name";
	String DESCRIPTION = "description";

	String getName();

	RoleModel setName(String name);

	String getDescription();

	RoleModel setDescription(String description);
}
