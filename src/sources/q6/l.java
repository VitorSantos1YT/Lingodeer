package q6;

import com.yalantis.ucrop.view.CropImageView;
import gb.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f47495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f47496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f47497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f47498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f47499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f47500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f47501g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f47502h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f47503i;

    public l(long j11, long j12, long j13, b bVar) {
        this.f47495a = j11;
        this.f47496b = j12;
        this.f47497c = j13;
        long jS = r.s(r.J(j11, j12));
        this.f47498d = jS;
        long jS2 = r.s(r.J(j13, j12));
        this.f47499e = jS2;
        float f5 = bVar.f47476a;
        this.f47500f = f5;
        this.f47501g = bVar.f47477b;
        float fP = r.p(jS, jS2);
        float f11 = 1;
        float f12 = n.f47509b;
        float fSqrt = (float) Math.sqrt(f11 - (fP * fP));
        this.f47502h = ((double) fSqrt) > 0.001d ? ((fP + f11) * f5) / fSqrt : 0.0f;
        this.f47503i = y.h.a(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0094  */
    public static c b(float f5, float f11, long j11, long j12, long j13, long j14, long j15, float f12) {
        y.h hVar;
        long jS = r.s(r.J(j12, j11));
        long jK = r.K(j11, r.T(r.T(jS, f5), 1 + f11));
        long jO = r.o(r.K(j13, j14), 2.0f);
        long jA = y.h.a(n.c(r.y(j13), r.y(jO), f11), n.c(r.z(j13), r.z(jO), f11));
        long jK2 = r.K(j15, r.T(n.b(r.y(jA) - r.y(j15), r.z(jA) - r.z(j15)), f12));
        long J = r.J(jK2, j15);
        long jA2 = y.h.a(-r.z(J), r.y(J));
        long jA3 = y.h.a(-r.z(jA2), r.y(jA2));
        float fP = r.p(jS, jA3);
        if (Math.abs(fP) < 1.0E-4f) {
            hVar = null;
        } else {
            float fP2 = r.p(r.J(jK2, j12), jA3);
            if (Math.abs(fP) < Math.abs(fP2) * 1.0E-4f) {
                hVar = null;
            } else {
                hVar = new y.h(r.K(j12, r.T(jS, fP2 / fP)));
            }
        }
        long j16 = hVar != null ? hVar.f56709a : j13;
        long jO2 = r.o(r.K(jK, r.T(j16, 2.0f)), 3.0f);
        return new c(new float[]{r.y(jK), r.z(jK), r.y(jO2), r.z(jO2), r.y(j16), r.z(j16), r.y(jK2), r.z(jK2)});
    }

    public final float a(float f5) {
        float fC = c();
        float f11 = this.f47501g;
        if (f5 > fC) {
            return f11;
        }
        float f12 = this.f47502h;
        return f5 > f12 ? ((f5 - f12) * f11) / (c() - f12) : CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public final float c() {
        return (1 + this.f47501g) * this.f47502h;
    }
}
