
package com.mycollectionitem.domain;
import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity  
public class Item extends  EntityBase implements Serializable {
   
    private String title;
    private String author;
    //private UUID IdSequel;
    @OneToOne
    private Item Sequel; 
    private LocalDate releaseDate; // Usando java.time.LocalDate para fechas
    private String frontAddress; // Podría ser la URL de la portada
    private String synopsis;
    private String status;

    public Item() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

  

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getFrontAddress() {
        return frontAddress;
    }

    public void setFrontAddress(String frontAddress) {
        this.frontAddress = frontAddress;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Item(String title, String author, LocalDate releaseDate, String frontAddress, String synopsis, String status) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.frontAddress = frontAddress;
        this.synopsis = synopsis;
        this.status = status;
    }
    
}
