package u3;

import fr.j3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f52760c = new q(j3.A(0), j3.A(0));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f52761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f52762b;

    public q(long j11, long j12) {
        this.f52761a = j11;
        this.f52762b = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return v3.o.a(this.f52761a, qVar.f52761a) && v3.o.a(this.f52762b, qVar.f52762b);
    }

    public final int hashCode() {
        v3.p[] pVarArr = v3.o.f53500b;
        return Long.hashCode(this.f52762b) + (Long.hashCode(this.f52761a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) v3.o.f(this.f52761a)) + ", restLine=" + ((Object) v3.o.f(this.f52762b)) + ')';
    }
}
