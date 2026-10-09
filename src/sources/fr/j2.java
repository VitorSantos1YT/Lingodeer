package fr;

import com.lingodeer.network.model.ApiResponse;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class j2 extends xy.i implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ApiResponse f27630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f27631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i3 f27633d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(i3 i3Var, vy.d dVar) {
        super(1, dVar);
        this.f27633d = i3Var;
    }

    @Override // xy.a
    public final vy.d create(vy.d dVar) {
        return new j2(this.f27633d, dVar);
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        return ((j2) create((vy.d) obj)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009d  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:50:0x0117 A[LOOP:0: B:48:0x0111->B:50:0x0117, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x0138  */
    /* JADX WARN: Code duplicated, block: B:56:0x014a  */
    /* JADX WARN: Code duplicated, block: B:57:0x015d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0177 A[PHI: r3
      0x0177: PHI (r3v5 ??) = (r3v4 ??), (r3v6 ??) binds: [B:61:0x0174, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0182, code lost:
    
        if (r10.d(r26) == r1) goto L65;
     */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.lingodeer.network.model.ApiResponse, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) throws javax.crypto.BadPaddingException, javax.crypto.NoSuchPaddingException, javax.crypto.IllegalBlockSizeException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.j2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
