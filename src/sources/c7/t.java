package c7;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f6716b = -9223372036854775807L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f6715a = new ArrayList();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f6716b, ((t) obj).f6716b);
    }
}
