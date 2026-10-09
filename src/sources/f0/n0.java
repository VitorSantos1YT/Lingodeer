package f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n0 extends y2.n implements y2.y1 {
    public h1 S;
    public fz.c T;
    public boolean U;
    public h0.i V;
    public tz.h W;
    public h0.b X;
    public boolean Y;
    public long Z = 0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public s2.m0 f26376a0;

    public n0(fz.c cVar, boolean z11, h0.i iVar, h1 h1Var) {
        this.S = h1Var;
        this.T = cVar;
        this.U = z11;
        this.V = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object W0(n0 n0Var, xy.c cVar) {
        j0 j0Var;
        if (cVar instanceof j0) {
            j0Var = (j0) cVar;
            int i11 = j0Var.f26321c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                j0Var.f26321c = i11 - Integer.MIN_VALUE;
            } else {
                j0Var = new j0(n0Var, cVar);
            }
        } else {
            j0Var = new j0(n0Var, cVar);
        }
        Object obj = j0Var.f26319a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = j0Var.f26321c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            h0.b bVar = n0Var.X;
            if (bVar != null) {
                h0.i iVar = n0Var.V;
                if (iVar != null) {
                    h0.a aVar2 = new h0.a(bVar);
                    j0Var.f26321c = 1;
                    if (iVar.a(aVar2, j0Var) == aVar) {
                        return aVar;
                    }
                }
            }
            n0Var.c1(0L);
            return qy.b0.f48488a;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        com.bumptech.glide.e.F(obj);
        n0Var.X = null;
        n0Var.c1(0L);
        return qy.b0.f48488a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object X0(n0 n0Var, q qVar, xy.c cVar) {
        k0 k0Var;
        h0.i iVar;
        h0.b bVar;
        q qVar2;
        h0.b bVar2;
        if (cVar instanceof k0) {
            k0Var = (k0) cVar;
            int i11 = k0Var.f26337e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                k0Var.f26337e = i11 - Integer.MIN_VALUE;
            } else {
                k0Var = new k0(n0Var, cVar);
            }
        } else {
            k0Var = new k0(n0Var, cVar);
        }
        Object obj = k0Var.f26335c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = k0Var.f26337e;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            h0.b bVar3 = n0Var.X;
            if (bVar3 != null && (iVar = n0Var.V) != null) {
                h0.a aVar2 = new h0.a(bVar3);
                k0Var.f26333a = qVar;
                k0Var.f26337e = 1;
                if (iVar.a(aVar2, k0Var) != aVar) {
                }
                return aVar;
            }
            n0Var.X = bVar;
            n0Var.b1(qVar.f26408a);
            return qy.b0.f48488a;
        }
        if (i12 == 1) {
            qVar = k0Var.f26333a;
            com.bumptech.glide.e.F(obj);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar2 = k0Var.f26334b;
            qVar2 = k0Var.f26333a;
            com.bumptech.glide.e.F(obj);
        }
        bVar = bVar2;
        qVar = qVar2;
        n0Var.X = bVar;
        n0Var.b1(qVar.f26408a);
        return qy.b0.f48488a;
        bVar = new h0.b();
        h0.i iVar2 = n0Var.V;
        if (iVar2 != null) {
            k0Var.f26333a = qVar;
            k0Var.f26334b = bVar;
            k0Var.f26337e = 2;
            if (iVar2.a(bVar, k0Var) != aVar) {
                qVar2 = qVar;
                bVar2 = bVar;
                bVar = bVar2;
                qVar = qVar2;
            }
            return aVar;
        }
        n0Var.X = bVar;
        n0Var.b1(qVar.f26408a);
        return qy.b0.f48488a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object Y0(n0 n0Var, r rVar, xy.c cVar) {
        l0 l0Var;
        if (cVar instanceof l0) {
            l0Var = (l0) cVar;
            int i11 = l0Var.f26350d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                l0Var.f26350d = i11 - Integer.MIN_VALUE;
            } else {
                l0Var = new l0(n0Var, cVar);
            }
        } else {
            l0Var = new l0(n0Var, cVar);
        }
        Object obj = l0Var.f26348b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = l0Var.f26350d;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            h0.b bVar = n0Var.X;
            if (bVar != null) {
                h0.i iVar = n0Var.V;
                if (iVar != null) {
                    h0.c cVar2 = new h0.c(bVar);
                    l0Var.f26347a = rVar;
                    l0Var.f26350d = 1;
                    if (iVar.a(cVar2, l0Var) == aVar) {
                        return aVar;
                    }
                }
            }
            n0Var.c1(rVar.f26417a);
            return qy.b0.f48488a;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        rVar = l0Var.f26347a;
        com.bumptech.glide.e.F(obj);
        n0Var.X = null;
        n0Var.c1(rVar.f26417a);
        return qy.b0.f48488a;
    }

    @Override // y2.y1
    public final void G() {
        s2.m0 m0Var = this.f26376a0;
        if (m0Var != null) {
            m0Var.G();
        }
    }

    @Override // z1.q
    public final void M0() {
        this.Y = false;
        Z0();
        this.Z = 0L;
    }

    public final void Z0() {
        h0.b bVar = this.X;
        if (bVar != null) {
            h0.i iVar = this.V;
            if (iVar != null) {
                iVar.b(new h0.a(bVar));
            }
            this.X = null;
        }
    }

    public abstract Object a1(m0 m0Var, m0 m0Var2);

    public abstract void b1(long j11);

    public abstract void c1(long j11);

    public abstract boolean d1();

    public final void e1(fz.c cVar, boolean z11, h0.i iVar, h1 h1Var, boolean z12) {
        s2.m0 m0Var;
        this.T = cVar;
        boolean z13 = true;
        if (this.U != z11) {
            this.U = z11;
            if (!z11) {
                Z0();
                s2.m0 m0Var2 = this.f26376a0;
                if (m0Var2 != null) {
                    U0(m0Var2);
                }
                this.f26376a0 = null;
            }
            z12 = true;
        }
        if (!kotlin.jvm.internal.m.a(this.V, iVar)) {
            Z0();
            this.V = iVar;
        }
        if (this.S != h1Var) {
            this.S = h1Var;
        } else {
            z13 = z12;
        }
        if (!z13 || (m0Var = this.f26376a0) == null) {
            return;
        }
        m0Var.V0();
    }

    public void q(s2.l lVar, s2.m mVar, long j11) {
        if (this.U && this.f26376a0 == null) {
            a1.d dVar = new a1.d(this, 8);
            s2.l lVar2 = s2.g0.f51302a;
            s2.m0 m0Var = new s2.m0(null, null, null, dVar);
            T0(m0Var);
            this.f26376a0 = m0Var;
        }
        s2.m0 m0Var2 = this.f26376a0;
        if (m0Var2 != null) {
            m0Var2.q(lVar, mVar, j11);
        }
    }
}
