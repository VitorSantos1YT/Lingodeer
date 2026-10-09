package os;

import av.n;
import com.google.api.Service;
import com.lingodeer.R;
import com.lingodeer.data.model.SRSStatus;
import com.lingodeer.data.model.SyllableWriteLesson;
import com.lingodeer.syllable_ko.model.KOSyllableLesson;
import fz.e;
import h1.r4;
import h1.s1;
import h1.ua;
import h1.v1;
import java.util.List;
import java.util.Set;
import jr.i0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import l1.s;
import org.koin.core.error.DefinitionParameterException;
import ot.o2;
import qv.j;
import qy.b0;
import rt.b1;
import rt.b4;
import rt.e0;
import rt.g6;
import rt.jd;
import rt.l8;
import rt.m8;
import rt.o4;
import rt.qf;
import rt.r6;
import rt.rf;
import rt.s2;
import rt.u6;
import rt.x6;
import rt.x8;
import rz.o0;
import se.k;
import sv.o;
import uv.q;
import uz.i;
import uz.x0;
import vt.h;
import vt.h1;
import vt.k0;
import vt.n0;
import vt.p0;
import vy.d;
import vy.g;
import yz.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45731a;

    public /* synthetic */ a(int i11) {
        this.f45731a = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        String str;
        String str2;
        String str3;
        int i11 = this.f45731a;
        int i12 = 1;
        b0 b0Var = b0.f48488a;
        switch (i11) {
            case 0:
                e20.a aVar = (e20.a) obj;
                a20.a aVar2 = (a20.a) obj2;
                d dVar = null;
                x6 x6Var = (x6) aVar.a(null, null, defpackage.e.u(aVar, "$this$viewModel", aVar2, "parameters", x6.class));
                vt.c cVar = (vt.c) aVar.a(null, null, z.a(vt.c.class));
                wt.b0 b0Var2 = (wt.b0) aVar.a(null, null, z.a(wt.b0.class));
                h1 h1Var = (h1) aVar.a(null, null, z.a(h1.class));
                vt.e eVar = (vt.e) aVar.a(null, null, z.a(vt.e.class));
                h hVar = (h) aVar.a(null, null, z.a(h.class));
                p0 p0Var = (p0) aVar.a(null, null, z.a(p0.class));
                k0 k0Var = (k0) aVar.a(null, null, z.a(k0.class));
                n0 n0Var = (n0) aVar.a(null, null, z.a(n0.class));
                n nVar = (n) aVar.a(null, null, z.a(n.class));
                fv.c cVar2 = (fv.c) aVar.a(null, null, z.a(fv.c.class));
                Object objB = aVar2.b(z.a(x8.class));
                if (objB == null) {
                    throw new DefinitionParameterException(defpackage.e.k(x8.class, new StringBuilder("No value found for type '"), '\''));
                }
                x8 x8Var = (x8) objB;
                Object objB2 = aVar2.b(z.a(Boolean.class));
                if (objB2 == null) {
                    throw new DefinitionParameterException(defpackage.e.k(Boolean.class, new StringBuilder("No value found for type '"), '\''));
                }
                boolean zBooleanValue = ((Boolean) objB2).booleanValue();
                Object objB3 = aVar2.b(z.a(Boolean.class));
                if (objB3 == null) {
                    throw new DefinitionParameterException(defpackage.e.k(Boolean.class, new StringBuilder("No value found for type '"), '\''));
                }
                boolean zBooleanValue2 = ((Boolean) objB3).booleanValue();
                Set setH = qx.b.H(x8Var);
                i iVarO = x0.o(x0.z(new u6(x6Var, setH, dVar, i12), x0.z(new u6(x6Var, setH, dVar, 0), x6Var.f50644b.f55321n)));
                f fVar = o0.f50940a;
                r6 r6Var = new r6(x0.w(iVarO, yz.e.f58387a), x8Var, 1);
                int[] iArr = l8.f50020a;
                int i13 = iArr[x8Var.ordinal()];
                if (i13 == 1) {
                    str = "course_c";
                } else if (i13 == 2) {
                    str = "course_w";
                } else if (i13 == 3) {
                    str = "course_s";
                } else {
                    if (i13 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "extent_w";
                }
                String str4 = str;
                int i14 = iArr[x8Var.ordinal()];
                if (i14 == 1) {
                    str2 = "c";
                } else {
                    if (i14 != 2) {
                        if (i14 == 3) {
                            str2 = "s";
                        } else {
                            if (i14 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str3 = null;
                        }
                        return new m8(x8Var, zBooleanValue, zBooleanValue2, r6Var, cVar, h1Var, k0Var, n0Var, b0Var2, eVar, hVar, p0Var, str4, str3, new i0(n0Var, nVar, cVar2, dVar, 23));
                    }
                    str2 = "w";
                }
                str3 = str2;
                return new m8(x8Var, zBooleanValue, zBooleanValue2, r6Var, cVar, h1Var, k0Var, n0Var, b0Var2, eVar, hVar, p0Var, str4, str3, new i0(n0Var, nVar, cVar2, dVar, 23));
            case 1:
                e20.a viewModel = (e20.a) obj;
                a20.a parameters = (a20.a) obj2;
                m.f(viewModel, "$this$viewModel");
                m.f(parameters, "parameters");
                Object objB4 = parameters.b(z.a(x8.class));
                if (objB4 != null) {
                    return new e0((x8) objB4, (h) viewModel.a(null, null, z.a(h.class)), (g6) viewModel.a(null, null, z.a(g6.class)), (n0) viewModel.a(null, null, z.a(n0.class)), (vt.c) viewModel.a(null, null, z.a(vt.c.class)));
                }
                throw new DefinitionParameterException(defpackage.e.k(x8.class, new StringBuilder("No value found for type '"), '\''));
            case 2:
                e20.a viewModel2 = (e20.a) obj;
                a20.a parameters2 = (a20.a) obj2;
                m.f(viewModel2, "$this$viewModel");
                m.f(parameters2, "parameters");
                wt.m mVar = (wt.m) viewModel2.a(null, null, z.a(wt.m.class));
                rs.b bVar = (rs.b) viewModel2.a(null, null, z.a(rs.b.class));
                wt.b0 b0Var3 = (wt.b0) viewModel2.a(null, null, z.a(wt.b0.class));
                h1 h1Var2 = (h1) viewModel2.a(null, null, z.a(h1.class));
                n0 n0Var2 = (n0) viewModel2.a(null, null, z.a(n0.class));
                vt.c cVar3 = (vt.c) viewModel2.a(null, null, z.a(vt.c.class));
                vt.e eVar2 = (vt.e) viewModel2.a(null, null, z.a(vt.e.class));
                p0 p0Var2 = (p0) viewModel2.a(null, null, z.a(p0.class));
                h hVar2 = (h) viewModel2.a(null, null, z.a(h.class));
                fv.c cVar4 = (fv.c) viewModel2.a(null, null, z.a(fv.c.class));
                n nVar2 = (n) viewModel2.a(null, null, z.a(n.class));
                n nVar3 = (n) viewModel2.a(null, null, z.a(n.class));
                Object objB5 = parameters2.b(z.a(s2.class));
                if (objB5 == null) {
                    throw new DefinitionParameterException(defpackage.e.k(s2.class, new StringBuilder("No value found for type '"), '\''));
                }
                s2 s2Var = (s2) objB5;
                Object objB6 = parameters2.b(z.a(Boolean.class));
                if (objB6 != null) {
                    return new b4(mVar, bVar, b0Var3, h1Var2, n0Var2, cVar3, eVar2, p0Var2, hVar2, cVar4, nVar2, nVar3, s2Var, ((Boolean) objB6).booleanValue());
                }
                throw new DefinitionParameterException(defpackage.e.k(Boolean.class, new StringBuilder("No value found for type '"), '\''));
            case 3:
                e20.a viewModel3 = (e20.a) obj;
                a20.a parameters3 = (a20.a) obj2;
                m.f(viewModel3, "$this$viewModel");
                m.f(parameters3, "parameters");
                o2 o2Var = (o2) viewModel3.a(null, null, z.a(o2.class));
                wt.m mVar2 = (wt.m) viewModel3.a(null, null, z.a(wt.m.class));
                ur.a aVar3 = (ur.a) viewModel3.a(null, null, z.a(ur.a.class));
                Object objB7 = parameters3.b(z.a(Long.class));
                if (objB7 != null) {
                    return new jd(o2Var, mVar2, aVar3, ((Number) objB7).longValue());
                }
                throw new DefinitionParameterException(defpackage.e.k(Long.class, new StringBuilder("No value found for type '"), '\''));
            case 4:
                e20.a viewModel4 = (e20.a) obj;
                a20.a parameters4 = (a20.a) obj2;
                m.f(viewModel4, "$this$viewModel");
                m.f(parameters4, "parameters");
                wt.o0 o0Var = (wt.o0) viewModel4.a(null, null, z.a(wt.o0.class));
                Object objB8 = parameters4.b(z.a(Integer.class));
                if (objB8 != null) {
                    return new b1(o0Var, ((Number) objB8).intValue());
                }
                throw new DefinitionParameterException(defpackage.e.k(Integer.class, new StringBuilder("No value found for type '"), '\''));
            case 5:
                e20.a factory = (e20.a) obj;
                a20.a it = (a20.a) obj2;
                m.f(factory, "$this$factory");
                m.f(it, "it");
                return new o4(com.bumptech.glide.d.e(factory));
            case 6:
                e20.a factory2 = (e20.a) obj;
                a20.a it2 = (a20.a) obj2;
                m.f(factory2, "$this$factory");
                m.f(it2, "it");
                return new o2((wt.m) factory2.a(null, null, z.a(wt.m.class)), (ot.i0) factory2.a(null, null, z.a(ot.i0.class)), new ah.b(factory2, i12), (n0) factory2.a(null, null, z.a(n0.class)));
            case 7:
                e20.a viewModel5 = (e20.a) obj;
                a20.a parameters5 = (a20.a) obj2;
                m.f(viewModel5, "$this$viewModel");
                m.f(parameters5, "parameters");
                n0 n0Var3 = (n0) viewModel5.a(null, null, z.a(n0.class));
                wt.o0 o0Var2 = (wt.o0) viewModel5.a(null, null, z.a(wt.o0.class));
                k0 k0Var2 = (k0) viewModel5.a(null, null, z.a(k0.class));
                vt.c cVar5 = (vt.c) viewModel5.a(null, null, z.a(vt.c.class));
                vt.e eVar3 = (vt.e) viewModel5.a(null, null, z.a(vt.e.class));
                Object objB9 = parameters5.b(z.a(KOSyllableLesson.class));
                if (objB9 == null) {
                    throw new DefinitionParameterException(defpackage.e.k(KOSyllableLesson.class, new StringBuilder("No value found for type '"), '\''));
                }
                KOSyllableLesson kOSyllableLesson = (KOSyllableLesson) objB9;
                Object objB10 = parameters5.b(z.a(Boolean.class));
                if (objB10 != null) {
                    return new o(n0Var3, o0Var2, k0Var2, cVar5, eVar3, kOSyllableLesson, ((Boolean) objB10).booleanValue());
                }
                throw new DefinitionParameterException(defpackage.e.k(Boolean.class, new StringBuilder("No value found for type '"), '\''));
            case 8:
                e20.a viewModel6 = (e20.a) obj;
                a20.a parameters6 = (a20.a) obj2;
                m.f(viewModel6, "$this$viewModel");
                m.f(parameters6, "parameters");
                n nVar4 = (n) viewModel6.a(null, null, z.a(n.class));
                fv.c cVar6 = (fv.c) viewModel6.a(null, null, z.a(fv.c.class));
                n0 n0Var4 = (n0) viewModel6.a(null, null, z.a(n0.class));
                wt.m mVar3 = (wt.m) viewModel6.a(null, null, z.a(wt.m.class));
                Object objB11 = parameters6.b(z.a(SyllableWriteLesson.class));
                if (objB11 != null) {
                    return new j(nVar4, cVar6, n0Var4, mVar3, (SyllableWriteLesson) objB11);
                }
                throw new DefinitionParameterException(defpackage.e.k(SyllableWriteLesson.class, new StringBuilder("No value found for type '"), '\''));
            case 9:
                l1.n nVar5 = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = (s) nVar5;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ua.b(ub.a.e0(sVar, R.string.languages), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 0, 0, 131070);
                } else {
                    sVar.W();
                }
                return b0Var;
            case 10:
                l1.n nVar6 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                s sVar2 = (s) nVar6;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    r4.b(k.y(R.drawable.close_24px, sVar2, 0), null, null, ((s1) sVar2.j(v1.f31180a)).f31032o, sVar2, 48, 4);
                } else {
                    sVar2.W();
                }
                return b0Var;
            case 11:
                l1.n nVar7 = (l1.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                s sVar3 = (s) nVar7;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    r4.b(k.y(R.drawable.achievement_icon_share, sVar3, 0), null, null, ((s1) sVar3.j(v1.f31180a)).f31032o, sVar3, 48, 4);
                } else {
                    sVar3.W();
                }
                return b0Var;
            case 12:
                l1.n nVar8 = (l1.n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                s sVar4 = (s) nVar8;
                if (sVar4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    r4.b(k.y(R.drawable.close_24px, sVar4, 0), null, null, ((s1) sVar4.j(v1.f31180a)).f31032o, sVar4, 48, 4);
                } else {
                    sVar4.W();
                }
                return b0Var;
            case 13:
                l1.n nVar9 = (l1.n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                s sVar5 = (s) nVar9;
                if (sVar5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    r4.b(k.y(R.drawable.close_24px, sVar5, 0), null, null, ((s1) sVar5.j(v1.f31180a)).f31032o, sVar5, 48, 4);
                } else {
                    sVar5.W();
                }
                return b0Var;
            case 14:
                l1.n nVar10 = (l1.n) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                s sVar6 = (s) nVar10;
                if (sVar6.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    r4.b(k.y(R.drawable.achievement_icon_share, sVar6, 0), null, null, ((s1) sVar6.j(v1.f31180a)).f31032o, sVar6, 48, 4);
                } else {
                    sVar6.W();
                }
                return b0Var;
            case 15:
                l1.n nVar11 = (l1.n) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                s sVar7 = (s) nVar11;
                if (sVar7.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    r4.b(k.y(R.drawable.close_24px, sVar7, 0), null, null, 0L, sVar7, 48, 12);
                } else {
                    sVar7.W();
                }
                return b0Var;
            case 16:
                l1.n nVar12 = (l1.n) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                s sVar8 = (s) nVar12;
                if (sVar8.T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    r4.b(k.y(R.drawable.achievement_icon_share, sVar8, 0), null, null, 0L, sVar8, 48, 12);
                } else {
                    sVar8.W();
                }
                return b0Var;
            case 17:
                l1.n nVar13 = (l1.n) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                s sVar9 = (s) nVar13;
                if (sVar9.T(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    r4.b(k.y(R.drawable.close_24px, sVar9, 0), null, null, 0L, sVar9, 48, 12);
                } else {
                    sVar9.W();
                }
                return b0Var;
            case 18:
                l1.n nVar14 = (l1.n) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                s sVar10 = (s) nVar14;
                if (sVar10.T(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    r4.b(k.y(R.drawable.close_24px, sVar10, 0), null, null, 0L, sVar10, 48, 12);
                } else {
                    sVar10.W();
                }
                return b0Var;
            case 19:
                String result = (String) obj;
                List wordAccuracyList = (List) obj2;
                m.f(result, "result");
                m.f(wordAccuracyList, "wordAccuracyList");
                return b0Var;
            case 20:
                String result2 = (String) obj;
                List wordAccuracyList2 = (List) obj2;
                m.f(result2, "result");
                m.f(wordAccuracyList2, "wordAccuracyList");
                return b0Var;
            case 21:
                String result3 = (String) obj;
                List wordAccuracyList3 = (List) obj2;
                m.f(result3, "result");
                m.f(wordAccuracyList3, "wordAccuracyList");
                return b0Var;
            case 22:
                l1.n nVar15 = (l1.n) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                s sVar11 = (s) nVar15;
                if (!sVar11.T(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    sVar11.W();
                }
                return b0Var;
            case 23:
                l1.n nVar16 = (l1.n) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                s sVar12 = (s) nVar16;
                if (sVar12.T(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar12, R.string.alphabet), null, se.i.k(sVar12, R.color.primary_black), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar12, 0, 0, 131066);
                } else {
                    sVar12.W();
                }
                return b0Var;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                ((SRSStatus) obj).getId();
                return b0Var;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                List entries = (List) obj;
                fv.d listener = (fv.d) obj2;
                m.f(entries, "entries");
                m.f(listener, "listener");
                rf.f50350b.c(entries, listener, false);
                return b0Var;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                uv.b task = (uv.b) obj;
                fz.a retry = (fz.a) obj2;
                m.f(task, "task");
                m.f(retry, "retry");
                q.f53227a.f(task.a());
                rf.f50349a.post(new qf(0, retry));
                return b0Var;
            case 27:
                String message = (String) obj;
                m.f(message, "message");
                return b0Var;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            default:
                return ((vy.i) obj).plus((g) obj2);
        }
    }
}
