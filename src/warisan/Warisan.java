package warisan;

import java.awt.event.KeyEvent;

/**
 *
 * @author erina
 */
public class Warisan {
    private Double hartaWaris;
    private Double Suami;
    private Double Istri;
    private Double Ayah;
    private Double Ibu;
    private Double AnakLk;
    private Double AnakPrm;

    public Double getHartaWaris() {
        return hartaWaris;
    }

    public void setHartaWaris(Double hartaWaris) {
        this.hartaWaris = hartaWaris;
    }

    public Double getSuami() {
        return Suami;
    }

    public void setSuami(Double Suami) {
        this.Suami = Suami;
    }

    public Double getIstri() {
        return Istri;
    }

    public void setIstri(Double Istri) {
        this.Istri = Istri;
    }

    public Double getAyah() {
        return Ayah;
    }

    public void setAyah(Double Ayah) {
        this.Ayah = Ayah;
    }

    public Double getIbu() {
        return Ibu;
    }

    public void setIbu(Double Ibu) {
        this.Ibu = Ibu;
    }

    public Double getAnakLk() {
        return AnakLk;
    }

    public void setAnakLk(Double AnakLk) {
        this.AnakLk = AnakLk;
    }

    public Double getAnakPrm() {
        return AnakPrm;
    }

    public void setAnakPrm(Double AnakPrm) {
        this.AnakPrm = AnakPrm;
    }
    
    public void wajibAngka(java.awt.event.KeyEvent evt) {
        char angka = evt.getKeyChar();
        if(!(Character.isDigit(angka))
                || (angka == KeyEvent.VK_BACK_SPACE)
                || (angka == KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }
}
