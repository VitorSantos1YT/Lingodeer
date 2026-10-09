package fr;

import com.lingodeer.network.model.ApiResponse;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k2 extends xy.i implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ApiResponse f27646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f27647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i3 f27649d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(i3 i3Var, vy.d dVar) {
        super(1, dVar);
        this.f27649d = i3Var;
    }

    @Override // xy.a
    public final vy.d create(vy.d dVar) {
        return new k2(this.f27649d, dVar);
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        return ((k2) create((vy.d) obj)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009d  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00df  */
    /* JADX WARN: Code duplicated, block: B:49:0x0103  */
    /* JADX WARN: Code duplicated, block: B:53:0x0120 A[LOOP:0: B:51:0x011a->B:53:0x0120, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x0141  */
    /* JADX WARN: Code duplicated, block: B:59:0x0152  */
    /* JADX WARN: Code duplicated, block: B:60:0x0162  */
    /* JADX WARN: Code duplicated, block: B:66:0x017a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0165 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x013b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0185, code lost:
    
        if (r9.d(r22) == r1) goto L68;
     */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws javax.crypto.BadPaddingException, javax.crypto.NoSuchPaddingException, javax.crypto.IllegalBlockSizeException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.k2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
