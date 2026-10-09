package c9;

import android.graphics.Rect;
import b7.v;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f6740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6742f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Rect f6743g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f6737a = new int[4];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6744h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6745i = -1;

    public static int a(int[] iArr, int i11) {
        return (i11 < 0 || i11 >= iArr.length) ? iArr[0] : iArr[i11];
    }

    public static int c(int i11, int i12) {
        return (i11 & 16777215) | ((i12 * 17) << 24);
    }

    public final void b(v vVar, boolean z11, Rect rect, int[] iArr) {
        int i11;
        int i12;
        int iWidth = rect.width();
        int iHeight = rect.height();
        int i13 = !z11 ? 1 : 0;
        int i14 = i13 * iWidth;
        while (true) {
            int i15 = 0;
            do {
                int i16 = 1;
                int i17 = 0;
                while (true) {
                    if (i17 >= i16 || i16 > 64) {
                        i11 = i17 & 3;
                        if (i17 >= 4) {
                            i12 = i17 >> 2;
                            break;
                        } else {
                            i12 = iWidth;
                            break;
                        }
                    }
                    if (vVar.b() < 4) {
                        i11 = -1;
                        i12 = 0;
                        break;
                    } else {
                        i17 = (i17 << 4) | vVar.i(4);
                        i16 <<= 2;
                    }
                }
                int iMin = Math.min(i12, iWidth - i15);
                if (iMin > 0) {
                    int i18 = i14 + iMin;
                    Arrays.fill(iArr, i14, i18, this.f6737a[i11]);
                    i15 += iMin;
                    i14 = i18;
                }
            } while (i15 < iWidth);
            i13 += 2;
            if (i13 >= iHeight) {
                return;
            }
            i14 = i13 * iWidth;
            vVar.c();
        }
    }
}
