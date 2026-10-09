package d1;

import com.yalantis.ucrop.view.CropImageView;
import j0.a2;
import j0.e2;
import j0.z1;
import l1.q1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f22879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f22880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z1.r f22881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f22882d;

    public d(long j11, boolean z11, z1.r rVar, l lVar) {
        this.f22879a = j11;
        this.f22880b = z11;
        this.f22881c = rVar;
        this.f22882d = lVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        l1.n nVar = (l1.n) obj;
        int iIntValue = ((Number) obj2).intValue();
        l1.s sVar = (l1.s) nVar;
        if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            long j11 = this.f22879a;
            l1.g gVar = l1.m.f39353a;
            final l lVar = this.f22882d;
            boolean z11 = this.f22880b;
            if (j11 != 9205357640488583168L) {
                sVar.d0(3458246);
                j0.b bVar = z11 ? j0.c.f35255b : j0.c.f35254a;
                z1.r rVarM = e2.m(this.f22881c, v3.h.b(j11), v3.h.a(j11), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12);
                a2 a2VarA = z1.a(bVar, z1.c.L, sVar, 0);
                int iHashCode = Long.hashCode(sVar.T);
                q1 q1VarL = sVar.l();
                z1.r rVarC = z1.a.c(sVar, rVarM);
                y2.k.J.getClass();
                y2.i iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, a2VarA, sVar);
                l1.t.J(y2.j.f56916e, q1VarL, sVar);
                y2.h hVar = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC, sVar);
                boolean zH = sVar.h(lVar);
                Object objQ = sVar.Q();
                if (zH || objQ == gVar) {
                    final int i11 = 0;
                    objQ = new fz.a() { // from class: d1.c
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i11) {
                                case 0:
                                    return Boolean.valueOf((lVar.a() & 9223372034707292159L) != 9205357640488583168L);
                                default:
                                    return Boolean.valueOf((lVar.a() & 9223372034707292159L) != 9205357640488583168L);
                            }
                        }
                    };
                    sVar.o0(objQ);
                }
                qx.p.e(6, (fz.a) objQ, sVar, z1.o.f58481a, z11);
                sVar.p(true);
                sVar.p(false);
            } else {
                sVar.d0(4389176);
                boolean zH2 = sVar.h(lVar);
                Object objQ2 = sVar.Q();
                if (zH2 || objQ2 == gVar) {
                    final int i12 = 1;
                    objQ2 = new fz.a() { // from class: d1.c
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i12) {
                                case 0:
                                    return Boolean.valueOf((lVar.a() & 9223372034707292159L) != 9205357640488583168L);
                                default:
                                    return Boolean.valueOf((lVar.a() & 9223372034707292159L) != 9205357640488583168L);
                            }
                        }
                    };
                    sVar.o0(objQ2);
                }
                qx.p.e(0, (fz.a) objQ2, sVar, this.f22881c, z11);
                sVar.p(false);
            }
        } else {
            sVar.W();
        }
        return qy.b0.f48488a;
    }
}
