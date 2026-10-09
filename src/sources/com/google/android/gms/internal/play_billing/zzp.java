package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f12486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zzt f12487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zzv f12488c = zzv.h();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12489d;

    public final void a(Object obj) {
        this.f12489d = true;
        zzt zztVar = this.f12487b;
        if (zztVar != null) {
            zzo zzoVar = zztVar.f12491b;
            zzoVar.getClass();
            if (obj == null) {
                obj = zzo.f12482t;
            }
            if (zzo.f12481f.d(zzoVar, null, obj)) {
                zzo.b(zzoVar);
                this.f12486a = null;
                this.f12487b = null;
                this.f12488c = null;
            }
        }
    }

    public final void finalize() {
        zzv zzvVar;
        zzt zztVar = this.f12487b;
        if (zztVar != null) {
            zzo zzoVar = zztVar.f12491b;
            if (!zzoVar.isDone()) {
                if (zzo.f12481f.d(zzoVar, null, new zzg(new zzq("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.f12486a)))))) {
                    zzo.b(zzoVar);
                }
            }
        }
        if (this.f12489d || (zzvVar = this.f12488c) == null) {
            return;
        }
        zzvVar.g(null);
    }
}
