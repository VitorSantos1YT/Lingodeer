package w00;

import bw.ORXQ.ADSb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l {
    private static final /* synthetic */ l[] $VALUES;
    public static final l DESTINATION;
    public static final l LABEL;
    public static final l PARAGRAPH;
    public static final l START_DEFINITION;
    public static final l START_TITLE;
    public static final l TITLE;

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }

    static {
        l lVar = new l("START_DEFINITION", 0);
        START_DEFINITION = lVar;
        l lVar2 = new l("LABEL", 1);
        LABEL = lVar2;
        l lVar3 = new l("DESTINATION", 2);
        DESTINATION = lVar3;
        l lVar4 = new l("START_TITLE", 3);
        START_TITLE = lVar4;
        l lVar5 = new l(ADSb.IztnLAujPG, 4);
        TITLE = lVar5;
        l lVar6 = new l("PARAGRAPH", 5);
        PARAGRAPH = lVar6;
        $VALUES = new l[]{lVar, lVar2, lVar3, lVar4, lVar5, lVar6};
    }
}
