package wc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    private static final /* synthetic */ f[] $VALUES;
    public static final f PLAY_OPTION;
    public static final f SET_ANIMATION;
    public static final f SET_IMAGE_ASSETS;
    public static final f SET_PROGRESS;
    public static final f SET_REPEAT_COUNT;
    public static final f SET_REPEAT_MODE;

    static {
        f fVar = new f("SET_ANIMATION", 0);
        SET_ANIMATION = fVar;
        f fVar2 = new f("SET_PROGRESS", 1);
        SET_PROGRESS = fVar2;
        f fVar3 = new f("SET_REPEAT_MODE", 2);
        SET_REPEAT_MODE = fVar3;
        f fVar4 = new f("SET_REPEAT_COUNT", 3);
        SET_REPEAT_COUNT = fVar4;
        f fVar5 = new f("SET_IMAGE_ASSETS", 4);
        SET_IMAGE_ASSETS = fVar5;
        f fVar6 = new f("PLAY_OPTION", 5);
        PLAY_OPTION = fVar6;
        $VALUES = new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
