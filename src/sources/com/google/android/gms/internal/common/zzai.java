package com.google.android.gms.internal.common;

import defpackage.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzai {
    public static void a(int i11, Object[] objArr) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (objArr[i12] == null) {
                throw new NullPointerException(e.g(i12, "at index ", new StringBuilder(String.valueOf(i12).length() + 9)));
            }
        }
    }
}
