package b4;

import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Arrays;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f3878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xq.c f3879c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3877a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3880d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f3881e = new int[8];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f3882f = new int[8];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f3883g = new float[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3884h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3885i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3886j = false;

    public a(b bVar, xq.c cVar) {
        this.f3878b = bVar;
        this.f3879c = cVar;
    }

    public final void a(h hVar, float f5, boolean z11) {
        if (f5 <= -0.001f || f5 >= 0.001f) {
            int i11 = this.f3884h;
            b bVar = this.f3878b;
            if (i11 == -1) {
                this.f3884h = 0;
                this.f3883g[0] = f5;
                this.f3881e[0] = hVar.f3916b;
                this.f3882f[0] = -1;
                hVar.N++;
                hVar.a(bVar);
                this.f3877a++;
                if (this.f3886j) {
                    return;
                }
                int i12 = this.f3885i + 1;
                this.f3885i = i12;
                int[] iArr = this.f3881e;
                if (i12 >= iArr.length) {
                    this.f3886j = true;
                    this.f3885i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i13 = -1;
            for (int i14 = 0; i11 != -1 && i14 < this.f3877a; i14++) {
                int i15 = this.f3881e[i11];
                int i16 = hVar.f3916b;
                if (i15 == i16) {
                    float[] fArr = this.f3883g;
                    float f11 = fArr[i11] + f5;
                    if (f11 > -0.001f && f11 < 0.001f) {
                        f11 = 0.0f;
                    }
                    fArr[i11] = f11;
                    if (f11 == CropImageView.DEFAULT_ASPECT_RATIO) {
                        if (i11 == this.f3884h) {
                            this.f3884h = this.f3882f[i11];
                        } else {
                            int[] iArr2 = this.f3882f;
                            iArr2[i13] = iArr2[i11];
                        }
                        if (z11) {
                            hVar.b(bVar);
                        }
                        if (this.f3886j) {
                            this.f3885i = i11;
                        }
                        hVar.N--;
                        this.f3877a--;
                        return;
                    }
                    return;
                }
                if (i15 < i16) {
                    i13 = i11;
                }
                i11 = this.f3882f[i11];
            }
            int length = this.f3885i;
            int i17 = length + 1;
            if (this.f3886j) {
                int[] iArr3 = this.f3881e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i17;
            }
            int[] iArr4 = this.f3881e;
            if (length >= iArr4.length && this.f3877a < iArr4.length) {
                int i18 = 0;
                while (true) {
                    int[] iArr5 = this.f3881e;
                    if (i18 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i18] == -1) {
                        length = i18;
                        break;
                    }
                    i18++;
                }
            }
            int[] iArr6 = this.f3881e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i19 = this.f3880d * 2;
                this.f3880d = i19;
                this.f3886j = false;
                this.f3885i = length - 1;
                this.f3883g = Arrays.copyOf(this.f3883g, i19);
                this.f3881e = Arrays.copyOf(this.f3881e, this.f3880d);
                this.f3882f = Arrays.copyOf(this.f3882f, this.f3880d);
            }
            this.f3881e[length] = hVar.f3916b;
            this.f3883g[length] = f5;
            if (i13 != -1) {
                int[] iArr7 = this.f3882f;
                iArr7[length] = iArr7[i13];
                iArr7[i13] = length;
            } else {
                this.f3882f[length] = this.f3884h;
                this.f3884h = length;
            }
            hVar.N++;
            hVar.a(bVar);
            this.f3877a++;
            if (!this.f3886j) {
                this.f3885i++;
            }
            int i21 = this.f3885i;
            int[] iArr8 = this.f3881e;
            if (i21 >= iArr8.length) {
                this.f3886j = true;
                this.f3885i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i11 = this.f3884h;
        for (int i12 = 0; i11 != -1 && i12 < this.f3877a; i12++) {
            h hVar = ((h[]) this.f3879c.f56176d)[this.f3881e[i11]];
            if (hVar != null) {
                hVar.b(this.f3878b);
            }
            i11 = this.f3882f[i11];
        }
        this.f3884h = -1;
        this.f3885i = -1;
        this.f3886j = false;
        this.f3877a = 0;
    }

    public final float c(h hVar) {
        int i11 = this.f3884h;
        for (int i12 = 0; i11 != -1 && i12 < this.f3877a; i12++) {
            if (this.f3881e[i11] == hVar.f3916b) {
                return this.f3883g[i11];
            }
            i11 = this.f3882f[i11];
        }
        return CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public final int d() {
        return this.f3877a;
    }

    public final h e(int i11) {
        int i12 = this.f3884h;
        for (int i13 = 0; i12 != -1 && i13 < this.f3877a; i13++) {
            if (i13 == i11) {
                return ((h[]) this.f3879c.f56176d)[this.f3881e[i12]];
            }
            i12 = this.f3882f[i12];
        }
        return null;
    }

    public final float f(int i11) {
        int i12 = this.f3884h;
        for (int i13 = 0; i12 != -1 && i13 < this.f3877a; i13++) {
            if (i13 == i11) {
                return this.f3883g[i12];
            }
            i12 = this.f3882f[i12];
        }
        return CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public final void g(h hVar, float f5) {
        if (f5 == CropImageView.DEFAULT_ASPECT_RATIO) {
            h(hVar, true);
            return;
        }
        int i11 = this.f3884h;
        b bVar = this.f3878b;
        if (i11 == -1) {
            this.f3884h = 0;
            this.f3883g[0] = f5;
            this.f3881e[0] = hVar.f3916b;
            this.f3882f[0] = -1;
            hVar.N++;
            hVar.a(bVar);
            this.f3877a++;
            if (this.f3886j) {
                return;
            }
            int i12 = this.f3885i + 1;
            this.f3885i = i12;
            int[] iArr = this.f3881e;
            if (i12 >= iArr.length) {
                this.f3886j = true;
                this.f3885i = iArr.length - 1;
                return;
            }
            return;
        }
        int i13 = -1;
        for (int i14 = 0; i11 != -1 && i14 < this.f3877a; i14++) {
            int i15 = this.f3881e[i11];
            int i16 = hVar.f3916b;
            if (i15 == i16) {
                this.f3883g[i11] = f5;
                return;
            }
            if (i15 < i16) {
                i13 = i11;
            }
            i11 = this.f3882f[i11];
        }
        int length = this.f3885i;
        int i17 = length + 1;
        if (this.f3886j) {
            int[] iArr2 = this.f3881e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i17;
        }
        int[] iArr3 = this.f3881e;
        if (length >= iArr3.length && this.f3877a < iArr3.length) {
            int i18 = 0;
            while (true) {
                int[] iArr4 = this.f3881e;
                if (i18 >= iArr4.length) {
                    break;
                }
                if (iArr4[i18] == -1) {
                    length = i18;
                    break;
                }
                i18++;
            }
        }
        int[] iArr5 = this.f3881e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i19 = this.f3880d * 2;
            this.f3880d = i19;
            this.f3886j = false;
            this.f3885i = length - 1;
            this.f3883g = Arrays.copyOf(this.f3883g, i19);
            this.f3881e = Arrays.copyOf(this.f3881e, this.f3880d);
            this.f3882f = Arrays.copyOf(this.f3882f, this.f3880d);
        }
        this.f3881e[length] = hVar.f3916b;
        this.f3883g[length] = f5;
        if (i13 != -1) {
            int[] iArr6 = this.f3882f;
            iArr6[length] = iArr6[i13];
            iArr6[i13] = length;
        } else {
            this.f3882f[length] = this.f3884h;
            this.f3884h = length;
        }
        hVar.N++;
        hVar.a(bVar);
        int i21 = this.f3877a + 1;
        this.f3877a = i21;
        if (!this.f3886j) {
            this.f3885i++;
        }
        int[] iArr7 = this.f3881e;
        if (i21 >= iArr7.length) {
            this.f3886j = true;
        }
        if (this.f3885i >= iArr7.length) {
            this.f3886j = true;
            this.f3885i = iArr7.length - 1;
        }
    }

    public final float h(h hVar, boolean z11) {
        int i11 = this.f3884h;
        if (i11 == -1) {
            return CropImageView.DEFAULT_ASPECT_RATIO;
        }
        int i12 = 0;
        int i13 = -1;
        while (i11 != -1 && i12 < this.f3877a) {
            if (this.f3881e[i11] == hVar.f3916b) {
                if (i11 == this.f3884h) {
                    this.f3884h = this.f3882f[i11];
                } else {
                    int[] iArr = this.f3882f;
                    iArr[i13] = iArr[i11];
                }
                if (z11) {
                    hVar.b(this.f3878b);
                }
                hVar.N--;
                this.f3877a--;
                this.f3881e[i11] = -1;
                if (this.f3886j) {
                    this.f3885i = i11;
                }
                return this.f3883g[i11];
            }
            i12++;
            i13 = i11;
            i11 = this.f3882f[i11];
        }
        return CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public final String toString() {
        int i11 = this.f3884h;
        String string = BuildConfig.VERSION_NAME;
        for (int i12 = 0; i11 != -1 && i12 < this.f3877a; i12++) {
            StringBuilder sbN = ep.a.n(p.h(this.f3883g[i11], " : ", ep.a.n(defpackage.e.m(string, " -> "))));
            sbN.append(((h[]) this.f3879c.f56176d)[this.f3881e[i11]]);
            string = sbN.toString();
            i11 = this.f3882f[i11];
        }
        return string;
    }
}
