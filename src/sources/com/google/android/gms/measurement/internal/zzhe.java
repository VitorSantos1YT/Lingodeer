package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f13008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzhh f13009e;

    public zzhe(zzhh zzhhVar, String str, long j11) {
        Objects.requireNonNull(zzhhVar);
        this.f13009e = zzhhVar;
        Preconditions.d(str);
        this.f13005a = str;
        this.f13006b = j11;
    }

    public final long a() {
        if (!this.f13007c) {
            this.f13007c = true;
            this.f13008d = this.f13009e.k().getLong(this.f13005a, this.f13006b);
        }
        return this.f13008d;
    }

    public final void b(long j11) {
        SharedPreferences.Editor editorEdit = this.f13009e.k().edit();
        editorEdit.putLong(this.f13005a, j11);
        editorEdit.apply();
        this.f13008d = j11;
    }
}
