package fr;

import com.lingodeer.network.model.ApiResponse;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class w4 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ApiResponse.Success f27954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f27956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x4 f27957d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(x4 x4Var, vy.d dVar) {
        super(2, dVar);
        this.f27957d = x4Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        w4 w4Var = new w4(this.f27957d, dVar);
        w4Var.f27956c = obj;
        return w4Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((w4) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x009b  */
    /* JADX WARN: Code duplicated, block: B:25:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ca A[PHI: r0
      0x00ca: PHI (r0v12 java.lang.Object) = (r0v7 java.lang.Object), (r0v19 java.lang.Object) binds: [B:28:0x00c7, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00e3  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a7, code lost:
    
        if (r8.emit(com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME, r15) == r9) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e0, code lost:
    
        if (r8.emit(r0, r15) == r9) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fa, code lost:
    
        if (r8.emit(r0, r15) == r9) goto L37;
     */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) throws javax.crypto.BadPaddingException, javax.crypto.NoSuchPaddingException, javax.crypto.IllegalBlockSizeException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.w4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
