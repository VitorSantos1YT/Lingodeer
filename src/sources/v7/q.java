package v7;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final s.a f53659p = new s.a(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f53660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f53661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray f53662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f53663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f53664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b7.y f53665f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CopyOnWriteArraySet f53666g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ar.f f53667h = new ar.f(1, (byte) 0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b7.a0 f53668i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Pair f53669j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f53670k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f53671l;
    public long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f53672n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f53673o;

    public q(f7.k kVar) {
        this.f53660a = (Context) kVar.f26821c;
        o oVar = (o) kVar.f26823e;
        b7.a.k(oVar);
        this.f53661b = oVar;
        this.f53662c = new SparseArray();
        ImmutableList.s();
        this.f53663d = kVar.f26819a;
        b7.y yVar = (b7.y) kVar.f26824f;
        this.f53665f = yVar;
        this.f53664e = new c((u) kVar.f26822d, yVar);
        this.f53666g = new CopyOnWriteArraySet();
        new y6.o().a();
        this.m = -9223372036854775807L;
        this.f53673o = -1;
        this.f53671l = 0;
    }
}
