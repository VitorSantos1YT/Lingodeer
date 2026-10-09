package o3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ y[] $VALUES;
    public static final y HideKeyboard;
    public static final y ShowKeyboard;
    public static final y StartInput;
    public static final y StopInput;

    static {
        y yVar = new y("StartInput", 0);
        StartInput = yVar;
        y yVar2 = new y("StopInput", 1);
        StopInput = yVar2;
        y yVar3 = new y("ShowKeyboard", 2);
        ShowKeyboard = yVar3;
        y yVar4 = new y("HideKeyboard", 3);
        HideKeyboard = yVar4;
        y[] yVarArr = {yVar, yVar2, yVar3, yVar4};
        $VALUES = yVarArr;
        $ENTRIES = ub.a.U(yVarArr);
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) $VALUES.clone();
    }
}
