package g00;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends j1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f28416c = new i(j.f28421a);

    @Override // g00.a
    public final int d(Object obj) {
        byte[] bArr = (byte[]) obj;
        kotlin.jvm.internal.m.f(bArr, "<this>");
        return bArr.length;
    }

    @Override // g00.s, g00.a
    public final void f(f00.a aVar, int i11, Object obj) {
        h builder = (h) obj;
        kotlin.jvm.internal.m.f(builder, "builder");
        byte bY = aVar.y(this.f28425b, i11);
        builder.b(builder.d() + 1);
        byte[] bArr = builder.f28411a;
        int i12 = builder.f28412b;
        builder.f28412b = i12 + 1;
        bArr[i12] = bY;
    }

    @Override // g00.a
    public final Object g(Object obj) {
        byte[] bArr = (byte[]) obj;
        kotlin.jvm.internal.m.f(bArr, "<this>");
        h hVar = new h();
        hVar.f28411a = bArr;
        hVar.f28412b = bArr.length;
        hVar.b(10);
        return hVar;
    }

    @Override // g00.j1
    public final Object j() {
        return new byte[0];
    }

    @Override // g00.j1
    public final void k(f00.b encoder, Object obj, int i11) {
        byte[] content = (byte[]) obj;
        kotlin.jvm.internal.m.f(encoder, "encoder");
        kotlin.jvm.internal.m.f(content, "content");
        for (int i12 = 0; i12 < i11; i12++) {
            encoder.i(this.f28425b, i12, content[i12]);
        }
    }
}
