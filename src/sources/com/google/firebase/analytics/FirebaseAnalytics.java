package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzez;
import com.google.android.gms.measurement.internal.zzlk;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.installations.FirebaseInstallationsApi;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseAnalytics {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile FirebaseAnalytics f17762b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzez f17763a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ConsentStatus {
        public static final ConsentStatus DENIED;
        public static final ConsentStatus GRANTED;
        private static final /* synthetic */ ConsentStatus[] zza;

        static {
            ConsentStatus consentStatus = new ConsentStatus("GRANTED", 0);
            GRANTED = consentStatus;
            ConsentStatus consentStatus2 = new ConsentStatus("DENIED", 1);
            DENIED = consentStatus2;
            zza = new ConsentStatus[]{consentStatus, consentStatus2};
        }

        public static ConsentStatus valueOf(String str) {
            return (ConsentStatus) Enum.valueOf(ConsentStatus.class, str);
        }

        public static ConsentStatus[] values() {
            return (ConsentStatus[]) zza.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ConsentType {
        public static final ConsentType AD_PERSONALIZATION;
        public static final ConsentType AD_STORAGE;
        public static final ConsentType AD_USER_DATA;
        public static final ConsentType ANALYTICS_STORAGE;
        private static final /* synthetic */ ConsentType[] zza;

        static {
            ConsentType consentType = new ConsentType("AD_STORAGE", 0);
            AD_STORAGE = consentType;
            ConsentType consentType2 = new ConsentType("ANALYTICS_STORAGE", 1);
            ANALYTICS_STORAGE = consentType2;
            ConsentType consentType3 = new ConsentType("AD_USER_DATA", 2);
            AD_USER_DATA = consentType3;
            ConsentType consentType4 = new ConsentType("AD_PERSONALIZATION", 3);
            AD_PERSONALIZATION = consentType4;
            zza = new ConsentType[]{consentType, consentType2, consentType3, consentType4};
        }

        public static ConsentType valueOf(String str) {
            return (ConsentType) Enum.valueOf(ConsentType.class, str);
        }

        public static ConsentType[] values() {
            return (ConsentType[]) zza.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Event {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Param {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class UserProperty {
    }

    public FirebaseAnalytics(zzez zzezVar) {
        Preconditions.g(zzezVar);
        this.f17763a = zzezVar;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (f17762b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f17762b == null) {
                        f17762b = new FirebaseAnalytics(zzez.i(context, null));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f17762b;
    }

    public static zzlk getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzez zzezVarI = zzez.i(context, bundle);
        if (zzezVarI == null) {
            return null;
        }
        return new zzd(zzezVarI);
    }

    public final void a(Bundle bundle) {
        if (bundle != null) {
            bundle = new Bundle(bundle);
        }
        this.f17763a.e(bundle);
    }

    public final void b(String str, String str2) {
        this.f17763a.l(null, str, str2, false);
    }

    public String getFirebaseInstanceId() {
        try {
            Object obj = FirebaseInstallations.m;
            return (String) Tasks.await(((FirebaseInstallations) FirebaseApp.e().c(FirebaseInstallationsApi.class)).getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e8) {
            throw new IllegalStateException(e8);
        } catch (ExecutionException e10) {
            throw new IllegalStateException(e10.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.f17763a.q(zzdd.D1(activity), str, str2);
    }
}
