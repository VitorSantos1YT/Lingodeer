package n5;

import androidx.datastore.core.CorruptionException;
import fr.q2;
import java.util.List;
import jt.t1;
import okhttp3.internal.platform.ZjS.OYAvlbfUyD;
import rz.z1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f43398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f43399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rz.b0 f43400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gp.r f43401d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f43403f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public z1 f43404g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ob.i f43406i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final dm.c f43409l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a00.e f43402e = new a00.e();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lp.j f43405h = new lp.j(1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final qy.q f43407j = com.bumptech.glide.d.v(new k(this, 1));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final qy.q f43408k = com.bumptech.glide.d.v(new k(this, 0));

    public v(z zVar, List list, b bVar, rz.b0 b0Var) {
        this.f43398a = zVar;
        this.f43399b = bVar;
        this.f43400c = b0Var;
        vy.d dVar = null;
        this.f43401d = new gp.r(new kr.w(this, dVar, 13));
        this.f43406i = new ob.i(this, list);
        this.f43409l = new dm.c(b0Var, new a0.o0(this, 23), new kb.e(this, dVar, 21));
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c1, code lost:
    
        if (r12 == r1) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(n5.v r10, n5.h0 r11, xy.c r12) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.v.c(n5.v, n5.h0, xy.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d(v vVar, xy.c cVar) {
        p pVar;
        a00.e eVar;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i11 = pVar.f43353e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                pVar.f43353e = i11 - Integer.MIN_VALUE;
            } else {
                pVar = new p(vVar, cVar);
            }
        } else {
            pVar = new p(vVar, cVar);
        }
        Object obj = pVar.f43351c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = pVar.f43353e;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            eVar = vVar.f43402e;
            pVar.f43349a = vVar;
            pVar.f43350b = eVar;
            pVar.f43353e = 1;
            if (eVar.b(pVar) == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a00.e eVar2 = pVar.f43350b;
            v vVar2 = pVar.f43349a;
            com.bumptech.glide.e.F(obj);
            eVar = eVar2;
            vVar = vVar2;
        }
        vy.d dVar = null;
        try {
            int i13 = vVar.f43403f + 1;
            vVar.f43403f = i13;
            if (i13 == 1) {
                vVar.f43404g = rz.e0.B(vVar.f43400c, null, null, new l(vVar, dVar, 1), 3);
            }
            return qy.b0.f48488a;
        } finally {
            eVar.a(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object e(v vVar, boolean z11, vy.d dVar) {
        r rVar;
        v vVar2;
        x0 x0Var;
        v vVar3;
        qy.l lVar;
        x0 x0Var2;
        if (dVar instanceof r) {
            rVar = (r) dVar;
            int i11 = rVar.f43368f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                rVar.f43368f = i11 - Integer.MIN_VALUE;
            } else {
                rVar = new r(vVar, dVar);
            }
        } else {
            rVar = new r(vVar, dVar);
        }
        Object objA = rVar.f43366d;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = rVar.f43368f;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objA);
            x0 x0VarB = vVar.f43405h.b();
            if (x0VarB instanceof y0) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            g0 g0VarG = vVar.g();
            rVar.f43363a = vVar;
            rVar.f43364b = x0VarB;
            rVar.f43365c = z11;
            rVar.f43368f = 1;
            Object objE = g0VarG.e(rVar);
            if (objE != aVar) {
                vVar2 = vVar;
                x0Var = x0VarB;
                objA = objE;
            }
            return aVar;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                vVar3 = rVar.f43363a;
                com.bumptech.glide.e.F(objA);
                lVar = (qy.l) objA;
                x0Var2 = (x0) lVar.f48495a;
                if (((Boolean) lVar.f48496b).booleanValue()) {
                    vVar3.f43405h.q(x0Var2);
                }
                return x0Var2;
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vVar3 = rVar.f43363a;
            com.bumptech.glide.e.F(objA);
            lVar = (qy.l) objA;
            x0Var2 = (x0) lVar.f48495a;
            if (((Boolean) lVar.f48496b).booleanValue()) {
                vVar3.f43405h.q(x0Var2);
            }
            return x0Var2;
        }
        z11 = rVar.f43365c;
        x0Var = rVar.f43364b;
        vVar2 = rVar.f43363a;
        com.bumptech.glide.e.F(objA);
        int iIntValue = ((Number) objA).intValue();
        boolean z12 = x0Var instanceof c;
        int i13 = z12 ? x0Var.f43426a : -1;
        if (z12 && iIntValue == i13) {
            return x0Var;
        }
        vy.d dVar2 = null;
        if (z11) {
            g0 g0VarG2 = vVar2.g();
            dv.b bVar = new dv.b(vVar2, null);
            rVar.f43363a = vVar2;
            rVar.f43364b = null;
            rVar.f43368f = 2;
            objA = g0VarG2.b(bVar, rVar);
            if (objA != aVar) {
                vVar3 = vVar2;
                lVar = (qy.l) objA;
                x0Var2 = (x0) lVar.f48495a;
                if (((Boolean) lVar.f48496b).booleanValue()) {
                    vVar3.f43405h.q(x0Var2);
                }
                return x0Var2;
            }
        } else {
            g0 g0VarG3 = vVar2.g();
            s sVar = new s(vVar2, i13, dVar2, 0);
            rVar.f43363a = vVar2;
            rVar.f43364b = null;
            rVar.f43368f = 3;
            objA = g0VarG3.a(sVar, rVar);
            if (objA != aVar) {
                vVar3 = vVar2;
                lVar = (qy.l) objA;
                x0Var2 = (x0) lVar.f48495a;
                if (((Boolean) lVar.f48496b).booleanValue()) {
                    vVar3.f43405h.q(x0Var2);
                }
                return x0Var2;
            }
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a5 A[Catch: CorruptionException -> 0x0065, TryCatch #1 {CorruptionException -> 0x0065, blocks: (B:20:0x0060, B:55:0x0105, B:25:0x006e, B:52:0x00e6, B:33:0x008b, B:41:0x00a5, B:43:0x00ab, B:37:0x0094, B:49:0x00d3), top: B:80:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:54:0x0103  */
    /* JADX WARN: Code duplicated, block: B:64:0x0143 A[Catch: all -> 0x0170, TryCatch #0 {all -> 0x0170, blocks: (B:62:0x0130, B:64:0x0143, B:65:0x014b), top: B:79:0x0130 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x014b A[Catch: all -> 0x0170, TRY_LEAVE, TryCatch #0 {all -> 0x0170, blocks: (B:62:0x0130, B:64:0x0143, B:65:0x014b), top: B:79:0x0130 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x015c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0164  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object f(v vVar, boolean z11, xy.c cVar) {
        t tVar;
        v vVar2;
        boolean z12;
        kotlin.jvm.internal.y yVar;
        kotlin.jvm.internal.y yVar2;
        CorruptionException corruptionException;
        kotlin.jvm.internal.w wVar;
        Throwable th2;
        CorruptionException corruptionException2;
        t1 t1Var;
        Object objB;
        kotlin.jvm.internal.y yVar3;
        kotlin.jvm.internal.w wVar2;
        int iHashCode;
        Object objE;
        v vVar3;
        int i11;
        Object obj;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i12 = tVar.K;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                tVar.K = i12 - Integer.MIN_VALUE;
            } else {
                tVar = new t(vVar, cVar);
            }
        } else {
            tVar = new t(vVar, cVar);
        }
        t tVar2 = tVar;
        Object objE2 = tVar2.f43386t;
        Object cVar2 = wy.a.COROUTINE_SUSPENDED;
        vy.d dVar = null;
        try {
            switch (tVar2.K) {
                case 0:
                    com.bumptech.glide.e.F(objE2);
                    if (z11) {
                        tVar2.f43380a = vVar;
                        tVar2.f43384e = z11;
                        tVar2.K = 1;
                        objE2 = vVar.i(tVar2);
                        if (objE2 != cVar2) {
                            if (objE2 != null) {
                                iHashCode = objE2.hashCode();
                            } else {
                                iHashCode = 0;
                            }
                            g0 g0VarG = vVar.g();
                            tVar2.f43380a = vVar;
                            tVar2.f43381b = objE2;
                            tVar2.f43384e = z11;
                            tVar2.f43385f = iHashCode;
                            tVar2.K = 2;
                            objE = g0VarG.e(tVar2);
                            if (objE != cVar2) {
                                vVar3 = vVar;
                                i11 = iHashCode;
                                obj = objE2;
                                objE2 = objE;
                                return new c(obj, i11, ((Number) objE2).intValue());
                            }
                        }
                    } else {
                        g0 g0VarG2 = vVar.g();
                        tVar2.f43380a = vVar;
                        tVar2.f43384e = z11;
                        tVar2.K = 3;
                        objE2 = g0VarG2.e(tVar2);
                        if (objE2 != cVar2) {
                            int iIntValue = ((Number) objE2).intValue();
                            g0 g0VarG3 = vVar.g();
                            s sVar = new s(vVar, iIntValue, dVar, 1);
                            tVar2.f43380a = vVar;
                            tVar2.f43384e = z11;
                            tVar2.K = 4;
                            objE2 = g0VarG3.a(sVar, tVar2);
                            if (objE2 == cVar2) {
                            }
                            return (c) objE2;
                        }
                    }
                    return cVar2;
                case 1:
                    z11 = tVar2.f43384e;
                    vVar = (v) tVar2.f43380a;
                    com.bumptech.glide.e.F(objE2);
                    if (objE2 != null) {
                        iHashCode = objE2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    g0 g0VarG4 = vVar.g();
                    tVar2.f43380a = vVar;
                    tVar2.f43381b = objE2;
                    tVar2.f43384e = z11;
                    tVar2.f43385f = iHashCode;
                    tVar2.K = 2;
                    objE = g0VarG4.e(tVar2);
                    if (objE != cVar2) {
                        vVar3 = vVar;
                        i11 = iHashCode;
                        obj = objE2;
                        objE2 = objE;
                        return new c(obj, i11, ((Number) objE2).intValue());
                    }
                    return cVar2;
                case 2:
                    i11 = tVar2.f43385f;
                    z11 = tVar2.f43384e;
                    obj = tVar2.f43381b;
                    vVar3 = (v) tVar2.f43380a;
                    try {
                        com.bumptech.glide.e.F(objE2);
                        return new c(obj, i11, ((Number) objE2).intValue());
                    } catch (CorruptionException e8) {
                        e = e8;
                        vVar = vVar3;
                        kotlin.jvm.internal.y yVar4 = new kotlin.jvm.internal.y();
                        b bVar = vVar.f43399b;
                        tVar2.f43380a = vVar;
                        tVar2.f43381b = e;
                        tVar2.f43382c = yVar4;
                        tVar2.f43383d = yVar4;
                        tVar2.f43384e = z11;
                        tVar2.K = 5;
                        Object objB2 = bVar.b(e);
                        if (objB2 != cVar2) {
                            vVar2 = vVar;
                            z12 = z11;
                            yVar = yVar4;
                            yVar2 = yVar;
                            corruptionException = e;
                            objE2 = objB2;
                            yVar.f38361a = objE2;
                            wVar = new kotlin.jvm.internal.w();
                            try {
                                t1Var = new t1(yVar2, vVar2, wVar, dVar, 1);
                                tVar2.f43380a = corruptionException;
                                tVar2.f43381b = yVar2;
                                tVar2.f43382c = wVar;
                                tVar2.f43383d = null;
                                tVar2.K = 6;
                                if (z12) {
                                    vVar2.getClass();
                                    objB = t1Var.invoke(tVar2);
                                } else {
                                    objB = vVar2.g().b(new q2(t1Var, dVar, 2), tVar2);
                                }
                                if (objB != cVar2) {
                                    yVar3 = yVar2;
                                    wVar2 = wVar;
                                    Object obj2 = yVar3.f38361a;
                                    cVar2 = new c(obj2, obj2 != null ? obj2.hashCode() : 0, wVar2.f38359a);
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                corruptionException2 = corruptionException;
                                cf.x.b(corruptionException2, th2);
                                throw corruptionException2;
                            }
                        }
                        return cVar2;
                    }
                case 3:
                    z11 = tVar2.f43384e;
                    vVar = (v) tVar2.f43380a;
                    com.bumptech.glide.e.F(objE2);
                    int iIntValue2 = ((Number) objE2).intValue();
                    g0 g0VarG5 = vVar.g();
                    s sVar2 = new s(vVar, iIntValue2, dVar, 1);
                    tVar2.f43380a = vVar;
                    tVar2.f43384e = z11;
                    tVar2.K = 4;
                    objE2 = g0VarG5.a(sVar2, tVar2);
                    if (objE2 == cVar2) {
                        return cVar2;
                    }
                    return (c) objE2;
                case 4:
                    boolean z13 = tVar2.f43384e;
                    com.bumptech.glide.e.F(objE2);
                    return (c) objE2;
                case 5:
                    z12 = tVar2.f43384e;
                    yVar = tVar2.f43383d;
                    kotlin.jvm.internal.y yVar5 = (kotlin.jvm.internal.y) tVar2.f43382c;
                    CorruptionException corruptionException3 = (CorruptionException) tVar2.f43381b;
                    v vVar4 = (v) tVar2.f43380a;
                    com.bumptech.glide.e.F(objE2);
                    vVar2 = vVar4;
                    yVar2 = yVar5;
                    corruptionException = corruptionException3;
                    yVar.f38361a = objE2;
                    wVar = new kotlin.jvm.internal.w();
                    t1Var = new t1(yVar2, vVar2, wVar, dVar, 1);
                    tVar2.f43380a = corruptionException;
                    tVar2.f43381b = yVar2;
                    tVar2.f43382c = wVar;
                    tVar2.f43383d = null;
                    tVar2.K = 6;
                    if (z12) {
                        vVar2.getClass();
                        objB = t1Var.invoke(tVar2);
                    } else {
                        objB = vVar2.g().b(new q2(t1Var, dVar, 2), tVar2);
                    }
                    if (objB != cVar2) {
                        yVar3 = yVar2;
                        wVar2 = wVar;
                        Object obj3 = yVar3.f38361a;
                        cVar2 = new c(obj3, obj3 != null ? obj3.hashCode() : 0, wVar2.f38359a);
                    }
                    return cVar2;
                case 6:
                    wVar2 = (kotlin.jvm.internal.w) tVar2.f43382c;
                    yVar3 = (kotlin.jvm.internal.y) tVar2.f43381b;
                    corruptionException2 = (CorruptionException) tVar2.f43380a;
                    try {
                        com.bumptech.glide.e.F(objE2);
                        Object obj4 = yVar3.f38361a;
                        cVar2 = new c(obj4, obj4 != null ? obj4.hashCode() : 0, wVar2.f38359a);
                        return cVar2;
                    } catch (Throwable th4) {
                        th2 = th4;
                        cf.x.b(corruptionException2, th2);
                        throw corruptionException2;
                    }
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (CorruptionException e10) {
            e = e10;
        }
    }

    @Override // n5.f
    public final Object a(fz.e eVar, xy.c cVar) {
        a1 a1Var = (a1) cVar.getContext().get(z0.f43434a);
        if (a1Var != null) {
            a1Var.a(this);
        }
        return rz.e0.M(new a1(a1Var, this), new kr.w(14, this, eVar, null), cVar);
    }

    public final g0 g() {
        return (g0) this.f43408k.getValue();
    }

    @Override // n5.f
    public final uz.i getData() {
        return this.f43401d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (r4.u(r0) == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(xy.c r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof n5.q
            if (r0 == 0) goto L13
            r0 = r6
            n5.q r0 = (n5.q) r0
            int r1 = r0.f43361e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f43361e = r1
            goto L18
        L13:
            n5.q r0 = new n5.q
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f43359c
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.f43361e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            int r1 = r0.f43358b
            n5.v r0 = r0.f43357a
            com.bumptech.glide.e.F(r6)     // Catch: java.lang.Throwable -> L2e
            goto L66
        L2e:
            r6 = move-exception
            goto L6d
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L38:
            n5.v r2 = r0.f43357a
            com.bumptech.glide.e.F(r6)
            goto L51
        L3e:
            com.bumptech.glide.e.F(r6)
            n5.g0 r6 = r5.g()
            r0.f43357a = r5
            r0.f43361e = r4
            java.lang.Object r6 = r6.e(r0)
            if (r6 != r1) goto L50
            goto L65
        L50:
            r2 = r5
        L51:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            ob.i r4 = r2.f43406i     // Catch: java.lang.Throwable -> L69
            r0.f43357a = r2     // Catch: java.lang.Throwable -> L69
            r0.f43358b = r6     // Catch: java.lang.Throwable -> L69
            r0.f43361e = r3     // Catch: java.lang.Throwable -> L69
            java.lang.Object r6 = r4.u(r0)     // Catch: java.lang.Throwable -> L69
            if (r6 != r1) goto L66
        L65:
            return r1
        L66:
            qy.b0 r6 = qy.b0.f48488a
            return r6
        L69:
            r0 = move-exception
            r1 = r6
            r6 = r0
            r0 = r2
        L6d:
            lp.j r0 = r0.f43405h
            n5.q0 r2 = new n5.q0
            r2.<init>(r1, r6)
            r0.q(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.v.h(xy.c):java.lang.Object");
    }

    public final Object i(xy.c cVar) {
        return ((c0) this.f43407j.getValue()).a(new gq.b(3, 2, null), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(Object obj, boolean z11, xy.c cVar) {
        u uVar;
        kotlin.jvm.internal.w wVar;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i11 = uVar.f43392d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                uVar.f43392d = i11 - Integer.MIN_VALUE;
            } else {
                uVar = new u(this, cVar);
            }
        } else {
            uVar = new u(this, cVar);
        }
        Object obj2 = uVar.f43390b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = uVar.f43392d;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj2);
            kotlin.jvm.internal.w wVar2 = new kotlin.jvm.internal.w();
            c0 c0Var = (c0) this.f43407j.getValue();
            ch.u uVar2 = new ch.u(wVar2, this, obj, z11, null);
            uVar.f43389a = wVar2;
            uVar.f43392d = 1;
            if (c0Var.b(uVar2, uVar) == aVar) {
                return aVar;
            }
            wVar = wVar2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wVar = uVar.f43389a;
            com.bumptech.glide.e.F(obj2);
        }
        return new Integer(wVar.f38359a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(v vVar, xy.c cVar) {
        n nVar;
        a00.e eVar;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i11 = nVar.f43330e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                nVar.f43330e = i11 - Integer.MIN_VALUE;
            } else {
                nVar = new n(vVar, cVar);
            }
        } else {
            nVar = new n(vVar, cVar);
        }
        Object obj = nVar.f43328c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = nVar.f43330e;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            eVar = vVar.f43402e;
            nVar.f43326a = vVar;
            nVar.f43327b = eVar;
            nVar.f43330e = 1;
            if (eVar.b(nVar) == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException(OYAvlbfUyD.XuTNDqGlJTLfV);
            }
            a00.e eVar2 = nVar.f43327b;
            v vVar2 = nVar.f43326a;
            com.bumptech.glide.e.F(obj);
            eVar = eVar2;
            vVar = vVar2;
        }
        try {
            int i13 = vVar.f43403f - 1;
            vVar.f43403f = i13;
            if (i13 == 0) {
                z1 z1Var = vVar.f43404g;
                if (z1Var != null) {
                    z1Var.cancel(null);
                }
                vVar.f43404g = null;
            }
            return qy.b0.f48488a;
        } finally {
            eVar.a(null);
        }
    }
}
