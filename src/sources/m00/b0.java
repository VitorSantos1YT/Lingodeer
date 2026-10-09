package m00;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f40675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f40676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e0 f40677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f40678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f40679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f40680f;

    public b0(k kVar) {
        this.f40675a = kVar;
        i iVarN = kVar.n();
        this.f40676b = iVarN;
        e0 e0Var = iVarN.f40717a;
        this.f40677c = e0Var;
        this.f40678d = e0Var != null ? e0Var.f40702b : -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f40679e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r5.f40702b) goto L15;
     */
    @Override // m00.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long read(m00.i r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.m.f(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L6b
            boolean r3 = r8.f40679e
            if (r3 != 0) goto L63
            m00.e0 r3 = r8.f40677c
            m00.i r4 = r8.f40676b
            if (r3 == 0) goto L2b
            m00.e0 r5 = r4.f40717a
            if (r3 != r5) goto L23
            int r3 = r8.f40678d
            kotlin.jvm.internal.m.c(r5)
            int r5 = r5.f40702b
            if (r3 != r5) goto L23
            goto L2b
        L23:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L2b:
            if (r2 != 0) goto L2e
            return r0
        L2e:
            long r0 = r8.f40680f
            r2 = 1
            long r0 = r0 + r2
            m00.k r2 = r8.f40675a
            boolean r0 = r2.request(r0)
            if (r0 != 0) goto L3e
            r9 = -1
            return r9
        L3e:
            m00.e0 r0 = r8.f40677c
            if (r0 != 0) goto L4c
            m00.e0 r0 = r4.f40717a
            if (r0 == 0) goto L4c
            r8.f40677c = r0
            int r0 = r0.f40702b
            r8.f40678d = r0
        L4c:
            long r0 = r4.f40718b
            long r2 = r8.f40680f
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            m00.i r2 = r8.f40676b
            long r4 = r8.f40680f
            r3 = r9
            r2.f(r3, r4, r6)
            long r9 = r8.f40680f
            long r9 = r9 + r6
            r8.f40680f = r9
            return r6
        L63:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        L6b:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = defpackage.e.h(r10, r9)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: m00.b0.read(m00.i, long):long");
    }

    @Override // m00.i0
    public final k0 timeout() {
        return this.f40675a.timeout();
    }
}
