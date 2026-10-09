package lw;

import com.google.common.base.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a1 extends z0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b1 f40341e;

    public a1(String str, boolean z11, b1 b1Var) {
        super(str, z11, b1Var);
        Preconditions.h(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        this.f40341e = b1Var;
    }

    @Override // lw.z0
    public final Object a(byte[] bArr) {
        return this.f40341e.m(bArr);
    }

    @Override // lw.z0
    public final byte[] b(Object obj) {
        byte[] bArrMo227a = this.f40341e.mo227a(obj);
        Preconditions.k(bArrMo227a, "null marshaller.toAsciiString()");
        return bArrMo227a;
    }
}
