package g00;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u extends j1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f28470c = new u(v.f28479a);

    @Override // g00.a
    public final int d(Object obj) {
        double[] dArr = (double[]) obj;
        kotlin.jvm.internal.m.f(dArr, "<this>");
        return dArr.length;
    }

    @Override // g00.s, g00.a
    public final void f(f00.a aVar, int i11, Object obj) {
        t builder = (t) obj;
        kotlin.jvm.internal.m.f(builder, "builder");
        double dE = aVar.e(this.f28425b, i11);
        builder.b(builder.d() + 1);
        double[] dArr = builder.f28464a;
        int i12 = builder.f28465b;
        builder.f28465b = i12 + 1;
        dArr[i12] = dE;
    }

    @Override // g00.a
    public final Object g(Object obj) {
        double[] dArr = (double[]) obj;
        kotlin.jvm.internal.m.f(dArr, "<this>");
        t tVar = new t();
        tVar.f28464a = dArr;
        tVar.f28465b = dArr.length;
        tVar.b(10);
        return tVar;
    }

    @Override // g00.j1
    public final Object j() {
        return new double[0];
    }

    @Override // g00.j1
    public final void k(f00.b encoder, Object obj, int i11) {
        double[] content = (double[]) obj;
        kotlin.jvm.internal.m.f(encoder, "encoder");
        kotlin.jvm.internal.m.f(content, "content");
        for (int i12 = 0; i12 < i11; i12++) {
            encoder.q(this.f28425b, i12, content[i12]);
        }
    }
}
