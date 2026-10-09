package vt;

import sz.xej.iFLeRCXvYCGdPW;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54180b;

    public b0(String str, String str2) {
        this.f54179a = str;
        this.f54180b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return kotlin.jvm.internal.m.a(this.f54179a, b0Var.f54179a) && kotlin.jvm.internal.m.a(this.f54180b, b0Var.f54180b);
    }

    public final int hashCode() {
        return this.f54180b.hashCode() + (this.f54179a.hashCode() * 31);
    }

    public final String toString() {
        return ep.a.h(iFLeRCXvYCGdPW.peNzIjFrxlbXQ, this.f54179a, ", zipName=", this.f54180b, ")");
    }
}
