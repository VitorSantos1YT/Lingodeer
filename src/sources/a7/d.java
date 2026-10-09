package a7;

import b7.f0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Ordering f431b = Ordering.c().f(new c(0));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f432c = new d(ImmutableList.s());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableList f433a;

    static {
        f0.G(0);
        f0.G(1);
    }

    public d(List list) {
        this.f433a = ImmutableList.z(f431b, list);
    }
}
