package br.com.fiap.service;

import br.com.fiap.entity.StartupUsuario;
import br.com.fiap.model.StartupUsuarioJson;
import br.com.fiap.repository.UsuarioStartupRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/startup/usuario")
public class UsuarioStartupService {

    @Autowired
    private UsuarioStartupRepository usuarioStartupRepository;

    @Transactional(readOnly = true)
    @PostMapping(value = "/{id}/usuarios/add")
    @ResponseBody
    public ResponseEntity addUserOnStartup(@PathVariable String id, @RequestBody String body) {

        try {

            ObjectMapper mapper = new ObjectMapper();
            StartupUsuarioJson payload = mapper.convertValue(body, StartupUsuarioJson.class);
            StartupUsuario startupUsuario = new StartupUsuario();


            startupUsuario.setUuidUsuario(payload.getUuidUsuario());


            usuarioStartupRepository.save(startupUsuario);

            HttpHeaders headers = new HttpHeaders();
            headers.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON.toString());
            String responseBody = "{\"Mensagem\":\"Cliente adicionado com sucesso\"}";

            return new ResponseEntity<>(responseBody, headers, HttpStatus.CREATED);

        } catch (Exception e) {
            HttpHeaders headers = new HttpHeaders();
            headers.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON.toString());
            String responseBody = "{\"Mensagem\":\"Ocorreu um erro\", \"Exceção\":" + e.getMessage() + "}";

            return new ResponseEntity<>(responseBody, headers, HttpStatus.BAD_REQUEST);
        }

    }

    @Transactional(readOnly = true)
    @GetMapping(value = "/{id}/usuarios/all")
    @ResponseBody
    public List<StartupUsuario> findUsersByStartup(@PathVariable String id) {
        List<StartupUsuario> startupUsuarios = new ArrayList<>();

        try {
            usuarioStartupRepository.findUsersByStartup(id).forEach(result -> {
                StartupUsuario startupUsuario = new StartupUsuario();

                startupUsuario.setUuidUsuario(result.getUuidUsuario());
                startupUsuario.setIdStartp(result.getIdStartp());

                startupUsuarios.add(startupUsuario);
            });

        } catch (Exception e)
        {
            return null;
        }

        return startupUsuarios;
    }

}
