package y;

import com.google.zxing.pdf417.decoder.vBn.xTCJ;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object[] f56745a = new Object[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e0 f56746b = new e0(0);

    public static final void a(int i11, List list) {
        int size = list.size();
        if (i11 < 0 || i11 >= size) {
            z.a.d("Index " + i11 + " is out of bounds. The list has " + size + " elements.");
            throw null;
        }
    }

    public static final void b(int i11, int i12, List list) {
        int size = list.size();
        if (i11 <= i12) {
            if (i11 >= 0) {
                if (i12 <= size) {
                    return;
                }
                z.a.d("toIndex (" + i12 + ") is more than than the list size (" + size + ')');
                throw null;
            }
            z.a.d(xTCJ.rSVkjXCGfGi + i11 + ") is less than 0.");
            throw null;
        }
        z.a.c("Indices are out of order. fromIndex (" + i11 + ") is greater than toIndex (" + i12 + ").");
        throw null;
    }
}
