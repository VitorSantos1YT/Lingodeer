package p5;

import android.content.SharedPreferences;
import java.util.Set;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f46310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f46311b;

    public e(SharedPreferences prefs, Set set) {
        m.f(prefs, "prefs");
        this.f46310a = prefs;
        this.f46311b = set;
    }
}
