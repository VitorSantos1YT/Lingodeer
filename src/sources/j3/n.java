package j3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f35723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f35725c;

    public n(m mVar, int i11, int i12) {
        this.f35723a = mVar;
        this.f35724b = i11;
        this.f35725c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return kotlin.jvm.internal.m.a(this.f35723a, nVar.f35723a) && this.f35724b == nVar.f35724b && this.f35725c == nVar.f35725c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f35725c) + defpackage.e.b(this.f35724b, this.f35723a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BulletSpanWithLevel(bullet=");
        sb2.append(this.f35723a);
        sb2.append(", indentationLevel=");
        sb2.append(this.f35724b);
        sb2.append(", start=");
        return ep.a.j(sb2, this.f35725c, ')');
    }
}
