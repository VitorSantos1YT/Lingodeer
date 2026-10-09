package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class IdManager implements InstallIdProvider {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f18330g = Pattern.compile("[^\\p{Alnum}]");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f18331h = Pattern.quote("/");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstallerPackageNameProvider f18332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f18333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FirebaseInstallationsApi f18335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DataCollectionArbiter f18336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InstallIdProvider.InstallIds f18337f;

    public IdManager(Context context, String str, FirebaseInstallationsApi firebaseInstallationsApi, DataCollectionArbiter dataCollectionArbiter) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f18333b = context;
        this.f18334c = str;
        this.f18335d = firebaseInstallationsApi;
        this.f18336e = dataCollectionArbiter;
        this.f18332a = new InstallerPackageNameProvider();
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = f18330g.matcher(UUID.randomUUID().toString()).replaceAll(BuildConfig.VERSION_NAME).toLowerCase(Locale.US);
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final FirebaseInstallationId b(boolean z11) {
        String strA;
        CrashlyticsWorkers.c();
        FirebaseInstallationsApi firebaseInstallationsApi = this.f18335d;
        String str = null;
        if (z11) {
            try {
                strA = ((InstallationTokenResult) Tasks.await(firebaseInstallationsApi.a(), 10000L, TimeUnit.MILLISECONDS)).a();
            } catch (Exception unused) {
                strA = null;
            }
        } else {
            strA = null;
        }
        try {
            str = (String) Tasks.await(firebaseInstallationsApi.getId(), 10000L, TimeUnit.MILLISECONDS);
        } catch (Exception unused2) {
        }
        return new FirebaseInstallationId(str, strA);
    }

    public final synchronized InstallIdProvider.InstallIds c() {
        String str;
        InstallIdProvider.InstallIds installIds = this.f18337f;
        if (installIds != null && (((AutoValue_InstallIdProvider_InstallIds) installIds).f18242b != null || !this.f18336e.a())) {
            return this.f18337f;
        }
        SharedPreferences sharedPreferences = this.f18333b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        if (this.f18336e.a()) {
            FirebaseInstallationId firebaseInstallationIdB = b(false);
            if (firebaseInstallationIdB.f18328a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                firebaseInstallationIdB = new FirebaseInstallationId(str, null);
            }
            if (Objects.equals(firebaseInstallationIdB.f18328a, string)) {
                this.f18337f = new AutoValue_InstallIdProvider_InstallIds(sharedPreferences.getString("crashlytics.installation.id", null), firebaseInstallationIdB.f18328a, firebaseInstallationIdB.f18329b);
            } else {
                this.f18337f = new AutoValue_InstallIdProvider_InstallIds(a(sharedPreferences, firebaseInstallationIdB.f18328a), firebaseInstallationIdB.f18328a, firebaseInstallationIdB.f18329b);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f18337f = new AutoValue_InstallIdProvider_InstallIds(a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        } else {
            this.f18337f = new AutoValue_InstallIdProvider_InstallIds(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        }
        Objects.toString(this.f18337f);
        return this.f18337f;
    }

    public final String d() {
        String str;
        InstallerPackageNameProvider installerPackageNameProvider = this.f18332a;
        Context context = this.f18333b;
        synchronized (installerPackageNameProvider) {
            try {
                if (installerPackageNameProvider.f18338a == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = BuildConfig.VERSION_NAME;
                    }
                    installerPackageNameProvider.f18338a = installerPackageName;
                }
                str = BuildConfig.VERSION_NAME.equals(installerPackageNameProvider.f18338a) ? null : installerPackageNameProvider.f18338a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
