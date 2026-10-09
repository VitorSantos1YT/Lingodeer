package ah;

import android.content.Context;
import au.c1;
import au.e1;
import au.f0;
import au.f1;
import au.g1;
import au.j1;
import au.o0;
import au.q0;
import au.t0;
import au.z0;
import bh.a1;
import bh.s1;
import bh.t;
import com.google.api.Service;
import com.lingo.lingoskill.object.AckDao;
import com.lingo.lingoskill.object.LessonDao;
import com.lingo.lingoskill.object.LevelDao;
import com.lingo.lingoskill.object.PhraseDao;
import com.lingo.lingoskill.object.SentenceDao;
import com.lingo.lingoskill.object.UnitDao;
import com.lingo.lingoskill.object.WordDao;
import com.lingodeer.data.env.Env;
import com.lingodeer.database.UserDataDatabase;
import dv.l;
import dv.u0;
import fr.c0;
import fr.e0;
import fr.i3;
import fr.n3;
import fr.p3;
import fr.r;
import fr.v1;
import fr.x;
import fr.x0;
import fr.x4;
import gq.k;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import vt.b1;
import vt.d0;
import vt.d1;
import vt.h1;
import vt.k0;
import vt.l0;
import vt.m0;
import vt.n0;
import vt.p0;
import vt.r0;
import vt.v0;
import vt.w0;
import wt.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f713a;

    public /* synthetic */ f(int i11) {
        this.f713a = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f713a) {
            case 0:
                e20.a factory = (e20.a) obj;
                a20.a it = (a20.a) obj2;
                m.f(factory, "$this$factory");
                m.f(it, "it");
                return new fv.c();
            case 1:
                e20.a aVar = (e20.a) obj;
                return new av.c();
            case 2:
                e20.a aVar2 = (e20.a) obj;
                return new l((n0) aVar2.a(null, null, defpackage.e.u(aVar2, "$this$single", (a20.a) obj2, "it", n0.class)));
            case 3:
                e20.a aVar3 = (e20.a) obj;
                Object objA = aVar3.a(null, null, defpackage.e.u(aVar3, "$this$factory", (a20.a) obj2, "it", h1.class));
                Object objA2 = aVar3.a(null, null, z.a(b0.class));
                Object objA3 = aVar3.a(null, null, z.a(k0.class));
                Object objA4 = aVar3.a(null, null, z.a(vt.c.class));
                Object objA5 = aVar3.a(null, null, z.a(n0.class));
                Object objA6 = aVar3.a(null, null, z.a(wt.m.class));
                return new fr.i((h1) objA, (b0) objA2, (k0) objA3, (vt.c) objA4, (n0) objA5, (wt.m) objA6, (gu.a) aVar3.a(null, null, z.a(gu.a.class)), (Context) aVar3.a(null, null, z.a(Context.class)));
            case 4:
                e20.a aVar4 = (e20.a) obj;
                Object objA7 = aVar4.a(null, null, defpackage.e.u(aVar4, "$this$factory", (a20.a) obj2, "it", Context.class));
                Object objA8 = aVar4.a(null, null, z.a(LevelDao.class));
                Object objA9 = aVar4.a(null, null, z.a(UnitDao.class));
                Object objA10 = aVar4.a(null, null, z.a(LessonDao.class));
                Object objA11 = aVar4.a(null, null, z.a(WordDao.class));
                Object objA12 = aVar4.a(null, null, z.a(SentenceDao.class));
                Object objA13 = aVar4.a(null, null, z.a(PhraseDao.class));
                Object objA14 = aVar4.a(null, null, z.a(AckDao.class));
                Object objA15 = aVar4.a(null, null, z.a(n0.class));
                return new t((Context) objA7, (LevelDao) objA8, (UnitDao) objA9, (LessonDao) objA10, (WordDao) objA11, (SentenceDao) objA12, (PhraseDao) objA13, (AckDao) objA14, (n0) objA15, (dh.a) aVar4.a(null, null, z.a(dh.a.class)), (d0) aVar4.a(null, null, z.a(d0.class)));
            case 5:
                e20.a aVar5 = (e20.a) obj;
                Object objA16 = aVar5.a(null, null, defpackage.e.u(aVar5, "$this$factory", (a20.a) obj2, "it", WordDao.class));
                Object objA17 = aVar5.a(null, null, z.a(SentenceDao.class));
                return new s1((WordDao) objA16, (SentenceDao) objA17, (n0) aVar5.a(null, null, z.a(n0.class)), (d0) aVar5.a(null, null, z.a(d0.class)));
            case 6:
                e20.a aVar6 = (e20.a) obj;
                return new n3((z0) aVar6.a(null, null, defpackage.e.u(aVar6, "$this$factory", (a20.a) obj2, "it", z0.class)));
            case 7:
                e20.a aVar7 = (e20.a) obj;
                return new r((au.i) aVar7.a(null, null, defpackage.e.u(aVar7, "$this$factory", (a20.a) obj2, "it", au.i.class)));
            case 8:
                e20.a aVar8 = (e20.a) obj;
                Object objA18 = aVar8.a(null, null, defpackage.e.u(aVar8, "$this$factory", (a20.a) obj2, "it", UserDataDatabase.class));
                return new vt.r((UserDataDatabase) objA18, (au.i) aVar8.a(null, null, z.a(au.i.class)), (au.m) aVar8.a(null, null, z.a(au.m.class)));
            case 9:
                e20.a aVar9 = (e20.a) obj;
                return new x0((o0) aVar9.a(null, null, defpackage.e.u(aVar9, "$this$factory", (a20.a) obj2, "it", o0.class)));
            case 10:
                e20.a aVar10 = (e20.a) obj;
                return new u0((Context) aVar10.a(null, null, z.a(Context.class)), (n0) aVar10.a(null, null, defpackage.e.u(aVar10, "$this$factory", (a20.a) obj2, "it", n0.class)));
            case 11:
                e20.a aVar11 = (e20.a) obj;
                return new fr.o0((Context) aVar11.a(null, null, z.a(Context.class)), (Env) aVar11.a(null, null, defpackage.e.u(aVar11, "$this$single", (a20.a) obj2, "it", Env.class)));
            case 12:
                e20.a aVar12 = (e20.a) obj;
                Object objA19 = aVar12.a(null, null, defpackage.e.u(aVar12, "$this$single", (a20.a) obj2, "it", n0.class));
                Object objA20 = aVar12.a(null, null, z.a(h1.class));
                Object objA21 = aVar12.a(null, null, z.a(vt.c.class));
                return new v1((n0) objA19, (h1) objA20, (vt.c) objA21, (u0) aVar12.a(null, null, z.a(u0.class)), (vt.a) aVar12.a(null, null, z.a(vt.a.class)));
            case 13:
                e20.a aVar13 = (e20.a) obj;
                Object objA22 = aVar13.a(null, null, defpackage.e.u(aVar13, "$this$single", (a20.a) obj2, "it", t0.class));
                Object objA23 = aVar13.a(null, null, z.a(f1.class));
                return new a1((t0) objA22, (f1) objA23, (n0) aVar13.a(null, null, z.a(n0.class)), (au.u0) aVar13.a(null, null, z.a(au.u0.class)));
            case 14:
                e20.a aVar14 = (e20.a) obj;
                return new x((e1) aVar14.a(null, null, defpackage.e.u(aVar14, "$this$single", (a20.a) obj2, "it", e1.class)), (UserDataDatabase) aVar14.a(null, null, z.a(UserDataDatabase.class)));
            case 15:
                e20.a aVar15 = (e20.a) obj;
                Object objA24 = aVar15.a(null, null, defpackage.e.u(aVar15, "$this$single", (a20.a) obj2, "it", n0.class));
                Object objA25 = aVar15.a(null, null, z.a(h1.class));
                Object objA26 = aVar15.a(null, null, z.a(vt.c.class));
                Object objA27 = aVar15.a(null, null, z.a(k0.class));
                Object objA28 = aVar15.a(null, null, z.a(v0.class));
                Object objA29 = aVar15.a(null, null, z.a(l0.class));
                Object objA30 = aVar15.a(null, null, z.a(m0.class));
                Object objA31 = aVar15.a(null, null, z.a(w0.class));
                Object objA32 = aVar15.a(null, null, z.a(r0.class));
                Object objA33 = aVar15.a(null, null, z.a(vt.e.class));
                Object objA34 = aVar15.a(null, null, z.a(vt.h.class));
                Object objA35 = aVar15.a(null, null, z.a(p0.class));
                Object objA36 = aVar15.a(null, null, z.a(u0.class));
                return new i3((n0) objA24, (h1) objA25, (vt.c) objA26, (k0) objA27, (v0) objA28, (l0) objA29, (m0) objA30, (w0) objA31, (r0) objA32, (vt.e) objA33, (vt.h) objA34, (p0) objA35, (u0) objA36, (wt.a) aVar15.a(null, null, z.a(wt.a.class)), (b1) aVar15.a(null, null, z.a(b1.class)));
            case 16:
                e20.a aVar16 = (e20.a) obj;
                return new fr.z0((q0) aVar16.a(null, null, defpackage.e.u(aVar16, "$this$single", (a20.a) obj2, "it", q0.class)));
            case 17:
                e20.a aVar17 = (e20.a) obj;
                Object objA37 = aVar17.a(null, null, defpackage.e.u(aVar17, "$this$single", (a20.a) obj2, "it", g1.class));
                return new p3(0);
            case 18:
                e20.a aVar18 = (e20.a) obj;
                Object objA38 = aVar18.a(null, null, defpackage.e.u(aVar18, "$this$single", (a20.a) obj2, "it", UserDataDatabase.class));
                Object objA39 = aVar18.a(null, null, z.a(vt.c.class));
                Object objA40 = aVar18.a(null, null, z.a(k0.class));
                Object objA41 = aVar18.a(null, null, z.a(n0.class));
                Object objA42 = aVar18.a(null, null, z.a(u0.class));
                return new x4((UserDataDatabase) objA38, (vt.c) objA39, (k0) objA40, (n0) objA41, (u0) objA42, (ur.a) aVar18.a(null, null, z.a(ur.a.class)), (k) aVar18.a(null, null, z.a(k.class)));
            case 19:
                e20.a aVar19 = (e20.a) obj;
                return new c0((f0) aVar19.a(null, null, defpackage.e.u(aVar19, "$this$single", (a20.a) obj2, "it", f0.class)), (au.k0) aVar19.a(null, null, z.a(au.k0.class)));
            case 20:
                e20.a aVar20 = (e20.a) obj;
                return new e0((au.l0) aVar20.a(null, null, defpackage.e.u(aVar20, "$this$single", (a20.a) obj2, "it", au.l0.class)));
            case 21:
                e20.a aVar21 = (e20.a) obj;
                Object objA43 = aVar21.a(null, null, defpackage.e.u(aVar21, "$this$single", (a20.a) obj2, "it", m0.class));
                return new gu.f((m0) objA43, (h1) aVar21.a(null, null, z.a(h1.class)), (n0) aVar21.a(null, null, z.a(n0.class)));
            case 22:
                e20.a aVar22 = (e20.a) obj;
                return new d1((e1) aVar22.a(null, null, defpackage.e.u(aVar22, "$this$single", (a20.a) obj2, "it", e1.class)));
            case 23:
                e20.a aVar23 = (e20.a) obj;
                return new vt.f0((au.t) aVar23.a(null, null, defpackage.e.u(aVar23, "$this$single", (a20.a) obj2, "it", au.t.class)));
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                e20.a aVar24 = (e20.a) obj;
                return new fr.k((n0) aVar24.a(null, null, defpackage.e.u(aVar24, "$this$single", (a20.a) obj2, "it", n0.class)));
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                e20.a single = (e20.a) obj;
                a20.a it2 = (a20.a) obj2;
                m.f(single, "$this$single");
                m.f(it2, "it");
                return new vt.d();
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                e20.a single2 = (e20.a) obj;
                a20.a it3 = (a20.a) obj2;
                m.f(single2, "$this$single");
                m.f(it3, "it");
                return new k();
            case 27:
                e20.a aVar25 = (e20.a) obj;
                return new fh.e((gh.e) aVar25.a(null, null, defpackage.e.u(aVar25, "$this$single", (a20.a) obj2, "it", gh.e.class)));
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                e20.a aVar26 = (e20.a) obj;
                Object objA44 = aVar26.a(null, null, defpackage.e.u(aVar26, "$this$single", (a20.a) obj2, "it", n0.class));
                Object objA45 = aVar26.a(null, null, z.a(j1.class));
                Object objA46 = aVar26.a(null, null, z.a(t0.class));
                Object objA47 = aVar26.a(null, null, z.a(f0.class));
                Object objA48 = aVar26.a(null, null, z.a(au.l0.class));
                Object objA49 = aVar26.a(null, null, z.a(au.r0.class));
                Object objA50 = aVar26.a(null, null, z.a(z0.class));
                return new dr.f((n0) objA44, (j1) objA45, (t0) objA46, (f0) objA47, (au.l0) objA48, (au.r0) objA49, (z0) objA50, (au.i) aVar26.a(null, null, z.a(au.i.class)), (f1) aVar26.a(null, null, z.a(f1.class)));
            default:
                e20.a aVar27 = (e20.a) obj;
                Object objA51 = aVar27.a(null, null, defpackage.e.u(aVar27, "$this$single", (a20.a) obj2, "it", z0.class));
                Object objA52 = aVar27.a(null, null, z.a(c1.class));
                return new dr.k((z0) objA51, (c1) objA52, (n0) aVar27.a(null, null, z.a(n0.class)), (Context) aVar27.a(null, null, z.a(Context.class)));
        }
    }
}
