package b4;

import bt.h8;
import ca.i;
import ca.k;
import com.google.api.Service;
import com.lingo.lingoskill.object.GameWordStatus;
import com.lingo.lingoskill.object.PdLesson;
import com.lingo.lingoskill.object.PdWord;
import com.lingo.lingoskill.object.PdWordFav;
import com.lingodeer.data.model.AchievementLeaderBoard;
import com.lingodeer.data.model.AchievementLevel;
import com.lingodeer.data.model.CourseUnit;
import com.lingodeer.data.model.DailyStreakHistory;
import com.lingodeer.data.model.uistate.LeaderBoardUser;
import com.lingodeer.database.model.DailyLearnHistoryEntity;
import com.lingodeer.database.model.DailyLearnTimeHistoryEntity;
import com.lingodeer.database.model.DailyStreakHistoryEntity;
import java.util.Comparator;
import java.util.Map;
import oz.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3910a;

    public /* synthetic */ e(int i11) {
        this.f3910a = i11;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f3910a) {
            case 0:
                return ((h) obj).f3916b - ((h) obj2).f3916b;
            case 1:
                return qx.b.i(Integer.valueOf(((h8) obj).f5501a), Integer.valueOf(((h8) obj2).f5501a));
            case 2:
                return Integer.compare(((c4.g) obj).f6558a, ((c4.g) obj2).f6558a);
            case 3:
                return qx.b.i((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 4:
                return qx.b.i((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 5:
                return qx.b.i(((i) obj).f6786a, ((i) obj2).f6786a);
            case 6:
                return qx.b.i(((k) obj).f6798a, ((k) obj2).f6798a);
            case 7:
                return qx.b.i((Long) ((Map.Entry) obj).getKey(), (Long) ((Map.Entry) obj2).getKey());
            case 8:
                return qx.b.i(Integer.valueOf(((CourseUnit) obj).getSortIndex()), Integer.valueOf(((CourseUnit) obj2).getSortIndex()));
            case 9:
                return qx.b.i(xt.d.k(((Number) obj).intValue()), xt.d.k(((Number) obj2).intValue()));
            case 10:
                return qx.b.i(Boolean.valueOf(((AchievementLeaderBoard) obj).isActive()), Boolean.valueOf(((AchievementLeaderBoard) obj2).isActive()));
            case 11:
                return qx.b.i(Long.valueOf(((AchievementLeaderBoard) obj2).getEarnTime()), Long.valueOf(((AchievementLeaderBoard) obj).getEarnTime()));
            case 12:
                return qx.b.i(Boolean.valueOf(((AchievementLevel) obj).isActive()), Boolean.valueOf(((AchievementLevel) obj2).isActive()));
            case 13:
                return qx.b.i(Long.valueOf(((AchievementLevel) obj2).getEarnTime()), Long.valueOf(((AchievementLevel) obj).getEarnTime()));
            case 14:
                return qx.b.i((Integer) obj, (Integer) obj2);
            case 15:
                return qx.b.i((Integer) obj, (Integer) obj2);
            case 16:
                return qx.b.i(((DailyLearnHistoryEntity) obj2).getId(), ((DailyLearnHistoryEntity) obj).getId());
            case 17:
                return qx.b.i(((DailyLearnTimeHistoryEntity) obj2).getId(), ((DailyLearnTimeHistoryEntity) obj).getId());
            case 18:
                return qx.b.i(((DailyStreakHistoryEntity) obj2).getId(), ((DailyStreakHistoryEntity) obj).getId());
            case 19:
                return qx.b.i((String) ((Map.Entry) obj).getKey(), (String) ((Map.Entry) obj2).getKey());
            case 20:
                Integer numT0 = x.t0((String) ((Map.Entry) obj).getKey());
                Integer numValueOf = Integer.valueOf(numT0 != null ? numT0.intValue() : Integer.MAX_VALUE);
                Integer numT1 = x.t0((String) ((Map.Entry) obj2).getKey());
                return qx.b.i(numValueOf, Integer.valueOf(numT1 != null ? numT1.intValue() : Integer.MAX_VALUE));
            case 21:
                return qx.b.i(Integer.valueOf(((LeaderBoardUser) obj2).getWeekEarnedXP()), Integer.valueOf(((LeaderBoardUser) obj).getWeekEarnedXP()));
            case 22:
                return qx.b.i(Integer.valueOf(((LeaderBoardUser) obj2).getWeekEarnedXP()), Integer.valueOf(((LeaderBoardUser) obj).getWeekEarnedXP()));
            case 23:
                Long l9 = Long.MAX_VALUE;
                Long lU0 = x.u0((String) ((Map.Entry) obj).getKey());
                if (lU0 == null) {
                    lU0 = l9;
                }
                Long lU1 = x.u0((String) ((Map.Entry) obj2).getKey());
                return qx.b.i(lU0, lU1 != null ? lU1 : Long.MAX_VALUE);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return qx.b.i(((PdWord) obj).getCorrectRate(), ((PdWord) obj2).getCorrectRate());
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return qx.b.i(((GameWordStatus) obj).getLastStudyTime(), ((GameWordStatus) obj2).getLastStudyTime());
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return qx.b.i(((GameWordStatus) obj2).getWrongCount(), ((GameWordStatus) obj).getWrongCount());
            case 27:
                return qx.b.i(((PdWordFav) obj).getTime(), ((PdWordFav) obj2).getTime());
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return qx.b.i(((PdLesson) obj).getLessonId(), ((PdLesson) obj2).getLessonId());
            default:
                return qx.b.i(((DailyStreakHistory) obj).getId(), ((DailyStreakHistory) obj2).getId());
        }
    }
}
