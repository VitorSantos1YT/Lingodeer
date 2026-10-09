package j3;

import androidx.recyclerview.widget.p2;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n3.h f35809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v3.c f35810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v3.m f35811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ob.m f35812d = new ob.m(15);

    public w0(n3.h hVar, v3.c cVar, v3.m mVar) {
        this.f35809a = hVar;
        this.f35810b = cVar;
        this.f35811c = mVar;
    }

    public static u0 a(w0 w0Var, String str, y0 y0Var, long j11, int i11) {
        if ((i11 & 32) != 0) {
            j11 = v3.b.b(0, 0, 15);
        }
        v3.m mVar = w0Var.f35811c;
        v3.c cVar = w0Var.f35810b;
        n3.h hVar = w0Var.f35809a;
        w0Var.getClass();
        return b(w0Var, new h(str), y0Var, true, Integer.MAX_VALUE, j11, mVar, cVar, hVar, 32);
    }

    public static u0 b(w0 w0Var, h hVar, y0 y0Var, boolean z11, int i11, long j11, v3.m mVar, v3.c cVar, n3.h hVar2, int i12) {
        u0 u0Var;
        n3.h hVar3 = (i12 & 512) != 0 ? w0Var.f35809a : hVar2;
        ob.m mVar2 = w0Var.f35812d;
        ry.r rVar = ry.r.f50854a;
        n3.h hVar4 = hVar3;
        t0 t0Var = new t0(hVar, y0Var, rVar, i11, z11, 1, cVar, mVar, hVar4, j11);
        u0 u0Var2 = null;
        if (mVar2 != null) {
            o oVar = new o(t0Var);
            p2 p2Var = (p2) mVar2.f44826b;
            if (p2Var != null) {
                u0Var = (u0) p2Var.j(oVar);
            } else if (kotlin.jvm.internal.m.a((o) mVar2.f44827c, oVar)) {
                u0Var = (u0) mVar2.f44828d;
            }
            if (u0Var != null && !u0Var.f35798b.f35813a.a()) {
                u0Var2 = u0Var;
            }
        }
        if (u0Var2 != null) {
            x xVar = u0Var2.f35798b;
            return new u0(t0Var, xVar, v3.b.d(j11, (((long) ((int) Math.ceil(xVar.f35817e))) & 4294967295L) | (((long) ((int) Math.ceil(xVar.f35816d))) << 32)));
        }
        a9.i iVar = new a9.i(hVar, t.j(y0Var, mVar), (List) rVar, cVar, hVar4);
        int iJ = v3.a.j(j11);
        int iH = (z11 && v3.a.d(j11)) ? v3.a.h(j11) : Integer.MAX_VALUE;
        if (iJ != iH) {
            iH = hz.b.l((int) Math.ceil(iVar.c()), iJ, iH);
        }
        x xVar2 = new x(iVar, com.bumptech.glide.f.q(0, iH, 0, v3.a.g(j11)), i11, 1);
        u0 u0Var3 = new u0(t0Var, xVar2, v3.b.d(j11, (((long) ((int) Math.ceil(xVar2.f35817e))) & 4294967295L) | (((long) ((int) Math.ceil(xVar2.f35816d))) << 32)));
        if (mVar2 != null) {
            p2 p2Var2 = (p2) mVar2.f44826b;
            if (p2Var2 != null) {
                p2Var2.q(new o(t0Var), u0Var3);
                return u0Var3;
            }
            mVar2.f44827c = new o(t0Var);
            mVar2.f44828d = u0Var3;
        }
        return u0Var3;
    }
}
