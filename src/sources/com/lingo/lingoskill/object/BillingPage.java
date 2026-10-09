package com.lingo.lingoskill.object;

import aj.uZCn.evRpcb;
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
public final class BillingPage {
    private String colorAccent;
    private String colorMonthly;
    private String colorQuarterly;
    private String colorSaleBg;
    private String colorSaleTxt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final c00.a serializer() {
            return BillingPage$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public BillingPage() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (f) null);
    }

    public static final /* synthetic */ void write$Self$app_release(BillingPage billingPage, b bVar, g gVar) {
        if (bVar.G(gVar) || !m.a(billingPage.colorAccent, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 0, billingPage.colorAccent);
        }
        if (bVar.G(gVar) || !m.a(billingPage.colorMonthly, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 1, billingPage.colorMonthly);
        }
        if (bVar.G(gVar) || !m.a(billingPage.colorQuarterly, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 2, billingPage.colorQuarterly);
        }
        if (bVar.G(gVar) || !m.a(billingPage.colorSaleBg, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 3, billingPage.colorSaleBg);
        }
        if (!bVar.G(gVar) && m.a(billingPage.colorSaleTxt, BuildConfig.VERSION_NAME)) {
            return;
        }
        bVar.w(gVar, 4, billingPage.colorSaleTxt);
    }

    public final String getColorAccent() {
        return this.colorAccent;
    }

    public final String getColorMonthly() {
        return this.colorMonthly;
    }

    public final String getColorQuarterly() {
        return this.colorQuarterly;
    }

    public final String getColorSaleBg() {
        return this.colorSaleBg;
    }

    public final String getColorSaleTxt() {
        return this.colorSaleTxt;
    }

    public final void setColorAccent(String str) {
        m.f(str, "<set-?>");
        this.colorAccent = str;
    }

    public final void setColorMonthly(String str) {
        m.f(str, "<set-?>");
        this.colorMonthly = str;
    }

    public final void setColorSaleBg(String str) {
        m.f(str, "<set-?>");
        this.colorSaleBg = str;
    }

    public final void setColorSaleTxt(String str) {
        m.f(str, "<set-?>");
        this.colorSaleTxt = str;
    }

    public /* synthetic */ BillingPage(int i11, String str, String str2, String str3, String str4, String str5, o1 o1Var) {
        if ((i11 & 1) == 0) {
            this.colorAccent = BuildConfig.VERSION_NAME;
        } else {
            this.colorAccent = str;
        }
        if ((i11 & 2) == 0) {
            this.colorMonthly = BuildConfig.VERSION_NAME;
        } else {
            this.colorMonthly = str2;
        }
        if ((i11 & 4) == 0) {
            this.colorQuarterly = BuildConfig.VERSION_NAME;
        } else {
            this.colorQuarterly = str3;
        }
        if ((i11 & 8) == 0) {
            this.colorSaleBg = BuildConfig.VERSION_NAME;
        } else {
            this.colorSaleBg = str4;
        }
        if ((i11 & 16) == 0) {
            this.colorSaleTxt = BuildConfig.VERSION_NAME;
        } else {
            this.colorSaleTxt = str5;
        }
    }

    public final void setColorQuarterly(String str) {
        m.f(str, evRpcb.DWVL);
        this.colorQuarterly = str;
    }

    public BillingPage(String colorAccent, String colorMonthly, String colorQuarterly, String colorSaleBg, String colorSaleTxt) {
        m.f(colorAccent, "colorAccent");
        m.f(colorMonthly, "colorMonthly");
        m.f(colorQuarterly, "colorQuarterly");
        m.f(colorSaleBg, "colorSaleBg");
        m.f(colorSaleTxt, "colorSaleTxt");
        this.colorAccent = colorAccent;
        this.colorMonthly = colorMonthly;
        this.colorQuarterly = colorQuarterly;
        this.colorSaleBg = colorSaleBg;
        this.colorSaleTxt = colorSaleTxt;
    }

    public /* synthetic */ BillingPage(String str, String str2, String str3, String str4, String str5, int i11, f fVar) {
        this((i11 & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i11 & 2) != 0 ? BuildConfig.VERSION_NAME : str2, (i11 & 4) != 0 ? BuildConfig.VERSION_NAME : str3, (i11 & 8) != 0 ? BuildConfig.VERSION_NAME : str4, (i11 & 16) != 0 ? BuildConfig.VERSION_NAME : str5);
    }
}
