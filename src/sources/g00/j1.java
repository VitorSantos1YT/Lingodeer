package g00;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j1 extends s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1 f28425b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(c00.a primitiveSerializer) {
        super(primitiveSerializer);
        kotlin.jvm.internal.m.f(primitiveSerializer, "primitiveSerializer");
        this.f28425b = new i1(primitiveSerializer.getDescriptor());
    }

    @Override // g00.a
    public final Object a() {
        return (h1) g(j());
    }

    @Override // g00.a
    public final int b(Object obj) {
        h1 h1Var = (h1) obj;
        kotlin.jvm.internal.m.f(h1Var, "<this>");
        return h1Var.d();
    }

    @Override // g00.a
    public final Iterator c(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // g00.a, c00.a
    public final Object deserialize(f00.c cVar) {
        return e(cVar);
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return this.f28425b;
    }

    @Override // g00.a
    public final Object h(Object obj) {
        h1 h1Var = (h1) obj;
        kotlin.jvm.internal.m.f(h1Var, "<this>");
        return h1Var.a();
    }

    @Override // g00.s
    public final void i(int i11, Object obj, Object obj2) {
        kotlin.jvm.internal.m.f((h1) obj, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object j();

    public abstract void k(f00.b bVar, Object obj, int i11);

    @Override // g00.s, c00.a
    public final void serialize(f00.d dVar, Object obj) {
        int iD = d(obj);
        i1 i1Var = this.f28425b;
        f00.b bVarD = dVar.D(i1Var, iD);
        k(bVarD, obj, iD);
        bVarD.c(i1Var);
    }
}
