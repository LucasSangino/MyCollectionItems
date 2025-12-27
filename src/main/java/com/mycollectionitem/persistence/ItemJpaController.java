/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycollectionitem.persistence;
  

import com.mycollectionitem.domain.Item;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class ItemJpaController implements Serializable {

    private EntityManagerFactory emf;

    // 1️⃣ Constructor (OBLIGATORIO)
    public ItemJpaController() {
        this.emf = Persistence.createEntityManagerFactory("MyCollectionItems");
    }

    public ItemJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    // 2️⃣ EntityManager (OBLIGATORIO)
    protected EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    // ================= CRUD =================

    // 3️⃣ CREATE
    public void create(Item item) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(item);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    // 4️⃣ UPDATE
    public void edit(Item item) throws Exception {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            item = em.merge(item);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findItem(item.getId()) == null) {
                throw new EntityNotFoundException(
                        "El Item con id " + item.getId() + " no existe.");
            }
            throw ex;
        } finally {
            em.close();
        }
    }

    // 5️⃣ DELETE
    public void destroy(UUID id) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            Item item;
            try {
                item = em.getReference(Item.class, id);
                item.getId(); // fuerza la carga
            } catch (EntityNotFoundException enfe) {
                throw new EntityNotFoundException(
                        "El Item con id " + id + " no existe.");
            }
            em.remove(item);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    // ================= QUERIES =================

    // 6️⃣ FIND ONE
    public Item findItem(UUID id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Item.class, id);
        } finally {
            em.close();
        }
    }

    // 7️⃣ FIND ALL
    public List<Item> findItemEntities() {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Item> q =
                em.createQuery("SELECT i FROM Item i", Item.class);
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    // 8️⃣ COUNT (opcional pero estándar)
    public long getItemCount() {
        EntityManager em = getEntityManager();
        try {
            return em.createQuery(
                "SELECT COUNT(i) FROM Item i", Long.class)
                .getSingleResult();
        } finally {
            em.close();
        }
    }
}
