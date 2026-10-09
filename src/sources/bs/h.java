package bs;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h FIRST_TONE;
    public static final h FOURTH_TONE;
    public static final h NEUTRAL_TONE;
    public static final h SECOND_TONE;
    public static final h THIRD_TONE;

    static {
        h hVar = new h("FIRST_TONE", 0);
        FIRST_TONE = hVar;
        h hVar2 = new h("SECOND_TONE", 1);
        SECOND_TONE = hVar2;
        h hVar3 = new h("THIRD_TONE", 2);
        THIRD_TONE = hVar3;
        h hVar4 = new h("FOURTH_TONE", 3);
        FOURTH_TONE = hVar4;
        h hVar5 = new h("NEUTRAL_TONE", 4);
        NEUTRAL_TONE = hVar5;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5};
        $VALUES = hVarArr;
        $ENTRIES = ub.a.U(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
