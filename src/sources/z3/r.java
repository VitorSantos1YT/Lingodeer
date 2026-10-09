package z3;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f58784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f58785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f58786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f58787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f58788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f58789f;

    public /* synthetic */ r(int i11) {
        this((i11 & 1) != 0, (i11 & 2) != 0, (i11 & 4) != 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f58784a == rVar.f58784a && this.f58785b == rVar.f58785b && this.f58786c == rVar.f58786c && this.f58787d == rVar.f58787d && this.f58788e == rVar.f58788e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f58788e) + defpackage.e.e((this.f58786c.hashCode() + defpackage.e.e(Boolean.hashCode(this.f58784a) * 31, 31, this.f58785b)) * 31, 31, this.f58787d);
    }

    public r(boolean z11, boolean z12, boolean z13) {
        a0 a0Var = a0.Inherit;
        this.f58784a = z11;
        this.f58785b = z12;
        this.f58786c = a0Var;
        this.f58787d = z13;
        this.f58788e = true;
        this.f58789f = BuildConfig.VERSION_NAME;
    }
}
