package no;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f43892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f43894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f43895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f43896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f43897f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, vy.d dVar) {
        super(dVar);
        this.f43894c = mVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43892a = obj;
        this.f43893b |= Integer.MIN_VALUE;
        return this.f43894c.emit(null, this);
    }
}
