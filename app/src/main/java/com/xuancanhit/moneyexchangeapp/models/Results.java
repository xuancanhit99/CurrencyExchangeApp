package com.xuancanhit.moneyexchangeapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;


public class Results {

    @SerializedName("AED")
    @Expose
    private Double aed;
    @SerializedName("AFN")
    @Expose
    private Double afn;
    @SerializedName("ALL")
    @Expose
    private Double all;
    @SerializedName("AMD")
    @Expose
    private Double amd;
    @SerializedName("ANG")
    @Expose
    private Double ang;
    @SerializedName("AOA")
    @Expose
    private Double aoa;
    @SerializedName("ARS")
    @Expose
    private Double ars;
    @SerializedName("AUD")
    @Expose
    private Double aud;
    @SerializedName("AWG")
    @Expose
    private Double awg;
    @SerializedName("AZN")
    @Expose
    private Double azn;
    @SerializedName("BAM")
    @Expose
    private Double bam;
    @SerializedName("BBD")
    @Expose
    private Double bbd;
    @SerializedName("BDT")
    @Expose
    private Double bdt;
    @SerializedName("BGN")
    @Expose
    private Double bgn;
    @SerializedName("BHD")
    @Expose
    private Double bhd;
    @SerializedName("BIF")
    @Expose
    private Double bif;
    @SerializedName("BMD")
    @Expose
    private Double bmd;
    @SerializedName("BND")
    @Expose
    private Double bnd;
    @SerializedName("BOB")
    @Expose
    private Double bob;
    @SerializedName("BRL")
    @Expose
    private Double brl;
    @SerializedName("BSD")
    @Expose
    private Double bsd;
    @SerializedName("BTN")
    @Expose
    private Double btn;
    @SerializedName("BWP")
    @Expose
    private Double bwp;
    @SerializedName("BZD")
    @Expose
    private Double bzd;
    @SerializedName("CAD")
    @Expose
    private Double cad;
    @SerializedName("CDF")
    @Expose
    private Double cdf;
    @SerializedName("CHF")
    @Expose
    private Double chf;
    @SerializedName("CLF")
    @Expose
    private Double clf;
    @SerializedName("CLP")
    @Expose
    private Double clp;
    @SerializedName("CNH")
    @Expose
    private Double cnh;
    @SerializedName("CNY")
    @Expose
    private Double cny;
    @SerializedName("COP")
    @Expose
    private Double cop;
    @SerializedName("CUP")
    @Expose
    private Double cup;
    @SerializedName("CVE")
    @Expose
    private Double cve;
    @SerializedName("CZK")
    @Expose
    private Double czk;
    @SerializedName("DJF")
    @Expose
    private Double djf;
    @SerializedName("DKK")
    @Expose
    private Double dkk;
    @SerializedName("DOP")
    @Expose
    private Double dop;
    @SerializedName("DZD")
    @Expose
    private Double dzd;
    @SerializedName("EGP")
    @Expose
    private Double egp;
    @SerializedName("ERN")
    @Expose
    private Double ern;
    @SerializedName("ETB")
    @Expose
    private Double etb;
    @SerializedName("EUR")
    @Expose
    private Double eur;
    @SerializedName("FJD")
    @Expose
    private Double fjd;
    @SerializedName("FKP")
    @Expose
    private Double fkp;
    @SerializedName("GBP")
    @Expose
    private Double gbp;
    @SerializedName("GEL")
    @Expose
    private Double gel;
    @SerializedName("GHS")
    @Expose
    private Double ghs;
    @SerializedName("GIP")
    @Expose
    private Double gip;
    @SerializedName("GMD")
    @Expose
    private Double gmd;
    @SerializedName("GNF")
    @Expose
    private Double gnf;
    @SerializedName("GTQ")
    @Expose
    private Double gtq;
    @SerializedName("GYD")
    @Expose
    private Double gyd;
    @SerializedName("HKD")
    @Expose
    private Double hkd;
    @SerializedName("HNL")
    @Expose
    private Double hnl;
    @SerializedName("HRK")
    @Expose
    private Double hrk;
    @SerializedName("HTG")
    @Expose
    private Double htg;
    @SerializedName("HUF")
    @Expose
    private Double huf;
    @SerializedName("IDR")
    @Expose
    private Double idr;
    @SerializedName("ILS")
    @Expose
    private Double ils;
    @SerializedName("INR")
    @Expose
    private Double inr;
    @SerializedName("IQD")
    @Expose
    private Double iqd;
    @SerializedName("IRR")
    @Expose
    private Double irr;
    @SerializedName("ISK")
    @Expose
    private Double isk;
    @SerializedName("JMD")
    @Expose
    private Double jmd;
    @SerializedName("JOD")
    @Expose
    private Double jod;
    @SerializedName("JPY")
    @Expose
    private Double jpy;
    @SerializedName("KES")
    @Expose
    private Double kes;
    @SerializedName("KGS")
    @Expose
    private Double kgs;
    @SerializedName("KHR")
    @Expose
    private Double khr;
    @SerializedName("KMF")
    @Expose
    private Double kmf;
    @SerializedName("KPW")
    @Expose
    private Double kpw;
    @SerializedName("KRW")
    @Expose
    private Double krw;
    @SerializedName("KWD")
    @Expose
    private Double kwd;
    @SerializedName("KYD")
    @Expose
    private Double kyd;
    @SerializedName("KZT")
    @Expose
    private Double kzt;
    @SerializedName("LAK")
    @Expose
    private Double lak;
    @SerializedName("LBP")
    @Expose
    private Double lbp;
    @SerializedName("LKR")
    @Expose
    private Double lkr;
    @SerializedName("LRD")
    @Expose
    private Double lrd;
    @SerializedName("LSL")
    @Expose
    private Double lsl;
    @SerializedName("LYD")
    @Expose
    private Double lyd;
    @SerializedName("MAD")
    @Expose
    private Double mad;
    @SerializedName("MDL")
    @Expose
    private Double mdl;
    @SerializedName("MGA")
    @Expose
    private Double mga;
    @SerializedName("MKD")
    @Expose
    private Double mkd;
    @SerializedName("MMK")
    @Expose
    private Double mmk;
    @SerializedName("MNT")
    @Expose
    private Double mnt;
    @SerializedName("MOP")
    @Expose
    private Double mop;
    @SerializedName("MRU")
    @Expose
    private Double mru;
    @SerializedName("MUR")
    @Expose
    private Double mur;
    @SerializedName("MVR")
    @Expose
    private Double mvr;
    @SerializedName("MWK")
    @Expose
    private Double mwk;
    @SerializedName("MXN")
    @Expose
    private Double mxn;
    @SerializedName("MYR")
    @Expose
    private Double myr;
    @SerializedName("MZN")
    @Expose
    private Double mzn;
    @SerializedName("NAD")
    @Expose
    private Double nad;
    @SerializedName("NGN")
    @Expose
    private Double ngn;
    @SerializedName("NOK")
    @Expose
    private Double nok;
    @SerializedName("NPR")
    @Expose
    private Double npr;
    @SerializedName("NZD")
    @Expose
    private Double nzd;
    @SerializedName("OMR")
    @Expose
    private Double omr;
    @SerializedName("PAB")
    @Expose
    private Double pab;
    @SerializedName("PEN")
    @Expose
    private Double pen;
    @SerializedName("PGK")
    @Expose
    private Double pgk;
    @SerializedName("PHP")
    @Expose
    private Double php;
    @SerializedName("PKR")
    @Expose
    private Double pkr;
    @SerializedName("PLN")
    @Expose
    private Double pln;
    @SerializedName("PYG")
    @Expose
    private Double pyg;
    @SerializedName("QAR")
    @Expose
    private Double qar;
    @SerializedName("RON")
    @Expose
    private Double ron;
    @SerializedName("RSD")
    @Expose
    private Double rsd;
    @SerializedName("RUB")
    @Expose
    private Double rub;
    @SerializedName("RWF")
    @Expose
    private Double rwf;
    @SerializedName("SAR")
    @Expose
    private Double sar;
    @SerializedName("SCR")
    @Expose
    private Double scr;
    @SerializedName("SDG")
    @Expose
    private Double sdg;
    @SerializedName("SEK")
    @Expose
    private Double sek;
    @SerializedName("SGD")
    @Expose
    private Double sgd;
    @SerializedName("SHP")
    @Expose
    private Double shp;
    @SerializedName("SLL")
    @Expose
    private Double sll;
    @SerializedName("SOS")
    @Expose
    private Double sos;
    @SerializedName("SRD")
    @Expose
    private Double srd;
    @SerializedName("SYP")
    @Expose
    private Double syp;
    @SerializedName("SZL")
    @Expose
    private Double szl;
    @SerializedName("THB")
    @Expose
    private Double thb;
    @SerializedName("TJS")
    @Expose
    private Double tjs;
    @SerializedName("TMT")
    @Expose
    private Double tmt;
    @SerializedName("TND")
    @Expose
    private Double tnd;
    @SerializedName("TOP")
    @Expose
    private Double top;
    @SerializedName("TRY")
    @Expose
    private Double _try;
    @SerializedName("TTD")
    @Expose
    private Double ttd;
    @SerializedName("TWD")
    @Expose
    private Double twd;
    @SerializedName("TZS")
    @Expose
    private Double tzs;
    @SerializedName("UAH")
    @Expose
    private Double uah;
    @SerializedName("UGX")
    @Expose
    private Double ugx;
    @SerializedName("USD")
    @Expose
    private Double usd;
    @SerializedName("UYU")
    @Expose
    private Double uyu;
    @SerializedName("UZS")
    @Expose
    private Double uzs;
    @SerializedName("VND")
    @Expose
    private Double vnd;
    @SerializedName("VUV")
    @Expose
    private Double vuv;
    @SerializedName("WST")
    @Expose
    private Double wst;
    @SerializedName("XAF")
    @Expose
    private Double xaf;
    @SerializedName("XCD")
    @Expose
    private Double xcd;
    @SerializedName("XDR")
    @Expose
    private Double xdr;
    @SerializedName("XOF")
    @Expose
    private Double xof;
    @SerializedName("XPF")
    @Expose
    private Double xpf;
    @SerializedName("YER")
    @Expose
    private Double yer;
    @SerializedName("ZAR")
    @Expose
    private Double zar;
    @SerializedName("ZMW")
    @Expose
    private Double zmw;

