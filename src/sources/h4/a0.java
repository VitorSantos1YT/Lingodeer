package h4;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.yalantis.ucrop.view.CropImageView;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements Comparable {
    public static final String[] T = {RequestParameters.POSITION, "x", "y", "width", "height", "pathRotate"};
    public float H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c4.e f31551a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f31553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f31554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f31555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f31556f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f31557t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f31552b = 0;
    public float K = Float.NaN;
    public int L = -1;
    public int M = -1;
    public float N = Float.NaN;
    public q O = null;
    public LinkedHashMap P = new LinkedHashMap();
    public int Q = 0;
    public double[] R = new double[18];
    public double[] S = new double[18];

    public static boolean b(float f5, float f11) {
        if (Float.isNaN(f5) || Float.isNaN(f11)) {
            return Float.isNaN(f5) != Float.isNaN(f11);
        }
        return Math.abs(f5 - f11) > 1.0E-6f;
    }

    public static void f(float f5, float f11, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f16 = (float) dArr[i11];
            double d5 = dArr2[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                f12 = f16;
            } else if (i12 == 2) {
                f14 = f16;
            } else if (i12 == 3) {
                f13 = f16;
            } else if (i12 == 4) {
                f15 = f16;
            }
        }
        float f17 = f12 - ((CropImageView.DEFAULT_ASPECT_RATIO * f13) / 2.0f);
        float f18 = f14 - ((CropImageView.DEFAULT_ASPECT_RATIO * f15) / 2.0f);
        fArr[0] = (((f13 * 1.0f) + f17) * f5) + ((1.0f - f5) * f17) + CropImageView.DEFAULT_ASPECT_RATIO;
        fArr[1] = (((f15 * 1.0f) + f18) * f11) + ((1.0f - f11) * f18) + CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public final void a(j4.k kVar) {
        int iOrdinal;
        this.f31551a = c4.e.d(kVar.f35928d.f35979d);
        j4.m mVar = kVar.f35928d;
        this.L = mVar.f35980e;
        this.M = mVar.f35977b;
        this.K = mVar.f35983h;
        this.f31552b = mVar.f35981f;
        this.N = kVar.f35929e.C;
        for (String str : kVar.f35931g.keySet()) {
            j4.b bVar = (j4.b) kVar.f35931g.get(str);
            if (bVar != null && (iOrdinal = bVar.f35840c.ordinal()) != 4 && iOrdinal != 5 && iOrdinal != 7) {
                this.P.put(str, bVar);
            }
        }
    }

    public final void c(double d5, int[] iArr, double[] dArr, float[] fArr, int i11) {
        float fSin = this.f31555e;
        float fCos = this.f31556f;
        float f5 = this.f31557t;
        float f11 = this.H;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            float f12 = (float) dArr[i12];
            int i13 = iArr[i12];
            if (i13 == 1) {
                fSin = f12;
            } else if (i13 == 2) {
                fCos = f12;
            } else if (i13 == 3) {
                f5 = f12;
            } else if (i13 == 4) {
                f11 = f12;
            }
        }
        q qVar = this.O;
        if (qVar != null) {
            float[] fArr2 = new float[2];
            qVar.c(d5, fArr2, new float[2]);
            float f13 = fArr2[0];
            float f14 = fArr2[1];
            double d11 = f13;
            double d12 = fSin;
            double d13 = fCos;
            fSin = (float) (((Math.sin(d13) * d12) + d11) - ((double) (f5 / 2.0f)));
            fCos = (float) ((((double) f14) - (Math.cos(d13) * d12)) - ((double) (f11 / 2.0f)));
        }
        fArr[i11] = (f5 / 2.0f) + fSin + CropImageView.DEFAULT_ASPECT_RATIO;
        fArr[i11 + 1] = (f11 / 2.0f) + fCos + CropImageView.DEFAULT_ASPECT_RATIO;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.f31554d, ((a0) obj).f31554d);
    }

    public final void e(float f5, float f11, float f12, float f13) {
        this.f31555e = f5;
        this.f31556f = f11;
        this.f31557t = f12;
        this.H = f13;
    }

    public final void g(q qVar, a0 a0Var) {
        double d5 = (((this.f31557t / 2.0f) + this.f31555e) - a0Var.f31555e) - (a0Var.f31557t / 2.0f);
        double d11 = (((this.H / 2.0f) + this.f31556f) - a0Var.f31556f) - (a0Var.H / 2.0f);
        this.O = qVar;
        this.f31555e = (float) Math.hypot(d11, d5);
        if (Float.isNaN(this.N)) {
            this.f31556f = (float) (Math.atan2(d11, d5) + 1.5707963267948966d);
        } else {
            this.f31556f = (float) Math.toRadians(this.N);
        }
    }
}
