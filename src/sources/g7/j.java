package g7;

import android.media.metrics.LogSessionId;
import android.os.Build;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f3.i f28853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f28854c;

    static {
        new j(BuildConfig.VERSION_NAME);
    }

    public j(String str) {
        this.f28852a = str;
        this.f28853b = Build.VERSION.SDK_INT >= 31 ? new f3.i(1) : null;
        this.f28854c = new Object();
    }

    public final synchronized LogSessionId a() {
        f3.i iVar;
        iVar = this.f28853b;
        iVar.getClass();
        return (LogSessionId) iVar.f26615b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Objects.equals(this.f28852a, jVar.f28852a) && Objects.equals(this.f28853b, jVar.f28853b) && Objects.equals(this.f28854c, jVar.f28854c);
    }

    public final int hashCode() {
        return Objects.hash(this.f28852a, this.f28853b, this.f28854c);
    }
}
