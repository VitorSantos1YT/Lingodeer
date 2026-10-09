package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.recyclerview.widget.p2;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzaeh;
import dl.ExOZ.xItStCyvVEZ;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import y.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzht extends zzos implements zzak {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f13059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f13060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f13061f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f13062g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f13063h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e f13064i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f13065j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p2 f13066k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.zzr f13067l;
    public final e m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f13068n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final e f13069o;

    public zzht(zzpg zzpgVar) {
        super(zzpgVar);
        this.f13059d = new e(0);
        this.f13060e = new e(0);
        this.f13061f = new e(0);
        this.f13062g = new e(0);
        this.f13063h = new e(0);
        this.f13064i = new e(0);
        this.m = new e(0);
        this.f13068n = new e(0);
        this.f13069o = new e(0);
        this.f13065j = new e(0);
        this.f13066k = new zzhm(this);
        this.f13067l = new zzhn(this);
    }

    public static final e q(com.google.android.gms.internal.measurement.zzgl zzglVar) {
        e eVar = new e(0);
        for (com.google.android.gms.internal.measurement.zzgt zzgtVar : zzglVar.C()) {
            eVar.put(zzgtVar.y(), zzgtVar.z());
        }
        return eVar;
    }

    public static final zzjk r(int i11) {
        int i12 = i11 - 1;
        if (i12 == 1) {
            return zzjk.AD_STORAGE;
        }
        if (i12 == 2) {
            return zzjk.ANALYTICS_STORAGE;
        }
        if (i12 == 3) {
            return zzjk.AD_USER_DATA;
        }
        if (i12 != 4) {
            return null;
        }
        return zzjk.AD_PERSONALIZATION;
    }

    public final boolean A(String str) {
        g();
        m(str);
        e eVar = this.f13060e;
        return eVar.get(str) != null && ((Set) eVar.get(str)).contains("app_instance_id");
    }

    public final boolean B(String str, zzjk zzjkVar) {
        g();
        m(str);
        com.google.android.gms.internal.measurement.zzgf zzgfVarC = C(str);
        if (zzgfVarC == null) {
            return false;
        }
        for (com.google.android.gms.internal.measurement.zzfu zzfuVar : zzgfVarC.y()) {
            if (zzjkVar == r(zzfuVar.y())) {
                return zzfuVar.z() == 2;
            }
        }
        return false;
    }

    public final com.google.android.gms.internal.measurement.zzgf C(String str) {
        g();
        m(str);
        com.google.android.gms.internal.measurement.zzgl zzglVarS = s(str);
        if (zzglVarS == null || !zzglVarS.K()) {
            return null;
        }
        return zzglVarS.L();
    }

    @Override // com.google.android.gms.measurement.internal.zzak
    public final String d(String str, String str2) {
        g();
        m(str);
        Map map = (Map) this.f13059d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.zzos
    public final void j() {
    }

    public final zzji k(String str, zzjk zzjkVar) {
        g();
        m(str);
        com.google.android.gms.internal.measurement.zzgf zzgfVarC = C(str);
        if (zzgfVarC == null) {
            return zzji.UNINITIALIZED;
        }
        for (com.google.android.gms.internal.measurement.zzfu zzfuVar : zzgfVarC.D()) {
            if (r(zzfuVar.y()) == zzjkVar) {
                int iZ = zzfuVar.z() - 1;
                if (iZ != 1) {
                    return iZ != 2 ? zzji.UNINITIALIZED : zzji.DENIED;
                }
                return zzji.GRANTED;
            }
        }
        return zzji.UNINITIALIZED;
    }

    public final boolean l(String str) {
        g();
        m(str);
        com.google.android.gms.internal.measurement.zzgf zzgfVarC = C(str);
        if (zzgfVarC == null) {
            return false;
        }
        for (com.google.android.gms.internal.measurement.zzfu zzfuVar : zzgfVarC.y()) {
            if (zzfuVar.y() == 3 && zzfuVar.A() == 3) {
                return true;
            }
        }
        return false;
    }

    public final void m(String str) {
        h();
        g();
        Preconditions.d(str);
        e eVar = this.f13064i;
        if (eVar.get(str) == null) {
            zzaw zzawVar = this.f13552b.f13597c;
            zzpg.U(zzawVar);
            zzaq zzaqVarO0 = zzawVar.o0(str);
            e eVar2 = this.f13069o;
            e eVar3 = this.f13068n;
            e eVar4 = this.m;
            e eVar5 = this.f13059d;
            if (zzaqVarO0 != null) {
                com.google.android.gms.internal.measurement.zzgk zzgkVar = (com.google.android.gms.internal.measurement.zzgk) p(zzaqVarO0.f12634a, str).q();
                n(str, zzgkVar);
                eVar5.put(str, q((com.google.android.gms.internal.measurement.zzgl) zzgkVar.p()));
                eVar.put(str, (com.google.android.gms.internal.measurement.zzgl) zzgkVar.p());
                o(str, (com.google.android.gms.internal.measurement.zzgl) zzgkVar.p());
                eVar4.put(str, ((com.google.android.gms.internal.measurement.zzgl) zzgkVar.f11266b).J());
                eVar3.put(str, zzaqVarO0.f12635b);
                eVar2.put(str, zzaqVarO0.f12636c);
                return;
            }
            eVar5.put(str, null);
            this.f13061f.put(str, null);
            this.f13060e.put(str, null);
            this.f13062g.put(str, null);
            this.f13063h.put(str, null);
            eVar.put(str, null);
            eVar4.put(str, null);
            eVar3.put(str, null);
            eVar2.put(str, null);
            this.f13065j.put(str, null);
        }
    }

    public final void n(String str, com.google.android.gms.internal.measurement.zzgk zzgkVar) {
        ArrayList arrayList;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        e eVar = new e(0);
        e eVar2 = new e(0);
        e eVar3 = new e(0);
        Iterator it = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.zzgl) zzgkVar.f11266b).I()).iterator();
        while (it.hasNext()) {
            hashSet.add(((com.google.android.gms.internal.measurement.zzgh) it.next()).y());
        }
        zzic zzicVar = this.f13202a;
        zzal zzalVar = zzicVar.f13097d;
        zzgu zzguVar = zzicVar.f13099f;
        zzfx zzfxVar = zzfy.V0;
        if (zzalVar.r(null, zzfxVar)) {
            arrayList2.addAll(Collections.unmodifiableList(((com.google.android.gms.internal.measurement.zzgl) zzgkVar.f11266b).O()));
        }
        while (i11 < ((com.google.android.gms.internal.measurement.zzgl) zzgkVar.f11266b).D()) {
            com.google.android.gms.internal.measurement.zzgi zzgiVar = (com.google.android.gms.internal.measurement.zzgi) ((com.google.android.gms.internal.measurement.zzgl) zzgkVar.f11266b).E(i11).q();
            if (zzgiVar.s().isEmpty()) {
                zzic.m(zzguVar);
                zzguVar.f12945i.a("EventConfig contained null event name");
                arrayList = arrayList2;
            } else {
                String strS = zzgiVar.s();
                arrayList = arrayList2;
                String strB = zzlt.b(zzgiVar.s(), zzjm.f13207a, zzjm.f13212f);
                if (!TextUtils.isEmpty(strB)) {
                    zzgiVar.m();
                    ((com.google.android.gms.internal.measurement.zzgj) zzgiVar.f11266b).F(strB);
                    zzgkVar.m();
                    ((com.google.android.gms.internal.measurement.zzgl) zzgkVar.f11266b).R(i11, (com.google.android.gms.internal.measurement.zzgj) zzgiVar.p());
                }
                if (((com.google.android.gms.internal.measurement.zzgj) zzgiVar.f11266b).z() && ((com.google.android.gms.internal.measurement.zzgj) zzgiVar.f11266b).A()) {
                    eVar.put(strS, Boolean.TRUE);
                }
                if (((com.google.android.gms.internal.measurement.zzgj) zzgiVar.f11266b).B() && ((com.google.android.gms.internal.measurement.zzgj) zzgiVar.f11266b).C()) {
                    eVar2.put(zzgiVar.s(), Boolean.TRUE);
                }
                if (((com.google.android.gms.internal.measurement.zzgj) zzgiVar.f11266b).D()) {
                    if (((com.google.android.gms.internal.measurement.zzgj) zzgiVar.f11266b).E() < 2 || ((com.google.android.gms.internal.measurement.zzgj) zzgiVar.f11266b).E() > 65535) {
                        zzic.m(zzguVar);
                        zzguVar.f12945i.c(zzgiVar.s(), Integer.valueOf(((com.google.android.gms.internal.measurement.zzgj) zzgiVar.f11266b).E()), "Invalid sampling rate. Event name, sample rate");
                    } else {
                        eVar3.put(zzgiVar.s(), Integer.valueOf(((com.google.android.gms.internal.measurement.zzgj) zzgiVar.f11266b).E()));
                    }
                }
            }
            i11++;
            arrayList2 = arrayList;
        }
        ArrayList arrayList3 = arrayList2;
        this.f13060e.put(str, hashSet);
        if (zzicVar.f13097d.r(null, zzfxVar)) {
            this.f13063h.put(str, arrayList3);
        }
        this.f13061f.put(str, eVar);
        this.f13062g.put(str, eVar2);
        this.f13065j.put(str, eVar3);
    }

    public final com.google.android.gms.internal.measurement.zzgl p(byte[] bArr, String str) {
        zzic zzicVar = this.f13202a;
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.zzgl.Q();
        }
        try {
            com.google.android.gms.internal.measurement.zzgl zzglVar = (com.google.android.gms.internal.measurement.zzgl) ((com.google.android.gms.internal.measurement.zzgk) zzpk.R(com.google.android.gms.internal.measurement.zzgl.P(), bArr)).p();
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12949n.c(zzglVar.y() ? Long.valueOf(zzglVar.z()) : null, zzglVar.A() ? zzglVar.B() : null, "Parsed config. version, gmp_app_id");
            return zzglVar;
        } catch (zzaeh e8) {
            zzgu zzguVar2 = zzicVar.f13099f;
            zzic.m(zzguVar2);
            zzguVar2.f12945i.c(zzgu.o(str), e8, "Unable to merge remote config. appId");
            return com.google.android.gms.internal.measurement.zzgl.Q();
        } catch (RuntimeException e10) {
            zzgu zzguVar3 = zzicVar.f13099f;
            zzic.m(zzguVar3);
            zzguVar3.f12945i.c(zzgu.o(str), e10, "Unable to merge remote config. appId");
            return com.google.android.gms.internal.measurement.zzgl.Q();
        }
    }

    public final com.google.android.gms.internal.measurement.zzgl s(String str) {
        h();
        g();
        Preconditions.d(str);
        m(str);
        return (com.google.android.gms.internal.measurement.zzgl) this.f13064i.get(str);
    }

    public final String t(String str) {
        g();
        m(str);
        return (String) this.m.get(str);
    }

    public final void u(String str, String str2, String str3, byte[] bArr) throws Throwable {
        SQLiteDatabase sQLiteDatabase;
        com.google.android.gms.internal.measurement.zzgk zzgkVar;
        byte[] bArrB;
        int i11;
        int i12;
        boolean z11;
        h();
        g();
        Preconditions.d(str);
        com.google.android.gms.internal.measurement.zzgk zzgkVar2 = (com.google.android.gms.internal.measurement.zzgk) p(bArr, str).q();
        n(str, zzgkVar2);
        o(str, (com.google.android.gms.internal.measurement.zzgl) zzgkVar2.p());
        com.google.android.gms.internal.measurement.zzgl zzglVar = (com.google.android.gms.internal.measurement.zzgl) zzgkVar2.p();
        e eVar = this.f13064i;
        eVar.put(str, zzglVar);
        this.m.put(str, ((com.google.android.gms.internal.measurement.zzgl) zzgkVar2.f11266b).J());
        this.f13068n.put(str, str2);
        this.f13069o.put(str, str3);
        this.f13059d.put(str, q((com.google.android.gms.internal.measurement.zzgl) zzgkVar2.p()));
        zzpg zzpgVar = this.f13552b;
        zzaw zzawVar = zzpgVar.f13597c;
        zzpg.U(zzawVar);
        ArrayList arrayList = new ArrayList(Collections.unmodifiableList(((com.google.android.gms.internal.measurement.zzgl) zzgkVar2.f11266b).F()));
        zzic zzicVar = zzawVar.f13202a;
        int i13 = 0;
        while (i13 < arrayList.size()) {
            com.google.android.gms.internal.measurement.zzfc zzfcVar = (com.google.android.gms.internal.measurement.zzfc) ((com.google.android.gms.internal.measurement.zzfd) arrayList.get(i13)).q();
            e eVar2 = eVar;
            if (((com.google.android.gms.internal.measurement.zzfd) zzfcVar.f11266b).E() != 0) {
                int i14 = 0;
                while (i14 < ((com.google.android.gms.internal.measurement.zzfd) zzfcVar.f11266b).E()) {
                    com.google.android.gms.internal.measurement.zzfe zzfeVar = (com.google.android.gms.internal.measurement.zzfe) ((com.google.android.gms.internal.measurement.zzfd) zzfcVar.f11266b).F(i14).q();
                    com.google.android.gms.internal.measurement.zzfe zzfeVar2 = (com.google.android.gms.internal.measurement.zzfe) zzfeVar.clone();
                    zzpg zzpgVar2 = zzpgVar;
                    com.google.android.gms.internal.measurement.zzgk zzgkVar3 = zzgkVar2;
                    String strB = zzlt.b(((com.google.android.gms.internal.measurement.zzff) zzfeVar.f11266b).A(), zzjm.f13207a, zzjm.f13212f);
                    if (strB != null) {
                        zzfeVar2.m();
                        ((com.google.android.gms.internal.measurement.zzff) zzfeVar2.f11266b).L(strB);
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i15 = 0;
                    while (i15 < ((com.google.android.gms.internal.measurement.zzff) zzfeVar.f11266b).C()) {
                        com.google.android.gms.internal.measurement.zzfh zzfhVarD = ((com.google.android.gms.internal.measurement.zzff) zzfeVar.f11266b).D(i15);
                        boolean z12 = z11;
                        com.google.android.gms.internal.measurement.zzfe zzfeVar3 = zzfeVar;
                        String strB2 = zzlt.b(zzfhVarD.F(), zzjn.f13214a, zzjn.f13215b);
                        if (strB2 != null) {
                            com.google.android.gms.internal.measurement.zzfg zzfgVar = (com.google.android.gms.internal.measurement.zzfg) zzfhVarD.q();
                            zzfgVar.m();
                            ((com.google.android.gms.internal.measurement.zzfh) zzfgVar.f11266b).H(strB2);
                            com.google.android.gms.internal.measurement.zzfh zzfhVar = (com.google.android.gms.internal.measurement.zzfh) zzfgVar.p();
                            zzfeVar2.m();
                            ((com.google.android.gms.internal.measurement.zzff) zzfeVar2.f11266b).M(i15, zzfhVar);
                            z11 = true;
                        } else {
                            z11 = z12;
                        }
                        i15++;
                        zzfeVar = zzfeVar3;
                    }
                    if (z11) {
                        zzfcVar.m();
                        ((com.google.android.gms.internal.measurement.zzfd) zzfcVar.f11266b).H(i14, (com.google.android.gms.internal.measurement.zzff) zzfeVar2.p());
                        arrayList.set(i13, (com.google.android.gms.internal.measurement.zzfd) zzfcVar.p());
                    }
                    i14++;
                    zzpgVar = zzpgVar2;
                    zzgkVar2 = zzgkVar3;
                }
            }
            com.google.android.gms.internal.measurement.zzgk zzgkVar4 = zzgkVar2;
            zzpg zzpgVar3 = zzpgVar;
            if (((com.google.android.gms.internal.measurement.zzfd) zzfcVar.f11266b).B() != 0) {
                for (int i16 = 0; i16 < ((com.google.android.gms.internal.measurement.zzfd) zzfcVar.f11266b).B(); i16++) {
                    com.google.android.gms.internal.measurement.zzfn zzfnVarC = ((com.google.android.gms.internal.measurement.zzfd) zzfcVar.f11266b).C(i16);
                    String strB3 = zzlt.b(zzfnVarC.A(), zzjo.f13218a, zzjo.f13219b);
                    if (strB3 != null) {
                        com.google.android.gms.internal.measurement.zzfm zzfmVar = (com.google.android.gms.internal.measurement.zzfm) zzfnVarC.q();
                        zzfmVar.m();
                        ((com.google.android.gms.internal.measurement.zzfn) zzfmVar.f11266b).H(strB3);
                        zzfcVar.m();
                        ((com.google.android.gms.internal.measurement.zzfd) zzfcVar.f11266b).G(i16, (com.google.android.gms.internal.measurement.zzfn) zzfmVar.p());
                        arrayList.set(i13, (com.google.android.gms.internal.measurement.zzfd) zzfcVar.p());
                    }
                }
            }
            i13++;
            eVar = eVar2;
            zzpgVar = zzpgVar3;
            zzgkVar2 = zzgkVar4;
        }
        com.google.android.gms.internal.measurement.zzgk zzgkVar5 = zzgkVar2;
        e eVar3 = eVar;
        zzpg zzpgVar4 = zzpgVar;
        zzawVar.h();
        zzawVar.g();
        Preconditions.d(str);
        SQLiteDatabase sQLiteDatabaseX = zzawVar.X();
        sQLiteDatabaseX.beginTransaction();
        try {
            zzawVar.h();
            zzawVar.g();
            Preconditions.d(str);
            SQLiteDatabase sQLiteDatabaseX2 = zzawVar.X();
            sQLiteDatabaseX2.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseX2.delete("event_filters", "app_id=?", new String[]{str});
            int size = arrayList.size();
            int i17 = 0;
            while (i17 < size) {
                try {
                    int i18 = i17 + 1;
                    com.google.android.gms.internal.measurement.zzfd zzfdVar = (com.google.android.gms.internal.measurement.zzfd) arrayList.get(i17);
                    zzawVar.h();
                    zzawVar.g();
                    Preconditions.d(str);
                    Preconditions.g(zzfdVar);
                    if (zzfdVar.y()) {
                        int iZ = zzfdVar.z();
                        Iterator<E> it = zzfdVar.D().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                Iterator it2 = zzfdVar.A().iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        Iterator it3 = zzfdVar.D().iterator();
                                        while (true) {
                                            boolean zHasNext = it3.hasNext();
                                            Iterator it4 = it3;
                                            String str4 = "filter_id";
                                            sQLiteDatabase = sQLiteDatabaseX;
                                            i11 = size;
                                            String str5 = "app_id";
                                            if (!zHasNext) {
                                                i12 = i18;
                                                Iterator it5 = zzfdVar.A().iterator();
                                                while (it5.hasNext()) {
                                                    com.google.android.gms.internal.measurement.zzfn zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it5.next();
                                                    zzawVar.h();
                                                    zzawVar.g();
                                                    Preconditions.d(str);
                                                    Preconditions.g(zzfnVar);
                                                    if (zzfnVar.A().isEmpty()) {
                                                        zzgu zzguVar = zzicVar.f13099f;
                                                        zzic.m(zzguVar);
                                                        zzguVar.f12945i.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", zzgu.o(str), Integer.valueOf(iZ), String.valueOf(zzfnVar.y() ? Integer.valueOf(zzfnVar.z()) : null));
                                                    } else {
                                                        byte[] bArrB2 = zzfnVar.b();
                                                        Iterator it6 = it5;
                                                        ContentValues contentValues = new ContentValues();
                                                        contentValues.put(str5, str);
                                                        String str6 = str5;
                                                        contentValues.put("audience_id", Integer.valueOf(iZ));
                                                        contentValues.put(str4, zzfnVar.y() ? Integer.valueOf(zzfnVar.z()) : null);
                                                        String str7 = str4;
                                                        contentValues.put("property_name", zzfnVar.A());
                                                        contentValues.put("session_scoped", zzfnVar.E() ? Boolean.valueOf(zzfnVar.F()) : null);
                                                        contentValues.put("data", bArrB2);
                                                        try {
                                                            if (zzawVar.X().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                                                                zzgu zzguVar2 = zzicVar.f13099f;
                                                                zzic.m(zzguVar2);
                                                                zzguVar2.f12942f.b(zzgu.o(str), "Failed to insert property filter (got -1). appId");
                                                            } else {
                                                                it5 = it6;
                                                                str5 = str6;
                                                                str4 = str7;
                                                            }
                                                        } catch (SQLiteException e8) {
                                                            zzgu zzguVar3 = zzicVar.f13099f;
                                                            zzic.m(zzguVar3);
                                                            zzguVar3.f12942f.c(zzgu.o(str), e8, "Error storing property filter. appId");
                                                        }
                                                    }
                                                }
                                                break;
                                            }
                                            try {
                                                com.google.android.gms.internal.measurement.zzff zzffVar = (com.google.android.gms.internal.measurement.zzff) it4.next();
                                                zzawVar.h();
                                                zzawVar.g();
                                                Preconditions.d(str);
                                                Preconditions.g(zzffVar);
                                                if (zzffVar.A().isEmpty()) {
                                                    zzgu zzguVar4 = zzicVar.f13099f;
                                                    zzic.m(zzguVar4);
                                                    zzguVar4.f12945i.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", zzgu.o(str), Integer.valueOf(iZ), String.valueOf(zzffVar.y() ? Integer.valueOf(zzffVar.z()) : null));
                                                    i12 = i18;
                                                } else {
                                                    com.google.android.gms.internal.measurement.zzfd zzfdVar2 = zzfdVar;
                                                    byte[] bArrB3 = zzffVar.b();
                                                    i12 = i18;
                                                    ContentValues contentValues2 = new ContentValues();
                                                    contentValues2.put("app_id", str);
                                                    contentValues2.put("audience_id", Integer.valueOf(iZ));
                                                    contentValues2.put("filter_id", zzffVar.y() ? Integer.valueOf(zzffVar.z()) : null);
                                                    contentValues2.put("event_name", zzffVar.A());
                                                    contentValues2.put("session_scoped", zzffVar.I() ? Boolean.valueOf(zzffVar.J()) : null);
                                                    contentValues2.put("data", bArrB3);
                                                    try {
                                                        if (zzawVar.X().insertWithOnConflict("event_filters", null, contentValues2, 5) == -1) {
                                                            zzgu zzguVar5 = zzicVar.f13099f;
                                                            zzic.m(zzguVar5);
                                                            zzguVar5.f12942f.b(zzgu.o(str), "Failed to insert event filter (got -1). appId");
                                                        }
                                                        it3 = it4;
                                                        sQLiteDatabaseX = sQLiteDatabase;
                                                        size = i11;
                                                        zzfdVar = zzfdVar2;
                                                        i18 = i12;
                                                    } catch (SQLiteException e10) {
                                                        zzgu zzguVar6 = zzicVar.f13099f;
                                                        zzic.m(zzguVar6);
                                                        zzguVar6.f12942f.c(zzgu.o(str), e10, "Error storing event filter. appId");
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                sQLiteDatabase.endTransaction();
                                                throw th;
                                            }
                                            zzawVar.h();
                                            zzawVar.g();
                                            Preconditions.d(str);
                                            SQLiteDatabase sQLiteDatabaseX3 = zzawVar.X();
                                            sQLiteDatabaseX3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iZ)});
                                            sQLiteDatabaseX3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iZ)});
                                            break;
                                        }
                                        sQLiteDatabaseX = sQLiteDatabase;
                                        size = i11;
                                        i17 = i12;
                                        break;
                                    }
                                    if (!((com.google.android.gms.internal.measurement.zzfn) it2.next()).y()) {
                                        zzgu zzguVar7 = zzicVar.f13099f;
                                        zzic.m(zzguVar7);
                                        zzguVar7.f12945i.c(zzgu.o(str), Integer.valueOf(iZ), "Property filter with no ID. Audience definition ignored. appId, audienceId");
                                    }
                                }
                            } else if (!((com.google.android.gms.internal.measurement.zzff) it.next()).y()) {
                                zzgu zzguVar8 = zzicVar.f13099f;
                                zzic.m(zzguVar8);
                                zzguVar8.f12945i.c(zzgu.o(str), Integer.valueOf(iZ), "Event filter with no ID. Audience definition ignored. appId, audienceId");
                            }
                        }
                    } else {
                        zzgu zzguVar9 = zzicVar.f13099f;
                        zzic.m(zzguVar9);
                        zzguVar9.f12945i.b(zzgu.o(str), "Audience with no ID. appId");
                    }
                    i17 = i18;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteDatabase = sQLiteDatabaseX;
                    sQLiteDatabase.endTransaction();
                    throw th;
                }
            }
            sQLiteDatabase = sQLiteDatabaseX;
            ArrayList arrayList2 = new ArrayList();
            int size2 = arrayList.size();
            int i19 = 0;
            while (i19 < size2) {
                Object obj = arrayList.get(i19);
                i19++;
                com.google.android.gms.internal.measurement.zzfd zzfdVar3 = (com.google.android.gms.internal.measurement.zzfd) obj;
                arrayList2.add(zzfdVar3.y() ? Integer.valueOf(zzfdVar3.z()) : null);
            }
            Preconditions.d(str);
            zzawVar.h();
            zzawVar.g();
            SQLiteDatabase sQLiteDatabaseX4 = zzawVar.X();
            try {
                long jC = zzawVar.C("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int iMax = Math.max(0, Math.min(2000, zzicVar.f13097d.p(str, zzfy.U)));
                if (jC > iMax) {
                    ArrayList arrayList3 = new ArrayList();
                    int i21 = 0;
                    while (true) {
                        if (i21 >= arrayList2.size()) {
                            String strJoin = TextUtils.join(",", arrayList3);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(strJoin).length() + 2);
                            sb2.append("(");
                            sb2.append(strJoin);
                            sb2.append(")");
                            String string = sb2.toString();
                            StringBuilder sb3 = new StringBuilder(string.length() + 140);
                            sb3.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb3.append(string);
                            sb3.append(" order by rowid desc limit -1 offset ?)");
                            sQLiteDatabaseX4.delete("audience_filter_values", sb3.toString(), new String[]{str, Integer.toString(iMax)});
                            break;
                        }
                        Integer num = (Integer) arrayList2.get(i21);
                        if (num == null) {
                            break;
                        }
                        arrayList3.add(Integer.toString(num.intValue()));
                        i21++;
                    }
                }
            } catch (SQLiteException e11) {
                zzgu zzguVar10 = zzicVar.f13099f;
                zzic.m(zzguVar10);
                zzguVar10.f12942f.c(zzgu.o(str), e11, "Database error querying filters. appId");
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            try {
                zzgkVar5.m();
                zzgkVar = zzgkVar5;
                try {
                    ((com.google.android.gms.internal.measurement.zzgl) zzgkVar.f11266b).S();
                    bArrB = ((com.google.android.gms.internal.measurement.zzgl) zzgkVar.p()).b();
                } catch (RuntimeException e12) {
                    e = e12;
                    zzgu zzguVar11 = this.f13202a.f13099f;
                    zzic.m(zzguVar11);
                    zzguVar11.f12945i.c(zzgu.o(str), e, "Unable to serialize reduced-size config. Storing full config instead. appId");
                    bArrB = bArr;
                }
            } catch (RuntimeException e13) {
                e = e13;
                zzgkVar = zzgkVar5;
            }
            zzaw zzawVar2 = zzpgVar4.f13597c;
            zzpg.U(zzawVar2);
            zzic zzicVar2 = zzawVar2.f13202a;
            Preconditions.d(str);
            zzawVar2.g();
            zzawVar2.h();
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("remote_config", bArrB);
            contentValues3.put("config_last_modified_time", str2);
            contentValues3.put("e_tag", str3);
            try {
                if (zzawVar2.X().update("apps", contentValues3, "app_id = ?", new String[]{str}) == 0) {
                    zzgu zzguVar12 = zzicVar2.f13099f;
                    zzic.m(zzguVar12);
                    zzguVar12.f12942f.b(zzgu.o(str), "Failed to update remote config (got 0). appId");
                }
            } catch (SQLiteException e14) {
                zzgu zzguVar13 = zzicVar2.f13099f;
                zzic.m(zzguVar13);
                zzguVar13.f12942f.c(zzgu.o(str), e14, "Error storing remote config. appId");
            }
            zzgkVar.m();
            ((com.google.android.gms.internal.measurement.zzgl) zzgkVar.f11266b).T();
            eVar3.put(str, (com.google.android.gms.internal.measurement.zzgl) zzgkVar.p());
        } catch (Throwable th4) {
            th = th4;
            sQLiteDatabase = sQLiteDatabaseX;
        }
    }

    public final boolean v(String str, String str2) {
        Boolean bool;
        g();
        m(str);
        if ("1".equals(d(str, "measurement.upload.blacklist_internal")) && zzpp.L(str2)) {
            return true;
        }
        if ("1".equals(d(str, "measurement.upload.blacklist_public")) && zzpp.h0(str2)) {
            return true;
        }
        Map map = (Map) this.f13061f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean w(String str, String str2) {
        Boolean bool;
        g();
        m(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f13062g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final List x(String str) {
        g();
        m(str);
        return (List) this.f13063h.get(str);
    }

    public final int y(String str, String str2) {
        Integer num;
        g();
        m(str);
        Map map = (Map) this.f13065j.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final boolean z(String str) {
        g();
        m(str);
        e eVar = this.f13060e;
        if (eVar.get(str) != null) {
            return ((Set) eVar.get(str)).contains("os_version") || ((Set) eVar.get(str)).contains("device_info");
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(final String str, com.google.android.gms.internal.measurement.zzgl zzglVar) {
        int iH = zzglVar.H();
        p2 p2Var = this.f13066k;
        if (iH != 0) {
            zzic zzicVar = this.f13202a;
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12949n.b(Integer.valueOf(zzglVar.H()), "EES programs found");
            com.google.android.gms.internal.measurement.zzja zzjaVar = (com.google.android.gms.internal.measurement.zzja) zzglVar.G().get(0);
            try {
                com.google.android.gms.internal.measurement.zzc zzcVar = new com.google.android.gms.internal.measurement.zzc();
                com.google.android.gms.internal.measurement.zzf zzfVar = zzcVar.f11485a;
                zzfVar.f11594d.f11614a.put("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.zzhs
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return new com.google.android.gms.internal.measurement.zzn(new zzho(this.f13057a, str));
                    }
                });
                zzfVar.f11594d.f11614a.put("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzhp
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        final zzht zzhtVar = this.f13052a;
                        final String str2 = str;
                        return new com.google.android.gms.internal.measurement.zzu(new Callable() { // from class: com.google.android.gms.measurement.internal.zzhr
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                zzht zzhtVar2 = zzhtVar;
                                zzaw zzawVar = zzhtVar2.f13552b.f13597c;
                                zzpg.U(zzawVar);
                                String str3 = str2;
                                zzh zzhVarK0 = zzawVar.k0(str3);
                                HashMap map = new HashMap();
                                map.put("platform", "android");
                                map.put("package_name", str3);
                                zzhtVar2.f13202a.f13097d.m();
                                map.put("gmp_version", 161000L);
                                if (zzhVarK0 != null) {
                                    String strO = zzhVarK0.O();
                                    if (strO != null) {
                                        map.put("app_version", strO);
                                    }
                                    map.put("app_version_int", Long.valueOf(zzhVarK0.Q()));
                                    map.put("dynamite_version", Long.valueOf(zzhVarK0.b()));
                                }
                                return map;
                            }
                        });
                    }
                });
                zzfVar.f11594d.f11614a.put("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.zzhq
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return new com.google.android.gms.internal.measurement.zzt(this.f13054a.f13067l);
                    }
                });
                zzcVar.b(zzjaVar);
                p2Var.q(str, zzcVar);
                zzic.m(zzguVar);
                zzgs zzgsVar = zzguVar.f12949n;
                zzgsVar.c(str, Integer.valueOf(zzjaVar.z().z()), xItStCyvVEZ.wtSRsQI);
                for (com.google.android.gms.internal.measurement.zziy zziyVar : zzjaVar.z().y()) {
                    zzic.m(zzguVar);
                    zzgsVar.b(zziyVar.y(), "EES program activity");
                }
                return;
            } catch (com.google.android.gms.internal.measurement.zzd unused) {
                zzgu zzguVar2 = zzicVar.f13099f;
                zzic.m(zzguVar2);
                zzguVar2.f12942f.b(str, "Failed to load EES program. appId");
                return;
            }
        }
        p2Var.r(str);
    }
}
