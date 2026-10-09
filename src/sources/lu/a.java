package lu;

import com.android.billingclient.api.o;
import com.lingodeer.data.model.CourseLesson;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f40328b;

    public /* synthetic */ a(int i11, List list) {
        this.f40327a = i11;
        this.f40328b = list;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f40327a) {
            case 0:
                String str = ((o) obj).f7564c;
                List list = this.f40328b;
                return qx.b.i(Integer.valueOf(list.indexOf(str)), Integer.valueOf(list.indexOf(((o) obj2).f7564c)));
            default:
                Long lValueOf = Long.valueOf(((CourseLesson) obj).getLessonId());
                List list2 = this.f40328b;
                return qx.b.i(Integer.valueOf(list2.indexOf(lValueOf)), Integer.valueOf(list2.indexOf(Long.valueOf(((CourseLesson) obj2).getLessonId()))));
        }
    }
}
