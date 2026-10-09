package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q8 f31202b;

    public v8(String str, q8 q8Var) {
        this.f31201a = str;
        this.f31202b = q8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v8.class != obj.getClass()) {
            return false;
        }
        v8 v8Var = (v8) obj;
        return kotlin.jvm.internal.m.a(this.f31201a, v8Var.f31201a) && this.f31202b == v8Var.f31202b;
    }

    public final int hashCode() {
        return this.f31202b.hashCode() + defpackage.e.e(this.f31201a.hashCode() * 961, 31, false);
    }
}
