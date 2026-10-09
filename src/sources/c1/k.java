package c1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j3.h f6473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j3.h f6474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6475c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f6476d = null;

    public k(j3.h hVar, j3.h hVar2) {
        this.f6473a = hVar;
        this.f6474b = hVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kotlin.jvm.internal.m.a(this.f6473a, kVar.f6473a) && kotlin.jvm.internal.m.a(this.f6474b, kVar.f6474b) && this.f6475c == kVar.f6475c && kotlin.jvm.internal.m.a(this.f6476d, kVar.f6476d);
    }

    public final int hashCode() {
        int iE = defpackage.e.e((this.f6474b.hashCode() + (this.f6473a.hashCode() * 31)) * 31, 31, this.f6475c);
        e eVar = this.f6476d;
        return iE + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.f6473a) + ", substitution=" + ((Object) this.f6474b) + ", isShowingSubstitution=" + this.f6475c + ", layoutCache=" + this.f6476d + ')';
    }
}
