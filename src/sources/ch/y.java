package ch;

import androidx.lifecycle.LifecycleOwnerKt;
import b0.a1;
import com.lingo.course.ui.CourseTestDialogueActivity;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CourseTestDialogueActivity f7117b;

    public /* synthetic */ y(CourseTestDialogueActivity courseTestDialogueActivity, int i11) {
        this.f7116a = i11;
        this.f7117b = courseTestDialogueActivity;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f7116a;
        CourseTestDialogueActivity courseTestDialogueActivity = this.f7117b;
        switch (i11) {
            case 0:
                int i12 = CourseTestDialogueActivity.L;
                return Long.valueOf(courseTestDialogueActivity.getIntent().getLongExtra(INTENTS.EXTRA_LONG, -1L));
            case 1:
                int i13 = CourseTestDialogueActivity.L;
                return Long.valueOf(courseTestDialogueActivity.getIntent().getLongExtra(INTENTS.EXTRA_LONG_2, -1L));
            case 2:
                int i14 = CourseTestDialogueActivity.L;
                String stringExtra = courseTestDialogueActivity.getIntent().getStringExtra(INTENTS.EXTRA_STRING);
                return stringExtra == null ? BuildConfig.VERSION_NAME : stringExtra;
            default:
                int i15 = CourseTestDialogueActivity.L;
                rz.e0.B(LifecycleOwnerKt.getLifecycleScope(courseTestDialogueActivity), null, null, new a1(courseTestDialogueActivity, null, 13), 3);
                courseTestDialogueActivity.finish();
                return qy.b0.f48488a;
        }
    }
}
