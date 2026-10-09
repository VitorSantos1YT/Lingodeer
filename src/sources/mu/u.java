package mu;

import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f42169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f42170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f42171c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(h hVar, x xVar, vy.d dVar) {
        super(2, dVar);
        this.f42170b = xVar;
        this.f42171c = hVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new u(this.f42171c, this.f42170b, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00bb  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c4, code lost:
    
        if (r11 == r10) goto L26;
     */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws javax.crypto.BadPaddingException, javax.crypto.NoSuchPaddingException, javax.crypto.IllegalBlockSizeException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mu.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
