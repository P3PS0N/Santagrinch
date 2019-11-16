package com.p3ps0n.santagrinchs.repository;

import com.p3ps0n.santagrinchs.model.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, String> {

}
