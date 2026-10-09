package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import ay.k0;
import java.util.List;
import mw.g0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends ContextWrapper {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f7628k = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0.n f7629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f7630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f7631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f7632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f7633e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y.e f7634f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final vd.o f7635g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a5.f f7636h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f7637i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public le.g f7638j;

    public i(Context context, m0.n nVar, bq.f fVar, k0 k0Var, b bVar, y.e eVar, List list, vd.o oVar, a5.f fVar2, int i11) {
        super(context.getApplicationContext());
        this.f7629a = nVar;
        this.f7631c = k0Var;
        this.f7632d = bVar;
        this.f7633e = list;
        this.f7634f = eVar;
        this.f7635g = oVar;
        this.f7636h = fVar2;
        this.f7637i = i11;
        this.f7630b = new g0(fVar);
    }

    public final l a() {
        return (l) this.f7630b.get();
    }
}
