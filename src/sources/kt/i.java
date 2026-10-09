package kt;

import com.lingodeer.R;
import h1.dc;
import h1.fc;
import h1.r4;
import h1.s1;
import h1.ua;
import h1.v1;
import j0.a2;
import j0.b2;
import j0.e2;
import j0.z1;
import j3.y0;
import kotlin.jvm.internal.m;
import l1.n;
import l1.q1;
import l1.s;
import l1.t;
import qy.b0;
import z1.o;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38677a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f38678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f38679c;

    public /* synthetic */ i(String str, boolean z11) {
        this.f38679c = str;
        this.f38678b = z11;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j11;
        long j12;
        switch (this.f38677a) {
            case 0:
                b2 TextButton = (b2) obj;
                n nVar = (n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                m.f(TextButton, "$this$TextButton");
                s sVar = (s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    if (this.f38678b) {
                        sVar.d0(-1471375599);
                        j11 = ((s1) sVar.j(v1.f31180a)).f31040w;
                    } else {
                        sVar.d0(-1471374413);
                        j11 = ((s1) sVar.j(v1.f31180a)).f31017a;
                    }
                    sVar.p(false);
                    ua.b(this.f38679c, null, j11, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 0, 0, 131066);
                } else {
                    sVar.W();
                }
                break;
            default:
                b2 TextButton2 = (b2) obj;
                n nVar2 = (n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                m.f(TextButton2, "$this$TextButton");
                s sVar2 = (s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    a2 a2VarA = z1.a(j0.i.g(2), z1.c.M, sVar2, 54);
                    int iHashCode = Long.hashCode(sVar2.T);
                    q1 q1VarL = sVar2.l();
                    o oVar = o.f58481a;
                    r rVarC = z1.a.c(sVar2, oVar);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    t.J(y2.j.f56917f, a2VarA, sVar2);
                    t.J(y2.j.f56916e, q1VarL, sVar2);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar2.S || !m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                    }
                    t.J(y2.j.f56915d, rVarC, sVar2);
                    r4.b(se.k.y(R.drawable.edit_24px, sVar2, 0), null, e2.n(oVar, 18), 0L, sVar2, 432, 8);
                    y0 y0Var = ((dc) sVar2.j(fc.f30256a)).f30178k;
                    boolean z11 = this.f38678b;
                    if (z11) {
                        sVar2.d0(-1785570648);
                        j12 = ((s1) sVar2.j(v1.f31180a)).f31017a;
                    } else {
                        sVar2.d0(-1785569391);
                        j12 = ((s1) sVar2.j(v1.f31180a)).f31036s;
                    }
                    sVar2.p(false);
                    ua.b(this.f38679c, null, j12, 0L, null, z11 ? n3.s.K : n3.s.f43178t, null, 0L, null, 0L, 0, false, 0, 0, y0Var, sVar2, 0, 0, 65498);
                    sVar2.p(true);
                } else {
                    sVar2.W();
                }
                break;
        }
        return b0.f48488a;
    }

    public /* synthetic */ i(boolean z11, String str) {
        this.f38678b = z11;
        this.f38679c = str;
    }
}
