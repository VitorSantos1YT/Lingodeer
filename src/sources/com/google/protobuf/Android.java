package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class Android {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f21143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f21144b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f21143a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f21144b = cls2 != null;
    }

    private Android() {
    }

    public static boolean a() {
        return (f21143a == null || f21144b) ? false : true;
    }
}
