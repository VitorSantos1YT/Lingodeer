package pu;

import java.util.Iterator;
import xy.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f47154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f47155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f47156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f47157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f47158e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.f47157d = bVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f47156c = obj;
        this.f47158e |= Integer.MIN_VALUE;
        return this.f47157d.f(this);
    }
}
