package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f13017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzhh f13018d;

    public zzhg(zzhh zzhhVar, String str) {
        this.f13018d = zzhhVar;
        Preconditions.d(str);
        this.f13015a = str;
    }

    public final String a() {
        if (!this.f13016b) {
            this.f13016b = true;
            this.f13017c = this.f13018d.k().getString(this.f13015a, null);
        }
        return this.f13017c;
    }

    public final void b(String str) {
        SharedPreferences.Editor editorEdit = this.f13018d.k().edit();
        editorEdit.putString(this.f13015a, str);
        editorEdit.apply();
        this.f13017c = str;
    }
}
