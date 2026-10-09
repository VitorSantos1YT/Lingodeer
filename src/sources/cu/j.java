package cu;

import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w9.s f22523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22525c;

    public j(w9.s database, String sourceIdentityToken, String str) {
        kotlin.jvm.internal.m.f(database, "database");
        kotlin.jvm.internal.m.f(sourceIdentityToken, "sourceIdentityToken");
        this.f22523a = database;
        this.f22524b = sourceIdentityToken;
        this.f22525c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.m.a(this.f22523a, jVar.f22523a) && kotlin.jvm.internal.m.a(this.f22524b, jVar.f22524b) && kotlin.jvm.internal.m.a(this.f22525c, jVar.f22525c);
    }

    public final int hashCode() {
        int iD = defpackage.e.d(this.f22523a.hashCode() * 31, 31, this.f22524b);
        String str = this.f22525c;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(bjXGJ.QIJ);
        sb2.append(this.f22523a);
        sb2.append(", sourceIdentityToken=");
        sb2.append(this.f22524b);
        sb2.append(", zipToken=");
        return ep.a.k(sb2, this.f22525c, ")");
    }
}
