package xq;

import android.content.Context;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends xy.c {
    public int H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f56199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f56200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f56201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f56202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f56203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f56204f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i f56205t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(i iVar, xy.c cVar) {
        super(cVar);
        this.f56205t = iVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f56204f = obj;
        this.H |= Integer.MIN_VALUE;
        return this.f56205t.c(null, this);
    }
}
