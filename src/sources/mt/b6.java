package mt;

import com.google.api.Service;
import com.lingodeer.data.model.CourseWord;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.List;
import rt.bb;
import rt.dd;
import rt.jd;
import rt.l9;
import rt.m8;
import rt.ma;
import rt.mb;
import rt.mf;
import rt.qd;
import rt.sd;
import rt.tf;
import rt.ud;
import rt.x6;
import rt.y8;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b6 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41289a;

    public /* synthetic */ b6(int i11) {
        this.f41289a = i11;
    }

    /* JADX WARN: Type inference failed for: r2v89, types: [java.lang.Object, java.util.Collection] */
    @Override // fz.c
    public final Object invoke(Object it) {
        int i11 = this.f41289a;
        qy.b0 b0Var = qy.b0.f48488a;
        int i12 = 6;
        int i13 = 0;
        switch (i11) {
            case 0:
                y8 it2 = (y8) it;
                kotlin.jvm.internal.m.f(it2, "it");
                return ry.m.g0(it2.f50700j);
            case 1:
                y8 it3 = (y8) it;
                kotlin.jvm.internal.m.f(it3, "it");
                return Boolean.valueOf(it3.f50699i);
            case 2:
                y8 unit = (y8) it;
                kotlin.jvm.internal.m.f(unit, "unit");
                return ry.m.g0(unit.f50700j);
            case 3:
                rt.k6 it4 = (rt.k6) it;
                kotlin.jvm.internal.m.f(it4, "it");
                return Boolean.valueOf(it4.f49970a);
            case 4:
                ud it5 = (ud) it;
                kotlin.jvm.internal.m.f(it5, "it");
                return it5.f50502a;
            case 5:
                throw com.google.android.material.datepicker.d.h(it);
            case 6:
                mh.i it6 = (mh.i) it;
                kotlin.jvm.internal.m.f(it6, "it");
                return Long.valueOf(it6.f41135a);
            case 7:
                mh.i it7 = (mh.i) it;
                kotlin.jvm.internal.m.f(it7, "it");
                return Long.valueOf(it7.f41135a);
            case 8:
                mh.i lesson = (mh.i) it;
                kotlin.jvm.internal.m.f(lesson, "lesson");
                return Long.valueOf(lesson.f41135a);
            case 9:
                pq.a it8 = (pq.a) it;
                kotlin.jvm.internal.m.f(it8, "it");
                String str = it8.f46983a;
                kotlin.jvm.internal.m.e(str, "getSyllable(...)");
                return str;
            case 10:
                kotlin.jvm.internal.m.f((pq.a) it, "it");
                return BuildConfig.VERSION_NAME;
            case 11:
                kotlin.jvm.internal.m.f((pq.a) it, "it");
                return BuildConfig.VERSION_NAME;
            case 12:
                CourseWord it9 = (CourseWord) it;
                kotlin.jvm.internal.m.f(it9, "it");
                return it9.getWord();
            case 13:
                CourseWord it10 = (CourseWord) it;
                kotlin.jvm.internal.m.f(it10, "it");
                String word = it10.getWord();
                String str2 = word.length() > 0 ? word : null;
                return str2 != null ? str2 : it10.getZhuYin();
            case 14:
                a0.y composable = (a0.y) it;
                kotlin.jvm.internal.m.f(composable, "$this$composable");
                return a0.y.e(composable, b0.e.r(400, 0, null, 6));
            case 15:
                a0.y composable2 = (a0.y) it;
                kotlin.jvm.internal.m.f(composable2, "$this$composable");
                return a0.y.f(composable2, b0.e.r(400, 0, null, 6));
            case 16:
                a0.y composable3 = (a0.y) it;
                kotlin.jvm.internal.m.f(composable3, "$this$composable");
                return a0.y.e(composable3, b0.e.r(400, 0, null, 6));
            case 17:
                a0.y composable4 = (a0.y) it;
                kotlin.jvm.internal.m.f(composable4, "$this$composable");
                return a0.y.f(composable4, b0.e.r(400, 0, null, 6));
            case 18:
                Iterable it11 = (Iterable) it;
                kotlin.jvm.internal.m.f(it11, "it");
                return it11.iterator();
            case 19:
                kotlin.jvm.internal.m.f(it, "it");
                return Integer.valueOf(jz.e.f37398b.d(2147418112) + 65536);
            case 20:
                return Boolean.valueOf(it == null);
            case 21:
                List list = (List) it;
                Object obj = list.get(0);
                kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj).intValue();
                Object obj2 = list.get(1);
                kotlin.jvm.internal.m.d(obj2, "null cannot be cast to non-null type kotlin.Float");
                return new o0.b(iIntValue, ((Float) obj2).floatValue(), new c00.f(6, list));
            case 22:
                kotlin.jvm.internal.m.d(it, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list2 = (List) it;
                Object obj3 = list2.get(0);
                qp.o2 o2Var = j3.o0.f35728a;
                Boolean bool = Boolean.FALSE;
                j3.h hVar = (kotlin.jvm.internal.m.a(obj3, bool) || obj3 == null) ? null : (j3.h) ((fz.c) o2Var.f48096c).invoke(obj3);
                kotlin.jvm.internal.m.c(hVar);
                Object obj4 = list2.get(1);
                int i14 = j3.x0.f35822c;
                j3.x0 x0Var = (kotlin.jvm.internal.m.a(obj4, bool) || obj4 == null) ? null : (j3.x0) ((fz.c) j3.o0.f35742p.f48096c).invoke(obj4);
                kotlin.jvm.internal.m.c(x0Var);
                return new o3.w(hVar, x0Var.f35823a, (j3.x0) null);
            case 23:
                x10.a module = (x10.a) it;
                kotlin.jvm.internal.m.f(module, "$this$module");
                int i15 = 27;
                ah.h hVar2 = new ah.h(i15);
                u10.b bVar = u10.b.Singleton;
                kotlin.jvm.internal.e eVarA = kotlin.jvm.internal.z.a(ns.l.class);
                b20.b bVar2 = c20.b.f6511e;
                md.a.s(new u10.c(module, defpackage.e.x(new u10.a(bVar2, eVarA, hVar2, bVar), module)), null);
                md.a.s(new u10.c(module, defpackage.e.x(new u10.a(bVar2, kotlin.jvm.internal.z.a(ns.t0.class), new ah.h(28), bVar), module)), null);
                int i16 = 24;
                b6 b6Var = new b6(i16);
                ah.h hVar3 = new ah.h(17);
                u10.b bVar3 = u10.b.Factory;
                md.a.s(new u10.c(module, defpackage.e.w(new u10.a(bVar2, kotlin.jvm.internal.z.a(rs.f.class), hVar3, bVar3), module)), b6Var);
                md.a.s(new u10.c(module, defpackage.e.w(new u10.a(bVar2, kotlin.jvm.internal.z.a(ot.e0.class), new ah.h(18), bVar3), module)), null);
                md.a.s(new u10.c(module, defpackage.e.w(new u10.a(bVar2, kotlin.jvm.internal.z.a(ot.o1.class), new ah.h(19), bVar3), module)), null);
                md.a.s(new u10.c(module, defpackage.e.w(new u10.a(bVar2, kotlin.jvm.internal.z.a(ot.z.class), new ah.h(20), bVar3), module)), null);
                md.a.s(new u10.c(module, defpackage.e.w(new u10.a(bVar2, kotlin.jvm.internal.z.a(ot.s1.class), new ah.h(21), bVar3), module)), null);
                int i17 = 22;
                md.a.s(new u10.c(module, defpackage.e.w(new u10.a(bVar2, kotlin.jvm.internal.z.a(x6.class), new ah.h(i17), bVar3), module)), null);
                int i18 = 23;
                md.a.s(new u10.c(module, defpackage.e.w(new u10.a(bVar2, kotlin.jvm.internal.z.a(rt.g6.class), new ah.h(i18), bVar3), module)), null);
                module.a(new v10.a(new u10.a(bVar2, kotlin.jvm.internal.z.a(rt.o4.class), new os.a(5), bVar3)));
                md.a.s(new u10.c(module, defpackage.e.w(new u10.a(bVar2, kotlin.jvm.internal.z.a(ot.i0.class), new ah.h(i16), bVar3), module)), null);
                int i19 = 25;
                md.a.s(new u10.c(module, defpackage.e.w(new u10.a(bVar2, kotlin.jvm.internal.z.a(ot.u2.class), new ah.h(i19), bVar3), module)), null);
                module.a(new v10.a(new u10.a(bVar2, kotlin.jvm.internal.z.a(ot.o2.class), new os.a(i12), bVar3)));
                int i21 = 26;
                md.a.s(new u10.c(module, defpackage.e.w(new u10.a(bVar2, kotlin.jvm.internal.z.a(ot.l2.class), new ah.h(i21), bVar3), module)), null);
                module.a(new v10.a(new u10.a(bVar2, kotlin.jvm.internal.z.a(rt.l4.class), new nv.c(i17), bVar3)));
                module.a(new v10.a(new u10.a(bVar2, kotlin.jvm.internal.z.a(dd.class), new nv.c(i18), bVar3)));
                module.a(new v10.a(new u10.a(bVar2, kotlin.jvm.internal.z.a(rt.e3.class), new nv.c(i16), bVar3)));
                module.a(new v10.a(new u10.a(bVar2, kotlin.jvm.internal.z.a(bb.class), new nv.c(i19), bVar3)));
                module.a(new v10.a(new u10.a(bVar2, kotlin.jvm.internal.z.a(ma.class), new nv.c(i21), bVar3)));
                module.a(new v10.a(new u10.a(bVar2, kotlin.jvm.internal.z.a(mb.class), new nv.c(i15), bVar3)));
                md.a.s(new u10.c(module, defpackage.e.w(new u10.a(bVar2, kotlin.jvm.internal.z.a(sd.class), new os.b(i13), bVar3), module)), null);
                md.a.s(new u10.c(module, defpackage.e.w(new u10.a(bVar2, kotlin.jvm.internal.z.a(l9.class), new os.b(1), bVar3), module)), null);
                int i22 = 2;
                md.a.s(new u10.c(module, defpackage.e.w(new u10.a(bVar2, kotlin.jvm.internal.z.a(rt.z5.class), new os.b(i22), bVar3), module)), null);
                module.a(new v10.a(new u10.a(bVar2, kotlin.jvm.internal.z.a(rt.r5.class), new nv.c(28), bVar3)));
                int i23 = 29;
                module.a(new v10.a(new u10.a(bVar2, kotlin.jvm.internal.z.a(qd.class), new nv.c(i23), bVar3)));
                module.a(new v10.a(new u10.a(bVar2, kotlin.jvm.internal.z.a(m8.class), new os.a(i13), bVar3)));
                module.a(new v10.a(new u10.a(bVar2, kotlin.jvm.internal.z.a(rt.e0.class), new os.a(1), bVar3)));
                int i24 = 3;
                md.a.s(new u10.c(module, defpackage.e.w(new u10.a(bVar2, kotlin.jvm.internal.z.a(rt.y.class), new os.b(i24), bVar3), module)), null);
                int i25 = 4;
                md.a.s(new u10.c(module, defpackage.e.w(new u10.a(bVar2, kotlin.jvm.internal.z.a(rt.j2.class), new os.b(i25), bVar3), module)), null);
                md.a.s(new u10.c(module, defpackage.e.w(new u10.a(bVar2, kotlin.jvm.internal.z.a(rt.a2.class), new os.b(5), bVar3), module)), null);
                md.a.s(new u10.c(module, defpackage.e.w(new u10.a(bVar2, kotlin.jvm.internal.z.a(rt.z0.class), new os.b(6), bVar3), module)), null);
                module.a(new v10.a(new u10.a(bVar2, kotlin.jvm.internal.z.a(rt.b4.class), new os.a(i22), bVar3)));
                md.a.s(new u10.c(module, defpackage.e.w(new u10.a(bVar2, kotlin.jvm.internal.z.a(tf.class), new os.b(7), bVar3), module)), null);
                module.a(new v10.a(new u10.a(bVar2, kotlin.jvm.internal.z.a(jd.class), new os.a(i24), bVar3)));
                module.a(new v10.a(new u10.a(bVar2, kotlin.jvm.internal.z.a(rt.b1.class), new os.a(i25), bVar3)));
                md.a.s(new u10.c(module, defpackage.e.w(new u10.a(bVar2, kotlin.jvm.internal.z.a(zs.f.class), new os.b(8), bVar3), module)), null);
                md.a.s(new u10.c(module, defpackage.e.w(new u10.a(bVar2, kotlin.jvm.internal.z.a(mf.class), new ah.h(i23), bVar3), module)), null);
                return b0Var;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                u10.a factoryOf = (u10.a) it;
                kotlin.jvm.internal.m.f(factoryOf, "$this$factoryOf");
                factoryOf.f52730e = ry.m.G0(kotlin.jvm.internal.z.a(vt.j0.class), factoryOf.f52730e);
                return b0Var;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return (String) ((qy.l) it).f48496b;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                ot.p2 it12 = (ot.p2) it;
                kotlin.jvm.internal.m.f(it12, "it");
                return Integer.valueOf(it12.f45946b);
            case 27:
                ot.p2 it13 = (ot.p2) it;
                kotlin.jvm.internal.m.f(it13, "it");
                return Integer.valueOf(it13.f45947c);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                ot.i2 it14 = (ot.i2) it;
                kotlin.jvm.internal.m.f(it14, "it");
                return Boolean.valueOf(it14.f45857d);
            default:
                ot.i2 it15 = (ot.i2) it;
                kotlin.jvm.internal.m.f(it15, "it");
                return it15.f45854a;
        }
    }

    public /* synthetic */ b6(v3.e eVar) {
        this.f41289a = 5;
    }
}
