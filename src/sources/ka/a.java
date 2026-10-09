package ka;

import android.content.ContentValues;
import android.database.Cursor;
import java.io.Closeable;
import la.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface a extends Closeable {
    Cursor N0(f fVar);

    void P();

    boolean U0();

    void d0(Object[] objArr);

    boolean e1();

    void f0();

    boolean isOpen();

    void j();

    void k(String str);

    j m(String str);

    void o();

    void r();

    int u1(ContentValues contentValues, Object[] objArr);
}
