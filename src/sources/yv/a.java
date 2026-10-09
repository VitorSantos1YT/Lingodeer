package yv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ a[] $VALUES;
    public static final a connected;
    public static final a disconnected;
    public static final a lost;

    static {
        a aVar = new a("connected", 0);
        connected = aVar;
        a aVar2 = new a("disconnected", 1);
        disconnected = aVar2;
        a aVar3 = new a("lost", 2);
        lost = aVar3;
        $VALUES = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
