package j7;

import b7.f0;
import com.google.common.collect.ImmutableList;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y6.p f36144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImmutableList f36145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f36146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f36147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f36148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f36149f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j f36150t;

    public m(y6.p pVar, List list, s sVar, List list2, List list3, List list4) {
        b7.a.d(!list.isEmpty());
        this.f36144a = pVar;
        this.f36145b = ImmutableList.n(list);
        this.f36147d = list2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list2);
        this.f36148e = list3;
        this.f36149f = list4;
        this.f36150t = sVar.a(this);
        long j11 = sVar.f36167c;
        long j12 = sVar.f36166b;
        String str = f0.f3975a;
        this.f36146c = f0.R(j11, 1000000L, j12, RoundingMode.DOWN);
    }

    public abstract String a();

    public abstract i7.h c();

    public abstract j d();
}
