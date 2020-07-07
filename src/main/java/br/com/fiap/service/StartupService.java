package br.com.fiap.service;

import br.com.fiap.model.StartupJson;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/startup")
public interface StartupService {


    StartupJson createStartup(StartupJson startupJson);
    StartupJson updateStartupById(String payload,String id);
    Iterable<StartupJson> getAllStartups();
    Iterable<StartupJson> getAllUserStartups(String userKey);
    Iterable<StartupJson> findByNomeFantasia(String nome_fantasia);
    void deleteById(String id);


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
