package com.lingo.lingoskill.object;

import c00.e;
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
public final class BillingDiscountDialogConfig {
    private String bannerPicUrl;
    private String buttonClickUrl;
    private int countPerDay;
    private int minEnterBillingCount;
    private boolean showFloatIcon;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final c00.a serializer() {
            return BillingDiscountDialogConfig$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public BillingDiscountDialogConfig() {
        this(0, (String) null, (String) null, 0, false, 31, (f) null);
    }

    public static /* synthetic */ BillingDiscountDialogConfig copy$default(BillingDiscountDialogConfig billingDiscountDialogConfig, int i11, String str, String str2, int i12, boolean z11, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = billingDiscountDialogConfig.minEnterBillingCount;
        }
        if ((i13 & 2) != 0) {
            str = billingDiscountDialogConfig.bannerPicUrl;
        }
        if ((i13 & 4) != 0) {
            str2 = billingDiscountDialogConfig.buttonClickUrl;
        }
        if ((i13 & 8) != 0) {
            i12 = billingDiscountDialogConfig.countPerDay;
        }
        if ((i13 & 16) != 0) {
            z11 = billingDiscountDialogConfig.showFloatIcon;
        }
        boolean z12 = z11;
        String str3 = str2;
        return billingDiscountDialogConfig.copy(i11, str, str3, i12, z12);
    }

    public static final /* synthetic */ void write$Self$app_release(BillingDiscountDialogConfig billingDiscountDialogConfig, b bVar, g gVar) {
        if (bVar.G(gVar) || billingDiscountDialogConfig.minEnterBillingCount != 999) {
            bVar.g(0, billingDiscountDialogConfig.minEnterBillingCount, gVar);
        }
        if (bVar.G(gVar) || !m.a(billingDiscountDialogConfig.bannerPicUrl, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 1, billingDiscountDialogConfig.bannerPicUrl);
        }
        if (bVar.G(gVar) || !m.a(billingDiscountDialogConfig.buttonClickUrl, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 2, billingDiscountDialogConfig.buttonClickUrl);
        }
        if (bVar.G(gVar) || billingDiscountDialogConfig.countPerDay != 0) {
            bVar.g(3, billingDiscountDialogConfig.countPerDay, gVar);
        }
        if (bVar.G(gVar) || billingDiscountDialogConfig.showFloatIcon) {
            bVar.B(gVar, 4, billingDiscountDialogConfig.showFloatIcon);
        }
    }

    public final int component1() {
        return this.minEnterBillingCount;
    }

    public final String component2() {
        return this.bannerPicUrl;
    }

    public final String component3() {
        return this.buttonClickUrl;
    }

    public final int component4() {
        return this.countPerDay;
    }

    public final boolean component5() {
        return this.showFloatIcon;
    }

    public final BillingDiscountDialogConfig copy(int i11, String bannerPicUrl, String buttonClickUrl, int i12, boolean z11) {
        m.f(bannerPicUrl, "bannerPicUrl");
        m.f(buttonClickUrl, "buttonClickUrl");
        return new BillingDiscountDialogConfig(i11, bannerPicUrl, buttonClickUrl, i12, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillingDiscountDialogConfig)) {
            return false;
        }
        BillingDiscountDialogConfig billingDiscountDialogConfig = (BillingDiscountDialogConfig) obj;
        return this.minEnterBillingCount == billingDiscountDialogConfig.minEnterBillingCount && m.a(this.bannerPicUrl, billingDiscountDialogConfig.bannerPicUrl) && m.a(this.buttonClickUrl, billingDiscountDialogConfig.buttonClickUrl) && this.countPerDay == billingDiscountDialogConfig.countPerDay && this.showFloatIcon == billingDiscountDialogConfig.showFloatIcon;
    }

    public final String getBannerPicUrl() {
        return this.bannerPicUrl;
    }

    public final String getButtonClickUrl() {
        return this.buttonClickUrl;
    }

    public final int getCountPerDay() {
        return this.countPerDay;
    }

    public final int getMinEnterBillingCount() {
        return this.minEnterBillingCount;
    }

    public final boolean getShowFloatIcon() {
        return this.showFloatIcon;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showFloatIcon) + defpackage.e.b(this.countPerDay, defpackage.e.d(defpackage.e.d(Integer.hashCode(this.minEnterBillingCount) * 31, 31, this.bannerPicUrl), 31, this.buttonClickUrl), 31);
    }

    public final void setBannerPicUrl(String str) {
        m.f(str, "<set-?>");
        this.bannerPicUrl = str;
    }

    public final void setButtonClickUrl(String str) {
        m.f(str, "<set-?>");
        this.buttonClickUrl = str;
    }

    public final void setCountPerDay(int i11) {
        this.countPerDay = i11;
    }

    public final void setMinEnterBillingCount(int i11) {
        this.minEnterBillingCount = i11;
    }

    public final void setShowFloatIcon(boolean z11) {
        this.showFloatIcon = z11;
    }

    public String toString() {
        int i11 = this.minEnterBillingCount;
        String str = this.bannerPicUrl;
        String str2 = this.buttonClickUrl;
        int i12 = this.countPerDay;
        boolean z11 = this.showFloatIcon;
        StringBuilder sb2 = new StringBuilder("BillingDiscountDialogConfig(minEnterBillingCount=");
        sb2.append(i11);
        sb2.append(", bannerPicUrl=");
        sb2.append(str);
        sb2.append(", buttonClickUrl=");
        sb2.append(str2);
        sb2.append(", countPerDay=");
        sb2.append(i12);
        sb2.append(", showFloatIcon=");
        return p0.p(sb2, z11, ")");
    }

    public /* synthetic */ BillingDiscountDialogConfig(int i11, int i12, String str, String str2, int i13, boolean z11, o1 o1Var) {
        this.minEnterBillingCount = (i11 & 1) == 0 ? 999 : i12;
        if ((i11 & 2) == 0) {
            this.bannerPicUrl = BuildConfig.VERSION_NAME;
        } else {
            this.bannerPicUrl = str;
        }
        if ((i11 & 4) == 0) {
            this.buttonClickUrl = BuildConfig.VERSION_NAME;
        } else {
            this.buttonClickUrl = str2;
        }
        if ((i11 & 8) == 0) {
            this.countPerDay = 0;
        } else {
            this.countPerDay = i13;
        }
        if ((i11 & 16) == 0) {
            this.showFloatIcon = false;
        } else {
            this.showFloatIcon = z11;
        }
    }

    public BillingDiscountDialogConfig(int i11, String bannerPicUrl, String buttonClickUrl, int i12, boolean z11) {
        m.f(bannerPicUrl, "bannerPicUrl");
        m.f(buttonClickUrl, "buttonClickUrl");
        this.minEnterBillingCount = i11;
        this.bannerPicUrl = bannerPicUrl;
        this.buttonClickUrl = buttonClickUrl;
        this.countPerDay = i12;
        this.showFloatIcon = z11;
    }

    public /* synthetic */ BillingDiscountDialogConfig(int i11, String str, String str2, int i12, boolean z11, int i13, f fVar) {
        this((i13 & 1) != 0 ? 999 : i11, (i13 & 2) != 0 ? BuildConfig.VERSION_NAME : str, (i13 & 4) != 0 ? BuildConfig.VERSION_NAME : str2, (i13 & 8) != 0 ? 0 : i12, (i13 & 16) != 0 ? false : z11);
    }
}
