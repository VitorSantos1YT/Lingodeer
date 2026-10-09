package n0;

import java.util.List;
import java.util.Map;
import w2.q1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements w2.s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f42932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1 f42933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f42934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y.x f42935d;

    public d0(y yVar, q1 q1Var) {
        this.f42932a = yVar;
        this.f42933b = q1Var;
        this.f42934c = (a0) yVar.f43030b.invoke();
        y.n.a();
        this.f42935d = new y.x();
    }

    @Override // v3.c
    public final long I(int i11) {
        return this.f42933b.I(i11);
    }

    @Override // v3.c
    public final long K(float f5) {
        return this.f42933b.K(f5);
    }

    @Override // w2.s0
    public final w2.r0 O(int i11, int i12, Map map, fz.c cVar, fz.c cVar2) {
        return this.f42933b.O(i11, i12, map, cVar, cVar2);
    }

    @Override // v3.c
    public final float Q(int i11) {
        return this.f42933b.Q(i11);
    }

    @Override // v3.c
    public final float T(float f5) {
        return this.f42933b.T(f5);
    }

    @Override // v3.c
    public final float Z() {
        return this.f42933b.Z();
    }

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
    public final List a(int i11) {
        y.x xVar = this.f42935d;
        List list = (List) xVar.b(i11);
        if (list != null) {
            return list;
        }
        a0 a0Var = this.f42934c;
        Object objA = a0Var.a(i11);
        List listC = this.f42933b.C(objA, this.f42932a.a(i11, objA, a0Var.b(i11)));
        xVar.h(i11, listC);
        return listC;
    }

    @Override // w2.s
    public final boolean c0() {
        return this.f42933b.c0();
    }

    @Override // v3.c
    public final float e0(float f5) {
        return this.f42933b.e0(f5);
    }

    @Override // v3.c
    public final float getDensity() {
        return this.f42933b.getDensity();
    }

    @Override // w2.s
    public final v3.m getLayoutDirection() {
        return this.f42933b.getLayoutDirection();
    }

    @Override // v3.c
    public final int k0(long j11) {
        return this.f42933b.k0(j11);
    }

    @Override // v3.c
    public final long n(float f5) {
        return this.f42933b.n(f5);
    }

    @Override // v3.c
    public final int n0(float f5) {
        return this.f42933b.n0(f5);
    }

    @Override // v3.c
    public final long o(long j11) {
        return this.f42933b.o(j11);
    }

    @Override // w2.s0
    public final w2.r0 q0(int i11, int i12, Map map, fz.c cVar) {
        return this.f42933b.q0(i11, i12, map, cVar);
    }

    @Override // v3.c
    public final long v0(long j11) {
        return this.f42933b.v0(j11);
    }

    @Override // v3.c
    public final float w(long j11) {
        return this.f42933b.w(j11);
    }

    @Override // v3.c
    public final float y0(long j11) {
        return this.f42933b.y0(j11);
    }
}
