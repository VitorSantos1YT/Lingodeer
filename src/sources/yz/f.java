package yz;

import rz.y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f58389b;

    static {
        int i11 = l.f58397c;
        int i12 = l.f58398d;
        long j11 = l.f58399e;
        String str = l.f58395a;
        f fVar = new f();
        fVar.f58391a = new d(i11, i12, j11, str);
        f58389b = fVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // rz.y
    public final y limitedParallelism(int i11, String str) {
        wz.b.a(i11);
        if (i11 >= l.f58397c) {
            return str != null ? new wz.n(this, str) : this;
        }
        return super.limitedParallelism(i11, str);
    }

    @Override // rz.y
    public final String toString() {
        return "Dispatchers.Default";
    }
}
