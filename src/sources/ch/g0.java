package ch;

import android.os.Bundle;
import com.lingo.course.ui.CourseTestIndexActivity;
import com.lingodeer.data.model.CourseUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g0 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CourseUnit f7039b;

    public /* synthetic */ g0(CourseUnit courseUnit, int i11) {
        this.f7038a = i11;
        this.f7039b = courseUnit;
    }

    @Override // fz.a
    public final Object invoke() {
        Bundle bundle;
        int sortIndex;
        int i11 = this.f7038a;
        CourseUnit courseUnit = this.f7039b;
        switch (i11) {
            case 0:
                int i12 = CourseTestIndexActivity.N;
                bundle = new Bundle();
                sortIndex = courseUnit.getSortIndex();
                break;
            default:
                bundle = new Bundle();
                sortIndex = courseUnit.getSortIndex();
                break;
        }
        b7.e0.v(sortIndex, bundle, "U", "unit");
        return bundle;
    }
}
