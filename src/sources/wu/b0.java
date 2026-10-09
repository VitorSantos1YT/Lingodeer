package wu;

import com.lingodeer.network.model.ApiResponse;
import dv.u0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ApiResponse.Success f55374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f55375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f55376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f55377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xy.i f55378e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b0(u0 u0Var, String str, fz.e eVar, vy.d dVar) {
        super(2, dVar);
        this.f55376c = u0Var;
        this.f55377d = str;
        this.f55378e = (xy.i) eVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [fz.e, xy.i] */
    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new b0(this.f55376c, this.f55377d, this.f55378e, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((b0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c6, code lost:
    
        if (r15 == r0) goto L29;
     */
    /* JADX WARN: Type inference failed for: r15v12, types: [fz.e, xy.i] */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws javax.crypto.BadPaddingException, javax.crypto.NoSuchPaddingException, javax.crypto.IllegalBlockSizeException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wu.b0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
