package d2;

import a0.o0;
import g2.r;
import g2.w0;
import g2.x;
import y2.d1;
import y2.k1;
import z1.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0 f23082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f23084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f23085d;

    public o(w0 w0Var, boolean z11, long j11, long j12) {
        float f5 = e0.f.f24646a;
        this.f23082a = w0Var;
        this.f23083b = z11;
        this.f23084c = j11;
        this.f23085d = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        float f5 = e0.f.f24649d;
        return v3.f.b(f5, f5) && kotlin.jvm.internal.m.a(this.f23082a, oVar.f23082a) && this.f23083b == oVar.f23083b && x.d(this.f23084c, oVar.f23084c) && x.d(this.f23085d, oVar.f23085d);
    }

    @Override // y2.d1
    public final q f() {
        return new r(new o0(this, 5));
    }

    public final int hashCode() {
        int iE = defpackage.e.e((this.f23082a.hashCode() + (Float.hashCode(e0.f.f24649d) * 31)) * 31, 31, this.f23083b);
        int i11 = x.f28623j;
        return Long.hashCode(this.f23085d) + defpackage.e.f(this.f23084c, iE, 31);
    }

    @Override // y2.d1
    public final void j(q qVar) {
        k1 k1Var;
        r rVar = (r) qVar;
        o0 o0Var = new o0(this, 5);
        rVar.Q = o0Var;
        if (rVar.f58482a.P && (k1Var = y2.f.v(rVar, 2).R) != null) {
            k1Var.A1(o0Var, true);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        com.google.android.material.datepicker.d.s(e0.f.f24649d, ", shape=", sb2);
        sb2.append(this.f23082a);
        sb2.append(", clip=");
        sb2.append(this.f23083b);
        sb2.append(", ambientColor=");
        com.google.android.material.datepicker.d.t(this.f23084c, ", spotColor=", sb2);
        sb2.append((Object) x.j(this.f23085d));
        sb2.append(')');
        return sb2.toString();
    }
}
