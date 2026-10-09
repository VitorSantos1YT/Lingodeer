package zw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements bx.b {
    private static final /* synthetic */ b[] $VALUES;
    public static final b INSTANCE;
    public static final b NEVER;

    static {
        b bVar = new b("INSTANCE", 0);
        INSTANCE = bVar;
        b bVar2 = new b("NEVER", 1);
        NEVER = bVar2;
        $VALUES = new b[]{bVar, bVar2};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
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

    @Override // bx.g
    public final void clear() {
    }

    @Override // ww.b
    public final void dispose() {
    }
}
