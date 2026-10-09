package j3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l Clickable;
    public static final l Link;
    public static final l Paragraph;
    public static final l Span;
    public static final l String;
    public static final l Url;
    public static final l VerbatimTts;

    static {
        l lVar = new l("Paragraph", 0);
        Paragraph = lVar;
        l lVar2 = new l("Span", 1);
        Span = lVar2;
        l lVar3 = new l("VerbatimTts", 2);
        VerbatimTts = lVar3;
        l lVar4 = new l("Url", 3);
        Url = lVar4;
        l lVar5 = new l("Link", 4);
        Link = lVar5;
        l lVar6 = new l("Clickable", 5);
        Clickable = lVar6;
        l lVar7 = new l("String", 6);
        String = lVar7;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7};
        $VALUES = lVarArr;
        $ENTRIES = ub.a.U(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
