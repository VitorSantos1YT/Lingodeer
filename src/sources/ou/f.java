package ou;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f Anim;
    public static final f Normal;
    public static final f Quiz;
    public static final f Writer;

    static {
        f fVar = new f("Normal", 0);
        Normal = fVar;
        f fVar2 = new f("Writer", 1);
        Writer = fVar2;
        f fVar3 = new f("Anim", 2);
        Anim = fVar3;
        f fVar4 = new f("Quiz", 3);
        Quiz = fVar4;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4};
        $VALUES = fVarArr;
        $ENTRIES = ub.a.U(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
