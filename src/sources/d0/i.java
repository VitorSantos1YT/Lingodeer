package d0;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v3.c f22720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f22721b = 9205357640488583168L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f22722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l1.k1 f22723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f22724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f22725f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f22726g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f22727h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y2.n f22728i;

    public i(Context context, v3.c cVar, long j11, j0.t1 t1Var) {
        this.f22720a = cVar;
        k0 k0Var = new k0(context, g2.f0.E(j11));
        this.f22722c = k0Var;
        this.f22723d = new l1.k1(qy.b0.f48488a, l1.g.f39300d);
        this.f22724e = true;
        this.f22726g = 0L;
        this.f22727h = -1L;
        a1.d dVar = new a1.d(this, 2);
        s2.l lVar = s2.g0.f51302a;
        s2.m0 m0Var = new s2.m0(null, null, null, dVar);
        this.f22728i = Build.VERSION.SDK_INT >= 31 ? new i2(m0Var, this, k0Var) : new q0(m0Var, this, k0Var, t1Var);
    }

    public final void a() {
        boolean z11;
        k0 k0Var = this.f22722c;
        EdgeEffect edgeEffect = k0Var.f22744d;
        boolean z12 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z11 = !edgeEffect.isFinished();
        } else {
            z11 = false;
        }
        EdgeEffect edgeEffect2 = k0Var.f22745e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z11 = !edgeEffect2.isFinished() || z11;
        }
        EdgeEffect edgeEffect3 = k0Var.f22746f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z11 = !edgeEffect3.isFinished() || z11;
        }
        EdgeEffect edgeEffect4 = k0Var.f22747g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z11) {
                z12 = false;
            }
            z11 = z12;
        }
        if (z11) {
            d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x013e, code lost:
    
        if (r4 == r6) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r19, f0.h2 r21, xy.c r22) {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.i.b(long, f0.h2, xy.c):java.lang.Object");
    }

    public final long c() {
        long jL = this.f22721b;
        if ((9223372034707292159L & jL) == 9205357640488583168L) {
            jL = com.bumptech.glide.g.l(this.f22726g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jL >> 32)) / Float.intBitsToFloat((int) (this.f22726g >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jL & 4294967295L)) / Float.intBitsToFloat((int) (this.f22726g & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final void d() {
        if (this.f22724e) {
            this.f22723d.setValue(qy.b0.f48488a);
        }
    }

    public final float e(long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i11 = (int) (j11 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i11) / Float.intBitsToFloat((int) (this.f22726g & 4294967295L));
        EdgeEffect edgeEffectB = this.f22722c.b();
        float fC = -fIntBitsToFloat2;
        float f5 = 1 - fIntBitsToFloat;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31) {
            fC = l.c(edgeEffectB, fC, f5);
        } else {
            edgeEffectB.onPull(fC, f5);
        }
        return (i12 >= 31 ? l.b(edgeEffectB) : 0.0f) == CropImageView.DEFAULT_ASPECT_RATIO ? Float.intBitsToFloat((int) (4294967295L & this.f22726g)) * (-fC) : Float.intBitsToFloat(i11);
    }

    public final float f(long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i11 = (int) (j11 >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i11) / Float.intBitsToFloat((int) (this.f22726g >> 32));
        EdgeEffect edgeEffectC = this.f22722c.c();
        float f5 = 1 - fIntBitsToFloat;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31) {
            fIntBitsToFloat2 = l.c(edgeEffectC, fIntBitsToFloat2, f5);
        } else {
            edgeEffectC.onPull(fIntBitsToFloat2, f5);
        }
        return (i12 >= 31 ? l.b(edgeEffectC) : 0.0f) == CropImageView.DEFAULT_ASPECT_RATIO ? Float.intBitsToFloat((int) (this.f22726g >> 32)) * fIntBitsToFloat2 : Float.intBitsToFloat(i11);
    }

    public final float g(long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i11 = (int) (j11 >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i11) / Float.intBitsToFloat((int) (this.f22726g >> 32));
        EdgeEffect edgeEffectD = this.f22722c.d();
        float fC = -fIntBitsToFloat2;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31) {
            fC = l.c(edgeEffectD, fC, fIntBitsToFloat);
        } else {
            edgeEffectD.onPull(fC, fIntBitsToFloat);
        }
        return (i12 >= 31 ? l.b(edgeEffectD) : 0.0f) == CropImageView.DEFAULT_ASPECT_RATIO ? Float.intBitsToFloat((int) (this.f22726g >> 32)) * (-fC) : Float.intBitsToFloat(i11);
    }

    public final float h(long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i11 = (int) (j11 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i11) / Float.intBitsToFloat((int) (this.f22726g & 4294967295L));
        EdgeEffect edgeEffectE = this.f22722c.e();
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31) {
            fIntBitsToFloat2 = l.c(edgeEffectE, fIntBitsToFloat2, fIntBitsToFloat);
        } else {
            edgeEffectE.onPull(fIntBitsToFloat2, fIntBitsToFloat);
        }
        return (i12 >= 31 ? l.b(edgeEffectE) : 0.0f) == CropImageView.DEFAULT_ASPECT_RATIO ? Float.intBitsToFloat((int) (this.f22726g & 4294967295L)) * fIntBitsToFloat2 : Float.intBitsToFloat(i11);
    }

    public final void i(long j11) {
        boolean zA = f2.e.a(this.f22726g, 0L);
        boolean zA2 = f2.e.a(j11, this.f22726g);
        this.f22726g = j11;
        if (!zA2) {
            int iQ = hz.b.Q(Float.intBitsToFloat((int) (j11 >> 32)));
            long jQ = (((long) hz.b.Q(Float.intBitsToFloat((int) (j11 & 4294967295L)))) & 4294967295L) | (((long) iQ) << 32);
            k0 k0Var = this.f22722c;
            k0Var.f22743c = jQ;
            EdgeEffect edgeEffect = k0Var.f22744d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jQ >> 32), (int) (jQ & 4294967295L));
            }
            EdgeEffect edgeEffect2 = k0Var.f22745e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jQ >> 32), (int) (jQ & 4294967295L));
            }
            EdgeEffect edgeEffect3 = k0Var.f22746f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jQ & 4294967295L), (int) (jQ >> 32));
            }
            EdgeEffect edgeEffect4 = k0Var.f22747g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jQ & 4294967295L), (int) (jQ >> 32));
            }
            EdgeEffect edgeEffect5 = k0Var.f22748h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jQ >> 32), (int) (jQ & 4294967295L));
            }
            EdgeEffect edgeEffect6 = k0Var.f22749i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jQ >> 32), (int) (jQ & 4294967295L));
            }
            EdgeEffect edgeEffect7 = k0Var.f22750j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jQ & 4294967295L), (int) (jQ >> 32));
            }
            EdgeEffect edgeEffect8 = k0Var.f22751k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jQ), (int) (jQ >> 32));
            }
        }
        if (zA || zA2) {
            return;
        }
        a();
    }
}
