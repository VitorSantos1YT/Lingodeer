package lw;

import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class x0 extends z0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y0 f40487e;

    public x0(String str, y0 y0Var) {
        super(str, false, y0Var);
        Preconditions.h(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        Preconditions.k(y0Var, "marshaller");
        this.f40487e = y0Var;
    }

    @Override // lw.z0
    public final Object a(byte[] bArr) {
        return this.f40487e.i(new String(bArr, Charsets.f16352a));
    }

    @Override // lw.z0
    public final byte[] b(Object obj) {
        String strA = this.f40487e.a(obj);
        Preconditions.k(strA, "null marshaller.toAsciiString()");
        return strA.getBytes(Charsets.f16352a);
    }
}
