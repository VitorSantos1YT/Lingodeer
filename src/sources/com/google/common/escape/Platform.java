package com.google.common.escape;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class Platform {
    static {
        new ThreadLocal<char[]>() { // from class: com.google.common.escape.Platform.1
            @Override // java.lang.ThreadLocal
            public final char[] initialValue() {
                return new char[1024];
            }
        };
    }

    private Platform() {
    }
}
