package cr;

import com.lingo.me.MeAccountSettingsActivity;
import dv.u0;
import gq.u;
import kotlin.jvm.internal.z;
import zu.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MeAccountSettingsActivity f22433b;

    public /* synthetic */ d(MeAccountSettingsActivity meAccountSettingsActivity, int i11) {
        this.f22432a = i11;
        this.f22433b = meAccountSettingsActivity;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f22432a) {
            case 0:
                return ef.e.q(this.f22433b).a(null, null, z.a(u.class));
            case 1:
                return ef.e.q(this.f22433b).a(null, null, z.a(u0.class));
            default:
                MeAccountSettingsActivity meAccountSettingsActivity = this.f22433b;
                return i20.b.a(z.a(q.class), meAccountSettingsActivity.getViewModelStore(), null, meAccountSettingsActivity.getDefaultViewModelCreationExtras(), null, ef.e.q(meAccountSettingsActivity), null);
        }
    }
}
