package uz;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f53303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f53304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f53305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f53306e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f53307f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h0(fz.c cVar, AtomicReference atomicReference, fz.e eVar, vy.d dVar) {
        super(2, dVar);
        this.f53302a = 6;
        this.f53307f = (kotlin.jvm.internal.n) cVar;
        this.f53304c = atomicReference;
        this.f53305d = eVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [uz.o0, vz.a] */
    /* JADX WARN: Type inference failed for: r1v3, types: [fz.c, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r8v1, types: [uz.o0, vz.a] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.io.Serializable, java.lang.String[]] */
    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f53302a) {
            case 0:
                h0 h0Var = new h0((i) this.f53304c, (o0) this.f53305d, this.f53307f, dVar);
                h0Var.f53306e = obj;
                return h0Var;
            case 1:
                return new h0((b1) this.f53307f, (i) this.f53304c, (o0) this.f53305d, this.f53306e, dVar);
            case 2:
                return new h0((vt.r) this.f53306e, (String) this.f53307f, (Set) this.f53304c, (Set) this.f53305d, dVar);
            case 3:
                h0 h0Var2 = new h0((w9.s) this.f53307f, (rz.m) this.f53304c, (ca.d) this.f53305d, dVar, 3);
                h0Var2.f53306e = obj;
                return h0Var2;
            case 4:
                h0 h0Var3 = new h0(this.f53307f, this.f53304c, (Serializable) this.f53305d, dVar, 4);
                h0Var3.f53306e = obj;
                return h0Var3;
            case 5:
                h0 h0Var4 = new h0((wt.m) this.f53307f, (List) this.f53304c, (HashMap) this.f53305d, dVar, 5);
                h0Var4.f53306e = obj;
                return h0Var4;
            default:
                h0 h0Var5 = new h0((fz.c) this.f53307f, (AtomicReference) this.f53304c, (fz.e) this.f53305d, dVar);
                h0Var5.f53306e = obj;
                return h0Var5;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f53302a) {
            case 0:
                return ((h0) create((z0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((h0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 2:
                return ((h0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 3:
                return ((h0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 4:
                return ((h0) create((j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 5:
                return ((h0) create((j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((h0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:116:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:123:0x021c  */
    /* JADX WARN: Code duplicated, block: B:136:0x0251  */
    /* JADX WARN: Code duplicated, block: B:143:0x026e  */
    /* JADX WARN: Code duplicated, block: B:193:0x0397 A[PHI: r2
      0x0397: PHI (r2v31 uz.j) = (r2v29 uz.j), (r2v30 uz.j), (r2v37 uz.j) binds: [B:186:0x0373, B:191:0x0394, B:173:0x0322] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:332:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0158  */
    /* JADX WARN: Code duplicated, block: B:81:0x0177  */
    /* JADX WARN: Code duplicated, block: B:96:0x01b0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [uz.j, uz.o0, vz.a] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [uz.i] */
    /* JADX WARN: Type inference failed for: r2v7, types: [uz.j, uz.o0, vz.a] */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v6, types: [uz.i] */
    /* JADX WARN: Type inference failed for: r9v7, types: [fz.c, kotlin.jvm.internal.n] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v20 java.lang.Object, still in use, count: 2, list:
          (r14v20 java.lang.Object) from 0x0154: PHI (r14 I:??) = (r14v17 java.lang.Object), (r14v20 java.lang.Object) binds: [B:70:0x0153, B:308:0x0154] A[DONT_GENERATE, DONT_INLINE]
          (r14v20 java.lang.Object) from 0x0146: CHECK_CAST (com.lingodeer.data.model.CourseLesson) (r14v20 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r44) {
        /*
            Method dump skipped, instruction units count: 1410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uz.h0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(Object obj, Object obj2, Serializable serializable, vy.d dVar, int i11) {
        super(2, dVar);
        this.f53302a = i11;
        this.f53307f = obj;
        this.f53304c = obj2;
        this.f53305d = serializable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h0(i iVar, o0 o0Var, Object obj, vy.d dVar) {
        super(2, dVar);
        this.f53302a = 0;
        this.f53304c = iVar;
        this.f53305d = (vz.a) o0Var;
        this.f53307f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h0(b1 b1Var, i iVar, o0 o0Var, Object obj, vy.d dVar) {
        super(2, dVar);
        this.f53302a = 1;
        this.f53307f = b1Var;
        this.f53304c = iVar;
        this.f53305d = (vz.a) o0Var;
        this.f53306e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(vt.r rVar, String str, Set set, Set set2, vy.d dVar) {
        super(2, dVar);
        this.f53302a = 2;
        this.f53306e = rVar;
        this.f53307f = str;
        this.f53304c = set;
        this.f53305d = set2;
    }
}
