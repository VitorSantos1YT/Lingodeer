package n8;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f43472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f43473c;

    public d(long j11, long j12, List list) {
        this.f43471a = j11;
        this.f43472b = j12;
        this.f43473c = Collections.unmodifiableList(list);
    }

    @Override // n8.b
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f43471a);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return defpackage.e.i(this.f43472b, " }", sb2);
    }
}
