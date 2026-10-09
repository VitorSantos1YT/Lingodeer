package w9;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends RemoteCallbackList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f54820a;

    public i(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f54820a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object cookie) {
        e callback = (e) iInterface;
        kotlin.jvm.internal.m.f(callback, "callback");
        kotlin.jvm.internal.m.f(cookie, "cookie");
        this.f54820a.f2687b.remove((Integer) cookie);
    }
}
