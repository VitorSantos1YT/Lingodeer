package zu;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a Error;
    public static final a Idle;
    public static final a Loading;
    public static final a Success;

    static {
        a aVar = new a("Idle", 0);
        Idle = aVar;
        a aVar2 = new a("Loading", 1);
        Loading = aVar2;
        a aVar3 = new a("Success", 2);
        Success = aVar3;
        a aVar4 = new a("Error", 3);
        Error = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        $VALUES = aVarArr;
        $ENTRIES = ub.a.U(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
