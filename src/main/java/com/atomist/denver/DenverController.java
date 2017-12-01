package com.atomist.denver;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
class DenverController {
    
    @Autowired public DemoController() {
    }

    /**
     * Access via http://localhost:8081/person/name
     */
    @RequestMapping("person/{name}")
    public Person person(@PathVariable String name) {
        return new Person(name);
    }

}


/**
 * JSON bound object
 */
class Person {

    public String name;

    public Person(String name) {
        this.name = name;
    }
}

