package y6;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f57142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri[] f57144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x[] f57145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f57146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f57147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String[] f57148g;

    static {
        w4.c.s(0, 1, 2, 3, 4);
        w4.c.s(5, 6, 7, 8, 9);
        b7.f0.G(10);
    }

    public a(int i11, int i12, int[] iArr, x[] xVarArr, long[] jArr, String[] strArr) {
        Uri uri;
        int i13 = 0;
        b7.a.d(iArr.length == xVarArr.length);
        this.f57142a = i11;
        this.f57143b = i12;
        this.f57146e = iArr;
        this.f57145d = xVarArr;
        this.f57147f = jArr;
        this.f57144c = new Uri[xVarArr.length];
        while (true) {
            Uri[] uriArr = this.f57144c;
            if (i13 >= uriArr.length) {
                this.f57148g = strArr;
                return;
            }
            x xVar = xVarArr[i13];
            if (xVar == null) {
                uri = null;
            } else {
                u uVar = xVar.f57373b;
                uVar.getClass();
                uri = uVar.f57358a;
            }
            uriArr[i13] = uri;
            i13++;
        }
    }

    public final int a(int i11) {
        int i12;
        int i13 = i11 + 1;
        while (true) {
            int[] iArr = this.f57146e;
            if (i13 >= iArr.length || (i12 = iArr[i13]) == 0 || i12 == 1) {
                break;
            }
            i13++;
        }
        return i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f57142a == aVar.f57142a && this.f57143b == aVar.f57143b && Arrays.equals(this.f57145d, aVar.f57145d) && Arrays.equals(this.f57146e, aVar.f57146e) && Arrays.equals(this.f57147f, aVar.f57147f) && Arrays.equals(this.f57148g, aVar.f57148g);
    }

    public final int hashCode() {
        int i11 = ((this.f57142a * 31) + this.f57143b) * 31;
        int i12 = (int) 0;
        return (((((Arrays.hashCode(this.f57147f) + ((Arrays.hashCode(this.f57146e) + ((Arrays.hashCode(this.f57145d) + ((i11 + i12) * 31)) * 31)) * 31)) * 31) + i12) * 961) + Arrays.hashCode(this.f57148g)) * 31;
    }
}
