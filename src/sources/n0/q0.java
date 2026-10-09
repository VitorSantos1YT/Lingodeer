package n0;

import com.lingodeer.data.model.AchievementLevelType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f42994a = 2500;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f42995b = AchievementLevelType.KNOWLEDGE_POINT_LV_9;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f42996c = 50;

    /* JADX WARN: Code duplicated, block: B:36:0x00ca A[Catch: i -> 0x01c1, TryCatch #2 {i -> 0x01c1, blocks: (B:34:0x00c6, B:36:0x00ca, B:37:0x00cc, B:38:0x00cf, B:41:0x00e4, B:54:0x010e, B:58:0x0139, B:62:0x0141, B:39:0x00d8), top: B:104:0x00c6 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00cf A[Catch: i -> 0x01c1, TryCatch #2 {i -> 0x01c1, blocks: (B:34:0x00c6, B:36:0x00ca, B:37:0x00cc, B:38:0x00cf, B:41:0x00e4, B:54:0x010e, B:58:0x0139, B:62:0x0141, B:39:0x00d8), top: B:104:0x00c6 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d8 A[Catch: i -> 0x01c1, TryCatch #2 {i -> 0x01c1, blocks: (B:34:0x00c6, B:36:0x00ca, B:37:0x00cc, B:38:0x00cf, B:41:0x00e4, B:54:0x010e, B:58:0x0139, B:62:0x0141, B:39:0x00d8), top: B:104:0x00c6 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e4 A[Catch: i -> 0x01c1, TRY_LEAVE, TryCatch #2 {i -> 0x01c1, blocks: (B:34:0x00c6, B:36:0x00ca, B:37:0x00cc, B:38:0x00cf, B:41:0x00e4, B:54:0x010e, B:58:0x0139, B:62:0x0141, B:39:0x00d8), top: B:104:0x00c6 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:51:0x0109 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x010b  */
    /* JADX WARN: Code duplicated, block: B:53:0x010d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0136  */
    /* JADX WARN: Code duplicated, block: B:57:0x0138  */
    /* JADX WARN: Code duplicated, block: B:60:0x013c  */
    /* JADX WARN: Code duplicated, block: B:61:0x013f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0191  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0191 -> B:18:0x0062). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(l0.s r28, int r29, int r30, int r31, v3.c r32, xy.c r33) {
        /*
            Method dump skipped, instruction units count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.q0.a(l0.s, int, int, int, v3.c, xy.c):java.lang.Object");
    }

    public static final boolean b(boolean z11, l0.s sVar, int i11, int i12) {
        if (z11) {
            if (sVar.c() > i11) {
                return true;
            }
            return sVar.c() == i11 && sVar.d() > i12;
        }
        if (sVar.c() < i11) {
            return true;
        }
        return sVar.c() == i11 && sVar.d() < i12;
    }

    public static final boolean c(l0.s sVar, int i11) {
        return i11 <= sVar.e() && sVar.c() <= i11;
    }
}
