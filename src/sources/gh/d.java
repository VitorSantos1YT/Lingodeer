package gh;

import java.util.List;
import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f29198b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(List list, vy.d dVar, int i11) {
        super(2, dVar);
        this.f29197a = i11;
        this.f29198b = list;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f29197a) {
            case 0:
                return new d(this.f29198b, dVar, 0);
            case 1:
                return new d(this.f29198b, dVar, 1);
            case 2:
                return new d(this.f29198b, dVar, 2);
            case 3:
                return new d(this.f29198b, dVar, 3);
            default:
                return new d(this.f29198b, dVar, 4);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f29197a) {
            case 0:
                d dVar2 = (d) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                dVar2.invokeSuspend(b0Var2);
                return b0Var2;
            case 1:
                return ((d) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 2:
                return ((d) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 3:
                return ((d) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((d) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v10 java.lang.Object, still in use, count: 2, list:
          (r12v10 java.lang.Object) from 0x0156: PHI (r12 I:??) = (r12v4 java.lang.Object), (r12v10 java.lang.Object) binds: [B:40:0x0155, B:109:0x0156] A[DONT_GENERATE, DONT_INLINE]
          (r12v10 java.lang.Object) from 0x0148: CHECK_CAST (com.lingodeer.data.model.DailyLearnWithLearnTimeHistory) (r12v10 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gh.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
