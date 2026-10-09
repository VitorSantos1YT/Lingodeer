package b1;

import d1.z0;
import g3.a0;
import g3.b0;
import g3.z;
import j3.x0;
import o3.c0;
import o3.d0;
import s0.s0;
import y2.b2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends y2.n implements b2 {
    public d0 S;
    public o3.w T;
    public s0 U;
    public boolean V;
    public boolean W;
    public boolean X;
    public o3.p Y;
    public z0 Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public o3.j f3791a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public e2.v f3792b0;

    public static void W0(s0 s0Var, String str, boolean z11, boolean z12) {
        if (z11 || !z12) {
            return;
        }
        c0 c0Var = s0Var.f51170e;
        s0.w wVar = s0Var.f51186v;
        if (c0Var == null) {
            int length = str.length();
            wVar.invoke(new o3.w(str, j3.t.b(length, length), 4));
        } else {
            o3.w wVarJ = s0Var.f51169d.j(ns.o.L(new o3.d(), new o3.a(str, 1)));
            c0Var.a(null, wVarJ);
            wVar.invoke(wVarJ);
        }
    }

    @Override // y2.b2
    public final boolean C0() {
        return true;
    }

    @Override // y2.b2
    public final void i0(b0 b0Var) {
        boolean z11 = this.X;
        j3.h hVar = this.T.f44704a;
        mz.j[] jVarArr = z.f28737a;
        a0 a0Var = g3.x.E;
        mz.j[] jVarArr2 = z.f28737a;
        mz.j jVar = jVarArr2[18];
        b0Var.b(a0Var, hVar);
        j3.h hVar2 = this.S.f44670a;
        a0 a0Var2 = g3.x.F;
        mz.j jVar2 = jVarArr2[19];
        b0Var.b(a0Var2, hVar2);
        long j11 = this.T.f44705b;
        a0 a0Var3 = g3.x.G;
        mz.j jVar3 = jVarArr2[20];
        b0Var.b(a0Var3, new x0(j11));
        a0 a0Var4 = g3.x.f28726r;
        mz.j jVar4 = jVarArr2[9];
        b0Var.b(a0Var4, a2.p.f313a);
        boolean z12 = false;
        z12 = false;
        b0Var.b(g3.n.f28672g, new g3.a(null, new j(this, z12 ? 1 : 0)));
        boolean z13 = this.W;
        qy.b0 b0Var2 = qy.b0.f48488a;
        if (!z13) {
            b0Var.b(g3.x.f28718i, b0Var2);
        }
        if (z11) {
            b0Var.b(g3.x.K, b0Var2);
        }
        int i11 = 1;
        if (this.W && !this.V) {
            z12 = true;
        }
        a0 a0Var5 = g3.x.N;
        mz.j jVar5 = jVarArr2[26];
        b0Var.b(a0Var5, Boolean.valueOf(z12));
        z.a(b0Var, new j(this, i11));
        int i12 = 2;
        if (z12) {
            b0Var.b(g3.n.f28676k, new g3.a(null, new j(this, i12)));
            b0Var.b(g3.n.f28679o, new g3.a(null, new j(this, b0Var)));
        }
        b0Var.b(g3.n.f28675j, new g3.a(null, new a00.b(this, i12)));
        int i13 = this.f3791a0.f44683e;
        i iVar = new i(this, 6);
        b0Var.b(g3.x.H, new o3.i(i13));
        b0Var.b(g3.n.f28680p, new g3.a(null, iVar));
        b0Var.b(g3.n.f28667b, new g3.a(null, new i(this, 7)));
        b0Var.b(g3.n.f28668c, new g3.a(null, new i(this, 1)));
        if (!x0.c(this.T.f44705b) && !z11) {
            b0Var.b(g3.n.f28681q, new g3.a(null, new i(this, 2)));
            if (this.W && !this.V) {
                b0Var.b(g3.n.f28682r, new g3.a(null, new i(this, 3)));
            }
        }
        if (!this.W || this.V) {
            return;
        }
        b0Var.b(g3.n.f28683s, new g3.a(null, new i(this, 5)));
    }
}
