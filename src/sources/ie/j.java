package ie;

import androidx.lifecycle.Lifecycle;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Lifecycle f34396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1.p f34397b;

    public j(b1.p pVar, Lifecycle lifecycle) {
        this.f34397b = pVar;
        this.f34396a = lifecycle;
    }

    @Override // ie.i
    public final void onDestroy() {
        ((HashMap) this.f34397b.f3800b).remove(this.f34396a);
    }

    @Override // ie.i
    public final void a() {
    }

    @Override // ie.i
    public final void onStart() {
    }
}
