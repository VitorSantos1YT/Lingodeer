package j3;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.api.Service;
import fr.j3;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import qp.o2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i0 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35706a;

    public /* synthetic */ i0(int i11) {
        this.f35706a = i11;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        g2.x xVar;
        g2.x xVar2;
        int i11 = 0;
        qVar = null;
        q qVar = null;
        v0Var = null;
        g2.v0 v0Var = null;
        sVar = null;
        u3.s sVar = null;
        uVar = null;
        u uVar = null;
        vVar = null;
        v vVar = null;
        a1Var = null;
        a1 a1Var = null;
        b1Var = null;
        b1 b1Var = null;
        p0Var = null;
        p0 p0Var = null;
        c0Var = null;
        c0 c0Var = null;
        switch (this.f35706a) {
            case 0:
                kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new u3.m(((Integer) obj).intValue());
            case 1:
                kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new u3.d(((Integer) obj).intValue());
            case 2:
                kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                while (i11 < size) {
                    Object obj2 = list.get(i11);
                    f fVar = (kotlin.jvm.internal.m.a(obj2, Boolean.FALSE) || obj2 == null) ? null : (f) ((fz.c) o0.f35730c.f48096c).invoke(obj2);
                    kotlin.jvm.internal.m.c(fVar);
                    arrayList.add(fVar);
                    i11++;
                }
                return arrayList;
            case 3:
                kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new n3.o(((Integer) obj).intValue());
            case 4:
                kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new n3.p(((Integer) obj).intValue());
            case 5:
                Boolean bool = Boolean.FALSE;
                if (kotlin.jvm.internal.m.a(obj, bool)) {
                    return new v3.o(v3.o.f53501c);
                }
                kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list2 = (List) obj;
                Object obj3 = list2.get(0);
                Float f5 = obj3 != null ? (Float) obj3 : null;
                kotlin.jvm.internal.m.c(f5);
                float fFloatValue = f5.floatValue();
                Object obj4 = list2.get(1);
                m0 m0Var = o0.f35751y;
                kotlin.jvm.internal.m.a(obj4, bool);
                v3.p pVar = obj4 != null ? (v3.p) m0Var.f35722b.invoke(obj4) : null;
                kotlin.jvm.internal.m.c(pVar);
                return new v3.o(j3.L(pVar.f53503a, fFloatValue));
            case 6:
                if (kotlin.jvm.internal.m.a(obj, 0)) {
                    return new v3.p(8589934592L);
                }
                return kotlin.jvm.internal.m.a(obj, 1) ? new v3.p(4294967296L) : new v3.p(0L);
            case 7:
                if (kotlin.jvm.internal.m.a(obj, Boolean.FALSE)) {
                    return new f2.b(9205357640488583168L);
                }
                kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list3 = (List) obj;
                Object obj5 = list3.get(0);
                Float f11 = obj5 != null ? (Float) obj5 : null;
                kotlin.jvm.internal.m.c(f11);
                float fFloatValue2 = f11.floatValue();
                Object obj6 = list3.get(1);
                Float f12 = obj6 != null ? (Float) obj6 : null;
                kotlin.jvm.internal.m.c(f12);
                return new f2.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f12.floatValue())) & 4294967295L));
            case 8:
                kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list4 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list4.size());
                int size2 = list4.size();
                while (i11 < size2) {
                    Object obj7 = list4.get(i11);
                    q3.a aVar = (kotlin.jvm.internal.m.a(obj7, Boolean.FALSE) || obj7 == null) ? null : (q3.a) ((fz.c) o0.B.f48096c).invoke(obj7);
                    kotlin.jvm.internal.m.c(aVar);
                    arrayList2.add(aVar);
                    i11++;
                }
                return new q3.b(arrayList2);
            case 9:
                kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type kotlin.String");
                return new q3.a((String) obj);
            case 10:
                kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                String str = obj8 != null ? (String) obj8 : null;
                kotlin.jvm.internal.m.c(str);
                Object obj9 = list5.get(1);
                return new u(str, (kotlin.jvm.internal.m.a(obj9, Boolean.FALSE) || obj9 == null) ? null : (v0) ((fz.c) o0.f35737j.f48096c).invoke(obj9), null);
            case 11:
                kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                float f13 = u3.f.f52740b;
                m0 m0Var2 = o0.D;
                Boolean bool2 = Boolean.FALSE;
                kotlin.jvm.internal.m.a(obj10, bool2);
                u3.f fVar2 = obj10 != null ? (u3.f) m0Var2.f35722b.invoke(obj10) : null;
                kotlin.jvm.internal.m.c(fVar2);
                float f14 = fVar2.f52743a;
                Object obj11 = list6.get(1);
                m0 m0Var3 = o0.E;
                kotlin.jvm.internal.m.a(obj11, bool2);
                u3.h hVar = obj11 != null ? (u3.h) m0Var3.f35722b.invoke(obj11) : null;
                kotlin.jvm.internal.m.c(hVar);
                int i12 = hVar.f52745a;
                Object obj12 = list6.get(2);
                m0 m0Var4 = o0.F;
                kotlin.jvm.internal.m.a(obj12, bool2);
                u3.g gVar = obj12 != null ? (u3.g) m0Var4.f35722b.invoke(obj12) : null;
                kotlin.jvm.internal.m.c(gVar);
                return new u3.i(i12, f14, gVar.f52744a);
            case 12:
                kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue3 = ((Float) obj).floatValue();
                u3.f.a(fFloatValue3);
                return new u3.f(fFloatValue3);
            case 13:
                kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new u3.h(((Integer) obj).intValue());
            case 14:
                kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list7 = (List) obj;
                Object obj13 = list7.get(0);
                l lVar = obj13 != null ? (l) obj13 : null;
                kotlin.jvm.internal.m.c(lVar);
                Object obj14 = list7.get(2);
                Integer num = obj14 != null ? (Integer) obj14 : null;
                kotlin.jvm.internal.m.c(num);
                int iIntValue = num.intValue();
                Object obj15 = list7.get(3);
                Integer num2 = obj15 != null ? (Integer) obj15 : null;
                kotlin.jvm.internal.m.c(num2);
                int iIntValue2 = num2.intValue();
                Object obj16 = list7.get(4);
                String str2 = obj16 != null ? (String) obj16 : null;
                kotlin.jvm.internal.m.c(str2);
                switch (n0.f35726a[lVar.ordinal()]) {
                    case 1:
                        Object obj17 = list7.get(1);
                        o2 o2Var = o0.f35735h;
                        if (!kotlin.jvm.internal.m.a(obj17, Boolean.FALSE) && obj17 != null) {
                            c0Var = (c0) ((fz.c) o2Var.f48096c).invoke(obj17);
                        }
                        kotlin.jvm.internal.m.c(c0Var);
                        return new f(iIntValue, iIntValue2, c0Var, str2);
                    case 2:
                        Object obj18 = list7.get(1);
                        o2 o2Var2 = o0.f35736i;
                        if (!kotlin.jvm.internal.m.a(obj18, Boolean.FALSE) && obj18 != null) {
                            p0Var = (p0) ((fz.c) o2Var2.f48096c).invoke(obj18);
                        }
                        kotlin.jvm.internal.m.c(p0Var);
                        return new f(iIntValue, iIntValue2, p0Var, str2);
                    case 3:
                        Object obj19 = list7.get(1);
                        o2 o2Var3 = o0.f35731d;
                        if (!kotlin.jvm.internal.m.a(obj19, Boolean.FALSE) && obj19 != null) {
                            b1Var = (b1) ((fz.c) o2Var3.f48096c).invoke(obj19);
                        }
                        kotlin.jvm.internal.m.c(b1Var);
                        return new f(iIntValue, iIntValue2, b1Var, str2);
                    case 4:
                        Object obj20 = list7.get(1);
                        o2 o2Var4 = o0.f35732e;
                        if (!kotlin.jvm.internal.m.a(obj20, Boolean.FALSE) && obj20 != null) {
                            a1Var = (a1) ((fz.c) o2Var4.f48096c).invoke(obj20);
                        }
                        kotlin.jvm.internal.m.c(a1Var);
                        return new f(iIntValue, iIntValue2, a1Var, str2);
                    case 5:
                        Object obj21 = list7.get(1);
                        o2 o2Var5 = o0.f35733f;
                        if (!kotlin.jvm.internal.m.a(obj21, Boolean.FALSE) && obj21 != null) {
                            vVar = (v) ((fz.c) o2Var5.f48096c).invoke(obj21);
                        }
                        kotlin.jvm.internal.m.c(vVar);
                        return new f(iIntValue, iIntValue2, vVar, str2);
                    case 6:
                        Object obj22 = list7.get(1);
                        o2 o2Var6 = o0.f35734g;
                        if (!kotlin.jvm.internal.m.a(obj22, Boolean.FALSE) && obj22 != null) {
                            uVar = (u) ((fz.c) o2Var6.f48096c).invoke(obj22);
                        }
                        kotlin.jvm.internal.m.c(uVar);
                        return new f(iIntValue, iIntValue2, uVar, str2);
                    case 7:
                        Object obj23 = list7.get(1);
                        String str3 = obj23 != null ? (String) obj23 : null;
                        kotlin.jvm.internal.m.c(str3);
                        return new f(iIntValue, iIntValue2, new r0(str3), str2);
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            case 15:
                kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new u3.g(((Integer) obj).intValue());
            case 16:
                String str4 = obj != null ? (String) obj : null;
                kotlin.jvm.internal.m.c(str4);
                return new b1(str4);
            case 17:
                String str5 = obj != null ? (String) obj : null;
                kotlin.jvm.internal.m.c(str5);
                return new a1(str5);
            case 18:
                kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list8 = (List) obj;
                Object obj24 = list8.get(0);
                m0 m0Var5 = o0.f35745s;
                Boolean bool3 = Boolean.FALSE;
                kotlin.jvm.internal.m.a(obj24, bool3);
                u3.k kVar = obj24 != null ? (u3.k) m0Var5.f35722b.invoke(obj24) : null;
                kotlin.jvm.internal.m.c(kVar);
                int i13 = kVar.f52750a;
                Object obj25 = list8.get(1);
                m0 m0Var6 = o0.f35746t;
                kotlin.jvm.internal.m.a(obj25, bool3);
                u3.m mVar = obj25 != null ? (u3.m) m0Var6.f35722b.invoke(obj25) : null;
                kotlin.jvm.internal.m.c(mVar);
                int i14 = mVar.f52755a;
                Object obj26 = list8.get(2);
                v3.p[] pVarArr = v3.o.f53500b;
                m0 m0Var7 = o0.f35750x;
                kotlin.jvm.internal.m.a(obj26, bool3);
                v3.o oVar = obj26 != null ? (v3.o) m0Var7.f35722b.invoke(obj26) : null;
                kotlin.jvm.internal.m.c(oVar);
                long j11 = oVar.f53502a;
                Object obj27 = list8.get(3);
                u3.q qVar2 = u3.q.f52760c;
                u3.q qVar3 = (kotlin.jvm.internal.m.a(obj27, bool3) || obj27 == null) ? null : (u3.q) ((fz.c) o0.m.f48096c).invoke(obj27);
                Object obj28 = list8.get(4);
                f0 f0Var = (kotlin.jvm.internal.m.a(obj28, bool3) || obj28 == null) ? null : (f0) ((fz.c) t.f35779b.f48096c).invoke(obj28);
                Object obj29 = list8.get(5);
                u3.i iVar = u3.i.f52746d;
                u3.i iVar2 = (kotlin.jvm.internal.m.a(obj29, bool3) || obj29 == null) ? null : (u3.i) ((fz.c) o0.C.f48096c).invoke(obj29);
                Object obj30 = list8.get(6);
                u3.e eVar = (kotlin.jvm.internal.m.a(obj30, bool3) || obj30 == null) ? null : (u3.e) ((fz.c) t.f35781d.f48096c).invoke(obj30);
                kotlin.jvm.internal.m.c(eVar);
                int i15 = eVar.f52739a;
                Object obj31 = list8.get(7);
                m0 m0Var8 = o0.f35747u;
                kotlin.jvm.internal.m.a(obj31, bool3);
                u3.d dVar = obj31 != null ? (u3.d) m0Var8.f35722b.invoke(obj31) : null;
                kotlin.jvm.internal.m.c(dVar);
                int i16 = dVar.f52737a;
                Object obj32 = list8.get(8);
                o2 o2Var7 = t.f35782e;
                if (!kotlin.jvm.internal.m.a(obj32, bool3) && obj32 != null) {
                    sVar = (u3.s) ((fz.c) o2Var7.f48096c).invoke(obj32);
                }
                return new c0(i13, i14, j11, qVar3, f0Var, iVar2, i15, i16, sVar);
            case 19:
                kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list9 = (List) obj;
                Object obj33 = list9.get(0);
                int i17 = g2.x.f28623j;
                Boolean bool4 = Boolean.FALSE;
                kotlin.jvm.internal.m.a(obj33, bool4);
                if (obj33 != null) {
                    xVar = obj33.equals(bool4) ? new g2.x(g2.x.f28622i) : new g2.x(g2.f0.c(((Integer) obj33).intValue()));
                } else {
                    xVar = null;
                }
                kotlin.jvm.internal.m.c(xVar);
                long j12 = xVar.f28624a;
                Object obj34 = list9.get(1);
                v3.p[] pVarArr2 = v3.o.f53500b;
                fz.c cVar = o0.f35750x.f35722b;
                kotlin.jvm.internal.m.a(obj34, bool4);
                v3.o oVar2 = obj34 != null ? (v3.o) cVar.invoke(obj34) : null;
                kotlin.jvm.internal.m.c(oVar2);
                long j13 = oVar2.f53502a;
                Object obj35 = list9.get(2);
                n3.s sVar2 = n3.s.f43173b;
                n3.s sVar3 = (kotlin.jvm.internal.m.a(obj35, bool4) || obj35 == null) ? null : (n3.s) ((fz.c) o0.f35740n.f48096c).invoke(obj35);
                Object obj36 = list9.get(3);
                n3.o oVar3 = (kotlin.jvm.internal.m.a(obj36, bool4) || obj36 == null) ? null : (n3.o) ((fz.c) o0.f35748v.f48096c).invoke(obj36);
                Object obj37 = list9.get(4);
                n3.p pVar2 = (kotlin.jvm.internal.m.a(obj37, bool4) || obj37 == null) ? null : (n3.p) ((fz.c) o0.f35749w.f48096c).invoke(obj37);
                Object obj38 = list9.get(6);
                String str6 = obj38 != null ? (String) obj38 : null;
                Object obj39 = list9.get(7);
                kotlin.jvm.internal.m.a(obj39, bool4);
                v3.o oVar4 = obj39 != null ? (v3.o) cVar.invoke(obj39) : null;
                kotlin.jvm.internal.m.c(oVar4);
                long j14 = oVar4.f53502a;
                Object obj40 = list9.get(8);
                u3.a aVar2 = (kotlin.jvm.internal.m.a(obj40, bool4) || obj40 == null) ? null : (u3.a) ((fz.c) o0.f35741o.f48096c).invoke(obj40);
                Object obj41 = list9.get(9);
                u3.p pVar3 = (kotlin.jvm.internal.m.a(obj41, bool4) || obj41 == null) ? null : (u3.p) ((fz.c) o0.f35739l.f48096c).invoke(obj41);
                Object obj42 = list9.get(10);
                q3.b bVar = q3.b.f47418c;
                q3.b bVar2 = (kotlin.jvm.internal.m.a(obj42, bool4) || obj42 == null) ? null : (q3.b) ((fz.c) o0.A.f48096c).invoke(obj42);
                Object obj43 = list9.get(11);
                kotlin.jvm.internal.m.a(obj43, bool4);
                if (obj43 != null) {
                    xVar2 = obj43.equals(bool4) ? new g2.x(g2.x.f28622i) : new g2.x(g2.f0.c(((Integer) obj43).intValue()));
                } else {
                    xVar2 = null;
                }
                kotlin.jvm.internal.m.c(xVar2);
                long j15 = xVar2.f28624a;
                Object obj44 = list9.get(12);
                u3.l lVar2 = (kotlin.jvm.internal.m.a(obj44, bool4) || obj44 == null) ? null : (u3.l) ((fz.c) o0.f35738k.f48096c).invoke(obj44);
                Object obj45 = list9.get(13);
                g2.v0 v0Var2 = g2.v0.f28610d;
                o2 o2Var8 = o0.f35743q;
                if (!kotlin.jvm.internal.m.a(obj45, bool4) && obj45 != null) {
                    v0Var = (g2.v0) ((fz.c) o2Var8.f48096c).invoke(obj45);
                }
                return new p0(j12, j13, sVar3, oVar3, pVar2, (n3.i) null, str6, j14, aVar2, pVar3, bVar2, j15, lVar2, v0Var, 49184);
            case 20:
                kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list10 = (List) obj;
                Object obj46 = list10.get(0);
                Boolean bool5 = obj46 != null ? (Boolean) obj46 : null;
                kotlin.jvm.internal.m.c(bool5);
                boolean zBooleanValue = bool5.booleanValue();
                Object obj47 = list10.get(1);
                o2 o2Var9 = t.f35780c;
                if (!kotlin.jvm.internal.m.a(obj47, Boolean.FALSE) && obj47 != null) {
                    qVar = (q) ((fz.c) o2Var9.f48096c).invoke(obj47);
                }
                kotlin.jvm.internal.m.c(qVar);
                return new f0(qVar.f35769a, zBooleanValue);
            case 21:
                kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new q(((Integer) obj).intValue());
            case 22:
                kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new u3.e(((Integer) obj).intValue());
            case 23:
                kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list11 = (List) obj;
                Object obj48 = list11.get(0);
                u3.r rVar = (kotlin.jvm.internal.m.a(obj48, Boolean.FALSE) || obj48 == null) ? null : (u3.r) ((fz.c) t.f35783f.f48096c).invoke(obj48);
                kotlin.jvm.internal.m.c(rVar);
                int i18 = rVar.f52763a;
                Object obj49 = list11.get(1);
                Boolean bool6 = obj49 != null ? (Boolean) obj49 : null;
                kotlin.jvm.internal.m.c(bool6);
                return new u3.s(i18, bool6.booleanValue());
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new u3.r(((Integer) obj).intValue());
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                Context it = (Context) obj;
                kotlin.jvm.internal.m.f(it, "it");
                if (it instanceof ContextWrapper) {
                    return ((ContextWrapper) it).getBaseContext();
                }
                return null;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                Context it2 = (Context) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                if (it2 instanceof ContextWrapper) {
                    return ((ContextWrapper) it2).getBaseContext();
                }
                return null;
            case 27:
                CreationExtras initializer = (CreationExtras) obj;
                kotlin.jvm.internal.m.f(initializer, "$this$initializer");
                return new j9.j();
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                j9.q it3 = (j9.q) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                return it3.f36243c;
            default:
                j9.q it4 = (j9.q) obj;
                kotlin.jvm.internal.m.f(it4, "it");
                if (!(it4 instanceof j9.s)) {
                    return null;
                }
                a.a aVar3 = ((j9.s) it4).f36251f;
                return aVar3.v(aVar3.f5b);
        }
    }
}
