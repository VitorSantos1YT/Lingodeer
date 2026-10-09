package p9;

import android.text.TextUtils;
import androidx.preference.Preference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46714c;

    public x(Preference preference) {
        this.f46714c = preference.getClass().getName();
        this.f46712a = preference.f2331g0;
        this.f46713b = preference.f2332h0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f46712a == xVar.f46712a && this.f46713b == xVar.f46713b && TextUtils.equals(this.f46714c, xVar.f46714c);
    }

    public final int hashCode() {
        return this.f46714c.hashCode() + ((((527 + this.f46712a) * 31) + this.f46713b) * 31);
    }
}
