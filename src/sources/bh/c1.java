package bh;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c1 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f4176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LinkedHashMap f4177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f4178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1 f4179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4180e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(s1 s1Var, xy.c cVar) {
        super(cVar);
        this.f4179d = s1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f4178c = obj;
        this.f4180e |= Integer.MIN_VALUE;
        return s1.a(this.f4179d, null, this);
    }
}
