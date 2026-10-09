package kr;

import android.os.Bundle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.lingodeer.data.model.CoursePracticeType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.o0 f38418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vt.k0 f38419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f38420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f38421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CoursePracticeType f38422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final uz.r0 f38423f;

    public b(ur.a aVar, wt.o0 o0Var, vt.k0 k0Var, long j11, int i11, CoursePracticeType coursePracticeType) {
        this.f38418a = o0Var;
        this.f38419b = k0Var;
        this.f38420c = j11;
        this.f38421d = i11;
        this.f38422e = coursePracticeType;
        vy.d dVar = null;
        gp.r rVar = new gp.r(new fr.c(this, dVar, 28));
        yz.f fVar = rz.o0.f50940a;
        this.f38423f = uz.x0.A(uz.x0.w(rVar, yz.e.f58387a), ViewModelKt.getViewModelScope(this), uz.a1.a(2), -1);
        if (coursePracticeType == CoursePracticeType.COURSE_STORY_READING) {
            final int i12 = 0;
            aVar.c("jxz_main_story_read_finish", new fz.a(this) { // from class: kr.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b f38403b;

                {
                    this.f38403b = this;
                }

                @Override // fz.a
                public final Object invoke() {
                    Bundle bundle;
                    int i13;
                    String str;
                    switch (i12) {
                        case 0:
                            bundle = new Bundle();
                            i13 = this.f38403b.f38421d;
                            str = "U";
                            break;
                        default:
                            bundle = new Bundle();
                            i13 = this.f38403b.f38421d;
                            str = "U";
                            break;
                    }
                    b7.e0.v(i13, bundle, str, "unit");
                    return bundle;
                }
            });
        } else if (coursePracticeType == CoursePracticeType.COURSE_STORY_SPEAKING) {
            final int i13 = 1;
            aVar.c("jxz_main_story_speak_finish", new fz.a(this) { // from class: kr.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b f38403b;

                {
                    this.f38403b = this;
                }

                @Override // fz.a
                public final Object invoke() {
                    Bundle bundle;
                    int i14;
                    String str;
                    switch (i13) {
                        case 0:
                            bundle = new Bundle();
                            i14 = this.f38403b.f38421d;
                            str = "U";
                            break;
                        default:
                            bundle = new Bundle();
                            i14 = this.f38403b.f38421d;
                            str = "U";
                            break;
                    }
                    b7.e0.v(i14, bundle, str, "unit");
                    return bundle;
                }
            });
        }
        rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new gp.a(this, dVar, 22), 3);
    }
}
