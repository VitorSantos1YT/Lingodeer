package fu;

import com.lingodeer.data.model.DayStreakWeeklyItemStatus;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f28084a;

    static {
        int[] iArr = new int[DayStreakWeeklyItemStatus.values().length];
        try {
            iArr[DayStreakWeeklyItemStatus.NOT_STREAK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DayStreakWeeklyItemStatus.STREAK_RESET.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DayStreakWeeklyItemStatus.STREAKED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DayStreakWeeklyItemStatus.STREAK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DayStreakWeeklyItemStatus.STREAK_SHIELD.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f28084a = iArr;
    }
}
