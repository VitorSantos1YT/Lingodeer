package f0;

import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f26277a = ((float) 0.125d) / 18;

    /* JADX WARN: Code duplicated, block: B:24:0x0077  */
    /* JADX WARN: Code duplicated, block: B:27:0x0089 A[LOOP:0: B:23:0x0075->B:27:0x0089, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x008d A[EDGE_INSN: B:54:0x008d->B:29:0x008d BREAK  A[LOOP:0: B:23:0x0075->B:27:0x0089], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0066 -> B:22:0x006b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(s2.b r17, long r18, xy.c r20) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.g0.a(s2.b, long, xy.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:30:0x00da A[LOOP:0: B:26:0x00c1->B:30:0x00da, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x00e6 A[EDGE_INSN: B:69:0x00e6->B:32:0x00e6 BREAK  A[LOOP:0: B:26:0x00c1->B:30:0x00da], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0177 -> B:63:0x017d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(s2.b r19, long r20, int r22, f0.b0 r23, xy.a r24) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.g0.b(s2.b, long, int, f0.b0, xy.a):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.jvm.internal.y] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static final Object c(s2.b bVar, long j11, xy.a aVar) {
        w wVar;
        Object obj;
        s2.t tVar;
        kotlin.jvm.internal.u uVar;
        if (aVar instanceof w) {
            wVar = (w) aVar;
            int i11 = wVar.f26480e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                wVar.f26480e = i11 - Integer.MIN_VALUE;
            } else {
                wVar = new w(aVar);
            }
        } else {
            wVar = new w(aVar);
        }
        Object obj2 = wVar.f26479d;
        wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
        int i12 = wVar.f26480e;
        try {
            if (i12 == 0) {
                com.bumptech.glide.e.F(obj2);
                s2.k0 k0Var = (s2.k0) bVar;
                if (!i(k0Var.f51327f.W, j11)) {
                    ?? r12 = k0Var.f51327f.W.f51328a;
                    int size = r12.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= size) {
                            obj = null;
                            break;
                        }
                        obj = r12.get(i13);
                        if (s2.s.d(((s2.t) obj).f51343a, j11)) {
                            break;
                        }
                        i13++;
                    }
                    tVar = (s2.t) obj;
                    if (tVar != null) {
                        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
                        kotlin.jvm.internal.y yVar2 = new kotlin.jvm.internal.y();
                        yVar2.f38361a = tVar;
                        long jB = k0Var.e().b();
                        kotlin.jvm.internal.u uVar2 = new kotlin.jvm.internal.u();
                        x xVar = new x(uVar2, yVar2, yVar, null);
                        wVar.f26476a = tVar;
                        wVar.f26477b = yVar;
                        wVar.f26478c = uVar2;
                        wVar.f26480e = 1;
                        if (k0Var.f(jB, xVar, wVar) == aVar2) {
                            return aVar2;
                        }
                        uVar = uVar2;
                        j11 = yVar;
                    }
                }
                return null;
            }
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uVar = wVar.f26478c;
            kotlin.jvm.internal.y yVar3 = wVar.f26477b;
            tVar = wVar.f26476a;
            com.bumptech.glide.e.F(obj2);
            j11 = yVar3;
            if (uVar.f38357a) {
                s2.t tVar2 = (s2.t) j11.f38361a;
                return tVar2 == null ? tVar : tVar2;
            }
            return null;
        } catch (PointerEventTimeoutCancellationException unused) {
            s2.t tVar3 = (s2.t) j11.f38361a;
            return tVar3 == null ? tVar : tVar3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:30:0x00da A[LOOP:0: B:26:0x00c1->B:30:0x00da, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x00e6 A[EDGE_INSN: B:69:0x00e6->B:32:0x00e6 BREAK  A[LOOP:0: B:26:0x00c1->B:30:0x00da], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x017a -> B:63:0x0180). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object d(s2.b r19, long r20, int r22, f0.b0 r23, xy.a r24) {
        /*
            Method dump skipped, instruction units count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.g0.d(s2.b, long, int, f0.b0, xy.a):java.lang.Object");
    }

    public static final Object e(s2.w wVar, fz.c cVar, fz.a aVar, fz.a aVar2, fz.e eVar, vy.d dVar) {
        Object objC = t2.c(wVar, new z(new cr.m(28), new kotlin.jvm.internal.x(), null, new t(cVar, 0), eVar, aVar2, new bp.r0(5, aVar), null), dVar);
        wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
        qy.b0 b0Var = qy.b0.f48488a;
        if (objC != aVar3) {
            objC = b0Var;
        }
        return objC == aVar3 ? objC : b0Var;
    }

    public static /* synthetic */ Object f(s2.w wVar, fz.c cVar, fz.a aVar, fz.e eVar, vy.d dVar, int i11) {
        if ((i11 & 1) != 0) {
            cVar = new dv.e(17);
        }
        return e(wVar, cVar, aVar, new cr.m(29), eVar, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x004c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0052  */
    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object g(s2.b r4, long r5, fz.c r7, xy.a r8) {
        /*
            boolean r0 = r8 instanceof f0.d0
            if (r0 == 0) goto L13
            r0 = r8
            f0.d0 r0 = (f0.d0) r0
            int r1 = r0.f26228d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26228d = r1
            goto L18
        L13:
            f0.d0 r0 = new f0.d0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f26227c
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.f26228d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            fz.c r4 = r0.f26226b
            s2.b r5 = r0.f26225a
            com.bumptech.glide.e.F(r8)
            r7 = r4
            r4 = r5
            goto L45
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            com.bumptech.glide.e.F(r8)
        L38:
            r0.f26225a = r4
            r0.f26226b = r7
            r0.f26228d = r3
            java.lang.Object r8 = a(r4, r5, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            s2.t r8 = (s2.t) r8
            if (r8 != 0) goto L4c
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4c:
            boolean r5 = s2.s.c(r8)
            if (r5 == 0) goto L55
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L55:
            r7.invoke(r8)
            long r5 = r8.f51343a
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.g0.g(s2.b, long, fz.c, xy.a):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008d  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a1 A[LOOP:0: B:25:0x008b->B:29:0x00a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x00aa A[EDGE_INSN: B:74:0x00aa->B:31:0x00aa BREAK  A[LOOP:0: B:25:0x008b->B:29:0x00a1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007c -> B:24:0x0082). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object h(s2.b r18, long r19, b0.p1 r21, xy.a r22) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.g0.h(s2.b, long, b0.p1, xy.a):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static final boolean i(s2.l lVar, long j11) {
        Object obj;
        ?? r9 = lVar.f51328a;
        int size = r9.size();
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                obj = null;
                break;
            }
            obj = r9.get(i11);
            if (s2.s.d(((s2.t) obj).f51343a, j11)) {
                break;
            }
            i11++;
        }
        s2.t tVar = (s2.t) obj;
        if (tVar != null && tVar.f51346d) {
            z11 = true;
        }
        return true ^ z11;
    }

    public static final float j(z2.p2 p2Var, int i11) {
        return i11 == 2 ? p2Var.g() * f26277a : p2Var.g();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008d  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a1 A[LOOP:0: B:25:0x008b->B:29:0x00a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x00aa A[EDGE_INSN: B:74:0x00aa->B:31:0x00aa BREAK  A[LOOP:0: B:25:0x008b->B:29:0x00a1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007c -> B:24:0x0082). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object k(s2.b r18, long r19, com.google.firebase.datastorage.a r21, xy.a r22) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.g0.k(s2.b, long, com.google.firebase.datastorage.a, xy.a):java.lang.Object");
    }
}
