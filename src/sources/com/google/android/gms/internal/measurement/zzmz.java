package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.hash.Hashing;
import com.google.common.io.BaseEncoding;
import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzmz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseEncoding f11752a = BaseEncoding.f17417b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Supplier f11753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Supplier f11754c;

    public zzmz(final zzacr zzacrVar, final String str) {
        this.f11753b = Suppliers.a(new Supplier() { // from class: com.google.android.gms.internal.measurement.zzmy
            @Override // com.google.common.base.Supplier
            public final Object get() {
                BaseEncoding baseEncoding = this.f11750a.f11752a;
                byte[] bArrM = zzacrVar.m();
                baseEncoding.getClass();
                return baseEncoding.c(bArrM, bArrM.length);
            }
        });
        this.f11754c = Suppliers.a(new Supplier() { // from class: com.google.android.gms.internal.measurement.zzmx
            @Override // com.google.common.base.Supplier
            public final Object get() {
                byte[] bArrA = Hashing.a().a().a(str.getBytes()).b((byte) 0).a(BuildConfig.VERSION_NAME.getBytes()).c().a();
                BaseEncoding baseEncoding = this.f11748a.f11752a;
                baseEncoding.getClass();
                return baseEncoding.c(bArrA, bArrA.length);
            }
        });
    }

    public final File a() {
        String str = (String) this.f11753b.get();
        String str2 = (String) this.f11754c.get();
        return new File(e.p(new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length() + 3), str, "/", str2, ".pb"));
    }
}
