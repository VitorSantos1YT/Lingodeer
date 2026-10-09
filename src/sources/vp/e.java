package vp;

import com.lingodeer.data.model.LearnProgress;
import qy.b0;
import uz.j;
import vt.k0;
import vt.n0;
import wt.m;
import wt.q;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends i implements fz.e {
    public final /* synthetic */ int H;
    public final /* synthetic */ m K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LearnProgress f54086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f54087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f54088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k0 f54089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0 f54090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f54091f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ q f54092t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k0 k0Var, n0 n0Var, boolean z11, q qVar, int i11, m mVar, vy.d dVar) {
        super(2, dVar);
        this.f54089d = k0Var;
        this.f54090e = n0Var;
        this.f54091f = z11;
        this.f54092t = qVar;
        this.H = i11;
        this.K = mVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        e eVar = new e(this.f54089d, this.f54090e, this.f54091f, this.f54092t, this.H, this.K, dVar);
        eVar.f54088c = obj;
        return eVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((j) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:42:0x0101  */
    /* JADX WARN: Code duplicated, block: B:45:0x0110  */
    /* JADX WARN: Code duplicated, block: B:47:0x0121  */
    /* JADX WARN: Code duplicated, block: B:51:0x0140 A[PHI: r2 r15
      0x0140: PHI (r2v7 com.lingodeer.data.model.LearnProgress) = (r2v4 com.lingodeer.data.model.LearnProgress), (r2v10 com.lingodeer.data.model.LearnProgress) binds: [B:49:0x013c, B:11:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x0140: PHI (r15v33 java.lang.Object) = (r15v27 java.lang.Object), (r15v0 java.lang.Object) binds: [B:49:0x013c, B:11:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x014c A[LOOP:0: B:52:0x0146->B:54:0x014c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x016b A[LOOP:1: B:56:0x0165->B:58:0x016b, LOOP_END] */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d7, code lost:
    
        if (r15 == r1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01c7, code lost:
    
        if (r0.emit(r15, r14) == r1) goto L61;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vp.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
