package v5;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f53561d = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f53562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ob.i f53563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f53564c = 0;

    public v(ob.i iVar, int i11) {
        this.f53563b = iVar;
        this.f53562a = i11;
    }

    public final int a(int i11) {
        w5.a aVarB = b();
        int iA = aVarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) aVarB.f51943d;
        int i12 = iA + aVarB.f51940a;
        return byteBuffer.getInt((i11 * 4) + byteBuffer.getInt(i12) + i12 + 4);
    }

    public final w5.a b() {
        ThreadLocal threadLocal = f53561d;
        w5.a aVar = (w5.a) threadLocal.get();
        if (aVar == null) {
            aVar = new w5.a();
            threadLocal.set(aVar);
        }
        w5.b bVar = (w5.b) this.f53563b.f44813b;
        int iA = bVar.a(6);
        if (iA != 0) {
            int i11 = iA + bVar.f51940a;
            int i12 = (this.f53562a * 4) + ((ByteBuffer) bVar.f51943d).getInt(i11) + i11 + 4;
            int i13 = ((ByteBuffer) bVar.f51943d).getInt(i12) + i12;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f51943d;
            aVar.f51943d = byteBuffer;
            if (byteBuffer != null) {
                aVar.f51940a = i13;
                int i14 = i13 - byteBuffer.getInt(i13);
                aVar.f51941b = i14;
                aVar.f51942c = ((ByteBuffer) aVar.f51943d).getShort(i14);
                return aVar;
            }
            aVar.f51940a = 0;
            aVar.f51941b = 0;
            aVar.f51942c = 0;
        }
        return aVar;
    }

    public final String toString() {
        int i11;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        w5.a aVarB = b();
        int iA = aVarB.a(4);
        sb2.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) aVarB.f51943d).getInt(iA + aVarB.f51940a) : 0));
        sb2.append(", codepoints:");
        w5.a aVarB2 = b();
        int iA2 = aVarB2.a(16);
        if (iA2 != 0) {
            int i12 = iA2 + aVarB2.f51940a;
            i11 = ((ByteBuffer) aVarB2.f51943d).getInt(((ByteBuffer) aVarB2.f51943d).getInt(i12) + i12);
        } else {
            i11 = 0;
        }
        for (int i13 = 0; i13 < i11; i13++) {
            sb2.append(Integer.toHexString(a(i13)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
