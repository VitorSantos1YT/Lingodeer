package hu;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c TYPE_BODY;
    public static final c TYPE_EMPTY;
    public static final c TYPE_END;
    public static final c TYPE_SINGLE;
    public static final c TYPE_START;

    static {
        c cVar = new c("TYPE_START", 0);
        TYPE_START = cVar;
        c cVar2 = new c("TYPE_BODY", 1);
        TYPE_BODY = cVar2;
        c cVar3 = new c("TYPE_END", 2);
        TYPE_END = cVar3;
        c cVar4 = new c("TYPE_SINGLE", 3);
        TYPE_SINGLE = cVar4;
        c cVar5 = new c("TYPE_EMPTY", 4);
        TYPE_EMPTY = cVar5;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
        $VALUES = cVarArr;
        $ENTRIES = ub.a.U(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
