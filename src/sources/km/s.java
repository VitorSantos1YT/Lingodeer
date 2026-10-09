package km;

import android.os.Bundle;
import com.lingodeer.data.model.INTENTS;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f38272b;

    public /* synthetic */ s(u uVar, int i11) {
        this.f38271a = i11;
        this.f38272b = uVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f38271a) {
            case 0:
                return Integer.valueOf(this.f38272b.requireArguments().getInt(INTENTS.EXTRA_INT, 0));
            default:
                Bundle bundle = new Bundle();
                b7.e0.v(u.t(this.f38272b), bundle, "L", "lesson");
                return bundle;
        }
    }
}
