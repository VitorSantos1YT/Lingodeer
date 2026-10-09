package com.lingodeer.database.model;

import defpackage.e;
import ep.a;
import kotlin.jvm.internal.m;
import zp.sBa.anrPHlQ;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class LanguageTransVersionEntity {

    /* JADX INFO: renamed from: cn, reason: collision with root package name */
    private final int f22369cn;
    private final int de;

    /* JADX INFO: renamed from: en, reason: collision with root package name */
    private final int f22370en;

    /* JADX INFO: renamed from: es, reason: collision with root package name */
    private final int f22371es;

    /* JADX INFO: renamed from: fr, reason: collision with root package name */
    private final int f22372fr;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f22373id;
    private final int idn;
    private final int it;

    /* JADX INFO: renamed from: jp, reason: collision with root package name */
    private final int f22374jp;

    /* JADX INFO: renamed from: kr, reason: collision with root package name */
    private final int f22375kr;
    private final int pol;

    /* JADX INFO: renamed from: pt, reason: collision with root package name */
    private final int f22376pt;

    /* JADX INFO: renamed from: ru, reason: collision with root package name */
    private final int f22377ru;
    private final int tch;
    private final int tur;

    /* JADX INFO: renamed from: vi, reason: collision with root package name */
    private final int f22378vi;

    public LanguageTransVersionEntity(String id2, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23, int i24, int i25, int i26) {
        m.f(id2, "id");
        this.f22373id = id2;
        this.f22369cn = i11;
        this.f22374jp = i12;
        this.f22375kr = i13;
        this.f22370en = i14;
        this.f22371es = i15;
        this.de = i16;
        this.f22372fr = i17;
        this.f22376pt = i18;
        this.f22378vi = i19;
        this.f22377ru = i21;
        this.tch = i22;
        this.idn = i23;
        this.pol = i24;
        this.it = i25;
        this.tur = i26;
    }

    public final String component1() {
        return this.f22373id;
    }

    public final int component10() {
        return this.f22378vi;
    }

    public final int component11() {
        return this.f22377ru;
    }

    public final int component12() {
        return this.tch;
    }

    public final int component13() {
        return this.idn;
    }

    public final int component14() {
        return this.pol;
    }

    public final int component15() {
        return this.it;
    }

    public final int component16() {
        return this.tur;
    }

    public final int component2() {
        return this.f22369cn;
    }

    public final int component3() {
        return this.f22374jp;
    }

    public final int component4() {
        return this.f22375kr;
    }

    public final int component5() {
        return this.f22370en;
    }

    public final int component6() {
        return this.f22371es;
    }

    public final int component7() {
        return this.de;
    }

    public final int component8() {
        return this.f22372fr;
    }

    public final int component9() {
        return this.f22376pt;
    }

    public final LanguageTransVersionEntity copy(String id2, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23, int i24, int i25, int i26) {
        m.f(id2, "id");
        return new LanguageTransVersionEntity(id2, i11, i12, i13, i14, i15, i16, i17, i18, i19, i21, i22, i23, i24, i25, i26);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LanguageTransVersionEntity)) {
            return false;
        }
        LanguageTransVersionEntity languageTransVersionEntity = (LanguageTransVersionEntity) obj;
        return m.a(this.f22373id, languageTransVersionEntity.f22373id) && this.f22369cn == languageTransVersionEntity.f22369cn && this.f22374jp == languageTransVersionEntity.f22374jp && this.f22375kr == languageTransVersionEntity.f22375kr && this.f22370en == languageTransVersionEntity.f22370en && this.f22371es == languageTransVersionEntity.f22371es && this.de == languageTransVersionEntity.de && this.f22372fr == languageTransVersionEntity.f22372fr && this.f22376pt == languageTransVersionEntity.f22376pt && this.f22378vi == languageTransVersionEntity.f22378vi && this.f22377ru == languageTransVersionEntity.f22377ru && this.tch == languageTransVersionEntity.tch && this.idn == languageTransVersionEntity.idn && this.pol == languageTransVersionEntity.pol && this.it == languageTransVersionEntity.it && this.tur == languageTransVersionEntity.tur;
    }

    public final int getCn() {
        return this.f22369cn;
    }

    public final int getDe() {
        return this.de;
    }

    public final int getEn() {
        return this.f22370en;
    }

    public final int getEs() {
        return this.f22371es;
    }

    public final int getFr() {
        return this.f22372fr;
    }

    public final String getId() {
        return this.f22373id;
    }

    public final int getIdn() {
        return this.idn;
    }

    public final int getIt() {
        return this.it;
    }

    public final int getJp() {
        return this.f22374jp;
    }

    public final int getKr() {
        return this.f22375kr;
    }

    public final int getPol() {
        return this.pol;
    }

    public final int getPt() {
        return this.f22376pt;
    }

    public final int getRu() {
        return this.f22377ru;
    }

    public final int getTch() {
        return this.tch;
    }

    public final int getTur() {
        return this.tur;
    }

    public final int getVi() {
        return this.f22378vi;
    }

    public int hashCode() {
        return Integer.hashCode(this.tur) + e.b(this.it, e.b(this.pol, e.b(this.idn, e.b(this.tch, e.b(this.f22377ru, e.b(this.f22378vi, e.b(this.f22376pt, e.b(this.f22372fr, e.b(this.de, e.b(this.f22371es, e.b(this.f22370en, e.b(this.f22375kr, e.b(this.f22374jp, e.b(this.f22369cn, this.f22373id.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        String str = this.f22373id;
        int i11 = this.f22369cn;
        int i12 = this.f22374jp;
        int i13 = this.f22375kr;
        int i14 = this.f22370en;
        int i15 = this.f22371es;
        int i16 = this.de;
        int i17 = this.f22372fr;
        int i18 = this.f22376pt;
        int i19 = this.f22378vi;
        int i21 = this.f22377ru;
        int i22 = this.tch;
        int i23 = this.idn;
        int i24 = this.pol;
        int i25 = this.it;
        int i26 = this.tur;
        StringBuilder sbQ = e.q(i11, "LanguageTransVersionEntity(id=", str, ", cn=", ", jp=");
        a.v(i12, i13, ", kr=", ", en=", sbQ);
        a.v(i14, i15, ", es=", ", de=", sbQ);
        a.v(i16, i17, ", fr=", ", pt=", sbQ);
        a.v(i18, i19, ", vi=", ", ru=", sbQ);
        a.v(i21, i22, ", tch=", anrPHlQ.OYAL, sbQ);
        a.v(i23, i24, ", pol=", ", it=", sbQ);
        sbQ.append(i25);
        sbQ.append(", tur=");
        sbQ.append(i26);
        sbQ.append(")");
        return sbQ.toString();
    }
}
