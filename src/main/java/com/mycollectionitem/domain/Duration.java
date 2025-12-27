
package com.mycollectionitem.domain;
import java.util.UUID;

public class Duration extends EntityBase {

    private UUID idItem; 
    
    private float duration;  

    public Duration() {
    }

    public Duration(UUID idItem, float duration) {
        this.idItem = idItem;
        this.duration = duration;
    }

    public UUID getIdItem() {
        return idItem;
    }

    public void setIdItem(UUID idItem) {
        this.idItem = idItem;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }
    
}
