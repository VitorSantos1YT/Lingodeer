package no;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f43907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f43909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f43910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f43911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f43912f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(m mVar, vy.d dVar) {
        super(dVar);
        this.f43909c = mVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43907a = obj;
        this.f43908b |= Integer.MIN_VALUE;
        return this.f43909c.emit(null, this);
    }
}
