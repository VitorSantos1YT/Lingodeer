package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.android.material.datepicker.d;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzte extends zztr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f11970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzafc f11971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Optional f11972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImmutableList f11973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zzuj f11974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f11975f;

    public /* synthetic */ zzte(Uri uri, zzafc zzafcVar, Optional optional, ImmutableList immutableList, zzuj zzujVar, boolean z11) {
        this.f11970a = uri;
        this.f11971b = zzafcVar;
        this.f11972c = optional;
        this.f11973d = immutableList;
        this.f11974e = zzujVar;
        this.f11975f = z11;
    }

    @Override // com.google.android.gms.internal.measurement.zztr
    public final Uri a() {
        return this.f11970a;
    }

    @Override // com.google.android.gms.internal.measurement.zztr
    public final zzafc b() {
        return this.f11971b;
    }

    @Override // com.google.android.gms.internal.measurement.zztr
    public final Optional c() {
        return this.f11972c;
    }

    @Override // com.google.android.gms.internal.measurement.zztr
    public final ImmutableList d() {
        return this.f11973d;
    }

    @Override // com.google.android.gms.internal.measurement.zztr
    public final zzuj e() {
        return this.f11974e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zztr)) {
            return false;
        }
        zztr zztrVar = (zztr) obj;
        return this.f11970a.equals(zztrVar.a()) && this.f11971b.equals(zztrVar.b()) && this.f11972c.equals(zztrVar.c()) && this.f11973d.equals(zztrVar.d()) && this.f11974e.equals(zztrVar.e()) && this.f11975f == zztrVar.f();
    }

    @Override // com.google.android.gms.internal.measurement.zztr
    public final boolean f() {
        return this.f11975f;
    }

    public final int hashCode() {
        return ((((((((((((this.f11970a.hashCode() ^ 1000003) * 1000003) ^ this.f11971b.hashCode()) * 1000003) ^ this.f11972c.hashCode()) * 1000003) ^ this.f11973d.hashCode()) * 1000003) ^ this.f11974e.hashCode()) * 1000003) ^ (true != this.f11975f ? 1237 : 1231)) * 1000003) ^ 1237;
    }

    public final String toString() {
        String string = this.f11970a.toString();
        int length = string.length();
        String string2 = this.f11971b.toString();
        int length2 = string2.length();
        String strValueOf = String.valueOf(this.f11972c);
        String strValueOf2 = String.valueOf(this.f11973d);
        String string3 = this.f11974e.toString();
        int length3 = strValueOf.length();
        int length4 = strValueOf2.length();
        int length5 = string3.length();
        boolean z11 = this.f11975f;
        StringBuilder sb2 = new StringBuilder(length + 34 + length2 + 10 + length3 + 13 + length4 + 16 + length5 + 32 + String.valueOf(z11).length() + 22);
        d.w(sb2, "ProtoDataStoreConfig{uri=", string, ", schema=", string2);
        d.w(sb2, ", handler=", strValueOf, ", migrations=", strValueOf2);
        sb2.append(", variantConfig=");
        sb2.append(string3);
        sb2.append(", useGeneratedExtensionRegistry=");
        sb2.append(z11);
        sb2.append(", enableTracing=false}");
        return sb2.toString();
    }
}
