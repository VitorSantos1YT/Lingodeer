package d4;

import com.google.firebase.iid.QyE.SemtNwfPgIhi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ c[] $VALUES;
    public static final c BASELINE;
    public static final c BOTTOM;
    public static final c CENTER;
    public static final c CENTER_X;
    public static final c CENTER_Y;
    public static final c LEFT;
    public static final c NONE;
    public static final c RIGHT;
    public static final c TOP;

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    static {
        c cVar = new c("NONE", 0);
        NONE = cVar;
        c cVar2 = new c("LEFT", 1);
        LEFT = cVar2;
        c cVar3 = new c("TOP", 2);
        TOP = cVar3;
        c cVar4 = new c("RIGHT", 3);
        RIGHT = cVar4;
        c cVar5 = new c("BOTTOM", 4);
        BOTTOM = cVar5;
        c cVar6 = new c("BASELINE", 5);
        BASELINE = cVar6;
        c cVar7 = new c("CENTER", 6);
        CENTER = cVar7;
        c cVar8 = new c("CENTER_X", 7);
        CENTER_X = cVar8;
        c cVar9 = new c(SemtNwfPgIhi.zjobDzIF, 8);
        CENTER_Y = cVar9;
        $VALUES = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9};
    }
}
