package com.software.florence.common.pattern.application.model;

import java.io.Serializable;

public interface AbstractDomain<OID extends Serializable> extends Serializable {

	public abstract OID getOid();

	public abstract void setOid(OID id);

}
