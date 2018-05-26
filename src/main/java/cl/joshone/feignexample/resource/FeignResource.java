package cl.joshone.feignexample.resource;


import cl.joshone.feignexample.feign.GamerliveLoginFeign;
import cl.joshone.feignexample.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class FeignResource {

    @Autowired
    private GamerliveLoginFeign gamerlive;

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<User>> all(){
        return new ResponseEntity<>(gamerlive.getAll(), HttpStatus.OK) ;
    }

    @GetMapping(value = "/find/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<User> all(@PathVariable("id") long id){
        return new ResponseEntity<>(gamerlive.findById(id), HttpStatus.OK) ;
    }
}
