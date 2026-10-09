package fd;

import com.google.android.gms.internal.stats.RC.ualZoVVCQs;
import zp.sBa.anrPHlQ;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    private static final /* synthetic */ g[] $VALUES;
    public static final g ADD;
    public static final g COLOR;
    public static final g COLOR_BURN;
    public static final g COLOR_DODGE;
    public static final g DARKEN;
    public static final g DIFFERENCE;
    public static final g EXCLUSION;
    public static final g HARD_LIGHT;
    public static final g HARD_MIX;
    public static final g HUE;
    public static final g LIGHTEN;
    public static final g LUMINOSITY;
    public static final g MULTIPLY;
    public static final g NORMAL;
    public static final g OVERLAY;
    public static final g SATURATION;
    public static final g SCREEN;
    public static final g SOFT_LIGHT;

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    static {
        g gVar = new g("NORMAL", 0);
        NORMAL = gVar;
        g gVar2 = new g("MULTIPLY", 1);
        MULTIPLY = gVar2;
        g gVar3 = new g("SCREEN", 2);
        SCREEN = gVar3;
        g gVar4 = new g("OVERLAY", 3);
        OVERLAY = gVar4;
        g gVar5 = new g("DARKEN", 4);
        DARKEN = gVar5;
        g gVar6 = new g("LIGHTEN", 5);
        LIGHTEN = gVar6;
        g gVar7 = new g("COLOR_DODGE", 6);
        COLOR_DODGE = gVar7;
        g gVar8 = new g("COLOR_BURN", 7);
        COLOR_BURN = gVar8;
        g gVar9 = new g("HARD_LIGHT", 8);
        HARD_LIGHT = gVar9;
        g gVar10 = new g("SOFT_LIGHT", 9);
        SOFT_LIGHT = gVar10;
        g gVar11 = new g("DIFFERENCE", 10);
        DIFFERENCE = gVar11;
        g gVar12 = new g("EXCLUSION", 11);
        EXCLUSION = gVar12;
        g gVar13 = new g("HUE", 12);
        HUE = gVar13;
        g gVar14 = new g(anrPHlQ.SOLSkCKEkPxhm, 13);
        SATURATION = gVar14;
        g gVar15 = new g("COLOR", 14);
        COLOR = gVar15;
        g gVar16 = new g("LUMINOSITY", 15);
        LUMINOSITY = gVar16;
        g gVar17 = new g("ADD", 16);
        ADD = gVar17;
        g gVar18 = new g(ualZoVVCQs.WNHBLmBRKo, 17);
        HARD_MIX = gVar18;
        $VALUES = new g[]{gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11, gVar12, gVar13, gVar14, gVar15, gVar16, gVar17, gVar18};
    }
}
