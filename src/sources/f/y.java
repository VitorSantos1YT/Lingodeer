package f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f26176b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(d0 d0Var, int i11) {
        super(1);
        this.f26175a = i11;
        this.f26176b = d0Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v5 java.lang.Object, still in use, count: 2, list:
          (r2v5 java.lang.Object) from 0x005f: PHI (r2 I:??) = (r2v2 java.lang.Object), (r2v5 java.lang.Object) binds: [B:24:0x005e, B:37:0x005f] A[DONT_GENERATE, DONT_INLINE]
          (r2v5 java.lang.Object) from 0x0057: CHECK_CAST (f.x) (r2v5 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // fz.c
    public final java.lang.Object invoke(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f26175a
            switch(r0) {
                case 0: goto L39;
                default: goto L5;
            }
        L5:
            f.a r5 = (f.a) r5
            java.lang.String r0 = "backEvent"
            kotlin.jvm.internal.m.f(r5, r0)
            f.d0 r0 = r4.f26176b
            f.x r1 = r0.f26135c
            if (r1 != 0) goto L31
            ry.k r0 = r0.f26134b
            int r1 = r0.b()
            java.util.ListIterator r0 = r0.listIterator(r1)
        L1c:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r0.previous()
            r2 = r1
            f.x r2 = (f.x) r2
            boolean r2 = r2.f26172a
            if (r2 == 0) goto L1c
            goto L2f
        L2e:
            r1 = 0
        L2f:
            f.x r1 = (f.x) r1
        L31:
            if (r1 == 0) goto L36
            r1.c(r5)
        L36:
            qy.b0 r5 = qy.b0.f48488a
            return r5
        L39:
            f.a r5 = (f.a) r5
            java.lang.String r0 = "backEvent"
            kotlin.jvm.internal.m.f(r5, r0)
            f.d0 r0 = r4.f26176b
            ry.k r1 = r0.f26134b
            int r2 = r1.b()
            java.util.ListIterator r1 = r1.listIterator(r2)
        L4c:
            boolean r2 = r1.hasPrevious()
            if (r2 == 0) goto L5e
            java.lang.Object r2 = r1.previous()
            r3 = r2
            f.x r3 = (f.x) r3
            boolean r3 = r3.f26172a
            if (r3 == 0) goto L4c
            goto L5f
        L5e:
            r2 = 0
        L5f:
            f.x r2 = (f.x) r2
            f.x r1 = r0.f26135c
            if (r1 == 0) goto L68
            r0.b()
        L68:
            r0.f26135c = r2
            if (r2 == 0) goto L6f
            r2.d(r5)
        L6f:
            qy.b0 r5 = qy.b0.f48488a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f.y.invoke(java.lang.Object):java.lang.Object");
    }
}
