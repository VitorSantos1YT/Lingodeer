package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import mf.sOm.txBUGYhC;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.zzhs f13683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f13684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f13685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzad f13686d;

    public /* synthetic */ zzz(zzad zzadVar) {
        this.f13686d = zzadVar;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00f4 A[PHI: r8 r16 r17
      0x00f4: PHI (r8v7 android.database.Cursor) = (r8v6 android.database.Cursor), (r8v10 android.database.Cursor) binds: [B:61:0x011f, B:46:0x00ed] A[DONT_GENERATE, DONT_INLINE]
      0x00f4: PHI (r16v5 com.google.android.gms.internal.measurement.zzhs) = (r16v3 com.google.android.gms.internal.measurement.zzhs), (r16v10 com.google.android.gms.internal.measurement.zzhs) binds: [B:61:0x011f, B:46:0x00ed] A[DONT_GENERATE, DONT_INLINE]
      0x00f4: PHI (r17v4 long) = (r17v2 long), (r17v7 long) binds: [B:61:0x011f, B:46:0x00ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x01e3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21, types: [android.util.Pair] */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r8v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v6 */
    public final com.google.android.gms.internal.measurement.zzhs a(com.google.android.gms.internal.measurement.zzhs zzhsVar, String str) {
        ?? r9;
        com.google.android.gms.internal.measurement.zzhs zzhsVar2;
        long j11;
        Cursor cursorRawQuery;
        ?? r11;
        Object obj;
        Pair pair;
        String strD = zzhsVar.D();
        List listA = zzhsVar.A();
        zzad zzadVar = this.f13686d;
        zzpg zzpgVar = zzadVar.f13552b;
        zzpg zzpgVar2 = zzadVar.f13552b;
        zzic zzicVar = zzadVar.f13202a;
        zzpgVar.k0();
        com.google.android.gms.internal.measurement.zzhw zzhwVarQ = zzpk.q(zzhsVar, "_eid");
        Long l9 = (Long) (zzhwVarQ == null ? null : zzpk.y(zzhwVarQ));
        if (l9 != null) {
            ?? Equals = strD.equals("_ep");
            if (Equals != 0) {
                zzpgVar.k0();
                com.google.android.gms.internal.measurement.zzhw zzhwVarQ2 = zzpk.q(zzhsVar, "_en");
                String str2 = (String) (zzhwVarQ2 == null ? null : zzpk.y(zzhwVarQ2));
                if (TextUtils.isEmpty(str2)) {
                    zzgu zzguVar = zzicVar.f13099f;
                    zzic.m(zzguVar);
                    zzguVar.f12943g.b(l9, txBUGYhC.vFNPugmmOslR);
                    return null;
                }
                if (this.f13683a == null || this.f13684b == null || l9.longValue() != this.f13684b.longValue()) {
                    zzaw zzawVar = zzpgVar.f13597c;
                    zzpg.U(zzawVar);
                    zzic zzicVar2 = zzawVar.f13202a;
                    zzawVar.g();
                    zzawVar.h();
                    try {
                        try {
                            cursorRawQuery = zzawVar.X().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l9.toString()});
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    zzhsVar2 = null;
                                    try {
                                        try {
                                            Pair pairCreate = Pair.create((com.google.android.gms.internal.measurement.zzhs) ((com.google.android.gms.internal.measurement.zzhr) zzpk.R(com.google.android.gms.internal.measurement.zzhs.O(), cursorRawQuery.getBlob(0))).p(), Long.valueOf(cursorRawQuery.getLong(1)));
                                            cursorRawQuery.close();
                                            pair = pairCreate;
                                        } catch (IOException e8) {
                                            zzgu zzguVar2 = zzicVar2.f13099f;
                                            zzic.m(zzguVar2);
                                            j11 = 0;
                                            try {
                                                zzguVar2.f12942f.d("Failed to merge main event. appId, eventId", zzgu.o(str), l9, e8);
                                            } catch (SQLiteException e10) {
                                                e = e10;
                                                zzgu zzguVar3 = zzicVar2.f13099f;
                                                zzic.m(zzguVar3);
                                                zzguVar3.f12942f.b(e, "Error selecting main event");
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                r11 = zzhsVar2;
                                                if (r11 != 0) {
                                                }
                                                zzgu zzguVar4 = zzicVar.f13099f;
                                                zzic.m(zzguVar4);
                                                zzguVar4.f12943g.c(str2, l9, "Extra parameter without existing main event. eventName, eventId");
                                                return zzhsVar2;
                                            }
                                            cursorRawQuery.close();
                                            r11 = zzhsVar2;
                                        }
                                    } catch (SQLiteException e11) {
                                        e = e11;
                                        j11 = 0;
                                        zzgu zzguVar5 = zzicVar2.f13099f;
                                        zzic.m(zzguVar5);
                                        zzguVar5.f12942f.b(e, "Error selecting main event");
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        r11 = zzhsVar2;
                                    }
                                } else {
                                    zzgu zzguVar6 = zzicVar2.f13099f;
                                    zzic.m(zzguVar6);
                                    zzguVar6.f12949n.a("Main event not found");
                                    cursorRawQuery.close();
                                    pair = null;
                                    zzhsVar2 = null;
                                }
                                j11 = 0;
                                r11 = pair;
                            } catch (SQLiteException e12) {
                                e = e12;
                                zzhsVar2 = null;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r9 = Equals;
                            if (r9 != 0) {
                                r9.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e13) {
                        e = e13;
                        zzhsVar2 = null;
                        j11 = 0;
                        cursorRawQuery = null;
                    } catch (Throwable th3) {
                        th = th3;
                        r9 = 0;
                        if (r9 != 0) {
                            r9.close();
                        }
                        throw th;
                    }
                    if (r11 != 0 || (obj = ((Pair) r11).first) == null) {
                        zzgu zzguVar7 = zzicVar.f13099f;
                        zzic.m(zzguVar7);
                        zzguVar7.f12943g.c(str2, l9, "Extra parameter without existing main event. eventName, eventId");
                        return zzhsVar2;
                    }
                    this.f13683a = (com.google.android.gms.internal.measurement.zzhs) obj;
                    this.f13685c = ((Long) ((Pair) r11).second).longValue();
                    zzpgVar2.k0();
                    this.f13684b = (Long) zzpk.s(this.f13683a, "_eid");
                } else {
                    j11 = 0;
                }
                long j12 = this.f13685c - 1;
                this.f13685c = j12;
                if (j12 <= j11) {
                    zzaw zzawVar2 = zzpgVar2.f13597c;
                    zzpg.U(zzawVar2);
                    zzic zzicVar3 = zzawVar2.f13202a;
                    zzawVar2.g();
                    zzgu zzguVar8 = zzicVar3.f13099f;
                    zzic.m(zzguVar8);
                    zzguVar8.f12949n.b(str, "Clearing complex main event info. appId");
                    try {
                        zzawVar2.X().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e14) {
                        zzgu zzguVar9 = zzicVar3.f13099f;
                        zzic.m(zzguVar9);
                        zzguVar9.f12942f.b(e14, "Error clearing complex main event");
                    }
                } else {
                    zzaw zzawVar3 = zzpgVar2.f13597c;
                    zzpg.U(zzawVar3);
                    zzawVar3.y(str, l9, this.f13685c, this.f13683a);
                }
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.measurement.zzhw zzhwVar : this.f13683a.A()) {
                    zzpgVar2.k0();
                    if (zzpk.q(zzhsVar, zzhwVar.z()) == null) {
                        arrayList.add(zzhwVar);
                    }
                }
                if (arrayList.isEmpty()) {
                    zzgu zzguVar10 = zzicVar.f13099f;
                    zzic.m(zzguVar10);
                    zzguVar10.f12943g.b(str2, "No unique parameters in main event. eventName");
                } else {
                    arrayList.addAll(listA);
                    listA = arrayList;
                }
                strD = str2;
            } else {
                this.f13684b = l9;
                this.f13683a = zzhsVar;
                zzpgVar.k0();
                com.google.android.gms.internal.measurement.zzhw zzhwVarQ3 = zzpk.q(zzhsVar, "_epc");
                Serializable serializableY = zzhwVarQ3 == null ? null : zzpk.y(zzhwVarQ3);
                long jLongValue = ((Long) (serializableY != null ? serializableY : 0L)).longValue();
                this.f13685c = jLongValue;
                if (jLongValue <= 0) {
                    zzgu zzguVar11 = zzicVar.f13099f;
                    zzic.m(zzguVar11);
                    zzguVar11.f12943g.b(strD, "Complex event with zero extra param count. eventName");
                } else {
                    zzaw zzawVar4 = zzpgVar.f13597c;
                    zzpg.U(zzawVar4);
                    zzawVar4.y(str, l9, this.f13685c, zzhsVar);
                }
            }
        }
        com.google.android.gms.internal.measurement.zzhr zzhrVar = (com.google.android.gms.internal.measurement.zzhr) zzhsVar.q();
        zzhrVar.z(strD);
        zzhrVar.m();
        ((com.google.android.gms.internal.measurement.zzhs) zzhrVar.f11266b).S();
        zzhrVar.m();
        ((com.google.android.gms.internal.measurement.zzhs) zzhrVar.f11266b).R(listA);
        return (com.google.android.gms.internal.measurement.zzhs) zzhrVar.p();
    }
}
