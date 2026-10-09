package e6;

import android.widget.RemoteViews;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RemoteViews f24947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u0 f24948b;

    public j1(RemoteViews remoteViews, u0 u0Var) {
        this.f24947a = remoteViews;
        this.f24948b = u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return kotlin.jvm.internal.m.a(this.f24947a, j1Var.f24947a) && kotlin.jvm.internal.m.a(this.f24948b, j1Var.f24948b);
    }

    public final int hashCode() {
        return this.f24948b.hashCode() + (this.f24947a.hashCode() * 31);
    }

    public final String toString() {
        return "RemoteViewsInfo(remoteViews=" + this.f24947a + ", view=" + this.f24948b + ')';
    }
}
