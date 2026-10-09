package com.google.android.gms.measurement.internal;

import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbb extends zzjf {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f12680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f12681d;

    @Override // com.google.android.gms.measurement.internal.zzjf
    public final boolean h() {
        Calendar calendar = Calendar.getInstance();
        this.f12680c = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.f12681d = p.u(new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()), lowerCase, "-", lowerCase2);
        return false;
    }

    public final long k() {
        i();
        return this.f12680c;
    }

    public final String l() {
        i();
        return this.f12681d;
    }
}
