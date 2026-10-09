package n9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f43732d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f43733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f43734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f43735c;

    static {
        u uVar = u.f43702c;
        f43732d = new x(uVar, uVar, uVar);
    }

    public x(v vVar, v vVar2, v vVar3) {
        this.f43733a = vVar;
        this.f43734b = vVar2;
        this.f43735c = vVar3;
    }

    public static x a(x xVar, int i11) {
        int i12 = i11 & 1;
        v vVar = u.f43702c;
        v vVar2 = i12 != 0 ? xVar.f43733a : vVar;
        v vVar3 = (i11 & 2) != 0 ? xVar.f43734b : vVar;
        if ((i11 & 4) != 0) {
            vVar = xVar.f43735c;
        }
        return new x(vVar2, vVar3, vVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return kotlin.jvm.internal.m.a(this.f43733a, xVar.f43733a) && kotlin.jvm.internal.m.a(this.f43734b, xVar.f43734b) && kotlin.jvm.internal.m.a(this.f43735c, xVar.f43735c);
    }

    public final int hashCode() {
        return this.f43735c.hashCode() + ((this.f43734b.hashCode() + (this.f43733a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LoadStates(refresh=" + this.f43733a + ", prepend=" + this.f43734b + ", append=" + this.f43735c + ')';
    }
}
