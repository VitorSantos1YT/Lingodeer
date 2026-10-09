package p5;

import android.content.Context;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final boolean a(Context context, String name) {
        m.f(context, "context");
        m.f(name, "name");
        return context.deleteSharedPreferences(name);
    }
}
