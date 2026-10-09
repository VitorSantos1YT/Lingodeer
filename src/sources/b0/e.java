package b0;

import com.google.logging.type.LogSeverity;
import com.yalantis.ucrop.view.CropImageView;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f3487a = new o(Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f3488b = new p(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f3489c = new q(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f3490d = new r(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o f3491e = new o(Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p f3492f = new p(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final q f3493g = new q(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final r f3494h = new r(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float[] f3495i = new float[91];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final j2 f3496j = new j2(new au.a(29), new k2(16));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final j2 f3497k = new j2(new k2(0), new k2(1));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final j2 f3498l = new j2(new k2(2), new k2(3));
    public static final j2 m = new j2(new k2(4), new k2(5));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j2 f3499n = new j2(new k2(6), new k2(7));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final j2 f3500o = new j2(new k2(8), new k2(9));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final j2 f3501p = new j2(new k2(10), new k2(11));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final j2 f3502q = new j2(new k2(12), new k2(13));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final j2 f3503r = new j2(new k2(14), new k2(15));

    public static d a(float f5) {
        return new d(Float.valueOf(f5), f3496j, Float.valueOf(0.01f), 8);
    }

    public static n b(float f5, float f11, int i11) {
        if ((i11 & 2) != 0) {
            f11 = CropImageView.DEFAULT_ASPECT_RATIO;
        }
        return new n(f3496j, Float.valueOf(f5), new o(f11), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final Object c(float f5, float f11, float f12, m mVar, fz.e eVar, xy.i iVar) {
        Float f13 = new Float(f5);
        Float f14 = new Float(f11);
        Float f15 = new Float(f12);
        j2 j2Var = f3496j;
        fz.c cVar = j2Var.f3575a;
        s sVarC = (s) cVar.invoke(f15);
        if (sVarC == null) {
            sVarC = ((s) cVar.invoke(f13)).c();
        }
        s sVar = sVarC;
        Object objD = d(new n(j2Var, f13, sVar, 56), new r1(mVar, j2Var, f13, f14, sVar), Long.MIN_VALUE, new p1(0, eVar), iVar);
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        qy.b0 b0Var = qy.b0.f48488a;
        if (objD != aVar) {
            objD = b0Var;
        }
        return objD == aVar ? objD : b0Var;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x015d  */
    /* JADX WARN: Code duplicated, block: B:68:0x016a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static final Object d(n nVar, i iVar, long j11, final fz.c cVar, xy.c cVar2) {
        q1 q1Var;
        final kotlin.jvm.internal.y yVar;
        final n nVar2;
        n nVar3;
        kotlin.jvm.internal.y yVar2;
        Object objP;
        fz.c cVar3;
        l lVar;
        l lVar2;
        Object objP2;
        final i iVar2 = iVar;
        if (cVar2 instanceof q1) {
            q1Var = (q1) cVar2;
            int i11 = q1Var.f3648f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                q1Var.f3648f = i11 - Integer.MIN_VALUE;
            } else {
                q1Var = new q1(cVar2);
            }
        } else {
            q1Var = new q1(cVar2);
        }
        q1 q1Var2 = q1Var;
        Object obj = q1Var2.f3647e;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = q1Var2.f3648f;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            final Object objH = iVar2.h(0L);
            final s sVarF = iVar2.f(0L);
            yVar = new kotlin.jvm.internal.y();
            if (j11 == Long.MIN_VALUE) {
                try {
                    final float fN = n(q1Var2.getContext());
                    nVar2 = nVar;
                    try {
                        fz.c cVar4 = new fz.c() { // from class: b0.l1
                            @Override // fz.c
                            public final Object invoke(Object obj2) {
                                long jLongValue = ((Long) obj2).longValue();
                                i iVar3 = iVar2;
                                j2 j2VarE = iVar3.e();
                                Object objI = iVar3.i();
                                n nVar4 = nVar2;
                                l lVar3 = new l(objH, j2VarE, sVarF, jLongValue, objI, jLongValue, new m1(1, nVar4));
                                e.m(lVar3, jLongValue, fN, iVar3, nVar4, cVar);
                                yVar.f38361a = lVar3;
                                return qy.b0.f48488a;
                            }
                        };
                        yVar2 = yVar;
                        try {
                            q1Var2.f3643a = nVar2;
                            q1Var2.f3644b = iVar2;
                            q1Var2.f3645c = cVar;
                            q1Var2.f3646d = yVar2;
                            q1Var2.f3648f = 1;
                            if (iVar2.c()) {
                                objP = t(cVar4, q1Var2);
                            } else {
                                objP = l1.t.x(q1Var2.getContext()).p(new o1(cVar4, 0), q1Var2);
                            }
                            if (objP != aVar) {
                                nVar3 = nVar2;
                                cVar3 = cVar;
                                yVar = yVar2;
                            }
                            return aVar;
                        } catch (CancellationException e8) {
                            e = e8;
                            nVar3 = nVar2;
                            yVar = yVar2;
                            lVar = (l) yVar.f38361a;
                            if (lVar != null) {
                                lVar.f3595i.setValue(Boolean.FALSE);
                            }
                            lVar2 = (l) yVar.f38361a;
                            if (lVar2 != null) {
                                nVar3.f3618f = false;
                            }
                            throw e;
                        }
                    } catch (CancellationException e10) {
                        e = e10;
                        nVar3 = nVar2;
                        lVar = (l) yVar.f38361a;
                        if (lVar != null) {
                            lVar.f3595i.setValue(Boolean.FALSE);
                        }
                        lVar2 = (l) yVar.f38361a;
                        if (lVar2 != null) {
                            nVar3.f3618f = false;
                        }
                        throw e;
                    }
                } catch (CancellationException e11) {
                    e = e11;
                    nVar2 = nVar;
                }
            } else {
                yVar2 = yVar;
                try {
                    l lVar3 = new l(objH, iVar2.e(), sVarF, j11, iVar2.i(), j11, new m1(0, nVar));
                    m(lVar3, j11, n(q1Var2.getContext()), iVar2, nVar, cVar);
                    yVar2.f38361a = lVar3;
                    nVar3 = nVar;
                    iVar2 = iVar;
                    cVar3 = cVar;
                    yVar = yVar2;
                } catch (CancellationException e12) {
                    e = e12;
                    nVar3 = nVar;
                    yVar = yVar2;
                    lVar = (l) yVar.f38361a;
                    if (lVar != null) {
                        lVar.f3595i.setValue(Boolean.FALSE);
                    }
                    lVar2 = (l) yVar.f38361a;
                    if (lVar2 != null && lVar2.f3593g == nVar3.f3616d) {
                        nVar3.f3618f = false;
                    }
                    throw e;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yVar = q1Var2.f3646d;
            cVar3 = q1Var2.f3645c;
            iVar2 = q1Var2.f3644b;
            nVar3 = q1Var2.f3643a;
            try {
                com.bumptech.glide.e.F(obj);
            } catch (CancellationException e13) {
                e = e13;
                lVar = (l) yVar.f38361a;
                if (lVar != null) {
                    lVar.f3595i.setValue(Boolean.FALSE);
                }
                lVar2 = (l) yVar.f38361a;
                if (lVar2 != null) {
                    nVar3.f3618f = false;
                }
                throw e;
            }
        }
        do {
            Object obj2 = yVar.f38361a;
            kotlin.jvm.internal.m.c(obj2);
            if (!((Boolean) ((l) obj2).f3595i.getValue()).booleanValue()) {
                return qy.b0.f48488a;
            }
            final float fN2 = n(q1Var2.getContext());
            final kotlin.jvm.internal.y yVar3 = yVar;
            final fz.c cVar5 = cVar3;
            final i iVar3 = iVar2;
            final n nVar4 = nVar3;
            try {
                fz.c cVar6 = new fz.c() { // from class: b0.n1
                    @Override // fz.c
                    public final Object invoke(Object obj3) {
                        long jLongValue = ((Long) obj3).longValue();
                        Object obj4 = yVar3.f38361a;
                        kotlin.jvm.internal.m.c(obj4);
                        e.m((l) obj4, jLongValue, fN2, iVar3, nVar4, cVar5);
                        return qy.b0.f48488a;
                    }
                };
                yVar = yVar3;
                iVar2 = iVar3;
                nVar3 = nVar4;
                cVar3 = cVar5;
                q1Var2.f3643a = nVar3;
                q1Var2.f3644b = iVar2;
                q1Var2.f3645c = cVar3;
                q1Var2.f3646d = yVar;
                q1Var2.f3648f = 2;
                if (iVar2.c()) {
                    objP2 = t(cVar6, q1Var2);
                } else {
                    objP2 = l1.t.x(q1Var2.getContext()).p(new o1(cVar6, 0), q1Var2);
                }
            } catch (CancellationException e14) {
                e = e14;
                yVar = yVar3;
                nVar3 = nVar4;
                lVar = (l) yVar.f38361a;
                if (lVar != null) {
                    lVar.f3595i.setValue(Boolean.FALSE);
                }
                lVar2 = (l) yVar.f38361a;
                if (lVar2 != null) {
                    nVar3.f3618f = false;
                }
                throw e;
            }
        } while (objP2 != aVar);
        return aVar;
    }

    public static /* synthetic */ Object e(float f5, float f11, m mVar, fz.e eVar, xy.i iVar, int i11) {
        if ((i11 & 8) != 0) {
            mVar = q(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 7);
        }
        return c(f5, f11, CropImageView.DEFAULT_ASPECT_RATIO, mVar, eVar, iVar);
    }

    public static final Object f(n nVar, x xVar, boolean z11, fz.c cVar, xy.c cVar2) {
        Object objD = d(nVar, new w(xVar, nVar.f3613a, nVar.f3614b.getValue(), nVar.f3615c), z11 ? nVar.f3616d : Long.MIN_VALUE, cVar, cVar2);
        return objD == wy.a.COROUTINE_SUSPENDED ? objD : qy.b0.f48488a;
    }

    public static final h0 g(j0 j0Var, float f5, float f11, g0 g0Var, String str, l1.n nVar, int i11, int i12) {
        if ((i12 & 8) != 0) {
            str = "FloatAnimation";
        }
        return j(j0Var, Float.valueOf(f5), Float.valueOf(f11), f3496j, g0Var, str, nVar, 33208 | ((i11 << 3) & 458752), 0);
    }

    public static final Object h(n nVar, Float f5, m mVar, boolean z11, fz.c cVar, xy.c cVar2) {
        Object objD = d(nVar, new r1(mVar, nVar.f3613a, nVar.f3614b.getValue(), f5, nVar.f3615c), z11 ? nVar.f3616d : Long.MIN_VALUE, cVar, cVar2);
        return objD == wy.a.COROUTINE_SUSPENDED ? objD : qy.b0.f48488a;
    }

    public static /* synthetic */ Object i(n nVar, Float f5, m mVar, boolean z11, fz.c cVar, xy.c cVar2, int i11) {
        if ((i11 & 2) != 0) {
            mVar = q(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 7);
        }
        m mVar2 = mVar;
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        boolean z12 = z11;
        if ((i11 & 8) != 0) {
            cVar = new au.a(26);
        }
        return h(nVar, f5, mVar2, z12, cVar, cVar2);
    }

    public static final h0 j(j0 j0Var, Number number, Number number2, j2 j2Var, g0 g0Var, String str, l1.n nVar, int i11, int i12) {
        j0 j0Var2;
        Number number3;
        Number number4;
        g0 g0Var2;
        l1.s sVar = (l1.s) nVar;
        Object objQ = sVar.Q();
        l1.g gVar = l1.m.f39353a;
        if (objQ == gVar) {
            j0Var2 = j0Var;
            number3 = number;
            number4 = number2;
            g0Var2 = g0Var;
            h0 h0Var = new h0(j0Var2, number3, number4, j2Var, g0Var2);
            sVar.o0(h0Var);
            objQ = h0Var;
        } else {
            j0Var2 = j0Var;
            number3 = number;
            number4 = number2;
            g0Var2 = g0Var;
        }
        h0 h0Var2 = (h0) objQ;
        boolean z11 = (((57344 & i11) ^ 24576) > 16384 && sVar.h(g0Var2)) || (i11 & 24576) == 16384;
        Object objQ2 = sVar.Q();
        if (z11 || objQ2 == gVar) {
            objQ2 = new k0(number3, h0Var2, number4, g0Var2);
            sVar.o0(objQ2);
        }
        l1.t.j((fz.a) objQ2, sVar);
        boolean zH = sVar.h(j0Var2);
        Object objQ3 = sVar.Q();
        if (zH || objQ3 == gVar) {
            objQ3 = new au.d1(6, j0Var2, h0Var2);
            sVar.o0(objQ3);
        }
        l1.t.c(h0Var2, (fz.c) objQ3, sVar);
        return h0Var2;
    }

    public static final s k(s sVar) {
        s sVarC = sVar.c();
        int iB = sVarC.b();
        for (int i11 = 0; i11 < iB; i11++) {
            sVarC.e(i11, sVar.a(i11));
        }
        return sVarC;
    }

    public static n l(n nVar, float f5, float f11, int i11) {
        if ((i11 & 1) != 0) {
            f5 = ((Number) nVar.f3614b.getValue()).floatValue();
        }
        if ((i11 & 2) != 0) {
            f11 = ((o) nVar.f3615c).f3626a;
        }
        return new n(nVar.f3613a, Float.valueOf(f5), new o(f11), nVar.f3616d, nVar.f3617e, nVar.f3618f);
    }

    public static final void m(l lVar, long j11, float f5, i iVar, n nVar, fz.c cVar) {
        long jD = f5 == CropImageView.DEFAULT_ASPECT_RATIO ? iVar.d() : (long) ((j11 - lVar.f3589c) / f5);
        lVar.f3593g = j11;
        lVar.f3591e.setValue(iVar.h(jD));
        lVar.f3592f = iVar.f(jD);
        if (iVar.g(jD)) {
            lVar.f3594h = lVar.f3593g;
            lVar.f3595i.setValue(Boolean.FALSE);
        }
        s(lVar, nVar);
        cVar.invoke(lVar);
    }

    public static final float n(vy.i iVar) {
        z1.s sVar = (z1.s) iVar.get(z1.c.R);
        float fE = sVar != null ? sVar.e() : 1.0f;
        if (fE >= CropImageView.DEFAULT_ASPECT_RATIO) {
            return fE;
        }
        t0.b("negative scale factor");
        return fE;
    }

    public static g0 o(y yVar, u0 u0Var, int i11) {
        if ((i11 & 2) != 0) {
            u0Var = u0.Restart;
        }
        return new g0(yVar, u0Var, 0);
    }

    public static final j0 p(String str, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        Object objQ = sVar.Q();
        if (objQ == l1.m.f39353a) {
            objQ = new j0();
            sVar.o0(objQ);
        }
        j0 j0Var = (j0) objQ;
        j0Var.a(sVar, 0);
        return j0Var;
    }

    public static i1 q(float f5, float f11, Object obj, int i11) {
        if ((i11 & 1) != 0) {
            f5 = 1.0f;
        }
        if ((i11 & 2) != 0) {
            f11 = 1500.0f;
        }
        if ((i11 & 4) != 0) {
            obj = null;
        }
        return new i1(f5, f11, obj);
    }

    public static i2 r(int i11, int i12, z zVar, int i13) {
        if ((i13 & 1) != 0) {
            i11 = LogSeverity.NOTICE_VALUE;
        }
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        if ((i13 & 4) != 0) {
            zVar = b0.f3438a;
        }
        return new i2(i11, i12, zVar);
    }

    public static final void s(l lVar, n nVar) {
        nVar.f3614b.setValue(lVar.f3591e.getValue());
        s sVar = nVar.f3615c;
        s sVar2 = lVar.f3592f;
        int iB = sVar.b();
        for (int i11 = 0; i11 < iB; i11++) {
            sVar.e(i11, sVar2.a(i11));
        }
        nVar.f3617e = lVar.f3594h;
        nVar.f3616d = lVar.f3593g;
        nVar.f3618f = ((Boolean) lVar.f3595i.getValue()).booleanValue();
    }

    public static final Object t(fz.c cVar, xy.c cVar2) {
        if (cVar2.getContext().get(z2.p1.f58644b) == null) {
            return l1.t.x(cVar2.getContext()).p(cVar, cVar2);
        }
        throw new ClassCastException();
    }
}
