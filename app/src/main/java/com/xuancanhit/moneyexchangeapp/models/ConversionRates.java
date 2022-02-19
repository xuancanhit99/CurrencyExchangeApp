package com.xuancanhit.moneyexchangeapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ConversionRates {
    @SerializedName("USD")
    @Expose
    private Double usd;
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
    @SerializedName("BYN")
    @Expose
    private Double byn;
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
    @SerializedName("CLP")
    @Expose
    private Double clp;
    @SerializedName("CNY")
    @Expose
    private Double cny;
    @SerializedName("COP")
    @Expose
    private Double cop;
    @SerializedName("CRC")
    @Expose
    private Double crc;
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
    @SerializedName("FOK")
    @Expose
    private Double fok;
    @SerializedName("GBP")
    @Expose
    private Double gbp;
    @SerializedName("GEL")
    @Expose
    private Double gel;
    @SerializedName("GGP")
    @Expose
    private Double ggp;
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
    @SerializedName("IMP")
    @Expose
    private Double imp;
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
    @SerializedName("JEP")
    @Expose
    private Double jep;
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
    @SerializedName("KID")
    @Expose
    private Double kid;
    @SerializedName("KMF")
    @Expose
    private Double kmf;
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
    @SerializedName("NIO")
    @Expose
    private Double nio;
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
    @SerializedName("SBD")
    @Expose
    private Double sbd;
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
    @SerializedName("SSP")
    @Expose
    private Double ssp;
    @SerializedName("STN")
    @Expose
    private Double stn;
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
    @SerializedName("TVD")
    @Expose
    private Double tvd;
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
    @SerializedName("UYU")
    @Expose
    private Double uyu;
    @SerializedName("UZS")
    @Expose
    private Double uzs;
    @SerializedName("VES")
    @Expose
    private Double ves;
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
    @SerializedName("ZWL")
    @Expose
    private Double zwl;

    public Double getUsd() {
        return usd;
    }

    public void setUsd(Double usd) {
        this.usd = usd;
    }

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

    public Double getByn() {
        return byn;
    }

    public void setByn(Double byn) {
        this.byn = byn;
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

    public Double getClp() {
        return clp;
    }

    public void setClp(Double clp) {
        this.clp = clp;
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

    public Double getCrc() {
        return crc;
    }

    public void setCrc(Double crc) {
        this.crc = crc;
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

    public Double getFok() {
        return fok;
    }

    public void setFok(Double fok) {
        this.fok = fok;
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

    public Double getGgp() {
        return ggp;
    }

    public void setGgp(Double ggp) {
        this.ggp = ggp;
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

    public Double getImp() {
        return imp;
    }

    public void setImp(Double imp) {
        this.imp = imp;
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

    public Double getJep() {
        return jep;
    }

    public void setJep(Double jep) {
        this.jep = jep;
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

    public Double getKid() {
        return kid;
    }

    public void setKid(Double kid) {
        this.kid = kid;
    }

    public Double getKmf() {
        return kmf;
    }

    public void setKmf(Double kmf) {
        this.kmf = kmf;
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

    public Double getNio() {
        return nio;
    }

    public void setNio(Double nio) {
        this.nio = nio;
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

    public Double getSbd() {
        return sbd;
    }

    public void setSbd(Double sbd) {
        this.sbd = sbd;
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

    public Double getSsp() {
        return ssp;
    }

    public void setSsp(Double ssp) {
        this.ssp = ssp;
    }

    public Double getStn() {
        return stn;
    }

    public void setStn(Double stn) {
        this.stn = stn;
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

    public Double getTvd() {
        return tvd;
    }

    public void setTvd(Double tvd) {
        this.tvd = tvd;
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

    public Double getVes() {
        return ves;
    }

    public void setVes(Double ves) {
        this.ves = ves;
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

    public Double getZwl() {
        return zwl;
    }

    public void setZwl(Double zwl) {
        this.zwl = zwl;
    }

    public List<CurrencyUnit> getListCurrencies() {
        List<CurrencyUnit> list = new ArrayList<>();

        CurrencyUnit currencyUnit1 = new CurrencyUnit("AED", getAed());
        list.add(currencyUnit1);
        CurrencyUnit currencyUnit2 = new CurrencyUnit("AFN", getAfn());
        list.add(currencyUnit2);
        CurrencyUnit currencyUnit3 = new CurrencyUnit("ALL", getAll());
        list.add(currencyUnit3);
        CurrencyUnit currencyUnit4 = new CurrencyUnit("AMD", getAmd());
        list.add(currencyUnit4);
        CurrencyUnit currencyUnit5 = new CurrencyUnit("ANG", getAng());
        list.add(currencyUnit5);
        CurrencyUnit currencyUnit6 = new CurrencyUnit("AOA", getAoa());
        list.add(currencyUnit6);
        CurrencyUnit currencyUnit7 = new CurrencyUnit("ARS", getArs());
        list.add(currencyUnit7);
        CurrencyUnit currencyUnit8 = new CurrencyUnit("AUD", getAud());
        list.add(currencyUnit8);
        CurrencyUnit currencyUnit9 = new CurrencyUnit("AWG", getAwg());
        list.add(currencyUnit9);
        CurrencyUnit currencyUnit10 = new CurrencyUnit("AZN", getAzn());
        list.add(currencyUnit10);
        CurrencyUnit currencyUnit11 = new CurrencyUnit("BAM", getBam());
        list.add(currencyUnit11);
        CurrencyUnit currencyUnit12 = new CurrencyUnit("BBD", getBbd());
        list.add(currencyUnit12);
        CurrencyUnit currencyUnit13 = new CurrencyUnit("BDT", getBdt());
        list.add(currencyUnit13);
        CurrencyUnit currencyUnit14 = new CurrencyUnit("BGN", getBgn());
        list.add(currencyUnit14);
        CurrencyUnit currencyUnit15 = new CurrencyUnit("BHD", getBhd());
        list.add(currencyUnit15);
        CurrencyUnit currencyUnit16 = new CurrencyUnit("BIF", getBif());
        list.add(currencyUnit16);
        CurrencyUnit currencyUnit17 = new CurrencyUnit("BMD", getBmd());
        list.add(currencyUnit17);
        CurrencyUnit currencyUnit18 = new CurrencyUnit("BND", getBnd());
        list.add(currencyUnit18);
        CurrencyUnit currencyUnit19 = new CurrencyUnit("BOB", getBob());
        list.add(currencyUnit19);
        CurrencyUnit currencyUnit20 = new CurrencyUnit("BRL", getBrl());
        list.add(currencyUnit20);
        CurrencyUnit currencyUnit21 = new CurrencyUnit("BSD", getBsd());
        list.add(currencyUnit21);
        CurrencyUnit currencyUnit22 = new CurrencyUnit("BTN", getBtn());
        list.add(currencyUnit22);
        CurrencyUnit currencyUnit23 = new CurrencyUnit("BWP", getBwp());
        list.add(currencyUnit23);
        CurrencyUnit currencyUnit24 = new CurrencyUnit("BYN", getByn());
        list.add(currencyUnit24);
        CurrencyUnit currencyUnit25 = new CurrencyUnit("BZD", getBzd());
        list.add(currencyUnit25);
        CurrencyUnit currencyUnit26 = new CurrencyUnit("CAD", getCad());
        list.add(currencyUnit26);
        CurrencyUnit currencyUnit27 = new CurrencyUnit("CDF", getCdf());
        list.add(currencyUnit27);
        CurrencyUnit currencyUnit28 = new CurrencyUnit("CHF", getChf());
        list.add(currencyUnit28);
        CurrencyUnit currencyUnit29 = new CurrencyUnit("CLP", getClp());
        list.add(currencyUnit29);
        CurrencyUnit currencyUnit30 = new CurrencyUnit("CNY", getCny());
        list.add(currencyUnit30);
        CurrencyUnit currencyUnit31 = new CurrencyUnit("COP", getCop());
        list.add(currencyUnit31);
        CurrencyUnit currencyUnit32 = new CurrencyUnit("CRC", getCrc());
        list.add(currencyUnit32);
        CurrencyUnit currencyUnit33 = new CurrencyUnit("CUP", getCup());
        list.add(currencyUnit33);
        CurrencyUnit currencyUnit34 = new CurrencyUnit("CVE", getCve());
        list.add(currencyUnit34);
        CurrencyUnit currencyUnit35 = new CurrencyUnit("CZK", getCzk());
        list.add(currencyUnit35);
        CurrencyUnit currencyUnit36 = new CurrencyUnit("DJF", getDjf());
        list.add(currencyUnit36);
        CurrencyUnit currencyUnit37 = new CurrencyUnit("DKK", getDkk());
        list.add(currencyUnit37);
        CurrencyUnit currencyUnit38 = new CurrencyUnit("DOP", getDop());
        list.add(currencyUnit38);
        CurrencyUnit currencyUnit39 = new CurrencyUnit("DZD", getDzd());
        list.add(currencyUnit39);
        CurrencyUnit currencyUnit40 = new CurrencyUnit("EGP", getEgp());
        list.add(currencyUnit40);
        CurrencyUnit currencyUnit41 = new CurrencyUnit("ERN", getErn());
        list.add(currencyUnit41);
        CurrencyUnit currencyUnit42 = new CurrencyUnit("ETB", getEtb());
        list.add(currencyUnit42);
        CurrencyUnit currencyUnit43 = new CurrencyUnit("EUR", getEur());
        list.add(currencyUnit43);
        CurrencyUnit currencyUnit44 = new CurrencyUnit("FJD", getFjd());
        list.add(currencyUnit44);
        CurrencyUnit currencyUnit45 = new CurrencyUnit("FKP", getFkp());
        list.add(currencyUnit45);
        CurrencyUnit currencyUnit46 = new CurrencyUnit("FOK", getFok());
        list.add(currencyUnit46);
        CurrencyUnit currencyUnit47 = new CurrencyUnit("GBP", getGbp());
        list.add(currencyUnit47);
        CurrencyUnit currencyUnit48 = new CurrencyUnit("GEL", getGel());
        list.add(currencyUnit48);
        CurrencyUnit currencyUnit49 = new CurrencyUnit("GGP", getGgp());
        list.add(currencyUnit49);
        CurrencyUnit currencyUnit50 = new CurrencyUnit("GHS", getGhs());
        list.add(currencyUnit50);
        CurrencyUnit currencyUnit51 = new CurrencyUnit("GIP", getGip());
        list.add(currencyUnit51);
        CurrencyUnit currencyUnit52 = new CurrencyUnit("GMD", getGmd());
        list.add(currencyUnit52);
        CurrencyUnit currencyUnit53 = new CurrencyUnit("GNF", getGnf());
        list.add(currencyUnit53);
        CurrencyUnit currencyUnit54 = new CurrencyUnit("GTQ", getGtq());
        list.add(currencyUnit54);
        CurrencyUnit currencyUnit55 = new CurrencyUnit("GYD", getGyd());
        list.add(currencyUnit55);
        CurrencyUnit currencyUnit56 = new CurrencyUnit("HKD", getHkd());
        list.add(currencyUnit56);
        CurrencyUnit currencyUnit57 = new CurrencyUnit("HNL", getHnl());
        list.add(currencyUnit57);
        CurrencyUnit currencyUnit58 = new CurrencyUnit("HRK", getHrk());
        list.add(currencyUnit58);
        CurrencyUnit currencyUnit59 = new CurrencyUnit("HTG", getHtg());
        list.add(currencyUnit59);
        CurrencyUnit currencyUnit60 = new CurrencyUnit("HUF", getHuf());
        list.add(currencyUnit60);
        CurrencyUnit currencyUnit61 = new CurrencyUnit("IDR", getIdr());
        list.add(currencyUnit61);
        CurrencyUnit currencyUnit62 = new CurrencyUnit("ILS", getIls());
        list.add(currencyUnit62);
        CurrencyUnit currencyUnit63 = new CurrencyUnit("IMP", getImp());
        list.add(currencyUnit63);
        CurrencyUnit currencyUnit64 = new CurrencyUnit("INR", getInr());
        list.add(currencyUnit64);
        CurrencyUnit currencyUnit65 = new CurrencyUnit("IQD", getIqd());
        list.add(currencyUnit65);
        CurrencyUnit currencyUnit66 = new CurrencyUnit("IRR", getIrr());
        list.add(currencyUnit66);
        CurrencyUnit currencyUnit67 = new CurrencyUnit("ISK", getIsk());
        list.add(currencyUnit67);
        CurrencyUnit currencyUnit68 = new CurrencyUnit("JEP", getJep());
        list.add(currencyUnit68);
        CurrencyUnit currencyUnit69 = new CurrencyUnit("JMD", getJmd());
        list.add(currencyUnit69);
        CurrencyUnit currencyUnit70 = new CurrencyUnit("JOD", getJod());
        list.add(currencyUnit70);
        CurrencyUnit currencyUnit71 = new CurrencyUnit("JPY", getJpy());
        list.add(currencyUnit71);
        CurrencyUnit currencyUnit72 = new CurrencyUnit("KES", getKes());
        list.add(currencyUnit72);
        CurrencyUnit currencyUnit73 = new CurrencyUnit("KGS", getKgs());
        list.add(currencyUnit73);
        CurrencyUnit currencyUnit74 = new CurrencyUnit("KHR", getKhr());
        list.add(currencyUnit74);
        CurrencyUnit currencyUnit75 = new CurrencyUnit("KID", getKid());
        list.add(currencyUnit75);
        CurrencyUnit currencyUnit76 = new CurrencyUnit("KMF", getKmf());
        list.add(currencyUnit76);
        CurrencyUnit currencyUnit77 = new CurrencyUnit("KRW", getKrw());
        list.add(currencyUnit77);
        CurrencyUnit currencyUnit78 = new CurrencyUnit("KWD", getKwd());
        list.add(currencyUnit78);
        CurrencyUnit currencyUnit79 = new CurrencyUnit("KYD", getKyd());
        list.add(currencyUnit79);
        CurrencyUnit currencyUnit80 = new CurrencyUnit("KZT", getKzt());
        list.add(currencyUnit80);
        CurrencyUnit currencyUnit81 = new CurrencyUnit("LAK", getLak());
        list.add(currencyUnit81);
        CurrencyUnit currencyUnit82 = new CurrencyUnit("LBP", getLbp());
        list.add(currencyUnit82);
        CurrencyUnit currencyUnit83 = new CurrencyUnit("LKR", getLkr());
        list.add(currencyUnit83);
        CurrencyUnit currencyUnit84 = new CurrencyUnit("LRD", getLrd());
        list.add(currencyUnit84);
        CurrencyUnit currencyUnit85 = new CurrencyUnit("LSL", getLsl());
        list.add(currencyUnit85);
        CurrencyUnit currencyUnit86 = new CurrencyUnit("LYD", getLyd());
        list.add(currencyUnit86);
        CurrencyUnit currencyUnit87 = new CurrencyUnit("MAD", getMad());
        list.add(currencyUnit87);
        CurrencyUnit currencyUnit88 = new CurrencyUnit("MDL", getMdl());
        list.add(currencyUnit88);
        CurrencyUnit currencyUnit89 = new CurrencyUnit("MGA", getMga());
        list.add(currencyUnit89);
        CurrencyUnit currencyUnit90 = new CurrencyUnit("MKD", getMkd());
        list.add(currencyUnit90);
        CurrencyUnit currencyUnit91 = new CurrencyUnit("MMK", getMmk());
        list.add(currencyUnit91);
        CurrencyUnit currencyUnit92 = new CurrencyUnit("MNT", getMnt());
        list.add(currencyUnit92);
        CurrencyUnit currencyUnit93 = new CurrencyUnit("MOP", getMop());
        list.add(currencyUnit93);
        CurrencyUnit currencyUnit94 = new CurrencyUnit("MRU", getMru());
        list.add(currencyUnit94);
        CurrencyUnit currencyUnit95 = new CurrencyUnit("MUR", getMur());
        list.add(currencyUnit95);
        CurrencyUnit currencyUnit96 = new CurrencyUnit("MVR", getMvr());
        list.add(currencyUnit96);
        CurrencyUnit currencyUnit97 = new CurrencyUnit("MWK", getMwk());
        list.add(currencyUnit97);
        CurrencyUnit currencyUnit98 = new CurrencyUnit("MXN", getMxn());
        list.add(currencyUnit98);
        CurrencyUnit currencyUnit99 = new CurrencyUnit("MYR", getMyr());
        list.add(currencyUnit99);
        CurrencyUnit currencyUnit100 = new CurrencyUnit("MZN", getMzn());
        list.add(currencyUnit100);
        CurrencyUnit currencyUnit101 = new CurrencyUnit("NAD", getNad());
        list.add(currencyUnit101);
        CurrencyUnit currencyUnit102 = new CurrencyUnit("NGN", getNgn());
        list.add(currencyUnit102);
        CurrencyUnit currencyUnit103 = new CurrencyUnit("NIO", getNio());
        list.add(currencyUnit103);
        CurrencyUnit currencyUnit104 = new CurrencyUnit("NOK", getNok());
        list.add(currencyUnit104);
        CurrencyUnit currencyUnit105 = new CurrencyUnit("NPR", getNpr());
        list.add(currencyUnit105);
        CurrencyUnit currencyUnit106 = new CurrencyUnit("NZD", getNzd());
        list.add(currencyUnit106);
        CurrencyUnit currencyUnit107 = new CurrencyUnit("OMR", getOmr());
        list.add(currencyUnit107);
        CurrencyUnit currencyUnit108 = new CurrencyUnit("PAB", getPab());
        list.add(currencyUnit108);
        CurrencyUnit currencyUnit109 = new CurrencyUnit("PEN", getPen());
        list.add(currencyUnit109);
        CurrencyUnit currencyUnit110 = new CurrencyUnit("PGK", getPgk());
        list.add(currencyUnit110);
        CurrencyUnit currencyUnit111 = new CurrencyUnit("PHP", getPhp());
        list.add(currencyUnit111);
        CurrencyUnit currencyUnit112 = new CurrencyUnit("PKR", getPkr());
        list.add(currencyUnit112);
        CurrencyUnit currencyUnit113 = new CurrencyUnit("PLN", getPln());
        list.add(currencyUnit113);
        CurrencyUnit currencyUnit114 = new CurrencyUnit("PYG", getPyg());
        list.add(currencyUnit114);
        CurrencyUnit currencyUnit115 = new CurrencyUnit("QAR", getQar());
        list.add(currencyUnit115);
        CurrencyUnit currencyUnit116 = new CurrencyUnit("RON", getRon());
        list.add(currencyUnit116);
        CurrencyUnit currencyUnit117 = new CurrencyUnit("RSD", getRsd());
        list.add(currencyUnit117);
        CurrencyUnit currencyUnit118 = new CurrencyUnit("RUB", getRub());
        list.add(currencyUnit118);
        CurrencyUnit currencyUnit119 = new CurrencyUnit("RWF", getRwf());
        list.add(currencyUnit119);
        CurrencyUnit currencyUnit120 = new CurrencyUnit("SAR", getSar());
        list.add(currencyUnit120);
        CurrencyUnit currencyUnit121 = new CurrencyUnit("SBD", getSbd());
        list.add(currencyUnit121);
        CurrencyUnit currencyUnit122 = new CurrencyUnit("SCR", getScr());
        list.add(currencyUnit122);
        CurrencyUnit currencyUnit123 = new CurrencyUnit("SDG", getSdg());
        list.add(currencyUnit123);
        CurrencyUnit currencyUnit124 = new CurrencyUnit("SEK", getSek());
        list.add(currencyUnit124);
        CurrencyUnit currencyUnit125 = new CurrencyUnit("SGD", getSgd());
        list.add(currencyUnit125);
        CurrencyUnit currencyUnit126 = new CurrencyUnit("SHP", getShp());
        list.add(currencyUnit126);
        CurrencyUnit currencyUnit127 = new CurrencyUnit("SLL", getSll());
        list.add(currencyUnit127);
        CurrencyUnit currencyUnit128 = new CurrencyUnit("SOS", getSos());
        list.add(currencyUnit128);
        CurrencyUnit currencyUnit129 = new CurrencyUnit("SRD", getSrd());
        list.add(currencyUnit129);
        CurrencyUnit currencyUnit130 = new CurrencyUnit("SSP", getSsp());
        list.add(currencyUnit130);
        CurrencyUnit currencyUnit131 = new CurrencyUnit("STN", getStn());
        list.add(currencyUnit131);
        CurrencyUnit currencyUnit132 = new CurrencyUnit("SYP", getSyp());
        list.add(currencyUnit132);
        CurrencyUnit currencyUnit133 = new CurrencyUnit("SZL", getSzl());
        list.add(currencyUnit133);
        CurrencyUnit currencyUnit134 = new CurrencyUnit("THB", getThb());
        list.add(currencyUnit134);
        CurrencyUnit currencyUnit135 = new CurrencyUnit("TJS", getTjs());
        list.add(currencyUnit135);
        CurrencyUnit currencyUnit136 = new CurrencyUnit("TMT", getTmt());
        list.add(currencyUnit136);
        CurrencyUnit currencyUnit137 = new CurrencyUnit("TND", getTnd());
        list.add(currencyUnit137);
        CurrencyUnit currencyUnit138 = new CurrencyUnit("TOP", getTop());
        list.add(currencyUnit138);
        CurrencyUnit currencyUnit139 = new CurrencyUnit("TRY", getTry());
        list.add(currencyUnit139);
        CurrencyUnit currencyUnit140 = new CurrencyUnit("TTD", getTtd());
        list.add(currencyUnit140);
        CurrencyUnit currencyUnit141 = new CurrencyUnit("TVD", getTvd());
        list.add(currencyUnit141);
        CurrencyUnit currencyUnit142 = new CurrencyUnit("TWD", getTwd());
        list.add(currencyUnit142);
        CurrencyUnit currencyUnit143 = new CurrencyUnit("TZS", getTzs());
        list.add(currencyUnit143);
        CurrencyUnit currencyUnit144 = new CurrencyUnit("UAH", getUah());
        list.add(currencyUnit144);
        CurrencyUnit currencyUnit145 = new CurrencyUnit("UGX", getUgx());
        list.add(currencyUnit145);
        CurrencyUnit currencyUnit146 = new CurrencyUnit("USD", getUsd());
        list.add(currencyUnit146);
        CurrencyUnit currencyUnit147 = new CurrencyUnit("UYU", getUyu());
        list.add(currencyUnit147);
        CurrencyUnit currencyUnit148 = new CurrencyUnit("UZS", getUzs());
        list.add(currencyUnit148);
        CurrencyUnit currencyUnit149 = new CurrencyUnit("VES", getVes());
        list.add(currencyUnit149);
        CurrencyUnit currencyUnit150 = new CurrencyUnit("VND", getVnd());
        list.add(currencyUnit150);
        CurrencyUnit currencyUnit151 = new CurrencyUnit("VUV", getVuv());
        list.add(currencyUnit151);
        CurrencyUnit currencyUnit152 = new CurrencyUnit("WST", getWst());
        list.add(currencyUnit152);
        CurrencyUnit currencyUnit153 = new CurrencyUnit("XAF", getXaf());
        list.add(currencyUnit153);
        CurrencyUnit currencyUnit154 = new CurrencyUnit("XCD", getXcd());
        list.add(currencyUnit154);
        CurrencyUnit currencyUnit155 = new CurrencyUnit("XDR", getXdr());
        list.add(currencyUnit155);
        CurrencyUnit currencyUnit156 = new CurrencyUnit("XOF", getXof());
        list.add(currencyUnit156);
        CurrencyUnit currencyUnit157 = new CurrencyUnit("XPF", getXpf());
        list.add(currencyUnit157);
        CurrencyUnit currencyUnit158 = new CurrencyUnit("YER", getYer());
        list.add(currencyUnit158);
        CurrencyUnit currencyUnit159 = new CurrencyUnit("ZAR", getZar());
        list.add(currencyUnit159);
        CurrencyUnit currencyUnit160 = new CurrencyUnit("ZMW", getZmw());
        list.add(currencyUnit160);

        CurrencyUnit currencyUnit161 = new CurrencyUnit("ZWL", getZwl());
        list.add(currencyUnit161);


        return list;
    }

    @Override
    public String toString() {
        return "ConversionRates{" +
                "usd=" + usd +
                ", aed=" + aed +
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
                ", byn=" + byn +
                ", bzd=" + bzd +
                ", cad=" + cad +
                ", cdf=" + cdf +
                ", chf=" + chf +
                ", clp=" + clp +
                ", cny=" + cny +
                ", cop=" + cop +
                ", crc=" + crc +
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
                ", fok=" + fok +
                ", gbp=" + gbp +
                ", gel=" + gel +
                ", ggp=" + ggp +
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
                ", imp=" + imp +
                ", inr=" + inr +
                ", iqd=" + iqd +
                ", irr=" + irr +
                ", isk=" + isk +
                ", jep=" + jep +
                ", jmd=" + jmd +
                ", jod=" + jod +
                ", jpy=" + jpy +
                ", kes=" + kes +
                ", kgs=" + kgs +
                ", khr=" + khr +
                ", kid=" + kid +
                ", kmf=" + kmf +
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
                ", nio=" + nio +
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
                ", sbd=" + sbd +
                ", scr=" + scr +
                ", sdg=" + sdg +
                ", sek=" + sek +
                ", sgd=" + sgd +
                ", shp=" + shp +
                ", sll=" + sll +
                ", sos=" + sos +
                ", srd=" + srd +
                ", ssp=" + ssp +
                ", stn=" + stn +
                ", syp=" + syp +
                ", szl=" + szl +
                ", thb=" + thb +
                ", tjs=" + tjs +
                ", tmt=" + tmt +
                ", tnd=" + tnd +
                ", top=" + top +
                ", _try=" + _try +
                ", ttd=" + ttd +
                ", tvd=" + tvd +
                ", twd=" + twd +
                ", tzs=" + tzs +
                ", uah=" + uah +
                ", ugx=" + ugx +
                ", uyu=" + uyu +
                ", uzs=" + uzs +
                ", ves=" + ves +
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
                ", zwl=" + zwl +
                '}';
    }
}
