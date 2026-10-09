package com.stkouyu.util.httputil;

import defpackage.e;
import java.util.Collection;
import okhttp3.internal.platform.ZjS.OYAvlbfUyD;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class Args {
    public static void check(boolean z11, String str) {
        if (!z11) {
            throw new IllegalArgumentException(str);
        }
    }

    public static <T extends CharSequence> T containsNoBlanks(T t6, String str) {
        if (t6 == null) {
            throw new IllegalArgumentException(e.m(str, " may not be null"));
        }
        if (t6.length() == 0) {
            throw new IllegalArgumentException(e.m(str, " may not be empty"));
        }
        if (TextUtils.containsBlanks(t6)) {
            throw new IllegalArgumentException(e.m(str, " may not contain blanks"));
        }
        return t6;
    }

    public static <T extends CharSequence> T notBlank(T t6, String str) {
        if (t6 == null) {
            throw new IllegalArgumentException(e.m(str, " may not be null"));
        }
        if (TextUtils.isBlank(t6)) {
            throw new IllegalArgumentException(e.m(str, " may not be blank"));
        }
        return t6;
    }

    public static <T extends CharSequence> T notEmpty(T t6, String str) {
        if (t6 == null) {
            throw new IllegalArgumentException(e.m(str, OYAvlbfUyD.HFQQso));
        }
        if (TextUtils.isEmpty(t6)) {
            throw new IllegalArgumentException(e.m(str, " may not be empty"));
        }
        return t6;
    }

    public static int notNegative(int i11, String str) {
        if (i11 >= 0) {
            return i11;
        }
        throw new IllegalArgumentException(e.m(str, " may not be negative"));
    }

    public static <T> T notNull(T t6, String str) {
        if (t6 != null) {
            return t6;
        }
        throw new IllegalArgumentException(e.m(str, " may not be null"));
    }

    public static int positive(int i11, String str) {
        if (i11 > 0) {
            return i11;
        }
        throw new IllegalArgumentException(e.m(str, " may not be negative or zero"));
    }

    public static void check(boolean z11, String str, Object... objArr) {
        if (!z11) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void check(boolean z11, String str, Object obj) {
        if (!z11) {
            throw new IllegalArgumentException(String.format(str, obj));
        }
    }

    public static long notNegative(long j11, String str) {
        if (j11 >= 0) {
            return j11;
        }
        throw new IllegalArgumentException(e.m(str, " may not be negative"));
    }

    public static long positive(long j11, String str) {
        if (j11 > 0) {
            return j11;
        }
        throw new IllegalArgumentException(e.m(str, " may not be negative or zero"));
    }

    public static <E, T extends Collection<E>> T notEmpty(T t6, String str) {
        if (t6 != null) {
            if (t6.isEmpty()) {
                throw new IllegalArgumentException(e.m(str, " may not be empty"));
            }
            return t6;
        }
        throw new IllegalArgumentException(e.m(str, " may not be null"));
    }
}
