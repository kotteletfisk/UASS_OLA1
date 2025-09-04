/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.kfisk;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author kotteletfisk
 */
public class ContentDAOFake implements SearchDAO {

    List<ContentMeta> contents;

    public ContentDAOFake() {
        contents = List.of(
            new ContentMeta(1, "Tropic Thunder", "2008", "comedy", 5),            
            new ContentMeta(2, "Free Solo", "2016", "doc", 7),
            new ContentMeta(3, "Free Willy", "idk", "drama", 7)
        );
    }

    @Override
    public List<ContentMeta> searchContent(String input) {
        return contents.stream().filter((c) -> c.title.contains(input)).collect(Collectors.toList());
    }

}
