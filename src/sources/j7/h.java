package j7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f36132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f36133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f36134d;

    public h(String str, long j11, ArrayList arrayList, List list) {
        this.f36131a = str;
        this.f36132b = j11;
        this.f36133c = Collections.unmodifiableList(arrayList);
        this.f36134d = Collections.unmodifiableList(list);
    }
}
