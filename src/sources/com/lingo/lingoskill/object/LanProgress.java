package com.lingo.lingoskill.object;

import android.text.TextUtils;
import com.google.firebase.database.Exclude;
import com.lingodeer.data.env.Env;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class LanProgress {

    /* JADX INFO: renamed from: cn, reason: collision with root package name */
    Progress f21934cn = new Progress();

    /* JADX INFO: renamed from: jp, reason: collision with root package name */
    Progress f21936jp = new Progress();

    /* JADX INFO: renamed from: kr, reason: collision with root package name */
    Progress f21937kr = new Progress();

    /* JADX INFO: renamed from: en, reason: collision with root package name */
    Progress f21935en = new Progress();

    /* JADX INFO: renamed from: vt, reason: collision with root package name */
    Progress f21939vt = new Progress();

    /* JADX INFO: renamed from: pt, reason: collision with root package name */
    Progress f21938pt = new Progress();
    Progress esoc = new Progress();
    Progress froc = new Progress();
    Progress deoc = new Progress();
    Progress jpup = new Progress();
    Progress krup = new Progress();
    Progress cnup = new Progress();
    Progress esocup = new Progress();
    Progress frocup = new Progress();
    Progress deocup = new Progress();
    Progress ptup = new Progress();
    Progress ruoc = new Progress();
    Progress ruocup = new Progress();
    Progress itoc = new Progress();
    Progress itocup = new Progress();
    Progress esus = new Progress();
    Progress esusup = new Progress();
    Progress frus = new Progress();
    Progress frusup = new Progress();
    Progress ara = new Progress();
    Progress araup = new Progress();
    Progress thai = new Progress();
    Progress tur = new Progress();
    Progress hindi = new Progress();
    Progress ukr = new Progress();
    Progress grk = new Progress();
    Progress idn = new Progress();
    Progress pol = new Progress();
    Progress mal = new Progress();

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Progress {
        String main = "1:1:1";
        String main_tt = BuildConfig.VERSION_NAME;
        String lesson_exam = BuildConfig.VERSION_NAME;
        String lesson_stars = BuildConfig.VERSION_NAME;
        int pronun = 1;

        public String getLesson_exam() {
            return this.lesson_exam;
        }

        public String getLesson_stars() {
            return this.lesson_stars;
        }

        public String getMain() {
            return this.main;
        }

        public String getMain_tt() {
            return this.main_tt;
        }

        public int getPronun() {
            return this.pronun;
        }

        public void setLesson_exam(String str) {
            this.lesson_exam = str;
        }

        public void setLesson_stars(String str) {
            this.lesson_stars = str;
        }

        public void setMain(String str) {
            this.main = str;
        }

        public void setMain_tt(String str) {
            this.main_tt = str;
        }

        public void setPronun(int i11) {
            this.pronun = i11;
        }

        @Exclude
        public Map<String, Object> toMap() {
            HashMap map = new HashMap();
            map.put("main", getMain());
            map.put("main_tt", getMain_tt());
            map.put("lesson_exam", getLesson_exam());
            map.put("lesson_stars", getLesson_stars());
            map.put("pronun", Integer.valueOf(getPronun()));
            return map;
        }
    }

    private void writeProgress(int i11, Progress progress) {
        LanCustomInfo lanCustomInfoB = ub.a.Z().b(i11);
        lanCustomInfoB.setMain(progress.getMain().replace("\"", BuildConfig.VERSION_NAME));
        lanCustomInfoB.setMain_tt(TextUtils.isEmpty(progress.getMain_tt().trim()) ? null : progress.getMain_tt().trim());
        lanCustomInfoB.setLesson_exam(progress.getLesson_exam());
        lanCustomInfoB.setLesson_stars(progress.getLesson_stars());
        lanCustomInfoB.setPronun(progress.getPronun());
        ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB);
    }

    public Progress getAra() {
        return this.ara;
    }

    public Progress getAraup() {
        return this.araup;
    }

    public Progress getCn() {
        return this.f21934cn;
    }

    public Progress getCnup() {
        return this.cnup;
    }

    public Progress getDeoc() {
        return this.deoc;
    }

    public Progress getDeocup() {
        return this.deocup;
    }

    public Progress getEn() {
        return this.f21935en;
    }

    public Progress getEsoc() {
        return this.esoc;
    }

    public Progress getEsocup() {
        return this.esocup;
    }

    public Progress getEsus() {
        return this.esus;
    }

    public Progress getEsusup() {
        return this.esusup;
    }

    public Progress getFroc() {
        return this.froc;
    }

    public Progress getFrocup() {
        return this.frocup;
    }

    public Progress getFrus() {
        return this.frus;
    }

    public Progress getFrusup() {
        return this.frusup;
    }

    public Progress getGrk() {
        return this.grk;
    }

    public Progress getHindi() {
        return this.hindi;
    }

    public Progress getIdn() {
        return this.idn;
    }

    public Progress getItoc() {
        return this.itoc;
    }

    public Progress getItocup() {
        return this.itocup;
    }

    public Progress getJp() {
        return this.f21936jp;
    }

    public Progress getJpup() {
        return this.jpup;
    }

    public Progress getKr() {
        return this.f21937kr;
    }

    public Progress getKrup() {
        return this.krup;
    }

    public Progress getMal() {
        return this.mal;
    }

    public Progress getPol() {
        return this.pol;
    }

    public Progress getPt() {
        return this.f21938pt;
    }

    public Progress getPtup() {
        return this.ptup;
    }

    public Progress getRuoc() {
        return this.ruoc;
    }

    public Progress getRuocup() {
        return this.ruocup;
    }

    public Progress getThai() {
        return this.thai;
    }

    public Progress getTur() {
        return this.tur;
    }

    public Progress getUkr() {
        return this.ukr;
    }

    public Progress getVt() {
        return this.f21939vt;
    }

    public void setAra(Progress progress) {
        this.ara = progress;
    }

    public void setAraup(Progress progress) {
        this.araup = progress;
    }

    public void setCn(Progress progress) {
        this.f21934cn = progress;
    }

    public void setCnup(Progress progress) {
        this.cnup = progress;
    }

    public void setDeoc(Progress progress) {
        this.deoc = progress;
    }

    public void setDeocup(Progress progress) {
        this.deocup = progress;
    }

    public void setEn(Progress progress) {
        this.f21935en = progress;
    }

    public void setEsoc(Progress progress) {
        this.esoc = progress;
    }

    public void setEsocup(Progress progress) {
        this.esocup = progress;
    }

    public void setEsus(Progress progress) {
        this.esus = progress;
    }

    public void setEsusup(Progress progress) {
        this.esusup = progress;
    }

    public void setFroc(Progress progress) {
        this.froc = progress;
    }

    public void setFrocup(Progress progress) {
        this.frocup = progress;
    }

    public void setFrus(Progress progress) {
        this.frus = progress;
    }

    public void setFrusup(Progress progress) {
        this.frusup = progress;
    }

    public void setGrk(Progress progress) {
        this.grk = progress;
    }

    public void setHindi(Progress progress) {
        this.hindi = progress;
    }

    public void setIdn(Progress progress) {
        this.idn = progress;
    }

    public void setItoc(Progress progress) {
        this.itoc = progress;
    }

    public void setItocup(Progress progress) {
        this.itocup = progress;
    }

    public void setJp(Progress progress) {
        this.f21936jp = progress;
    }

    public void setJpup(Progress progress) {
        this.jpup = progress;
    }

    public void setKr(Progress progress) {
        this.f21937kr = progress;
    }

    public void setKrup(Progress progress) {
        this.krup = progress;
    }

    public void setMal(Progress progress) {
        this.mal = progress;
    }

    public void setPol(Progress progress) {
        this.pol = progress;
    }

    public void setPt(Progress progress) {
        this.f21938pt = progress;
    }

    public void setPtup(Progress progress) {
        this.ptup = progress;
    }

    public void setRuoc(Progress progress) {
        this.ruoc = progress;
    }

    public void setRuocup(Progress progress) {
        this.ruocup = progress;
    }

    public void setThai(Progress progress) {
        this.thai = progress;
    }

    public void setTur(Progress progress) {
        this.tur = progress;
    }

    public void setUkr(Progress progress) {
        this.ukr = progress;
    }

    public void setVt(Progress progress) {
        this.f21939vt = progress;
    }

    @Exclude
    public Map<String, Object> toMap() {
        HashMap map = new HashMap();
        map.put("cn", this.f21934cn);
        map.put("jp", this.f21936jp);
        map.put("kr", this.f21937kr);
        map.put("en", this.f21935en);
        map.put("vt", this.f21939vt);
        map.put("pt", this.f21938pt);
        map.put("esoc", this.esoc);
        map.put("froc", this.froc);
        map.put("deoc", this.deoc);
        map.put("cnup", this.cnup);
        map.put("jpup", this.jpup);
        map.put("krup", this.krup);
        map.put("esocup", this.esocup);
        map.put("frocup", this.frocup);
        map.put("deocup", this.deocup);
        map.put("ptup", this.ptup);
        map.put("ruoc", this.ruoc);
        map.put("ruocup", this.ruocup);
        map.put("itoc", this.itoc);
        map.put("itocup", this.itocup);
        map.put("esus", this.esus);
        map.put("esusup", this.esusup);
        map.put("frus", this.frus);
        map.put("frusup", this.frusup);
        map.put("ara", this.ara);
        map.put("araup", this.araup);
        map.put("thai", this.thai);
        map.put("tur", this.tur);
        map.put("hindi", this.hindi);
        map.put("ukr", this.ukr);
        map.put("grk", this.grk);
        map.put("idn", this.idn);
        map.put("pol", this.pol);
        map.put("mal", this.mal);
        return map;
    }

    public void writeToEnv(Env env) {
        if (getCn() != null) {
            writeProgress(0, getCn());
        }
        if (getJp() != null) {
            writeProgress(1, getJp());
        }
        if (getKr() != null) {
            writeProgress(2, getKr());
        }
        if (getEn() != null) {
            writeProgress(3, getEn());
        }
        if (getVt() != null) {
            writeProgress(7, getVt());
        }
        if (getPt() != null) {
            writeProgress(8, getPt());
        }
        if (getEsoc() != null) {
            writeProgress(4, getEsoc());
        }
        if (getFroc() != null) {
            writeProgress(5, getFroc());
        }
        if (getDeoc() != null) {
            writeProgress(6, getDeoc());
        }
        if (getCnup() != null) {
            writeProgress(11, getCnup());
        }
        if (getJpup() != null) {
            writeProgress(12, getJpup());
        }
        if (getKrup() != null) {
            writeProgress(13, getKrup());
        }
        if (getEsocup() != null) {
            writeProgress(14, getEsocup());
        }
        if (getFrocup() != null) {
            writeProgress(15, getFrocup());
        }
        if (getDeocup() != null) {
            writeProgress(16, getDeocup());
        }
        if (getPtup() != null) {
            writeProgress(17, getPtup());
        }
        if (getRuoc() != null) {
            writeProgress(10, getRuoc());
        }
        if (getRuocup() != null) {
            writeProgress(22, getRuocup());
        }
        if (getItoc() != null) {
            writeProgress(20, getItoc());
        }
        if (getItocup() != null) {
            writeProgress(40, getItocup());
        }
        if (getEsus() != null) {
            writeProgress(47, getEsus());
        }
        if (getEsusup() != null) {
            writeProgress(48, getEsusup());
        }
        if (getFrus() != null) {
            writeProgress(53, getFrus());
        }
        if (getFrusup() != null) {
            writeProgress(54, getFrusup());
        }
        if (getAra() != null) {
            writeProgress(51, getAra());
        }
        if (getAraup() != null) {
            writeProgress(55, getAraup());
        }
        if (getThai() != null) {
            writeProgress(57, getThai());
        }
        if (getTur() != null) {
            writeProgress(21, getTur());
        }
        if (getHindi() != null) {
            writeProgress(61, getHindi());
        }
        if (getUkr() != null) {
            writeProgress(63, getUkr());
        }
        if (getGrk() != null) {
            writeProgress(65, getGrk());
        }
        if (getIdn() != null) {
            writeProgress(18, getIdn());
        }
        if (getPol() != null) {
            writeProgress(19, getPol());
        }
        if (getMal() != null) {
            writeProgress(69, getMal());
        }
    }
}
