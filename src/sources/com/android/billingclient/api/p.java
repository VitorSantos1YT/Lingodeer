package com.android.billingclient.api;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f7571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f7572b;

    public p(j billingResult, List list) {
        kotlin.jvm.internal.m.f(billingResult, "billingResult");
        this.f7571a = billingResult;
        this.f7572b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.m.a(this.f7571a, pVar.f7571a) && kotlin.jvm.internal.m.a(this.f7572b, pVar.f7572b);
    }

    public final int hashCode() {
        int iHashCode = this.f7571a.hashCode() * 31;
        List list = this.f7572b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProductDetailsResult(billingResult=");
        sb2.append(this.f7571a);
        sb2.append(", productDetailsList=");
        return b7.e0.n(sb2, this.f7572b, ")");
    }
}
