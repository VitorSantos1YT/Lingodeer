package com.lingo.lingoskill.object;

import c00.e;
import com.tbruyelle.rxpermissions3.BuildConfig;
import e00.g;
import f00.b;
import g00.o1;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@e
public final class SaleActivityConfig {
    private String activityFAQTitle;
    private String activityFAQUrl;
    private String activityLifetimeSubTitle;
    private String activitySubTitle;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final c00.a serializer() {
            return SaleActivityConfig$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public SaleActivityConfig() {
        this((String) null, (String) null, (String) null, (String) null, 15, (f) null);
    }

    public static /* synthetic */ SaleActivityConfig copy$default(SaleActivityConfig saleActivityConfig, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = saleActivityConfig.activitySubTitle;
        }
        if ((i11 & 2) != 0) {
            str2 = saleActivityConfig.activityFAQTitle;
        }
        if ((i11 & 4) != 0) {
            str3 = saleActivityConfig.activityFAQUrl;
        }
        if ((i11 & 8) != 0) {
            str4 = saleActivityConfig.activityLifetimeSubTitle;
        }
        return saleActivityConfig.copy(str, str2, str3, str4);
    }

    public static final /* synthetic */ void write$Self$app_release(SaleActivityConfig saleActivityConfig, b bVar, g gVar) {
        if (bVar.G(gVar) || !m.a(saleActivityConfig.activitySubTitle, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 0, saleActivityConfig.activitySubTitle);
        }
        if (bVar.G(gVar) || !m.a(saleActivityConfig.activityFAQTitle, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 1, saleActivityConfig.activityFAQTitle);
        }
        if (bVar.G(gVar) || !m.a(saleActivityConfig.activityFAQUrl, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 2, saleActivityConfig.activityFAQUrl);
        }
        if (!bVar.G(gVar) && m.a(saleActivityConfig.activityLifetimeSubTitle, BuildConfig.VERSION_NAME)) {
            return;
        }
        bVar.w(gVar, 3, saleActivityConfig.activityLifetimeSubTitle);
    }

    public final String component1() {
        return this.activitySubTitle;
    }

    public final String component2() {
        return this.activityFAQTitle;
    }

    public final String component3() {
        return this.activityFAQUrl;
    }

    public final String component4() {
        return this.activityLifetimeSubTitle;
    }

    public final SaleActivityConfig copy(String activitySubTitle, String activityFAQTitle, String activityFAQUrl, String activityLifetimeSubTitle) {
        m.f(activitySubTitle, "activitySubTitle");
        m.f(activityFAQTitle, "activityFAQTitle");
        m.f(activityFAQUrl, "activityFAQUrl");
        m.f(activityLifetimeSubTitle, "activityLifetimeSubTitle");
        return new SaleActivityConfig(activitySubTitle, activityFAQTitle, activityFAQUrl, activityLifetimeSubTitle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaleActivityConfig)) {
            return false;
        }
        SaleActivityConfig saleActivityConfig = (SaleActivityConfig) obj;
        return m.a(this.activitySubTitle, saleActivityConfig.activitySubTitle) && m.a(this.activityFAQTitle, saleActivityConfig.activityFAQTitle) && m.a(this.activityFAQUrl, saleActivityConfig.activityFAQUrl) && m.a(this.activityLifetimeSubTitle, saleActivityConfig.activityLifetimeSubTitle);
    }

    public final String getActivityFAQTitle() {
        return this.activityFAQTitle;
    }

    public final String getActivityFAQUrl() {
        return this.activityFAQUrl;
    }

    public final String getActivityLifetimeSubTitle() {
        return this.activityLifetimeSubTitle;
    }

    public final String getActivitySubTitle() {
        return this.activitySubTitle;
    }

    public int hashCode() {
        return this.activityLifetimeSubTitle.hashCode() + defpackage.e.d(defpackage.e.d(this.activitySubTitle.hashCode() * 31, 31, this.activityFAQTitle), 31, this.activityFAQUrl);
    }

    public final void setActivityFAQTitle(String str) {
        m.f(str, "<set-?>");
        this.activityFAQTitle = str;
    }

    public final void setActivityFAQUrl(String str) {
        m.f(str, "<set-?>");
        this.activityFAQUrl = str;
    }

    public final void setActivityLifetimeSubTitle(String str) {
        m.f(str, "<set-?>");
        this.activityLifetimeSubTitle = str;
    }

    public final void setActivitySubTitle(String str) {
        m.f(str, "<set-?>");
        this.activitySubTitle = str;
    }

    public String toString() {
        String str = this.activitySubTitle;
        String str2 = this.activityFAQTitle;
        return defpackage.e.p(defpackage.e.s("SaleActivityConfig(activitySubTitle=", str, ", activityFAQTitle=", str2, ", activityFAQUrl="), this.activityFAQUrl, ", activityLifetimeSubTitle=", this.activityLifetimeSubTitle, ")");
    }

    public /* synthetic */ SaleActivityConfig(int i11, String str, String str2, String str3, String str4, o1 o1Var) {
        if ((i11 & 1) == 0) {
            this.activitySubTitle = BuildConfig.VERSION_NAME;
        } else {
            this.activitySubTitle = str;
        }
        if ((i11 & 2) == 0) {
            this.activityFAQTitle = BuildConfig.VERSION_NAME;
        } else {
            this.activityFAQTitle = str2;
        }
        if ((i11 & 4) == 0) {
            this.activityFAQUrl = BuildConfig.VERSION_NAME;
        } else {
            this.activityFAQUrl = str3;
        }
        if ((i11 & 8) == 0) {
            this.activityLifetimeSubTitle = BuildConfig.VERSION_NAME;
        } else {
            this.activityLifetimeSubTitle = str4;
        }
    }

    public SaleActivityConfig(String activitySubTitle, String activityFAQTitle, String activityFAQUrl, String activityLifetimeSubTitle) {
        m.f(activitySubTitle, "activitySubTitle");
        m.f(activityFAQTitle, "activityFAQTitle");
        m.f(activityFAQUrl, "activityFAQUrl");
        m.f(activityLifetimeSubTitle, "activityLifetimeSubTitle");
        this.activitySubTitle = activitySubTitle;
        this.activityFAQTitle = activityFAQTitle;
        this.activityFAQUrl = activityFAQUrl;
        this.activityLifetimeSubTitle = activityLifetimeSubTitle;
    }

    public /* synthetic */ SaleActivityConfig(String str, String str2, String str3, String str4, int i11, f fVar) {
        this((i11 & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i11 & 2) != 0 ? BuildConfig.VERSION_NAME : str2, (i11 & 4) != 0 ? BuildConfig.VERSION_NAME : str3, (i11 & 8) != 0 ? BuildConfig.VERSION_NAME : str4);
    }
}
