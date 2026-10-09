package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zap extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f8846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f8847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.internal.base.zao f8848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final GoogleApiAvailability f8849d;

    public zap(LifecycleFragment lifecycleFragment, GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment);
        this.f8847b = new AtomicReference(null);
        this.f8848c = new com.google.android.gms.internal.base.zao(Looper.getMainLooper());
        this.f8849d = googleApiAvailability;
    }

    public abstract void a(ConnectionResult connectionResult, int i11);

    public abstract void b();

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onActivityResult(int i11, int i12, Intent intent) {
        AtomicReference atomicReference = this.f8847b;
        zam zamVar = (zam) atomicReference.get();
        if (i11 != 1) {
            if (i11 == 2) {
                int iC = this.f8849d.c(getActivity(), GoogleApiAvailabilityLight.f8645a);
                if (iC == 0) {
                    atomicReference.set(null);
                    b();
                    return;
                } else {
                    if (zamVar == null) {
                        return;
                    }
                    if (zamVar.f8841b.f8631b == 18 && iC == 18) {
                        return;
                    }
                }
            }
        } else if (i12 == -1) {
            atomicReference.set(null);
            b();
            return;
        } else if (i12 == 0) {
            if (zamVar != null) {
                ConnectionResult connectionResult = new ConnectionResult(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, zamVar.f8841b.toString());
                int i13 = zamVar.f8840a;
                atomicReference.set(null);
                a(connectionResult, i13);
                return;
            }
            return;
        }
        if (zamVar != null) {
            ConnectionResult connectionResult2 = zamVar.f8841b;
            int i14 = zamVar.f8840a;
            atomicReference.set(null);
            a(connectionResult2, i14);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        ConnectionResult connectionResult = new ConnectionResult(13, null, null);
        AtomicReference atomicReference = this.f8847b;
        zam zamVar = (zam) atomicReference.get();
        int i11 = zamVar == null ? -1 : zamVar.f8840a;
        atomicReference.set(null);
        a(connectionResult, i11);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f8847b.set(bundle.getBoolean("resolving_error", false) ? new zam(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution"), null), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        zam zamVar = (zam) this.f8847b.get();
        if (zamVar == null) {
            return;
        }
        ConnectionResult connectionResult = zamVar.f8841b;
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", zamVar.f8840a);
        bundle.putInt("failed_status", connectionResult.f8631b);
        bundle.putParcelable("failed_resolution", connectionResult.f8632c);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStart() {
        super.onStart();
        this.f8846a = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStop() {
        this.f8846a = false;
    }
}
