package f0;

import com.yalantis.ucrop.view.CropImageView;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends z1.q implements y2.l, y2.y {
    public h1 Q;
    public final i2 R;
    public boolean S;
    public d T;
    public w2.x V;
    public boolean W;
    public boolean X;
    public boolean Z;
    public final a U = new a(0);
    public long Y = 0;

    public i(h1 h1Var, i2 i2Var, boolean z11, d dVar) {
        this.Q = h1Var;
        this.R = i2Var;
        this.S = z11;
        this.T = dVar;
    }

    public static final float T0(i iVar, d dVar) {
        char c11;
        f2.c cVar;
        int iCompare;
        if (v3.l.a(iVar.Y, 0L)) {
            return CropImageView.DEFAULT_ASPECT_RATIO;
        }
        n1.e eVar = iVar.U.f26179a;
        int i11 = eVar.f43114c - 1;
        Object[] objArr = eVar.f43112a;
        if (i11 < objArr.length) {
            cVar = null;
            while (true) {
                if (i11 < 0) {
                    c11 = ' ';
                    break;
                }
                f2.c cVar2 = (f2.c) ((g) objArr[i11]).f26275a.invoke();
                if (cVar2 != null) {
                    long jC = cVar2.c();
                    long jP = ff.h.P(iVar.Y);
                    c11 = ' ';
                    int i12 = h.f26287a[iVar.Q.ordinal()];
                    if (i12 == 1) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jC & 4294967295L)), Float.intBitsToFloat((int) (jP & 4294967295L)));
                    } else {
                        if (i12 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jC >> 32)), Float.intBitsToFloat((int) (jP >> 32)));
                    }
                    if (iCompare > 0) {
                        if (cVar != null) {
                            break;
                        }
                        cVar = cVar2;
                        break;
                    }
                    cVar = cVar2;
                }
                i11--;
            }
        } else {
            c11 = ' ';
            cVar = null;
        }
        if (cVar == null) {
            f2.c cVarU0 = iVar.W ? iVar.U0() : null;
            if (cVarU0 == null) {
                return CropImageView.DEFAULT_ASPECT_RATIO;
            }
            cVar = cVarU0;
        }
        long jP2 = ff.h.P(iVar.Y);
        int i13 = h.f26287a[iVar.Q.ordinal()];
        if (i13 == 1) {
            float f5 = cVar.f26573b;
            return dVar.a(f5, cVar.f26575d - f5, Float.intBitsToFloat((int) (jP2 & 4294967295L)));
        }
        if (i13 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        float f11 = cVar.f26572a;
        return dVar.a(f11, cVar.f26574c - f11, Float.intBitsToFloat((int) (jP2 >> c11)));
    }

    @Override // z1.q
    public final boolean I0() {
        return false;
    }

    public final f2.c U0() {
        if (this.P) {
            y2.k1 k1VarW = y2.f.w(this);
            w2.x xVar = this.V;
            if (xVar != null) {
                if (!xVar.k()) {
                    xVar = null;
                }
                if (xVar != null) {
                    return k1VarW.E(xVar, false);
                }
            }
        }
        return null;
    }

    public final boolean V0(f2.c cVar, long j11) {
        long jX0 = X0(cVar, j11);
        return Math.abs(Float.intBitsToFloat((int) (jX0 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jX0 & 4294967295L))) <= 0.5f;
    }

    public final void W0() {
        d dVar = this.T;
        if (dVar == null) {
            dVar = (d) y2.f.i(this, f.f26256a);
        }
        d dVar2 = dVar;
        if (this.Z) {
            i0.a.c("launchAnimation called when previous animation was running");
        }
        d dVar3 = this.T;
        if (dVar3 == null) {
            dVar3 = (d) y2.f.i(this, f.f26256a);
        }
        dVar3.getClass();
        d.f26224a.getClass();
        rz.e0.B(H0(), null, rz.d0.UNDISPATCHED, new b0.f(this, new v2(c.f26209b), dVar2, (vy.d) null, 16), 1);
    }

    public final long X0(f2.c cVar, long j11) {
        long jFloatToRawIntBits;
        long j12;
        long jP = ff.h.P(j11);
        int i11 = h.f26287a[this.Q.ordinal()];
        if (i11 == 1) {
            d dVar = this.T;
            if (dVar == null) {
                dVar = (d) y2.f.i(this, f.f26256a);
            }
            float f5 = cVar.f26573b;
            float fA = dVar.a(f5, cVar.f26575d - f5, Float.intBitsToFloat((int) (jP & 4294967295L)));
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO);
            jFloatToRawIntBits = Float.floatToRawIntBits(fA);
            j12 = jFloatToRawIntBits2 << 32;
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            d dVar2 = this.T;
            if (dVar2 == null) {
                dVar2 = (d) y2.f.i(this, f.f26256a);
            }
            float f11 = cVar.f26572a;
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(dVar2.a(f11, cVar.f26574c - f11, Float.intBitsToFloat((int) (jP >> 32))));
            jFloatToRawIntBits = Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO);
            j12 = jFloatToRawIntBits3 << 32;
        }
        return j12 | (jFloatToRawIntBits & 4294967295L);
    }

    @Override // y2.y
    public final void l(long j11) {
        int iH;
        f2.c cVarU0;
        long j12 = this.Y;
        this.Y = j11;
        int i11 = h.f26287a[this.Q.ordinal()];
        if (i11 == 1) {
            iH = kotlin.jvm.internal.m.h((int) (j11 & 4294967295L), (int) (4294967295L & j12));
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iH = kotlin.jvm.internal.m.h((int) (j11 >> 32), (int) (j12 >> 32));
        }
        if (iH >= 0 || this.Z || this.W || (cVarU0 = U0()) == null || !V0(cVarU0, j12)) {
            return;
        }
        this.X = true;
    }
}
