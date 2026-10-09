package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.e;
import ep.a;
import hh.p0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbx implements zzch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f10266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzbx f10267c;

    public zzbx(List list, Map map) throws GeneralSecurityException {
        this.f10265a = list;
        this.f10266b = map;
        if (((zzja) zzix.f10566a).f10568a.get()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                zzcd zzcdVar = (zzcd) it.next();
                int i11 = zzcdVar.f10280d;
                int i12 = zzcdVar.f10280d;
                if (hashSet.contains(Integer.valueOf(i11))) {
                    throw new GeneralSecurityException(p0.h(i12, "KeyID ", " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing."));
                }
                hashSet.add(Integer.valueOf(i12));
                if (zzcdVar.f10281e) {
                    z11 = true;
                }
            }
            if (!z11) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
        this.f10267c = null;
    }

    public static zzbt b(zzwt.zza zzaVar) {
        zzpx zzpxVarM = m(zzaVar);
        zzou zzouVar = zzou.f10818b;
        zzcw zzcwVar = zzcw.f10287a;
        zzqa zzqaVar = (zzqa) zzouVar.f10819a.get();
        zzqaVar.getClass();
        return !zzqaVar.f10853b.containsKey(new zzqc(zzpx.class, zzpxVarM.f10846b)) ? new zzoa(zzpxVarM, zzcwVar) : zzouVar.a(zzpxVarM, zzcwVar);
    }

    public static final zzbx c(zzbo zzboVar, zzne zzneVar, byte[] bArr) throws GeneralSecurityException, IOException {
        ByteArrayInputStream byteArrayInputStream = zzboVar.f10260a;
        try {
            zzakj zzakjVar = zzakj.f10117b;
            zzvh zzvhVarV = zzvh.v(byteArrayInputStream, zzakjVar);
            byteArrayInputStream.close();
            if (zzvhVarV.A().d() == 0) {
                throw new GeneralSecurityException("empty keyset");
            }
            try {
                zzwt zzwtVarY = zzwt.y(zzneVar.a(zzvhVarV.A().r(), bArr), zzakjVar);
                if (zzwtVarY == null || zzwtVarY.v() <= 0) {
                    throw new GeneralSecurityException("empty keyset");
                }
                return e(zzwtVarY);
            } catch (zzale unused) {
                throw new GeneralSecurityException("invalid keyset, corrupted key material");
            }
        } catch (Throwable th2) {
            byteArrayInputStream.close();
            throw th2;
        }
    }

    public static final zzbx d(zzby zzbyVar) throws GeneralSecurityException {
        int i11;
        zzwk zzwkVar;
        zzcq zzcqVarA = zzbyVar.f10268a;
        if (zzcqVarA == null) {
            try {
                zzcqVarA = zzcy.a((zzcqVarA instanceof zzod ? ((zzod) zzcqVarA).f10805a.f10844b : ((zzpw) zzou.f10818b.d(zzcqVarA)).f10844b).g());
            } catch (GeneralSecurityException e8) {
                throw new zzqh("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat(String.valueOf(zzcqVarA)), e8);
            }
        }
        zzcc zzccVar = new zzcc();
        zzcb zzcbVar = new zzcb(zzcqVarA);
        zzcbVar.f10272c = zzce.f10284a;
        zzcbVar.f10270a = true;
        ArrayList arrayList = zzccVar.f10273a;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ((zzcb) obj).f10270a = false;
        }
        arrayList.add(zzcbVar);
        if (zzccVar.f10275c) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        zzccVar.f10275c = true;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i13 = 0; i13 < arrayList.size() - 1; i13++) {
            zzce zzceVar = ((zzcb) arrayList.get(i13)).f10272c;
            zzce zzceVar2 = zzce.f10284a;
            if (zzceVar == zzceVar2 && ((zzcb) arrayList.get(i13 + 1)).f10272c != zzceVar2) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
        }
        HashSet hashSet = new HashSet();
        int size2 = arrayList.size();
        int i14 = 0;
        Integer numValueOf = null;
        while (i14 < size2) {
            Object obj2 = arrayList.get(i14);
            i14++;
            zzcb zzcbVar2 = (zzcb) obj2;
            zzcbVar2.getClass();
            zzcq zzcqVar = zzcbVar2.f10271b;
            zzce zzceVar3 = zzcbVar2.f10272c;
            if (zzceVar3 == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            if (zzceVar3 == zzce.f10284a) {
                int i15 = 0;
                while (true) {
                    if (i15 != 0 && !hashSet.contains(Integer.valueOf(i15))) {
                        break;
                    }
                    Charset charset = zzqj.f10870a;
                    i15 = 0;
                    while (i15 == 0) {
                        byte[] bArrA = zzpz.a(4);
                        i15 = (bArrA[3] & 255) | ((bArrA[0] & 255) << 24) | ((bArrA[1] & 255) << 16) | ((bArrA[2] & 255) << 8);
                    }
                }
                i11 = i15;
            } else {
                i11 = 0;
            }
            if (hashSet.contains(Integer.valueOf(i11))) {
                throw new GeneralSecurityException(p0.h(i11, "Id ", " is used twice in the keyset"));
            }
            hashSet.add(Integer.valueOf(i11));
            zzbt zzbtVarA = zzon.f10809b.a(zzcqVar, zzcqVar.a() ? Integer.valueOf(i11) : null);
            Object obj3 = zzbv.f10261b;
            if (obj3.equals(obj3)) {
                zzwkVar = zzwk.ENABLED;
            } else if (zzbv.f10262c.equals(obj3)) {
                zzwkVar = zzwk.DISABLED;
            } else {
                if (!zzbv.f10263d.equals(obj3)) {
                    throw new IllegalStateException("Unknown key status");
                }
                zzwkVar = zzwk.DESTROYED;
            }
            zzcd zzcdVar = new zzcd(zzbtVarA, zzwkVar, i11, zzcbVar2.f10270a, false, zzcd.f10276h);
            int i16 = i11;
            if (zzcbVar2.f10270a) {
                if (numValueOf != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                numValueOf = Integer.valueOf(i16);
            }
            arrayList2.add(zzcdVar);
        }
        if (numValueOf != null) {
            return l(new zzbx(arrayList2, zzccVar.f10274b));
        }
        throw new GeneralSecurityException("No primary was set");
    }

    public static final zzbx e(zzwt zzwtVar) throws GeneralSecurityException {
        zzbt zzoaVar;
        boolean z11;
        if (zzwtVar == null || zzwtVar.v() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        ArrayList arrayList = new ArrayList(zzwtVar.v());
        for (zzwt.zza zzaVar : zzwtVar.E()) {
            int iV = zzaVar.v();
            try {
                zzoaVar = b(zzaVar);
                z11 = false;
            } catch (GeneralSecurityException e8) {
                if (((zzja) zzix.f10566a).f10568a.get()) {
                    throw e8;
                }
                zzoaVar = new zzoa(m(zzaVar), zzcw.f10287a);
                z11 = true;
            }
            if (((zzja) zzix.f10566a).f10568a.get() && !j(zzaVar.B())) {
                throw new GeneralSecurityException("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
            }
            arrayList.add(new zzcd(zzoaVar, zzaVar.B(), iV, iV == zzwtVar.B(), z11, zzcd.f10276h));
        }
        return new zzbx(Collections.unmodifiableList(arrayList), new HashMap());
    }

    public static boolean j(zzwk zzwkVar) {
        int i11 = zzbz.f10269a[zzwkVar.ordinal()];
        return i11 == 1 || i11 == 2 || i11 == 3;
    }

    public static zzbx l(zzbx zzbxVar) {
        zzbl zzblVarA = zzbxVar.a();
        List<zzcd> list = zzbxVar.f10265a;
        if (((zzof) zzblVarA) == null) {
            return zzbxVar;
        }
        zzca zzcaVar = new zzca();
        ArrayList arrayList = new ArrayList(list.size());
        for (zzcd zzcdVar : list) {
            arrayList.add(new zzcd(zzcdVar.f10277a, zzcdVar.f10278b, zzcdVar.f10280d, zzcdVar.f10281e, zzcdVar.f10282f, zzcaVar));
        }
        return new zzbx(arrayList, zzbxVar.f10266b, zzbxVar);
    }

    public static zzpx m(zzwt.zza zzaVar) {
        return zzpx.a(zzaVar.A().D(), zzaVar.A().C(), zzaVar.A().z(), zzaVar.E(), zzaVar.E() == zzxl.RAW ? null : Integer.valueOf(zzaVar.v()));
    }

    public final zzbl a() {
        return (zzbl) this.f10266b.get(zzof.class);
    }

    public final zzcd f(int i11) {
        List list = this.f10265a;
        if (i11 < 0 || i11 >= list.size()) {
            throw new IndexOutOfBoundsException(p.p("Invalid index ", i11, list.size(), " for keyset of size "));
        }
        zzcd zzcdVar = (zzcd) list.get(i11);
        if (!j(zzcdVar.f10278b)) {
            throw new IllegalStateException(p0.h(i11, "Keyset-Entry at position ", " has wrong status"));
        }
        if (zzcdVar.f10282f) {
            throw new IllegalStateException(p0.h(i11, "Keyset-Entry at position ", " didn't parse correctly"));
        }
        return (zzcd) list.get(i11);
    }

    public final Object g(zzbq zzbqVar, Class cls) throws GeneralSecurityException {
        zzbx zzbxVar = this.f10267c;
        zzwt zzwtVarO = (zzbxVar == null ? this : zzbxVar).o();
        int i11 = zzcx.f10288a;
        int iB = zzwtVarO.B();
        int i12 = 0;
        boolean z11 = true;
        int i13 = 0;
        boolean z12 = false;
        for (zzwt.zza zzaVar : zzwtVarO.E()) {
            if (zzaVar.B() == zzwk.ENABLED) {
                if (!zzaVar.F()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzaVar.v())));
                }
                if (zzaVar.E() == zzxl.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzaVar.v())));
                }
                if (zzaVar.B() == zzwk.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzaVar.v())));
                }
                if (zzaVar.v() == iB) {
                    if (z12) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z12 = true;
                }
                if (zzaVar.A().z() != zzwj.zza.ASYMMETRIC_PUBLIC) {
                    z11 = false;
                }
                i13++;
            }
        }
        if (i13 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z12 && !z11) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        while (true) {
            List list = this.f10265a;
            if (i12 >= list.size()) {
                if (zzbxVar == null) {
                    zzbxVar = this;
                }
                return zzbqVar.a(zzbxVar, cls);
            }
            if (((zzcd) list.get(i12)).f10282f || !j(((zzcd) list.get(i12)).f10278b)) {
                throw new GeneralSecurityException("Key parsing of key with index " + i12 + " and type_url " + zzwtVarO.w(i12).A().D() + " failed, unable to get primitive");
            }
            i12++;
        }
    }

    public final void h(zzbn zzbnVar) throws GeneralSecurityException, IOException {
        zzwt zzwtVarO = o();
        for (zzwt.zza zzaVar : zzwtVarO.E()) {
            if (zzaVar.A().z() == zzwj.zza.UNKNOWN_KEYMATERIAL || zzaVar.A().z() == zzwj.zza.SYMMETRIC || zzaVar.A().z() == zzwj.zza.ASYMMETRIC_PRIVATE) {
                throw new GeneralSecurityException(e.n("keyset contains key material of type ", zzaVar.A().z().name(), " for type url ", zzaVar.A().D()));
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = zzbnVar.f10259a;
        try {
            zzwtVarO.getClass();
            zzwt zzwtVar = zzwtVarO;
            int iB = zzwtVar.b(null);
            boolean z11 = zzakb.f10105b;
            if (iB > 4096) {
                iB = 4096;
            }
            zzakc zzakcVar = new zzakc(byteArrayOutputStream, iB);
            zzwtVar.a(zzakcVar);
            if (zzakcVar.f10109e > 0) {
                zzakcVar.z();
            }
        } finally {
            byteArrayOutputStream.close();
        }
    }

    public final void i(zznf zznfVar, zzne zzneVar, byte[] bArr) throws IOException {
        zzwt zzwtVarO = o();
        byte[] bArrB = zzneVar.b(zzwtVarO.g(), bArr);
        zzvh.zza zzaVarY = zzvh.y();
        zzaje zzajeVarG = zzaje.g(bArrB, 0, bArrB.length);
        zzaVarY.i();
        zzvh.w((zzvh) zzaVarY.f10131b, zzajeVarG);
        zzww zzwwVarA = zzcx.a(zzwtVarO);
        zzaVarY.i();
        zzvh.x((zzvh) zzaVarY.f10131b, zzwwVarA);
        if (!zznfVar.f10766a.putString(zznfVar.f10767b, zzzj.a(((zzvh) zzaVarY.g()).g())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    public final zzbx k() throws GeneralSecurityException {
        zzbt zzoaVar;
        boolean z11;
        zzcd zzcdVar;
        zzwt zzwtVarO = o();
        List<zzcd> list = this.f10265a;
        ArrayList arrayList = new ArrayList(list.size());
        int i11 = 0;
        for (zzcd zzcdVar2 : list) {
            if (zzcdVar2.zzb() instanceof zzcp) {
                zzbt zzbtVarZzc = ((zzcp) zzcdVar2.zzb()).zzc();
                zzcdVar = new zzcd(zzbtVarZzc, zzcdVar2.f10278b, zzcdVar2.f10280d, zzcdVar2.f10281e, false, zzcd.f10276h);
                int i12 = zzcdVar2.f10280d;
                Integer numB = zzbtVarZzc.b();
                if (numB != null && numB.intValue() != i12) {
                    throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                }
            } else {
                zzwt.zza zzaVarW = zzwtVarO.w(i11);
                zzwj zzwjVarA = zzaVarW.A();
                if (zzwjVarA.z() != zzwj.zza.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("The keyset contains a non-private key");
                }
                String strD = zzwjVarA.D();
                zzaje zzajeVarC = zzwjVarA.C();
                int i13 = zzct.f10286a;
                zzbw zzbwVarA = zznr.f10791d.a(strD);
                if (!(zzbwVarA instanceof zzcs)) {
                    throw new GeneralSecurityException(a.g("manager for key type ", strD, " is not a PrivateKeyManager"));
                }
                zzwj zzwjVarA2 = ((zzcs) zzbwVarA).a(zzajeVarC);
                zzaku.zzb zzbVar = (zzaku.zzb) zzaVarW.l(5);
                if (!zzbVar.f10130a.equals(zzaVarW)) {
                    if (!zzbVar.f10131b.u()) {
                        zzbVar.j();
                    }
                    zzaku.zzb.f(zzbVar.f10131b, zzaVarW);
                }
                zzwt.zza.C0014zza c0014zza = (zzwt.zza.C0014zza) zzbVar;
                c0014zza.i();
                zzwt.zza.x((zzwt.zza) c0014zza.f10131b, zzwjVarA2);
                zzwt.zza zzaVar = (zzwt.zza) c0014zza.g();
                try {
                    zzoaVar = b(zzaVar);
                    z11 = false;
                } catch (GeneralSecurityException e8) {
                    if (((zzja) zzix.f10566a).f10568a.get()) {
                        throw e8;
                    }
                    zzoaVar = new zzoa(m(zzaVar), zzcw.f10287a);
                    z11 = true;
                }
                zzbt zzbtVar = zzoaVar;
                int iV = zzaVar.v();
                zzcdVar = new zzcd(zzbtVar, zzcdVar2.f10278b, iV, iV == zzwtVarO.B(), z11, zzcd.f10276h);
            }
            arrayList.add(zzcdVar);
            i11++;
        }
        return l(new zzbx(arrayList, this.f10266b));
    }

    public final zzcd n() {
        for (zzcd zzcdVar : this.f10265a) {
            if (zzcdVar != null && zzcdVar.f10281e) {
                if (zzcdVar.f10279c == zzbv.f10261b) {
                    return zzcdVar;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    public final zzwt o() {
        try {
            zzwt.zzb zzbVarC = zzwt.C();
            for (zzcd zzcdVar : this.f10265a) {
                zzbt zzbtVarZzb = zzcdVar.zzb();
                int i11 = zzcdVar.f10280d;
                zzwk zzwkVar = zzcdVar.f10278b;
                zzpx zzpxVar = (zzpx) zzou.f10818b.c(zzbtVarZzb, zzcw.f10287a);
                Integer numB = zzbtVarZzb.b();
                if (numB != null && numB.intValue() != i11) {
                    throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                }
                zzwt.zza.C0014zza c0014zzaC = zzwt.zza.C();
                zzwj.zzb zzbVarV = zzwj.v();
                String str = zzpxVar.f10845a;
                zzbVarV.i();
                zzwj.y((zzwj) zzbVarV.f10131b, str);
                zzaje zzajeVar = zzpxVar.f10847c;
                zzbVarV.i();
                zzwj.w((zzwj) zzbVarV.f10131b, zzajeVar);
                zzwj.zza zzaVar = zzpxVar.f10848d;
                zzbVarV.i();
                ((zzwj) zzbVarV.f10131b).zzg = zzaVar.zza();
                c0014zzaC.i();
                zzwt.zza.x((zzwt.zza) c0014zzaC.f10131b, (zzwj) zzbVarV.g());
                c0014zzaC.i();
                ((zzwt.zza) c0014zzaC.f10131b).zzg = zzwkVar.zza();
                c0014zzaC.i();
                ((zzwt.zza) c0014zzaC.f10131b).zzh = i11;
                zzxl zzxlVar = zzpxVar.f10849e;
                c0014zzaC.i();
                ((zzwt.zza) c0014zzaC.f10131b).zzi = zzxlVar.zza();
                zzwt.zza zzaVar2 = (zzwt.zza) c0014zzaC.g();
                zzbVarC.i();
                zzwt.A((zzwt) zzbVarC.f10131b, zzaVar2);
                if (zzcdVar.f10281e) {
                    zzbVarC.i();
                    ((zzwt) zzbVarC.f10131b).zze = i11;
                }
            }
            return (zzwt) zzbVarC.g();
        } catch (GeneralSecurityException e8) {
            throw new zzqh(e8);
        }
    }

    public final String toString() {
        return zzcx.a(o()).toString();
    }

    public zzbx(ArrayList arrayList, Map map, zzbx zzbxVar) {
        this.f10265a = arrayList;
        this.f10266b = map;
        this.f10267c = zzbxVar;
    }
}
