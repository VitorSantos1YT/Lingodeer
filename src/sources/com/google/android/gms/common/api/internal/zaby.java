package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zaby implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GoogleApiManager f8801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ApiKey f8803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f8805e;

    public zaby(GoogleApiManager googleApiManager, int i11, ApiKey apiKey, long j11, long j12) {
        this.f8801a = googleApiManager;
        this.f8802b = i11;
        this.f8803c = apiKey;
        this.f8804d = j11;
        this.f8805e = j12;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0031 A[RETURN] */
    public static ConnectionTelemetryConfiguration a(zabk zabkVar, BaseGmsClient baseGmsClient, int i11) {
        zzj zzjVar = baseGmsClient.Y;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzjVar == null ? null : zzjVar.f9025d;
        if (connectionTelemetryConfiguration != null && connectionTelemetryConfiguration.f8911b) {
            int[] iArr = connectionTelemetryConfiguration.f8913d;
            int i12 = 0;
            if (iArr == null) {
                int[] iArr2 = connectionTelemetryConfiguration.f8915f;
                if (iArr2 != null) {
                    while (i12 < iArr2.length) {
                        if (iArr2[i12] != i11) {
                            i12++;
                        }
                    }
                    if (zabkVar.N < connectionTelemetryConfiguration.f8914e) {
                        return connectionTelemetryConfiguration;
                    }
                } else if (zabkVar.N < connectionTelemetryConfiguration.f8914e) {
                    return connectionTelemetryConfiguration;
                }
            } else {
                while (i12 < iArr.length) {
                    if (iArr[i12] != i11) {
                        i12++;
                    } else if (zabkVar.N < connectionTelemetryConfiguration.f8914e) {
                        return connectionTelemetryConfiguration;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j11;
        long j12;
        GoogleApiManager googleApiManager = this.f8801a;
        if (googleApiManager.f()) {
            RootTelemetryConfiguration rootTelemetryConfiguration = RootTelemetryConfigManager.a().f8947a;
            if (rootTelemetryConfiguration == null || rootTelemetryConfiguration.f8949b) {
                zabk zabkVar = (zabk) googleApiManager.L.get(this.f8803c);
                if (zabkVar != null) {
                    Object obj = zabkVar.f8779b;
                    if (obj instanceof BaseGmsClient) {
                        BaseGmsClient baseGmsClient = (BaseGmsClient) obj;
                        long j13 = this.f8804d;
                        int i16 = 0;
                        boolean z11 = j13 > 0;
                        int i17 = baseGmsClient.S;
                        if (rootTelemetryConfiguration != null) {
                            z11 &= rootTelemetryConfiguration.f8950c;
                            i11 = rootTelemetryConfiguration.f8951d;
                            i13 = rootTelemetryConfiguration.f8952e;
                            i12 = rootTelemetryConfiguration.f8948a;
                            if (baseGmsClient.Y != null && !baseGmsClient.g()) {
                                ConnectionTelemetryConfiguration connectionTelemetryConfigurationA = a(zabkVar, baseGmsClient, this.f8802b);
                                if (connectionTelemetryConfigurationA == null) {
                                    return;
                                }
                                boolean z12 = connectionTelemetryConfigurationA.f8912c && j13 > 0;
                                i13 = connectionTelemetryConfigurationA.f8914e;
                                z11 = z12;
                            }
                        } else {
                            i11 = 5000;
                            i12 = 0;
                            i13 = 100;
                        }
                        int i18 = i11;
                        int iElapsedRealtime = -1;
                        if (task.isSuccessful()) {
                            i15 = 0;
                        } else if (task.isCanceled()) {
                            i16 = -1;
                            i15 = 100;
                        } else {
                            Exception exception = task.getException();
                            if (exception instanceof ApiException) {
                                Status status = ((ApiException) exception).getStatus();
                                i14 = status.f8706a;
                                ConnectionResult connectionResult = status.f8709d;
                                if (connectionResult != null) {
                                    i15 = i14;
                                    i16 = connectionResult.f8631b;
                                }
                            } else {
                                i14 = 101;
                            }
                            i15 = i14;
                            i16 = -1;
                        }
                        if (z11) {
                            long j14 = this.f8805e;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j14);
                            j12 = jCurrentTimeMillis;
                            j11 = j13;
                        } else {
                            j11 = 0;
                            j12 = 0;
                        }
                        zabz zabzVar = new zabz(new MethodInvocation(this.f8802b, i15, i16, j11, j12, null, null, i17, iElapsedRealtime), i12, i18, i13);
                        com.google.android.gms.internal.base.zao zaoVar = googleApiManager.P;
                        zaoVar.sendMessage(zaoVar.obtainMessage(18, zabzVar));
                    }
                }
            }
        }
    }
}
