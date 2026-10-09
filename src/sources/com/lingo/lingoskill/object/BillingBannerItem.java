package com.lingo.lingoskill.object;

import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class BillingBannerItem {
    public static final int $stable = 8;
    private String desc;
    private int lottieRaw;
    private String title;

    public BillingBannerItem() {
        this(0, null, null, 7, null);
    }

    public static /* synthetic */ BillingBannerItem copy$default(BillingBannerItem billingBannerItem, int i11, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = billingBannerItem.lottieRaw;
        }
        if ((i12 & 2) != 0) {
            str = billingBannerItem.title;
        }
        if ((i12 & 4) != 0) {
            str2 = billingBannerItem.desc;
        }
        return billingBannerItem.copy(i11, str, str2);
    }

    public final int component1() {
        return this.lottieRaw;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.desc;
    }

    public final BillingBannerItem copy(int i11, String title, String desc) {
        m.f(title, "title");
        m.f(desc, "desc");
        return new BillingBannerItem(i11, title, desc);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillingBannerItem)) {
            return false;
        }
        BillingBannerItem billingBannerItem = (BillingBannerItem) obj;
        return this.lottieRaw == billingBannerItem.lottieRaw && m.a(this.title, billingBannerItem.title) && m.a(this.desc, billingBannerItem.desc);
    }

    public final String getDesc() {
        return this.desc;
    }

    public final int getLottieRaw() {
        return this.lottieRaw;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.desc.hashCode() + e.d(Integer.hashCode(this.lottieRaw) * 31, 31, this.title);
    }

    public final void setDesc(String str) {
        m.f(str, "<set-?>");
        this.desc = str;
    }

    public final void setLottieRaw(int i11) {
        this.lottieRaw = i11;
    }

    public final void setTitle(String str) {
        m.f(str, "<set-?>");
        this.title = str;
    }

    public String toString() {
        int i11 = this.lottieRaw;
        String str = this.title;
        String str2 = this.desc;
        StringBuilder sb2 = new StringBuilder("BillingBannerItem(lottieRaw=");
        sb2.append(i11);
        sb2.append(", title=");
        sb2.append(str);
        sb2.append(", desc=");
        return ep.a.k(sb2, str2, ")");
    }

    public BillingBannerItem(int i11, String title, String desc) {
        m.f(title, "title");
        m.f(desc, "desc");
        this.lottieRaw = i11;
        this.title = title;
        this.desc = desc;
    }

    public /* synthetic */ BillingBannerItem(int i11, String str, String str2, int i12, f fVar) {
        this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? BuildConfig.VERSION_NAME : str, (i12 & 4) != 0 ? BuildConfig.VERSION_NAME : str2);
    }
}
