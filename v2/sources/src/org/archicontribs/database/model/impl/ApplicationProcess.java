package org.archicontribs.database.model.impl;

import org.archicontribs.database.DBLogger;
import org.archicontribs.database.model.DBMetadata;
import org.archicontribs.database.model.IDBMetadata;

/**
 * extends ApplicationProcess<br>
 * implements IHasDBMetadata
 * 
 * @author Herve Jouin 
 * @see com.archimatetool.model.impl.ApplicationProcess
 * @see org.archicontribs.database.model.IDBMetadata
 */
public class ApplicationProcess extends com.archimatetool.model.impl.ApplicationProcess implements IDBMetadata {
	private static final DBLogger logger = new DBLogger(ApplicationProcess.class);
	private DBMetadata dbMetadata;
	
	public ApplicationProcess() {
		super();
		if ( logger.isTraceEnabled() ) logger.trace("Creating new ApplicationProcess");
		
		dbMetadata = new DBMetadata(this);
	}
	
	/**
	 * Gets the DBMetadata of the object
	 */
	public DBMetadata getDBMetadata() {
		return dbMetadata;
	}
}
