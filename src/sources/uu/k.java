package uu;

import android.content.res.Resources;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import h1.s1;
import h1.ua;
import h1.v1;
import j0.a2;
import j0.e2;
import j0.q;
import j0.v;
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
public final /* synthetic */ class k implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53165a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f53166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f53167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f53168d;

    public /* synthetic */ k(int i11, int i12, Resources resources) {
        this.f53166b = i11;
        this.f53168d = resources;
        this.f53167c = i12;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j11;
        switch (this.f53165a) {
            case 0:
                Resources resources = (Resources) this.f53168d;
                q PressableCard = (q) obj;
                n nVar = (n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                m.f(PressableCard, "$this$PressableCard");
                s sVar = (s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    z1.i iVar = z1.c.M;
                    float f5 = 12;
                    j0.g gVarH = j0.i.h(f5);
                    o oVar = o.f58481a;
                    r rVarB = j0.c.B(e2.e(e2.i(oVar, 56, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), f5, 8);
                    a2 a2VarA = z1.a(gVarH, iVar, sVar, 54);
                    int iHashCode = Long.hashCode(sVar.T);
                    q1 q1VarL = sVar.l();
                    r rVarC = z1.a.c(sVar, rVarB);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar2);
                    } else {
                        sVar.r0();
                    }
                    t.J(y2.j.f56917f, a2VarA, sVar);
                    t.J(y2.j.f56916e, q1VarL, sVar);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    t.J(y2.j.f56915d, rVarC, sVar);
                    d0.n.c(se.k.y(this.f53166b, sVar, 0), null, oVar, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 432, 120);
                    String string = resources.getString(this.f53167c);
                    m.e(string, "getString(...)");
                    ua.b(string, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(ua.f31167a), ((s1) sVar.j(v1.f31180a)).f31034q, j3.A(16), n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, 0, 0, 65534);
                    sVar.p(true);
                } else {
                    sVar.W();
                }
                break;
            default:
                String str = (String) this.f53168d;
                v Tab = (v) obj;
                n nVar2 = (n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                m.f(Tab, "$this$Tab");
                s sVar2 = (s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    if (this.f53166b == this.f53167c) {
                        sVar2.d0(842118070);
                        j11 = ((s1) sVar2.j(v1.f31180a)).f31017a;
                    } else {
                        sVar2.d0(842119320);
                        j11 = ((s1) sVar2.j(v1.f31180a)).f31034q;
                    }
                    sVar2.p(false);
                    ua.b(str, j0.c.C(o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 20, 1), j11, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 48, 0, 131064);
                } else {
                    sVar2.W();
                }
                break;
        }
        return b0.f48488a;
    }

    public /* synthetic */ k(int i11, int i12, String str) {
        this.f53166b = i11;
        this.f53167c = i12;
        this.f53168d = str;
    }
}
