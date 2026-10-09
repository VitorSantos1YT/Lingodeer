package ot;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a2 {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ a2[] $VALUES;
    public static final a2 AudioAudio;
    public static final a2 AudioTranslation;
    public static final a2 AudioWord;
    public static final a2 AudioZhuYin;
    public static final a2 WordTranslation;
    public static final a2 WordZhuYin;

    static {
        a2 a2Var = new a2("WordTranslation", 0);
        WordTranslation = a2Var;
        a2 a2Var2 = new a2("AudioWord", 1);
        AudioWord = a2Var2;
        a2 a2Var3 = new a2("AudioTranslation", 2);
        AudioTranslation = a2Var3;
        a2 a2Var4 = new a2("AudioZhuYin", 3);
        AudioZhuYin = a2Var4;
        a2 a2Var5 = new a2("WordZhuYin", 4);
        WordZhuYin = a2Var5;
        a2 a2Var6 = new a2("AudioAudio", 5);
        AudioAudio = a2Var6;
        a2[] a2VarArr = {a2Var, a2Var2, a2Var3, a2Var4, a2Var5, a2Var6};
        $VALUES = a2VarArr;
        $ENTRIES = ub.a.U(a2VarArr);
    }

    public static a2 valueOf(String str) {
        return (a2) Enum.valueOf(a2.class, str);
    }

    public static a2[] values() {
        return (a2[]) $VALUES.clone();
    }
}
