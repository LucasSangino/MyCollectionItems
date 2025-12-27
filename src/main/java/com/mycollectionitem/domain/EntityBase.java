
package com.mycollectionitem.domain;


import java.util.UUID;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
@MappedSuperclass
public abstract class EntityBase {
    @Id 
    private UUID Id;

    public EntityBase() {
        this.Id = UUID.randomUUID();
    }

    public UUID getId() {
        return Id;
    }

   
    
}
