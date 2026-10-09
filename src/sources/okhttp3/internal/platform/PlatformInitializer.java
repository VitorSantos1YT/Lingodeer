package okhttp3.internal.platform;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.m;
import na.b;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class PlatformInitializer implements b {
    @Override // na.b
    public final Object create(Context context) {
        m.f(context, "context");
        PlatformRegistry.f45530a.getClass();
        Platform.f45527a.getClass();
        Object obj = Platform.f45528b;
        ContextAwarePlatform contextAwarePlatform = obj != null ? (ContextAwarePlatform) obj : null;
        if (contextAwarePlatform != null) {
            contextAwarePlatform.a(context);
        }
        return Platform.f45528b;
    }

    @Override // na.b
    public final List dependencies() {
        return r.f50854a;
    }
}
