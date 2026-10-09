package l1;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a3 implements y1.c, Iterable, gz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m2 f39232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e2 f39234c;

    public a3(m2 m2Var, int i11, o0 o0Var, e2 e2Var) {
        this.f39232a = m2Var;
        this.f39233b = i11;
        this.f39234c = e2Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a3)) {
            return false;
        }
        a3 a3Var = (a3) obj;
        return a3Var.f39233b == this.f39233b && a3Var.f39232a.equals(this.f39232a) && a3Var.f39234c.equals(this.f39234c);
    }

    public final int hashCode() {
        return this.f39234c.hashCode() + ((this.f39232a.hashCode() + (this.f39233b * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new z2(this.f39232a, this.f39233b, null, this.f39234c);
    }
}
