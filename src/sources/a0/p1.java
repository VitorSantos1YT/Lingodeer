package a0;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f167b;

    public p1(float f5, float f11) {
        this.f166a = f5;
        this.f167b = f11;
    }

    public o1 a(float f5) {
        double dB = b(f5);
        double d5 = q1.f176a;
        double d11 = d5 - 1.0d;
        return new o1((long) (Math.exp(dB / d11) * 1000.0d), f5, (float) (Math.exp((d5 / d11) * dB) * ((double) (this.f166a * this.f167b))));
    }

    public double b(float f5) {
        float[] fArr = b.f17a;
        return Math.log(((double) (Math.abs(f5) * 0.35f)) / ((double) (this.f166a * this.f167b)));
    }

    public float c(q6.c c11) {
        kotlin.jvm.internal.m.f(c11, "c");
        float fA = c11.a();
        float f5 = this.f166a;
        float fB = c11.b();
        float f11 = this.f167b;
        float fA2 = q6.n.a(fA - f5, fB - f11);
        float[] fArr = c11.f47478a;
        float fA3 = fA2 - q6.n.a(fArr[0] - f5, fArr[1] - f11);
        float f12 = q6.n.f47510c;
        float fD = q6.n.d(fA3, f12);
        return fD > f12 - 1.0E-4f ? CropImageView.DEFAULT_ASPECT_RATIO : fD;
    }
}
