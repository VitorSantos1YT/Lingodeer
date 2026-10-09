package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzf f11485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zzg f11486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzab f11487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzz f11488d;

    public zzc() {
        zzf zzfVar = new zzf();
        this.f11485a = zzfVar;
        this.f11486b = zzfVar.f11592b.c();
        this.f11487c = new zzab();
        this.f11488d = new zzz();
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.measurement.zzb
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzv(this.f11464a.f11488d);
            }
        };
        zzj zzjVar = zzfVar.f11594d;
        zzjVar.f11614a.put("internal.registerCallback", callable);
        zzjVar.f11614a.put("internal.eventLogger", new Callable() { // from class: com.google.android.gms.internal.measurement.zza
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzk(this.f11123a.f11487c);
            }
        });
    }

    public final boolean a(zzaa zzaaVar) throws zzd {
        zzab zzabVar = this.f11487c;
        try {
            zzabVar.f11163a = zzaaVar;
            zzabVar.f11164b = zzaaVar.clone();
            zzabVar.f11165c.clear();
            this.f11485a.f11593c.e("runtime.counter", new zzah(Double.valueOf(0.0d)));
            this.f11488d.a(this.f11486b.c(), zzabVar);
            return (zzabVar.f11164b.equals(zzabVar.f11163a) && zzabVar.f11165c.isEmpty()) ? false : true;
        } catch (Throwable th2) {
            throw new zzd(th2);
        }
    }

    public final void b(zzja zzjaVar) throws zzd {
        zzai zzaiVar;
        try {
            zzf zzfVar = this.f11485a;
            this.f11486b = zzfVar.f11592b.c();
            if (zzfVar.a(this.f11486b, (zzje[]) zzjaVar.y().toArray(new zzje[0])) instanceof zzag) {
                throw new IllegalStateException("Program loading failed");
            }
            for (zziy zziyVar : zzjaVar.z().y()) {
                List listZ = zziyVar.z();
                String strY = zziyVar.y();
                Iterator it = listZ.iterator();
                while (it.hasNext()) {
                    zzao zzaoVarA = zzfVar.a(this.f11486b, (zzje) it.next());
                    if (!(zzaoVarA instanceof zzal)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    zzg zzgVar = this.f11486b;
                    if (zzgVar.d(strY)) {
                        zzao zzaoVarG = zzgVar.g(strY);
                        if (!(zzaoVarG instanceof zzai)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(strY)));
                        }
                        zzaiVar = (zzai) zzaoVarG;
                    } else {
                        zzaiVar = null;
                    }
                    if (zzaiVar == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(strY)));
                    }
                    zzaiVar.a(this.f11486b, Collections.singletonList(zzaoVarA));
                }
            }
        } catch (Throwable th2) {
            throw new zzd(th2);
        }
    }
}
