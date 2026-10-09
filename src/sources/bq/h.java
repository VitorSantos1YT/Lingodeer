package bq;

import com.google.api.Service;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import com.lingo.lingoskill.object.HwCharPart;
import com.lingo.lingoskill.object.HwTCharPart;
import h9.d0;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import l1.q0;
import n0.d1;
import n0.e0;
import y2.i0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4950a;

    public /* synthetic */ h(int i11) {
        this.f4950a = i11;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f4950a) {
            case 0:
                HwCharPart lhs = (HwCharPart) obj;
                HwCharPart rhs = (HwCharPart) obj2;
                kotlin.jvm.internal.m.f(lhs, "lhs");
                kotlin.jvm.internal.m.f(rhs, "rhs");
                return lhs.getPartIndex() - rhs.getPartIndex();
            case 1:
                HwCharPart lhs2 = (HwCharPart) obj;
                HwCharPart rhs2 = (HwCharPart) obj2;
                kotlin.jvm.internal.m.f(lhs2, "lhs");
                kotlin.jvm.internal.m.f(rhs2, "rhs");
                return lhs2.getPartIndex() - rhs2.getPartIndex();
            case 2:
                HwTCharPart lhs3 = (HwTCharPart) obj;
                HwTCharPart rhs3 = (HwTCharPart) obj2;
                kotlin.jvm.internal.m.f(lhs3, "lhs");
                kotlin.jvm.internal.m.f(rhs3, "rhs");
                return lhs3.getPartIndex() - rhs3.getPartIndex();
            case 3:
                return Integer.compare(((d9.d) obj).f23311a.f23314b, ((d9.d) obj2).f23311a.f23314b);
            case 4:
                return Long.compare(((d9.c) obj).f23308b, ((d9.c) obj2).f23308b);
            case 5:
                d0 d0Var = (d0) obj;
                d0 d0Var2 = (d0) obj2;
                int iCompare = Integer.compare(d0Var2.f32026b, d0Var.f32026b);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompareTo = d0Var.f32027c.compareTo(d0Var2.f32027c);
                return iCompareTo != 0 ? iCompareTo : d0Var.f32028d.compareTo(d0Var2.f32028d);
            case 6:
                d0 d0Var3 = (d0) obj;
                d0 d0Var4 = (d0) obj2;
                int iCompare2 = Integer.compare(d0Var4.f32025a, d0Var3.f32025a);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompareTo2 = d0Var4.f32027c.compareTo(d0Var3.f32027c);
                return iCompareTo2 != 0 ? iCompareTo2 : d0Var4.f32028d.compareTo(d0Var3.f32028d);
            case 7:
                j7.b bVar = (j7.b) obj;
                j7.b bVar2 = (j7.b) obj2;
                int iCompare3 = Integer.compare(bVar.f36096c, bVar2.f36096c);
                return iCompare3 != 0 ? iCompare3 : bVar.f36095b.compareTo(bVar2.f36095b);
            case 8:
                qy.l lVar = (qy.l) obj;
                qy.l lVar2 = (qy.l) obj2;
                return (((Number) lVar.f48496b).intValue() - ((Number) lVar.f48495a).intValue()) - (((Number) lVar2.f48496b).intValue() - ((Number) lVar2.f48495a).intValue());
            case 9:
                return kotlin.jvm.internal.m.h(((q0) obj).f39427b, ((q0) obj2).f39427b);
            case 10:
                Charset charset = CrashlyticsReportPersistence.f18871e;
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 11:
                Charset charset2 = CrashlyticsReportPersistence.f18871e;
                String name = ((File) obj).getName();
                int i11 = CrashlyticsReportPersistence.f18872f;
                return name.substring(0, i11).compareTo(((File) obj2).getName().substring(0, i11));
            case 12:
                return kotlin.jvm.internal.m.h(((d1) obj2).f42936a, ((d1) obj).f42936a);
            case 13:
                return kotlin.jvm.internal.m.h(((e0) obj).getIndex(), ((e0) obj2).getIndex());
            case 14:
                nf.e eVar = (nf.e) obj;
                nf.e o5 = (nf.e) obj2;
                if (!qf.a.b(of.c.class)) {
                    try {
                        kotlin.jvm.internal.m.e(o5, "o2");
                        eVar.getClass();
                        Long l9 = eVar.f43771g;
                        if (l9 == null) {
                            return -1;
                        }
                        long jLongValue = l9.longValue();
                        Long l11 = o5.f43771g;
                        if (l11 != null) {
                            return kotlin.jvm.internal.m.i(l11.longValue(), jLongValue);
                        }
                        return 1;
                    } catch (Throwable th2) {
                        qf.a.a(of.c.class, th2);
                    }
                }
                return 0;
            case 15:
                nf.e eVar2 = (nf.e) obj;
                nf.e o7 = (nf.e) obj2;
                kotlin.jvm.internal.m.e(o7, "o2");
                eVar2.getClass();
                Long l12 = eVar2.f43771g;
                if (l12 == null) {
                    return -1;
                }
                long jLongValue2 = l12.longValue();
                Long l13 = o7.f43771g;
                if (l13 != null) {
                    return kotlin.jvm.internal.m.i(l13.longValue(), jLongValue2);
                }
                return 1;
            case 16:
                rf.a aVar = (rf.a) obj;
                rf.a o11 = (rf.a) obj2;
                kotlin.jvm.internal.m.e(o11, "o2");
                aVar.getClass();
                Long l14 = aVar.f49241c;
                if (l14 == null) {
                    return -1;
                }
                long jLongValue3 = l14.longValue();
                Long l15 = o11.f49241c;
                if (l15 != null) {
                    return kotlin.jvm.internal.m.i(l15.longValue(), jLongValue3);
                }
                return 1;
            case 17:
                return ((y6.p) obj2).f57288j - ((y6.p) obj).f57288j;
            case 18:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 19:
                return Integer.compare(((s7.g) ((List) obj).get(0)).f51420f, ((s7.g) ((List) obj2).get(0)).f51420f);
            case 20:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i12 = 23;
                ComparisonChain comparisonChainA = ComparisonChain.f16669a.c((s7.p) Collections.max(list, new h(i12)), (s7.p) Collections.max(list2, new h(i12)), new h(i12)).a(list.size(), list2.size());
                int i13 = 24;
                return comparisonChainA.c((s7.p) Collections.max(list, new h(i13)), (s7.p) Collections.max(list2, new h(i13)), new h(i13)).f();
            case 21:
                return ((s7.f) Collections.max((List) obj)).compareTo((s7.f) Collections.max((List) obj2));
            case 22:
                return ((s7.m) ((List) obj).get(0)).compareTo((s7.m) ((List) obj2).get(0));
            case 23:
                s7.p pVar = (s7.p) obj;
                s7.p pVar2 = (s7.p) obj2;
                ComparisonChain comparisonChainC = ComparisonChain.f16669a.d(pVar.H, pVar2.H).c(Integer.valueOf(pVar.O), Integer.valueOf(pVar2.O), Ordering.c().g()).a(pVar.P, pVar2.P).a(pVar.Q, pVar2.Q).d(pVar.R, pVar2.R).a(pVar.S, pVar2.S).d(pVar.K, pVar2.K).d(pVar.f51447e, pVar2.f51447e).d(pVar.f51449t, pVar2.f51449t).c(Integer.valueOf(pVar.N), Integer.valueOf(pVar2.N), Ordering.c().g());
                boolean z11 = pVar.V;
                ComparisonChain comparisonChainD = comparisonChainC.d(z11, pVar2.V);
                boolean z12 = pVar.W;
                ComparisonChain comparisonChainD2 = comparisonChainD.d(z12, pVar2.W);
                if (z11 && z12) {
                    comparisonChainD2 = comparisonChainD2.a(pVar.X, pVar2.X);
                }
                return comparisonChainD2.f();
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                s7.p pVar3 = (s7.p) obj;
                s7.p pVar4 = (s7.p) obj2;
                boolean z13 = pVar3.f51447e;
                int i14 = pVar3.L;
                Ordering orderingG = (z13 && pVar3.H) ? s7.q.f51450k : s7.q.f51450k.g();
                ComparisonChain comparisonChain = ComparisonChain.f16669a;
                pVar3.f51448f.getClass();
                return comparisonChain.c(Integer.valueOf(pVar3.M), Integer.valueOf(pVar4.M), orderingG).c(Integer.valueOf(i14), Integer.valueOf(pVar4.L), orderingG).f();
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return ((t7.r) obj).f52106a - ((t7.r) obj2).f52106a;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return Float.compare(((t7.r) obj).f52108c, ((t7.r) obj2).f52108c);
            case 27:
                return Integer.compare(((v8.d) obj2).f53763b, ((v8.d) obj).f53763b);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i15 = 0; i15 < bArr.length; i15++) {
                    byte b3 = bArr[i15];
                    byte b11 = bArr2[i15];
                    if (b3 != b11) {
                        return b3 - b11;
                    }
                }
                return 0;
            default:
                i0 i0Var = (i0) obj;
                i0 i0Var2 = (i0) obj2;
                float f5 = i0Var.f56893j0.f56974p.f56834g0;
                float f11 = i0Var2.f56893j0.f56974p.f56834g0;
                return f5 == f11 ? kotlin.jvm.internal.m.h(i0Var.x(), i0Var2.x()) : Float.compare(f5, f11);
        }
    }
}
