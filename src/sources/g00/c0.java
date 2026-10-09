package g00;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends j1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c0 f28368c = new c0(d0.f28372a);

    @Override // g00.a
    public final int d(Object obj) {
        float[] fArr = (float[]) obj;
        kotlin.jvm.internal.m.f(fArr, "<this>");
        return fArr.length;
    }

    @Override // g00.s, g00.a
    public final void f(f00.a aVar, int i11, Object obj) {
        b0 builder = (b0) obj;
        kotlin.jvm.internal.m.f(builder, "builder");
        float fV = aVar.v(this.f28425b, i11);
        builder.b(builder.d() + 1);
        float[] fArr = builder.f28362a;
        int i12 = builder.f28363b;
        builder.f28363b = i12 + 1;
        fArr[i12] = fV;
    }

    @Override // g00.a
    public final Object g(Object obj) {
        float[] fArr = (float[]) obj;
        kotlin.jvm.internal.m.f(fArr, "<this>");
        b0 b0Var = new b0();
        b0Var.f28362a = fArr;
        b0Var.f28363b = fArr.length;
        b0Var.b(10);
        return b0Var;
    }

    @Override // g00.j1
    public final Object j() {
        return new float[0];
    }

    @Override // g00.j1
    public final void k(f00.b encoder, Object obj, int i11) {
        float[] content = (float[]) obj;
        kotlin.jvm.internal.m.f(encoder, "encoder");
        kotlin.jvm.internal.m.f(content, "content");
        for (int i12 = 0; i12 < i11; i12++) {
            encoder.E(this.f28425b, i12, content[i12]);
        }
    }
}
