package j1;

import com.yalantis.ucrop.view.CropImageView;
import l1.g1;
import qy.b0;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends y2.n implements y2.l, r2.a {
    public boolean S;
    public fz.a T;
    public q V;
    public float W;
    public boolean U = true;
    public final r2.i X = new r2.i(this, null);
    public final g1 Y = new g1(CropImageView.DEFAULT_ASPECT_RATIO);
    public final g1 Z = new g1(CropImageView.DEFAULT_ASPECT_RATIO);

    public p(boolean z11, fz.a aVar, q qVar, float f5) {
        this.S = z11;
        this.T = aVar;
        this.V = qVar;
        this.W = f5;
    }

    @Override // z1.q
    public final void L0() {
        T0(this.X);
        e0.B(H0(), null, null, new m(this, null, 0), 3);
    }

    @Override // r2.a
    public final long M(int i11, long j11) {
        if (!((Boolean) ((s) this.V).f35513a.f3473d.getValue()).booleanValue() && this.U && i11 == 1 && f2.b.f(j11) < CropImageView.DEFAULT_ASPECT_RATIO) {
            return Y0(j11);
        }
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // r2.a
    public final Object W(long j11, vy.d dVar) {
        n nVar;
        if (dVar instanceof n) {
            nVar = (n) dVar;
            int i11 = nVar.f35505c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                nVar.f35505c = i11 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, (xy.c) dVar);
            }
        } else {
            nVar = new n(this, (xy.c) dVar);
        }
        Object objA1 = nVar.f35503a;
        Object obj = wy.a.COROUTINE_SUSPENDED;
        int i12 = nVar.f35505c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objA1);
            float fC = v3.q.c(j11);
            nVar.f35505c = 1;
            objA1 = a1(fC, nVar);
            if (objA1 == obj) {
                return obj;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objA1);
        }
        return new v3.q(gb.r.b(CropImageView.DEFAULT_ASPECT_RATIO, ((Number) objA1).floatValue()));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object W0(xy.c cVar) {
        k kVar;
        p pVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i11 = kVar.f35495d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kVar.f35495d = i11 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        k kVar2 = kVar;
        Object obj = kVar2.f35493b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = kVar2.f35495d;
        b0 b0Var = b0.f48488a;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            q qVar = this.V;
            kVar2.f35492a = this;
            kVar2.f35495d = 1;
            Object objC = b0.d.c(((s) qVar).f35513a, new Float(CropImageView.DEFAULT_ASPECT_RATIO), null, null, kVar2, 14);
            if (objC != aVar) {
                objC = b0Var;
            }
            if (objC == aVar) {
                return aVar;
            }
            pVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pVar = kVar2.f35492a;
            com.bumptech.glide.e.F(obj);
        }
        pVar.Z.m(CropImageView.DEFAULT_ASPECT_RATIO);
        pVar.Y.m(CropImageView.DEFAULT_ASPECT_RATIO);
        return b0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object X0(xy.c cVar) {
        l lVar;
        p pVar;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i11 = lVar.f35499d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                lVar.f35499d = i11 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        l lVar2 = lVar;
        Object obj = lVar2.f35497b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = lVar2.f35499d;
        b0 b0Var = b0.f48488a;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            q qVar = this.V;
            lVar2.f35496a = this;
            lVar2.f35499d = 1;
            Object objC = b0.d.c(((s) qVar).f35513a, new Float(1.0f), null, null, lVar2, 14);
            if (objC != aVar) {
                objC = b0Var;
            }
            if (objC == aVar) {
                return aVar;
            }
            pVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pVar = lVar2.f35496a;
            com.bumptech.glide.e.F(obj);
        }
        pVar.Z.m(pVar.Z0());
        pVar.Y.m(pVar.Z0());
        return b0Var;
    }

    public final long Y0(long j11) {
        float fL;
        float fZ0;
        if (this.S) {
            fL = 0.0f;
        } else {
            g1 g1Var = this.Z;
            float f5 = f2.b.f(j11) + g1Var.l();
            if (f5 < CropImageView.DEFAULT_ASPECT_RATIO) {
                f5 = 0.0f;
            }
            fL = f5 - g1Var.l();
            g1Var.m(f5);
            if (g1Var.l() * 0.5f <= Z0()) {
                fZ0 = g1Var.l() * 0.5f;
            } else {
                float fK = hz.b.k(Math.abs((g1Var.l() * 0.5f) / Z0()) - 1.0f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f);
                fZ0 = Z0() + (Z0() * (fK - (((float) Math.pow(fK, 2)) / 4)));
            }
            this.Y.m(fZ0);
        }
        return com.bumptech.glide.d.c(CropImageView.DEFAULT_ASPECT_RATIO, fL);
    }

    public final int Z0() {
        return ((v3.c) y2.f.i(this, z2.g1.f58547h)).n0(this.W);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a1(float f5, xy.c cVar) {
        o oVar;
        p pVar;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i11 = oVar.f35510e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                oVar.f35510e = i11 - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, cVar);
            }
        } else {
            oVar = new o(this, cVar);
        }
        Object obj = oVar.f35508c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = oVar.f35510e;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            if (this.S) {
                return new Float(CropImageView.DEFAULT_ASPECT_RATIO);
            }
            if (this.Z.l() * 0.5f > Z0()) {
                oVar.f35506a = this;
                oVar.f35507b = f5;
                oVar.f35510e = 1;
                if (X0(oVar) != aVar) {
                    pVar = this;
                    pVar.T.invoke();
                }
            } else {
                oVar.f35506a = this;
                oVar.f35507b = f5;
                oVar.f35510e = 2;
                if (W0(oVar) != aVar) {
                    pVar = this;
                }
            }
            return aVar;
        }
        if (i12 == 1) {
            f5 = oVar.f35507b;
            pVar = oVar.f35506a;
            com.bumptech.glide.e.F(obj);
            pVar.T.invoke();
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f5 = oVar.f35507b;
            pVar = oVar.f35506a;
            com.bumptech.glide.e.F(obj);
        }
        if (pVar.Z.l() == CropImageView.DEFAULT_ASPECT_RATIO || f5 < CropImageView.DEFAULT_ASPECT_RATIO) {
            f5 = 0.0f;
        }
        pVar.Z.m(CropImageView.DEFAULT_ASPECT_RATIO);
        return new Float(f5);
    }

    @Override // r2.a
    public final long x(long j11, int i11, long j12) {
        if (((Boolean) ((s) this.V).f35513a.f3473d.getValue()).booleanValue() || !this.U || i11 != 1) {
            return 0L;
        }
        long jY0 = Y0(j12);
        e0.B(H0(), null, null, new m(this, null, 1), 3);
        return jY0;
    }
}
