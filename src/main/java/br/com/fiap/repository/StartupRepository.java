package br.com.fiap.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.fiap.entity.Startup;

@Repository
public interface StartupRepository extends CrudRepository<Startup, Integer> {

	@Query("select s from Startup s where s.startup_id = :id")
	public List<Startup> findById(@Param("id") String id);

	@Query("select s from Startup s where s.nome_fantasia = :nome_fantasia")
	public List<Startup> findByNomeFantasia(@Param("nome_fantasia") String nome);
	
	@Query("select s from Startup s where s.cnpj = :cnpj")
	public List<Startup> findByDocument(@Param("cnpj") String cnpj);

	//@Query(value = "delete from Startup s where s.STARTUP_ID = :id", nativeQuery = true)
	//public ResultSet deleteById(@Param("id") String id);
	
//	@Query("select e from Endereco e where e.rua = :rua")
//	public List<Endereco> findByStreet(@Param("rua") String rua);
//	
//	@Query("select e from Endereco e where e.cep = :cep")
//	public List<Endereco> findByPostalCode(@Param("cep") String cep);
//
//	@Query("select e from Endereco e where e.bairro = :bairro")
//	public List<Endereco> findByDistrict(@Param("bairro") String bairro);
//	
//	@Query("select e from Endereco e where e.cidade = :cidade")
//	public List<Endereco> findByCity(@Param("cidade") String cidade);
//	
//	@Query("select e from Endereco e where e.estado = :estado")
//	public List<Endereco> findByState(@Param("estado") String estado);
//	
//	@Query("select e from Endereco e where e.pais = :pais")
//	public List<Endereco> findByCountry(@Param("pais") String pais);
	
}
