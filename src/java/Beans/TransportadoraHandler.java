package Beans;

import Model.Transportadora;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author guto
 */
public class TransportadoraHandler {
    
    private Transportadora transportadora;
    
    private final List<Transportadora> transportadoraList = new ArrayList<Transportadora>();

    public Transportadora getTransportadora() {
        return transportadora;
    }

    public List<Transportadora> getTransportadoraList() {
        return transportadoraList;
    }

    public void setTransportadora(Transportadora transportadora) {
        this.transportadora = transportadora;
    }

    public String addTransportadora(Transportadora transp) {
        transportadoraList.add(transp);
        return "main";
    }
    
}
