package com.lingodeer.data.model;

import com.google.android.material.datepicker.d;
import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import hh.p0;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ChineseToneMetaData {
    private final String character;
    private final boolean isToneChange;
    private final boolean m0ShowCharacter;
    private final String qingSheng;
    private final String shengDiao;
    private final String shengMu;
    private final String yunMu;

    public ChineseToneMetaData(String shengMu, String yunMu, String qingSheng, String shengDiao, String character, boolean z11, boolean z12) {
        m.f(shengMu, "shengMu");
        m.f(yunMu, "yunMu");
        m.f(qingSheng, "qingSheng");
        m.f(shengDiao, "shengDiao");
        m.f(character, "character");
        this.shengMu = shengMu;
        this.yunMu = yunMu;
        this.qingSheng = qingSheng;
        this.shengDiao = shengDiao;
        this.character = character;
        this.m0ShowCharacter = z11;
        this.isToneChange = z12;
    }

    public static /* synthetic */ ChineseToneMetaData copy$default(ChineseToneMetaData chineseToneMetaData, String str, String str2, String str3, String str4, String str5, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = chineseToneMetaData.shengMu;
        }
        if ((i11 & 2) != 0) {
            str2 = chineseToneMetaData.yunMu;
        }
        if ((i11 & 4) != 0) {
            str3 = chineseToneMetaData.qingSheng;
        }
        if ((i11 & 8) != 0) {
            str4 = chineseToneMetaData.shengDiao;
        }
        if ((i11 & 16) != 0) {
            str5 = chineseToneMetaData.character;
        }
        if ((i11 & 32) != 0) {
            z11 = chineseToneMetaData.m0ShowCharacter;
        }
        if ((i11 & 64) != 0) {
            z12 = chineseToneMetaData.isToneChange;
        }
        boolean z13 = z11;
        boolean z14 = z12;
        String str6 = str5;
        String str7 = str3;
        return chineseToneMetaData.copy(str, str2, str7, str4, str6, z13, z14);
    }

    public final String component1() {
        return this.shengMu;
    }

    public final String component2() {
        return this.yunMu;
    }

    public final String component3() {
        return this.qingSheng;
    }

    public final String component4() {
        return this.shengDiao;
    }

    public final String component5() {
        return this.character;
    }

    public final boolean component6() {
        return this.m0ShowCharacter;
    }

    public final boolean component7() {
        return this.isToneChange;
    }

    public final ChineseToneMetaData copy(String shengMu, String yunMu, String qingSheng, String shengDiao, String character, boolean z11, boolean z12) {
        m.f(shengMu, "shengMu");
        m.f(yunMu, "yunMu");
        m.f(qingSheng, "qingSheng");
        m.f(shengDiao, "shengDiao");
        m.f(character, "character");
        return new ChineseToneMetaData(shengMu, yunMu, qingSheng, shengDiao, character, z11, z12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChineseToneMetaData)) {
            return false;
        }
        ChineseToneMetaData chineseToneMetaData = (ChineseToneMetaData) obj;
        return m.a(this.shengMu, chineseToneMetaData.shengMu) && m.a(this.yunMu, chineseToneMetaData.yunMu) && m.a(this.qingSheng, chineseToneMetaData.qingSheng) && m.a(this.shengDiao, chineseToneMetaData.shengDiao) && m.a(this.character, chineseToneMetaData.character) && this.m0ShowCharacter == chineseToneMetaData.m0ShowCharacter && this.isToneChange == chineseToneMetaData.isToneChange;
    }

    public final String getCharacter() {
        return this.character;
    }

    public final boolean getM0ShowCharacter() {
        return this.m0ShowCharacter;
    }

    public final String getQingSheng() {
        return this.qingSheng;
    }

    public final String getShengDiao() {
        return this.shengDiao;
    }

    public final String getShengMu() {
        return this.shengMu;
    }

    public final String getYunMu() {
        return this.yunMu;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isToneChange) + e.e(e.d(e.d(e.d(e.d(this.shengMu.hashCode() * 31, 31, this.yunMu), 31, this.qingSheng), 31, this.shengDiao), 31, this.character), 31, this.m0ShowCharacter);
    }

    public final boolean isToneChange() {
        return this.isToneChange;
    }

    public String toString() {
        String str = this.shengMu;
        String str2 = this.yunMu;
        String str3 = this.qingSheng;
        String str4 = this.shengDiao;
        String str5 = this.character;
        boolean z11 = this.m0ShowCharacter;
        boolean z12 = this.isToneChange;
        StringBuilder sbS = e.s("ChineseToneMetaData(shengMu=", str, ", yunMu=", str2, ", qingSheng=");
        d.w(sbS, str3, ", shengDiao=", str4, ", character=");
        sbS.append(str5);
        sbS.append(", m0ShowCharacter=");
        sbS.append(z11);
        sbS.append(", isToneChange=");
        return p0.p(sbS, z12, ")");
    }

    public ChineseToneMetaData() {
        this(BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, false, false);
    }
}
