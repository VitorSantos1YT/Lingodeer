package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.zaab;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zacc;
import com.google.android.gms.common.api.internal.zag;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.AttributionSourceWrapper;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collection;
import java.util.Collections;
import y.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class GoogleApi<O extends Api.ApiOptions> implements HasApiKey<O> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AttributionSourceWrapper f8678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Api f8679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Api.ApiOptions f8680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ApiKey f8681f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Looper f8682g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f8683h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final zabq f8684i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final StatusExceptionMapper f8685j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final GoogleApiManager f8686k;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Settings {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Settings f8687c = new Builder().a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StatusExceptionMapper f8688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Looper f8689b;

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public ApiExceptionMapper f8690a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Looper f8691b;

            public final Settings a() {
                if (this.f8690a == null) {
                    this.f8690a = new ApiExceptionMapper();
                }
                if (this.f8691b == null) {
                    this.f8691b = Looper.getMainLooper();
                }
                return new Settings(this.f8690a, this.f8691b);
            }
        }

        public Settings(ApiExceptionMapper apiExceptionMapper, Looper looper) {
            this.f8688a = apiExceptionMapper;
            this.f8689b = looper;
        }
    }

    public GoogleApi(Activity activity, Api api, Api.ApiOptions.NotRequiredOptions notRequiredOptions, ApiExceptionMapper apiExceptionMapper) {
        Settings.Builder builder = new Settings.Builder();
        builder.f8690a = apiExceptionMapper;
        Looper mainLooper = activity.getMainLooper();
        Preconditions.h(mainLooper, "Looper must not be null.");
        builder.f8691b = mainLooper;
        this(activity, activity, api, notRequiredOptions, builder.a());
    }

    public final ClientSettings.Builder a() {
        GoogleSignInAccount googleSignInAccountR0;
        GoogleSignInAccount googleSignInAccountR1;
        ClientSettings.Builder builder = new ClientSettings.Builder();
        Api.ApiOptions apiOptions = this.f8680e;
        boolean z11 = apiOptions instanceof Api.ApiOptions.HasGoogleSignInAccountOptions;
        Account accountG0 = null;
        if (z11 && (googleSignInAccountR1 = ((Api.ApiOptions.HasGoogleSignInAccountOptions) apiOptions).r0()) != null) {
            String str = googleSignInAccountR1.f8487c;
            if (str != null) {
                accountG0 = new Account(str, "com.google");
            }
        } else if (apiOptions instanceof Api.ApiOptions.HasAccountOptions) {
            accountG0 = ((Api.ApiOptions.HasAccountOptions) apiOptions).G0();
        }
        builder.f8906a = accountG0;
        Collection collectionD1 = (!z11 || (googleSignInAccountR0 = ((Api.ApiOptions.HasGoogleSignInAccountOptions) apiOptions).r0()) == null) ? Collections.EMPTY_SET : googleSignInAccountR0.D1();
        if (builder.f8907b == null) {
            builder.f8907b = new f(0);
        }
        builder.f8907b.addAll(collectionD1);
        Context context = this.f8676a;
        builder.f8909d = context.getClass().getName();
        builder.f8908c = context.getPackageName();
        return builder;
    }

    public final Task b(int i11, TaskApiCall taskApiCall) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        GoogleApiManager googleApiManager = this.f8686k;
        googleApiManager.getClass();
        googleApiManager.b(taskCompletionSource, taskApiCall.f8760c, this);
        zacc zaccVar = new zacc(new zag(i11, taskApiCall, taskCompletionSource, this.f8685j), googleApiManager.K.get(), this);
        zao zaoVar = googleApiManager.P;
        zaoVar.sendMessage(zaoVar.obtainMessage(4, zaccVar));
        return taskCompletionSource.getTask();
    }

    public GoogleApi(Context context, Activity activity, Api api, Api.ApiOptions.NotRequiredOptions notRequiredOptions, Settings settings) {
        Preconditions.h(context, "Null context is not permitted.");
        Preconditions.h(api, "Api must not be null.");
        Preconditions.h(settings, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        Preconditions.h(applicationContext, "The provided context did not have an application context.");
        this.f8676a = applicationContext;
        int i11 = Build.VERSION.SDK_INT;
        String attributionTag = (i11 < 30 || i11 < 30) ? null : context.getAttributionTag();
        this.f8677b = attributionTag;
        this.f8678c = i11 >= 31 ? new AttributionSourceWrapper(context.getAttributionSource()) : null;
        this.f8679d = api;
        this.f8680e = notRequiredOptions;
        this.f8682g = settings.f8689b;
        ApiKey apiKey = new ApiKey(api, notRequiredOptions, attributionTag);
        this.f8681f = apiKey;
        this.f8684i = new zabq(this);
        GoogleApiManager googleApiManagerD = GoogleApiManager.d(applicationContext);
        this.f8686k = googleApiManagerD;
        this.f8683h = googleApiManagerD.H.getAndIncrement();
        this.f8685j = settings.f8688a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
            zaab zaabVar = (zaab) fragment.e(zaab.class, "ConnectionlessLifecycleHelper");
            zaabVar = zaabVar == null ? new zaab(fragment, googleApiManagerD, GoogleApiAvailability.f8643e) : zaabVar;
            zaabVar.f8769e.add(apiKey);
            googleApiManagerD.e(zaabVar);
        }
        zao zaoVar = googleApiManagerD.P;
        zaoVar.sendMessage(zaoVar.obtainMessage(7, this));
    }
}
