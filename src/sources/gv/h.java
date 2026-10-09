package gv;

import android.content.Context;
import com.alibaba.sdk.android.oss.common.auth.OSSFederationToken;
import dv.u0;
import fr.o0;
import kotlin.jvm.internal.m;
import vt.n0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f29875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f29876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u0 f29877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n0 f29878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OSSFederationToken f29879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f29880f;

    public h(Context context, u0 u0Var, n0 n0Var) {
        a aVar = new a();
        this.f29875a = context;
        this.f29876b = aVar;
        this.f29877c = u0Var;
        this.f29878d = n0Var;
        b();
        this.f29880f = new f(this);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x013c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0140 A[PHI: r4 r7 r8
      0x0140: PHI (r4v5 long) = (r4v4 long), (r4v12 long) binds: [B:43:0x013d, B:20:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0140: PHI (r7v11 com.lingodeer.network.model.AssAclResponse) = (r7v10 com.lingodeer.network.model.AssAclResponse), (r7v14 com.lingodeer.network.model.AssAclResponse) binds: [B:43:0x013d, B:20:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0140: PHI (r8v4 ??) = (r6v0 vy.d), (r8v7 ??) binds: [B:43:0x013d, B:20:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x0163  */
    /* JADX WARN: Code duplicated, block: B:51:0x0167 A[PHI: r4 r7 r8
      0x0167: PHI (r4v6 long) = (r4v5 long), (r4v13 long) binds: [B:49:0x0164, B:19:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x0167: PHI (r7v12 com.lingodeer.network.model.AssAclResponse) = (r7v11 com.lingodeer.network.model.AssAclResponse), (r7v15 com.lingodeer.network.model.AssAclResponse) binds: [B:49:0x0164, B:19:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x0167: PHI (r8v5 ??) = (r8v4 ??), (r8v8 ??) binds: [B:49:0x0164, B:19:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x0189  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x018a, code lost:
    
        if (r1 == r3) goto L56;
     */
    /* JADX WARN: Type inference failed for: r8v4, types: [vy.d] */
    /* JADX WARN: Type inference failed for: r8v5, types: [com.lingodeer.network.model.AssAclResponse, vy.d] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(gv.h r22, xy.c r23) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gv.h.a(gv.h, xy.c):java.lang.Object");
    }

    public final void b() {
        n0 n0Var = this.f29878d;
        String ossAccessKeyId = ((o0) n0Var).f27733a.ossAccessKeyId;
        m.e(ossAccessKeyId, "ossAccessKeyId");
        String ossAccessKeySecret = ((o0) n0Var).f27733a.ossAccessKeySecret;
        m.e(ossAccessKeySecret, "ossAccessKeySecret");
        String ossToken = ((o0) n0Var).f27733a.ossToken;
        m.e(ossToken, "ossToken");
        this.f29879e = new OSSFederationToken(ossAccessKeyId, ossAccessKeySecret, ossToken, ((o0) n0Var).f27733a.ossExpires);
    }
}
