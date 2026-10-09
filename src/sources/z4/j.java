package z4;

import android.os.Build;
import android.view.DisplayCutout;
import i0.pKy.shrCcjmOhAmRC;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayCutout f58859a;

    public j(DisplayCutout displayCutout) {
        this.f58859a = displayCutout;
    }

    public final r4.d a() {
        return Build.VERSION.SDK_INT >= 30 ? r4.d.d(a5.d.d(this.f58859a)) : r4.d.f48792e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f58859a, ((j) obj).f58859a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f58859a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return shrCcjmOhAmRC.eLyweVgfg + this.f58859a + "}";
    }
}
