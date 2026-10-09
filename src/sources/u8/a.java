package u8;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableList f52818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f52819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f52820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f52821d;

    public a(long j11, long j12, List list) {
        this.f52818a = ImmutableList.n(list);
        this.f52819b = j11;
        this.f52820c = j12;
        long j13 = -9223372036854775807L;
        if (j11 != -9223372036854775807L && j12 != -9223372036854775807L) {
            j13 = j11 + j12;
        }
        this.f52821d = j13;
    }
}
