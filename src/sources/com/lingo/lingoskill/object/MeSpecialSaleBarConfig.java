package com.lingo.lingoskill.object;

import c00.e;
import com.google.android.material.datepicker.d;
import com.tbruyelle.rxpermissions3.BuildConfig;
import e00.g;
import f00.b;
import g00.o1;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@e
public final class MeSpecialSaleBarConfig {
    private String deepLink;
    private boolean isVisible;
    private boolean oib;
    private String title;
    private String titleColor;
    private String url;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final c00.a serializer() {
            return MeSpecialSaleBarConfig$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public MeSpecialSaleBarConfig() {
        this(false, (String) null, (String) null, (String) null, (String) null, false, 63, (f) null);
    }

    public static /* synthetic */ MeSpecialSaleBarConfig copy$default(MeSpecialSaleBarConfig meSpecialSaleBarConfig, boolean z11, String str, String str2, String str3, String str4, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = meSpecialSaleBarConfig.isVisible;
        }
        if ((i11 & 2) != 0) {
            str = meSpecialSaleBarConfig.title;
        }
        if ((i11 & 4) != 0) {
            str2 = meSpecialSaleBarConfig.titleColor;
        }
        if ((i11 & 8) != 0) {
            str3 = meSpecialSaleBarConfig.url;
        }
        if ((i11 & 16) != 0) {
            str4 = meSpecialSaleBarConfig.deepLink;
        }
        if ((i11 & 32) != 0) {
            z12 = meSpecialSaleBarConfig.oib;
        }
        String str5 = str4;
        boolean z13 = z12;
        return meSpecialSaleBarConfig.copy(z11, str, str2, str3, str5, z13);
    }

    public static final /* synthetic */ void write$Self$app_release(MeSpecialSaleBarConfig meSpecialSaleBarConfig, b bVar, g gVar) {
        if (bVar.G(gVar) || meSpecialSaleBarConfig.isVisible) {
            bVar.B(gVar, 0, meSpecialSaleBarConfig.isVisible);
        }
        if (bVar.G(gVar) || !m.a(meSpecialSaleBarConfig.title, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 1, meSpecialSaleBarConfig.title);
        }
        if (bVar.G(gVar) || !m.a(meSpecialSaleBarConfig.titleColor, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 2, meSpecialSaleBarConfig.titleColor);
        }
        if (bVar.G(gVar) || !m.a(meSpecialSaleBarConfig.url, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 3, meSpecialSaleBarConfig.url);
        }
        if (bVar.G(gVar) || !m.a(meSpecialSaleBarConfig.deepLink, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 4, meSpecialSaleBarConfig.deepLink);
        }
        if (bVar.G(gVar) || meSpecialSaleBarConfig.oib) {
            bVar.B(gVar, 5, meSpecialSaleBarConfig.oib);
        }
    }

    public final boolean component1() {
        return this.isVisible;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.titleColor;
    }

    public final String component4() {
        return this.url;
    }

    public final String component5() {
        return this.deepLink;
    }

    public final boolean component6() {
        return this.oib;
    }

    public final MeSpecialSaleBarConfig copy(boolean z11, String title, String titleColor, String url, String deepLink, boolean z12) {
        m.f(title, "title");
        m.f(titleColor, "titleColor");
        m.f(url, "url");
        m.f(deepLink, "deepLink");
        return new MeSpecialSaleBarConfig(z11, title, titleColor, url, deepLink, z12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MeSpecialSaleBarConfig)) {
            return false;
        }
        MeSpecialSaleBarConfig meSpecialSaleBarConfig = (MeSpecialSaleBarConfig) obj;
        return this.isVisible == meSpecialSaleBarConfig.isVisible && m.a(this.title, meSpecialSaleBarConfig.title) && m.a(this.titleColor, meSpecialSaleBarConfig.titleColor) && m.a(this.url, meSpecialSaleBarConfig.url) && m.a(this.deepLink, meSpecialSaleBarConfig.deepLink) && this.oib == meSpecialSaleBarConfig.oib;
    }

    public final String getDeepLink() {
        return this.deepLink;
    }

    public final boolean getOib() {
        return this.oib;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTitleColor() {
        return this.titleColor;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return Boolean.hashCode(this.oib) + defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(Boolean.hashCode(this.isVisible) * 31, 31, this.title), 31, this.titleColor), 31, this.url), 31, this.deepLink);
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final void setDeepLink(String str) {
        m.f(str, "<set-?>");
        this.deepLink = str;
    }

    public final void setOib(boolean z11) {
        this.oib = z11;
    }

    public final void setTitle(String str) {
        m.f(str, "<set-?>");
        this.title = str;
    }

    public final void setTitleColor(String str) {
        m.f(str, "<set-?>");
        this.titleColor = str;
    }

    public final void setUrl(String str) {
        m.f(str, "<set-?>");
        this.url = str;
    }

    public final void setVisible(boolean z11) {
        this.isVisible = z11;
    }

    public String toString() {
        boolean z11 = this.isVisible;
        String str = this.title;
        String str2 = this.titleColor;
        String str3 = this.url;
        String str4 = this.deepLink;
        boolean z12 = this.oib;
        StringBuilder sb2 = new StringBuilder("MeSpecialSaleBarConfig(isVisible=");
        sb2.append(z11);
        sb2.append(", title=");
        sb2.append(str);
        sb2.append(", titleColor=");
        d.w(sb2, str2, ", url=", str3, ", deepLink=");
        sb2.append(str4);
        sb2.append(", oib=");
        sb2.append(z12);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ MeSpecialSaleBarConfig(int i11, boolean z11, String str, String str2, String str3, String str4, boolean z12, o1 o1Var) {
        if ((i11 & 1) == 0) {
            this.isVisible = false;
        } else {
            this.isVisible = z11;
        }
        if ((i11 & 2) == 0) {
            this.title = BuildConfig.VERSION_NAME;
        } else {
            this.title = str;
        }
        if ((i11 & 4) == 0) {
            this.titleColor = BuildConfig.VERSION_NAME;
        } else {
            this.titleColor = str2;
        }
        if ((i11 & 8) == 0) {
            this.url = BuildConfig.VERSION_NAME;
        } else {
            this.url = str3;
        }
        if ((i11 & 16) == 0) {
            this.deepLink = BuildConfig.VERSION_NAME;
        } else {
            this.deepLink = str4;
        }
        if ((i11 & 32) == 0) {
            this.oib = false;
        } else {
            this.oib = z12;
        }
    }

    public MeSpecialSaleBarConfig(boolean z11, String title, String titleColor, String url, String deepLink, boolean z12) {
        m.f(title, "title");
        m.f(titleColor, "titleColor");
        m.f(url, "url");
        m.f(deepLink, "deepLink");
        this.isVisible = z11;
        this.title = title;
        this.titleColor = titleColor;
        this.url = url;
        this.deepLink = deepLink;
        this.oib = z12;
    }

    public /* synthetic */ MeSpecialSaleBarConfig(boolean z11, String str, String str2, String str3, String str4, boolean z12, int i11, f fVar) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? BuildConfig.VERSION_NAME : str, (i11 & 4) != 0 ? BuildConfig.VERSION_NAME : str2, (i11 & 8) != 0 ? BuildConfig.VERSION_NAME : str3, (i11 & 16) != 0 ? BuildConfig.VERSION_NAME : str4, (i11 & 32) != 0 ? false : z12);
    }
}
