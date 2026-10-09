package com.google.android.gms.common.api.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class NonGmsServiceBrokerClient implements Api.Client, ServiceConnection {
    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean c() {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final Set d() {
        return Collections.EMPTY_SET;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void f(String str) {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean g() {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final String h() {
        Preconditions.g(null);
        throw null;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void i(BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void j() {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean l() {
        return false;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final int m() {
        return 0;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final Feature[] n() {
        return new Feature[0];
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final String o() {
        return null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        throw null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        throw null;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean p() {
        return false;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void k(BaseGmsClient.SignOutCallbacks signOutCallbacks) {
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void e(IAccountAccessor iAccountAccessor, Set set) {
    }
}
