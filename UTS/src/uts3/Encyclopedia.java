package uts3;

public class Encyclopedia extends Print{


    Integer Volume;
    Integer Edition;

    public Integer getVolume() {
        return Volume;
    }
    public void setVolume(Integer volume) {
        Volume = volume;
    }
    public Integer getEdition() {
        return Edition;
    }
    public void setEdition(Integer edition) {
        Edition = edition;
    }

    void setVolume(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setEdition(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}