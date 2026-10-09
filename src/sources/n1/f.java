package n1;

import hh.p0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final void a(int i11, List list) {
        int size = list.size();
        if (i11 < 0 || i11 >= size) {
            c(i11, size);
        }
    }

    public static final void b(int i11, int i12, List list) {
        if (i11 > i12) {
            f(i11, i12);
        }
        if (i11 < 0) {
            d(i11);
        }
        if (i12 > list.size()) {
            e(i12, list.size());
        }
    }

    private static final void c(int i11, int i12) {
        throw new IndexOutOfBoundsException(p0.l("Index ", i11, " is out of bounds. The list has ", i12, " elements."));
    }

    private static final void d(int i11) {
        throw new IndexOutOfBoundsException(p0.h(i11, "fromIndex (", ") is less than 0."));
    }

    private static final void e(int i11, int i12) {
        throw new IndexOutOfBoundsException("toIndex (" + i11 + ") is more than than the list size (" + i12 + ')');
    }

    private static final void f(int i11, int i12) {
        throw new IllegalArgumentException(p0.l("Indices are out of order. fromIndex (", i11, ") is greater than toIndex (", i12, ")."));
    }
}
