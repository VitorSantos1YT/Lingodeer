package com.lingo.lingoskill.base.refill;

import android.content.Context;
import android.widget.Toast;
import com.lingo.lingoskill.object.DaoSession;
import hh.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f21691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DaoSession f21692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lc.d f21693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21694e;

    public c(Context context, DaoSession daoSession, lc.d dialog, int i11) {
        this.f21690a = i11;
        switch (i11) {
            case 1:
                kotlin.jvm.internal.m.f(daoSession, "daoSession");
                kotlin.jvm.internal.m.f(dialog, "dialog");
                this.f21691b = context;
                this.f21692c = daoSession;
                this.f21693d = dialog;
                break;
            case 2:
                kotlin.jvm.internal.m.f(daoSession, "daoSession");
                kotlin.jvm.internal.m.f(dialog, "dialog");
                this.f21691b = context;
                this.f21692c = daoSession;
                this.f21693d = dialog;
                break;
            default:
                kotlin.jvm.internal.m.f(dialog, "dialog");
                this.f21691b = context;
                this.f21692c = daoSession;
                this.f21693d = dialog;
                break;
        }
    }

    public static final void a(c cVar) {
        if (cVar.f21694e >= 3) {
            Toast.makeText(cVar.f21691b, "更新完成", 0).show();
            p0.w(0, f10.e.b());
            cVar.f21693d.dismiss();
        }
    }

    public final void b() {
        switch (this.f21690a) {
            case 0:
                ((i) com.google.android.material.datepicker.d.i(i.class, "http://192.168.31.31:4242/AdminZG/", "create(...)")).c().f(g.T).f(new f(this.f21692c.getHwCharacterDao(), this, 2)).k(ky.e.f38937b).g(px.b.a()).h(new a(this, 0), b.f21677b);
                break;
            case 1:
                ((i) com.google.android.material.datepicker.d.i(i.class, "http://192.168.31.31:1818/AdminCN/", "create(...)")).i().f(g.R).f(new f(this.f21692c.getJPCharDao(), this, 6)).k(ky.e.f38937b).g(px.b.a()).h(new a(this, 1), b.f21685f);
                break;
            default:
                ((i) com.google.android.material.datepicker.d.i(i.class, "http://192.168.31.31:1717/AdminZG/", "create(...)")).i().f(g.R).f(new f(this.f21692c.getKOCharDao(), this, 8)).k(ky.e.f38937b).g(px.b.a()).h(new a(this, 2), b.H);
                break;
        }
    }
}
