package o3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j3.h f44670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f44671b;

    public d0(j3.h hVar, p pVar) {
        this.f44670a = hVar;
        this.f44671b = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return kotlin.jvm.internal.m.a(this.f44670a, d0Var.f44670a) && kotlin.jvm.internal.m.a(this.f44671b, d0Var.f44671b);
    }

    public final int hashCode() {
        return this.f44671b.hashCode() + (this.f44670a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f44670a) + ", offsetMapping=" + this.f44671b + ')';
    }
}
