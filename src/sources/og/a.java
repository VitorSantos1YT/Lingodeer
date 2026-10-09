package og;

import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RolloutsStateSubscriber f44911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RolloutsState f44912c;

    public /* synthetic */ a(RolloutsStateSubscriber rolloutsStateSubscriber, RolloutsState rolloutsState, int i11) {
        this.f44910a = i11;
        this.f44911b = rolloutsStateSubscriber;
        this.f44912c = rolloutsState;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f44910a) {
            case 0:
                this.f44911b.a(this.f44912c);
                break;
            default:
                this.f44911b.a(this.f44912c);
                break;
        }
    }
}
