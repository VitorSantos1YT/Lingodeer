package rt;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class va extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f50540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f50541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f50542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f50543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bb f50544e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f50545f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va(bb bbVar, xy.c cVar) {
        super(cVar);
        this.f50544e = bbVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f50543d = obj;
        this.f50545f |= Integer.MIN_VALUE;
        return bb.a(this.f50544e, null, this);
    }
}
