package b4;

import com.yalantis.ucrop.view.CropImageView;
import java.util.Arrays;
import nv.p;
import ob.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h[] f3911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h[] f3912g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3913h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public l f3914i;

    @Override // b4.b
    public final h d(boolean[] zArr) {
        int i11 = -1;
        for (int i12 = 0; i12 < this.f3913h; i12++) {
            h[] hVarArr = this.f3911f;
            h hVar = hVarArr[i12];
            if (!zArr[hVar.f3916b]) {
                l lVar = this.f3914i;
                lVar.f44822b = hVar;
                int i13 = 8;
                if (i11 != -1) {
                    h hVar2 = hVarArr[i11];
                    while (i13 >= 0) {
                        float f5 = hVar2.H[i13];
                        float f11 = ((h) lVar.f44822b).H[i13];
                        if (f11 != f5) {
                            if (f11 >= f5) {
                                break;
                            }
                            i11 = i12;
                            break;
                            break;
                        }
                        i13--;
                    }
                } else {
                    while (i13 >= 0) {
                        float f12 = ((h) lVar.f44822b).H[i13];
                        if (f12 > CropImageView.DEFAULT_ASPECT_RATIO) {
                            break;
                        }
                        if (f12 < CropImageView.DEFAULT_ASPECT_RATIO) {
                            i11 = i12;
                            break;
                        }
                        i13--;
                    }
                }
            }
        }
        if (i11 == -1) {
            return null;
        }
        return this.f3911f[i11];
    }

    @Override // b4.b
    public final boolean e() {
        return this.f3913h == 0;
    }

    @Override // b4.b
    public final void i(c cVar, b bVar, boolean z11) {
        h hVar = bVar.f3887a;
        if (hVar == null) {
            return;
        }
        float[] fArr = hVar.H;
        a aVar = bVar.f3890d;
        int iD = aVar.d();
        for (int i11 = 0; i11 < iD; i11++) {
            h hVarE = aVar.e(i11);
            float f5 = aVar.f(i11);
            l lVar = this.f3914i;
            lVar.f44822b = hVarE;
            if (hVarE.f3915a) {
                boolean z12 = true;
                for (int i12 = 0; i12 < 9; i12++) {
                    float[] fArr2 = ((h) lVar.f44822b).H;
                    float f11 = (fArr[i12] * f5) + fArr2[i12];
                    fArr2[i12] = f11;
                    if (Math.abs(f11) < 1.0E-4f) {
                        ((h) lVar.f44822b).H[i12] = 0.0f;
                    } else {
                        z12 = false;
                    }
                }
                if (z12) {
                    ((f) lVar.f44823c).k((h) lVar.f44822b);
                }
            } else {
                for (int i13 = 0; i13 < 9; i13++) {
                    float f12 = fArr[i13];
                    if (f12 != CropImageView.DEFAULT_ASPECT_RATIO) {
                        float f13 = f12 * f5;
                        if (Math.abs(f13) < 1.0E-4f) {
                            f13 = 0.0f;
                        }
                        ((h) lVar.f44822b).H[i13] = f13;
                    } else {
                        ((h) lVar.f44822b).H[i13] = 0.0f;
                    }
                }
                j(hVarE);
            }
            this.f3888b = (bVar.f3888b * f5) + this.f3888b;
        }
        k(hVar);
    }

    public final void j(h hVar) {
        int i11;
        int i12 = this.f3913h + 1;
        h[] hVarArr = this.f3911f;
        if (i12 > hVarArr.length) {
            h[] hVarArr2 = (h[]) Arrays.copyOf(hVarArr, hVarArr.length * 2);
            this.f3911f = hVarArr2;
            this.f3912g = (h[]) Arrays.copyOf(hVarArr2, hVarArr2.length * 2);
        }
        h[] hVarArr3 = this.f3911f;
        int i13 = this.f3913h;
        hVarArr3[i13] = hVar;
        int i14 = i13 + 1;
        this.f3913h = i14;
        if (i14 > 1 && hVarArr3[i13].f3916b > hVar.f3916b) {
            int i15 = 0;
            while (true) {
                i11 = this.f3913h;
                if (i15 >= i11) {
                    break;
                }
                this.f3912g[i15] = this.f3911f[i15];
                i15++;
            }
            Arrays.sort(this.f3912g, 0, i11, new e(0));
            for (int i16 = 0; i16 < this.f3913h; i16++) {
                this.f3911f[i16] = this.f3912g[i16];
            }
        }
        hVar.f3915a = true;
        hVar.a(this);
    }

    public final void k(h hVar) {
        int i11 = 0;
        while (i11 < this.f3913h) {
            if (this.f3911f[i11] == hVar) {
                while (true) {
                    int i12 = this.f3913h;
                    if (i11 >= i12 - 1) {
                        this.f3913h = i12 - 1;
                        hVar.f3915a = false;
                        return;
                    } else {
                        h[] hVarArr = this.f3911f;
                        int i13 = i11 + 1;
                        hVarArr[i11] = hVarArr[i13];
                        i11 = i13;
                    }
                }
            } else {
                i11++;
            }
        }
    }

    @Override // b4.b
    public final String toString() {
        l lVar = this.f3914i;
        String strH = p.h(this.f3888b, ") : ", new StringBuilder(" goal -> ("));
        for (int i11 = 0; i11 < this.f3913h; i11++) {
            lVar.f44822b = this.f3911f[i11];
            strH = strH + lVar + " ";
        }
        return strH;
    }
}
