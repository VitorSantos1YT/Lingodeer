package gq;

import bp.t3;
import com.lingodeer.data.env.Env;
import e6.q0;
import fr.i3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import rz.b2;
import rz.o0;
import rz.q1;
import rz.z1;
import uz.x0;
import vt.e1;
import vt.f1;
import vt.n0;
import vt.u0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f29633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dv.u0 f29634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f29635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f29636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f29637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s f29638f = s.f29628a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a00.e f29639g = new a00.e();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicLong f29640h = new AtomicLong(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public z1 f29641i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final wz.d f29642j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final wz.d f29643k;

    public u(u0 u0Var, dv.u0 u0Var2, n0 n0Var, i iVar, k kVar) {
        this.f29633a = u0Var;
        this.f29634b = u0Var2;
        this.f29635c = n0Var;
        this.f29636d = iVar;
        this.f29637e = kVar;
        b2 b2VarE = rz.e0.e();
        yz.f fVar = o0.f50940a;
        yz.e eVar = yz.e.f58387a;
        this.f29642j = rz.e0.c(ew.a.w(b2VarE, eVar));
        this.f29643k = rz.e0.c(ew.a.w(rz.e0.e(), eVar));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f5 A[EDGE_INSN: B:42:0x00f5->B:52:0x0111 BREAK  A[LOOP:0: B:44:0x00fb->B:61:0x00fb]] */
    /* JADX WARN: Code duplicated, block: B:43:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:46:0x0101  */
    /* JADX WARN: Code duplicated, block: B:54:0x0116  */
    /* JADX WARN: Code duplicated, block: B:56:0x013c  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object a(u uVar, long j11, int i11, xy.c cVar) {
        n nVar;
        List arrayList;
        long j12;
        int i12;
        long j13;
        int i13;
        long j14;
        int i14;
        List list;
        long j15;
        Iterator it;
        f1 f1Var;
        boolean z11;
        n0 n0Var = uVar.f29635c;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i15 = nVar.f29616f;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                nVar.f29616f = i15 - Integer.MIN_VALUE;
            } else {
                nVar = new n(uVar, cVar);
            }
        } else {
            nVar = new n(uVar, cVar);
        }
        Object objF = nVar.f29614d;
        Object obj = wy.a.COROUTINE_SUSPENDED;
        int i16 = nVar.f29616f;
        vy.d dVar = null;
        if (i16 != 0) {
            if (i16 == 1) {
                int i17 = nVar.f29612b;
                long j16 = nVar.f29611a;
                arrayList = nVar.f29613c;
                com.bumptech.glide.e.F(objF);
                i12 = i17;
                j12 = j16;
            } else {
                if (i16 == 2) {
                    i13 = nVar.f29612b;
                    j13 = nVar.f29611a;
                    arrayList = nVar.f29613c;
                    com.bumptech.glide.e.F(objF);
                    arrayList.add((f1) objF);
                    t3 t3Var = new t3(uVar, i13, dVar, 10);
                    nVar.f29613c = arrayList;
                    nVar.f29611a = j13;
                    nVar.f29612b = i13;
                    nVar.f29616f = 3;
                    objF = rz.e0.l(t3Var, nVar);
                    if (objF != obj) {
                        j14 = j13;
                        ry.m.d0(arrayList, (List) objF);
                        nVar.f29613c = arrayList;
                        nVar.f29611a = j14;
                        nVar.f29612b = i13;
                        nVar.f29616f = 4;
                        objF = uVar.g(nVar);
                        if (objF != obj) {
                            i14 = i13;
                            list = arrayList;
                            j15 = j14;
                        }
                    }
                    return obj;
                }
                if (i16 == 3) {
                    i13 = nVar.f29612b;
                    j14 = nVar.f29611a;
                    arrayList = nVar.f29613c;
                    com.bumptech.glide.e.F(objF);
                    ry.m.d0(arrayList, (List) objF);
                    nVar.f29613c = arrayList;
                    nVar.f29611a = j14;
                    nVar.f29612b = i13;
                    nVar.f29616f = 4;
                    objF = uVar.g(nVar);
                    if (objF != obj) {
                        i14 = i13;
                        list = arrayList;
                        j15 = j14;
                    }
                    return obj;
                }
                if (i16 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i14 = nVar.f29612b;
                j15 = nVar.f29611a;
                list = nVar.f29613c;
                com.bumptech.glide.e.F(objF);
            }
            list.add((f1) objF);
            if (list.isEmpty()) {
                it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        z11 = true;
                        break;
                    }
                    f1Var = (f1) it.next();
                    if (f1Var.f54223c && !f1Var.f54222b) {
                        z11 = false;
                        break;
                    }
                }
            } else {
                z11 = true;
                break;
            }
            list.toString();
            if (z11) {
                return new v(Long.valueOf(j15), i14, c0.FAILED, list);
            }
            com.google.android.material.datepicker.d.e(1, com.google.android.material.datepicker.d.e(22, com.google.android.material.datepicker.d.e(2, f10.e.b()))).f(new np.b(3));
            return new v(Long.valueOf(j15), i14, c0.SUCCESS, list);
        }
        com.bumptech.glide.e.F(objF);
        uVar.f29636d.a();
        arrayList = new ArrayList();
        fr.o0 o0Var = (fr.o0) n0Var;
        Env env = o0Var.f27733a;
        if (env.fbDbToken == null && !env.isUnloginUser()) {
            dv.u0 u0Var = uVar.f29634b;
            String strW = o0Var.w();
            q0 q0Var = new q0(uVar, dVar, 28);
            nVar.f29613c = arrayList;
            j12 = j11;
            nVar.f29611a = j12;
            i12 = i11;
            nVar.f29612b = i12;
            nVar.f29616f = 1;
            if (ub.a.Y(u0Var, strW, q0Var, nVar) != obj) {
            }
            return obj;
        }
        j12 = j11;
        i12 = i11;
        u0 u0Var2 = uVar.f29633a;
        nVar.f29613c = arrayList;
        nVar.f29611a = j12;
        nVar.f29612b = i12;
        nVar.f29616f = 2;
        objF = ((i3) u0Var2).f(nVar);
        if (objF != obj) {
            j13 = j12;
            i13 = i12;
            arrayList.add((f1) objF);
            t3 t3Var2 = new t3(uVar, i13, dVar, 10);
            nVar.f29613c = arrayList;
            nVar.f29611a = j13;
            nVar.f29612b = i13;
            nVar.f29616f = 3;
            objF = rz.e0.l(t3Var2, nVar);
            if (objF != obj) {
                j14 = j13;
                ry.m.d0(arrayList, (List) objF);
                nVar.f29613c = arrayList;
                nVar.f29611a = j14;
                nVar.f29612b = i13;
                nVar.f29616f = 4;
                objF = uVar.g(nVar);
                if (objF != obj) {
                    i14 = i13;
                    list = arrayList;
                    j15 = j14;
                    list.add((f1) objF);
                    if (list.isEmpty()) {
                        it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                z11 = true;
                                break;
                            }
                            f1Var = (f1) it.next();
                            if (f1Var.f54223c) {
                            }
                        }
                    } else {
                        z11 = true;
                        break;
                    }
                    list.toString();
                    if (z11) {
                        return new v(Long.valueOf(j15), i14, c0.FAILED, list);
                    }
                    com.google.android.material.datepicker.d.e(1, com.google.android.material.datepicker.d.e(22, com.google.android.material.datepicker.d.e(2, f10.e.b()))).f(new np.b(3));
                    return new v(Long.valueOf(j15), i14, c0.SUCCESS, list);
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(u uVar, xy.c cVar) {
        r rVar;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i11 = rVar.f29627c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                rVar.f29627c = i11 - Integer.MIN_VALUE;
            } else {
                rVar = new r(uVar, cVar);
            }
        } else {
            rVar = new r(uVar, cVar);
        }
        Object objU = rVar.f29625a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = rVar.f29627c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objU);
            uz.i iVar = (uz.i) uVar.f29638f.invoke(((fr.o0) uVar.f29635c).w());
            rVar.f29627c = 1;
            objU = x0.u(iVar, rVar);
            if (objU == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objU);
        }
        if (((Boolean) objU).booleanValue()) {
            e1 step = e1.FLUENT;
            kotlin.jvm.internal.m.f(step, "step");
            return new f1(step, true, false);
        }
        e1 step2 = e1.FLUENT;
        kotlin.jvm.internal.m.f(step2, "step");
        return new f1(step2, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c1 A[Catch: all -> 0x0169, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0169, blocks: (B:27:0x00af, B:31:0x00c1, B:47:0x00fb, B:51:0x0106, B:53:0x010a, B:57:0x016b, B:59:0x016f, B:76:0x01b6, B:77:0x01bb), top: B:82:0x00af }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c9 A[Catch: all -> 0x0059, TRY_ENTER, TryCatch #0 {all -> 0x0059, blocks: (B:29:0x00b9, B:33:0x00c9, B:37:0x00e4, B:41:0x00ed, B:45:0x00f4, B:49:0x0103, B:17:0x0054), top: B:80:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fb A[Catch: all -> 0x0169, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0169, blocks: (B:27:0x00af, B:31:0x00c1, B:47:0x00fb, B:51:0x0106, B:53:0x010a, B:57:0x016b, B:59:0x016f, B:76:0x01b6, B:77:0x01bb), top: B:82:0x00af }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0103 A[Catch: all -> 0x0059, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0059, blocks: (B:29:0x00b9, B:33:0x00c9, B:37:0x00e4, B:41:0x00ed, B:45:0x00f4, B:49:0x0103, B:17:0x0054), top: B:80:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0106 A[Catch: all -> 0x0169, TRY_ENTER, TryCatch #1 {all -> 0x0169, blocks: (B:27:0x00af, B:31:0x00c1, B:47:0x00fb, B:51:0x0106, B:53:0x010a, B:57:0x016b, B:59:0x016f, B:76:0x01b6, B:77:0x01bb), top: B:82:0x00af }] */
    /* JADX WARN: Code duplicated, block: B:53:0x010a A[Catch: all -> 0x0169, TryCatch #1 {all -> 0x0169, blocks: (B:27:0x00af, B:31:0x00c1, B:47:0x00fb, B:51:0x0106, B:53:0x010a, B:57:0x016b, B:59:0x016f, B:76:0x01b6, B:77:0x01bb), top: B:82:0x00af }] */
    /* JADX WARN: Code duplicated, block: B:57:0x016b A[Catch: all -> 0x0169, TryCatch #1 {all -> 0x0169, blocks: (B:27:0x00af, B:31:0x00c1, B:47:0x00fb, B:51:0x0106, B:53:0x010a, B:57:0x016b, B:59:0x016f, B:76:0x01b6, B:77:0x01bb), top: B:82:0x00af }] */
    /* JADX WARN: Code duplicated, block: B:59:0x016f A[Catch: all -> 0x0169, TRY_LEAVE, TryCatch #1 {all -> 0x0169, blocks: (B:27:0x00af, B:31:0x00c1, B:47:0x00fb, B:51:0x0106, B:53:0x010a, B:57:0x016b, B:59:0x016f, B:76:0x01b6, B:77:0x01bb), top: B:82:0x00af }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0183  */
    /* JADX WARN: Code duplicated, block: B:68:0x0188  */
    /* JADX WARN: Code duplicated, block: B:70:0x018c  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b6 A[Catch: all -> 0x0169, TRY_ENTER, TryCatch #1 {all -> 0x0169, blocks: (B:27:0x00af, B:31:0x00c1, B:47:0x00fb, B:51:0x0106, B:53:0x010a, B:57:0x016b, B:59:0x016f, B:76:0x01b6, B:77:0x01bb), top: B:82:0x00af }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.jvm.internal.u, kotlin.jvm.internal.y] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x01a8 -> B:73:0x01ab). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x01b4 -> B:74:0x01ae). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(int r17, xy.c r18) {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gq.u.c(int, xy.c):java.lang.Object");
    }

    public final void d(w wVar, v vVar) {
        if (wVar.f29650c.J(vVar)) {
            k kVar = this.f29637e;
            synchronized (kVar.f29597a) {
                try {
                    d0 d0Var = kVar.f29599c;
                    if (d0Var != null && d0Var.f29580a == wVar) {
                        e0 e0Var = d0Var.f29581b;
                        if (e0Var == e0.REGISTERED || e0Var == e0.RUNNING) {
                            kVar.f29599c = d0.a(d0Var, e0.TERMINATING);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Objects.toString(vVar.f29646c);
        }
    }

    public final w e(int i11) {
        boolean z11;
        d0 d0Var;
        w wVar = new w(this.f29640h.incrementAndGet(), i11);
        wz.d dVar = this.f29643k;
        rz.d0 d0Var2 = rz.d0.LAZY;
        t3 t3Var = new t3(this, wVar, i11, (vy.d) null, 9);
        boolean z12 = true;
        wVar.f29652e = rz.e0.B(dVar, null, d0Var2, t3Var, 1);
        ((q1) wVar.a()).invokeOnCompletion(new com.google.accompanist.permissions.a(19, this, wVar));
        k kVar = this.f29637e;
        synchronized (kVar.f29597a) {
            if (kVar.f29598b) {
                z11 = false;
            } else {
                kVar.f29599c = new d0(wVar, e0.REGISTERED);
                z11 = true;
            }
        }
        if (!z11) {
            ((q1) wVar.a()).cancel(null);
            d(wVar, new v(null, i11, c0.BLOCKED, ry.r.f50854a));
            return null;
        }
        k kVar2 = this.f29637e;
        synchronized (kVar2.f29597a) {
            if (!kVar2.f29598b && (d0Var = kVar2.f29599c) != null && d0Var.f29580a == wVar && d0Var.f29581b == e0.REGISTERED && ((q1) wVar.a()).start()) {
                kVar2.f29599c = d0.a(d0Var, e0.RUNNING);
            } else {
                z12 = false;
            }
        }
        if (z12) {
            return wVar;
        }
        d(wVar, new v(null, i11, c0.BLOCKED, ry.r.f50854a));
        ((q1) wVar.a()).cancel(null);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006b  */
    /* JADX WARN: Code duplicated, block: B:31:0x006d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(xy.c cVar) {
        m mVar;
        int i11;
        rz.t tVar;
        int i12;
        v vVar;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i13 = mVar.f29610d;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                mVar.f29610d = i13 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object objO = mVar.f29608b;
        Object obj = wy.a.COROUTINE_SUSPENDED;
        int i14 = mVar.f29610d;
        if (i14 == 0) {
            com.bumptech.glide.e.F(objO);
            int i15 = ((fr.o0) this.f29635c).f27733a.keyLanguage;
            mVar.f29607a = i15;
            mVar.f29610d = 1;
            Object objC = c(i15, mVar);
            if (objC != obj) {
                i11 = i15;
                objO = objC;
            }
            return obj;
        }
        if (i14 == 1) {
            i11 = mVar.f29607a;
            com.bumptech.glide.e.F(objO);
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i12 = mVar.f29607a;
            com.bumptech.glide.e.F(objO);
        }
        vVar = (v) objO;
        if (vVar == null) {
            return vVar;
        }
        i11 = i12;
        return new v(null, i11, c0.BLOCKED, ry.r.f50854a);
        w wVar = (w) objO;
        if (wVar != null && (tVar = wVar.f29650c) != null) {
            mVar.f29607a = i11;
            mVar.f29610d = 2;
            objO = tVar.o(mVar);
            if (objO != obj) {
                i12 = i11;
                vVar = (v) objO;
                if (vVar == null) {
                    return vVar;
                }
                i11 = i12;
            }
            return obj;
        }
        return new v(null, i11, c0.BLOCKED, ry.r.f50854a);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:43:0x010c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010d, code lost:
    
        if (r10 == r2) goto L45;
     */
    /* JADX WARN: Type inference failed for: r1v14, types: [com.lingodeer.network.model.ApiResponse$Success, vy.d] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(xy.c r18) throws javax.crypto.BadPaddingException, javax.crypto.NoSuchPaddingException, javax.crypto.IllegalBlockSizeException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gq.u.g(xy.c):java.lang.Object");
    }
}
