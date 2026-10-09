package bp;

import com.lingo.lingoskill.ui.base.MainActivity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f3 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f4572b;

    public /* synthetic */ f3(MainActivity mainActivity, int i11) {
        this.f4571a = i11;
        this.f4572b = mainActivity;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f4571a) {
            case 0:
                return ef.e.q(this.f4572b).a(null, null, kotlin.jvm.internal.z.a(dv.u0.class));
            case 1:
                MainActivity mainActivity = this.f4572b;
                return i20.b.a(kotlin.jvm.internal.z.a(gp.w.class), mainActivity.getViewModelStore(), null, mainActivity.getDefaultViewModelCreationExtras(), null, ef.e.q(mainActivity), null);
            default:
                MainActivity mainActivity2 = this.f4572b;
                return i20.b.a(kotlin.jvm.internal.z.a(gp.l1.class), mainActivity2.getViewModelStore(), null, mainActivity2.getDefaultViewModelCreationExtras(), null, ef.e.q(mainActivity2), null);
        }
    }
}
