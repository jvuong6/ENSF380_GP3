package edu.ucalgary.oop;

import java.util.ArrayList;
import java.util.List;

public class Location {
    private String name;
    private String address;
    private List<DisasterVictim> occupants;
    private List<Supply> supplies;

    public Location(String name, String address) {
        this.name = name;
        this.address = address;
        this.supplies = new ArrayList<>();
        this.occupants = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public List<DisasterVictim> getOccupants(){
        return this.occupants;
    }

    public List<Supply> getSupplies() {
        return this.supplies;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setOccupants(List<DisasterVictim> occupants) {
        this.occupants = occupants;
    }

    public void setSupplies(List<Supply> supplies) {
        this.supplies = supplies;
    }

    public void addOccupant(DisasterVictim newOccupant) {
        occupants.add(newOccupant);
    }

    public void addSupply(Supply newSupply) {
        supplies.add(newSupply);
    }

    public void removeOccupant(DisasterVictim remove) {
        occupants.remove(remove);
    }

    public void removeSupply(Supply remove) {
        supplies.remove(remove);
    }
}