    public Double getAed() {
        return aed;
    }

    public void setAed(Double aed) {
        this.aed = aed;
    }

    public Double getAfn() {
        return afn;
    }

    public void setAfn(Double afn) {
        this.afn = afn;
    }

    public Double getAll() {
        return all;
    }

    public void setAll(Double all) {
        this.all = all;
    }

    public Double getAmd() {
        return amd;
    }

    public void setAmd(Double amd) {
        this.amd = amd;
    }

    public Double getAng() {
        return ang;
    }

    public void setAng(Double ang) {
        this.ang = ang;
    }

    public Double getAoa() {
        return aoa;
    }

    public void setAoa(Double aoa) {
        this.aoa = aoa;
    }

    public Double getArs() {
        return ars;
    }

    public void setArs(Double ars) {
        this.ars = ars;
    }

    public Double getAud() {
        return aud;
    }

    public void setAud(Double aud) {
        this.aud = aud;
    }

    public Double getAwg() {
        return awg;
    }

    public void setAwg(Double awg) {
        this.awg = awg;
    }

    public Double getAzn() {
        return azn;
    }

    public void setAzn(Double azn) {
        this.azn = azn;
    }

    public Double getBam() {
        return bam;
    }

    public void setBam(Double bam) {
        this.bam = bam;
    }

