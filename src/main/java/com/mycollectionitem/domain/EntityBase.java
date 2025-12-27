
package com.mycollectionitem.domain;


import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class EntityBase {
    @Id 
    @GeneratedValue
    @Column(columnDefinition = "CHAR(36)")
    private UUID Id;

    public EntityBase() {
        this.Id = UUID.randomUUID();
    }

    public UUID getId() {
        return Id;
    }

   
    
}
