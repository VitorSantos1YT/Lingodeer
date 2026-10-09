package g00;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q0 extends j1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q0 f28452c = new q0(r0.f28455a);

    @Override // g00.a
    public final int d(Object obj) {
        long[] jArr = (long[]) obj;
        kotlin.jvm.internal.m.f(jArr, "<this>");
        return jArr.length;
    }

    @Override // g00.s, g00.a
    public final void f(f00.a aVar, int i11, Object obj) {
        p0 builder = (p0) obj;
        kotlin.jvm.internal.m.f(builder, "builder");
        long jD = aVar.D(this.f28425b, i11);
        builder.b(builder.d() + 1);
        long[] jArr = builder.f28448a;
        int i12 = builder.f28449b;
        builder.f28449b = i12 + 1;
        jArr[i12] = jD;
    }

    @Override // g00.a
    public final Object g(Object obj) {
        long[] jArr = (long[]) obj;
        kotlin.jvm.internal.m.f(jArr, "<this>");
        p0 p0Var = new p0();
        p0Var.f28448a = jArr;
        p0Var.f28449b = jArr.length;
        p0Var.b(10);
        return p0Var;
    }

    @Override // g00.j1
    public final Object j() {
        return new long[0];
    }

    @Override // g00.j1
    public final void k(f00.b encoder, Object obj, int i11) {
        long[] content = (long[]) obj;
        kotlin.jvm.internal.m.f(encoder, "encoder");
        kotlin.jvm.internal.m.f(content, "content");
        for (int i12 = 0; i12 < i11; i12++) {
            encoder.v(this.f28425b, i12, content[i12]);
        }
    }
}
