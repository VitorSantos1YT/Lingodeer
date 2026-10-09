package f6;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.os.StrictMode;
import androidx.fragment.app.p;
import androidx.glance.appwidget.action.ActionTrampolineActivity;
import androidx.glance.appwidget.action.InvisibleActionTrampolineActivity;
import com.tbruyelle.rxpermissions3.BuildConfig;
import e6.x1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import qy.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d6.c f26628a = new d6.c("android.widget.extra.CHECKED");

    public static final Uri a(x1 x1Var, int i11, c cVar, String str) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("glance-action");
        builder.path(cVar.name());
        builder.appendQueryParameter("appWidgetId", String.valueOf(x1Var.f25079b));
        builder.appendQueryParameter("viewId", String.valueOf(i11));
        builder.appendQueryParameter("viewSize", v3.h.c(x1Var.f25087j));
        builder.appendQueryParameter("extraData", str);
        if (x1Var.f25083f) {
            builder.appendQueryParameter("lazyCollection", String.valueOf(x1Var.f25088k));
            builder.appendQueryParameter("lazeViewItem", String.valueOf(-1));
        }
        return builder.build();
    }

    public static final Intent b(d6.a aVar, x1 x1Var, int i11, fz.c cVar) {
        if (aVar instanceof f) {
            f fVar = (f) aVar;
            Intent intentD = d(fVar, (d6.f) cVar.invoke(fVar.f26626b));
            if (intentD.getData() == null) {
                intentD.setData(a(x1Var, i11, c.CALLBACK, BuildConfig.VERSION_NAME));
            }
            return intentD;
        }
        if (!(aVar instanceof d6.e)) {
            throw new IllegalStateException(("Cannot create fill-in Intent for action type: " + aVar).toString());
        }
        ComponentName componentName = x1Var.f25090n;
        if (componentName == null) {
            throw new IllegalArgumentException("In order to use LambdaAction, actionBroadcastReceiver must be provided");
        }
        Intent intentPutExtra = new Intent().setComponent(componentName).setAction("ACTION_TRIGGER_LAMBDA").putExtra("EXTRA_ACTION_KEY", (String) null).putExtra("EXTRA_APPWIDGET_ID", x1Var.f25079b);
        c cVar2 = c.BROADCAST;
        Intent intent = new Intent(x1Var.f25078a, (Class<?>) (cVar2 == c.ACTIVITY ? ActionTrampolineActivity.class : InvisibleActionTrampolineActivity.class));
        intent.setData(a(x1Var, i11, cVar2, BuildConfig.VERSION_NAME));
        intent.putExtra("ACTION_TYPE", cVar2.name());
        intent.putExtra("ACTION_INTENT", intentPutExtra);
        return intent;
    }

    public static final PendingIntent c(d6.a aVar, x1 x1Var, int i11, fz.c cVar) {
        Context context = x1Var.f25078a;
        if (aVar instanceof f) {
            f fVar = (f) aVar;
            Intent intentD = d(fVar, (d6.f) cVar.invoke(fVar.f26626b));
            if (intentD.getData() == null) {
                intentD.setData(a(x1Var, i11, c.CALLBACK, BuildConfig.VERSION_NAME));
            }
            return PendingIntent.getActivity(context, 0, intentD, 201326592, null);
        }
        if (!(aVar instanceof d6.e)) {
            throw new IllegalStateException(("Cannot create PendingIntent for action type: " + aVar).toString());
        }
        ComponentName componentName = x1Var.f25090n;
        if (componentName == null) {
            throw new IllegalArgumentException("In order to use LambdaAction, actionBroadcastReceiver must be provided");
        }
        Intent intentPutExtra = new Intent().setComponent(componentName).setAction("ACTION_TRIGGER_LAMBDA").putExtra("EXTRA_ACTION_KEY", (String) null).putExtra("EXTRA_APPWIDGET_ID", x1Var.f25079b);
        intentPutExtra.setData(a(x1Var, i11, c.CALLBACK, null));
        return PendingIntent.getBroadcast(context, 0, intentPutExtra, 201326592);
    }

    public static final Intent d(f fVar, d6.f fVar2) {
        if (!(fVar instanceof f)) {
            throw new IllegalStateException(("Action type not defined in app widget package: " + fVar).toString());
        }
        Intent intent = fVar.f26625a;
        Map mapUnmodifiableMap = Collections.unmodifiableMap(fVar2.f23204a);
        ArrayList arrayList = new ArrayList(mapUnmodifiableMap.size());
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            arrayList.add(new l(((d6.c) entry.getKey()).f23203a, entry.getValue()));
        }
        l[] lVarArr = (l[]) arrayList.toArray(new l[0]);
        intent.putExtras(jh.h.b((l[]) Arrays.copyOf(lVarArr, lVarArr.length)));
        return intent;
    }

    public static final void e(Activity activity, Intent intent) {
        StrictMode.VmPolicy vmPolicyBuild;
        Parcelable parcelableExtra = intent.getParcelableExtra("ACTION_INTENT");
        if (parcelableExtra == null) {
            throw new IllegalArgumentException("List adapter activity trampoline invoked without specifying target intent.");
        }
        Intent intent2 = (Intent) parcelableExtra;
        if (intent.hasExtra("android.widget.extra.CHECKED")) {
            intent2.putExtra("android.widget.extra.CHECKED", intent.getBooleanExtra("android.widget.extra.CHECKED", false));
        }
        String stringExtra = intent.getStringExtra("ACTION_TYPE");
        if (stringExtra == null) {
            throw new IllegalArgumentException("List adapter activity trampoline invoked without trampoline type");
        }
        p pVar = new p(stringExtra, activity, intent2, intent.getBundleExtra("ACTIVITY_OPTIONS"), 1);
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            vmPolicyBuild = g.f26627a.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build();
        } else {
            vmPolicyBuild = new StrictMode.VmPolicy.Builder().build();
        }
        StrictMode.setVmPolicy(vmPolicyBuild);
        pVar.invoke();
        StrictMode.setVmPolicy(vmPolicy);
        activity.finish();
    }
}
