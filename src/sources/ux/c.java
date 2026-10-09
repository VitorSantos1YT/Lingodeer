package ux;

import qx.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements iy.a {
    private static final /* synthetic */ c[] $VALUES;
    public static final c INSTANCE;
    public static final c NEVER;

    static {
        c cVar = new c("INSTANCE", 0);
        INSTANCE = cVar;
        c cVar2 = new c("NEVER", 1);
        NEVER = cVar2;
        $VALUES = new c[]{cVar, cVar2};
    }

    public static void c(k kVar) {
        kVar.c(INSTANCE);
        kVar.onComplete();
    }

    public static void e(Throwable th2, k kVar) {
        kVar.c(INSTANCE);
        kVar.onError(th2);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    @Override // iy.b
    public final int a(int i11) {
        return 2;
    }

    @Override // rx.b
    public final boolean b() {
        return this == INSTANCE;
    }

    @Override // iy.f
    public final boolean isEmpty() {
        return true;
    }

    @Override // iy.f
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // iy.f
    public final Object poll() {
        return null;
    }

    @Override // iy.f
    public final void clear() {
    }

    @Override // rx.b
    public final void dispose() {
    }
}
