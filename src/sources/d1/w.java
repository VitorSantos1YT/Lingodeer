package d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f23005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f23006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f23007c;

    public w(v vVar, v vVar2, boolean z11) {
        this.f23005a = vVar;
        this.f23006b = vVar2;
        this.f23007c = z11;
    }

    public static w a(w wVar, v vVar, v vVar2, boolean z11, int i11) {
        if ((i11 & 1) != 0) {
            vVar = wVar.f23005a;
        }
        if ((i11 & 2) != 0) {
            vVar2 = wVar.f23006b;
        }
        wVar.getClass();
        return new w(vVar, vVar2, z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return kotlin.jvm.internal.m.a(this.f23005a, wVar.f23005a) && kotlin.jvm.internal.m.a(this.f23006b, wVar.f23006b) && this.f23007c == wVar.f23007c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f23007c) + ((this.f23006b.hashCode() + (this.f23005a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Selection(start=");
        sb2.append(this.f23005a);
        sb2.append(", end=");
        sb2.append(this.f23006b);
        sb2.append(", handlesCrossed=");
        return ep.a.l(sb2, this.f23007c, ')');
    }
}
