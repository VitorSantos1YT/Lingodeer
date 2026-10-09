package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzcn extends zzbl implements zzcp {
    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void beginAdUnitExposure(String str, long j11) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        parcelH.writeLong(j11);
        j(parcelH, 23);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        parcelH.writeString(str2);
        zzbn.b(parcelH, bundle);
        j(parcelH, 9);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void endAdUnitExposure(String str, long j11) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        parcelH.writeLong(j11);
        j(parcelH, 24);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void generateEventId(zzcs zzcsVar) {
        Parcel parcelH = h();
        zzbn.c(parcelH, zzcsVar);
        j(parcelH, 22);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void getAppInstanceId(zzcs zzcsVar) {
        Parcel parcelH = h();
        zzbn.c(parcelH, zzcsVar);
        j(parcelH, 20);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void getCachedAppInstanceId(zzcs zzcsVar) {
        Parcel parcelH = h();
        zzbn.c(parcelH, zzcsVar);
        j(parcelH, 19);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void getConditionalUserProperties(String str, String str2, zzcs zzcsVar) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        parcelH.writeString(str2);
        zzbn.c(parcelH, zzcsVar);
        j(parcelH, 10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void getCurrentScreenClass(zzcs zzcsVar) {
        Parcel parcelH = h();
        zzbn.c(parcelH, zzcsVar);
        j(parcelH, 17);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void getCurrentScreenName(zzcs zzcsVar) {
        Parcel parcelH = h();
        zzbn.c(parcelH, zzcsVar);
        j(parcelH, 16);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void getGmpAppId(zzcs zzcsVar) {
        Parcel parcelH = h();
        zzbn.c(parcelH, zzcsVar);
        j(parcelH, 21);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void getMaxUserProperties(String str, zzcs zzcsVar) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        zzbn.c(parcelH, zzcsVar);
        j(parcelH, 6);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void getSessionId(zzcs zzcsVar) {
        Parcel parcelH = h();
        zzbn.c(parcelH, zzcsVar);
        j(parcelH, 46);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void getTestFlag(zzcs zzcsVar, int i11) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void getUserProperties(String str, String str2, boolean z11, zzcs zzcsVar) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        parcelH.writeString(str2);
        ClassLoader classLoader = zzbn.f11473a;
        parcelH.writeInt(z11 ? 1 : 0);
        zzbn.c(parcelH, zzcsVar);
        j(parcelH, 5);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void initialize(IObjectWrapper iObjectWrapper, zzdb zzdbVar, long j11) {
        Parcel parcelH = h();
        zzbn.c(parcelH, iObjectWrapper);
        zzbn.b(parcelH, zzdbVar);
        parcelH.writeLong(j11);
        j(parcelH, 1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void initializeWithElapsedTime(IObjectWrapper iObjectWrapper, zzdb zzdbVar, long j11, long j12) {
        Parcel parcelH = h();
        zzbn.c(parcelH, iObjectWrapper);
        zzbn.b(parcelH, zzdbVar);
        parcelH.writeLong(j11);
        parcelH.writeLong(j12);
        j(parcelH, 60);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z11, boolean z12, long j11, long j12) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        parcelH.writeString(str2);
        zzbn.b(parcelH, bundle);
        parcelH.writeInt(z11 ? 1 : 0);
        parcelH.writeInt(1);
        parcelH.writeLong(j11);
        parcelH.writeLong(j12);
        j(parcelH, 59);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void logHealthData(int i11, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel parcelH = h();
        parcelH.writeInt(5);
        parcelH.writeString("Error with data collection. Data lost.");
        zzbn.c(parcelH, iObjectWrapper);
        zzbn.c(parcelH, iObjectWrapper2);
        zzbn.c(parcelH, iObjectWrapper3);
        j(parcelH, 33);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void onActivityCreatedByScionActivityInfo(zzdd zzddVar, Bundle bundle, long j11) {
        Parcel parcelH = h();
        zzbn.b(parcelH, zzddVar);
        zzbn.b(parcelH, bundle);
        parcelH.writeLong(j11);
        j(parcelH, 53);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void onActivityDestroyedByScionActivityInfo(zzdd zzddVar, long j11) {
        Parcel parcelH = h();
        zzbn.b(parcelH, zzddVar);
        parcelH.writeLong(j11);
        j(parcelH, 54);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void onActivityPausedByScionActivityInfo(zzdd zzddVar, long j11) {
        Parcel parcelH = h();
        zzbn.b(parcelH, zzddVar);
        parcelH.writeLong(j11);
        j(parcelH, 55);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void onActivityResumedByScionActivityInfo(zzdd zzddVar, long j11) {
        Parcel parcelH = h();
        zzbn.b(parcelH, zzddVar);
        parcelH.writeLong(j11);
        j(parcelH, 56);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void onActivitySaveInstanceStateByScionActivityInfo(zzdd zzddVar, zzcs zzcsVar, long j11) {
        Parcel parcelH = h();
        zzbn.b(parcelH, zzddVar);
        zzbn.c(parcelH, zzcsVar);
        parcelH.writeLong(j11);
        j(parcelH, 57);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void onActivityStartedByScionActivityInfo(zzdd zzddVar, long j11) {
        Parcel parcelH = h();
        zzbn.b(parcelH, zzddVar);
        parcelH.writeLong(j11);
        j(parcelH, 51);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void onActivityStoppedByScionActivityInfo(zzdd zzddVar, long j11) {
        Parcel parcelH = h();
        zzbn.b(parcelH, zzddVar);
        parcelH.writeLong(j11);
        j(parcelH, 52);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void performAction(Bundle bundle, zzcs zzcsVar, long j11) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void registerOnMeasurementEventListener(zzcy zzcyVar) {
        Parcel parcelH = h();
        zzbn.c(parcelH, zzcyVar);
        j(parcelH, 35);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void resetAnalyticsData(long j11) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void resetAnalyticsDataWithElapsedTime(long j11, long j12) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void retrieveAndUploadBatches(zzcv zzcvVar) {
        Parcel parcelH = h();
        zzbn.c(parcelH, zzcvVar);
        j(parcelH, 58);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setConditionalUserProperty(Bundle bundle, long j11) {
        Parcel parcelH = h();
        zzbn.b(parcelH, bundle);
        parcelH.writeLong(j11);
        j(parcelH, 8);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setConsentThirdParty(Bundle bundle, long j11) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setCurrentScreenByScionActivityInfo(zzdd zzddVar, String str, String str2, long j11) {
        Parcel parcelH = h();
        zzbn.b(parcelH, zzddVar);
        parcelH.writeString(str);
        parcelH.writeString(str2);
        parcelH.writeLong(j11);
        j(parcelH, 50);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setDataCollectionEnabled(boolean z11) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel parcelH = h();
        zzbn.b(parcelH, bundle);
        j(parcelH, 42);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setEventInterceptor(zzcy zzcyVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setMeasurementEnabled(boolean z11, long j11) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setSessionTimeoutDuration(long j11) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setSgtmDebugInfo(Intent intent) {
        Parcel parcelH = h();
        zzbn.b(parcelH, intent);
        j(parcelH, 48);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setUserId(String str, long j11) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        parcelH.writeLong(j11);
        j(parcelH, 7);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z11, long j11) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        parcelH.writeString(str2);
        zzbn.c(parcelH, iObjectWrapper);
        parcelH.writeInt(z11 ? 1 : 0);
        parcelH.writeLong(j11);
        j(parcelH, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void unregisterOnMeasurementEventListener(zzcy zzcyVar) {
        throw null;
    }
}
