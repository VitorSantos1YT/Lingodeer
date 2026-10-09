package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import com.google.firebase.installations.time.Clock;
import com.google.firebase.installations.time.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class Utils {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f20371b = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f20372c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Utils f20373d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clock f20374a;

    public Utils(SystemClock systemClock) {
        this.f20374a = systemClock;
    }

    public final boolean a(PersistedInstallationEntry persistedInstallationEntry) {
        if (TextUtils.isEmpty(persistedInstallationEntry.a())) {
            return true;
        }
        return persistedInstallationEntry.b() + persistedInstallationEntry.g() < TimeUnit.MILLISECONDS.toSeconds(this.f20374a.a()) + f20371b;
    }
}
