package ac;

import xb.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xb.e f558c;

    public n(o oVar, String str, xb.e eVar) {
        this.f556a = oVar;
        this.f557b = str;
        this.f558c = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return kotlin.jvm.internal.m.a(this.f556a, nVar.f556a) && kotlin.jvm.internal.m.a(this.f557b, nVar.f557b) && this.f558c == nVar.f558c;
    }

    public final int hashCode() {
        int iHashCode = this.f556a.hashCode() * 31;
        String str = this.f557b;
        return this.f558c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
