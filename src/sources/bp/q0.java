package bp;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class q0 implements fz.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4770f;

    public /* synthetic */ q0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f4765a = i11;
        this.f4767c = obj;
        this.f4768d = obj2;
        this.f4769e = obj3;
        this.f4766b = obj4;
        this.f4770f = obj5;
    }

    /* JADX WARN: Type inference failed for: r1v62, types: [java.lang.Object, java.util.List] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v17 java.lang.Object, still in use, count: 2, list:
          (r5v17 java.lang.Object) from 0x0203: PHI (r5 I:??) = (r5v15 java.lang.Object), (r5v17 java.lang.Object) binds: [B:81:0x0202, B:126:0x0203] A[DONT_GENERATE, DONT_INLINE]
          (r5v17 java.lang.Object) from 0x01f9: CHECK_CAST (j9.e) (r5v17 java.lang.Object)
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
    @Override // fz.g
    public final java.lang.Object f(java.lang.Object r20, java.lang.Object r21, java.lang.Object r22, java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bp.q0.f(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public q0(List list, fz.c cVar, fz.c cVar2, fz.c cVar3, fz.c cVar4) {
        this.f4765a = 3;
        this.f4767c = list;
        this.f4769e = cVar;
        this.f4768d = cVar2;
        this.f4766b = cVar3;
        this.f4770f = cVar4;
    }
}
