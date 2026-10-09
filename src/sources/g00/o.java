package g00;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o extends j1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f28444c = new o(p.f28446a);

    @Override // g00.a
    public final int d(Object obj) {
        char[] cArr = (char[]) obj;
        kotlin.jvm.internal.m.f(cArr, "<this>");
        return cArr.length;
    }

    @Override // g00.s, g00.a
    public final void f(f00.a aVar, int i11, Object obj) {
        n builder = (n) obj;
        kotlin.jvm.internal.m.f(builder, "builder");
        char cM = aVar.m(this.f28425b, i11);
        builder.b(builder.d() + 1);
        char[] cArr = builder.f28438a;
        int i12 = builder.f28439b;
        builder.f28439b = i12 + 1;
        cArr[i12] = cM;
    }

    @Override // g00.a
    public final Object g(Object obj) {
        char[] cArr = (char[]) obj;
        kotlin.jvm.internal.m.f(cArr, "<this>");
        n nVar = new n();
        nVar.f28438a = cArr;
        nVar.f28439b = cArr.length;
        nVar.b(10);
        return nVar;
    }

    @Override // g00.j1
    public final Object j() {
        return new char[0];
    }

    @Override // g00.j1
    public final void k(f00.b encoder, Object obj, int i11) {
        char[] content = (char[]) obj;
        kotlin.jvm.internal.m.f(encoder, "encoder");
        kotlin.jvm.internal.m.f(content, "content");
        for (int i12 = 0; i12 < i11; i12++) {
            encoder.n(this.f28425b, i12, content[i12]);
        }
    }
}
