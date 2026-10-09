package g00;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends j1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f28385c = new f(g.f28401a);

    @Override // g00.a
    public final int d(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        kotlin.jvm.internal.m.f(zArr, "<this>");
        return zArr.length;
    }

    @Override // g00.s, g00.a
    public final void f(f00.a aVar, int i11, Object obj) {
        e builder = (e) obj;
        kotlin.jvm.internal.m.f(builder, "builder");
        boolean zW = aVar.w(this.f28425b, i11);
        builder.b(builder.d() + 1);
        boolean[] zArr = builder.f28379a;
        int i12 = builder.f28380b;
        builder.f28380b = i12 + 1;
        zArr[i12] = zW;
    }

    @Override // g00.a
    public final Object g(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        kotlin.jvm.internal.m.f(zArr, "<this>");
        e eVar = new e();
        eVar.f28379a = zArr;
        eVar.f28380b = zArr.length;
        eVar.b(10);
        return eVar;
    }

    @Override // g00.j1
    public final Object j() {
        return new boolean[0];
    }

    @Override // g00.j1
    public final void k(f00.b encoder, Object obj, int i11) {
        boolean[] content = (boolean[]) obj;
        kotlin.jvm.internal.m.f(encoder, "encoder");
        kotlin.jvm.internal.m.f(content, "content");
        for (int i12 = 0; i12 < i11; i12++) {
            encoder.B(this.f28425b, i12, content[i12]);
        }
    }
}
