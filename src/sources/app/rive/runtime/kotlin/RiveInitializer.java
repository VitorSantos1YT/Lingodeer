package app.rive.runtime.kotlin;

import android.content.Context;
import app.rive.runtime.kotlin.core.Rive;
import java.util.List;
import kotlin.jvm.internal.m;
import qy.b0;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class RiveInitializer implements na.b {
    public static final int $stable = 0;

    @Override // na.b
    public /* bridge */ /* synthetic */ Object create(Context context) throws Throwable {
        m200create(context);
        return b0.f48488a;
    }

    @Override // na.b
    public List<Class<? extends na.b>> dependencies() {
        return r.f50854a;
    }

    /* JADX INFO: renamed from: create, reason: collision with other method in class */
    public void m200create(Context context) throws Throwable {
        m.f(context, "context");
        Rive.init$default(Rive.INSTANCE, context, null, 2, null);
    }
}