    public Double getBbd() {
        return bbd;
    }

    public void setBbd(Double bbd) {
        this.bbd = bbd;
    }

    public Double getBdt() {
        return bdt;
    }

    public void setBdt(Double bdt) {
        this.bdt = bdt;
    }

    public Double getBgn() {
        return bgn;
    }

    public void setBgn(Double bgn) {
        this.bgn = bgn;
    }

    public Double getBhd() {
        return bhd;
    }

    public void setBhd(Double bhd) {
        this.bhd = bhd;
    }

    public Double getBif() {
        return bif;
    }

    public void setBif(Double bif) {
        this.bif = bif;
    }

    public Double getBmd() {
        return bmd;
    }

    public void setBmd(Double bmd) {
        this.bmd = bmd;
    }

    public Double getBnd() {
        return bnd;
    }

    public void setBnd(Double bnd) {
        this.bnd = bnd;
    }

    public Double getBob() {
        return bob;
    }

    public void setBob(Double bob) {
        this.bob = bob;
    }

    public Double getBrl() {
        return brl;
    }

    public void setBrl(Double brl) {
        this.brl = brl;
    }

    public Double getBsd() {
        return bsd;
    }

    public void setBsd(Double bsd) {
        this.bsd = bsd;
    }

    public Double getBtn() {
        return btn;
    }

    public void setBtn(Double btn) {
        this.btn = btn;
    }

    public Double getBwp() {
        return bwp;
    }

    public void setBwp(Double bwp) {
        this.bwp = bwp;
    }

    public Double getBzd() {
        return bzd;
    }

    public void setBzd(Double bzd) {
        this.bzd = bzd;
    }

    public Double getCad() {
        return cad;
    }

    public void setCad(Double cad) {
        this.cad = cad;
    }

    public Double getCdf() {
        return cdf;
    }

    public void setCdf(Double cdf) {
        this.cdf = cdf;
    }

    public Double getChf() {
        return chf;
    }

    public void setChf(Double chf) {
        this.chf = chf;
    }

    public Double getClf() {
        return clf;
    }

    public void setClf(Double clf) {
        this.clf = clf;
    }

    public Double getClp() {
        return clp;
    }

    public void setClp(Double clp) {
        this.clp = clp;
    }

    public Double getCnh() {
        return cnh;
    }

    public void setCnh(Double cnh) {
        this.cnh = cnh;
    }

    public Double getCny() {
        return cny;
    }

    public void setCny(Double cny) {
        this.cny = cny;
    }

    public Double getCop() {
        return cop;
    }

    public void setCop(Double cop) {
        this.cop = cop;
    }

    public Double getCup() {
        return cup;
    }

    public void setCup(Double cup) {
        this.cup = cup;
    }

    public Double getCve() {
        return cve;
    }

    public void setCve(Double cve) {
        this.cve = cve;
    }

    public Double getCzk() {
        return czk;
    }

    public void setCzk(Double czk) {
        this.czk = czk;
    }

    public Double getDjf() {
        return djf;
    }

