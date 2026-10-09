package com.google.common.base;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class Verify {
    private Verify() {
    }

    public static void a(String str, boolean z11, Object obj) {
        if (!z11) {
            throw new VerifyException(Strings.c(str, obj));
        }
    }
}
