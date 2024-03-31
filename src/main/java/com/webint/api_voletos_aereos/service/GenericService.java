package com.webint.api_voletos_aereos.service;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public abstract class GenericService<GenericEntity, TypeID, GenericRepository extends CrudRepository<GenericEntity, TypeID>> {

    protected final GenericRepository repository;

    public GenericService(GenericRepository repository) {
        this.repository = repository;
    }

    public boolean exists(TypeID typeId){
        return repository.existsById(typeId);
    }

    public GenericEntity save(GenericEntity entity){
        return repository.save(entity);

    }

    public GenericEntity update(TypeID typeId, GenericEntity entity){
        if(repository.existsById(typeId)){
            return repository.save(entity);
        }
        return null;
    }

    public GenericEntity delete(TypeID typeId){
        if(repository.existsById(typeId)){
            GenericEntity entity = repository.findById(typeId).get();
            repository.deleteById(typeId);
            return entity;
        }
        return null;
    }

    public GenericEntity getByID(TypeID typeId) {
        return repository.findById(typeId).orElse(null);
    }

    public List<GenericEntity> getAll(){
        return (List<GenericEntity>) repository.findAll();
    }
}
