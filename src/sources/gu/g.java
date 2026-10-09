package gu;

import android.view.View;
import com.google.api.Service;
import com.lingo.lingoskill.object.PdLessonFav;
import com.lingo.lingoskill.object.PdWord;
import com.lingo.lingoskill.speak.object.PodUser;
import com.lingodeer.data.model.CourseUnit;
import com.lingodeer.data.model.DailyStreakHistory;
import com.lingodeer.data.model.SRSStatus;
import java.util.Comparator;
import java.util.WeakHashMap;
import ot.i2;
import qy.l;
import rt.d5;
import rt.k6;
import rt.oe;
import rt.ue;
import v3.o;
import z4.j0;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29860a;

    public /* synthetic */ g(int i11) {
        this.f29860a = i11;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f29860a) {
            case 0:
                return qx.b.i(((DailyStreakHistory) obj2).getId(), ((DailyStreakHistory) obj).getId());
            case 1:
                return qx.b.i(((DailyStreakHistory) obj).getId(), ((DailyStreakHistory) obj2).getId());
            case 2:
                return qx.b.i(Float.valueOf(o.c(((o) obj).f53502a)), Float.valueOf(o.c(((o) obj2).f53502a)));
            case 3:
                WeakHashMap weakHashMap = s0.f58893a;
                float fG = j0.g((View) obj);
                float fG2 = j0.g((View) obj2);
                if (fG > fG2) {
                    return -1;
                }
                return fG < fG2 ? 1 : 0;
            case 4:
                return qx.b.i(((mh.d) obj).a(), ((mh.d) obj2).a());
            case 5:
                return qx.b.i(((DailyStreakHistory) obj).getId(), ((DailyStreakHistory) obj2).getId());
            case 6:
                return qx.b.i(((n00.g) obj).f43073a, ((n00.g) obj2).f43073a);
            case 7:
                return qx.b.i(Long.valueOf(((PodUser) obj).getTimestamp()), Long.valueOf(((PodUser) obj2).getTimestamp()));
            case 8:
                return qx.b.i(Long.valueOf(((PodUser) obj).getTimestamp()), Long.valueOf(((PodUser) obj2).getTimestamp()));
            case 9:
                return qx.b.i(Long.valueOf(((PodUser) obj2).getTimestamp()), Long.valueOf(((PodUser) obj).getTimestamp()));
            case 10:
                return qx.b.i(Integer.valueOf(((PodUser) obj2).getLike_num()), Integer.valueOf(((PodUser) obj).getLike_num()));
            case 11:
                return qx.b.i(Integer.valueOf(((PodUser) obj).getLike_num()), Integer.valueOf(((PodUser) obj2).getLike_num()));
            case 12:
                return qx.b.i(Integer.valueOf(((CourseUnit) obj).getSortIndex()), Integer.valueOf(((CourseUnit) obj2).getSortIndex()));
            case 13:
                return qx.b.i(Long.valueOf(((i2) obj).f45855b), Long.valueOf(((i2) obj2).f45855b));
            case 14:
                return qx.b.i(((PdLessonFav) obj2).getTime(), ((PdLessonFav) obj).getTime());
            case 15:
                return qx.b.i(Integer.valueOf(((mh.b) ((l) obj).f48495a).e()), Integer.valueOf(((mh.b) ((l) obj2).f48495a).e()));
            case 16:
                return qx.b.i(Integer.valueOf(((String) obj2).length()), Integer.valueOf(((String) obj).length()));
            case 17:
                return ((byte[]) obj).length - ((byte[]) obj2).length;
            case 18:
                return qx.b.i(((PdWord) obj).getFinishSortIndex(), ((PdWord) obj2).getFinishSortIndex());
            case 19:
                return qx.b.i(Long.valueOf(((SRSStatus) obj).getNextReviewTime()), Long.valueOf(((SRSStatus) obj2).getNextReviewTime()));
            case 20:
                return qx.b.i(Long.valueOf(((oe) obj).f50221b.f49553a.getNextReviewTime()), Long.valueOf(((oe) obj2).f50221b.f49553a.getNextReviewTime()));
            case 21:
                return qx.b.i(Integer.valueOf(((ue) obj).f50512c), Integer.valueOf(((ue) obj2).f50512c));
            case 22:
                return qx.b.i(Long.valueOf(((SRSStatus) obj).getNextReviewTime()), Long.valueOf(((SRSStatus) obj2).getNextReviewTime()));
            case 23:
                return qx.b.i(Integer.valueOf(((CourseUnit) obj2).getSortIndex()), Integer.valueOf(((CourseUnit) obj).getSortIndex()));
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return qx.b.i(Integer.valueOf(((d5) obj2).f49614b), Integer.valueOf(((d5) obj).f49614b));
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return qx.b.i(Integer.valueOf(((CourseUnit) obj2).getSortIndex()), Integer.valueOf(((CourseUnit) obj).getSortIndex()));
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return qx.b.i(Integer.valueOf(((CourseUnit) obj2).getSortIndex()), Integer.valueOf(((CourseUnit) obj).getSortIndex()));
            case 27:
                return qx.b.i(Integer.valueOf(((CourseUnit) obj2).getSortIndex()), Integer.valueOf(((CourseUnit) obj).getSortIndex()));
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return qx.b.i(Boolean.valueOf(((k6) obj).f49972c.isReviewed()), Boolean.valueOf(((k6) obj2).f49972c.isReviewed()));
            default:
                return qx.b.i(Double.valueOf(((Number) ((l) obj).f48496b).doubleValue()), Double.valueOf(((Number) ((l) obj2).f48496b).doubleValue()));
        }
    }
}
