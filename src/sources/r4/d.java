package r4;

import android.graphics.Insets;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f48792e = new d(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f48794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f48795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f48796d;

    public d(int i11, int i12, int i13, int i14) {
        this.f48793a = i11;
        this.f48794b = i12;
        this.f48795c = i13;
        this.f48796d = i14;
    }

    public static d a(d dVar, d dVar2) {
        return c(Math.max(dVar.f48793a, dVar2.f48793a), Math.max(dVar.f48794b, dVar2.f48794b), Math.max(dVar.f48795c, dVar2.f48795c), Math.max(dVar.f48796d, dVar2.f48796d));
    }

    public static d b(d dVar, d dVar2) {
        return c(Math.min(dVar.f48793a, dVar2.f48793a), Math.min(dVar.f48794b, dVar2.f48794b), Math.min(dVar.f48795c, dVar2.f48795c), Math.min(dVar.f48796d, dVar2.f48796d));
    }

    public static d c(int i11, int i12, int i13, int i14) {
        return (i11 == 0 && i12 == 0 && i13 == 0 && i14 == 0) ? f48792e : new d(i11, i12, i13, i14);
    }

    public static d d(Insets insets) {
        return c(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets e() {
        return c3.c.h(this.f48793a, this.f48794b, this.f48795c, this.f48796d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f48796d == dVar.f48796d && this.f48793a == dVar.f48793a && this.f48795c == dVar.f48795c && this.f48794b == dVar.f48794b;
    }

    public final int hashCode() {
        return (((((this.f48793a * 31) + this.f48794b) * 31) + this.f48795c) * 31) + this.f48796d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets{left=");
        sb2.append(this.f48793a);
        sb2.append(", top=");
        sb2.append(this.f48794b);
        sb2.append(", right=");
        sb2.append(this.f48795c);
        sb2.append(", bottom=");
        return ep.a.j(sb2, this.f48796d, '}');
    }
}
