package com.lingo.lingoskill.japanskill.ui.syllable;

import android.os.Bundle;
import ay.x;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import ff.h;
import fv.a;
import fv.c;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import ji.b;
import km.b2;
import km.d;
import km.d0;
import km.f2;
import ko.Zea.ealNNtLp;
import kotlin.jvm.internal.m;
import th.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class YinTuActivity extends b {
    public static final /* synthetic */ int R = 0;
    public c P;
    public final ArrayList Q;

    public YinTuActivity() {
        super(BuildConfig.VERSION_NAME, b2.f38162a);
        this.Q = new ArrayList();
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        if (((f2) getSupportFragmentManager().C(R.id.fl_container)) == null) {
            h.A(this, new f2());
        }
        this.P = new c();
        File file = new File(e.m(xt.b.a().b(), fv.b.D(-1L)));
        a aVar = new a(0L, fv.b.E(-1L), fv.b.D(-1L));
        if (file.exists()) {
            if (file.length() != 0) {
                j.a(new x(new d0(file, this, 1)).k(ky.e.f38937b).g(px.b.a()).h(d.f38170t, d.H), this.f36391f);
            }
        } else {
            c cVar = this.P;
            m.c(cVar);
            cVar.d(aVar, new aj.e(this, 10));
        }
    }

    @Override // ji.b, l.m, androidx.fragment.app.p0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (this.P != null) {
            Iterator it = this.Q.iterator();
            m.e(it, ealNNtLp.GXfghAyYjTKruk);
            while (it.hasNext()) {
                Object next = it.next();
                m.e(next, "next(...)");
                int iIntValue = ((Number) next).intValue();
                c cVar = this.P;
                m.c(cVar);
                cVar.a(iIntValue);
            }
        }
    }
}
