package f0;

import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ad.a0 f26428a = new ad.a0(3, 4, null);

    /* JADX WARN: Code duplicated, block: B:17:0x003e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004b A[LOOP:0: B:19:0x0049->B:20:0x004b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x005f  */
    /* JADX WARN: Code duplicated, block: B:26:0x006a A[LOOP:1: B:22:0x005d->B:26:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0034 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003c -> B:18:0x003f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:23:0x005f
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(s2.b r8, xy.a r9) {
        /*
            boolean r0 = r9 instanceof f0.l2
            if (r0 == 0) goto L13
            r0 = r9
            f0.l2 r0 = (f0.l2) r0
            int r1 = r0.f26357c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26357c = r1
            goto L18
        L13:
            f0.l2 r0 = new f0.l2
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f26356b
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.f26357c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            s2.b r8 = r0.f26355a
            com.bumptech.glide.e.F(r9)
            goto L3f
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            com.bumptech.glide.e.F(r9)
        L34:
            r0.f26355a = r8
            r0.f26357c = r3
            java.lang.Object r9 = s2.b.Y(r8, r0)
            if (r9 != r1) goto L3f
            return r1
        L3f:
            s2.l r9 = (s2.l) r9
            java.lang.Object r2 = r9.f51328a
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L49:
            if (r6 >= r4) goto L57
            java.lang.Object r7 = r2.get(r6)
            s2.t r7 = (s2.t) r7
            r7.a()
            int r6 = r6 + 1
            goto L49
        L57:
            java.lang.Object r9 = r9.f51328a
            int r2 = r9.size()
        L5d:
            if (r5 >= r2) goto L6d
            java.lang.Object r4 = r9.get(r5)
            s2.t r4 = (s2.t) r4
            boolean r4 = r4.f51346d
            if (r4 == 0) goto L6a
            goto L34
        L6a:
            int r5 = r5 + 1
            goto L5d
        L6d:
            qy.b0 r8 = qy.b0.f48488a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.s2.a(s2.b, xy.a):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004a -> B:18:0x004d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(s2.b r5, boolean r6, s2.m r7, xy.a r8) {
        /*
            boolean r0 = r8 instanceof f0.j2
            if (r0 == 0) goto L13
            r0 = r8
            f0.j2 r0 = (f0.j2) r0
            int r1 = r0.f26329e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26329e = r1
            goto L18
        L13:
            f0.j2 r0 = new f0.j2
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f26328d
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.f26329e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            boolean r5 = r0.f26327c
            s2.m r6 = r0.f26326b
            s2.b r7 = r0.f26325a
            com.bumptech.glide.e.F(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4d
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            com.bumptech.glide.e.F(r8)
        L3c:
            r0.f26325a = r5
            r0.f26326b = r7
            r0.f26327c = r6
            r0.f26329e = r3
            s2.k0 r5 = (s2.k0) r5
            java.lang.Object r8 = r5.b(r7, r0)
            if (r8 != r1) goto L4d
            return r1
        L4d:
            s2.l r8 = (s2.l) r8
            boolean r2 = e(r8, r6)
            if (r2 == 0) goto L3c
            java.lang.Object r5 = r8.f51328a
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.s2.b(s2.b, boolean, s2.m, xy.a):java.lang.Object");
    }

    public static Object d(s2.w wVar, fz.c cVar, fz.f fVar, fz.c cVar2, vy.d dVar, int i11) {
        fz.c cVar3 = (i11 & 2) != 0 ? null : cVar;
        if ((i11 & 4) != 0) {
            fVar = f26428a;
        }
        Object objL = rz.e0.l(new b0.g(wVar, fVar, cVar3, (fz.c) null, (i11 & 8) != 0 ? null : cVar2, (vy.d) null), dVar);
        return objL == wy.a.COROUTINE_SUSPENDED ? objL : qy.b0.f48488a;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static boolean e(s2.l lVar, boolean z11) {
        ?? r9 = lVar.f51328a;
        int size = r9.size();
        int i11 = 0;
        while (true) {
            boolean zA = true;
            if (i11 >= size) {
                return true;
            }
            s2.t tVar = (s2.t) r9.get(i11);
            if (!z11) {
                zA = s2.s.a(tVar);
            } else if (tVar.b() || tVar.f51350h || !tVar.f51346d) {
                zA = false;
            }
            if (!zA) {
                return false;
            }
            i11++;
        }
    }

    public static rz.z1 f(rz.b0 b0Var, rz.g1 g1Var, fz.e eVar) {
        return rz.e0.B(b0Var, null, rz.d0.UNDISPATCHED, new a0.e0(g1Var, eVar, (vy.d) null), 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object g(s2.b bVar, s2.m mVar, xy.a aVar) {
        q2 q2Var;
        kotlin.jvm.internal.y yVar;
        if (aVar instanceof q2) {
            q2Var = (q2) aVar;
            int i11 = q2Var.f26416c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                q2Var.f26416c = i11 - Integer.MIN_VALUE;
            } else {
                q2Var = new q2(aVar);
            }
        } else {
            q2Var = new q2(aVar);
        }
        Object obj = q2Var.f26415b;
        wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
        int i12 = q2Var.f26416c;
        try {
            if (i12 == 0) {
                com.bumptech.glide.e.F(obj);
                kotlin.jvm.internal.y yVar2 = new kotlin.jvm.internal.y();
                yVar2.f38361a = w0.f26481a;
                s2.k0 k0Var = (s2.k0) bVar;
                long jB = k0Var.e().b();
                v0 v0Var = new v0(mVar, yVar2, (vy.d) null);
                q2Var.f26414a = yVar2;
                q2Var.f26416c = 1;
                if (k0Var.f(jB, v0Var, q2Var) == aVar2) {
                    return aVar2;
                }
                yVar = yVar2;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yVar = q2Var.f26414a;
                com.bumptech.glide.e.F(obj);
            }
            return yVar.f38361a;
        } catch (PointerEventTimeoutCancellationException unused) {
            return y0.f26499a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0082  */
    /* JADX WARN: Code duplicated, block: B:30:0x008e  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a0 A[LOOP:2: B:27:0x0080->B:33:0x00a0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d3 A[LOOP:1: B:23:0x006d->B:45:0x00d3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x007b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00b1 -> B:13:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object h(s2.b r17, s2.m r18, xy.a r19) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.s2.h(s2.b, s2.m, xy.a):java.lang.Object");
    }
}
