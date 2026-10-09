package com.lingo.lingoskill.object;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class AppSetting {

    /* JADX INFO: renamed from: cn, reason: collision with root package name */
    CNSetting f21918cn = new CNSetting();

    /* JADX INFO: renamed from: jp, reason: collision with root package name */
    JPSetting f21919jp = new JPSetting();

    /* JADX INFO: renamed from: kr, reason: collision with root package name */
    KRSetting f21920kr = new KRSetting();
    Others others = new Others();

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class CNSetting {
        int char_display = 0;
        int lan_display = 2;

        public CNSetting() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class JPSetting {
        int char_display = 0;
        int lan_display = 6;
        int romaji_display = 1;

        public JPSetting() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class KRSetting {
        int lan_display = 2;

        public KRSetting() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Others {
        String learninglan = "jp";
        String reminders = BuildConfig.VERSION_NAME;
        boolean soundeffect = true;
        String uilan = "en";

        public String getLearninglan() {
            return this.learninglan;
        }

        public String getUilan() {
            return this.uilan;
        }

        public void setLearninglan(String str) {
            this.learninglan = str;
        }

        public void setUilan(String str) {
            this.uilan = str;
        }
    }

    public CNSetting getCn() {
        return this.f21918cn;
    }

    public JPSetting getJp() {
        return this.f21919jp;
    }

    public KRSetting getKr() {
        return this.f21920kr;
    }

    public Others getOthers() {
        return this.others;
    }

    public void setCn(CNSetting cNSetting) {
        this.f21918cn = cNSetting;
    }

    public void setJp(JPSetting jPSetting) {
        this.f21919jp = jPSetting;
    }

    public void setKr(KRSetting kRSetting) {
        this.f21920kr = kRSetting;
    }

    public void setOthers(Others others) {
        this.others = others;
    }
}
