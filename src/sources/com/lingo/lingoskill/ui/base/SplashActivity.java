package com.lingo.lingoskill.ui.base;

import a0.w1;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwnerKt;
import bp.f5;
import bp.g5;
import bp.h5;
import bq.r;
import cf.x;
import com.google.firebase.installations.local.OLhn.iBOEkSbvCqGS;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.main.ui.MainComposeActivity;
import ij.m;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import ji.b;
import okhttp3.internal.platform.ZjS.OYAvlbfUyD;
import qy.j;
import rz.e0;
import vy.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class SplashActivity extends b {
    public static final /* synthetic */ int S = 0;
    public final Object P;
    public final Object Q;
    public final Object R;

    public static final void u(SplashActivity splashActivity, Bundle bundle) {
        Intent intent = new Intent(splashActivity, (Class<?>) MainComposeActivity.class);
        if (bundle != null) {
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                Objects.toString(bundle.get(it.next()));
            }
            intent.putExtras(bundle);
        }
        splashActivity.startActivity(intent);
        splashActivity.finish();
    }

    public static final void v(SplashActivity splashActivity, Bundle bundle) {
        List listD = m.a().f34439a.f34442b.queryBuilder().d();
        kotlin.jvm.internal.m.e(listD, "getLanguageItemList(...)");
        int i11 = 3;
        d dVar = null;
        if (!listD.isEmpty()) {
            int[] iArr = r.f4959a;
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            if (bq.m.r(x.n().keyLanguage).length() > 0) {
                e0.B(LifecycleOwnerKt.getLifecycleScope(splashActivity), null, null, new w1(i11, splashActivity, bundle, dVar), 3);
                return;
            }
        }
        e0.B(LifecycleOwnerKt.getLifecycleScope(splashActivity), null, null, new g5(splashActivity, dVar, 0), 3);
    }

    @Override // ji.b, l.m, androidx.fragment.app.p0, android.app.Activity
    public final void onDestroy() throws IllegalAccessException, InvocationTargetException {
        iBOEkSbvCqGS.kPU.invoke(null, this);
    }

    @Override // f.n, android.app.Activity
    public final void onNewIntent(Intent intent) {
        kotlin.jvm.internal.m.f(intent, "intent");
        super.onNewIntent(intent);
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new g5(this, null, 3), 3);
    }

    public SplashActivity() {
        super(OYAvlbfUyD.CqgeoZ, f5.f4576a);
        j jVar = j.SYNCHRONIZED;
        this.P = com.bumptech.glide.d.u(jVar, new h5(this, 0));
        this.Q = com.bumptech.glide.d.u(jVar, new h5(this, 1));
        this.R = com.bumptech.glide.d.u(jVar, new h5(this, 2));
    }
}
