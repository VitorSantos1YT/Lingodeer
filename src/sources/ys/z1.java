package ys;

import android.content.Context;
import android.widget.Toast;
import com.lingodeer.R;
import com.lingodeer.data.model.CourseLesson;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z1 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CourseLesson f58344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f58345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f58346d;

    public /* synthetic */ z1(CourseLesson courseLesson, fz.a aVar, Context context, int i11) {
        this.f58343a = i11;
        this.f58344b = courseLesson;
        this.f58345c = aVar;
        this.f58346d = context;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f58343a) {
            case 0:
                if (this.f58344b.getCanAccess()) {
                    Toast.makeText(this.f58346d, R.string.please_complete_previous_lesson, 0).show();
                } else {
                    this.f58345c.invoke();
                }
                break;
            default:
                if (this.f58344b.getCanAccess()) {
                    Toast.makeText(this.f58346d, R.string.please_complete_previous_lesson, 0).show();
                } else {
                    this.f58345c.invoke();
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
