package sr;

import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f51754a;

    public b(List achievements) {
        m.f(achievements, "achievements");
        this.f51754a = achievements;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && m.a(this.f51754a, ((b) obj).f51754a);
    }

    public final int hashCode() {
        return this.f51754a.hashCode();
    }

    public final String toString() {
        return com.google.android.material.datepicker.d.l(this.f51754a, "LoadingSuccess(achievements=", ")");
    }
}
