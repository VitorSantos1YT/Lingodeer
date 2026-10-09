package app.rive.runtime.kotlin.core;

import android.content.Context;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ContextAssetLoader extends FileAssetLoader {
    public static final int $stable = 8;
    private final Context context;

    public ContextAssetLoader(Context context) {
        m.f(context, "context");
        this.context = context;
    }

    public final Context getContext() {
        return this.context;
    }
}
