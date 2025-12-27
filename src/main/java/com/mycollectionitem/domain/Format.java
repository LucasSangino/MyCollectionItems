
package com.mycollectionitem.domain;

import java.util.UUID;

public class Format extends EntityBase {
   private UUID idFormat; 
    
    private String nameFormat; 

    public Format() {
    }

    public Format(UUID idFormat, String nameFormat) {
        this.idFormat = idFormat;
        this.nameFormat = nameFormat;
    }

    public UUID getIdFormat() {
        return idFormat;
    }

    public void setIdFormat(UUID idFormat) {
        this.idFormat = idFormat;
    }

    public String getNameFormat() {
        return nameFormat;
    }

    public void setNameFormat(String nameFormat) {
        this.nameFormat = nameFormat;
    }
    
}
