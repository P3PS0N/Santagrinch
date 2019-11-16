package com.p3ps0n.santagrinchs.web.product;

import com.p3ps0n.santagrinchs.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductService productService;

    // Get all Items
    @RequestMapping("")
    public List<Item> getAllItems() { return  productService.getAllItems(); }

    // Get Item by id
    @RequestMapping("/{id}")
    public Optional<Item> getItem(@PathVariable String id) {
        return productService.getItem(id);
    }

    // Create new Item
    @RequestMapping(method = RequestMethod.POST)
    public String createItem(@RequestBody Item item) {
        productService.createItem(item);
        return String.format("Successfully created '%s' item.", item.getName());
    }

    // Delete Item
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public String deleteItem(@PathVariable String id) {
        productService.deleteItem(id);
        return String.format("Successfully deleted '%s' item.", id);
    }


}
