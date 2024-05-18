package br.com.rafael.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/controller")
public class PrimeiroController {

    @GetMapping("/metodo")
    public String primeiroMetodo() {
        return "Hello, Spring!";
    }

    @GetMapping("/route-param/{id}")
    public String routeParam(@PathVariable String id) {
        return "Rota com parâmetro\n id = " + id;
    }

    @GetMapping("/route-query")
    public String routeQuery(@RequestParam Map<String, String> allParams) {
        return "Rota com query\n Queries = " + allParams.entrySet();
    }

    @GetMapping("/route-entity/{id}")
    public ResponseEntity<Object> routeEntity(@PathVariable Integer id) {
        if (id < 5) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("O id é menor que 5");
        }

        User exampleUser = new User("Rafael Entity");
        return ResponseEntity.status(HttpStatus.OK).body(exampleUser);
    }

    @PostMapping("/route-body")
    public String routeBody(@RequestBody User user ) {
        return "Nome do usuário: " + user.username;
    }

    @PostMapping("/route-header")
    public String routeHeader(@RequestHeader("name") String header) {
        return "Header name = " + header;
    }

    @PostMapping("/route-headers")
    public String routeHeaders(@RequestHeader Map<String, String> headers) {
        return "Headers = " + headers.entrySet();
    }

    record User(String username) {}
}
