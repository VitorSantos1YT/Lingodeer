package com.google.android.gms.internal.location;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzav {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzbg f11069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f11070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f11071c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f11072d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f11073e = new HashMap();

    public zzav(Context context, zzbg zzbgVar) {
        this.f11070b = context;
        this.f11069a = zzbgVar;
    }

    public final void a() {
        synchronized (this.f11071c) {
            try {
                for (zzau zzauVar : this.f11071c.values()) {
                    if (zzauVar != null) {
                        ((zzh) this.f11069a).a().B(new zzbc(2, null, zzauVar, null, null, null));
                    }
                }
                this.f11071c.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f11073e) {
            try {
                for (zzar zzarVar : this.f11073e.values()) {
                    if (zzarVar != null) {
                        ((zzh) this.f11069a).a().B(new zzbc(2, null, null, null, zzarVar, null));
                    }
                }
                this.f11073e.clear();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        synchronized (this.f11072d) {
            try {
                for (zzas zzasVar : this.f11072d.values()) {
                    if (zzasVar != null) {
                        ((zzh) this.f11069a).a().n0(new zzl(2, null, zzasVar, null));
                    }
                }
                this.f11072d.clear();
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
