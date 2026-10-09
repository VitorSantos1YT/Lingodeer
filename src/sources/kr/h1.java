package kr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h1 extends xy.i implements fz.e {
    public final /* synthetic */ l1 H;
    public final /* synthetic */ a1 K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f38484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f38485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public kotlin.jvm.internal.w f38486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.i1 f38487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f38488e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f38489f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f38490t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(a1 a1Var, l1 l1Var, vy.d dVar) {
        super(2, dVar);
        this.H = l1Var;
        this.K = a1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new h1(this.K, this.H, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((h1) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0112 A[Catch: all -> 0x00f9, PHI: r3 r7 r9 r11 r14 r17
      0x0112: PHI (r3v3 int) = (r3v2 int), (r3v21 int) binds: [B:64:0x013e, B:59:0x010c] A[DONT_GENERATE, DONT_INLINE]
      0x0112: PHI (r7v3 boolean) = (r7v2 boolean), (r7v13 boolean) binds: [B:64:0x013e, B:59:0x010c] A[DONT_GENERATE, DONT_INLINE]
      0x0112: PHI (r9v1 long) = (r9v0 long), (r9v5 long) binds: [B:64:0x013e, B:59:0x010c] A[DONT_GENERATE, DONT_INLINE]
      0x0112: PHI (r11v1 long) = (r11v0 long), (r11v6 long) binds: [B:64:0x013e, B:59:0x010c] A[DONT_GENERATE, DONT_INLINE]
      0x0112: PHI (r14v1 uz.i1) = (r14v0 uz.i1), (r14v4 uz.i1) binds: [B:64:0x013e, B:59:0x010c] A[DONT_GENERATE, DONT_INLINE]
      0x0112: PHI (r17v1 kr.l1) = (r17v0 kr.l1), (r17v11 kr.l1) binds: [B:64:0x013e, B:59:0x010c] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x00f9, blocks: (B:43:0x00d1, B:46:0x00eb, B:48:0x00f3, B:67:0x0147, B:60:0x0112, B:63:0x0138), top: B:82:0x00d1 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0137  */
    /* JADX WARN: Code duplicated, block: B:63:0x0138 A[Catch: all -> 0x00f9, PHI: r3 r4 r5 r7 r9 r11 r13 r14 r17
      0x0138: PHI (r3v2 int) = (r3v3 int), (r3v26 int) binds: [B:61:0x0135, B:15:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x0138: PHI (r4v4 char) = (r4v7 char), (r4v23 char) binds: [B:61:0x0135, B:15:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x0138: PHI (r5v2 java.lang.Object) = (r5v6 java.lang.Object), (r5v13 java.lang.Object) binds: [B:61:0x0135, B:15:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x0138: PHI (r7v2 boolean) = (r7v3 boolean), (r7v17 boolean) binds: [B:61:0x0135, B:15:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x0138: PHI (r9v0 long) = (r9v1 long), (r9v8 long) binds: [B:61:0x0135, B:15:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x0138: PHI (r11v0 long) = (r11v1 long), (r11v8 long) binds: [B:61:0x0135, B:15:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x0138: PHI (r13v0 java.lang.Object) = (r13v2 java.lang.Object), (r13v10 java.lang.Object) binds: [B:61:0x0135, B:15:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x0138: PHI (r14v0 uz.i1) = (r14v1 uz.i1), (r14v7 uz.i1) binds: [B:61:0x0135, B:15:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x0138: PHI (r17v0 kr.l1) = (r17v1 kr.l1), (r17v17 kr.l1) binds: [B:61:0x0135, B:15:0x0037] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x00f9, blocks: (B:43:0x00d1, B:46:0x00eb, B:48:0x00f3, B:67:0x0147, B:60:0x0112, B:63:0x0138), top: B:82:0x00d1 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0140  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00fe -> B:41:0x00c1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x013e -> B:60:0x0112). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x015a -> B:70:0x015d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kr.h1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