    public void setDjf(Double djf) {
        this.djf = djf;
    }

    public Double getDkk() {
        return dkk;
    }

    public void setDkk(Double dkk) {
        this.dkk = dkk;
    }

    public Double getDop() {
        return dop;
    }

    public void setDop(Double dop) {
        this.dop = dop;
    }

    public Double getDzd() {
        return dzd;
    }

    public void setDzd(Double dzd) {
        this.dzd = dzd;
    }

    public Double getEgp() {
        return egp;
    }

    public void setEgp(Double egp) {
        this.egp = egp;
    }

    public Double getErn() {
        return ern;
    }

    public void setErn(Double ern) {
        this.ern = ern;
    }

    public Double getEtb() {
        return etb;
    }

    public void setEtb(Double etb) {
        this.etb = etb;
    }

    public Double getEur() {
        return eur;
    }

    public void setEur(Double eur) {
        this.eur = eur;
    }

    public Double getFjd() {
        return fjd;
    }

    public void setFjd(Double fjd) {
        this.fjd = fjd;
    }

    public Double getFkp() {
        return fkp;
    }

    public void setFkp(Double fkp) {
        this.fkp = fkp;
    }

    public Double getGbp() {
        return gbp;
    }

    public void setGbp(Double gbp) {
        this.gbp = gbp;
    }

    public Double getGel() {
        return gel;
    }

    public void setGel(Double gel) {
        this.gel = gel;
    }

    public Double getGhs() {
        return ghs;
    }

    public void setGhs(Double ghs) {
        this.ghs = ghs;
    }

    public Double getGip() {
        return gip;
    }

    public void setGip(Double gip) {
        this.gip = gip;
    }

    public Double getGmd() {
        return gmd;
    }

    public void setGmd(Double gmd) {
        this.gmd = gmd;
    }

    public Double getGnf() {
        return gnf;
    }

    public void setGnf(Double gnf) {
        this.gnf = gnf;
    }

    public Double getGtq() {
        return gtq;
    }

    public void setGtq(Double gtq) {
        this.gtq = gtq;
    }

    public Double getGyd() {
        return gyd;
    }

    public void setGyd(Double gyd) {
        this.gyd = gyd;
    }

    public Double getHkd() {
        return hkd;
    }

    public void setHkd(Double hkd) {
        this.hkd = hkd;
    }

    public Double getHnl() {
        return hnl;
    }

    public void setHnl(Double hnl) {
        this.hnl = hnl;
    }

    public Double getHrk() {
        return hrk;
    }

    public void setHrk(Double hrk) {
        this.hrk = hrk;
    }

    public Double getHtg() {
        return htg;
    }

    public void setHtg(Double htg) {
        this.htg = htg;
    }

    public Double getHuf() {
        return huf;
    }

    public void setHuf(Double huf) {
        this.huf = huf;
    }

    public Double getIdr() {
        return idr;
    }

    public void setIdr(Double idr) {
        this.idr = idr;
    }

    public Double getIls() {
        return ils;
    }

    public void setIls(Double ils) {
        this.ils = ils;
    }

    public Double getInr() {
        return inr;
    }

    public void setInr(Double inr) {
        this.inr = inr;
    }

    public Double getIqd() {
        return iqd;
    }

    public void setIqd(Double iqd) {
        this.iqd = iqd;
    }

    public Double getIrr() {
        return irr;
    }

    public void setIrr(Double irr) {
        this.irr = irr;
    }

    public Double getIsk() {
        return isk;
    }

    public void setIsk(Double isk) {
        this.isk = isk;
    }

    public Double getJmd() {
        return jmd;
    }

    public void setJmd(Double jmd) {
        this.jmd = jmd;
    }

    public Double getJod() {
        return jod;
    }

    public void setJod(Double jod) {
        this.jod = jod;
    }

    public Double getJpy() {
        return jpy;
    }

    public void setJpy(Double jpy) {
        this.jpy = jpy;
    }

    public Double getKes() {
        return kes;
    }

    public void setKes(Double kes) {
        this.kes = kes;
    }

    public Double getKgs() {
        return kgs;
    }

    public void setKgs(Double kgs) {
        this.kgs = kgs;
    }

    public Double getKhr() {
        return khr;
    }

    public void setKhr(Double khr) {
        this.khr = khr;
    }

    public Double getKmf() {
        return kmf;
    }

    public void setKmf(Double kmf) {
        this.kmf = kmf;
    }

    public Double getKpw() {
        return kpw;
    }

    public void setKpw(Double kpw) {
        this.kpw = kpw;
    }

    public Double getKrw() {
        return krw;
    }

    public void setKrw(Double krw) {
        this.krw = krw;
    }

    public Double getKwd() {
        return kwd;
    }

    public void setKwd(Double kwd) {
        this.kwd = kwd;
    }

    public Double getKyd() {
        return kyd;
    }

    public void setKyd(Double kyd) {
        this.kyd = kyd;
    }

    public Double getKzt() {
        return kzt;
    }

