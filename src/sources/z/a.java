package z;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f58407a = new int[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f58408b = new long[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object[] f58409c = new Object[0];

    public static final int a(int i11, int i12, int[] array) {
        m.f(array, "array");
        int i13 = i11 - 1;
        int i14 = 0;
        while (i14 <= i13) {
            int i15 = (i14 + i13) >>> 1;
            int i16 = array[i15];
            if (i16 < i12) {
                i14 = i15 + 1;
            } else {
                if (i16 <= i12) {
                    return i15;
                }
                i13 = i15 - 1;
            }
        }
        return ~i14;
    }

    public static final int b(long[] array, int i11, long j11) {
        m.f(array, "array");
        int i12 = i11 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            long j12 = array[i14];
            if (j12 < j11) {
                i13 = i14 + 1;
            } else {
                if (j12 <= j11) {
                    return i14;
                }
                i12 = i14 - 1;
            }
        }
        return ~i13;
    }

    public static final void c(String message) {
        m.f(message, "message");
        throw new IllegalArgumentException(message);
    }

    public static final void d(String message) {
        m.f(message, "message");
        throw new IndexOutOfBoundsException(message);
    }

    public static final void e(String message) {
        m.f(message, "message");
        throw new NoSuchElementException(message);
    }
}
