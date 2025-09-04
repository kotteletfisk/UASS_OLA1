/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kfisk;
import java.util.List;

/**
 *
 * @author kotteletfisk
 */
public class RecommendDAOFake implements RecommendDAO {

    @Override
    public List<ContentMeta> recommendContent() {
        return List.of(new ContentMeta(4, "Borat", "idk", "comedy", 8));
    }

}
