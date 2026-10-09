package i1;

import b0.i2;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i2 f34012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i2 f34013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i2 f34014c;

    static {
        b0.v vVar = new b0.v(0.4f, CropImageView.DEFAULT_ASPECT_RATIO, 0.6f, 1.0f);
        f34012a = new i2(120, b0.b0.f3438a, 2);
        f34013b = new i2(150, vVar, 2);
        f34014c = new i2(120, vVar, 2);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0009 A[PHI: r1
      0x0009: PHI (r1v3 b0.i2) = (r1v0 b0.i2), (r1v0 b0.i2), (r1v0 b0.i2), (r1v4 b0.i2), (r1v4 b0.i2), (r1v4 b0.i2), (r1v4 b0.i2) binds: [B:19:0x0022, B:22:0x0027, B:28:0x0033, B:5:0x0007, B:8:0x000d, B:11:0x0012, B:14:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    public static final Object a(b0.d dVar, float f5, h0.h hVar, h0.h hVar2, xy.c cVar) {
        i2 i2Var;
        i2 i2Var2 = null;
        if (hVar2 != null) {
            boolean z11 = hVar2 instanceof h0.k;
            i2Var = f34012a;
            if (z11 || (hVar2 instanceof h0.b) || (hVar2 instanceof h0.f) || (hVar2 instanceof h0.d)) {
                i2Var2 = i2Var;
            }
        } else if (hVar != null) {
            boolean z12 = hVar instanceof h0.k;
            i2Var = f34013b;
            if (z12 || (hVar instanceof h0.b)) {
                i2Var2 = i2Var;
            } else if (hVar instanceof h0.f) {
                i2Var2 = f34014c;
            } else if (hVar instanceof h0.d) {
                i2Var2 = i2Var;
            }
        }
        i2 i2Var3 = i2Var2;
        if (i2Var3 != null) {
            Object objC = b0.d.c(dVar, new v3.f(f5), i2Var3, null, cVar, 12);
            if (objC == wy.a.COROUTINE_SUSPENDED) {
                return objC;
            }
        } else {
            Object objE = dVar.e(new v3.f(f5), cVar);
            if (objE == wy.a.COROUTINE_SUSPENDED) {
                return objE;
            }
        }
        return qy.b0.f48488a;
    }
}
