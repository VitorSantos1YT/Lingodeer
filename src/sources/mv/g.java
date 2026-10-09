package mv;

import bw.ORXQ.ADSb;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f42208a;

    public g(long j11) {
        this.f42208a = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f42208a == ((g) obj).f42208a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f42208a);
    }

    public final String toString() {
        return nv.p.m(this.f42208a, "RecordFirstLearningReminderIfNeeded(nowMillis=", ADSb.zORAgAAhWuo);
    }
}
