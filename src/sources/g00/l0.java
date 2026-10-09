package g00;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l0 extends j1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l0 f28431c = new l0(m0.f28434a);

    @Override // g00.a
    public final int d(Object obj) {
        int[] iArr = (int[]) obj;
        kotlin.jvm.internal.m.f(iArr, "<this>");
        return iArr.length;
    }

    @Override // g00.s, g00.a
    public final void f(f00.a aVar, int i11, Object obj) {
        k0 builder = (k0) obj;
        kotlin.jvm.internal.m.f(builder, "builder");
        int iP = aVar.p(this.f28425b, i11);
        builder.b(builder.d() + 1);
        int[] iArr = builder.f28427a;
        int i12 = builder.f28428b;
        builder.f28428b = i12 + 1;
        iArr[i12] = iP;
    }

    @Override // g00.a
    public final Object g(Object obj) {
        int[] iArr = (int[]) obj;
        kotlin.jvm.internal.m.f(iArr, "<this>");
        k0 k0Var = new k0();
        k0Var.f28427a = iArr;
        k0Var.f28428b = iArr.length;
        k0Var.b(10);
        return k0Var;
    }

    @Override // g00.j1
    public final Object j() {
        return new int[0];
    }

    @Override // g00.j1
    public final void k(f00.b encoder, Object obj, int i11) {
        int[] content = (int[]) obj;
        kotlin.jvm.internal.m.f(encoder, "encoder");
        kotlin.jvm.internal.m.f(content, "content");
        for (int i12 = 0; i12 < i11; i12++) {
            encoder.g(i12, content[i12], this.f28425b);
        }
    }
}
