package com.p3ps0n.santagrinchs.web.product;

import com.p3ps0n.santagrinchs.model.Item;
import com.p3ps0n.santagrinchs.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private ItemRepository itemRepository;

    public ProductService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> getAllItems() {
        List<Item> topics = new ArrayList<>();
        itemRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Optional<Item> getItem(String  id) {
        return itemRepository.findById(id);
    }

    public void createItem(Item topic) {
        itemRepository.save(topic);
    }

    public void deleteItem(String id) {
        itemRepository.deleteById(id);
    }

    public void editTopic(Item topic) {
        itemRepository.save(topic);
    }


}
