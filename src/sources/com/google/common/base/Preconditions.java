package com.google.common.base;

import dl.ExOZ.xItStCyvVEZ;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class Preconditions {
    private Preconditions() {
    }

    public static String a(int i11, int i12, String str) {
        if (i11 < 0) {
            return Strings.c("%s (%s) must not be negative", str, Integer.valueOf(i11));
        }
        if (i12 >= 0) {
            return Strings.c("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i11), Integer.valueOf(i12));
        }
        throw new IllegalArgumentException(p.j(i12, "negative size: "));
    }

    public static void b(int i11, String str, boolean z11) {
        if (!z11) {
            throw new IllegalArgumentException(Strings.c(str, Integer.valueOf(i11)));
        }
    }

    public static void c(int i11, boolean z11, int i12, String str) {
        if (!z11) {
            throw new IllegalArgumentException(Strings.c(str, Integer.valueOf(i11), Integer.valueOf(i12)));
        }
    }

    public static void d(long j11, String str, boolean z11) {
        if (!z11) {
            throw new IllegalArgumentException(Strings.c(str, Long.valueOf(j11)));
        }
    }

    public static void e(String str, boolean z11) {
        if (!z11) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void f(String str, boolean z11, Object obj) {
        if (!z11) {
            throw new IllegalArgumentException(Strings.c(str, obj));
        }
    }

    public static void g(boolean z11) {
        if (!z11) {
            throw new IllegalArgumentException();
        }
    }

    public static void h(boolean z11, String str, Object obj, Object obj2) {
        if (!z11) {
            throw new IllegalArgumentException(Strings.c(str, obj, obj2));
        }
    }

    public static void i(int i11, int i12) {
        String strC;
        if (i11 < 0 || i11 >= i12) {
            if (i11 < 0) {
                strC = Strings.c("%s (%s) must not be negative", "index", Integer.valueOf(i11));
            } else {
                if (i12 < 0) {
                    throw new IllegalArgumentException(p.j(i12, "negative size: "));
                }
                strC = Strings.c("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i11), Integer.valueOf(i12));
            }
            throw new IndexOutOfBoundsException(strC);
        }
    }

    public static void j(Object obj, Object obj2, String str) {
        if (obj == null) {
            throw new NullPointerException(Strings.c(str, obj2));
        }
    }

    public static void k(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    public static void l(int i11, int i12) {
        if (i11 < 0 || i11 > i12) {
            throw new IndexOutOfBoundsException(a(i11, i12, "index"));
        }
    }

    public static void n(int i11, String str, boolean z11) {
        if (!z11) {
            throw new IllegalStateException(Strings.c(str, Integer.valueOf(i11)));
        }
    }

    public static void o(long j11, String str, boolean z11) {
        if (!z11) {
            throw new IllegalStateException(Strings.c(str, Long.valueOf(j11)));
        }
    }

    public static void p(String str, boolean z11) {
        if (!z11) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void q(String str, boolean z11, Object obj) {
        if (!z11) {
            throw new IllegalStateException(Strings.c(str, obj));
        }
    }

    public static void r(boolean z11) {
        if (!z11) {
            throw new IllegalStateException();
        }
    }

    public static void m(int i11, int i12, int i13) {
        String strA;
        if (i11 < 0 || i12 < i11 || i12 > i13) {
            if (i11 < 0 || i11 > i13) {
                strA = a(i11, i13, xItStCyvVEZ.NvadgRwOjqA);
            } else {
                strA = (i12 < 0 || i12 > i13) ? a(i12, i13, "end index") : Strings.c("end index (%s) must not be less than start index (%s)", Integer.valueOf(i12), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strA);
        }
    }
}
