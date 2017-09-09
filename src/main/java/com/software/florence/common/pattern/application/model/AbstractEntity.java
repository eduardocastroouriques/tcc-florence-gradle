package com.software.florence.common.pattern.application.model;

import java.io.Serializable;

public abstract class AbstractEntity<OID extends Serializable> implements AbstractDomain<OID> ,Serializable, Cloneable, Comparable<AbstractEntity<OID>> {

    private static final long serialVersionUID = 1L;

    @Override
    public final int compareTo(AbstractEntity<OID> otherEntity) {
        return Integer.valueOf(this.hashCode()).compareTo(Integer.valueOf(otherEntity.hashCode()));
    }

}