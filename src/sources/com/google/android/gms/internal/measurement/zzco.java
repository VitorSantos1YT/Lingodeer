package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.api.Service;
import com.google.protobuf.DescriptorProtos;
import com.stkouyu.util.httputil.Consts;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzco extends zzbm implements zzcp {
    public zzco() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static zzcp asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof zzcp ? (zzcp) iInterfaceQueryLocalInterface : new zzcn(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean g(int i11, Parcel parcel, Parcel parcel2) {
        boolean z11;
        zzcs zzcqVar = null;
        zzcv zzctVar = null;
        zzcs zzcqVar2 = null;
        zzcs zzcqVar3 = null;
        zzcs zzcqVar4 = null;
        zzcs zzcqVar5 = null;
        zzcy zzcwVar = null;
        zzcy zzcwVar2 = null;
        zzcy zzcwVar3 = null;
        zzcs zzcqVar6 = null;
        zzcs zzcqVar7 = null;
        zzcs zzcqVar8 = null;
        zzcs zzcqVar9 = null;
        zzcs zzcqVar10 = null;
        zzcs zzcqVar11 = null;
        zzda zzczVar = null;
        zzcs zzcqVar12 = null;
        zzcs zzcqVar13 = null;
        zzcs zzcqVar14 = null;
        zzcs zzcqVar15 = null;
        zzcs zzcqVar16 = null;
        switch (i11) {
            case 1:
                IObjectWrapper iObjectWrapperH = IObjectWrapper.Stub.h(parcel.readStrongBinder());
                zzdb zzdbVar = (zzdb) zzbn.a(parcel, zzdb.CREATOR);
                long j11 = parcel.readLong();
                zzbn.d(parcel);
                initialize(iObjectWrapperH, zzdbVar, j11);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) zzbn.a(parcel, Bundle.CREATOR);
                boolean z12 = parcel.readInt() != 0;
                boolean z13 = parcel.readInt() != 0;
                long j12 = parcel.readLong();
                zzbn.d(parcel);
                logEvent(string, string2, bundle, z12, z13, j12);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) zzbn.a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcqVar = iInterfaceQueryLocalInterface instanceof zzcs ? (zzcs) iInterfaceQueryLocalInterface : new zzcq(strongBinder);
                }
                zzcs zzcsVar = zzcqVar;
                long j13 = parcel.readLong();
                zzbn.d(parcel);
                logEventAndBundle(string3, string4, bundle2, zzcsVar, j13);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                IObjectWrapper iObjectWrapperH2 = IObjectWrapper.Stub.h(parcel.readStrongBinder());
                ClassLoader classLoader = zzbn.f11473a;
                z11 = parcel.readInt() != 0;
                long j14 = parcel.readLong();
                zzbn.d(parcel);
                setUserProperty(string5, string6, iObjectWrapperH2, z11, j14);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                ClassLoader classLoader2 = zzbn.f11473a;
                z11 = parcel.readInt() != 0;
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcqVar16 = iInterfaceQueryLocalInterface2 instanceof zzcs ? (zzcs) iInterfaceQueryLocalInterface2 : new zzcq(strongBinder2);
                }
                zzbn.d(parcel);
                getUserProperties(string7, string8, z11, zzcqVar16);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcqVar15 = iInterfaceQueryLocalInterface3 instanceof zzcs ? (zzcs) iInterfaceQueryLocalInterface3 : new zzcq(strongBinder3);
                }
                zzbn.d(parcel);
                getMaxUserProperties(string9, zzcqVar15);
                break;
            case 7:
                String string10 = parcel.readString();
                long j15 = parcel.readLong();
                zzbn.d(parcel);
                setUserId(string10, j15);
                break;
            case 8:
                Bundle bundle3 = (Bundle) zzbn.a(parcel, Bundle.CREATOR);
                long j16 = parcel.readLong();
                zzbn.d(parcel);
                setConditionalUserProperty(bundle3, j16);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) zzbn.a(parcel, Bundle.CREATOR);
                zzbn.d(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcqVar14 = iInterfaceQueryLocalInterface4 instanceof zzcs ? (zzcs) iInterfaceQueryLocalInterface4 : new zzcq(strongBinder4);
                }
                zzbn.d(parcel);
                getConditionalUserProperties(string13, string14, zzcqVar14);
                break;
            case 11:
                ClassLoader classLoader3 = zzbn.f11473a;
                z11 = parcel.readInt() != 0;
                long j17 = parcel.readLong();
                zzbn.d(parcel);
                setMeasurementEnabled(z11, j17);
                break;
            case 12:
                long j18 = parcel.readLong();
                zzbn.d(parcel);
                resetAnalyticsData(j18);
                break;
            case 13:
                long j19 = parcel.readLong();
                zzbn.d(parcel);
                setMinimumSessionDuration(j19);
                break;
            case 14:
                long j21 = parcel.readLong();
                zzbn.d(parcel);
                setSessionTimeoutDuration(j21);
                break;
            case 15:
                IObjectWrapper iObjectWrapperH3 = IObjectWrapper.Stub.h(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j22 = parcel.readLong();
                zzbn.d(parcel);
                setCurrentScreen(iObjectWrapperH3, string15, string16, j22);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcqVar13 = iInterfaceQueryLocalInterface5 instanceof zzcs ? (zzcs) iInterfaceQueryLocalInterface5 : new zzcq(strongBinder5);
                }
                zzbn.d(parcel);
                getCurrentScreenName(zzcqVar13);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcqVar12 = iInterfaceQueryLocalInterface6 instanceof zzcs ? (zzcs) iInterfaceQueryLocalInterface6 : new zzcq(strongBinder6);
                }
                zzbn.d(parcel);
                getCurrentScreenClass(zzcqVar12);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    zzczVar = iInterfaceQueryLocalInterface7 instanceof zzda ? (zzda) iInterfaceQueryLocalInterface7 : new zzcz(strongBinder7, "com.google.android.gms.measurement.api.internal.IStringProvider");
                }
                zzbn.d(parcel);
                setInstanceIdProvider(zzczVar);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcqVar11 = iInterfaceQueryLocalInterface8 instanceof zzcs ? (zzcs) iInterfaceQueryLocalInterface8 : new zzcq(strongBinder8);
                }
                zzbn.d(parcel);
                getCachedAppInstanceId(zzcqVar11);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcqVar10 = iInterfaceQueryLocalInterface9 instanceof zzcs ? (zzcs) iInterfaceQueryLocalInterface9 : new zzcq(strongBinder9);
                }
                zzbn.d(parcel);
                getAppInstanceId(zzcqVar10);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcqVar9 = iInterfaceQueryLocalInterface10 instanceof zzcs ? (zzcs) iInterfaceQueryLocalInterface10 : new zzcq(strongBinder10);
                }
                zzbn.d(parcel);
                getGmpAppId(zzcqVar9);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcqVar8 = iInterfaceQueryLocalInterface11 instanceof zzcs ? (zzcs) iInterfaceQueryLocalInterface11 : new zzcq(strongBinder11);
                }
                zzbn.d(parcel);
                generateEventId(zzcqVar8);
                break;
            case 23:
                String string17 = parcel.readString();
                long j23 = parcel.readLong();
                zzbn.d(parcel);
                beginAdUnitExposure(string17, j23);
                break;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                String string18 = parcel.readString();
                long j24 = parcel.readLong();
                zzbn.d(parcel);
                endAdUnitExposure(string18, j24);
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                IObjectWrapper iObjectWrapperH4 = IObjectWrapper.Stub.h(parcel.readStrongBinder());
                long j25 = parcel.readLong();
                zzbn.d(parcel);
                onActivityStarted(iObjectWrapperH4, j25);
                break;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                IObjectWrapper iObjectWrapperH5 = IObjectWrapper.Stub.h(parcel.readStrongBinder());
                long j26 = parcel.readLong();
                zzbn.d(parcel);
                onActivityStopped(iObjectWrapperH5, j26);
                break;
            case 27:
                IObjectWrapper iObjectWrapperH6 = IObjectWrapper.Stub.h(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) zzbn.a(parcel, Bundle.CREATOR);
                long j27 = parcel.readLong();
                zzbn.d(parcel);
                onActivityCreated(iObjectWrapperH6, bundle5, j27);
                break;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                IObjectWrapper iObjectWrapperH7 = IObjectWrapper.Stub.h(parcel.readStrongBinder());
                long j28 = parcel.readLong();
                zzbn.d(parcel);
                onActivityDestroyed(iObjectWrapperH7, j28);
                break;
            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                IObjectWrapper iObjectWrapperH8 = IObjectWrapper.Stub.h(parcel.readStrongBinder());
                long j29 = parcel.readLong();
                zzbn.d(parcel);
                onActivityPaused(iObjectWrapperH8, j29);
                break;
            case 30:
                IObjectWrapper iObjectWrapperH9 = IObjectWrapper.Stub.h(parcel.readStrongBinder());
                long j30 = parcel.readLong();
                zzbn.d(parcel);
                onActivityResumed(iObjectWrapperH9, j30);
                break;
            case 31:
                IObjectWrapper iObjectWrapperH10 = IObjectWrapper.Stub.h(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcqVar7 = iInterfaceQueryLocalInterface12 instanceof zzcs ? (zzcs) iInterfaceQueryLocalInterface12 : new zzcq(strongBinder12);
                }
                long j31 = parcel.readLong();
                zzbn.d(parcel);
                onActivitySaveInstanceState(iObjectWrapperH10, zzcqVar7, j31);
                break;
            case Consts.SP /* 32 */:
                Bundle bundle6 = (Bundle) zzbn.a(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcqVar6 = iInterfaceQueryLocalInterface13 instanceof zzcs ? (zzcs) iInterfaceQueryLocalInterface13 : new zzcq(strongBinder13);
                }
                long j32 = parcel.readLong();
                zzbn.d(parcel);
                performAction(bundle6, zzcqVar6, j32);
                break;
            case 33:
                int i12 = parcel.readInt();
                String string19 = parcel.readString();
                IObjectWrapper iObjectWrapperH11 = IObjectWrapper.Stub.h(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperH12 = IObjectWrapper.Stub.h(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperH13 = IObjectWrapper.Stub.h(parcel.readStrongBinder());
                zzbn.d(parcel);
                logHealthData(i12, string19, iObjectWrapperH11, iObjectWrapperH12, iObjectWrapperH13);
                break;
            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzcwVar3 = iInterfaceQueryLocalInterface14 instanceof zzcy ? (zzcy) iInterfaceQueryLocalInterface14 : new zzcw(strongBinder14);
                }
                zzbn.d(parcel);
                setEventInterceptor(zzcwVar3);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzcwVar2 = iInterfaceQueryLocalInterface15 instanceof zzcy ? (zzcy) iInterfaceQueryLocalInterface15 : new zzcw(strongBinder15);
                }
                zzbn.d(parcel);
                registerOnMeasurementEventListener(zzcwVar2);
                break;
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzcwVar = iInterfaceQueryLocalInterface16 instanceof zzcy ? (zzcy) iInterfaceQueryLocalInterface16 : new zzcw(strongBinder16);
                }
                zzbn.d(parcel);
                unregisterOnMeasurementEventListener(zzcwVar);
                break;
            case 37:
                HashMap hashMap = parcel.readHashMap(zzbn.f11473a);
                zzbn.d(parcel);
                initForTests(hashMap);
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcqVar5 = iInterfaceQueryLocalInterface17 instanceof zzcs ? (zzcs) iInterfaceQueryLocalInterface17 : new zzcq(strongBinder17);
                }
                int i13 = parcel.readInt();
                zzbn.d(parcel);
                getTestFlag(zzcqVar5, i13);
                break;
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                ClassLoader classLoader4 = zzbn.f11473a;
                z11 = parcel.readInt() != 0;
                zzbn.d(parcel);
                setDataCollectionEnabled(z11);
                break;
            case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcqVar4 = iInterfaceQueryLocalInterface18 instanceof zzcs ? (zzcs) iInterfaceQueryLocalInterface18 : new zzcq(strongBinder18);
                }
                zzbn.d(parcel);
                isDataCollectionEnabled(zzcqVar4);
                break;
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
            case 47:
            case 49:
            default:
                return false;
            case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                Bundle bundle7 = (Bundle) zzbn.a(parcel, Bundle.CREATOR);
                zzbn.d(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j33 = parcel.readLong();
                zzbn.d(parcel);
                clearMeasurementEnabled(j33);
                break;
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                Bundle bundle8 = (Bundle) zzbn.a(parcel, Bundle.CREATOR);
                long j34 = parcel.readLong();
                zzbn.d(parcel);
                setConsent(bundle8, j34);
                break;
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                Bundle bundle9 = (Bundle) zzbn.a(parcel, Bundle.CREATOR);
                long j35 = parcel.readLong();
                zzbn.d(parcel);
                setConsentThirdParty(bundle9, j35);
                break;
            case 46:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcqVar3 = iInterfaceQueryLocalInterface19 instanceof zzcs ? (zzcs) iInterfaceQueryLocalInterface19 : new zzcq(strongBinder19);
                }
                zzbn.d(parcel);
                getSessionId(zzcqVar3);
                break;
            case 48:
                Intent intent = (Intent) zzbn.a(parcel, Intent.CREATOR);
                zzbn.d(parcel);
                setSgtmDebugInfo(intent);
                break;
            case 50:
                zzdd zzddVar = (zzdd) zzbn.a(parcel, zzdd.CREATOR);
                String string20 = parcel.readString();
                String string21 = parcel.readString();
                long j36 = parcel.readLong();
                zzbn.d(parcel);
                setCurrentScreenByScionActivityInfo(zzddVar, string20, string21, j36);
                break;
            case 51:
                zzdd zzddVar2 = (zzdd) zzbn.a(parcel, zzdd.CREATOR);
                long j37 = parcel.readLong();
                zzbn.d(parcel);
                onActivityStartedByScionActivityInfo(zzddVar2, j37);
                break;
            case 52:
                zzdd zzddVar3 = (zzdd) zzbn.a(parcel, zzdd.CREATOR);
                long j38 = parcel.readLong();
                zzbn.d(parcel);
                onActivityStoppedByScionActivityInfo(zzddVar3, j38);
                break;
            case 53:
                zzdd zzddVar4 = (zzdd) zzbn.a(parcel, zzdd.CREATOR);
                Bundle bundle10 = (Bundle) zzbn.a(parcel, Bundle.CREATOR);
                long j39 = parcel.readLong();
                zzbn.d(parcel);
                onActivityCreatedByScionActivityInfo(zzddVar4, bundle10, j39);
                break;
            case 54:
                zzdd zzddVar5 = (zzdd) zzbn.a(parcel, zzdd.CREATOR);
                long j40 = parcel.readLong();
                zzbn.d(parcel);
                onActivityDestroyedByScionActivityInfo(zzddVar5, j40);
                break;
            case 55:
                zzdd zzddVar6 = (zzdd) zzbn.a(parcel, zzdd.CREATOR);
                long j41 = parcel.readLong();
                zzbn.d(parcel);
                onActivityPausedByScionActivityInfo(zzddVar6, j41);
                break;
            case 56:
                zzdd zzddVar7 = (zzdd) zzbn.a(parcel, zzdd.CREATOR);
                long j42 = parcel.readLong();
                zzbn.d(parcel);
                onActivityResumedByScionActivityInfo(zzddVar7, j42);
                break;
            case 57:
                zzdd zzddVar8 = (zzdd) zzbn.a(parcel, zzdd.CREATOR);
                IBinder strongBinder20 = parcel.readStrongBinder();
                if (strongBinder20 != null) {
                    IInterface iInterfaceQueryLocalInterface20 = strongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcqVar2 = iInterfaceQueryLocalInterface20 instanceof zzcs ? (zzcs) iInterfaceQueryLocalInterface20 : new zzcq(strongBinder20);
                }
                long j43 = parcel.readLong();
                zzbn.d(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(zzddVar8, zzcqVar2, j43);
                break;
            case 58:
                IBinder strongBinder21 = parcel.readStrongBinder();
                if (strongBinder21 != null) {
                    IInterface iInterfaceQueryLocalInterface21 = strongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    zzctVar = iInterfaceQueryLocalInterface21 instanceof zzcv ? (zzcv) iInterfaceQueryLocalInterface21 : new zzct(strongBinder21, "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                }
                zzbn.d(parcel);
                retrieveAndUploadBatches(zzctVar);
                break;
            case 59:
                String string22 = parcel.readString();
                String string23 = parcel.readString();
                Bundle bundle11 = (Bundle) zzbn.a(parcel, Bundle.CREATOR);
                boolean z14 = parcel.readInt() != 0;
                boolean z15 = parcel.readInt() != 0;
                long j44 = parcel.readLong();
                long j45 = parcel.readLong();
                zzbn.d(parcel);
                logEventWithElapsedTime(string22, string23, bundle11, z14, z15, j44, j45);
                break;
            case 60:
                IObjectWrapper iObjectWrapperH14 = IObjectWrapper.Stub.h(parcel.readStrongBinder());
                zzdb zzdbVar2 = (zzdb) zzbn.a(parcel, zzdb.CREATOR);
                long j46 = parcel.readLong();
                long j47 = parcel.readLong();
                zzbn.d(parcel);
                initializeWithElapsedTime(iObjectWrapperH14, zzdbVar2, j46, j47);
                break;
            case 61:
                long j48 = parcel.readLong();
                long j49 = parcel.readLong();
                zzbn.d(parcel);
                resetAnalyticsDataWithElapsedTime(j48, j49);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
