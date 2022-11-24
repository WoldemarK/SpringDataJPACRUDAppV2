package com.example.springdatajpacrudappv2.repositories;

import com.example.springdatajpacrudappv2.models.Item;
import com.example.springdatajpacrudappv2.models.Person;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemsRepo {

    List<Item> findByItemName(String itemName);

    List<Item> findByOwner(Person owner);
}
