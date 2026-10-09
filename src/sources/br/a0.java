package br;

import com.lingo.main.ui.MainComposeActivity;
import dv.u0;
import gp.l1;
import rt.sd;
import tu.m0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainComposeActivity f4997b;

    public /* synthetic */ a0(MainComposeActivity mainComposeActivity, int i11) {
        this.f4996a = i11;
        this.f4997b = mainComposeActivity;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f4996a) {
            case 0:
                return ef.e.q(this.f4997b).a(null, null, kotlin.jvm.internal.z.a(xt.u.class));
            case 1:
                return ef.e.q(this.f4997b).a(null, null, kotlin.jvm.internal.z.a(u0.class));
            case 2:
                MainComposeActivity mainComposeActivity = this.f4997b;
                return i20.b.a(kotlin.jvm.internal.z.a(gp.w.class), mainComposeActivity.getViewModelStore(), null, mainComposeActivity.getDefaultViewModelCreationExtras(), null, ef.e.q(mainComposeActivity), null);
            case 3:
                MainComposeActivity mainComposeActivity2 = this.f4997b;
                return i20.b.a(kotlin.jvm.internal.z.a(m0.class), mainComposeActivity2.getViewModelStore(), null, mainComposeActivity2.getDefaultViewModelCreationExtras(), null, ef.e.q(mainComposeActivity2), null);
            case 4:
                MainComposeActivity mainComposeActivity3 = this.f4997b;
                return i20.b.a(kotlin.jvm.internal.z.a(l1.class), mainComposeActivity3.getViewModelStore(), null, mainComposeActivity3.getDefaultViewModelCreationExtras(), null, ef.e.q(mainComposeActivity3), null);
            case 5:
                MainComposeActivity mainComposeActivity4 = this.f4997b;
                return i20.b.a(kotlin.jvm.internal.z.a(eh.f.class), mainComposeActivity4.getViewModelStore(), null, mainComposeActivity4.getDefaultViewModelCreationExtras(), null, ef.e.q(mainComposeActivity4), null);
            default:
                MainComposeActivity mainComposeActivity5 = this.f4997b;
                return i20.b.a(kotlin.jvm.internal.z.a(sd.class), mainComposeActivity5.getViewModelStore(), null, mainComposeActivity5.getDefaultViewModelCreationExtras(), null, ef.e.q(mainComposeActivity5), null);
        }
    }
}