    public void setKzt(Double kzt) {
        this.kzt = kzt;
    }

    public Double getLak() {
        return lak;
    }

    public void setLak(Double lak) {
        this.lak = lak;
    }

    public Double getLbp() {
        return lbp;
    }

    public void setLbp(Double lbp) {
        this.lbp = lbp;
    }

    public Double getLkr() {
        return lkr;
    }

    public void setLkr(Double lkr) {
        this.lkr = lkr;
    }

    public Double getLrd() {
        return lrd;
    }

    public void setLrd(Double lrd) {
        this.lrd = lrd;
    }

    public Double getLsl() {
        return lsl;
    }

    public void setLsl(Double lsl) {
        this.lsl = lsl;
    }

    public Double getLyd() {
        return lyd;
    }

    public void setLyd(Double lyd) {
        this.lyd = lyd;
    }

    public Double getMad() {
        return mad;
    }

    public void setMad(Double mad) {
        this.mad = mad;
    }

    public Double getMdl() {
        return mdl;
    }

    public void setMdl(Double mdl) {
        this.mdl = mdl;
    }

    public Double getMga() {
        return mga;
    }

    public void setMga(Double mga) {
        this.mga = mga;
    }

    public Double getMkd() {
        return mkd;
    }

    public void setMkd(Double mkd) {
        this.mkd = mkd;
    }

    public Double getMmk() {
        return mmk;
    }

    public void setMmk(Double mmk) {
        this.mmk = mmk;
    }

    public Double getMnt() {
        return mnt;
    }

    public void setMnt(Double mnt) {
        this.mnt = mnt;
    }

    public Double getMop() {
        return mop;
    }

    public void setMop(Double mop) {
        this.mop = mop;
    }

    public Double getMru() {
        return mru;
    }

    public void setMru(Double mru) {
        this.mru = mru;
    }

    public Double getMur() {
        return mur;
    }

    public void setMur(Double mur) {
        this.mur = mur;
    }

    public Double getMvr() {
        return mvr;
    }

    public void setMvr(Double mvr) {
        this.mvr = mvr;
    }

    public Double getMwk() {
        return mwk;
    }

    public void setMwk(Double mwk) {
        this.mwk = mwk;
    }

    public Double getMxn() {
        return mxn;
    }

    public void setMxn(Double mxn) {
        this.mxn = mxn;
    }

    public Double getMyr() {
        return myr;
    }

    public void setMyr(Double myr) {
        this.myr = myr;
    }

    public Double getMzn() {
        return mzn;
    }

    public void setMzn(Double mzn) {
        this.mzn = mzn;
    }

    public Double getNad() {
        return nad;
    }

    public void setNad(Double nad) {
        this.nad = nad;
    }

    public Double getNgn() {
        return ngn;
    }

    public void setNgn(Double ngn) {
        this.ngn = ngn;
    }

    public Double getNok() {
        return nok;
    }

    public void setNok(Double nok) {
        this.nok = nok;
    }

    public Double getNpr() {
        return npr;
    }

    public void setNpr(Double npr) {
        this.npr = npr;
    }

    public Double getNzd() {
        return nzd;
    }

    public void setNzd(Double nzd) {
        this.nzd = nzd;
    }

    public Double getOmr() {
        return omr;
    }

    public void setOmr(Double omr) {
        this.omr = omr;
    }

    public Double getPab() {
        return pab;
    }

    public void setPab(Double pab) {
        this.pab = pab;
    }

    public Double getPen() {
        return pen;
    }

    public void setPen(Double pen) {
        this.pen = pen;
    }

    public Double getPgk() {
        return pgk;
    }

    public void setPgk(Double pgk) {
        this.pgk = pgk;
    }

    public Double getPhp() {
        return php;
    }

    public void setPhp(Double php) {
        this.php = php;
    }

    public Double getPkr() {
        return pkr;
    }

    public void setPkr(Double pkr) {
        this.pkr = pkr;
    }

    public Double getPln() {
        return pln;
    }

    public void setPln(Double pln) {
        this.pln = pln;
    }

    public Double getPyg() {
        return pyg;
    }

    public void setPyg(Double pyg) {
        this.pyg = pyg;
    }

    public Double getQar() {
        return qar;
    }

    public void setQar(Double qar) {
        this.qar = qar;
    }

    public Double getRon() {
        return ron;
    }

    public void setRon(Double ron) {
        this.ron = ron;
    }

    public Double getRsd() {
        return rsd;
    }

    public void setRsd(Double rsd) {
        this.rsd = rsd;
    }

    public Double getRub() {
        return rub;
    }

    public void setRub(Double rub) {
        this.rub = rub;
    }

    public Double getRwf() {
        return rwf;
    }

    public void setRwf(Double rwf) {
        this.rwf = rwf;
    }

    public Double getSar() {
        return sar;
    }

    public void setSar(Double sar) {
        this.sar = sar;
    }

    public Double getScr() {
        return scr;
    }

