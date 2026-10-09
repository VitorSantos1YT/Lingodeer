package s0;

import com.yalantis.ucrop.view.CropImageView;
import j0.e2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f50996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1.r f50997b;

    public b(long j11, z1.r rVar) {
        this.f50996a = j11;
        this.f50997b = rVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        l1.n nVar = (l1.n) obj;
        int iIntValue = ((Number) obj2).intValue();
        l1.s sVar = (l1.s) nVar;
        if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            long j11 = this.f50996a;
            if (j11 != 9205357640488583168L) {
                sVar.d0(-1244013944);
                z1.r rVarM = e2.m(this.f50997b, v3.h.b(j11), v3.h.a(j11), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12);
                w2.q0 q0VarD = j0.o.d(z1.c.f58464b, false);
                int iHashCode = Long.hashCode(sVar.T);
                l1.q1 q1VarL = sVar.l();
                z1.r rVarC = z1.a.c(sVar, rVarM);
                y2.k.J.getClass();
                y2.i iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, q0VarD, sVar);
                l1.t.J(y2.j.f56916e, q1VarL, sVar);
                y2.h hVar = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC, sVar);
                d.b(0, 1, sVar, null);
                sVar.p(true);
                sVar.p(false);
            } else {
                sVar.d0(-1243644858);
                d.b(0, 0, sVar, this.f50997b);
                sVar.p(false);
            }
        } else {
            sVar.W();
        }
        return qy.b0.f48488a;
    }
}
