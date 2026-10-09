package jp;

import com.lingo.lingoskill.ui.learn.BaseAudioLessonActivity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class t extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseAudioLessonActivity f36542b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(BaseAudioLessonActivity baseAudioLessonActivity, int i11) {
        super(0);
        this.f36541a = i11;
        this.f36542b = baseAudioLessonActivity;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f36541a) {
            case 0:
                return this.f36542b.getViewModelStore();
            default:
                return this.f36542b.getDefaultViewModelCreationExtras();
        }
    }
}
