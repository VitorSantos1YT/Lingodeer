package bt;

import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.uistate.LeaderBoardUser;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h7 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f5497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5500f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h7(Object obj, Object obj2, Object obj3, Object obj4, vy.d dVar, int i11) {
        super(2, dVar);
        this.f5495a = i11;
        this.f5498d = obj;
        this.f5496b = obj2;
        this.f5499e = obj3;
        this.f5500f = obj4;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f5495a) {
            case 0:
                return new h7((ht.o) this.f5497c, (CourseWord) this.f5498d, (l1.b1) this.f5496b, (l1.b1) this.f5499e, (fz.e) this.f5500f, dVar, 0);
            case 1:
                return new h7((rt.q2) this.f5497c, (rz.b0) this.f5498d, (l1.b1) this.f5496b, (rt.b4) this.f5499e, (fz.c) this.f5500f, dVar, 1);
            case 2:
                return new h7((String) this.f5497c, (o9.b) this.f5498d, (l1.b3) this.f5496b, (l1.b3) this.f5499e, (l1.b3) this.f5500f, dVar, 2);
            case 3:
                h7 h7Var = new h7((p0.f) this.f5498d, (y2.k1) this.f5496b, (d2.c) this.f5499e, (mt.l0) this.f5500f, dVar, 3);
                h7Var.f5497c = obj;
                return h7Var;
            case 4:
                h7 h7Var2 = new h7((LeaderBoardUser) this.f5498d, (l1.g1) this.f5496b, (xt.u) this.f5499e, (l1.a1) this.f5500f, dVar, 4);
                h7Var2.f5497c = obj;
                return h7Var2;
            default:
                h7 h7Var3 = new h7((kotlin.jvm.internal.y) this.f5498d, (ht.l) this.f5499e, (l1.b1) this.f5496b, (fz.a) this.f5500f, dVar);
                h7Var3.f5497c = obj;
                return h7Var3;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f5495a) {
            case 0:
                h7 h7Var = (h7) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                h7Var.invokeSuspend(b0Var2);
                return b0Var2;
            case 1:
                h7 h7Var2 = (h7) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                h7Var2.invokeSuspend(b0Var3);
                return b0Var3;
            case 2:
                h7 h7Var3 = (h7) create(b0Var, dVar);
                qy.b0 b0Var4 = qy.b0.f48488a;
                h7Var3.invokeSuspend(b0Var4);
                return b0Var4;
            case 3:
                return ((h7) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 4:
                h7 h7Var4 = (h7) create(b0Var, dVar);
                qy.b0 b0Var5 = qy.b0.f48488a;
                h7Var4.invokeSuspend(b0Var5);
                return b0Var5;
            default:
                h7 h7Var5 = (h7) create(b0Var, dVar);
                qy.b0 b0Var6 = qy.b0.f48488a;
                h7Var5.invokeSuspend(b0Var6);
                return b0Var6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ed A[Catch: all -> 0x00c2, TRY_LEAVE, TryCatch #0 {all -> 0x00c2, blocks: (B:18:0x0096, B:23:0x00bd, B:27:0x00c5, B:28:0x00d0, B:30:0x00d6, B:34:0x00e9, B:36:0x00ed), top: B:53:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x011f  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v12 java.lang.Object, still in use, count: 2, list:
          (r6v12 java.lang.Object) from 0x00e9: PHI (r6 I:??) = (r6v9 java.lang.Object), (r6v12 java.lang.Object) binds: [B:33:0x00e8, B:32:0x00e7] A[DONT_GENERATE, DONT_INLINE]
          (r6v12 java.lang.Object) from 0x00db: CHECK_CAST (ks.d) (r6v12 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bt.h7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h7(Object obj, Object obj2, l1.b3 b3Var, Object obj3, Object obj4, vy.d dVar, int i11) {
        super(2, dVar);
        this.f5495a = i11;
        this.f5497c = obj;
        this.f5498d = obj2;
        this.f5496b = b3Var;
        this.f5499e = obj3;
        this.f5500f = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7(kotlin.jvm.internal.y yVar, ht.l lVar, l1.b1 b1Var, fz.a aVar, vy.d dVar) {
        super(2, dVar);
        this.f5495a = 5;
        this.f5498d = yVar;
        this.f5499e = lVar;
        this.f5496b = b1Var;
        this.f5500f = aVar;
    }
}
