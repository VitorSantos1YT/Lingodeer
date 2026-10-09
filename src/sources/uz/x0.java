package uz;

import dl.ExOZ.xItStCyvVEZ;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import rt.t6;
import rz.z1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.android.billingclient.api.a f53434a = new com.android.billingclient.api.a(xItStCyvVEZ.lDXOgLlt, 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.android.billingclient.api.a f53435b = new com.android.billingclient.api.a("NONE", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.android.billingclient.api.a f53436c = new com.android.billingclient.api.a("PENDING", 2);

    public static final r0 A(i iVar, rz.b0 b0Var, f1 f1Var, Object obj) {
        com.android.billingclient.api.d0 d0VarL = l(iVar);
        i1 i1VarC = c(obj);
        rz.e0.A(b0Var, (vy.i) d0VarL.f7500d, f1Var.equals(a1.f53254a) ? rz.d0.DEFAULT : rz.d0.UNDISPATCHED, new h0(f1Var, (i) d0VarL.f7498b, i1VarC, obj, (vy.d) null));
        return new r0(i1VarC);
    }

    public static final vz.i B(i iVar, fz.f fVar) {
        int i11 = a0.f53253a;
        return new vz.i(fVar, iVar, vy.j.f54321a, -2, tz.a.SUSPEND);
    }

    public static final w0 a(int i11, int i12, tz.a aVar) {
        if (i11 < 0) {
            throw new IllegalArgumentException(nv.p.j(i11, "replay cannot be negative, but was ").toString());
        }
        if (i12 < 0) {
            throw new IllegalArgumentException(nv.p.j(i12, "extraBufferCapacity cannot be negative, but was ").toString());
        }
        if (i11 <= 0 && i12 <= 0 && aVar != tz.a.SUSPEND) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + aVar).toString());
        }
        int i13 = i12 + i11;
        if (i13 < 0) {
            i13 = Integer.MAX_VALUE;
        }
        return new w0(i11, i13, aVar);
    }

    public static /* synthetic */ w0 b(int i11, int i12, tz.a aVar) {
        int i13 = (i12 & 1) != 0 ? 0 : 1;
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            aVar = tz.a.SUSPEND;
        }
        return a(i13, i11, aVar);
    }

    public static final i1 c(Object obj) {
        if (obj == null) {
            obj = vz.b.f54329b;
        }
        return new i1(obj);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d(o1 o1Var, fz.f fVar, Throwable th2, xy.c cVar) throws IllegalAccessException, InvocationTargetException {
        o oVar;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i11 = oVar.f53375c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                oVar.f53375c = i11 - Integer.MIN_VALUE;
            } else {
                oVar = new o(cVar);
            }
        } else {
            oVar = new o(cVar);
        }
        Object obj = oVar.f53374b;
        Object obj2 = wy.a.COROUTINE_SUSPENDED;
        int i12 = oVar.f53375c;
        try {
            if (i12 == 0) {
                com.bumptech.glide.e.F(obj);
                oVar.f53373a = th2;
                oVar.f53375c = 1;
                if (fVar.invoke(o1Var, th2, oVar) == obj2) {
                    return obj2;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th2 = oVar.f53373a;
                com.bumptech.glide.e.F(obj);
            }
            return qy.b0.f48488a;
        } catch (Throwable th3) {
            if (th2 != null && th2 != th3) {
                cf.x.b(th3, th2);
            }
            throw th3;
        }
    }

    public static final void e(Object[] objArr, long j11, Object obj) {
        objArr[((int) j11) & (objArr.length - 1)] = obj;
    }

    public static i f(i iVar, int i11) {
        tz.a aVar = tz.a.SUSPEND;
        if (i11 < 0 && i11 != -2 && i11 != -1) {
            throw new IllegalArgumentException(nv.p.j(i11, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i11 == -1) {
            aVar = tz.a.DROP_OLDEST;
            i11 = 0;
        }
        int i12 = i11;
        tz.a aVar2 = aVar;
        return iVar instanceof vz.l ? vz.b.b((vz.l) iVar, null, i12, aVar2, 1) : new vz.f(iVar, null, i12, aVar2, 2);
    }

    public static final c g(fz.e eVar) {
        return new c(eVar, vy.j.f54321a, -2, tz.a.SUSPEND);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Serializable h(i iVar, j jVar, xy.c cVar) throws Throwable {
        t tVar;
        kotlin.jvm.internal.y yVar;
        rz.g1 g1Var;
        CancellationException cancellationException;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i11 = tVar.f53399c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                tVar.f53399c = i11 - Integer.MIN_VALUE;
            } else {
                tVar = new t(cVar);
            }
        } else {
            tVar = new t(cVar);
        }
        Object obj = tVar.f53398b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = tVar.f53399c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            kotlin.jvm.internal.y yVar2 = new kotlin.jvm.internal.y();
            try {
                j gVar = new g(jVar, yVar2);
                tVar.f53397a = yVar2;
                tVar.f53399c = 1;
                if (iVar.collect(gVar, tVar) == aVar) {
                    return aVar;
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                yVar = yVar2;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yVar = tVar.f53397a;
            try {
                com.bumptech.glide.e.F(obj);
                return null;
            } catch (Throwable th3) {
                th = th3;
            }
        }
        Throwable th4 = (Throwable) yVar.f38361a;
        if ((th4 != null && th4.equals(th)) || ((g1Var = (rz.g1) tVar.getContext().get(rz.z.f50978b)) != null && g1Var.isCancelled() && (cancellationException = g1Var.getCancellationException()) != null && cancellationException.equals(th))) {
            throw th;
        }
        if (th4 == null) {
            return th;
        }
        if (th instanceof CancellationException) {
            cf.x.b(th4, th);
            throw th4;
        }
        cf.x.b(th, th4);
        throw th;
    }

    public static final Object i(i iVar, fz.e eVar, vy.d dVar) {
        Object objCollect = f(z(eVar, iVar), 0).collect(vz.n.f54353a, dVar);
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        qy.b0 b0Var = qy.b0.f48488a;
        if (objCollect != aVar) {
            objCollect = b0Var;
        }
        return objCollect == aVar ? objCollect : b0Var;
    }

    public static final m0 j(i iVar, i iVar2, i iVar3, fz.g gVar) {
        return new m0(new i[]{iVar, iVar2, iVar3}, gVar);
    }

    public static final m0 k(i iVar, i iVar2, i iVar3, i iVar4, i iVar5, fz.i iVar6) {
        return new m0(new i[]{iVar, iVar2, iVar3, iVar4, iVar5}, iVar6);
    }

    public static final com.android.billingclient.api.d0 l(i iVar) {
        tz.l.D.getClass();
        int i11 = tz.k.f52704b;
        if (1 >= i11) {
            i11 = 1;
        }
        int i12 = i11 - 1;
        if (iVar instanceof vz.d) {
            vz.d dVar = (vz.d) iVar;
            tz.a aVar = dVar.f54334c;
            i iVarH = dVar.h();
            if (iVarH != null) {
                int i13 = dVar.f54333b;
                if (i13 != -3 && i13 != -2 && i13 != 0) {
                    i12 = i13;
                } else if (aVar != tz.a.SUSPEND || i13 == 0) {
                    i12 = 0;
                }
                return new com.android.billingclient.api.d0(i12, aVar, iVarH, dVar.f54332a);
            }
        }
        return new com.android.billingclient.api.d0(i12, tz.a.SUSPEND, iVar, vy.j.f54321a);
    }

    public static final d m(tz.h hVar) {
        return new d(hVar, true);
    }

    public static final i n(i1 i1Var, long j11) {
        if (j11 >= 0) {
            return j11 == 0 ? i1Var : new gp.r(new n(new au.o(j11, 23), i1Var, null), 11);
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative");
    }

    public static final i o(i iVar) {
        return ((iVar instanceof g1) || (iVar instanceof h)) ? iVar : new h(iVar);
    }

    public static final n9.n0 p(i iVar, int i11) {
        if (i11 >= 0) {
            return new n9.n0(iVar, i11, 1);
        }
        throw new IllegalArgumentException(nv.p.j(i11, "Drop count should be non-negative, but had ").toString());
    }

    public static final Object q(j jVar, i iVar, vy.d dVar) throws Throwable {
        s(jVar);
        Object objCollect = iVar.collect(jVar, dVar);
        return objCollect == wy.a.COROUTINE_SUSPENDED ? objCollect : qy.b0.f48488a;
    }

    public static final void s(j jVar) throws Throwable {
        if (jVar instanceof o1) {
            throw ((o1) jVar).f53376a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0072  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object t(i iVar, fz.e eVar, xy.c cVar) {
        e0 e0Var;
        kotlin.jvm.internal.y yVar;
        AbortFlowException e8;
        t6 t6Var;
        com.android.billingclient.api.a aVar = vz.b.f54329b;
        if (cVar instanceof e0) {
            e0Var = (e0) cVar;
            int i11 = e0Var.f53284d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                e0Var.f53284d = i11 - Integer.MIN_VALUE;
            } else {
                e0Var = new e0(cVar);
            }
        } else {
            e0Var = new e0(cVar);
        }
        Object obj = e0Var.f53283c;
        Object obj2 = wy.a.COROUTINE_SUSPENDED;
        int i12 = e0Var.f53284d;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            kotlin.jvm.internal.y yVar2 = new kotlin.jvm.internal.y();
            yVar2.f38361a = aVar;
            t6 t6Var2 = new t6(6, eVar, yVar2);
            try {
                e0Var.f53281a = yVar2;
                e0Var.f53282b = t6Var2;
                e0Var.f53284d = 1;
                if (iVar.collect(t6Var2, e0Var) == obj2) {
                    return obj2;
                }
                yVar = yVar2;
            } catch (AbortFlowException e10) {
                yVar = yVar2;
                e8 = e10;
                t6Var = t6Var2;
                if (e8.f38366a == t6Var) {
                    throw e8;
                }
                rz.e0.n(e0Var.getContext());
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t6Var = e0Var.f53282b;
            yVar = e0Var.f53281a;
            try {
                com.bumptech.glide.e.F(obj);
            } catch (AbortFlowException e11) {
                e8 = e11;
                if (e8.f38366a == t6Var) {
                    throw e8;
                }
                rz.e0.n(e0Var.getContext());
            }
        }
        Object obj3 = yVar.f38361a;
        if (obj3 != aVar) {
            return obj3;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0072  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object u(i iVar, vy.d dVar) {
        d0 d0Var;
        kotlin.jvm.internal.y yVar;
        AbortFlowException e8;
        b0 b0Var;
        com.android.billingclient.api.a aVar = vz.b.f54329b;
        if (dVar instanceof d0) {
            d0Var = (d0) dVar;
            int i11 = d0Var.f53275d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                d0Var.f53275d = i11 - Integer.MIN_VALUE;
            } else {
                d0Var = new d0(dVar);
            }
        } else {
            d0Var = new d0(dVar);
        }
        Object obj = d0Var.f53274c;
        Object obj2 = wy.a.COROUTINE_SUSPENDED;
        int i12 = d0Var.f53275d;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            kotlin.jvm.internal.y yVar2 = new kotlin.jvm.internal.y();
            yVar2.f38361a = aVar;
            b0 b0Var2 = new b0(yVar2, 0);
            try {
                d0Var.f53272a = yVar2;
                d0Var.f53273b = b0Var2;
                d0Var.f53275d = 1;
                if (iVar.collect(b0Var2, d0Var) == obj2) {
                    return obj2;
                }
                yVar = yVar2;
            } catch (AbortFlowException e10) {
                yVar = yVar2;
                e8 = e10;
                b0Var = b0Var2;
                if (e8.f38366a == b0Var) {
                    throw e8;
                }
                rz.e0.n(d0Var.getContext());
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b0Var = d0Var.f53273b;
            yVar = d0Var.f53272a;
            try {
                com.bumptech.glide.e.F(obj);
            } catch (AbortFlowException e11) {
                e8 = e11;
                if (e8.f38366a == b0Var) {
                    throw e8;
                }
                rz.e0.n(d0Var.getContext());
            }
        }
        Object obj3 = yVar.f38361a;
        if (obj3 != aVar) {
            return obj3;
        }
        throw new NoSuchElementException("Expected at least one element");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0064  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object v(i iVar, vy.d dVar) {
        f0 f0Var;
        kotlin.jvm.internal.y yVar;
        AbortFlowException e8;
        b0 b0Var;
        if (dVar instanceof f0) {
            f0Var = (f0) dVar;
            int i11 = f0Var.f53295d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                f0Var.f53295d = i11 - Integer.MIN_VALUE;
            } else {
                f0Var = new f0(dVar);
            }
        } else {
            f0Var = new f0(dVar);
        }
        Object obj = f0Var.f53294c;
        Object obj2 = wy.a.COROUTINE_SUSPENDED;
        int i12 = f0Var.f53295d;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            kotlin.jvm.internal.y yVar2 = new kotlin.jvm.internal.y();
            b0 b0Var2 = new b0(yVar2, 1);
            try {
                f0Var.f53292a = yVar2;
                f0Var.f53293b = b0Var2;
                f0Var.f53295d = 1;
                if (iVar.collect(b0Var2, f0Var) == obj2) {
                    return obj2;
                }
                yVar = yVar2;
            } catch (AbortFlowException e10) {
                yVar = yVar2;
                e8 = e10;
                b0Var = b0Var2;
                if (e8.f38366a == b0Var) {
                    throw e8;
                }
                rz.e0.n(f0Var.getContext());
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b0Var = f0Var.f53293b;
            yVar = f0Var.f53292a;
            try {
                com.bumptech.glide.e.F(obj);
            } catch (AbortFlowException e11) {
                e8 = e11;
                if (e8.f38366a == b0Var) {
                    throw e8;
                }
                rz.e0.n(f0Var.getContext());
            }
        }
        return yVar.f38361a;
    }

    public static final i w(i iVar, vy.i iVar2) {
        if (iVar2.get(rz.z.f50978b) == null) {
            if (iVar2.equals(vy.j.f54321a)) {
                return iVar;
            }
            return iVar instanceof vz.l ? vz.b.b((vz.l) iVar, iVar2, 0, null, 6) : new vz.f(iVar, iVar2, 0, null, 12);
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + iVar2).toString());
    }

    public static final i x(s0 s0Var, vy.i iVar, int i11, tz.a aVar) {
        return ((i11 == 0 || i11 == -3) && aVar == tz.a.SUSPEND) ? s0Var : new vz.f(i11, aVar, s0Var, iVar);
    }

    public static final z1 y(i iVar, rz.b0 b0Var) {
        return rz.e0.B(b0Var, null, null, new tp.f0(iVar, (vy.d) null, 4), 3);
    }

    public static final vz.i z(fz.e eVar, i iVar) {
        int i11 = a0.f53253a;
        return B(iVar, new dt.x(eVar, null));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    /* JADX WARN: Code duplicated, block: B:27:0x0066  */
    /* JADX WARN: Code duplicated, block: B:30:0x0072 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #1 {all -> 0x0034, blocks: (B:13:0x002e, B:24:0x0055, B:28:0x006a, B:30:0x0072, B:20:0x0047, B:23:0x0051), top: B:44:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0089  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L32;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0084 -> B:14:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(uz.j r6, tz.v r7, boolean r8, vy.d r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof uz.l
            if (r0 == 0) goto L13
            r0 = r9
            uz.l r0 = (uz.l) r0
            int r1 = r0.f53346f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53346f = r1
            goto L18
        L13:
            uz.l r0 = new uz.l
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f53345e
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.f53346f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L36
            boolean r8 = r0.f53344d
            tz.c r6 = r0.f53343c
            tz.v r7 = r0.f53342b
            uz.j r2 = r0.f53341a
            com.bumptech.glide.e.F(r9)     // Catch: java.lang.Throwable -> L34
        L31:
            r9 = r6
            r6 = r2
            goto L55
        L34:
            r6 = move-exception
            goto L90
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r7 = 0
            java.lang.String r7 = com.google.firebase.annotations.jjzf.kHfjNGauVgdF.MToyf
            r6.<init>(r7)
            throw r6
        L3f:
            boolean r8 = r0.f53344d
            tz.c r6 = r0.f53343c
            tz.v r7 = r0.f53342b
            uz.j r2 = r0.f53341a
            com.bumptech.glide.e.F(r9)     // Catch: java.lang.Throwable -> L34
            goto L6a
        L4b:
            com.bumptech.glide.e.F(r9)
            s(r6)
            tz.c r9 = r7.iterator()     // Catch: java.lang.Throwable -> L34
        L55:
            r0.f53341a = r6     // Catch: java.lang.Throwable -> L34
            r0.f53342b = r7     // Catch: java.lang.Throwable -> L34
            r0.f53343c = r9     // Catch: java.lang.Throwable -> L34
            r0.f53344d = r8     // Catch: java.lang.Throwable -> L34
            r0.f53346f = r4     // Catch: java.lang.Throwable -> L34
            java.lang.Object r2 = r9.a(r0)     // Catch: java.lang.Throwable -> L34
            if (r2 != r1) goto L66
            goto L86
        L66:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L6a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L34
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r9 == 0) goto L87
            java.lang.Object r9 = r6.c()     // Catch: java.lang.Throwable -> L34
            r0.f53341a = r2     // Catch: java.lang.Throwable -> L34
            r0.f53342b = r7     // Catch: java.lang.Throwable -> L34
            r0.f53343c = r6     // Catch: java.lang.Throwable -> L34
            r0.f53344d = r8     // Catch: java.lang.Throwable -> L34
            r0.f53346f = r3     // Catch: java.lang.Throwable -> L34
            java.lang.Object r9 = r2.emit(r9, r0)     // Catch: java.lang.Throwable -> L34
            if (r9 != r1) goto L31
        L86:
            return r1
        L87:
            if (r8 == 0) goto L8d
            r6 = 0
            r7.cancel(r6)
        L8d:
            qy.b0 r6 = qy.b0.f48488a
            return r6
        L90:
            throw r6     // Catch: java.lang.Throwable -> L91
        L91:
            r9 = move-exception
            if (r8 == 0) goto L97
            se.i.g(r7, r6)
        L97:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: uz.x0.r(uz.j, tz.v, boolean, vy.d):java.lang.Object");
    }
}
