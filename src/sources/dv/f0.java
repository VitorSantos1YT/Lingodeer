package dv;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@c00.e
public final class f0 {
    public static final e0 Companion = new e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f24445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24447c;

    public /* synthetic */ f0(int i11, z zVar, int i12, String str) {
        this.f24445a = (i11 & 1) == 0 ? new z() : zVar;
        if ((i11 & 2) == 0) {
            this.f24446b = 0;
        } else {
            this.f24446b = i12;
        }
        if ((i11 & 4) == 0) {
            this.f24447c = BuildConfig.VERSION_NAME;
        } else {
            this.f24447c = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return kotlin.jvm.internal.m.a(this.f24445a, f0Var.f24445a) && this.f24446b == f0Var.f24446b && kotlin.jvm.internal.m.a(this.f24447c, f0Var.f24447c);
    }

    public final int hashCode() {
        return this.f24447c.hashCode() + defpackage.e.b(this.f24446b, this.f24445a.f24533a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GeminiServerResponse(result=");
        sb2.append(this.f24445a);
        sb2.append(", status=");
        sb2.append(this.f24446b);
        sb2.append(", error=");
        return ep.a.k(sb2, this.f24447c, ")");
    }
}
