package y;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f56733a = new w(0);

    public static final w a(int... iArr) {
        w wVar = new w(iArr.length);
        int i11 = wVar.f56783b;
        if (i11 < 0) {
            z.a.d(BuildConfig.VERSION_NAME);
            throw null;
        }
        if (iArr.length == 0) {
            return wVar;
        }
        wVar.b(iArr.length + i11);
        int[] iArr2 = wVar.f56782a;
        int i12 = wVar.f56783b;
        if (i11 != i12) {
            ry.l.H(iArr.length + i11, i11, iArr2, iArr2, i12);
        }
        ry.l.L(i11, 0, iArr, iArr2, 12);
        wVar.f56783b += iArr.length;
        return wVar;
    }
}
