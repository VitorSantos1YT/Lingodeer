package a0;

import b0.i2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class u1 extends y2.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i2 f203a;

    public u1(i2 i2Var) {
        this.f203a = i2Var;
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
        if (!(obj instanceof u1) || !this.f203a.equals(((u1) obj).f203a)) {
            return false;
        }
        z1.j jVar = z1.c.f58463a;
        return jVar.equals(jVar);
    }

    @Override // y2.d1
    public final z1.q f() {
        return new y1(this.f203a);
    }

    public final int hashCode() {
        return (Float.hashCode(-1.0f) + (Float.hashCode(-1.0f) * 31) + (this.f203a.hashCode() * 31)) * 31;
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        ((y1) qVar).R = this.f203a;
    }

    public final String toString() {
        return "SizeAnimationModifierElement(animationSpec=" + this.f203a + ", alignment=" + z1.c.f58463a + ", finishedListener=null)";
    }
}
