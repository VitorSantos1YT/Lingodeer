package f0;

import i0.pKy.shrCcjmOhAmRC;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dv.e f26435a = new dv.e(20);

    /* JADX WARN: Code duplicated, block: B:23:0x006e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0079 A[LOOP:0: B:22:0x006c->B:26:0x0079, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0054 A[EDGE_INSN: B:31:0x0054->B:18:0x0054 BREAK  A[LOOP:0: B:22:0x006c->B:26:0x0079], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0060 -> B:21:0x0063). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(s2.b r8, s2.m r9, xy.a r10) {
        /*
            boolean r0 = r10 instanceof f0.u0
            if (r0 == 0) goto L13
            r0 = r10
            f0.u0 r0 = (f0.u0) r0
            int r1 = r0.f26443d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26443d = r1
            goto L18
        L13:
            f0.u0 r0 = new f0.u0
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f26442c
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.f26443d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            s2.m r8 = r0.f26441b
            s2.b r9 = r0.f26440a
            com.bumptech.glide.e.F(r10)
            r7 = r9
            r9 = r8
            r8 = r7
            goto L63
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            com.bumptech.glide.e.F(r10)
            r10 = r8
            s2.k0 r10 = (s2.k0) r10
            s2.m0 r10 = r10.f51327f
            s2.l r10 = r10.W
            java.lang.Object r10 = r10.f51328a
            int r2 = r10.size()
            r5 = r3
        L48:
            if (r5 >= r2) goto L7f
            java.lang.Object r6 = r10.get(r5)
            s2.t r6 = (s2.t) r6
            boolean r6 = r6.f51346d
            if (r6 == 0) goto L7c
        L54:
            r0.f26440a = r8
            r0.f26441b = r9
            r0.f26443d = r4
            s2.k0 r8 = (s2.k0) r8
            java.lang.Object r10 = r8.b(r9, r0)
            if (r10 != r1) goto L63
            return r1
        L63:
            s2.l r10 = (s2.l) r10
            java.lang.Object r10 = r10.f51328a
            int r2 = r10.size()
            r5 = r3
        L6c:
            if (r5 >= r2) goto L7f
            java.lang.Object r6 = r10.get(r5)
            s2.t r6 = (s2.t) r6
            boolean r6 = r6.f51346d
            if (r6 == 0) goto L79
            goto L54
        L79:
            int r5 = r5 + 1
            goto L6c
        L7c:
            int r5 = r5 + 1
            goto L48
        L7f:
            qy.b0 r8 = qy.b0.f48488a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.t2.b(s2.b, s2.m, xy.a):java.lang.Object");
    }

    public static final Object c(s2.w wVar, fz.e eVar, vy.d dVar) {
        Object objT0 = ((s2.m0) wVar).T0(new v0(dVar.getContext(), eVar, (vy.d) null), dVar);
        return objT0 == wy.a.COROUTINE_SUSPENDED ? objT0 : qy.b0.f48488a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(c2 c2Var, float f5, b0.i1 i1Var, xy.c cVar) {
        m1 m1Var;
        kotlin.jvm.internal.v vVar;
        if (cVar instanceof m1) {
            m1Var = (m1) cVar;
            int i11 = m1Var.f26367c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                m1Var.f26367c = i11 - Integer.MIN_VALUE;
            } else {
                m1Var = new m1(cVar);
            }
        } else {
            m1Var = new m1(cVar);
        }
        Object obj = m1Var.f26366b;
        Object obj2 = wy.a.COROUTINE_SUSPENDED;
        int i12 = m1Var.f26367c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            kotlin.jvm.internal.v vVar2 = new kotlin.jvm.internal.v();
            fz.e u0Var = new bp.u0(f5, i1Var, vVar2, (vy.d) null);
            m1Var.f26365a = vVar2;
            m1Var.f26367c = 1;
            if (c2Var.a(d0.l1.Default, u0Var, m1Var) == obj2) {
                return obj2;
            }
            vVar = vVar2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException(shrCcjmOhAmRC.ieZzgjKLB);
            }
            vVar = m1Var.f26365a;
            com.bumptech.glide.e.F(obj);
        }
        return new Float(vVar.f38358a);
    }
}
