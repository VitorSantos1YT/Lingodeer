package fr;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f3 extends xy.i implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f27509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i3 f27511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f27512d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(int i11, i3 i3Var, vy.d dVar) {
        super(1, dVar);
        this.f27511c = i3Var;
        this.f27512d = i11;
    }

    @Override // xy.a
    public final vy.d create(vy.d dVar) {
        return new f3(this.f27512d, this.f27511c, dVar);
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        return ((f3) create((vy.d) obj)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0132  */
    /* JADX WARN: Code duplicated, block: B:39:0x0155 A[LOOP:1: B:38:0x0153->B:39:0x0155, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x01e8 A[LOOP:2: B:47:0x01e2->B:49:0x01e8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x0288 A[LOOP:3: B:51:0x0286->B:52:0x0288, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x0392 A[PHI: r0 r6 r12 r17 r29
      0x0392: PHI (r0v3 java.lang.Object) = (r0v1 java.lang.Object), (r0v14 java.lang.Object) binds: [B:61:0x038f, B:12:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0392: PHI (r6v25 fr.f3) = (r6v23 fr.f3), (r6v0 fr.f3) binds: [B:61:0x038f, B:12:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0392: PHI (r12v21 ??) = (r12v24 ??), (r12v23 ??) binds: [B:61:0x038f, B:12:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0392: PHI (r17v4 boolean) = (r17v2 boolean), (r17v6 boolean) binds: [B:61:0x038f, B:12:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0392: PHI (r29v4 boolean) = (r29v2 boolean), (r29v7 boolean) binds: [B:61:0x038f, B:12:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0398  */
    /* JADX WARN: Code duplicated, block: B:66:0x039b  */
    /* JADX WARN: Code duplicated, block: B:68:0x039f  */
    /* JADX WARN: Code duplicated, block: B:74:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:77:0x013f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x032d, code lost:
    
        if (r1 == r9) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x03c2, code lost:
    
        if (rz.e0.l(r1, r6) == r9) goto L70;
     */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.util.ArrayList, vy.d] */
    /* JADX WARN: Type inference failed for: r12v21, types: [java.util.ArrayList, vy.d] */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r43) throws javax.crypto.BadPaddingException, javax.crypto.NoSuchPaddingException, javax.crypto.IllegalBlockSizeException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException {
        /*
            Method dump skipped, instruction units count: 985
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.f3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
