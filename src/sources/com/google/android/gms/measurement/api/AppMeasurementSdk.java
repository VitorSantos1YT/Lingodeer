package com.google.android.gms.measurement.api;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzez;
import com.google.android.gms.measurement.internal.zzjp;
import com.google.android.gms.measurement.internal.zzjq;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class AppMeasurementSdk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzez f12596a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ConditionalUserProperty {
        private ConditionalUserProperty() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface EventInterceptor extends zzjp {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface OnEventListener extends zzjq {
    }

    public AppMeasurementSdk(zzez zzezVar) {
        this.f12596a = zzezVar;
    }

    public static AppMeasurementSdk getInstance(Context context) {
        return zzez.i(context, null).f11585c;
    }

    public void beginAdUnitExposure(String str) {
        this.f12596a.r(str);
    }

    public void endAdUnitExposure(String str) {
        this.f12596a.s(str);
    }

    public long generateEventId() {
        return this.f12596a.w();
    }

    public String getAppInstanceId() {
        return this.f12596a.v();
    }

    public String getGmpAppId() {
        return this.f12596a.u();
    }

    public void logEvent(String str, String str2, Bundle bundle) {
        this.f12596a.h(str, str2, bundle, true);
    }
}
