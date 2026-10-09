package q2;

import android.view.KeyEvent;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeyEvent f47410a;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return m.a(this.f47410a, ((b) obj).f47410a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f47410a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f47410a + ')';
    }
}