    public void setScr(Double scr) {
        this.scr = scr;
    }

    public Double getSdg() {
        return sdg;
    }

    public void setSdg(Double sdg) {
        this.sdg = sdg;
    }

    public Double getSek() {
        return sek;
    }

    public void setSek(Double sek) {
        this.sek = sek;
    }

    public Double getSgd() {
        return sgd;
    }

    public void setSgd(Double sgd) {
        this.sgd = sgd;
    }

    public Double getShp() {
        return shp;
    }

    public void setShp(Double shp) {
        this.shp = shp;
    }

    public Double getSll() {
        return sll;
    }

    public void setSll(Double sll) {
        this.sll = sll;
    }

    public Double getSos() {
        return sos;
    }

    public void setSos(Double sos) {
        this.sos = sos;
    }

    public Double getSrd() {
        return srd;
    }

    public void setSrd(Double srd) {
        this.srd = srd;
    }

    public Double getSyp() {
        return syp;
    }

    public void setSyp(Double syp) {
        this.syp = syp;
    }

    public Double getSzl() {
        return szl;
    }

    public void setSzl(Double szl) {
        this.szl = szl;
    }

    public Double getThb() {
        return thb;
    }

    public void setThb(Double thb) {
        this.thb = thb;
    }

    public Double getTjs() {
        return tjs;
    }

    public void setTjs(Double tjs) {
        this.tjs = tjs;
    }

    public Double getTmt() {
        return tmt;
    }

    public void setTmt(Double tmt) {
        this.tmt = tmt;
    }

    public Double getTnd() {
        return tnd;
    }

    public void setTnd(Double tnd) {
        this.tnd = tnd;
    }

    public Double getTop() {
        return top;
    }

    public void setTop(Double top) {
        this.top = top;
    }

    public Double getTry() {
        return _try;
    }

    public void setTry(Double _try) {
        this._try = _try;
    }

    public Double getTtd() {
        return ttd;
    }

    public void setTtd(Double ttd) {
        this.ttd = ttd;
    }

    public Double getTwd() {
        return twd;
    }

    public void setTwd(Double twd) {
        this.twd = twd;
    }

    public Double getTzs() {
        return tzs;
    }

    public void setTzs(Double tzs) {
        this.tzs = tzs;
    }

    public Double getUah() {
        return uah;
    }

    public void setUah(Double uah) {
        this.uah = uah;
    }

    public Double getUgx() {
        return ugx;
    }

    public void setUgx(Double ugx) {
        this.ugx = ugx;
    }

    public Double getUsd() {
        return usd;
    }

    public void setUsd(Double usd) {
        this.usd = usd;
    }

    public Double getUyu() {
        return uyu;
    }

    public void setUyu(Double uyu) {
        this.uyu = uyu;
    }

    public Double getUzs() {
        return uzs;
    }

    public void setUzs(Double uzs) {
        this.uzs = uzs;
    }

    public Double getVnd() {
        return vnd;
    }

    public void setVnd(Double vnd) {
        this.vnd = vnd;
    }

    public Double getVuv() {
        return vuv;
    }

    public void setVuv(Double vuv) {
        this.vuv = vuv;
    }

    public Double getWst() {
        return wst;
    }

    public void setWst(Double wst) {
        this.wst = wst;
    }

    public Double getXaf() {
        return xaf;
    }

    public void setXaf(Double xaf) {
        this.xaf = xaf;
    }

    public Double getXcd() {
        return xcd;
    }

    public void setXcd(Double xcd) {
        this.xcd = xcd;
    }

    public Double getXdr() {
        return xdr;
    }

    public void setXdr(Double xdr) {
        this.xdr = xdr;
    }

    public Double getXof() {
        return xof;
    }

    public void setXof(Double xof) {
        this.xof = xof;
    }

    public Double getXpf() {
        return xpf;
    }

    public void setXpf(Double xpf) {
        this.xpf = xpf;
    }

    public Double getYer() {
        return yer;
    }

    public void setYer(Double yer) {
        this.yer = yer;
    }

    public Double getZar() {
        return zar;
    }

    public void setZar(Double zar) {
        this.zar = zar;
    }

    public Double getZmw() {
        return zmw;
    }

    public void setZmw(Double zmw) {
        this.zmw = zmw;
    }

