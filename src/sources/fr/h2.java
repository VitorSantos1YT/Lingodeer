package fr;

import com.lingodeer.network.model.ApiResponse;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h2 extends xy.i implements fz.c {
    public int H;
    public final /* synthetic */ i3 K;
    public final /* synthetic */ int L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f27561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f27562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f27563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ApiResponse f27564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f27565f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f27566t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(int i11, i3 i3Var, vy.d dVar) {
        super(1, dVar);
        this.K = i3Var;
        this.L = i11;
    }

    @Override // xy.a
    public final vy.d create(vy.d dVar) {
        return new h2(this.L, this.K, dVar);
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        return ((h2) create((vy.d) obj)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ed A[LOOP:4: B:30:0x00eb->B:31:0x00ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x015d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0167  */
    /* JADX WARN: Code duplicated, block: B:40:0x0172  */
    /* JADX WARN: Code duplicated, block: B:43:0x0185 A[LOOP:2: B:41:0x017f->B:43:0x0185, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x01db  */
    /* JADX WARN: Code duplicated, block: B:50:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:52:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:56:0x0215  */
    /* JADX WARN: Code duplicated, block: B:58:0x0219  */
    /* JADX WARN: Code duplicated, block: B:61:0x024e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0273 A[LOOP:0: B:63:0x026d->B:65:0x0273, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x0296 A[LOOP:1: B:67:0x0290->B:69:0x0296, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:77:0x0311  */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x020e, code lost:
    
        if (((vt.z0) r0).e(r4, r49) == r8) goto L72;
     */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r50) throws javax.crypto.BadPaddingException, javax.crypto.NoSuchPaddingException, javax.crypto.IllegalBlockSizeException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException {
        /*
            Method dump skipped, instruction units count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.h2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
