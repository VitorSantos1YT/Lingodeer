package j9;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static e a(m9.e eVar, q destination, Bundle bundle, Lifecycle.State hostLifecycleState, j jVar) {
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.m.e(string, "toString(...)");
        kotlin.jvm.internal.m.f(destination, "destination");
        kotlin.jvm.internal.m.f(hostLifecycleState, "hostLifecycleState");
        return new e(eVar, destination, bundle, hostLifecycleState, jVar, string, null);
    }
}
