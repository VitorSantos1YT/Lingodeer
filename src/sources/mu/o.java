package mu;

import java.util.List;
import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f42152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.android.billingclient.api.j f42154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f42155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f42156e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.android.billingclient.api.j jVar, x xVar, List list, vy.d dVar) {
        super(2, dVar);
        this.f42154c = jVar;
        this.f42155d = xVar;
        this.f42156e = list;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new o(this.f42154c, this.f42155d, this.f42156e, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x01c7, code lost:
    
        if (r11 == r10) goto L75;
     */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws javax.crypto.BadPaddingException, javax.crypto.NoSuchPaddingException, javax.crypto.IllegalBlockSizeException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mu.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
