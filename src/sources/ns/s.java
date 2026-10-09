package ns;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@c00.e
public final class s {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    private static final qy.h $cachedSerializer$delegate;
    public static final r Companion;
    public static final s EXTRA_ELEMENT;
    public static final s FORM;
    public static final s MISSING_ELEMENT;
    public static final s NONE;
    public static final s ORDER;
    public static final s OTHER_LOCAL;
    public static final s REPLACE_ELEMENT;
    public static final s SPELLING;

    static {
        s sVar = new s("NONE", 0);
        NONE = sVar;
        s sVar2 = new s("SPELLING", 1);
        SPELLING = sVar2;
        s sVar3 = new s("MISSING_ELEMENT", 2);
        MISSING_ELEMENT = sVar3;
        s sVar4 = new s("EXTRA_ELEMENT", 3);
        EXTRA_ELEMENT = sVar4;
        s sVar5 = new s("ORDER", 4);
        ORDER = sVar5;
        s sVar6 = new s("FORM", 5);
        FORM = sVar6;
        s sVar7 = new s("REPLACE_ELEMENT", 6);
        REPLACE_ELEMENT = sVar7;
        s sVar8 = new s("OTHER_LOCAL", 7);
        OTHER_LOCAL = sVar8;
        s[] sVarArr = {sVar, sVar2, sVar3, sVar4, sVar5, sVar6, sVar7, sVar8};
        $VALUES = sVarArr;
        $ENTRIES = ub.a.U(sVarArr);
        Companion = new r();
        $cachedSerializer$delegate = com.bumptech.glide.d.u(qy.j.PUBLICATION, new d(3));
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }
}
