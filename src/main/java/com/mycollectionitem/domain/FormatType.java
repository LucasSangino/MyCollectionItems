
package com.mycollectionitem.domain;

import java.util.UUID;
public class FormatType extends EntityBase {

    private UUID idItem; 
  
    private Long idFormat;

    public FormatType(UUID idItem, Long idFormat) {
        this.idItem = idItem;
        this.idFormat = idFormat;
    }

    public FormatType() {
    }

    public UUID getIdItem() {
        return idItem;
    }

    public void setIdItem(UUID idItem) {
        this.idItem = idItem;
    }

    public Long getIdFormat() {
        return idFormat;
    }

    public void setIdFormat(Long idFormat) {
        this.idFormat = idFormat;
    }
    
}
