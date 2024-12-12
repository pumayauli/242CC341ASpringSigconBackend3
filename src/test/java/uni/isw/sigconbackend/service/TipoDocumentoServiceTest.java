package uni.isw.sigconbackend.service;

import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import uni.isw.sigconbackend.model.TipoDocumento;


public class TipoDocumentoServiceTest {
    
    public TipoDocumentoServiceTest() {
    }
    
    @BeforeEach
    public void setUp() {
    }

    /**
     * Test of getTipoDocumentos method, of class TipoDocumentoService.
     */
    @Test
    public void testGetTipoDocumentos() {
        System.out.println("getTipoDocumentos");
        TipoDocumentoService instance = new TipoDocumentoService();
        List<TipoDocumento> expResult = null;
        List<TipoDocumento> result = instance.getTipoDocumentos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoDocumento method, of class TipoDocumentoService.
     */
    @Test
    public void testGetTipoDocumento() {
        System.out.println("getTipoDocumento");
        Integer id = null;
        TipoDocumentoService instance = new TipoDocumentoService();
        Optional<TipoDocumento> expResult = null;
        Optional<TipoDocumento> result = instance.getTipoDocumento(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertTipoDocumento method, of class TipoDocumentoService.
     */
    @Test
    public void testInsertTipoDocumento() {
        System.out.println("insertTipoDocumento");
        TipoDocumento tipoDocumento = null;
        TipoDocumentoService instance = new TipoDocumentoService();
        instance.insertTipoDocumento(tipoDocumento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateTipoDocumento method, of class TipoDocumentoService.
     */
    @Test
    public void testUpdateTipoDocumento() {
        System.out.println("updateTipoDocumento");
        TipoDocumento tipoDocumento = null;
        TipoDocumentoService instance = new TipoDocumentoService();
        instance.updateTipoDocumento(tipoDocumento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteTipoDocumento method, of class TipoDocumentoService.
     */
    @Test
    public void testDeleteTipoDocumento() {
        System.out.println("deleteTipoDocumento");
        Integer id = null;
        TipoDocumentoService instance = new TipoDocumentoService();
        instance.deleteTipoDocumento(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
