package x7;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f55949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f55950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f55951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f55952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f55953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f55954f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Serializable f55955g;

    public boolean a(int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        if ((i11 & (-2097152)) != -2097152 || (i12 = (i11 >>> 19) & 3) == 1 || (i13 = (i11 >>> 17) & 3) == 0 || (i14 = (i11 >>> 12) & 15) == 0 || i14 == 15 || (i15 = (i11 >>> 10) & 3) == 3) {
            return false;
        }
        this.f55949a = i12;
        this.f55955g = a.f55830s[3 - i13];
        int i16 = a.f55831t[i15];
        this.f55951c = i16;
        if (i12 == 2) {
            this.f55951c = i16 / 2;
        } else if (i12 == 0) {
            this.f55951c = i16 / 4;
        }
        int i17 = (i11 >>> 9) & 1;
        int i18 = 1152;
        if (i13 != 1) {
            if (i13 != 2) {
                if (i13 != 3) {
                    throw new IllegalArgumentException();
                }
                i18 = 384;
            }
        } else if (i12 != 3) {
            i18 = 576;
        }
        this.f55954f = i18;
        if (i13 == 3) {
            int i19 = i12 == 3 ? a.f55832u[i14 - 1] : a.f55833v[i14 - 1];
            this.f55953e = i19;
            this.f55950b = (((i19 * 12) / this.f55951c) + i17) * 4;
        } else {
            if (i12 == 3) {
                int i21 = i13 == 2 ? a.f55834w[i14 - 1] : a.f55835x[i14 - 1];
                this.f55953e = i21;
                this.f55950b = ((i21 * 144) / this.f55951c) + i17;
            } else {
                int i22 = a.f55836y[i14 - 1];
                this.f55953e = i22;
                this.f55950b = (((i13 == 1 ? 72 : 144) * i22) / this.f55951c) + i17;
            }
        }
        this.f55952d = ((i11 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
