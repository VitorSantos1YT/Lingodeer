package androidx.lifecycle;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.m;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements na.b {
    @Override // na.b
    public List<Class<? extends na.b>> dependencies() {
        return r.f50854a;
    }

    @Override // na.b
    public LifecycleOwner create(Context context) {
        m.f(context, "context");
        na.a aVarC = na.a.c(context);
        m.e(aVarC, "getInstance(...)");
        if (!aVarC.f43749b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        LifecycleDispatcher.init(context);
        ProcessLifecycleOwner.Companion companion = ProcessLifecycleOwner.Companion;
        companion.init$lifecycle_process_release(context);
        return companion.get();
    }
}
