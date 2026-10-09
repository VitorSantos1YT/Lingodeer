package g00;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f2 extends j1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f2 f28400c = new f2(g2.f28409a);

    @Override // g00.a
    public final int d(Object obj) {
        short[] collectionSize = ((qy.a0) obj).f48484a;
        kotlin.jvm.internal.m.f(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // g00.s, g00.a
    public final void f(f00.a aVar, int i11, Object obj) {
        e2 builder = (e2) obj;
        kotlin.jvm.internal.m.f(builder, "builder");
        short sB = aVar.q(this.f28425b, i11).B();
        builder.b(builder.d() + 1);
        short[] sArr = builder.f28383a;
        int i12 = builder.f28384b;
        builder.f28384b = i12 + 1;
        sArr[i12] = sB;
    }

    @Override // g00.a
    public final Object g(Object obj) {
        short[] toBuilder = ((qy.a0) obj).f48484a;
        kotlin.jvm.internal.m.f(toBuilder, "$this$toBuilder");
        e2 e2Var = new e2();
        e2Var.f28383a = toBuilder;
        e2Var.f28384b = toBuilder.length;
        e2Var.b(10);
        return e2Var;
    }

    @Override // g00.j1
    public final Object j() {
        return new qy.a0(new short[0]);
    }

    @Override // g00.j1
    public final void k(f00.b encoder, Object obj, int i11) {
        short[] sArr = ((qy.a0) obj).f48484a;
        kotlin.jvm.internal.m.f(encoder, "encoder");
        for (int i12 = 0; i12 < i11; i12++) {
            encoder.l(this.f28425b, i12).k(sArr[i12]);
        }
    }
}
