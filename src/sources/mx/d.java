package mx;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements bx.d {
    private static final /* synthetic */ d[] $VALUES;
    public static final d INSTANCE;

    static {
        d dVar = new d("INSTANCE", 0);
        INSTANCE = dVar;
        $VALUES = new d[]{dVar};
    }

    public static void b(n20.b bVar) {
        bVar.c(INSTANCE);
        bVar.onComplete();
    }

    public static void c(Throwable th2, n20.b bVar) {
        bVar.c(INSTANCE);
        bVar.onError(th2);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    @Override // bx.c
    public final int a(int i11) {
        return 2;
    }

    @Override // bx.g
    public final boolean isEmpty() {
        return true;
    }

    @Override // bx.g
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // bx.g
    public final Object poll() {
        return null;
    }

    @Override // n20.c
    public final void request(long j11) {
        g.c(j11);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "EmptySubscription";
    }

    @Override // n20.c
    public final void cancel() {
    }

    @Override // bx.g
    public final void clear() {
    }
}
