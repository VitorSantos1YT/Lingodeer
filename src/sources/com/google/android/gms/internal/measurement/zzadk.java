package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzadk {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zzadk f11257d = new zzadk(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzafr f11258a = new zzafr();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11260c;

    private zzadk() {
    }

    public static void d(zzada zzadaVar, zzagm zzagmVar, int i11, Object obj) {
        if (zzagmVar == zzagm.zzj) {
            zzadaVar.f(i11, 3);
            ((zzafc) obj).i(zzadaVar);
            zzadaVar.f(i11, 4);
            return;
        }
        zzadaVar.f(i11, zzagmVar.b());
        zzagn zzagnVar = zzagn.zza;
        switch (zzagmVar.ordinal()) {
            case 0:
                zzadaVar.y(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                zzadaVar.w(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                zzadaVar.x(((Long) obj).longValue());
                break;
            case 3:
                zzadaVar.x(((Long) obj).longValue());
                break;
            case 4:
                zzadaVar.u(((Integer) obj).intValue());
                break;
            case 5:
                zzadaVar.y(((Long) obj).longValue());
                break;
            case 6:
                zzadaVar.w(((Integer) obj).intValue());
                break;
            case 7:
                zzadaVar.t(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof zzacr)) {
                    zzadaVar.z((String) obj);
                } else {
                    zzadaVar.o((zzacr) obj);
                }
                break;
            case 9:
                ((zzafc) obj).i(zzadaVar);
                break;
            case 10:
                zzadaVar.s((zzafc) obj);
                break;
            case 11:
                if (!(obj instanceof zzacr)) {
                    byte[] bArr = (byte[]) obj;
                    zzadaVar.p(bArr, bArr.length);
                } else {
                    zzadaVar.o((zzacr) obj);
                }
                break;
            case 12:
                zzadaVar.v(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof zzady)) {
                    zzadaVar.u(((Integer) obj).intValue());
                } else {
                    zzadaVar.u(((zzady) obj).zza());
                }
                break;
            case 14:
                zzadaVar.w(((Integer) obj).intValue());
                break;
            case 15:
                zzadaVar.y(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                zzadaVar.v((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                zzadaVar.x((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    public static int e(zzagm zzagmVar, int i11, Object obj) {
        int iB;
        int iB2;
        int iB3 = zzada.b(i11 << 3);
        if (zzagmVar == zzagm.zzj) {
            iB3 += iB3;
        }
        zzagm zzagmVar2 = zzagm.zza;
        zzagn zzagnVar = zzagn.zza;
        int iC = 4;
        switch (zzagmVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                boolean z11 = zzada.f11245b;
                iC = 8;
                return iB3 + iC;
            case 1:
                ((Float) obj).getClass();
                boolean z12 = zzada.f11245b;
                return iB3 + iC;
            case 2:
                iC = zzada.c(((Long) obj).longValue());
                return iB3 + iC;
            case 3:
                iC = zzada.c(((Long) obj).longValue());
                return iB3 + iC;
            case 4:
                iC = zzada.c(((Integer) obj).intValue());
                return iB3 + iC;
            case 5:
                ((Long) obj).getClass();
                boolean z13 = zzada.f11245b;
                iC = 8;
                return iB3 + iC;
            case 6:
                ((Integer) obj).getClass();
                boolean z14 = zzada.f11245b;
                return iB3 + iC;
            case 7:
                ((Boolean) obj).getClass();
                boolean z15 = zzada.f11245b;
                iC = 1;
                return iB3 + iC;
            case 8:
                if (obj instanceof zzacr) {
                    boolean z16 = zzada.f11245b;
                    iB = ((zzacr) obj).d();
                    iB2 = zzada.b(iB);
                } else {
                    boolean z17 = zzada.f11245b;
                    iB = zzagl.b((String) obj);
                    iB2 = zzada.b(iB);
                }
                iC = iB2 + iB;
                return iB3 + iC;
            case 9:
                iC = ((zzafc) obj).h();
                return iB3 + iC;
            case 10:
                if (obj instanceof zzael) {
                    iB = ((zzael) obj).a();
                    iB2 = zzada.b(iB);
                    iC = iB2 + iB;
                } else {
                    iC = zzada.d((zzafc) obj);
                }
                return iB3 + iC;
            case 11:
                if (obj instanceof zzacr) {
                    boolean z18 = zzada.f11245b;
                    iB = ((zzacr) obj).d();
                    iB2 = zzada.b(iB);
                } else {
                    boolean z19 = zzada.f11245b;
                    iB = ((byte[]) obj).length;
                    iB2 = zzada.b(iB);
                }
                iC = iB2 + iB;
                return iB3 + iC;
            case 12:
                iC = zzada.b(((Integer) obj).intValue());
                return iB3 + iC;
            case 13:
                iC = obj instanceof zzady ? zzada.c(((zzady) obj).zza()) : zzada.c(((Integer) obj).intValue());
                return iB3 + iC;
            case 14:
                ((Integer) obj).getClass();
                boolean z20 = zzada.f11245b;
                return iB3 + iC;
            case 15:
                ((Long) obj).getClass();
                boolean z21 = zzada.f11245b;
                iC = 8;
                return iB3 + iC;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                iC = zzada.b((iIntValue >> 31) ^ (iIntValue + iIntValue));
                return iB3 + iC;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                iC = zzada.c((jLongValue >> 63) ^ (jLongValue + jLongValue));
                return iB3 + iC;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static boolean f(Map.Entry entry) {
        ((zzadj) entry.getKey()).zzc();
        throw null;
    }

    public static final int g(Map.Entry entry) {
        zzadj zzadjVar = (zzadj) entry.getKey();
        entry.getValue();
        zzadjVar.zzc();
        throw null;
    }

    public final void a() {
        if (this.f11259b) {
            return;
        }
        zzafr zzafrVar = this.f11258a;
        int i11 = zzafrVar.f11338b;
        for (int i12 = 0; i12 < i11; i12++) {
            Object obj = ((zzafs) zzafrVar.b(i12)).f11330b;
            if (obj instanceof zzadu) {
                ((zzadu) obj).o();
            }
        }
        Iterator it = zzafrVar.c().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof zzadu) {
                ((zzadu) value).o();
            }
        }
        zzafrVar.a();
        this.f11259b = true;
    }

    public final Iterator b() {
        zzafr zzafrVar = this.f11258a;
        if (zzafrVar.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.f11260c ? new zzaek(((zzafu) zzafrVar.entrySet()).iterator()) : ((zzafu) zzafrVar.entrySet()).iterator();
    }

    public final boolean c() {
        zzafr zzafrVar = this.f11258a;
        if (zzafrVar.f11338b > 0) {
            f(zzafrVar.b(0));
            throw null;
        }
        Iterator it = zzafrVar.c().iterator();
        if (!it.hasNext()) {
            return true;
        }
        f((Map.Entry) it.next());
        throw null;
    }

    public final Object clone() {
        zzadk zzadkVar = new zzadk();
        zzafr zzafrVar = this.f11258a;
        if (zzafrVar.f11338b > 0) {
            ((zzadj) ((zzafs) zzafrVar.b(0)).f11329a).zzd();
            throw null;
        }
        Iterator it = zzafrVar.c().iterator();
        if (!it.hasNext()) {
            zzadkVar.f11260c = this.f11260c;
            return zzadkVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        zzadj zzadjVar = (zzadj) entry.getKey();
        entry.getValue();
        zzadjVar.zzd();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzadk) {
            return this.f11258a.equals(((zzadk) obj).f11258a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11258a.hashCode();
    }

    public zzadk(int i11) {
        a();
        a();
    }
}
