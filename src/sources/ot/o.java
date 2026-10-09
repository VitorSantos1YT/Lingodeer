package ot;

import com.lingodeer.data.model.CourseSentence;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends xy.c {
    public Collection H;
    public Collection K;
    public List L;
    public Iterator M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f45922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bh.q f45924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f45925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CourseSentence f45926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Collection f45927f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Iterator f45928t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(bh.q qVar, vy.d dVar) {
        super(dVar);
        this.f45924c = qVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f45922a = obj;
        this.f45923b |= Integer.MIN_VALUE;
        return this.f45924c.emit(null, this);
    }
}
