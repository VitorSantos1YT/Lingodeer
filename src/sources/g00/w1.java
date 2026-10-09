package g00;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class w1 extends j1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w1 f28485c = new w1(x1.f28492a);

    @Override // g00.a
    public final int d(Object obj) {
        byte[] collectionSize = ((qy.t) obj).f48509a;
        kotlin.jvm.internal.m.f(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // g00.s, g00.a
    public final void f(f00.a aVar, int i11, Object obj) {
        v1 builder = (v1) obj;
        kotlin.jvm.internal.m.f(builder, "builder");
        byte bA = aVar.q(this.f28425b, i11).A();
        builder.b(builder.d() + 1);
        byte[] bArr = builder.f28481a;
        int i12 = builder.f28482b;
        builder.f28482b = i12 + 1;
        bArr[i12] = bA;
    }

    @Override // g00.a
    public final Object g(Object obj) {
        byte[] toBuilder = ((qy.t) obj).f48509a;
        kotlin.jvm.internal.m.f(toBuilder, "$this$toBuilder");
        v1 v1Var = new v1();
        v1Var.f28481a = toBuilder;
        v1Var.f28482b = toBuilder.length;
        v1Var.b(10);
        return v1Var;
    }

    @Override // g00.j1
    public final Object j() {
        return new qy.t(new byte[0]);
    }

    @Override // g00.j1
    public final void k(f00.b encoder, Object obj, int i11) {
        byte[] bArr = ((qy.t) obj).f48509a;
        kotlin.jvm.internal.m.f(encoder, "encoder");
        for (int i12 = 0; i12 < i11; i12++) {
            encoder.l(this.f28425b, i12).m(bArr[i12]);
        }
    }
}
