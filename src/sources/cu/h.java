package cu;

import ch.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fz.a f22519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fz.a f22520d;

    public h(String str, String str2, fz.a aVar) {
        o0 o0Var = new o0(2, aVar);
        this.f22517a = str;
        this.f22518b = str2;
        this.f22519c = aVar;
        this.f22520d = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.m.a(this.f22517a, hVar.f22517a) && kotlin.jvm.internal.m.a(this.f22518b, hVar.f22518b) && kotlin.jvm.internal.m.a(this.f22519c, hVar.f22519c) && kotlin.jvm.internal.m.a(this.f22520d, hVar.f22520d);
    }

    public final int hashCode() {
        return this.f22520d.hashCode() + ((this.f22519c.hashCode() + defpackage.e.d(this.f22517a.hashCode() * 31, 31, this.f22518b)) * 31);
    }

    public final String toString() {
        StringBuilder sbS = defpackage.e.s("PreGeneratedDatabaseSpec(dbName=", this.f22517a, ", versionKey=", this.f22518b, ", zipFileProvider=");
        sbS.append(this.f22519c);
        sbS.append(", sourceIdentityTokenProvider=");
        sbS.append(this.f22520d);
        sbS.append(")");
        return sbS.toString();
    }
}
