package mt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class w0 extends xy.i implements fz.e {
    public final /* synthetic */ l1.g1 H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f42004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f42005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l0.w f42006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f42007f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f42008t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(boolean z11, int i11, l0.w wVar, float f5, l1.b1 b1Var, l1.g1 g1Var, vy.d dVar, int i12) {
        super(2, dVar);
        this.f42002a = i12;
        this.f42004c = z11;
        this.f42005d = i11;
        this.f42006e = wVar;
        this.f42007f = f5;
        this.f42008t = b1Var;
        this.H = g1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f42002a) {
            case 0:
                return new w0(this.f42004c, this.f42005d, this.f42006e, this.f42007f, this.f42008t, this.H, dVar, 0);
            default:
                return new w0(this.f42004c, this.f42005d, this.f42006e, this.f42007f, this.f42008t, this.H, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f42002a) {
            case 0:
                break;
        }
        return ((w0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    /* JADX WARN: Code duplicated, block: B:31:0x0083  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Iterable, java.lang.Object] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v5 java.lang.Object, still in use, count: 2, list:
          (r5v5 java.lang.Object) from 0x00d4: PHI (r5 I:??) = (r5v2 java.lang.Object), (r5v5 java.lang.Object) binds: [B:53:0x00d3, B:68:0x00d4] A[DONT_GENERATE, DONT_INLINE]
          (r5v5 java.lang.Object) from 0x00c8: CHECK_CAST (l0.p) (r5v5 java.lang.Object)
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
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mt.w0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
