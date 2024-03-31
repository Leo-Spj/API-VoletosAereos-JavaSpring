package com.webint.api_voletos_aereos.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

public interface GenericIdentifiable<ID> {

    @JsonIgnore
    ID getID();
}
