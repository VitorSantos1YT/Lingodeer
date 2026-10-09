package b7;

import com.android.billingclient.api.k0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k0 f4000b = new k0(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4002d;

    public m(Object obj) {
        this.f3999a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        return this.f3999a.equals(((m) obj).f3999a);
    }

    public final int hashCode() {
        return this.f3999a.hashCode();
    }
}
