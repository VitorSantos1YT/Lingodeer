package b0;

import com.yalantis.ucrop.view.CropImageView;
import l1.b3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i1 f3547a = e.q(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 7);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i1 f3548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i1 f3549c;

    static {
        Object obj = t2.f3682a;
        f3548b = e.q(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, new v3.f(0.1f), 3);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        f3549c = e.q(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 1, 3);
        long j11 = 1;
        e.q(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, new v3.j((j11 & 4294967295L) | (j11 << 32)), 3);
    }

    public static final b3 a(float f5, m mVar, String str, l1.n nVar, int i11, int i12) {
        if ((i12 & 2) != 0) {
            mVar = f3548b;
        }
        m mVar2 = mVar;
        if ((i12 & 4) != 0) {
            str = "DpAnimation";
        }
        return c(new v3.f(f5), e.f3498l, mVar2, null, str, nVar, ((i11 << 3) & 896) | ((i11 << 6) & 57344), 8);
    }

    public static final b3 b(float f5, m mVar, String str, l1.n nVar, int i11, int i12) {
        m mVar2;
        int i13 = i12 & 2;
        i1 i1Var = f3547a;
        if (i13 != 0) {
            mVar = i1Var;
        }
        if ((i12 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        if (mVar == i1Var) {
            l1.s sVar = (l1.s) nVar;
            sVar.d0(1144108831);
            boolean z11 = (((i11 & 896) ^ 384) > 256 && sVar.c(0.01f)) || (i11 & 384) == 256;
            Object objQ = sVar.Q();
            if (z11 || objQ == l1.m.f39353a) {
                objQ = e.q(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, Float.valueOf(0.01f), 3);
                sVar.o0(objQ);
            }
            sVar.p(false);
            mVar2 = (i1) objQ;
        } else {
            l1.s sVar2 = (l1.s) nVar;
            sVar2.d0(1144218757);
            sVar2.p(false);
            mVar2 = mVar;
        }
        int i14 = i11 << 3;
        return c(Float.valueOf(f5), e.f3496j, mVar2, Float.valueOf(0.01f), str2, nVar, (i11 & 14) | (i14 & 7168) | (57344 & i14) | (i14 & 458752), 0);
    }

    public static final b3 c(Object obj, j2 j2Var, m mVar, Float f5, String str, l1.n nVar, int i11, int i12) {
        if ((i12 & 8) != 0) {
            f5 = null;
        }
        l1.s sVar = (l1.s) nVar;
        Object objQ = sVar.Q();
        l1.g gVar = l1.m.f39353a;
        if (objQ == gVar) {
            objQ = l1.t.B(null);
            sVar.o0(objQ);
        }
        l1.b1 b1Var = (l1.b1) objQ;
        Object objQ2 = sVar.Q();
        if (objQ2 == gVar) {
            objQ2 = new d(obj, j2Var, f5);
            sVar.o0(objQ2);
        }
        d dVar = (d) objQ2;
        l1.b1 b1VarH = l1.t.H(null, sVar);
        if (f5 != null && (mVar instanceof i1)) {
            i1 i1Var = (i1) mVar;
            if (!kotlin.jvm.internal.m.a(i1Var.f3565c, f5)) {
                mVar = new i1(i1Var.f3563a, i1Var.f3564b, f5);
            }
        }
        l1.b1 b1VarH2 = l1.t.H(mVar, sVar);
        Object objQ3 = sVar.Q();
        if (objQ3 == gVar) {
            objQ3 = qx.p.b(-1, 6, null);
            sVar.o0(objQ3);
        }
        tz.l lVar = (tz.l) objQ3;
        boolean zH = sVar.h(lVar) | ((((i11 & 14) ^ 6) > 4 && sVar.h(obj)) || (6 & i11) == 4);
        Object objQ4 = sVar.Q();
        if (zH || objQ4 == gVar) {
            objQ4 = new at.f(2, lVar, obj);
            sVar.o0(objQ4);
        }
        l1.t.j((fz.a) objQ4, sVar);
        boolean zH2 = sVar.h(lVar) | sVar.h(dVar) | sVar.f(b1VarH2) | sVar.f(b1VarH);
        Object objQ5 = sVar.Q();
        if (zH2 || objQ5 == gVar) {
            g gVar2 = new g(lVar, dVar, b1VarH2, b1VarH, (vy.d) null);
            sVar.o0(gVar2);
            objQ5 = gVar2;
        }
        l1.t.f((fz.e) objQ5, lVar, sVar);
        b3 b3Var = (b3) b1Var.getValue();
        return b3Var == null ? dVar.f3472c : b3Var;
    }
}
