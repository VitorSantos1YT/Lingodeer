package xq;

import com.lingodeer.data.model.TodayStreakType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f56185a;

    static {
        int[] iArr = new int[TodayStreakType.values().length];
        try {
            iArr[TodayStreakType.STREAK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TodayStreakType.STREAK_MILESTONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TodayStreakType.NOT_STREAK_SHIELD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TodayStreakType.NOT_STREAK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TodayStreakType.NOT_STREAK_MILESTONE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[TodayStreakType.STREAK_RESET.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f56185a = iArr;
    }
}
