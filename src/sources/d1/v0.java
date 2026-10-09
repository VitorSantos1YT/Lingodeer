package d1;

import l1.k1;
import s0.o1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements s0.a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f23003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0 f23004c;

    public v0(z0 z0Var) {
        this.f23002a = 1;
        this.f23004c = z0Var;
        this.f23003b = true;
    }

    @Override // s0.a1
    public final void a() {
        switch (this.f23002a) {
            case 0:
                z0 z0Var = this.f23004c;
                z0Var.f23053r.setValue(null);
                z0Var.f23054s.setValue(null);
                z0Var.s(true);
                break;
            default:
                h();
                break;
        }
    }

    @Override // s0.a1
    public final void b(long j11) {
        z0 z0Var;
        long j12;
        o1 o1VarD;
        o1 o1VarD2;
        switch (this.f23002a) {
            case 0:
                break;
            default:
                z0 z0Var2 = this.f23004c;
                k1 k1Var = z0Var2.f23053r;
                if (z0Var2.j() && ((s0.g0) k1Var.getValue()) == null) {
                    k1Var.setValue(s0.g0.SelectionEnd);
                    z0Var2.f23055t = -1;
                    this.f23003b = true;
                    z0Var2.n();
                    s0.s0 s0Var = z0Var2.f23040d;
                    if (s0Var == null || (o1VarD2 = s0Var.d()) == null || !o1VarD2.c(j11)) {
                        z0Var = z0Var2;
                        j12 = j11;
                        s0.s0 s0Var2 = z0Var.f23040d;
                        if (s0Var2 != null && (o1VarD = s0Var2.d()) != null) {
                            int iF = z0Var.f23038b.f(o1VarD.b(j12, true));
                            o3.w wVarE = z0.e(z0Var.m().f44704a, j3.t.b(iF, iF));
                            z0Var.h(false);
                            n2.a aVar = z0Var.f23047k;
                            if (aVar != null) {
                                aVar.a(9);
                            }
                            z0Var.f23039c.invoke(wVarE);
                            z0Var.f23058w = new j3.x0(wVarE.f44705b);
                        }
                        this.f23003b = false;
                    } else if (z0Var2.m().f44704a.f35700b.length() != 0) {
                        z0Var2.h(false);
                        long jC = z0.c(z0Var2, o3.w.a(z0Var2.m(), null, j3.x0.f35821b, 5), j11, true, false, x.f23018e, true);
                        z0Var = z0Var2;
                        j12 = j11;
                        z0Var.f23051p = new j3.x0(jC);
                    }
                    z0Var.p(s0.h0.None);
                    z0Var.f23050o = j12;
                    z0Var.f23054s.setValue(new f2.b(j12));
                    z0Var.f23052q = 0L;
                    break;
                }
                break;
        }
    }

    @Override // s0.a1
    public final void c() {
        switch (this.f23002a) {
            case 0:
                z0 z0Var = this.f23004c;
                z0Var.f23053r.setValue(null);
                z0Var.f23054s.setValue(null);
                z0Var.s(true);
                break;
        }
    }

    @Override // s0.a1
    public final void d() {
        o1 o1VarD;
        switch (this.f23002a) {
            case 0:
                boolean z11 = this.f23003b;
                s0.g0 g0Var = z11 ? s0.g0.SelectionStart : s0.g0.SelectionEnd;
                z0 z0Var = this.f23004c;
                z0Var.f23053r.setValue(g0Var);
                long jA = g0.a(z0Var.k(z11));
                s0.s0 s0Var = z0Var.f23040d;
                if (s0Var != null && (o1VarD = s0Var.d()) != null) {
                    long jE = o1VarD.e(jA);
                    z0Var.f23050o = jE;
                    z0Var.f23054s.setValue(new f2.b(jE));
                    z0Var.f23052q = 0L;
                    z0Var.f23055t = -1;
                    s0.s0 s0Var2 = z0Var.f23040d;
                    if (s0Var2 != null) {
                        s0Var2.f51181q.setValue(Boolean.TRUE);
                    }
                    z0Var.s(false);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0093  */
    /* JADX WARN: Code duplicated, block: B:23:0x0097  */
    /* JADX WARN: Code duplicated, block: B:24:0x009e  */
    @Override // s0.a1
    public final void e(long j11) {
        z0 z0Var;
        o1 o1VarD;
        j3.x0 x0Var;
        int iB;
        long jC;
        switch (this.f23002a) {
            case 0:
                z0 z0Var2 = this.f23004c;
                long jH = f2.b.h(z0Var2.f23052q, j11);
                z0Var2.f23052q = jH;
                z0Var2.f23054s.setValue(new f2.b(f2.b.h(z0Var2.f23050o, jH)));
                o3.w wVarM = z0Var2.m();
                f2.b bVarI = z0Var2.i();
                kotlin.jvm.internal.m.c(bVarI);
                z0.c(z0Var2, wVarM, bVarI.f26570a, false, this.f23003b, x.f23020g, true);
                z0Var2.s(false);
                break;
            default:
                com.google.firebase.remoteconfig.a aVar = x.f23018e;
                z0 z0Var3 = this.f23004c;
                if (z0Var3.j() && z0Var3.m().f44704a.f35700b.length() != 0) {
                    z0Var3.f23052q = f2.b.h(z0Var3.f23052q, j11);
                    s0.s0 s0Var = z0Var3.f23040d;
                    if (s0Var == null || (o1VarD = s0Var.d()) == null) {
                        z0Var = z0Var3;
                    } else {
                        z0Var3.f23054s.setValue(new f2.b(f2.b.h(z0Var3.f23050o, z0Var3.f23052q)));
                        if (z0Var3.f23051p == null) {
                            f2.b bVarI2 = z0Var3.i();
                            kotlin.jvm.internal.m.c(bVarI2);
                            if (o1VarD.c(bVarI2.f26570a)) {
                                x0Var = z0Var3.f23051p;
                                if (x0Var != null) {
                                    iB = (int) (x0Var.f35823a >> 32);
                                } else {
                                    iB = o1VarD.b(z0Var3.f23050o, false);
                                }
                                f2.b bVarI3 = z0Var3.i();
                                kotlin.jvm.internal.m.c(bVarI3);
                                int iB2 = o1VarD.b(bVarI3.f26570a, false);
                                if (z0Var3.f23051p == null || iB != iB2) {
                                    o3.w wVarM2 = z0Var3.m();
                                    f2.b bVarI4 = z0Var3.i();
                                    kotlin.jvm.internal.m.c(bVarI4);
                                    jC = z0.c(z0Var3, wVarM2, bVarI4.f26570a, false, false, aVar, true);
                                    z0Var = z0Var3;
                                }
                            } else {
                                int iF = z0Var3.f23038b.f(o1VarD.b(z0Var3.f23050o, true));
                                o3.p pVar = z0Var3.f23038b;
                                f2.b bVarI5 = z0Var3.i();
                                kotlin.jvm.internal.m.c(bVarI5);
                                if (iF == pVar.f(o1VarD.b(bVarI5.f26570a, true))) {
                                    aVar = x.f23017d;
                                }
                                o3.w wVarM3 = z0Var3.m();
                                f2.b bVarI6 = z0Var3.i();
                                kotlin.jvm.internal.m.c(bVarI6);
                                long j12 = bVarI6.f26570a;
                                z0Var = z0Var3;
                                jC = z0.c(z0Var, wVarM3, j12, false, false, aVar, true);
                            }
                        } else {
                            x0Var = z0Var3.f23051p;
                            if (x0Var != null) {
                                iB = (int) (x0Var.f35823a >> 32);
                            } else {
                                iB = o1VarD.b(z0Var3.f23050o, false);
                            }
                            f2.b bVarI7 = z0Var3.i();
                            kotlin.jvm.internal.m.c(bVarI7);
                            int iB3 = o1VarD.b(bVarI7.f26570a, false);
                            if (z0Var3.f23051p == null) {
                            }
                            o3.w wVarM4 = z0Var3.m();
                            f2.b bVarI8 = z0Var3.i();
                            kotlin.jvm.internal.m.c(bVarI8);
                            jC = z0.c(z0Var3, wVarM4, bVarI8.f26570a, false, false, aVar, true);
                            z0Var = z0Var3;
                        }
                        if (!j3.x0.a(jC, z0Var.f23051p)) {
                            this.f23003b = false;
                        }
                    }
                    z0Var.s(false);
                    break;
                }
                break;
        }
    }

    public void h() {
        z0 z0Var = this.f23004c;
        z0Var.f23053r.setValue(null);
        z0Var.f23054s.setValue(null);
        z0Var.s(true);
        boolean zC = j3.x0.c(z0Var.m().f44705b);
        z0Var.p(zC ? s0.h0.Cursor : s0.h0.Selection);
        s0.s0 s0Var = z0Var.f23040d;
        if (s0Var != null) {
            s0Var.m.setValue(Boolean.valueOf(!zC && ve.i.E(z0Var, true)));
        }
        s0.s0 s0Var2 = z0Var.f23040d;
        if (s0Var2 != null) {
            s0Var2.f51178n.setValue(Boolean.valueOf(!zC && ve.i.E(z0Var, false)));
        }
        s0.s0 s0Var3 = z0Var.f23040d;
        if (s0Var3 != null) {
            s0Var3.f51179o.setValue(Boolean.valueOf(zC && ve.i.E(z0Var, true)));
        }
        if (this.f23003b) {
            z0.a(z0Var, z0Var.f23051p);
        }
        z0Var.f23051p = null;
    }

    @Override // s0.a1
    public final void onCancel() {
        switch (this.f23002a) {
            case 0:
                break;
            default:
                h();
                break;
        }
    }

    public v0(z0 z0Var, boolean z11) {
        this.f23002a = 0;
        this.f23004c = z0Var;
        this.f23003b = z11;
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void j() {
    }

    private final void i(long j11) {
    }
}
