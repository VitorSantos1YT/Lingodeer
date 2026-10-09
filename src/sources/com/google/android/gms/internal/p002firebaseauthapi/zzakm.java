package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzako;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzakm<T extends zzako<T>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zzakm f10119d = new zzakm(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzams f10120a = new zzams();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10122c;

    private zzakm() {
    }

    public static int a(Map.Entry entry) {
        zzako zzakoVar = (zzako) entry.getKey();
        entry.getValue();
        zzakoVar.zzc();
        throw null;
    }

    public static boolean d(Map.Entry entry) {
        ((zzako) entry.getKey()).zzc();
        throw null;
    }

    public final void b(Map.Entry entry) {
        zzako zzakoVar = (zzako) entry.getKey();
        entry.getValue();
        zzakoVar.zze();
        throw null;
    }

    public final Iterator c() {
        zzams zzamsVar = this.f10120a;
        if (zzamsVar.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.f10122c ? new zzalc(((zzamz) zzamsVar.entrySet()).iterator()) : ((zzamz) zzamsVar.entrySet()).iterator();
    }

    public final Object clone() {
        zzakm zzakmVar = new zzakm();
        zzams zzamsVar = this.f10120a;
        if (zzamsVar.f10197b > 0) {
            zzamx zzamxVar = (zzamx) zzamsVar.c(0);
            zzako zzakoVar = (zzako) zzamxVar.f10209a;
            Object obj = zzamxVar.f10210b;
            zzakoVar.zze();
            throw null;
        }
        Iterator it = zzamsVar.f().iterator();
        if (!it.hasNext()) {
            zzakmVar.f10122c = this.f10122c;
            return zzakmVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        zzako zzakoVar2 = (zzako) entry.getKey();
        entry.getValue();
        zzakoVar2.zze();
        throw null;
    }

    public final void e() {
        if (this.f10121b) {
            return;
        }
        zzams zzamsVar = this.f10120a;
        int i11 = zzamsVar.f10197b;
        for (int i12 = 0; i12 < i11; i12++) {
            Object obj = ((zzamx) zzamsVar.c(i12)).f10210b;
            if (obj instanceof zzaku) {
                ((zzaku) obj).s();
            }
        }
        Iterator it = zzamsVar.f().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof zzaku) {
                ((zzaku) value).s();
            }
        }
        zzamsVar.d();
        this.f10121b = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzakm) {
            return this.f10120a.equals(((zzakm) obj).f10120a);
        }
        return false;
    }

    public final boolean f() {
        zzams zzamsVar = this.f10120a;
        if (zzamsVar.f10197b > 0) {
            d(zzamsVar.c(0));
            throw null;
        }
        Iterator it = zzamsVar.f().iterator();
        if (!it.hasNext()) {
            return true;
        }
        d((Map.Entry) it.next());
        throw null;
    }

    public final int hashCode() {
        return this.f10120a.hashCode();
    }

    public zzakm(int i11) {
        e();
        e();
    }
}
