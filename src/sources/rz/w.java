package rz;

import com.google.api.Service;
import com.lingo.lingoskill.object.HwCharPart;
import com.lingo.lingoskill.object.HwTCharPart;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import h1.dc;
import h1.fc;
import h1.g7;
import h1.i9;
import h1.r4;
import h1.ua;
import h1.w7;
import h1.y7;
import java.util.Map;
import l1.v2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50965a;

    public /* synthetic */ w(int i11) {
        this.f50965a = i11;
    }

    /* JADX WARN: Code duplicated, block: B:241:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0101 A[LOOP:0: B:23:0x00ba->B:36:0x0101, LOOP_END] */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        j3.y0 y0Var;
        j3.y0 y0Var2;
        vy.c cVar;
        switch (this.f50965a) {
            case 0:
                return ((vy.i) obj).plus((vy.g) obj2);
            case 1:
                s0.m1 m1Var = (s0.m1) obj2;
                return ns.o.L(Float.valueOf(m1Var.f51099a.l()), Boolean.valueOf(((f0.h1) m1Var.f51104f.getValue()) == f0.h1.Vertical));
            case 2:
                HwTCharPart lhs = (HwTCharPart) obj;
                HwTCharPart rhs = (HwTCharPart) obj2;
                kotlin.jvm.internal.m.f(lhs, "lhs");
                kotlin.jvm.internal.m.f(rhs, "rhs");
                return Integer.valueOf(lhs.getPartIndex() - rhs.getPartIndex());
            case 3:
                HwCharPart lhs2 = (HwCharPart) obj;
                HwCharPart rhs2 = (HwCharPart) obj2;
                kotlin.jvm.internal.m.f(lhs2, "lhs");
                kotlin.jvm.internal.m.f(rhs2, "rhs");
                return Integer.valueOf(lhs2.getPartIndex() - rhs2.getPartIndex());
            case 4:
                int iIntValue = ((Integer) obj).intValue();
                j3.y0 textStyle = (j3.y0) obj2;
                kotlin.jvm.internal.m.f(textStyle, "textStyle");
                if (iIntValue == 0) {
                    return new j3.y0(0L, j3.A(36), n3.s.L, null, 0L, 0, 0L, 16777209);
                }
                if (iIntValue != 1) {
                    if (iIntValue == 2) {
                        y0Var2 = new j3.y0(g2.x.c(textStyle.b(), 0.7f), j3.A(22), n3.s.L, null, 0L, 0, 0L, 16777208);
                    } else if (iIntValue == 3) {
                        y0Var = new j3.y0(0L, j3.A(20), n3.s.L, new n3.o(1), 0L, 0, 0L, 16777201);
                    } else {
                        if (iIntValue != 4) {
                            if (iIntValue != 5) {
                                return textStyle;
                            }
                            return new j3.y0(g2.x.c(textStyle.b(), 0.5f), 0L, n3.s.L, null, 0L, 0, 0L, 16777210);
                        }
                        y0Var2 = new j3.y0(g2.x.c(textStyle.b(), 0.7f), j3.A(18), n3.s.L, null, 0L, 0, 0L, 16777208);
                    }
                    return y0Var2;
                }
                y0Var = new j3.y0(0L, j3.A(26), n3.s.L, null, 0L, 0, 0L, 16777209);
                return y0Var;
            case 5:
                l1.n nVar = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar, R.string.alphabet), null, se.i.k(sVar, R.color.primary_black), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 0, 0, 131066);
                } else {
                    sVar.W();
                }
                return qy.b0.f48488a;
            case 6:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    float f5 = 16;
                    z1.o oVar = z1.o.f58481a;
                    z1.r rVarA = j0.c.A(oVar, f5);
                    j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar2, 48);
                    int iHashCode = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL = sVar2.l();
                    z1.r rVarC = z1.a.c(sVar2, rVarA);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(y2.j.f56917f, a2VarA, sVar2);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar2);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar2);
                    g7.b(CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, 31, 0L, 0L, sVar2, null);
                    ua.b(ub.a.e0(sVar2, R.string.loading), j0.c.E(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar2.j(fc.f30256a)).f30175h, sVar2, 48, 0, 65532);
                    sVar2.p(true);
                } else {
                    sVar2.W();
                }
                return qy.b0.f48488a;
            case 7:
                l1.n nVar3 = (l1.n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    i9.a(null, ((w7) sVar3.j(y7.f31359a)).f31244d, 0L, 0L, h1.a.f29950a, CropImageView.DEFAULT_ASPECT_RATIO, null, tv.a.f52632a, sVar3, 12582912, 109);
                } else {
                    sVar3.W();
                }
                return qy.b0.f48488a;
            case 8:
                l1.n nVar4 = (l1.n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                l1.s sVar4 = (l1.s) nVar4;
                if (!sVar4.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    sVar4.W();
                }
                return qy.b0.f48488a;
            case 9:
                l1.n nVar5 = (l1.n) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                l1.s sVar5 = (l1.s) nVar5;
                if (sVar5.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    r4.b(se.k.y(R.drawable.close_24px, sVar5, 0), null, null, 0L, sVar5, 48, 12);
                } else {
                    sVar5.W();
                }
                return qy.b0.f48488a;
            case 10:
                l1.n nVar6 = (l1.n) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                l1.s sVar6 = (l1.s) nVar6;
                if (sVar6.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    sVar6.d0(-227274383);
                    d0.n.c(se.k.y(R.drawable.lb_explain, sVar6, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar6, 48, 124);
                    sVar6.p(false);
                } else {
                    sVar6.W();
                }
                return qy.b0.f48488a;
            case 11:
                ((Integer) obj2).getClass();
                tv.a.c((l1.n) obj, l1.t.M(1));
                return qy.b0.f48488a;
            case 12:
                ((Integer) obj2).getClass();
                tv.a.e((l1.n) obj, l1.t.M(1));
                return qy.b0.f48488a;
            case 13:
                ((Integer) obj2).getClass();
                l1.s sVar7 = (l1.s) ((l1.n) obj);
                sVar7.d0(-542073013);
                j0.g0 g0Var = new j0.g0();
                sVar7.p(false);
                return g0Var;
            case 14:
                l1.n nVar7 = (l1.n) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                l1.s sVar8 = (l1.s) nVar7;
                if (sVar8.T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    r4.b(se.k.y(R.drawable.close_24px, sVar8, 0), null, null, g2.f0.e(4288519581L), sVar8, 3120, 4);
                } else {
                    sVar8.W();
                }
                return qy.b0.f48488a;
            case 15:
                l1.n nVar8 = (l1.n) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                l1.s sVar9 = (l1.s) nVar8;
                if (sVar9.T(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    r4.b(se.k.y(R.drawable.close_24px, sVar9, 0), null, null, 0L, sVar9, 48, 12);
                } else {
                    sVar9.W();
                }
                return qy.b0.f48488a;
            case 16:
                ((Integer) obj2).getClass();
                vr.b.c((l1.n) obj, l1.t.M(1));
                return qy.b0.f48488a;
            case 17:
                l1.n nVar9 = (l1.n) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                l1.s sVar10 = (l1.s) nVar9;
                if (sVar10.T(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    ua.b("输入汉字或拼音", null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar10, 6, 0, 131070);
                } else {
                    sVar10.W();
                }
                return qy.b0.f48488a;
            case 18:
                l1.n nVar10 = (l1.n) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                l1.s sVar11 = (l1.s) nVar10;
                if (sVar11.T(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    r4.b(se.k.y(R.drawable.search_24px, sVar11, 0), null, null, 0L, sVar11, 48, 12);
                } else {
                    sVar11.W();
                }
                return qy.b0.f48488a;
            case 19:
                l1.n nVar11 = (l1.n) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                l1.s sVar12 = (l1.s) nVar11;
                if (sVar12.T(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    r4.b(se.k.y(R.drawable.character_doc_scan, sVar12, 0), "camera", null, 0L, sVar12, 48, 12);
                } else {
                    sVar12.W();
                }
                return qy.b0.f48488a;
            case 20:
                l1.n nVar12 = (l1.n) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                l1.s sVar13 = (l1.s) nVar12;
                if (sVar13.T(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    r4.b(se.k.y(R.drawable.close_24px, sVar13, 0), "clear", null, 0L, sVar13, 48, 12);
                } else {
                    sVar13.W();
                }
                return qy.b0.f48488a;
            case 21:
                String acc = (String) obj;
                vy.g element = (vy.g) obj2;
                kotlin.jvm.internal.m.f(acc, "acc");
                kotlin.jvm.internal.m.f(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            case 22:
                vy.i acc2 = (vy.i) obj;
                vy.g element2 = (vy.g) obj2;
                kotlin.jvm.internal.m.f(acc2, "acc");
                kotlin.jvm.internal.m.f(element2, "element");
                vy.i iVarMinusKey = acc2.minusKey(element2.getKey());
                vy.j jVar = vy.j.f54321a;
                if (iVarMinusKey == jVar) {
                    return element2;
                }
                vy.e eVar = vy.e.f54320a;
                vy.f fVar = (vy.f) iVarMinusKey.get(eVar);
                if (fVar == null) {
                    cVar = new vy.c(element2, iVarMinusKey);
                } else {
                    vy.i iVarMinusKey2 = iVarMinusKey.minusKey(eVar);
                    if (iVarMinusKey2 == jVar) {
                        return new vy.c(fVar, element2);
                    }
                    cVar = new vy.c(fVar, new vy.c(element2, iVarMinusKey2));
                }
                return cVar;
            case 23:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                w1.k kVar = (w1.k) obj;
                l1.b1 b1Var = (l1.b1) obj2;
                if (!(b1Var instanceof x1.n)) {
                    throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
                }
                x1.n nVar13 = (x1.n) b1Var;
                Object objInvoke = ((fz.e) o3.w.f44703d.f48095b).invoke(kVar, nVar13.getValue());
                if (objInvoke == null) {
                    return null;
                }
                v2 v2VarE = nVar13.e();
                kotlin.jvm.internal.m.d(v2VarE, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
                return new l1.k1(objInvoke, v2VarE);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                w1.c cVar2 = (w1.c) obj2;
                Map map = cVar2.f54458a;
                y.i0 i0Var = cVar2.f54459b;
                Object[] objArr = i0Var.f56714b;
                Object[] objArr2 = i0Var.f56715c;
                long[] jArr = i0Var.f56713a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j11 = jArr[i11];
                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                            for (int i13 = 0; i13 < i12; i13++) {
                                if ((255 & j11) < 128) {
                                    int i14 = (i11 << 3) + i13;
                                    Object obj3 = objArr[i14];
                                    Map mapA = ((w1.e) objArr2[i14]).a();
                                    if (mapA.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, mapA);
                                    }
                                }
                                j11 >>= 8;
                            }
                            if (i12 == 8) {
                                if (i11 != length) {
                                    i11++;
                                }
                            }
                        } else if (i11 != length) {
                            i11++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return obj2;
            case 27:
                l1.n nVar14 = (l1.n) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                l1.s sVar14 = (l1.s) nVar14;
                if (sVar14.T(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar14, R.string.alphabet), null, se.i.k(sVar14, R.color.primary_black), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar14, 0, 0, 131066);
                } else {
                    sVar14.W();
                }
                return qy.b0.f48488a;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                e20.a factory = (e20.a) obj;
                a20.a it = (a20.a) obj2;
                kotlin.jvm.internal.m.f(factory, "$this$factory");
                kotlin.jvm.internal.m.f(it, "it");
                return new yr.m((vt.d0) factory.a(null, null, kotlin.jvm.internal.z.a(vt.d0.class)));
            default:
                a20.a it2 = (a20.a) obj2;
                kotlin.jvm.internal.m.f((e20.a) obj, "$this$factory");
                kotlin.jvm.internal.m.f(it2, "it");
                return new yr.j(dv.x0.f24531a);
        }
    }

    public /* synthetic */ w(int i11, int i12) {
        this.f50965a = i12;
    }
}
