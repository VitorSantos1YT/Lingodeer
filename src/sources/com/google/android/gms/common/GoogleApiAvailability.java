package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.fragment.app.k1;
import androidx.fragment.app.p0;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.service.zaq;
import com.google.android.gms.common.internal.zaf;
import com.google.android.gms.common.internal.zaj;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import n4.j;
import n4.n;
import n4.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class GoogleApiAvailability extends GoogleApiAvailabilityLight {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f8642d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final GoogleApiAvailability f8643e = new GoogleApiAvailability();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zaq f8644c;

    public static AlertDialog e(Activity activity, int i11, zaj zajVar, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        if (i11 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(android.R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(zaf.b(activity, i11));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        if (i11 == 1) {
            string = resources.getString(com.lingodeer.R.string.common_google_play_services_install_button);
        } else if (i11 != 2) {
            string = i11 != 3 ? resources.getString(android.R.string.ok) : resources.getString(com.lingodeer.R.string.common_google_play_services_enable_button);
        } else {
            string = resources.getString(com.lingodeer.R.string.common_google_play_services_update_button);
        }
        if (string != null) {
            builder.setPositiveButton(string, zajVar);
        }
        String strA = zaf.a(activity, i11);
        if (strA != null) {
            builder.setTitle(strA);
        }
        new IllegalArgumentException();
        return builder.create();
    }

    public static void i(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof p0) {
                k1 supportFragmentManager = ((p0) activity).getSupportFragmentManager();
                SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
                Preconditions.h(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                supportErrorDialogFragment.S = alertDialog;
                if (onCancelListener != null) {
                    supportErrorDialogFragment.T = onCancelListener;
                }
                supportErrorDialogFragment.u(supportFragmentManager, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        ErrorDialogFragment errorDialogFragment = new ErrorDialogFragment();
        Preconditions.h(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        errorDialogFragment.f8635a = alertDialog;
        if (onCancelListener != null) {
            errorDialogFragment.f8636b = onCancelListener;
        }
        errorDialogFragment.show(fragmentManager, str);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public final int b(Context context) {
        return c(context, GoogleApiAvailabilityLight.f8645a);
    }

    public final void d(GoogleApiActivity googleApiActivity, int i11, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogE = e(googleApiActivity, i11, zaj.b(super.a(i11, googleApiActivity, "d"), googleApiActivity), googleApiActivity2);
        if (alertDialogE == null) {
            return;
        }
        i(googleApiActivity, alertDialogE, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void f(Activity activity, LifecycleFragment lifecycleFragment, int i11, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogE = e(activity, i11, zaj.c(super.a(i11, activity, "d"), lifecycleFragment), onCancelListener);
        if (alertDialogE == null) {
            return;
        }
        i(activity, alertDialogE, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    public final void g(Context context, int i11, PendingIntent pendingIntent) {
        int i12;
        new IllegalArgumentException();
        if (i11 == 18) {
            new zad(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            return;
        }
        String strE = i11 == 6 ? zaf.e(context, "common_google_play_services_resolution_required_title") : zaf.a(context, i11);
        if (strE == null) {
            strE = context.getResources().getString(com.lingodeer.R.string.common_google_play_services_notification_ticker);
        }
        String strD = (i11 == 6 || i11 == 19) ? zaf.d(context, "common_google_play_services_resolution_required_text", zaf.c(context)) : zaf.b(context, i11);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        Preconditions.g(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        p pVar = new p(context, null);
        pVar.m = true;
        pVar.c(true);
        pVar.f43215e = p.b(strE);
        n nVar = new n();
        nVar.f43210c = p.b(strD);
        pVar.e(nVar);
        boolean zA = DeviceProperties.a(context);
        int i13 = android.R.drawable.stat_sys_warning;
        if (zA) {
            int i14 = context.getApplicationInfo().icon;
            if (i14 != 0) {
                i13 = i14;
            }
            pVar.f43228s.icon = i13;
            pVar.f43220j = 2;
            if (DeviceProperties.b(context)) {
                pVar.f43212b.add(new j(resources.getString(com.lingodeer.R.string.common_open_on_phone), pendingIntent));
            } else {
                pVar.f43217g = pendingIntent;
            }
        } else {
            pVar.f43228s.icon = android.R.drawable.stat_sys_warning;
            pVar.f43228s.tickerText = p.b(resources.getString(com.lingodeer.R.string.common_google_play_services_notification_ticker));
            pVar.f43228s.when = System.currentTimeMillis();
            pVar.f43217g = pendingIntent;
            pVar.f43216f = p.b(strD);
        }
        if (PlatformVersion.a()) {
            Preconditions.j(PlatformVersion.a());
            synchronized (f8642d) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.lingodeer.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            pVar.f43226q = "com.google.android.gms.availability";
        }
        Notification notificationA = pVar.a();
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            GooglePlayServicesUtilLight.f8650a.set(false);
            i12 = 10436;
        } else {
            i12 = 39789;
        }
        notificationManager.notify(i12, notificationA);
    }

    public final void h(Context context, ConnectionResult connectionResult, boolean z11) {
        Integer num = connectionResult.f8634e;
        int iIntValue = num == null ? -1 : num.intValue();
        com.google.android.gms.common.internal.zab zabVar = new com.google.android.gms.common.internal.zab(iIntValue, connectionResult.f8631b, System.currentTimeMillis(), context.getPackageName(), z11);
        if (this.f8644c == null) {
            this.f8644c = new zaq(context, null, zaq.f8962l, Api.ApiOptions.f8664h, GoogleApi.Settings.f8687c);
        }
        this.f8644c.c(zabVar);
    }
}
