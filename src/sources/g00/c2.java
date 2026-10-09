package g00;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c2 extends j1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c2 f28369c = new c2(d2.f28377a);

    @Override // g00.a
    public final int d(Object obj) {
        long[] collectionSize = ((qy.x) obj).f48513a;
        kotlin.jvm.internal.m.f(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // g00.s, g00.a
    public final void f(f00.a aVar, int i11, Object obj) {
        b2 builder = (b2) obj;
        kotlin.jvm.internal.m.f(builder, "builder");
        long jO = aVar.q(this.f28425b, i11).o();
        builder.b(builder.d() + 1);
        long[] jArr = builder.f28365a;
        int i12 = builder.f28366b;
        builder.f28366b = i12 + 1;
        jArr[i12] = jO;
    }

    @Override // g00.a
    public final Object g(Object obj) {
        long[] toBuilder = ((qy.x) obj).f48513a;
        kotlin.jvm.internal.m.f(toBuilder, "$this$toBuilder");
        b2 b2Var = new b2();
        b2Var.f28365a = toBuilder;
        b2Var.f28366b = toBuilder.length;
        b2Var.b(10);
        return b2Var;
    }

    @Override // g00.j1
    public final Object j() {
        return new qy.x(new long[0]);
    }

    @Override // g00.j1
    public final void k(f00.b encoder, Object obj, int i11) {
        long[] jArr = ((qy.x) obj).f48513a;
        kotlin.jvm.internal.m.f(encoder, "encoder");
        for (int i12 = 0; i12 < i11; i12++) {
            encoder.l(this.f28425b, i12).C(jArr[i12]);
        }
    }
}
