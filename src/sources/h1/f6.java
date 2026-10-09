package h1;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f30235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f30236b;

    static {
        float f5 = k1.t.f37764a;
        f30235a = k1.t.f37764a;
        f30236b = 8;
        float f11 = k1.t.f37764a;
        float f12 = k1.t.f37764a;
        float f13 = k1.t.f37764a;
    }

    public static final void a(z1.r rVar, long j11, long j12, float f5, j0.n2 n2Var, t1.d dVar, l1.n nVar, int i11) {
        long jA;
        int i12;
        t1.d dVar2;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1596802123);
        int i13 = i11 | (sVar.f(rVar) ? 4 : 2) | (sVar.e(j11) ? 32 : 16) | 128 | (sVar.f(n2Var) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE);
        if ((74899 & i13) == 74898 && sVar.F()) {
            sVar.W();
            jA = j12;
            dVar2 = dVar;
        } else {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                jA = v1.a((s1) sVar.j(v1.f31180a), j11);
                i12 = i13 & (-897);
            } else {
                sVar.W();
                i12 = i13 & (-897);
                jA = j12;
            }
            sVar.q();
            dVar2 = dVar;
            i9.a(rVar, null, j11, jA, f5, CropImageView.DEFAULT_ASPECT_RATIO, null, t1.e.d(105663120, new b2.h(5, n2Var, dVar2), sVar), sVar, ((i12 << 3) & 896) | (i12 & 14) | 12582912 | 24576, 98);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new e6(rVar, j11, jA, f5, n2Var, dVar2, i11);
        }
    }
}