    public Double getResultTheyGet() {
        if (aed != null) return aed;
        else if (afn != null) return afn;
        else if (all != null) return all;
        else if (amd != null) return amd;
        else if (ang != null) return ang;
        else if (aoa != null) return aoa;
        else if (ars != null) return ars;
        else if (aud != null) return aud;
        else if (awg != null) return awg;
        else if (azn != null) return azn;
        else if (bam != null) return bam;
        else if (bbd != null) return bbd;
        else if (bdt != null) return bdt;
        else if (bgn != null) return bgn;
        else if (bhd != null) return bhd;
        else if (bif != null) return bif;
        else if (bmd != null) return bmd;
        else if (bnd != null) return bnd;
        else if (bob != null) return bob;
        else if (brl != null) return brl;
        else if (bsd != null) return bsd;
        else if (btn != null) return btn;
        else if (bwp != null) return bwp;
        else if (bzd != null) return bzd;
        else if (cad != null) return cad;
        else if (cdf != null) return cdf;
        else if (chf != null) return chf;
        else if (clf != null) return clf;
        else if (clp != null) return clp;
        else if (cnh != null) return cnh;
        else if (cny != null) return cny;
        else if (cop != null) return cop;
        else if (cup != null) return cup;
        else if (cve != null) return cve;
        else if (czk != null) return czk;
        else if (djf != null) return djf;
        else if (dkk != null) return dkk;
        else if (dop != null) return dop;
        else if (dzd != null) return dzd;
        else if (egp != null) return egp;
        else if (ern != null) return ern;
        else if (etb != null) return etb;
        else if (eur != null) return eur;
        else if (fjd != null) return fjd;
        else if (fkp != null) return fkp;
        else if (gbp != null) return gbp;
        else if (gel != null) return gel;
        else if (ghs != null) return ghs;
        else if (gip != null) return gip;
        else if (gmd != null) return gmd;
        else if (gnf != null) return gnf;
        else if (gtq != null) return gtq;
        else if (gyd != null) return gyd;
        else if (hkd != null) return hkd;
        else if (hnl != null) return hnl;
        else if (hrk != null) return hrk;
        else if (htg != null) return htg;
        else if (huf != null) return huf;
        else if (idr != null) return idr;
        else if (ils != null) return ils;
        else if (inr != null) return inr;
        else if (iqd != null) return iqd;
        else if (irr != null) return irr;
        else if (isk != null) return isk;
        else if (jmd != null) return jmd;
        else if (jod != null) return jod;
        else if (jpy != null) return jpy;
        else if (kes != null) return kes;
        else if (kgs != null) return kgs;
        else if (khr != null) return khr;
        else if (kmf != null) return kmf;
        else if (kpw != null) return kpw;
        else if (krw != null) return krw;
        else if (kwd != null) return kwd;
        else if (kyd != null) return kyd;
        else if (kzt != null) return kzt;
        else if (lak != null) return lak;
        else if (lbp != null) return lbp;
        else if (lkr != null) return lkr;
        else if (lrd != null) return lrd;
        else if (lsl != null) return lsl;
        else if (lyd != null) return lyd;
        else if (mad != null) return mad;
        else if (mdl != null) return mdl;
        else if (mga != null) return mga;
        else if (mkd != null) return mkd;
        else if (mmk != null) return mmk;
        else if (mnt != null) return mnt;
        else if (mop != null) return mop;
        else if (mru != null) return mru;
        else if (mur != null) return mur;
        else if (mvr != null) return mvr;
        else if (mwk != null) return mwk;
        else if (mxn != null) return mxn;
        else if (myr != null) return myr;
        else if (mzn != null) return mzn;
        else if (nad != null) return nad;
        else if (ngn != null) return ngn;
        else if (nok != null) return nok;
        else if (npr != null) return npr;
        else if (nzd != null) return nzd;
        else if (omr != null) return omr;
        else if (pab != null) return pab;
        else if (pen != null) return pen;
        else if (pgk != null) return pgk;
        else if (php != null) return php;
        else if (pkr != null) return pkr;
        else if (pln != null) return pln;
        else if (pyg != null) return pyg;
        else if (qar != null) return qar;
        else if (ron != null) return ron;
        else if (rsd != null) return rsd;
        else if (rub != null) return rub;
        else if (rwf != null) return rwf;
        else if (sar != null) return sar;
        else if (scr != null) return scr;
        else if (sdg != null) return sdg;
        else if (sek != null) return sek;
        else if (sgd != null) return sgd;
        else if (shp != null) return shp;
        else if (sll != null) return sll;
        else if (sos != null) return sos;
        else if (srd != null) return srd;
        else if (syp != null) return syp;
        else if (szl != null) return szl;
        else if (thb != null) return thb;
        else if (tjs != null) return tjs;
        else if (tmt != null) return tmt;
        else if (tnd != null) return tnd;
        else if (top != null) return top;
        else if (getTry() != null) return getTry();
        else if (ttd != null) return ttd;
        else if (twd != null) return twd;
        else if (tzs != null) return tzs;
        else if (uah != null) return uah;
        else if (ugx != null) return ugx;
        else if (usd != null) return usd;
        else if (uyu != null) return uyu;
        else if (uzs != null) return uzs;
        else if (vnd != null) return vnd;
        else if (vuv != null) return vuv;
        else if (wst != null) return wst;
        else if (xaf != null) return xaf;
        else if (xcd != null) return xcd;
        else if (xdr != null) return xdr;
        else if (xof != null) return xof;
        else if (xpf != null) return xpf;
        else if (yer != null) return yer;
        else if (zar != null) return zar;
        else return zmw;

    }

