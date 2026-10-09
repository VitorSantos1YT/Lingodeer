package la;

import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class i implements ka.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SQLiteProgram f39866a;

    public i(SQLiteProgram delegate) {
        m.f(delegate, "delegate");
        this.f39866a = delegate;
    }

    @Override // ka.e
    public final void L(int i11, double d5) {
        this.f39866a.bindDouble(i11, d5);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f39866a.close();
    }

    @Override // ka.e
    public final void g(int i11, long j11) {
        this.f39866a.bindLong(i11, j11);
    }

    @Override // ka.e
    public final void l(int i11, String value) {
        m.f(value, "value");
        this.f39866a.bindString(i11, value);
    }

    @Override // ka.e
    public final void s(int i11) {
        this.f39866a.bindNull(i11);
    }

    @Override // ka.e
    public final void t0(byte[] bArr, int i11) {
        this.f39866a.bindBlob(i11, bArr);
    }
}
