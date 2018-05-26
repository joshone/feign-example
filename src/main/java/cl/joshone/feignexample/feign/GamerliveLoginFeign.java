package cl.joshone.feignexample.feign;

import cl.joshone.feignexample.model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "gamerlive-login", url = "http://localhost:10003/gamerlive-login")
public interface GamerliveLoginFeign {

    @GetMapping(value = "/v1/rest/login/all", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<User> getAll();

    @GetMapping(value = "/v1/rest/login/findById/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public User findById(@PathVariable("id") long id);
}
