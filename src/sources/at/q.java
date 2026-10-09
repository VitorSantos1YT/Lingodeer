package at;

import android.content.res.Resources;
import com.lingodeer.R;
import com.lingodeer.data.model.CourseUnit;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.OptionItemSelectedState;
import dt.a0;
import h1.dc;
import h1.fc;
import h1.k7;
import h1.s1;
import h1.ua;
import h1.v1;
import j0.a2;
import j0.e2;
import j0.i1;
import j0.z1;
import j3.y0;
import java.util.Map;
import l1.q1;
import l1.t;
import mt.y3;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2918a = 9;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2923f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f2924t;

    public /* synthetic */ q(int i11, String str, boolean z11, z1.r rVar, String str2, fz.c cVar, int i12) {
        this.f2921d = i11;
        this.f2922e = str;
        this.f2919b = z11;
        this.f2920c = rVar;
        this.f2924t = str2;
        this.f2923f = cVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2918a) {
            case 0:
                ((Integer) obj2).getClass();
                b.g((CourseUnit) this.f2922e, this.f2919b, (fz.a) this.f2920c, (fz.c) this.f2923f, (fz.c) this.f2924t, (l1.n) obj, t.M(this.f2921d | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                a0.e((OptionItemSelectedState) this.f2922e, this.f2919b, (t1.d) this.f2923f, (fz.a) this.f2920c, (z1.r) this.f2924t, (l1.n) obj, t.M(this.f2921d | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                iv.a.y((String) this.f2922e, (String) this.f2923f, this.f2919b, (z1.r) this.f2924t, (fz.a) this.f2920c, (l1.n) obj, t.M(this.f2921d | 1));
                break;
            case 3:
                fz.a aVar = (fz.a) this.f2920c;
                fz.a aVar2 = (fz.a) this.f2922e;
                fz.a aVar3 = (fz.a) this.f2923f;
                fz.a aVar4 = (fz.a) this.f2924t;
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    z1.r rVarB = j0.c.B(e2.e(z1.o.f58481a, 1.0f), 12, 8);
                    a2 a2VarA = z1.a(j0.i.g(4), z1.c.M, sVar, 54);
                    int iHashCode = Long.hashCode(sVar.T);
                    q1 q1VarL = sVar.l();
                    z1.r rVarC = z1.a.c(sVar, rVarB);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    t.J(y2.j.f56917f, a2VarA, sVar);
                    t.J(y2.j.f56916e, q1VarL, sVar);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    t.J(y2.j.f56915d, rVarC, sVar);
                    String strD0 = ub.a.d0(R.string.srs_future_reviews_selected_count, new Object[]{Integer.valueOf(this.f2921d)}, sVar);
                    y0 y0Var = ((dc) sVar.j(fc.f30256a)).f30178k;
                    long j11 = ((s1) sVar.j(v1.f31180a)).f31036s;
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    ua.b(strD0, new i1(1.0f, true), j11, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0Var, sVar, 0, 0, 65528);
                    if (this.f2919b) {
                        sVar.d0(-20844677);
                        k7.m(aVar, null, false, null, null, null, mt.g.f41418a0, sVar, 805306368, 510);
                        sVar.p(false);
                    } else {
                        sVar.d0(-20666179);
                        k7.m(aVar2, null, false, null, null, null, mt.g.f41420b0, sVar, 805306368, 510);
                        k7.m(aVar3, null, false, null, null, null, mt.g.f41422c0, sVar, 805306368, 510);
                        sVar = sVar;
                        sVar.p(false);
                    }
                    l1.s sVar2 = sVar;
                    k7.m(aVar4, null, false, null, null, null, mt.g.f41424d0, sVar2, 805306368, 510);
                    sVar2.p(true);
                } else {
                    sVar.W();
                }
                return b0.f48488a;
            case 4:
                ((Integer) obj2).getClass();
                y3.d((Map) this.f2922e, this.f2919b, (fz.c) this.f2923f, (fz.c) this.f2924t, (z1.r) this.f2920c, (l1.n) obj, t.M(this.f2921d | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                pt.j.a((CourseWord) this.f2922e, (String) this.f2920c, this.f2919b, (y0) this.f2923f, (z1.r) this.f2924t, (l1.n) obj, t.M(this.f2921d | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                uu.a.i((Resources) this.f2922e, (z1.r) this.f2923f, this.f2919b, (fz.a) this.f2920c, (fz.a) this.f2924t, (l1.n) obj, t.M(this.f2921d | 1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                uu.a.h((String) this.f2922e, this.f2919b, (e2.l) this.f2920c, (Resources) this.f2924t, (fz.c) this.f2923f, (l1.n) obj, t.M(this.f2921d | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                xu.s.b(this.f2919b, (fz.a) this.f2920c, (fz.a) this.f2922e, (fz.a) this.f2924t, (fz.c) this.f2923f, (l1.n) obj, t.M(this.f2921d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                xu.q1.j(this.f2921d, (String) this.f2922e, this.f2919b, (z1.r) this.f2920c, (String) this.f2924t, (fz.c) this.f2923f, (l1.n) obj, t.M(3073));
                break;
        }
        return b0.f48488a;
    }

    public /* synthetic */ q(int i11, boolean z11, fz.a aVar, fz.a aVar2, fz.a aVar3, fz.a aVar4) {
        this.f2921d = i11;
        this.f2919b = z11;
        this.f2920c = aVar;
        this.f2922e = aVar2;
        this.f2923f = aVar3;
        this.f2924t = aVar4;
    }

    public /* synthetic */ q(Resources resources, z1.r rVar, boolean z11, fz.a aVar, fz.a aVar2, int i11) {
        this.f2922e = resources;
        this.f2923f = rVar;
        this.f2919b = z11;
        this.f2920c = aVar;
        this.f2924t = aVar2;
        this.f2921d = i11;
    }

    public /* synthetic */ q(CourseUnit courseUnit, boolean z11, fz.a aVar, fz.c cVar, fz.c cVar2, int i11) {
        this.f2922e = courseUnit;
        this.f2919b = z11;
        this.f2920c = aVar;
        this.f2923f = cVar;
        this.f2924t = cVar2;
        this.f2921d = i11;
    }

    public /* synthetic */ q(CourseWord courseWord, String str, boolean z11, y0 y0Var, z1.r rVar, int i11) {
        this.f2922e = courseWord;
        this.f2920c = str;
        this.f2919b = z11;
        this.f2923f = y0Var;
        this.f2924t = rVar;
        this.f2921d = i11;
    }

    public /* synthetic */ q(OptionItemSelectedState optionItemSelectedState, boolean z11, t1.d dVar, fz.a aVar, z1.r rVar, int i11) {
        this.f2922e = optionItemSelectedState;
        this.f2919b = z11;
        this.f2923f = dVar;
        this.f2920c = aVar;
        this.f2924t = rVar;
        this.f2921d = i11;
    }

    public /* synthetic */ q(String str, String str2, boolean z11, z1.r rVar, fz.a aVar, int i11) {
        this.f2922e = str;
        this.f2923f = str2;
        this.f2919b = z11;
        this.f2924t = rVar;
        this.f2920c = aVar;
        this.f2921d = i11;
    }

    public /* synthetic */ q(String str, boolean z11, e2.l lVar, Resources resources, fz.c cVar, int i11) {
        this.f2922e = str;
        this.f2919b = z11;
        this.f2920c = lVar;
        this.f2924t = resources;
        this.f2923f = cVar;
        this.f2921d = i11;
    }

    public /* synthetic */ q(Map map, boolean z11, fz.c cVar, fz.c cVar2, z1.r rVar, int i11) {
        this.f2922e = map;
        this.f2919b = z11;
        this.f2923f = cVar;
        this.f2924t = cVar2;
        this.f2920c = rVar;
        this.f2921d = i11;
    }

    public /* synthetic */ q(boolean z11, fz.a aVar, fz.a aVar2, fz.a aVar3, fz.c cVar, int i11) {
        this.f2919b = z11;
        this.f2920c = aVar;
        this.f2922e = aVar2;
        this.f2924t = aVar3;
        this.f2923f = cVar;
        this.f2921d = i11;
    }
}
