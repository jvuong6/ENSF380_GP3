package edu.ucalgary.oop;

public class Location {
    private String name;
    private String address;
    private DisasterVictim[] occupants;
    private Supply[] supplies;

    public Location(String name, String address) {
        this.name = name;
        this.address = address;
        this.supplies = new Supply[0];
        this.occupants = new DisasterVictim[0];
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public DisasterVictim[] getOccupants(){
        return this.occupants;
    }

    public Supplies[] getSupplies() {
        return this.supplies;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setOccupants(DisasterVictim[] occupants) {
        this.occupants = occupants;
    }

    public void setSupplies(Supply[] supplies) {
        this.supplies = supplies;
    }

    public void addOccupant(DisasterVictim newOccupant) {
        occupants.add(newOccupant);
    }

    public void addSupply(Supply newSupply) {
        supplies.add(newSupply);
    }

    public void removeOccupant(DisasterVictim remove) {
        DisasterVictim[] new_occupants = new DisasterVictim[occupants.length - 1];
        int j = 0;

        for (int i = 0; i < occupants.length; i++) {
            if (!occupants[i].equals(remove)) {
                new_occupants[j] = occupants[i];
                j++;
            }
        }

        occupants = new_occupants;
    }

    public void removeSupply(Supply remove) {
        Supply[] new_supplies = new Supply[supplies.length - 1];
        int j = 0;

        for (int i = 0; i < supplies.length; i++) {
            if (!supplies[i].equals(remove)) {
                new_supplies[j] = supplies[i];
                j++;
            }
        }

        supplies = new_supplies;
    }
}
