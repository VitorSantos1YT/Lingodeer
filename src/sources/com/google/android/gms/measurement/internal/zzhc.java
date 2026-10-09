package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzhh f13000e;

    public zzhc(zzhh zzhhVar, String str, boolean z11) {
        this.f13000e = zzhhVar;
        Preconditions.d(str);
        this.f12996a = str;
        this.f12997b = z11;
    }

    public final boolean a() {
        if (!this.f12998c) {
            this.f12998c = true;
            this.f12999d = this.f13000e.k().getBoolean(this.f12996a, this.f12997b);
        }
        return this.f12999d;
    }

    public final void b(boolean z11) {
        SharedPreferences.Editor editorEdit = this.f13000e.k().edit();
        editorEdit.putBoolean(this.f12996a, z11);
        editorEdit.apply();
        this.f12999d = z11;
    }
}
