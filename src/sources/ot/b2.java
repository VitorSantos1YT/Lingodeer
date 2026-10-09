package ot;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b2 extends xy.c {
    public int H;
    public /* synthetic */ Object K;
    public final /* synthetic */ lp.b L;
    public int M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f45754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f45755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f45756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LinkedHashMap f45757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public kotlin.jvm.internal.w f45758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public kotlin.jvm.internal.x f45759f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Iterator f45760t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(lp.b bVar, xy.c cVar) {
        super(cVar);
        this.L = bVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.K = obj;
        this.M |= Integer.MIN_VALUE;
        return this.L.e(0L, 0L, 0L, this);
    }
}
