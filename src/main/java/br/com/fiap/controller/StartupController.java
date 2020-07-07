package br.com.fiap.controller;

import br.com.fiap.model.StartupJson;
import br.com.fiap.service.StartupService;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("startup")
public class StartupController {


    private final StartupService startupService;

    public StartupController(StartupService startupService) {
        this.startupService = startupService;
    }

    @Transactional
    @RequestMapping(path = "/create", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<StartupJson> add(@Valid @RequestBody StartupJson startupJson) {

        return null;
    }

    @Transactional
    @RequestMapping(path = "/update/{id}", method = RequestMethod.PATCH)
    @ResponseBody
    public ResponseEntity<String> updateStartupById(@RequestBody String payload, @PathVariable("id") String id) {

        return null;
    }

    @Transactional
    @RequestMapping(path = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseEntity<String> deleteById(@PathVariable String id) {

        return null;
    }

    @Transactional(readOnly = true)
    @RequestMapping(path = "/all", method = RequestMethod.GET)
    @ResponseBody
    public Iterable<StartupJson> getAllStartups() {

        return null;
    }

    @Transactional(readOnly = true)
    @RequestMapping(value = "/nome/{nome_fantasia}", method = RequestMethod.GET)
    @ResponseBody
    public List<StartupJson> findByNomeFantasia(@PathVariable String nome_fantasia) {

        return null;
    }


//   @Transactional(readOnly = true)
//   @RequestMapping(value = "/cnpj/{cnpj}", method = RequestMethod.GET)
//   @ResponseBody
//   public List<StartupJson> findByDocument(@PathVariable String cnpj) {

//       List<StartupJson> startupJsons = new ArrayList<>();


//       startupRepository.findByDocument(cnpj).forEach(startup -> {
//           StartupJson startupJson = new StartupJson();
//           EnderecoJson enderecoJson = new EnderecoJson();

//           startupJson.setCnjp(startup.getCnjp());
//           startupJson.setDataCadastro(startup.getDataCadastro());
//           startupJson.setEmail(startup.getEmail());
//           startupJson.setNomeFantasia(startup.getNomeFantasia());
//           startupJson.setStartupId(startup.getStartupId().toString());

//           enderecoJson.setBairro(startup.getBairro());
//           enderecoJson.setCep(startup.getCep());
//           enderecoJson.setCidade(startup.getCidade());
//           enderecoJson.setEstado(startup.getEstado());
//           enderecoJson.setNumero(startup.getNumero());
//           enderecoJson.setPais(startup.getPais());
//           enderecoJson.setRua(startup.getRua());
//           startupJson.setEndereco(enderecoJson);

//           startupJsons.add(startupJson);
//       });

//       return startupJsons;
//   }


}
