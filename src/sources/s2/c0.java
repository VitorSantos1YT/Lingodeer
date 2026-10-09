package s2;

import s0.o0;
import y2.d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y2.p f51288a;

    public c0(y2.p pVar) {
        this.f51288a = pVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        a aVar = o0.f51123b;
        return aVar.equals(aVar) && kotlin.jvm.internal.m.a(this.f51288a, c0Var.f51288a);
    }

    @Override // y2.d1
    public final z1.q f() {
        return new d0(o0.f51123b, this.f51288a);
    }

    public final int hashCode() {
        int iE = defpackage.e.e(1022 * 31, 31, false);
        y2.p pVar = this.f51288a;
        return iE + (pVar != null ? pVar.hashCode() : 0);
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        d0 d0Var = (d0) qVar;
        a aVar = o0.f51123b;
        if (!kotlin.jvm.internal.m.a(d0Var.R, aVar)) {
            d0Var.R = aVar;
            if (d0Var.S) {
                d0Var.V0();
            }
        }
        d0Var.Q = this.f51288a;
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + o0.f51123b + ", overrideDescendants=false, touchBoundsExpansion=" + this.f51288a + ')';
    }
}
