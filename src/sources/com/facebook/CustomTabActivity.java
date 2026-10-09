package com.facebook;

import a4.Quyv.NpDRGrvGCBTIai;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import k8.Baj.cMQVawExPvaXS;
import lf.e;
import x6.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class CustomTabActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f7703a;

    @Override // android.app.Activity
    public final void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i12 == 0) {
            Intent intent2 = new Intent("CustomTabActivity.action_customTabRedirect");
            intent2.putExtra("CustomTabMainActivity.extra_url", getIntent().getDataString());
            b.a(this).c(intent2);
            e eVar = new e(this, 6);
            b.a(this).b(eVar, new IntentFilter("CustomTabActivity.action_destroy"));
            this.f7703a = eVar;
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, InvocationTargetException {
        NpDRGrvGCBTIai.EvMq.invoke(null, this, bundle);
    }

    @Override // android.app.Activity
    public final void onDestroy() throws IllegalAccessException, InvocationTargetException {
        cMQVawExPvaXS.rTCP.invoke(null, this);
    }
}
