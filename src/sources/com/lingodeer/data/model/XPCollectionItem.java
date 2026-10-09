package com.lingodeer.data.model;

import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import hh.p0;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class XPCollectionItem {
    private final int amount;
    private final int baseXP;
    private final String date;

    public XPCollectionItem(String date, int i11, int i12) {
        m.f(date, "date");
        this.date = date;
        this.amount = i11;
        this.baseXP = i12;
    }

    public static /* synthetic */ XPCollectionItem copy$default(XPCollectionItem xPCollectionItem, String str, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = xPCollectionItem.date;
        }
        if ((i13 & 2) != 0) {
            i11 = xPCollectionItem.amount;
        }
        if ((i13 & 4) != 0) {
            i12 = xPCollectionItem.baseXP;
        }
        return xPCollectionItem.copy(str, i11, i12);
    }

    public final String component1() {
        return this.date;
    }

    public final int component2() {
        return this.amount;
    }

    public final int component3() {
        return this.baseXP;
    }

    public final XPCollectionItem copy(String date, int i11, int i12) {
        m.f(date, "date");
        return new XPCollectionItem(date, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XPCollectionItem)) {
            return false;
        }
        XPCollectionItem xPCollectionItem = (XPCollectionItem) obj;
        return m.a(this.date, xPCollectionItem.date) && this.amount == xPCollectionItem.amount && this.baseXP == xPCollectionItem.baseXP;
    }

    public final int getAmount() {
        return this.amount;
    }

    public final int getBaseXP() {
        return this.baseXP;
    }

    public final String getDate() {
        return this.date;
    }

    public int hashCode() {
        return Integer.hashCode(this.baseXP) + e.b(this.amount, this.date.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.date;
        return p0.i(this.baseXP, ")", e.q(this.amount, "XPCollectionItem(date=", str, ", amount=", ", baseXP="));
    }

    public /* synthetic */ XPCollectionItem(String str, int i11, int i12, int i13, f fVar) {
        this((i13 & 1) != 0 ? BuildConfig.VERSION_NAME : str, i11, i12);
    }
}
