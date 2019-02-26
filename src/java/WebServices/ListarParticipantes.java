/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebServices;

import controller.ParticipanteJpaController;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.Persistence;

/**
 *
 * @author lenovo
 */
@WebService(serviceName = "ListarParticipantes")
public class ListarParticipantes {

    

    /**
     * Web service operation
     */
    @WebMethod(operationName = "listaParticipantes")
    public String listaParticipantes() {
        ParticipanteJpaController participantes = new ParticipanteJpaController(Persistence.createEntityManagerFactory("Ws-Soap-ListarParticipantesPU"));
        
        return participantes.findParticipanteEntities().toString();
    }
}
