package j7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f36090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f36091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f36092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f36093f;

    public a(long j11, int i11, ArrayList arrayList, List list, List list2, List list3) {
        this.f36088a = j11;
        this.f36089b = i11;
        this.f36090c = Collections.unmodifiableList(arrayList);
        this.f36091d = Collections.unmodifiableList(list);
        this.f36092e = Collections.unmodifiableList(list2);
        this.f36093f = Collections.unmodifiableList(list3);
    }
}
