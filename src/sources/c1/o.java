package c1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f6494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6495c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f6496d = null;

    public o(String str, String str2) {
        this.f6493a = str;
        this.f6494b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.m.a(this.f6493a, oVar.f6493a) && kotlin.jvm.internal.m.a(this.f6494b, oVar.f6494b) && this.f6495c == oVar.f6495c && kotlin.jvm.internal.m.a(this.f6496d, oVar.f6496d);
    }

    public final int hashCode() {
        int iE = defpackage.e.e(defpackage.e.d(this.f6493a.hashCode() * 31, 31, this.f6494b), 31, this.f6495c);
        g gVar = this.f6496d;
        return iE + (gVar == null ? 0 : gVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextSubstitution(layoutCache=");
        sb2.append(this.f6496d);
        sb2.append(", isShowingSubstitution=");
        return ep.a.l(sb2, this.f6495c, ')');
    }
}
