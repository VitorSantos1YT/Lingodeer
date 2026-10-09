package com.lingo.lingoskill.base.refill;

import android.content.Context;
import android.widget.Toast;
import ay.g0;
import ay.p;
import com.lingo.lingoskill.object.DaoSession;
import com.lingo.lingoskill.ui.base.UpdateLessonActivity;
import hh.p0;
import re.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DaoSession f21736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lc.d f21737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21738e;

    public m(UpdateLessonActivity context, String str, DaoSession daoSession, lc.d dialog) {
        kotlin.jvm.internal.m.f(context, "context");
        kotlin.jvm.internal.m.f(dialog, "dialog");
        this.f21734a = context;
        this.f21735b = str;
        this.f21736c = daoSession;
        this.f21737d = dialog;
    }

    public static final void a(m mVar) {
        if (mVar.f21738e >= 2) {
            Toast.makeText(mVar.f21734a, "更新完成", 0).show();
            p0.w(0, f10.e.b());
            mVar.f21737d.dismiss();
        }
    }

    public final void b() {
        String str = this.f21735b;
        g0 g0VarF = ((i) com.google.android.material.datepicker.d.i(i.class, str, "create(...)")).h().f(j.K);
        dy.j jVar = ky.e.f38937b;
        p pVarG = g0VarF.k(jVar).g(px.b.a());
        l lVar = new l(this, 0);
        q qVar = vx.b.f54316e;
        pVarG.h(lVar, qVar);
        Object objB = com.lingo.lingoskill.http.service.a.a(str).b(i.class);
        kotlin.jvm.internal.m.e(objB, "create(...)");
        ((i) objB).n().f(j.L).k(jVar).g(px.b.a()).h(new l(this, 1), qVar);
    }
}
