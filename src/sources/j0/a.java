package j0;

import com.google.zxing.aztec.detector.zTGP.gkbGsXmgaxRjJ;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f35239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l1.k1 f35240c = l1.t.B(r4.d.f48792e);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l1.k1 f35241d = l1.t.B(Boolean.TRUE);

    public a(int i11, String str) {
        this.f35238a = i11;
        this.f35239b = str;
    }

    @Override // j0.n2
    public final int a(v3.c cVar) {
        return e().f48794b;
    }

    @Override // j0.n2
    public final int b(v3.c cVar, v3.m mVar) {
        return e().f48795c;
    }

    @Override // j0.n2
    public final int c(v3.c cVar, v3.m mVar) {
        return e().f48793a;
    }

    @Override // j0.n2
    public final int d(v3.c cVar) {
        return e().f48796d;
    }

    public final r4.d e() {
        return (r4.d) this.f35240c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f35238a == ((a) obj).f35238a;
        }
        return false;
    }

    public final void f(z4.v1 v1Var, int i11) {
        int i12 = this.f35238a;
        if (i11 == 0 || (i11 & i12) != 0) {
            this.f35240c.setValue(v1Var.f58905a.g(i12));
            this.f35241d.setValue(Boolean.valueOf(v1Var.f58905a.q(i12)));
        }
    }

    public final int hashCode() {
        return this.f35238a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f35239b);
        sb2.append('(');
        sb2.append(e().f48793a);
        String str = gkbGsXmgaxRjJ.xNXGgnyKQ;
        sb2.append(str);
        sb2.append(e().f48794b);
        sb2.append(str);
        sb2.append(e().f48795c);
        sb2.append(str);
        return ep.a.j(sb2, e().f48796d, ')');
    }
}
