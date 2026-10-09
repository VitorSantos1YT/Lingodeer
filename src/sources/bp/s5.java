package bp;

import com.lingo.lingoskill.ui.base.UpdateLessonActivity;
import com.lingodeer.database.UserDataDatabase;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class s5 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UpdateLessonActivity f4808b;

    public /* synthetic */ s5(UpdateLessonActivity updateLessonActivity, int i11) {
        this.f4807a = i11;
        this.f4808b = updateLessonActivity;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f4807a) {
            case 0:
                return ef.e.q(this.f4808b).a(null, null, kotlin.jvm.internal.z.a(vt.k0.class));
            case 1:
                return ef.e.q(this.f4808b).a(null, null, kotlin.jvm.internal.z.a(dr.p.class));
            case 2:
                return ef.e.q(this.f4808b).a(null, null, kotlin.jvm.internal.z.a(fr.i3.class));
            case 3:
                return ef.e.q(this.f4808b).a(null, null, kotlin.jvm.internal.z.a(wt.b0.class));
            case 4:
                return ef.e.q(this.f4808b).a(null, null, kotlin.jvm.internal.z.a(dv.u0.class));
            case 5:
                return ef.e.q(this.f4808b).a(null, null, kotlin.jvm.internal.z.a(UserDataDatabase.class));
            default:
                return ef.e.q(this.f4808b).a(null, null, kotlin.jvm.internal.z.a(wt.m.class));
        }
    }
}
