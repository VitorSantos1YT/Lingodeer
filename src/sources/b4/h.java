package b4;

import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Comparable {
    public g K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3915a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f3919e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3916b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3917c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3918d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3920f = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float[] f3921t = new float[9];
    public final float[] H = new float[9];
    public b[] L = new b[16];
    public int M = 0;
    public int N = 0;

    public h(g gVar) {
        this.K = gVar;
    }

    public final void a(b bVar) {
        int i11 = 0;
        while (true) {
            int i12 = this.M;
            if (i11 >= i12) {
                b[] bVarArr = this.L;
                if (i12 >= bVarArr.length) {
                    this.L = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.L;
                int i13 = this.M;
                bVarArr2[i13] = bVar;
                this.M = i13 + 1;
                return;
            }
            if (this.L[i11] == bVar) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final void b(b bVar) {
        int i11 = this.M;
        int i12 = 0;
        while (i12 < i11) {
            if (this.L[i12] == bVar) {
                while (i12 < i11 - 1) {
                    b[] bVarArr = this.L;
                    int i13 = i12 + 1;
                    bVarArr[i12] = bVarArr[i13];
                    i12 = i13;
                }
                this.M--;
                return;
            }
            i12++;
        }
    }

    public final void c() {
        this.K = g.UNKNOWN;
        this.f3918d = 0;
        this.f3916b = -1;
        this.f3917c = -1;
        this.f3919e = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f3920f = false;
        int i11 = this.M;
        for (int i12 = 0; i12 < i11; i12++) {
            this.L[i12] = null;
        }
        this.M = 0;
        this.N = 0;
        this.f3915a = false;
        Arrays.fill(this.H, CropImageView.DEFAULT_ASPECT_RATIO);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f3916b - ((h) obj).f3916b;
    }

    public final void e(c cVar, float f5) {
        this.f3919e = f5;
        this.f3920f = true;
        int i11 = this.M;
        this.f3917c = -1;
        for (int i12 = 0; i12 < i11; i12++) {
            this.L[i12].h(cVar, this, false);
        }
        this.M = 0;
    }

    public final void f(c cVar, b bVar) {
        int i11 = this.M;
        for (int i12 = 0; i12 < i11; i12++) {
            this.L[i12].i(cVar, bVar, false);
        }
        this.M = 0;
    }

    public final String toString() {
        return BuildConfig.VERSION_NAME + this.f3916b;
    }
}
