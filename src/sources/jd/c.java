package jd;

import com.google.android.gms.measurement.zfxB.ypOOxsaJG;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ c[] $VALUES;
    public static final c BEGIN_ARRAY;
    public static final c BEGIN_OBJECT;
    public static final c BOOLEAN;
    public static final c END_ARRAY;
    public static final c END_DOCUMENT;
    public static final c END_OBJECT;
    public static final c NAME;
    public static final c NULL;
    public static final c NUMBER;
    public static final c STRING;

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    static {
        c cVar = new c("BEGIN_ARRAY", 0);
        BEGIN_ARRAY = cVar;
        c cVar2 = new c(ypOOxsaJG.KHjEOaDn, 1);
        END_ARRAY = cVar2;
        c cVar3 = new c("BEGIN_OBJECT", 2);
        BEGIN_OBJECT = cVar3;
        c cVar4 = new c("END_OBJECT", 3);
        END_OBJECT = cVar4;
        c cVar5 = new c("NAME", 4);
        NAME = cVar5;
        c cVar6 = new c("STRING", 5);
        STRING = cVar6;
        c cVar7 = new c("NUMBER", 6);
        NUMBER = cVar7;
        c cVar8 = new c("BOOLEAN", 7);
        BOOLEAN = cVar8;
        c cVar9 = new c("NULL", 8);
        NULL = cVar9;
        c cVar10 = new c("END_DOCUMENT", 9);
        END_DOCUMENT = cVar10;
        $VALUES = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10};
    }
}
