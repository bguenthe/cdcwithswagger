package producer;

public class OttoMarketStock {
    private String partnernummer;
    private String stylenummer;
    private String partnerArtikelnummer;
    private String konzernArtikelnummer;
    private String herstellerMarke;
    private String groesse;
    private String ean;
    private long verkaufspreis;
    private Long partnerbestand;
    private String letzeAenderungPartnerbestand;
    private long verfuegbaerOttoLagerbestand;
    private long nichtVerfuegbaerOttoLagerbestand;
    private long ottoGesamtbestand;
    private long freierGesamtbestand;

    public OttoMarketStock(String partnernummer, String stylenummer, String partner_Artikelnummer, String konzern_Artikelnummer, String hersteller_Marke, String groesse, String ean, long verkaufspreis, Long partnerbestand, String letze_Aenderung_Partnerbestand, long verfuegbaer_OTTO_Lagerbestand, long nicht_Verfuegbaer_OTTO_Lagerbestand, long OTTO_Gesamtbestand, long freier_Gesamtbestand) {
        this.partnernummer = partnernummer;
        this.stylenummer = stylenummer;
        partnerArtikelnummer = partner_Artikelnummer;
        konzernArtikelnummer = konzern_Artikelnummer;
        herstellerMarke = hersteller_Marke;
        this.groesse = groesse;
        this.ean = ean;
        this.verkaufspreis = verkaufspreis;
        this.partnerbestand = partnerbestand;
        letzeAenderungPartnerbestand = letze_Aenderung_Partnerbestand;
        verfuegbaerOttoLagerbestand = verfuegbaer_OTTO_Lagerbestand;
        nichtVerfuegbaerOttoLagerbestand = nicht_Verfuegbaer_OTTO_Lagerbestand;
        this.ottoGesamtbestand = OTTO_Gesamtbestand;
        freierGesamtbestand = freier_Gesamtbestand;
    }

    public String getPartnernummer() {
        return partnernummer;
    }

    public void setPartnernummer(String partnernummer) {
        this.partnernummer = partnernummer;
    }

    public String getStylenummer() {
        return stylenummer;
    }

    public void setStylenummer(String stylenummer) {
        this.stylenummer = stylenummer;
    }

    public String getPartnerArtikelnummer() {
        return partnerArtikelnummer;
    }

    public void setPartnerArtikelnummer(String partnerArtikelnummer) {
        this.partnerArtikelnummer = partnerArtikelnummer;
    }

    public String getKonzernArtikelnummer() {
        return konzernArtikelnummer;
    }

    public void setKonzernArtikelnummer(String konzernArtikelnummer) {
        this.konzernArtikelnummer = konzernArtikelnummer;
    }

    public String getHerstellerMarke() {
        return herstellerMarke;
    }

    public void setHerstellerMarke(String herstellerMarke) {
        this.herstellerMarke = herstellerMarke;
    }

    public String getGroesse() {
        return groesse;
    }

    public void setGroesse(String groesse) {
        this.groesse = groesse;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public long getVerkaufspreis() {
        return verkaufspreis;
    }

    public void setVerkaufspreis(long verkaufspreis) {
        this.verkaufspreis = verkaufspreis;
    }

    public Long getPartnerbestand() {
        return partnerbestand;
    }

    public void setPartnerbestand(Long partnerbestand) {
        this.partnerbestand = partnerbestand;
    }

    public String getLetzeAenderungPartnerbestand() {
        return letzeAenderungPartnerbestand;
    }

    public void setLetzeAenderungPartnerbestand(String letzeAenderungPartnerbestand) {
        this.letzeAenderungPartnerbestand = letzeAenderungPartnerbestand;
    }

    public long getVerfuegbaerOttoLagerbestand() {
        return verfuegbaerOttoLagerbestand;
    }

    public void setVerfuegbaerOttoLagerbestand(long verfuegbaerOttoLagerbestand) {
        this.verfuegbaerOttoLagerbestand = verfuegbaerOttoLagerbestand;
    }

    public long getNichtVerfuegbaerOttoLagerbestand() {
        return nichtVerfuegbaerOttoLagerbestand;
    }

    public void setNichtVerfuegbaerOttoLagerbestand(long nichtVerfuegbaerOttoLagerbestand) {
        this.nichtVerfuegbaerOttoLagerbestand = nichtVerfuegbaerOttoLagerbestand;
    }

    public long getOttoGesamtbestand() {
        return ottoGesamtbestand;
    }

    public void setOttoGesamtbestand(long ottoGesamtbestand) {
        this.ottoGesamtbestand = ottoGesamtbestand;
    }

    public long getFreierGesamtbestand() {
        return freierGesamtbestand;
    }

    public void setFreierGesamtbestand(long freierGesamtbestand) {
        this.freierGesamtbestand = freierGesamtbestand;
    }
}
