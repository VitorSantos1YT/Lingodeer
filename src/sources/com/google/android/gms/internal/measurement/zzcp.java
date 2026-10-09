package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public interface zzcp extends IInterface {
    void beginAdUnitExposure(String str, long j11);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j11);

    void endAdUnitExposure(String str, long j11);

    void generateEventId(zzcs zzcsVar);

    void getAppInstanceId(zzcs zzcsVar);

    void getCachedAppInstanceId(zzcs zzcsVar);

    void getConditionalUserProperties(String str, String str2, zzcs zzcsVar);

    void getCurrentScreenClass(zzcs zzcsVar);

    void getCurrentScreenName(zzcs zzcsVar);

    void getGmpAppId(zzcs zzcsVar);

    void getMaxUserProperties(String str, zzcs zzcsVar);

    void getSessionId(zzcs zzcsVar);

    void getTestFlag(zzcs zzcsVar, int i11);

    void getUserProperties(String str, String str2, boolean z11, zzcs zzcsVar);

    void initForTests(Map map);

    void initialize(IObjectWrapper iObjectWrapper, zzdb zzdbVar, long j11);

    void initializeWithElapsedTime(IObjectWrapper iObjectWrapper, zzdb zzdbVar, long j11, long j12);

    void isDataCollectionEnabled(zzcs zzcsVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z11, boolean z12, long j11);

    void logEventAndBundle(String str, String str2, Bundle bundle, zzcs zzcsVar, long j11);

    void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z11, boolean z12, long j11, long j12);

    void logHealthData(int i11, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3);

    void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j11);

    void onActivityCreatedByScionActivityInfo(zzdd zzddVar, Bundle bundle, long j11);

    void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j11);

    void onActivityDestroyedByScionActivityInfo(zzdd zzddVar, long j11);

    void onActivityPaused(IObjectWrapper iObjectWrapper, long j11);

    void onActivityPausedByScionActivityInfo(zzdd zzddVar, long j11);

    void onActivityResumed(IObjectWrapper iObjectWrapper, long j11);

    void onActivityResumedByScionActivityInfo(zzdd zzddVar, long j11);

    void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzcs zzcsVar, long j11);

    void onActivitySaveInstanceStateByScionActivityInfo(zzdd zzddVar, zzcs zzcsVar, long j11);

    void onActivityStarted(IObjectWrapper iObjectWrapper, long j11);

    void onActivityStartedByScionActivityInfo(zzdd zzddVar, long j11);

    void onActivityStopped(IObjectWrapper iObjectWrapper, long j11);

    void onActivityStoppedByScionActivityInfo(zzdd zzddVar, long j11);

    void performAction(Bundle bundle, zzcs zzcsVar, long j11);

    void registerOnMeasurementEventListener(zzcy zzcyVar);

    void resetAnalyticsData(long j11);

    void resetAnalyticsDataWithElapsedTime(long j11, long j12);

    void retrieveAndUploadBatches(zzcv zzcvVar);

    void setConditionalUserProperty(Bundle bundle, long j11);

    void setConsent(Bundle bundle, long j11);

    void setConsentThirdParty(Bundle bundle, long j11);

    void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j11);

    void setCurrentScreenByScionActivityInfo(zzdd zzddVar, String str, String str2, long j11);

    void setDataCollectionEnabled(boolean z11);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(zzcy zzcyVar);

    void setInstanceIdProvider(zzda zzdaVar);

    void setMeasurementEnabled(boolean z11, long j11);

    void setMinimumSessionDuration(long j11);

    void setSessionTimeoutDuration(long j11);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j11);

    void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z11, long j11);

    void unregisterOnMeasurementEventListener(zzcy zzcyVar);
}
