package androidx.lifecycle.viewmodel.internal;

import fz.a;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class SynchronizedObjectKt {
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static final <T> T m10synchronized(SynchronizedObject lock, a action) {
        T t6;
        m.f(lock, "lock");
        m.f(action, "action");
        synchronized (lock) {
            t6 = (T) action.invoke();
        }
        return t6;
    }
}
