package a10;

import androidx.lifecycle.livedata.HeRS.DytezVyM;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ a[] $VALUES;
    public static final a BLOCKS;
    public static final a BLOCKS_AND_INLINES;
    public static final a NONE;

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    static {
        a aVar = new a("NONE", 0);
        NONE = aVar;
        a aVar2 = new a(DytezVyM.gFYwhqRnsNCcgva, 1);
        BLOCKS = aVar2;
        a aVar3 = new a("BLOCKS_AND_INLINES", 2);
        BLOCKS_AND_INLINES = aVar3;
        $VALUES = new a[]{aVar, aVar2, aVar3};
    }
}
