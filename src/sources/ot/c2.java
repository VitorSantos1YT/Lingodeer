package ot;

import com.lingodeer.data.model.CourseWord;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c2 extends xy.c {
    public int H;
    public int K;
    public /* synthetic */ Object L;
    public final /* synthetic */ lp.b M;
    public int N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CourseWord f45767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Collection f45768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f45769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q2 f45770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f45771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f45772f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f45773t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(lp.b bVar, xy.c cVar) {
        super(cVar);
        this.M = bVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.L = obj;
        this.N |= Integer.MIN_VALUE;
        return lp.b.d(this.M, null, 0L, 0L, this);
    }
}
