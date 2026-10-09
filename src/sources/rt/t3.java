package rt;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t3 extends xy.i implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ List f50419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ List f50420c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t3(int i11, int i12, vy.d dVar) {
        super(i11, dVar);
        this.f50418a = i12;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        List list = (List) obj;
        List list2 = (List) obj2;
        vy.d dVar = (vy.d) obj3;
        switch (this.f50418a) {
            case 0:
                t3 t3Var = new t3(3, 0, dVar);
                t3Var.f50419b = list;
                t3Var.f50420c = list2;
                return t3Var.invokeSuspend(qy.b0.f48488a);
            case 1:
                t3 t3Var2 = new t3(3, 1, dVar);
                t3Var2.f50419b = list;
                t3Var2.f50420c = list2;
                return t3Var2.invokeSuspend(qy.b0.f48488a);
            case 2:
                t3 t3Var3 = new t3(3, 2, dVar);
                t3Var3.f50419b = list;
                t3Var3.f50420c = list2;
                return t3Var3.invokeSuspend(qy.b0.f48488a);
            case 3:
                t3 t3Var4 = new t3(3, 3, dVar);
                t3Var4.f50419b = list;
                t3Var4.f50420c = list2;
                return t3Var4.invokeSuspend(qy.b0.f48488a);
            default:
                t3 t3Var5 = new t3(3, 4, dVar);
                t3Var5.f50419b = list;
                t3Var5.f50420c = list2;
                return t3Var5.invokeSuspend(qy.b0.f48488a);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v6 java.lang.Object, still in use, count: 2, list:
          (r7v6 java.lang.Object) from 0x006b: PHI (r7 I:??) = (r7v2 java.lang.Object), (r7v6 java.lang.Object) binds: [B:15:0x006a, B:40:0x006b] A[DONT_GENERATE, DONT_INLINE]
          (r7v6 java.lang.Object) from 0x0059: CHECK_CAST (com.lingodeer.data.model.uistate.LeaderBoardUser) (r7v6 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rt.t3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
