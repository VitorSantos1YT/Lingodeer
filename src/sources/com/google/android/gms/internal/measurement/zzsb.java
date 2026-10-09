package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzsb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri.Builder f11946a = new Uri.Builder().scheme("file").authority(BuildConfig.VERSION_NAME).path("/");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImmutableList.Builder f11947b;

    private zzsb() {
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f16771b;
        this.f11947b = new ImmutableList.Builder();
    }

    public zzsb(int i11) {
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f16771b;
        this.f11947b = new ImmutableList.Builder();
    }
}
