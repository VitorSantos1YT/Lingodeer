package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzez {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zzez f12369d = new zzez(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzgy f12370a = new zzgy();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12372c;

    private zzez() {
    }

    public static boolean d(Map.Entry entry) {
        ((zzey) entry.getKey()).zzc();
        throw null;
    }

    public static final int e(Map.Entry entry) {
        zzey zzeyVar = (zzey) entry.getKey();
        entry.getValue();
        zzeyVar.zzc();
        throw null;
    }

    public final Iterator a() {
        zzgy zzgyVar = this.f12370a;
        if (zzgyVar.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.f12372c ? new zzft(((zzhb) zzgyVar.entrySet()).iterator()) : ((zzhb) zzgyVar.entrySet()).iterator();
    }

    public final void b() {
        if (this.f12371b) {
            return;
        }
        zzgy zzgyVar = this.f12370a;
        int i11 = zzgyVar.f12444b;
        for (int i12 = 0; i12 < i11; i12++) {
            Object obj = ((zzgz) zzgyVar.d(i12)).f12431b;
            if (obj instanceof zzfi) {
                ((zzfi) obj).k();
            }
        }
        Iterator it = zzgyVar.b().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof zzfi) {
                ((zzfi) value).k();
            }
        }
        zzgyVar.a();
        this.f12371b = true;
    }

    public final boolean c() {
        zzgy zzgyVar = this.f12370a;
        if (zzgyVar.f12444b > 0) {
            d(zzgyVar.d(0));
            throw null;
        }
        Iterator it = zzgyVar.b().iterator();
        if (!it.hasNext()) {
            return true;
        }
        d((Map.Entry) it.next());
        throw null;
    }

    public final Object clone() {
        zzez zzezVar = new zzez();
        zzgy zzgyVar = this.f12370a;
        if (zzgyVar.f12444b > 0) {
            ((zzey) ((zzgz) zzgyVar.d(0)).f12430a).zze();
            throw null;
        }
        Iterator it = zzgyVar.b().iterator();
        if (!it.hasNext()) {
            zzezVar.f12372c = this.f12372c;
            return zzezVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        zzey zzeyVar = (zzey) entry.getKey();
        entry.getValue();
        zzeyVar.zze();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzez) {
            return this.f12370a.equals(((zzez) obj).f12370a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12370a.hashCode();
    }

    public zzez(int i11) {
        b();
        b();
    }
}
