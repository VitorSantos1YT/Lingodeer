package fr;

import com.lingodeer.network.model.ApiResponse;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m4 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f27706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f27707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ApiResponse f27708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f27710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x4 f27711f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(boolean z11, x4 x4Var, vy.d dVar) {
        super(2, dVar);
        this.f27710e = z11;
        this.f27711f = x4Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new m4(this.f27710e, this.f27711f, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((m4) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:39:0x0101 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0103  */
    /* JADX WARN: Code duplicated, block: B:43:0x012d A[PHI: r0 r1 r2
      0x012d: PHI (r0v12 com.lingodeer.network.model.ApiResponse) = (r0v8 com.lingodeer.network.model.ApiResponse), (r0v13 com.lingodeer.network.model.ApiResponse) binds: [B:41:0x0129, B:15:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x012d: PHI (r1v16 java.util.List) = (r1v14 java.util.List), (r1v17 java.util.List) binds: [B:41:0x0129, B:15:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x012d: PHI (r2v25 java.lang.Object) = (r2v24 java.lang.Object), (r2v28 java.lang.Object) binds: [B:41:0x0129, B:15:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x0140 A[PHI: r0 r1
      0x0140: PHI (r0v14 com.lingodeer.network.model.ApiResponse) = (r0v12 com.lingodeer.network.model.ApiResponse), (r0v15 com.lingodeer.network.model.ApiResponse) binds: [B:44:0x013c, B:14:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0140: PHI (r1v18 java.util.List) = (r1v16 java.util.List), (r1v19 java.util.List) binds: [B:44:0x013c, B:14:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x015f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0164 A[PHI: r0 r1
      0x0164: PHI (r0v16 com.lingodeer.network.model.ApiResponse) = (r0v14 com.lingodeer.network.model.ApiResponse), (r0v17 com.lingodeer.network.model.ApiResponse) binds: [B:50:0x0160, B:13:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0164: PHI (r1v20 java.util.List) = (r1v18 java.util.List), (r1v21 java.util.List) binds: [B:50:0x0160, B:13:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x0183  */
    /* JADX WARN: Code duplicated, block: B:58:0x0188 A[PHI: r0 r1
      0x0188: PHI (r0v18 com.lingodeer.network.model.ApiResponse) = (r0v16 com.lingodeer.network.model.ApiResponse), (r0v19 com.lingodeer.network.model.ApiResponse) binds: [B:56:0x0184, B:12:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x0188: PHI (r1v22 java.util.List) = (r1v20 java.util.List), (r1v23 java.util.List) binds: [B:56:0x0184, B:12:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ac A[PHI: r0 r1
      0x01ac: PHI (r0v20 com.lingodeer.network.model.ApiResponse) = (r0v18 com.lingodeer.network.model.ApiResponse), (r0v21 com.lingodeer.network.model.ApiResponse) binds: [B:62:0x01a8, B:11:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x01ac: PHI (r1v24 java.util.List) = (r1v22 java.util.List), (r1v25 java.util.List) binds: [B:62:0x01a8, B:11:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d1 A[PHI: r0 r1
      0x01d1: PHI (r0v22 com.lingodeer.network.model.ApiResponse) = (r0v20 com.lingodeer.network.model.ApiResponse), (r0v23 com.lingodeer.network.model.ApiResponse) binds: [B:68:0x01cd, B:10:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x01d1: PHI (r1v26 java.util.List) = (r1v24 java.util.List), (r1v27 java.util.List) binds: [B:68:0x01cd, B:10:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:78:0x020d A[PHI: r0 r1 r2
      0x020d: PHI (r0v30 com.lingodeer.network.model.ApiResponse) = (r0v8 com.lingodeer.network.model.ApiResponse), (r0v31 com.lingodeer.network.model.ApiResponse) binds: [B:76:0x020a, B:8:0x0022] A[DONT_GENERATE, DONT_INLINE]
      0x020d: PHI (r1v30 java.util.List) = (r1v14 java.util.List), (r1v31 java.util.List) binds: [B:76:0x020a, B:8:0x0022] A[DONT_GENERATE, DONT_INLINE]
      0x020d: PHI (r2v58 java.lang.Object) = (r2v16 java.lang.Object), (r2v61 java.lang.Object) binds: [B:76:0x020a, B:8:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x0220 A[PHI: r0 r1
      0x0220: PHI (r0v25 com.lingodeer.network.model.ApiResponse) = 
      (r0v22 com.lingodeer.network.model.ApiResponse)
      (r0v24 com.lingodeer.network.model.ApiResponse)
      (r0v30 com.lingodeer.network.model.ApiResponse)
     binds: [B:73:0x01f1, B:9:0x002c, B:79:0x021d] A[DONT_GENERATE, DONT_INLINE]
      0x0220: PHI (r1v29 java.util.List) = (r1v26 java.util.List), (r1v28 java.util.List), (r1v30 java.util.List) binds: [B:73:0x01f1, B:9:0x002c, B:79:0x021d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x0239  */
    /* JADX WARN: Code duplicated, block: B:90:0x0250  */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0247, code lost:
    
        if (fr.x4.g(r12, r10, r14) == r7) goto L86;
     */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.m4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
