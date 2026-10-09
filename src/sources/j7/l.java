package j7;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends m {
    public final j H;
    public final hd.d K;

    /* JADX WARN: Multi-variable type inference failed */
    public l(y6.p pVar, ImmutableList immutableList, r rVar, ArrayList arrayList, List list, List list2) {
        super(pVar, immutableList, rVar, arrayList, list, list2);
        Uri.parse(((b) immutableList.get(0)).f36094a);
        long j11 = rVar.f36164e;
        j jVar = j11 <= 0 ? null : new j(null, rVar.f36163d, j11);
        this.H = jVar;
        this.K = jVar == null ? new hd.d(new j(null, 0L, -1L), 20) : null;
    }

    @Override // j7.m
    public final String a() {
        return null;
    }

    @Override // j7.m
    public final i7.h c() {
        return this.K;
    }

    @Override // j7.m
    public final j d() {
        return this.H;
    }
}
