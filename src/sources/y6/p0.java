package y6;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f57304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f57305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f57306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p[] f57307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f57308e;

    static {
        b7.f0.G(0);
        b7.f0.G(1);
    }

    public p0(String str, p... pVarArr) {
        b7.a.d(pVarArr.length > 0);
        this.f57305b = str;
        this.f57307d = pVarArr;
        this.f57304a = pVarArr.length;
        int i11 = d0.i(pVarArr[0].f57291n);
        this.f57306c = i11 == -1 ? d0.i(pVarArr[0].m) : i11;
        String str2 = pVarArr[0].f57282d;
        str2 = (str2 == null || str2.equals("und")) ? BuildConfig.VERSION_NAME : str2;
        int i12 = pVarArr[0].f57284f | 16384;
        for (int i13 = 1; i13 < pVarArr.length; i13++) {
            String str3 = pVarArr[i13].f57282d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? BuildConfig.VERSION_NAME : str3)) {
                a(i13, "languages", pVarArr[0].f57282d, pVarArr[i13].f57282d);
                return;
            } else {
                if (i12 != (pVarArr[i13].f57284f | 16384)) {
                    a(i13, "role flags", Integer.toBinaryString(pVarArr[0].f57284f), Integer.toBinaryString(pVarArr[i13].f57284f));
                    return;
                }
            }
        }
    }

    public static void a(int i11, String str, String str2, String str3) {
        StringBuilder sbS = defpackage.e.s("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbS.append(str3);
        sbS.append("' (track ");
        sbS.append(i11);
        sbS.append(")");
        b7.a.p(BuildConfig.VERSION_NAME, new IllegalStateException(sbS.toString()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p0.class == obj.getClass()) {
            p0 p0Var = (p0) obj;
            if (this.f57305b.equals(p0Var.f57305b) && Arrays.equals(this.f57307d, p0Var.f57307d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f57308e == 0) {
            this.f57308e = Arrays.hashCode(this.f57307d) + defpackage.e.d(527, 31, this.f57305b);
        }
        return this.f57308e;
    }

    public final String toString() {
        return this.f57305b + ": " + Arrays.toString(this.f57307d);
    }
}
