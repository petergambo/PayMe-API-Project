package com.payme.payme.api;
import  com.payme.payme.model.Person;
import  com.payme.payme.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

//import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/person")
@RestController
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {

        this.personService = personService;
    }

    @PostMapping("/add")
    public void addPerson(@RequestBody Person person) {
        personService.addPerson(person);
    }
    @GetMapping("/getAll")
    public List<Person> getAllPeople() {
        return personService.getAllPeople();
    }

    @GetMapping("/{id}")
    public Person getPersonById(@PathVariable("id") UUID id) {
        return personService.getPersonById(id)
                .orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deletePerson(@PathVariable("id") UUID id) {
        personService.deletePerson(id);
    }

    @PutMapping
    public void updatePerson(@PathVariable("id") UUID id, @NonNull @RequestBody Person personToUpdate) {
        personService.updatePerson(id, personToUpdate);
    }
}
