package com.google.android.gms.common.api.internal;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.widget.ProgressBar;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.Preconditions;
import com.tbruyelle.rxpermissions3.BuildConfig;
import o4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zao implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zam f8844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zap f8845b;

    public zao(zap zapVar, zam zamVar) {
        this.f8845b = zapVar;
        this.f8844a = zamVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zap zapVar = this.f8845b;
        if (zapVar.f8846a) {
            zam zamVar = this.f8844a;
            ConnectionResult connectionResult = zamVar.f8841b;
            if (connectionResult.D1()) {
                LifecycleFragment lifecycleFragment = zapVar.mLifecycleFragment;
                Activity activity = zapVar.getActivity();
                PendingIntent pendingIntent = connectionResult.f8632c;
                Preconditions.g(pendingIntent);
                int i11 = zamVar.f8840a;
                int i12 = GoogleApiActivity.f8692b;
                Intent intent = new Intent(activity, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i11);
                intent.putExtra("notify_manager", false);
                lifecycleFragment.startActivityForResult(intent, 1);
                return;
            }
            Activity activity2 = zapVar.getActivity();
            int i13 = connectionResult.f8631b;
            GoogleApiAvailability googleApiAvailability = zapVar.f8849d;
            if (googleApiAvailability.a(i13, activity2, null) != null) {
                googleApiAvailability.f(zapVar.getActivity(), zapVar.mLifecycleFragment, connectionResult.f8631b, zapVar);
                return;
            }
            if (connectionResult.f8631b != 18) {
                int i14 = zamVar.f8840a;
                zapVar.f8847b.set(null);
                zapVar.a(connectionResult, i14);
                return;
            }
            Activity activity3 = zapVar.getActivity();
            ProgressBar progressBar = new ProgressBar(activity3, null, R.attr.progressBarStyleLarge);
            progressBar.setIndeterminate(true);
            progressBar.setVisibility(0);
            AlertDialog.Builder builder = new AlertDialog.Builder(activity3);
            builder.setView(progressBar);
            builder.setMessage(com.google.android.gms.common.internal.zaf.b(activity3, 18));
            builder.setPositiveButton(BuildConfig.VERSION_NAME, (DialogInterface.OnClickListener) null);
            AlertDialog alertDialogCreate = builder.create();
            GoogleApiAvailability.i(activity3, alertDialogCreate, "GooglePlayServicesUpdatingDialog", zapVar);
            Context applicationContext = zapVar.getActivity().getApplicationContext();
            zan zanVar = new zan(this, alertDialogCreate);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentFilter.addDataScheme("package");
            zabs zabsVar = new zabs(zanVar);
            c.d(applicationContext, zabsVar, intentFilter, 2);
            zabsVar.f8797a = applicationContext;
            if (GooglePlayServicesUtilLight.b(applicationContext)) {
                return;
            }
            zanVar.a();
            synchronized (zabsVar) {
                try {
                    Context context = zabsVar.f8797a;
                    if (context != null) {
                        context.unregisterReceiver(zabsVar);
                    }
                    zabsVar.f8797a = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
