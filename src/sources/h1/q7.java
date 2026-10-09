package h1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q7 {
    private static final /* synthetic */ q7[] $VALUES;
    public static final q7 BottomBar;
    public static final q7 Fab;
    public static final q7 MainContent;
    public static final q7 Snackbar;
    public static final q7 TopBar;

    static {
        q7 q7Var = new q7("TopBar", 0);
        TopBar = q7Var;
        q7 q7Var2 = new q7("MainContent", 1);
        MainContent = q7Var2;
        q7 q7Var3 = new q7("Snackbar", 2);
        Snackbar = q7Var3;
        q7 q7Var4 = new q7("Fab", 3);
        Fab = q7Var4;
        q7 q7Var5 = new q7("BottomBar", 4);
        BottomBar = q7Var5;
        $VALUES = new q7[]{q7Var, q7Var2, q7Var3, q7Var4, q7Var5};
    }

    public static q7 valueOf(String str) {
        return (q7) Enum.valueOf(q7.class, str);
    }

    public static q7[] values() {
        return (q7[]) $VALUES.clone();
    }
}
