package j3;

import com.google.api.Service;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import h1.r4;
import h1.s1;
import h1.ua;
import h1.v1;
import java.util.ArrayList;
import java.util.List;
import org.koin.core.error.DefinitionParameterException;
import qp.o2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j0 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35711a;

    public /* synthetic */ j0(int i11) {
        this.f35711a = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) throws DefinitionParameterException {
        int i11 = this.f35711a;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i11) {
            case 0:
                w1.k kVar = (w1.k) obj;
                List list = ((q3.b) obj2).f47419a;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i12 = 0; i12 < size; i12++) {
                    arrayList.add(o0.a((q3.a) list.get(i12), o0.B, kVar));
                }
                return arrayList;
            case 1:
                return ((q3.a) obj2).f47417a.toLanguageTag();
            case 2:
                w1.k kVar2 = (w1.k) obj;
                u3.i iVar = (u3.i) obj2;
                return ns.o.b(o0.a(new u3.f(iVar.f52747a), o0.D, kVar2), o0.a(new u3.h(iVar.f52748b), o0.E, kVar2), o0.a(new u3.g(iVar.f52749c), o0.F, kVar2));
            case 3:
                return Float.valueOf(((u3.f) obj2).f52743a);
            case 4:
                return Integer.valueOf(((u3.h) obj2).f52745a);
            case 5:
                return Integer.valueOf(((u3.g) obj2).f52744a);
            case 6:
                return ((b1) obj2).f35667a;
            case 7:
                w1.k kVar3 = (w1.k) obj;
                c0 c0Var = (c0) obj2;
                Object objA = o0.a(new u3.k(c0Var.f35668a), o0.f35745s, kVar3);
                Object objA2 = o0.a(new u3.m(c0Var.f35669b), o0.f35746t, kVar3);
                Object objA3 = o0.a(new v3.o(c0Var.f35670c), o0.f35750x, kVar3);
                u3.q qVar = c0Var.f35671d;
                u3.q qVar2 = u3.q.f52760c;
                Object objA4 = o0.a(qVar, o0.m, kVar3);
                Object objA5 = o0.a(c0Var.f35672e, t.f35779b, kVar3);
                u3.i iVar2 = c0Var.f35673f;
                u3.i iVar3 = u3.i.f52746d;
                return ns.o.b(objA, objA2, objA3, objA4, objA5, o0.a(iVar2, o0.C, kVar3), o0.a(new u3.e(c0Var.f35674g), t.f35781d, kVar3), o0.a(new u3.d(c0Var.f35675h), o0.f35747u, kVar3), o0.a(c0Var.f35676i, t.f35782e, kVar3));
            case 8:
                return ((a1) obj2).f35660a;
            case 9:
                w1.k kVar4 = (w1.k) obj;
                p0 p0Var = (p0) obj2;
                g2.x xVar = new g2.x(p0Var.f35754a.b());
                m0 m0Var = o0.f35744r;
                Object objA6 = o0.a(xVar, m0Var, kVar4);
                v3.o oVar = new v3.o(p0Var.f35755b);
                m0 m0Var2 = o0.f35750x;
                Object objA7 = o0.a(oVar, m0Var2, kVar4);
                n3.s sVar = p0Var.f35756c;
                n3.s sVar2 = n3.s.f43173b;
                Object objA8 = o0.a(sVar, o0.f35740n, kVar4);
                Object objA9 = o0.a(p0Var.f35757d, o0.f35748v, kVar4);
                Object objA10 = o0.a(p0Var.f35758e, o0.f35749w, kVar4);
                String str = p0Var.f35760g;
                Object objA11 = o0.a(new v3.o(p0Var.f35761h), m0Var2, kVar4);
                Object objA12 = o0.a(p0Var.f35762i, o0.f35741o, kVar4);
                Object objA13 = o0.a(p0Var.f35763j, o0.f35739l, kVar4);
                q3.b bVar = p0Var.f35764k;
                q3.b bVar2 = q3.b.f47418c;
                Object objA14 = o0.a(bVar, o0.A, kVar4);
                Object objA15 = o0.a(new g2.x(p0Var.f35765l), m0Var, kVar4);
                Object objA16 = o0.a(p0Var.m, o0.f35738k, kVar4);
                g2.v0 v0Var = p0Var.f35766n;
                g2.v0 v0Var2 = g2.v0.f28610d;
                return ns.o.b(objA6, objA7, objA8, objA9, objA10, -1, str, objA11, objA12, objA13, objA14, objA15, objA16, o0.a(v0Var, o0.f35743q, kVar4));
            case 10:
                w1.k kVar5 = (w1.k) obj;
                v0 v0Var3 = (v0) obj2;
                p0 p0Var2 = v0Var3.f35805a;
                o2 o2Var = o0.f35736i;
                return ns.o.b(o0.a(p0Var2, o2Var, kVar5), o0.a(v0Var3.f35806b, o2Var, kVar5), o0.a(v0Var3.f35807c, o2Var, kVar5), o0.a(v0Var3.f35808d, o2Var, kVar5));
            case 11:
                f0 f0Var = (f0) obj2;
                Boolean boolValueOf = Boolean.valueOf(f0Var.f35694a);
                o2 o2Var2 = o0.f35728a;
                return ns.o.b(boolValueOf, o0.a(new q(f0Var.f35695b), t.f35780c, (w1.k) obj));
            case 12:
                return Integer.valueOf(((q) obj2).f35769a);
            case 13:
                return Integer.valueOf(((u3.e) obj2).f52739a);
            case 14:
                u3.s sVar3 = (u3.s) obj2;
                return ns.o.b(o0.a(new u3.r(sVar3.f52766a), t.f35783f, (w1.k) obj), Boolean.valueOf(sVar3.f52767b));
            case 15:
                return Integer.valueOf(((u3.r) obj2).f52763a);
            case 16:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar4 = (l1.s) nVar;
                if (sVar4.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ua.b(ub.a.e0(sVar4, R.string.alphabet), null, se.i.k(sVar4, R.color.primary_black), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar4, 0, 0, 131066);
                } else {
                    sVar4.W();
                }
                return b0Var;
            case 17:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar5 = (l1.s) nVar2;
                if (!sVar5.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    sVar5.W();
                }
                return b0Var;
            case 18:
                l1.n nVar3 = (l1.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.s sVar6 = (l1.s) nVar3;
                if (sVar6.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ua.b("-", null, 0L, j3.A(20), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar6, 3078, 0, 131062);
                } else {
                    sVar6.W();
                }
                return b0Var;
            case 19:
                l1.n nVar4 = (l1.n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                l1.s sVar7 = (l1.s) nVar4;
                if (sVar7.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ua.b("+", null, 0L, j3.A(20), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar7, 3078, 0, 131062);
                } else {
                    sVar7.W();
                }
                return b0Var;
            case 20:
                l1.n nVar5 = (l1.n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                l1.s sVar8 = (l1.s) nVar5;
                if (!sVar8.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    sVar8.W();
                }
                return b0Var;
            case 21:
                l1.n nVar6 = (l1.n) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                l1.s sVar9 = (l1.s) nVar6;
                if (sVar9.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar9, R.string.are_you_sure_you_want_to_delete_the_recording), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar9, 0, 0, 131070);
                } else {
                    sVar9.W();
                }
                return b0Var;
            case 22:
                l1.n nVar7 = (l1.n) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                l1.s sVar10 = (l1.s) nVar7;
                if (sVar10.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar10, R.string.ranking), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar10, 0, 0, 131070);
                } else {
                    sVar10.W();
                }
                return b0Var;
            case 23:
                l1.n nVar8 = (l1.n) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                l1.s sVar11 = (l1.s) nVar8;
                if (sVar11.T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    d0.n.c(se.k.y(R.drawable.ic_speak_delete, sVar11, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar11, 56, 124);
                } else {
                    sVar11.W();
                }
                return b0Var;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                l1.n nVar9 = (l1.n) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                l1.s sVar12 = (l1.s) nVar9;
                if (sVar12.T(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar12, R.string.story_reading), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar12, 0, 0, 131070);
                } else {
                    sVar12.W();
                }
                return b0Var;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                l1.n nVar10 = (l1.n) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                l1.s sVar13 = (l1.s) nVar10;
                if (sVar13.T(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    r4.b(se.k.y(R.drawable.ic_clear, sVar13, 0), "Clear", null, ((s1) sVar13.j(v1.f31180a)).f31034q, sVar13, 56, 4);
                } else {
                    sVar13.W();
                }
                return b0Var;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                l1.n nVar11 = (l1.n) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                l1.s sVar14 = (l1.s) nVar11;
                if (sVar14.T(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar14, R.string.preview), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar14, 0, 0, 131070);
                } else {
                    sVar14.W();
                }
                return b0Var;
            case 27:
                l1.n nVar12 = (l1.n) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                l1.s sVar15 = (l1.s) nVar12;
                if (sVar15.T(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar15, R.string.story_speaking), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar15, 0, 0, 131070);
                } else {
                    sVar15.W();
                }
                return b0Var;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                e20.a viewModel = (e20.a) obj;
                a20.a parameters = (a20.a) obj2;
                kotlin.jvm.internal.m.f(viewModel, "$this$viewModel");
                kotlin.jvm.internal.m.f(parameters, "parameters");
                wt.m mVar = (wt.m) viewModel.a(null, null, kotlin.jvm.internal.z.a(wt.m.class));
                av.n nVar13 = (av.n) viewModel.a(null, null, kotlin.jvm.internal.z.a(av.n.class));
                fv.c cVar = (fv.c) viewModel.a(null, null, kotlin.jvm.internal.z.a(fv.c.class));
                Object objB = parameters.b(kotlin.jvm.internal.z.a(kv.i0.class));
                if (objB != null) {
                    return new mv.y(mVar, nVar13, cVar, (kv.i0) objB);
                }
                throw new DefinitionParameterException(defpackage.e.k(kv.i0.class, new StringBuilder("No value found for type '"), '\''));
            default:
                e20.a viewModel2 = (e20.a) obj;
                a20.a parameters2 = (a20.a) obj2;
                kotlin.jvm.internal.m.f(viewModel2, "$this$viewModel");
                kotlin.jvm.internal.m.f(parameters2, "parameters");
                vt.n0 n0Var = (vt.n0) viewModel2.a(null, null, kotlin.jvm.internal.z.a(vt.n0.class));
                wt.o0 o0Var = (wt.o0) viewModel2.a(null, null, kotlin.jvm.internal.z.a(wt.o0.class));
                wt.m mVar2 = (wt.m) viewModel2.a(null, null, kotlin.jvm.internal.z.a(wt.m.class));
                vt.k0 k0Var = (vt.k0) viewModel2.a(null, null, kotlin.jvm.internal.z.a(vt.k0.class));
                vt.c cVar2 = (vt.c) viewModel2.a(null, null, kotlin.jvm.internal.z.a(vt.c.class));
                vt.e eVar = (vt.e) viewModel2.a(null, null, kotlin.jvm.internal.z.a(vt.e.class));
                fv.c cVar3 = (fv.c) viewModel2.a(null, null, kotlin.jvm.internal.z.a(fv.c.class));
                Object objB2 = parameters2.b(kotlin.jvm.internal.z.a(kv.i0.class));
                if (objB2 == null) {
                    throw new DefinitionParameterException(defpackage.e.k(kv.i0.class, new StringBuilder("No value found for type '"), '\''));
                }
                kv.i0 i0Var = (kv.i0) objB2;
                Object objB3 = parameters2.b(kotlin.jvm.internal.z.a(Boolean.class));
                if (objB3 != null) {
                    return new mv.k0(n0Var, o0Var, mVar2, k0Var, cVar2, eVar, cVar3, i0Var, ((Boolean) objB3).booleanValue());
                }
                throw new DefinitionParameterException(defpackage.e.k(Boolean.class, new StringBuilder("No value found for type '"), '\''));
        }
    }
}
