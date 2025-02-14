package dev.korakrit.statesOfItems;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class StatesOfItemsController {
    private final StorageRepository repository;

    StatesOfItemsController(StorageRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/statesOfItems")    
    List<Storage> findAll() {
        return repository.findAll();
    }

    @GetMapping("/statesOfItems/{id}")
    Storage findOne(@PathVariable Long id) {
        Optional<Storage> items =  repository.findById(id);
        if (items.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "There are no items according to the code provided.");
        }
        return items.get();
    }
    
    @PostMapping("/statesOfItems")
    Storage newHandyTool(@RequestBody Storage items) {        
        return repository.save(items);
    }
    
    @PutMapping("/statesOfItems/{id}")
    Storage saveHandyTool(@RequestBody Storage newItems, @PathVariable Long id) {
        return repository.findById(id).map(items -> {
            items.setItemsDetail(newItems.getItemsDetail());
            items.setOwnerName(newItems.getOwnerName());
            items.setStorageName(newItems.getStorageName());
            items.setAvailability(newItems.getAvailability());
            items.setUserName(newItems.getUserName());
            items.setBorrowed(newItems.getBorrowed());
            items.setBorrowingDate(newItems.getBorrowingDate());
            items.setPeriod(newItems.getPeriod());
            items.setWhereUse(newItems.getWhereUse());
            items.setReturned(newItems.getReturned());
            items.setProblem(newItems.getProblem());
            items.setReason(newItems.getReason());
            items.setReturnDate(newItems.getReturnDate());
            items.setStatus(newItems.getStatus());
            return repository.save(items);
        }).orElseGet(() -> {
            return repository.save(newItems);
        });
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/statesOfItems/{id}")
    void deleteHandyTool(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