    @Override
    public String toString() {
        return "Results{" +
                "aed=" + aed +
                ", afn=" + afn +
                ", all=" + all +
                ", amd=" + amd +
                ", ang=" + ang +
                ", aoa=" + aoa +
                ", ars=" + ars +
                ", aud=" + aud +
                ", awg=" + awg +
                ", azn=" + azn +
                ", bam=" + bam +
                ", bbd=" + bbd +
                ", bdt=" + bdt +
                ", bgn=" + bgn +
                ", bhd=" + bhd +
                ", bif=" + bif +
                ", bmd=" + bmd +
                ", bnd=" + bnd +
                ", bob=" + bob +
                ", brl=" + brl +
                ", bsd=" + bsd +
                ", btn=" + btn +
                ", bwp=" + bwp +
                ", bzd=" + bzd +
                ", cad=" + cad +
                ", cdf=" + cdf +
                ", chf=" + chf +
                ", clf=" + clf +
                ", clp=" + clp +
                ", cnh=" + cnh +
                ", cny=" + cny +
                ", cop=" + cop +
                ", cup=" + cup +
                ", cve=" + cve +
                ", czk=" + czk +
                ", djf=" + djf +
                ", dkk=" + dkk +
                ", dop=" + dop +
                ", dzd=" + dzd +
                ", egp=" + egp +
                ", ern=" + ern +
                ", etb=" + etb +
                ", eur=" + eur +
                ", fjd=" + fjd +
                ", fkp=" + fkp +
                ", gbp=" + gbp +
                ", gel=" + gel +
                ", ghs=" + ghs +
                ", gip=" + gip +
                ", gmd=" + gmd +
                ", gnf=" + gnf +
                ", gtq=" + gtq +
                ", gyd=" + gyd +
                ", hkd=" + hkd +
                ", hnl=" + hnl +
                ", hrk=" + hrk +
                ", htg=" + htg +
                ", huf=" + huf +
                ", idr=" + idr +
                ", ils=" + ils +
                ", inr=" + inr +
                ", iqd=" + iqd +
                ", irr=" + irr +
                ", isk=" + isk +
                ", jmd=" + jmd +
                ", jod=" + jod +
                ", jpy=" + jpy +
                ", kes=" + kes +
                ", kgs=" + kgs +
                ", khr=" + khr +
                ", kmf=" + kmf +
                ", kpw=" + kpw +
                ", krw=" + krw +
                ", kwd=" + kwd +
                ", kyd=" + kyd +
                ", kzt=" + kzt +
                ", lak=" + lak +
                ", lbp=" + lbp +
                ", lkr=" + lkr +
                ", lrd=" + lrd +
                ", lsl=" + lsl +
                ", lyd=" + lyd +
                ", mad=" + mad +
                ", mdl=" + mdl +
                ", mga=" + mga +
                ", mkd=" + mkd +
                ", mmk=" + mmk +
                ", mnt=" + mnt +
                ", mop=" + mop +
                ", mru=" + mru +
                ", mur=" + mur +
                ", mvr=" + mvr +
                ", mwk=" + mwk +
                ", mxn=" + mxn +
                ", myr=" + myr +
                ", mzn=" + mzn +
                ", nad=" + nad +
                ", ngn=" + ngn +
                ", nok=" + nok +
                ", npr=" + npr +
                ", nzd=" + nzd +
                ", omr=" + omr +
                ", pab=" + pab +
                ", pen=" + pen +
                ", pgk=" + pgk +
                ", php=" + php +
                ", pkr=" + pkr +
                ", pln=" + pln +
                ", pyg=" + pyg +
                ", qar=" + qar +
                ", ron=" + ron +
                ", rsd=" + rsd +
                ", rub=" + rub +
                ", rwf=" + rwf +
                ", sar=" + sar +
                ", scr=" + scr +
                ", sdg=" + sdg +
                ", sek=" + sek +
                ", sgd=" + sgd +
                ", shp=" + shp +
                ", sll=" + sll +
                ", sos=" + sos +
                ", srd=" + srd +
                ", syp=" + syp +
                ", szl=" + szl +
                ", thb=" + thb +
                ", tjs=" + tjs +
                ", tmt=" + tmt +
                ", tnd=" + tnd +
                ", top=" + top +
                ", _try=" + _try +
                ", ttd=" + ttd +
                ", twd=" + twd +
                ", tzs=" + tzs +
                ", uah=" + uah +
                ", ugx=" + ugx +
                ", usd=" + usd +
                ", uyu=" + uyu +
                ", uzs=" + uzs +
                ", vnd=" + vnd +
                ", vuv=" + vuv +
                ", wst=" + wst +
                ", xaf=" + xaf +
                ", xcd=" + xcd +
                ", xdr=" + xdr +
                ", xof=" + xof +
                ", xpf=" + xpf +
                ", yer=" + yer +
                ", zar=" + zar +
                ", zmw=" + zmw +
                '}';
    }
}