package d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends z1.q implements y2.y1 {
    public h0.i Q;
    public h0.f R;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object T0(w0 w0Var, xy.c cVar) {
        t0 t0Var;
        h0.f fVar;
        if (cVar instanceof t0) {
            t0Var = (t0) cVar;
            int i11 = t0Var.f22804d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                t0Var.f22804d = i11 - Integer.MIN_VALUE;
            } else {
                t0Var = new t0(w0Var, cVar);
            }
        } else {
            t0Var = new t0(w0Var, cVar);
        }
        Object obj = t0Var.f22802b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = t0Var.f22804d;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            if (w0Var.R == null) {
                h0.f fVar2 = new h0.f();
                h0.i iVar = w0Var.Q;
                t0Var.f22801a = fVar2;
                t0Var.f22804d = 1;
                if (iVar.a(fVar2, t0Var) == aVar) {
                    return aVar;
                }
                fVar = fVar2;
            }
            return qy.b0.f48488a;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        fVar = t0Var.f22801a;
        com.bumptech.glide.e.F(obj);
        w0Var.R = fVar;
        return qy.b0.f48488a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object U0(w0 w0Var, xy.c cVar) {
        u0 u0Var;
        if (cVar instanceof u0) {
            u0Var = (u0) cVar;
            int i11 = u0Var.f22810c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                u0Var.f22810c = i11 - Integer.MIN_VALUE;
            } else {
                u0Var = new u0(w0Var, cVar);
            }
        } else {
            u0Var = new u0(w0Var, cVar);
        }
        Object obj = u0Var.f22808a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = u0Var.f22810c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            h0.f fVar = w0Var.R;
            if (fVar != null) {
                h0.g gVar = new h0.g(fVar);
                h0.i iVar = w0Var.Q;
                u0Var.f22810c = 1;
                if (iVar.a(gVar, u0Var) == aVar) {
                    return aVar;
                }
            }
            return qy.b0.f48488a;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        com.bumptech.glide.e.F(obj);
        w0Var.R = null;
        return qy.b0.f48488a;
    }

    @Override // y2.y1
    public final void G() {
        V0();
    }

    @Override // z1.q
    public final void M0() {
        V0();
    }

    public final void V0() {
        h0.f fVar = this.R;
        if (fVar != null) {
            this.Q.b(new h0.g(fVar));
            this.R = null;
        }
    }

    @Override // y2.y1
    public final void q(s2.l lVar, s2.m mVar, long j11) {
        if (mVar == s2.m.Main) {
            int i11 = lVar.f51332e;
            vy.d dVar = null;
            if (i11 == 4) {
                rz.e0.B(H0(), null, null, new v0(this, dVar, 0), 3);
            } else if (i11 == 5) {
                rz.e0.B(H0(), null, null, new v0(this, dVar, 1), 3);
            }
        }
    }
}
