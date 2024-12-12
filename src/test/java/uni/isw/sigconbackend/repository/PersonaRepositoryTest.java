/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package uni.isw.sigconbackend.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import uni.isw.sigconbackend.model.Persona;
import uni.isw.sigconbackend.model.TipoDocumento;
import uni.isw.sigconbackend.model.Ubigeo;

@DataJpaTest
@AutoConfigureTestDatabase(connection=EmbeddedDatabaseConnection.H2)
public class PersonaRepositoryTest {
    
    @Autowired
    PersonaRepository personaRepository;
    @Autowired
    TipoDocumentoRepository tipoDocumentoRepository;
    @Autowired
    UbigeoRepository ubigeoReository;
    
    private TipoDocumento tipoDocumento;
    private Ubigeo ubigeo;
    
    @BeforeEach
    public void setUp() {
    }
    
    
    private void init(){
        tipoDocumento=TipoDocumento.builder()
               .idTipoDocumento(1)
               .descripcion("DNI")
               .build();
    TipoDocumento newTipoDocumento=tipoDocumentoRepository.save(tipoDocumento);
    
    Ubigeo ubigeo1=Ubigeo.builder()
          .idUbigeo("150114")
          .departamento("Lima")
            .provincia("Lima")
            .distrito("La Molina").build();
    ubigeo1=ubigeoRepository.save(ubigeo1);
    
    Ubigeo ubigeo2=Ubigeo.builder()
          .idUbigeo("150114")
          .departamento("Lima")
            .provincia("Lima")
            .distrito("La Molina").build();
    ubigeo2=ubigeoRepository.save(ubigeo2);
    
    Persona persona1=Persona.builder()
         .apellidoPaterno("Cavero")
         .apellidoMaterno("Alva")
         .nombres("Alejandro")
         .fechaNacimiento(new Date(2000-04-05))
          .nDocumento("3334928")
          .direccion("Av.los Fresnos 932")
          .tipoDocumento(tipoDocumento)
          .ubigeo(ubigeo1).build();
         Persona newPersona2=personaRepository.save(persona1);
         
         
     
    }
    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
