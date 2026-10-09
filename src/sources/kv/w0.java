package kv;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class w0 implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f38827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f38829c;

    public w0(x0 x0Var, String str, String str2) {
        this.f38827a = x0Var;
        this.f38828b = str;
        this.f38829c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return kotlin.jvm.internal.m.a(this.f38827a, w0Var.f38827a) && kotlin.jvm.internal.m.a(this.f38828b, w0Var.f38828b) && kotlin.jvm.internal.m.a(this.f38829c, w0Var.f38829c);
    }

    public final int hashCode() {
        return this.f38829c.hashCode() + defpackage.e.d(this.f38827a.hashCode() * 31, 31, this.f38828b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Replace(text=");
        sb2.append(this.f38827a);
        sb2.append(", oldValue=");
        sb2.append(this.f38828b);
        sb2.append(", newValue=");
        return ep.a.k(sb2, this.f38829c, ")");
    }
}
