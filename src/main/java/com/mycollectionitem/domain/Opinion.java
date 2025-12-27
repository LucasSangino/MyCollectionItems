

package com.mycollectionitem.domain;
import java.util.UUID;

public class Opinion extends EntityBase {

    
    private UUID idItem; 
    
    private float puntiation; 
    private String review;

    public Opinion() {
    }

    public Opinion(UUID idItem, float puntiation, String review) {
        this.idItem = idItem;
        this.puntiation = puntiation;
        this.review = review;
    }

    public UUID getIdItem() {
        return idItem;
    }

    public void setIdItem(UUID idItem) {
        this.idItem = idItem;
    }

    public float getPuntiation() {
        return puntiation;
    }

    public void setPuntiation(float puntiation) {
        this.puntiation = puntiation;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
    
}
