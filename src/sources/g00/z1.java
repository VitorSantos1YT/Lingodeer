package g00;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z1 extends j1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z1 f28505c = new z1(a2.f28360a);

    @Override // g00.a
    public final int d(Object obj) {
        int[] collectionSize = ((qy.v) obj).f48511a;
        kotlin.jvm.internal.m.f(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // g00.s, g00.a
    public final void f(f00.a aVar, int i11, Object obj) {
        y1 builder = (y1) obj;
        kotlin.jvm.internal.m.f(builder, "builder");
        int iJ = aVar.q(this.f28425b, i11).j();
        builder.b(builder.d() + 1);
        int[] iArr = builder.f28500a;
        int i12 = builder.f28501b;
        builder.f28501b = i12 + 1;
        iArr[i12] = iJ;
    }

    @Override // g00.a
    public final Object g(Object obj) {
        int[] toBuilder = ((qy.v) obj).f48511a;
        kotlin.jvm.internal.m.f(toBuilder, "$this$toBuilder");
        y1 y1Var = new y1();
        y1Var.f28500a = toBuilder;
        y1Var.f28501b = toBuilder.length;
        y1Var.b(10);
        return y1Var;
    }

    @Override // g00.j1
    public final Object j() {
        return new qy.v(new int[0]);
    }

    @Override // g00.j1
    public final void k(f00.b encoder, Object obj, int i11) {
        int[] iArr = ((qy.v) obj).f48511a;
        kotlin.jvm.internal.m.f(encoder, "encoder");
        for (int i12 = 0; i12 < i11; i12++) {
            encoder.l(this.f28425b, i12).z(iArr[i12]);
        }
    }
}
