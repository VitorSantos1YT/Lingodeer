package ys;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ u[] $VALUES;
    public static final u CurrentQuestionPreferences;
    public static final u Root;
    public static final u ScriptStyle;

    static {
        u uVar = new u("Root", 0);
        Root = uVar;
        u uVar2 = new u("ScriptStyle", 1);
        ScriptStyle = uVar2;
        u uVar3 = new u("CurrentQuestionPreferences", 2);
        CurrentQuestionPreferences = uVar3;
        u[] uVarArr = {uVar, uVar2, uVar3};
        $VALUES = uVarArr;
        $ENTRIES = ub.a.U(uVarArr);
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) $VALUES.clone();
    }
}
