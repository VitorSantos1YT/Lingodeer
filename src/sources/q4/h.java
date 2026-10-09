package q4;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f47445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources.Theme f47446b;

    public h(Resources resources, Resources.Theme theme) {
        this.f47445a = resources;
        this.f47446b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (this.f47445a.equals(hVar.f47445a) && Objects.equals(this.f47446b, hVar.f47446b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f47445a, this.f47446b);
    }
}
