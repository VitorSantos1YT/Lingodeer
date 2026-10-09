package fr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g1 extends xy.i implements fz.e {
    public String H;
    public uz.j K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public /* synthetic */ Object R;
    public final /* synthetic */ v1 S;
    public final /* synthetic */ String T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f27526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f27527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f27528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f27529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f27530f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f27531t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(v1 v1Var, String str, vy.d dVar) {
        super(2, dVar);
        this.S = v1Var;
        this.T = str;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        g1 g1Var = new g1(this.S, this.T, dVar);
        g1Var.R = obj;
        return g1Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g1) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0093, code lost:
    
        if (r1.emit(null, r42) == r2) goto L17;
     */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r43) throws javax.crypto.BadPaddingException, javax.crypto.NoSuchPaddingException, javax.crypto.IllegalBlockSizeException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.g1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
