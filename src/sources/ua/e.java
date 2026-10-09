package ua;

import android.view.View;
import com.lingodeer.data.model.AchievementLanguage;
import com.lingodeer.data.model.CourseUnit;
import com.lingodeer.data.model.Daily;
import com.lingodeer.data.model.DailyLearnWithLearnTimeHistory;
import com.lingodeer.data.model.LoginHistory;
import com.lingodeer.data.model.ReviewStatus;
import com.lingodeer.data.model.SRSStatus;
import com.lingodeer.data.model.uistate.LeaderBoardUser;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52887a;

    public /* synthetic */ e(int i11) {
        this.f52887a = i11;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f52887a) {
            case 0:
                return ((g) obj).f52889b - ((g) obj2).f52889b;
            case 1:
                h hVar = (h) ((View) obj).getLayoutParams();
                h hVar2 = (h) ((View) obj2).getLayoutParams();
                boolean z11 = hVar.f52893a;
                if (z11 != hVar2.f52893a) {
                    return z11 ? 1 : -1;
                }
                return hVar.f52897e - hVar2.f52897e;
            case 2:
                return qx.b.i(Integer.valueOf(((CourseUnit) obj).getSortIndex()), Integer.valueOf(((CourseUnit) obj2).getSortIndex()));
            case 3:
                return qx.b.i(Long.valueOf(((ReviewStatus) obj).getLastStudyTime()), Long.valueOf(((ReviewStatus) obj2).getLastStudyTime()));
            case 4:
                return qx.b.i(((ReviewStatus) obj).getStatus(), ((ReviewStatus) obj2).getStatus());
            case 5:
                return qx.b.i(Boolean.valueOf(((SRSStatus) obj).isReviewed()), Boolean.valueOf(((SRSStatus) obj2).isReviewed()));
            case 6:
                return qx.b.i(Long.valueOf(((SRSStatus) obj2).getLastStudyTime()), Long.valueOf(((SRSStatus) obj).getLastStudyTime()));
            case 7:
                return qx.b.i(Long.valueOf(((LoginHistory) obj2).getLastLogOutTime()), Long.valueOf(((LoginHistory) obj).getLastLogOutTime()));
            case 8:
                return qx.b.i(Integer.valueOf(((Daily) obj2).getTime()), Integer.valueOf(((Daily) obj).getTime()));
            case 9:
                return qx.b.i((Integer) obj, (Integer) obj2);
            case 10:
                return qx.b.i(Integer.valueOf(((String) obj2).length()), Integer.valueOf(((String) obj).length()));
            case 11:
                return qx.b.i(Integer.valueOf(((LeaderBoardUser) obj2).getWeekEarnedXP()), Integer.valueOf(((LeaderBoardUser) obj).getWeekEarnedXP()));
            case 12:
                return qx.b.i((String) obj2, (String) obj);
            case 13:
                return qx.b.i(((DailyLearnWithLearnTimeHistory) ((qy.l) obj2).f48496b).getId(), ((DailyLearnWithLearnTimeHistory) ((qy.l) obj).f48496b).getId());
            case 14:
                return qx.b.i(((DailyLearnWithLearnTimeHistory) ((qy.l) obj2).f48496b).getId(), ((DailyLearnWithLearnTimeHistory) ((qy.l) obj).f48496b).getId());
            default:
                return qx.b.i(Float.valueOf(((AchievementLanguage) obj2).getProgress()), Float.valueOf(((AchievementLanguage) obj).getProgress()));
        }
    }
}
