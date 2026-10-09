package com.lingo.lingoskill.object;

import bw.ORXQ.ADSb;
import c00.e;
import com.google.android.material.datepicker.d;
import com.tbruyelle.rxpermissions3.BuildConfig;
import e00.g;
import f00.b;
import g00.o1;
import hh.p0;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@e
public final class SpecialBillingPageConfig {
    private String banner_url;
    private String cta_button_text;
    private String iap_desc;
    private String iap_id;
    private String iap_name;
    private String iap_type;
    private String item5;
    private int saleTime;
    private String subtitle;
    private String title;
    private String toolbar_text;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final c00.a serializer() {
            return SpecialBillingPageConfig$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public SpecialBillingPageConfig() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 2047, (f) null);
    }

    public static /* synthetic */ SpecialBillingPageConfig copy$default(SpecialBillingPageConfig specialBillingPageConfig, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = specialBillingPageConfig.toolbar_text;
        }
        if ((i12 & 2) != 0) {
            str2 = specialBillingPageConfig.banner_url;
        }
        if ((i12 & 4) != 0) {
            str3 = specialBillingPageConfig.title;
        }
        if ((i12 & 8) != 0) {
            str4 = specialBillingPageConfig.subtitle;
        }
        if ((i12 & 16) != 0) {
            str5 = specialBillingPageConfig.iap_name;
        }
        if ((i12 & 32) != 0) {
            str6 = specialBillingPageConfig.iap_desc;
        }
        if ((i12 & 64) != 0) {
            str7 = specialBillingPageConfig.iap_id;
        }
        if ((i12 & 128) != 0) {
            str8 = specialBillingPageConfig.iap_type;
        }
        if ((i12 & 256) != 0) {
            str9 = specialBillingPageConfig.item5;
        }
        if ((i12 & 512) != 0) {
            str10 = specialBillingPageConfig.cta_button_text;
        }
        if ((i12 & 1024) != 0) {
            i11 = specialBillingPageConfig.saleTime;
        }
        String str11 = str10;
        int i13 = i11;
        String str12 = str8;
        String str13 = str9;
        String str14 = str6;
        String str15 = str7;
        String str16 = str5;
        String str17 = str3;
        return specialBillingPageConfig.copy(str, str2, str17, str4, str16, str14, str15, str12, str13, str11, i13);
    }

    public static final /* synthetic */ void write$Self$app_release(SpecialBillingPageConfig specialBillingPageConfig, b bVar, g gVar) {
        if (bVar.G(gVar) || !m.a(specialBillingPageConfig.toolbar_text, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 0, specialBillingPageConfig.toolbar_text);
        }
        if (bVar.G(gVar) || !m.a(specialBillingPageConfig.banner_url, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 1, specialBillingPageConfig.banner_url);
        }
        if (bVar.G(gVar) || !m.a(specialBillingPageConfig.title, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 2, specialBillingPageConfig.title);
        }
        if (bVar.G(gVar) || !m.a(specialBillingPageConfig.subtitle, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 3, specialBillingPageConfig.subtitle);
        }
        if (bVar.G(gVar) || !m.a(specialBillingPageConfig.iap_name, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 4, specialBillingPageConfig.iap_name);
        }
        if (bVar.G(gVar) || !m.a(specialBillingPageConfig.iap_desc, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 5, specialBillingPageConfig.iap_desc);
        }
        if (bVar.G(gVar) || !m.a(specialBillingPageConfig.iap_id, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 6, specialBillingPageConfig.iap_id);
        }
        if (bVar.G(gVar) || !m.a(specialBillingPageConfig.iap_type, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 7, specialBillingPageConfig.iap_type);
        }
        if (bVar.G(gVar) || !m.a(specialBillingPageConfig.item5, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 8, specialBillingPageConfig.item5);
        }
        if (bVar.G(gVar) || !m.a(specialBillingPageConfig.cta_button_text, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 9, specialBillingPageConfig.cta_button_text);
        }
        if (!bVar.G(gVar) && specialBillingPageConfig.saleTime == 60) {
            return;
        }
        bVar.g(10, specialBillingPageConfig.saleTime, gVar);
    }

    public final String component1() {
        return this.toolbar_text;
    }

    public final String component10() {
        return this.cta_button_text;
    }

    public final int component11() {
        return this.saleTime;
    }

    public final String component2() {
        return this.banner_url;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.subtitle;
    }

    public final String component5() {
        return this.iap_name;
    }

    public final String component6() {
        return this.iap_desc;
    }

    public final String component7() {
        return this.iap_id;
    }

    public final String component8() {
        return this.iap_type;
    }

    public final String component9() {
        return this.item5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpecialBillingPageConfig)) {
            return false;
        }
        SpecialBillingPageConfig specialBillingPageConfig = (SpecialBillingPageConfig) obj;
        return m.a(this.toolbar_text, specialBillingPageConfig.toolbar_text) && m.a(this.banner_url, specialBillingPageConfig.banner_url) && m.a(this.title, specialBillingPageConfig.title) && m.a(this.subtitle, specialBillingPageConfig.subtitle) && m.a(this.iap_name, specialBillingPageConfig.iap_name) && m.a(this.iap_desc, specialBillingPageConfig.iap_desc) && m.a(this.iap_id, specialBillingPageConfig.iap_id) && m.a(this.iap_type, specialBillingPageConfig.iap_type) && m.a(this.item5, specialBillingPageConfig.item5) && m.a(this.cta_button_text, specialBillingPageConfig.cta_button_text) && this.saleTime == specialBillingPageConfig.saleTime;
    }

    public final String getBanner_url() {
        return this.banner_url;
    }

    public final String getCta_button_text() {
        return this.cta_button_text;
    }

    public final String getIap_desc() {
        return this.iap_desc;
    }

    public final String getIap_id() {
        return this.iap_id;
    }

    public final String getIap_name() {
        return this.iap_name;
    }

    public final String getIap_type() {
        return this.iap_type;
    }

    public final String getItem5() {
        return this.item5;
    }

    public final int getSaleTime() {
        return this.saleTime;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getToolbar_text() {
        return this.toolbar_text;
    }

    public int hashCode() {
        return Integer.hashCode(this.saleTime) + defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(this.toolbar_text.hashCode() * 31, 31, this.banner_url), 31, this.title), 31, this.subtitle), 31, this.iap_name), 31, this.iap_desc), 31, this.iap_id), 31, this.iap_type), 31, this.item5), 31, this.cta_button_text);
    }

    public final void setBanner_url(String str) {
        m.f(str, "<set-?>");
        this.banner_url = str;
    }

    public final void setCta_button_text(String str) {
        m.f(str, "<set-?>");
        this.cta_button_text = str;
    }

    public final void setIap_desc(String str) {
        m.f(str, "<set-?>");
        this.iap_desc = str;
    }

    public final void setIap_id(String str) {
        m.f(str, "<set-?>");
        this.iap_id = str;
    }

    public final void setIap_name(String str) {
        m.f(str, "<set-?>");
        this.iap_name = str;
    }

    public final void setIap_type(String str) {
        m.f(str, "<set-?>");
        this.iap_type = str;
    }

    public final void setItem5(String str) {
        m.f(str, "<set-?>");
        this.item5 = str;
    }

    public final void setSaleTime(int i11) {
        this.saleTime = i11;
    }

    public final void setSubtitle(String str) {
        m.f(str, "<set-?>");
        this.subtitle = str;
    }

    public final void setTitle(String str) {
        m.f(str, "<set-?>");
        this.title = str;
    }

    public final void setToolbar_text(String str) {
        m.f(str, "<set-?>");
        this.toolbar_text = str;
    }

    public String toString() {
        String str = this.toolbar_text;
        String str2 = this.banner_url;
        String str3 = this.title;
        String str4 = this.subtitle;
        String str5 = this.iap_name;
        String str6 = this.iap_desc;
        String str7 = this.iap_id;
        String str8 = this.iap_type;
        String str9 = this.item5;
        String str10 = this.cta_button_text;
        int i11 = this.saleTime;
        StringBuilder sbS = defpackage.e.s("SpecialBillingPageConfig(toolbar_text=", str, ", banner_url=", str2, ", title=");
        d.w(sbS, str3, ", subtitle=", str4, ", iap_name=");
        d.w(sbS, str5, ", iap_desc=", str6, ", iap_id=");
        d.w(sbS, str7, ", iap_type=", str8, ", item5=");
        d.w(sbS, str9, ", cta_button_text=", str10, ", saleTime=");
        return p0.i(i11, ")", sbS);
    }

    public /* synthetic */ SpecialBillingPageConfig(int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i12, o1 o1Var) {
        if ((i11 & 1) == 0) {
            this.toolbar_text = BuildConfig.VERSION_NAME;
        } else {
            this.toolbar_text = str;
        }
        if ((i11 & 2) == 0) {
            this.banner_url = BuildConfig.VERSION_NAME;
        } else {
            this.banner_url = str2;
        }
        if ((i11 & 4) == 0) {
            this.title = BuildConfig.VERSION_NAME;
        } else {
            this.title = str3;
        }
        if ((i11 & 8) == 0) {
            this.subtitle = BuildConfig.VERSION_NAME;
        } else {
            this.subtitle = str4;
        }
        if ((i11 & 16) == 0) {
            this.iap_name = BuildConfig.VERSION_NAME;
        } else {
            this.iap_name = str5;
        }
        if ((i11 & 32) == 0) {
            this.iap_desc = BuildConfig.VERSION_NAME;
        } else {
            this.iap_desc = str6;
        }
        if ((i11 & 64) == 0) {
            this.iap_id = BuildConfig.VERSION_NAME;
        } else {
            this.iap_id = str7;
        }
        if ((i11 & 128) == 0) {
            this.iap_type = BuildConfig.VERSION_NAME;
        } else {
            this.iap_type = str8;
        }
        if ((i11 & 256) == 0) {
            this.item5 = BuildConfig.VERSION_NAME;
        } else {
            this.item5 = str9;
        }
        if ((i11 & 512) == 0) {
            this.cta_button_text = BuildConfig.VERSION_NAME;
        } else {
            this.cta_button_text = str10;
        }
        if ((i11 & 1024) == 0) {
            this.saleTime = 60;
        } else {
            this.saleTime = i12;
        }
    }

    public final SpecialBillingPageConfig copy(String toolbar_text, String banner_url, String title, String subtitle, String str, String iap_desc, String iap_id, String iap_type, String item5, String cta_button_text, int i11) {
        m.f(toolbar_text, "toolbar_text");
        m.f(banner_url, "banner_url");
        m.f(title, "title");
        m.f(subtitle, "subtitle");
        m.f(str, ADSb.GyqRjBBnrkNBB);
        m.f(iap_desc, "iap_desc");
        m.f(iap_id, "iap_id");
        m.f(iap_type, "iap_type");
        m.f(item5, "item5");
        m.f(cta_button_text, "cta_button_text");
        return new SpecialBillingPageConfig(toolbar_text, banner_url, title, subtitle, str, iap_desc, iap_id, iap_type, item5, cta_button_text, i11);
    }

    public SpecialBillingPageConfig(String toolbar_text, String banner_url, String title, String subtitle, String iap_name, String iap_desc, String iap_id, String iap_type, String item5, String cta_button_text, int i11) {
        m.f(toolbar_text, "toolbar_text");
        m.f(banner_url, "banner_url");
        m.f(title, "title");
        m.f(subtitle, "subtitle");
        m.f(iap_name, "iap_name");
        m.f(iap_desc, "iap_desc");
        m.f(iap_id, "iap_id");
        m.f(iap_type, "iap_type");
        m.f(item5, "item5");
        m.f(cta_button_text, "cta_button_text");
        this.toolbar_text = toolbar_text;
        this.banner_url = banner_url;
        this.title = title;
        this.subtitle = subtitle;
        this.iap_name = iap_name;
        this.iap_desc = iap_desc;
        this.iap_id = iap_id;
        this.iap_type = iap_type;
        this.item5 = item5;
        this.cta_button_text = cta_button_text;
        this.saleTime = i11;
    }

    public /* synthetic */ SpecialBillingPageConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i11, int i12, f fVar) {
        this((i12 & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i12 & 2) != 0 ? BuildConfig.VERSION_NAME : str2, (i12 & 4) != 0 ? BuildConfig.VERSION_NAME : str3, (i12 & 8) != 0 ? BuildConfig.VERSION_NAME : str4, (i12 & 16) != 0 ? BuildConfig.VERSION_NAME : str5, (i12 & 32) != 0 ? BuildConfig.VERSION_NAME : str6, (i12 & 64) != 0 ? BuildConfig.VERSION_NAME : str7, (i12 & 128) != 0 ? BuildConfig.VERSION_NAME : str8, (i12 & 256) != 0 ? BuildConfig.VERSION_NAME : str9, (i12 & 512) != 0 ? BuildConfig.VERSION_NAME : str10, (i12 & 1024) != 0 ? 60 : i11);
    }
}
