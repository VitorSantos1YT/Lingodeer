package fr;

import com.lingodeer.data.model.AchievementLeaderBoardType;
import j$.time.LocalDate;
import j$.time.temporal.ChronoField;
import j$.time.temporal.WeekFields;
import java.util.Arrays;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final oz.o f27961a = new oz.o("\\d{6}");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f27962b = ry.l.m0(new String[]{AchievementLeaderBoardType.LEADERBOARD_CLASS_A, AchievementLeaderBoardType.LEADERBOARD_CLASS_B, AchievementLeaderBoardType.LEADERBOARD_CLASS_C, AchievementLeaderBoardType.LEADERBOARD_CLASS_D, AchievementLeaderBoardType.LEADERBOARD_CLASS_E, AchievementLeaderBoardType.LEADERBOARD_CLASS_F});

    public static final LocalDate a(String str) {
        Object objL;
        if (!f27961a.f(str)) {
            return null;
        }
        String strSubstring = str.substring(0, 4);
        kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
        Integer numT0 = oz.x.t0(strSubstring);
        if (numT0 == null) {
            return null;
        }
        int iIntValue = numT0.intValue();
        String strSubstring2 = str.substring(4, 6);
        kotlin.jvm.internal.m.e(strSubstring2, "substring(...)");
        Integer numT1 = oz.x.t0(strSubstring2);
        if (numT1 == null) {
            return null;
        }
        try {
            objL = LocalDate.of(iIntValue, 1, 4).a(WeekFields.ISO.weekOfWeekBasedYear(), numT1.intValue()).a(ChronoField.DAY_OF_WEEK, 1L);
        } catch (Throwable th2) {
            objL = com.bumptech.glide.e.l(th2);
        }
        if (objL instanceof qy.n) {
            objL = null;
        }
        LocalDate localDate = (LocalDate) objL;
        if (localDate != null && b(localDate).equals(str)) {
            return localDate;
        }
        return null;
    }

    public static final String b(LocalDate localDate) {
        WeekFields weekFields = WeekFields.ISO;
        return String.format(Locale.US, "%d%02d", Arrays.copyOf(new Object[]{Integer.valueOf(localDate.get(weekFields.weekBasedYear())), Integer.valueOf(localDate.get(weekFields.weekOfWeekBasedYear()))}, 2));
    }
}
