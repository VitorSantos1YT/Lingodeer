package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.lifecycle.livedata.HeRS.DytezVyM;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.zzadf;
import com.google.android.gms.internal.measurement.zzadp;
import com.google.android.gms.internal.measurement.zzaee;
import com.google.android.gms.internal.measurement.zzaef;
import com.google.android.gms.internal.measurement.zzaeh;
import com.google.android.gms.internal.measurement.zzafb;
import com.google.android.gms.internal.measurement.zzaif;
import com.google.android.gms.internal.measurement.zzair;
import com.google.android.gms.internal.measurement.zzais;
import com.google.type.bACG.scNRoQgKSYX;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ep.a;
import i0.pKy.shrCcjmOhAmRC;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeParseException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import su.Mbl.tcppUUQxZjFdy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzpk extends zzos {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f13631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f13632e;

    public static final void A(StringBuilder sb2, String str, com.google.android.gms.internal.measurement.zzii zziiVar) {
        if (zziiVar == null) {
            return;
        }
        v(3, sb2);
        sb2.append(str);
        sb2.append(" {\n");
        if (zziiVar.B() != 0) {
            v(4, sb2);
            sb2.append("results: ");
            int i11 = 0;
            for (Long l9 : zziiVar.A()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l9);
                i11 = i12;
            }
            sb2.append('\n');
        }
        if (zziiVar.z() != 0) {
            v(4, sb2);
            sb2.append("status: ");
            int i13 = 0;
            for (Long l11 : zziiVar.y()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l11);
                i13 = i14;
            }
            sb2.append('\n');
        }
        if (zziiVar.D() != 0) {
            v(4, sb2);
            sb2.append("dynamic_filter_timestamps: {");
            int i15 = 0;
            for (com.google.android.gms.internal.measurement.zzhq zzhqVar : zziiVar.C()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb2.append(", ");
                }
                sb2.append(zzhqVar.y() ? Integer.valueOf(zzhqVar.z()) : null);
                sb2.append(":");
                sb2.append(zzhqVar.A() ? Long.valueOf(zzhqVar.B()) : null);
                i15 = i16;
            }
            sb2.append("}\n");
        }
        if (zziiVar.F() != 0) {
            v(4, sb2);
            sb2.append("sequence_filter_timestamps: {");
            int i17 = 0;
            for (com.google.android.gms.internal.measurement.zzik zzikVar : zziiVar.E()) {
                int i18 = i17 + 1;
                if (i17 != 0) {
                    sb2.append(", ");
                }
                sb2.append(zzikVar.y() ? Integer.valueOf(zzikVar.z()) : null);
                sb2.append(": [");
                Iterator it = zzikVar.A().iterator();
                int i19 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i21 = i19 + 1;
                    if (i19 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(jLongValue);
                    i19 = i21;
                }
                sb2.append("]");
                i17 = i18;
            }
            sb2.append("}\n");
        }
        v(3, sb2);
        sb2.append("}\n");
    }

    public static final void B(StringBuilder sb2, int i11, String str, Object obj) {
        if (obj == null) {
            return;
        }
        v(i11 + 1, sb2);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    public static boolean K(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean L(zzaee zzaeeVar, int i11) {
        if (i11 < zzaeeVar.size() * 64) {
            return ((1 << (i11 % 64)) & ((Long) zzaeeVar.get(i11 / 64)).longValue()) != 0;
        }
        return false;
    }

    public static ArrayList M(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i11 = 0; i11 < length; i11++) {
            long j11 = 0;
            for (int i12 = 0; i12 < 64; i12++) {
                int i13 = (i11 * 64) + i12;
                if (i13 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i13)) {
                    j11 |= 1 << i12;
                }
            }
            arrayList.add(Long.valueOf(j11));
        }
        return arrayList;
    }

    public static zzafb R(zzadp zzadpVar, byte[] bArr) throws zzaeh {
        zzadf zzadfVarA = zzadf.a();
        if (zzadfVarA != null) {
            zzadpVar.getClass();
            zzadpVar.r(bArr, bArr.length, zzadfVarA);
            return zzadpVar;
        }
        zzadpVar.getClass();
        zzadpVar.l(bArr, bArr.length);
        return zzadpVar;
    }

    public static int S(com.google.android.gms.internal.measurement.zzic zzicVar, String str) {
        for (int i11 = 0; i11 < ((com.google.android.gms.internal.measurement.zzid) zzicVar.f11266b).g2(); i11++) {
            if (str.equals(((com.google.android.gms.internal.measurement.zzid) zzicVar.f11266b).h2(i11).A())) {
                return i11;
            }
        }
        return -1;
    }

    public static Bundle[] T(zzaef zzaefVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = zzaefVar.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.zzhw zzhwVar = (com.google.android.gms.internal.measurement.zzhw) it.next();
            if (zzhwVar != null) {
                Bundle bundle = new Bundle();
                for (com.google.android.gms.internal.measurement.zzhw zzhwVar2 : zzhwVar.I()) {
                    if (zzhwVar2.A()) {
                        bundle.putString(zzhwVar2.z(), zzhwVar2.B());
                    } else if (zzhwVar2.C()) {
                        bundle.putLong(zzhwVar2.z(), zzhwVar2.D());
                    } else if (zzhwVar2.G()) {
                        bundle.putDouble(zzhwVar2.z(), zzhwVar2.H());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static HashMap U(Bundle bundle, boolean z11) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z12 = obj instanceof Parcelable[];
            if (z12 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z11) {
                    ArrayList arrayList = new ArrayList();
                    if (z12) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(U((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            Object obj2 = arrayList2.get(i11);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(U((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(U((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    public static zzbh k(com.google.android.gms.internal.measurement.zzaa zzaaVar) {
        Object obj;
        Bundle bundleL = l(zzaaVar.f11127c, true);
        String string = (!bundleL.containsKey("_o") || (obj = bundleL.get("_o")) == null) ? "app" : obj.toString();
        String strB = zzlt.b(zzaaVar.f11125a, zzjm.f13207a, zzjm.f13212f);
        if (strB == null) {
            strB = zzaaVar.f11125a;
        }
        return new zzbh(strB, new zzbf(bundleL), string, zzaaVar.f11126b, 0L);
    }

    public static Bundle l(Map map, boolean z11) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z11) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    arrayList2.add(l((Map) arrayList.get(i11), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public static final void o(com.google.android.gms.internal.measurement.zzhr zzhrVar, String str, Long l9) {
        List listS = zzhrVar.s();
        int i11 = 0;
        while (true) {
            if (i11 >= listS.size()) {
                i11 = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.zzhw) listS.get(i11)).z())) {
                break;
            } else {
                i11++;
            }
        }
        com.google.android.gms.internal.measurement.zzhv zzhvVarK = com.google.android.gms.internal.measurement.zzhw.K();
        zzhvVarK.s(str);
        zzhvVarK.u(l9.longValue());
        if (i11 < 0) {
            zzhrVar.w(zzhvVarK);
        } else {
            zzhrVar.m();
            ((com.google.android.gms.internal.measurement.zzhs) zzhrVar.f11266b).P(i11, (com.google.android.gms.internal.measurement.zzhw) zzhvVarK.p());
        }
    }

    public static final Bundle p(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.zzhw zzhwVar = (com.google.android.gms.internal.measurement.zzhw) it.next();
            String strZ = zzhwVar.z();
            if (zzhwVar.G()) {
                bundle.putDouble(strZ, zzhwVar.H());
            } else if (zzhwVar.E()) {
                bundle.putFloat(strZ, zzhwVar.F());
            } else if (zzhwVar.A()) {
                bundle.putString(strZ, zzhwVar.B());
            } else if (zzhwVar.C()) {
                bundle.putLong(strZ, zzhwVar.D());
            }
        }
        return bundle;
    }

    public static final com.google.android.gms.internal.measurement.zzhw q(com.google.android.gms.internal.measurement.zzhs zzhsVar, String str) {
        for (com.google.android.gms.internal.measurement.zzhw zzhwVar : zzhsVar.A()) {
            if (zzhwVar.z().equals(str)) {
                return zzhwVar;
            }
        }
        return null;
    }

    public static final String r(String str, Map map) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (entry.getValue() == null || ((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    public static final Serializable s(com.google.android.gms.internal.measurement.zzhs zzhsVar, String str) {
        com.google.android.gms.internal.measurement.zzhw zzhwVarQ = q(zzhsVar, str);
        if (zzhwVarQ == null) {
            return null;
        }
        return y(zzhwVarQ);
    }

    public static final void v(int i11, StringBuilder sb2) {
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append("  ");
        }
    }

    public static final void w(Uri.Builder builder, String str, String str2, HashSet hashSet) {
        if (hashSet.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public static final String x(boolean z11, boolean z12, boolean z13) {
        StringBuilder sb2 = new StringBuilder();
        if (z11) {
            sb2.append("Dynamic ");
        }
        if (z12) {
            sb2.append("Sequence ");
        }
        if (z13) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable y(com.google.android.gms.internal.measurement.zzhw zzhwVar) {
        if (zzhwVar.A()) {
            return zzhwVar.B();
        }
        if (zzhwVar.C()) {
            return Long.valueOf(zzhwVar.D());
        }
        if (zzhwVar.G()) {
            return Double.valueOf(zzhwVar.H());
        }
        if (zzhwVar.J() > 0) {
            return T(zzhwVar.I());
        }
        return null;
    }

    public static final void z(Uri.Builder builder, String[] strArr, Bundle bundle, HashSet hashSet) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                w(builder, str3, string, hashSet);
            }
        }
    }

    public final void D(com.google.android.gms.internal.measurement.zzit zzitVar, Object obj) {
        Preconditions.g(obj);
        zzitVar.m();
        ((com.google.android.gms.internal.measurement.zziu) zzitVar.f11266b).N();
        zzitVar.m();
        ((com.google.android.gms.internal.measurement.zziu) zzitVar.f11266b).P();
        zzitVar.m();
        ((com.google.android.gms.internal.measurement.zziu) zzitVar.f11266b).R();
        if (obj instanceof String) {
            zzitVar.m();
            ((com.google.android.gms.internal.measurement.zziu) zzitVar.f11266b).M((String) obj);
        } else if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            zzitVar.m();
            ((com.google.android.gms.internal.measurement.zziu) zzitVar.f11266b).O(jLongValue);
        } else if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            zzitVar.m();
            ((com.google.android.gms.internal.measurement.zziu) zzitVar.f11266b).Q(dDoubleValue);
        } else {
            zzgu zzguVar = this.f13202a.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12942f.b(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    public final void E(com.google.android.gms.internal.measurement.zzhv zzhvVar, Object obj) {
        zzhvVar.m();
        ((com.google.android.gms.internal.measurement.zzhw) zzhvVar.f11266b).N();
        zzhvVar.m();
        ((com.google.android.gms.internal.measurement.zzhw) zzhvVar.f11266b).P();
        zzhvVar.m();
        ((com.google.android.gms.internal.measurement.zzhw) zzhvVar.f11266b).R();
        zzhvVar.m();
        ((com.google.android.gms.internal.measurement.zzhw) zzhvVar.f11266b).U();
        if (obj instanceof String) {
            zzhvVar.t((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzhvVar.u(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            zzhvVar.m();
            ((com.google.android.gms.internal.measurement.zzhw) zzhvVar.f11266b).Q(dDoubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            zzgu zzguVar = this.f13202a.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12942f.b(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                com.google.android.gms.internal.measurement.zzhv zzhvVarK = com.google.android.gms.internal.measurement.zzhw.K();
                for (String str : bundle.keySet()) {
                    com.google.android.gms.internal.measurement.zzhv zzhvVarK2 = com.google.android.gms.internal.measurement.zzhw.K();
                    zzhvVarK2.s(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        zzhvVarK2.u(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        zzhvVarK2.t((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double dDoubleValue2 = ((Double) obj2).doubleValue();
                        zzhvVarK2.m();
                        ((com.google.android.gms.internal.measurement.zzhw) zzhvVarK2.f11266b).Q(dDoubleValue2);
                    }
                    zzhvVarK.m();
                    ((com.google.android.gms.internal.measurement.zzhw) zzhvVarK.f11266b).S((com.google.android.gms.internal.measurement.zzhw) zzhvVarK2.p());
                }
                if (((com.google.android.gms.internal.measurement.zzhw) zzhvVarK.f11266b).J() > 0) {
                    arrayList.add((com.google.android.gms.internal.measurement.zzhw) zzhvVarK.p());
                }
            }
        }
        zzhvVar.m();
        ((com.google.android.gms.internal.measurement.zzhw) zzhvVar.f11266b).T(arrayList);
    }

    public final zzoh F(String str, com.google.android.gms.internal.measurement.zzic zzicVar, com.google.android.gms.internal.measurement.zzhr zzhrVar, String str2) {
        int iIndexOf;
        zzaif.a();
        zzic zzicVar2 = this.f13202a;
        zzal zzalVar = zzicVar2.f13097d;
        if (!zzalVar.r(str, zzfy.O0)) {
            return null;
        }
        zzicVar2.f13104k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashSet hashSet = new HashSet(Arrays.asList(zzalVar.n(str, zzfy.f12882t0).split(",")));
        zzpg zzpgVar = this.f13552b;
        zzou zzouVar = zzpgVar.f13604j;
        zzht zzhtVar = zzpgVar.f13595a;
        zzht zzhtVar2 = zzouVar.f13552b.f13595a;
        zzpg.U(zzhtVar2);
        String strT = zzhtVar2.t(str);
        Uri.Builder builder = new Uri.Builder();
        zzal zzalVar2 = zzouVar.f13202a.f13097d;
        builder.scheme(zzalVar2.n(str, zzfy.f12868m0));
        if (TextUtils.isEmpty(strT)) {
            builder.authority(zzalVar2.n(str, zzfy.f12870n0));
        } else {
            String strN = zzalVar2.n(str, zzfy.f12870n0);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strT).length() + 1 + String.valueOf(strN).length());
            sb2.append(strT);
            sb2.append(".");
            sb2.append(strN);
            builder.authority(sb2.toString());
        }
        builder.path(zzalVar2.n(str, zzfy.f12872o0));
        w(builder, "gmp_app_id", ((com.google.android.gms.internal.measurement.zzid) zzicVar.f11266b).N(), hashSet);
        zzalVar.m();
        w(builder, "gmp_version", String.valueOf(161000L), hashSet);
        String strH = ((com.google.android.gms.internal.measurement.zzid) zzicVar.f11266b).H();
        zzfx zzfxVar = zzfy.R0;
        if (zzalVar.r(str, zzfxVar)) {
            zzpg.U(zzhtVar);
            if (zzhtVar.A(str)) {
                strH = BuildConfig.VERSION_NAME;
            }
        }
        w(builder, "app_instance_id", strH, hashSet);
        w(builder, "rdid", ((com.google.android.gms.internal.measurement.zzid) zzicVar.f11266b).E(), hashSet);
        w(builder, "bundle_id", zzicVar.z(), hashSet);
        String strY = zzhrVar.y();
        String strB = zzlt.b(strY, zzjm.f13212f, zzjm.f13207a);
        if (true != TextUtils.isEmpty(strB)) {
            strY = strB;
        }
        w(builder, "app_event_name", strY, hashSet);
        w(builder, "app_version", String.valueOf(((com.google.android.gms.internal.measurement.zzid) zzicVar.f11266b).T()), hashSet);
        String strT2 = ((com.google.android.gms.internal.measurement.zzid) zzicVar.f11266b).t2();
        if (zzalVar.r(str, zzfxVar)) {
            zzpg.U(zzhtVar);
            if (zzhtVar.z(str) && !TextUtils.isEmpty(strT2) && (iIndexOf = strT2.indexOf(".")) != -1) {
                strT2 = strT2.substring(0, iIndexOf);
            }
        }
        w(builder, "os_version", strT2, hashSet);
        w(builder, "timestamp", String.valueOf(zzhrVar.A()), hashSet);
        if (((com.google.android.gms.internal.measurement.zzid) zzicVar.f11266b).G()) {
            w(builder, "lat", "1", hashSet);
        }
        w(builder, "privacy_sandbox_version", String.valueOf(((com.google.android.gms.internal.measurement.zzid) zzicVar.f11266b).P0()), hashSet);
        w(builder, "trigger_uri_source", "1", hashSet);
        w(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), hashSet);
        w(builder, "request_uuid", str2, hashSet);
        List<com.google.android.gms.internal.measurement.zzhw> listS = zzhrVar.s();
        Bundle bundle = new Bundle();
        for (com.google.android.gms.internal.measurement.zzhw zzhwVar : listS) {
            String strZ = zzhwVar.z();
            if (zzhwVar.G()) {
                bundle.putString(strZ, String.valueOf(zzhwVar.H()));
            } else if (zzhwVar.E()) {
                bundle.putString(strZ, String.valueOf(zzhwVar.F()));
            } else if (zzhwVar.A()) {
                bundle.putString(strZ, zzhwVar.B());
            } else if (zzhwVar.C()) {
                bundle.putString(strZ, String.valueOf(zzhwVar.D()));
            }
        }
        z(builder, zzalVar.n(str, zzfy.f12880s0).split("\\|"), bundle, hashSet);
        List<com.google.android.gms.internal.measurement.zziu> listUnmodifiableList = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.zzid) zzicVar.f11266b).f2());
        Bundle bundle2 = new Bundle();
        for (com.google.android.gms.internal.measurement.zziu zziuVar : listUnmodifiableList) {
            String strA = zziuVar.A();
            if (zziuVar.H()) {
                bundle2.putString(strA, String.valueOf(zziuVar.I()));
            } else if (zziuVar.F()) {
                bundle2.putString(strA, String.valueOf(zziuVar.G()));
            } else if (zziuVar.B()) {
                bundle2.putString(strA, zziuVar.C());
            } else if (zziuVar.D()) {
                bundle2.putString(strA, String.valueOf(zziuVar.E()));
            }
        }
        z(builder, zzalVar.n(str, zzfy.f12878r0).split("\\|"), bundle2, hashSet);
        w(builder, "dma", true != ((com.google.android.gms.internal.measurement.zzid) zzicVar.f11266b).M0() ? "0" : "1", hashSet);
        if (!((com.google.android.gms.internal.measurement.zzid) zzicVar.f11266b).O0().isEmpty()) {
            w(builder, "dma_cps", ((com.google.android.gms.internal.measurement.zzid) zzicVar.f11266b).O0(), hashSet);
        }
        if (((com.google.android.gms.internal.measurement.zzid) zzicVar.f11266b).V0()) {
            com.google.android.gms.internal.measurement.zzha zzhaVarW0 = ((com.google.android.gms.internal.measurement.zzid) zzicVar.f11266b).W0();
            if (!zzhaVarW0.M().isEmpty()) {
                w(builder, "dl_gclid", zzhaVarW0.M(), hashSet);
            }
            if (!zzhaVarW0.O().isEmpty()) {
                w(builder, "dl_gbraid", zzhaVarW0.O(), hashSet);
            }
            if (!zzhaVarW0.Q().isEmpty()) {
                w(builder, "dl_gs", zzhaVarW0.Q(), hashSet);
            }
            if (zzhaVarW0.S() > 0) {
                w(builder, "dl_ss_ts", String.valueOf(zzhaVarW0.S()), hashSet);
            }
            if (!zzhaVarW0.U().isEmpty()) {
                w(builder, "mr_gclid", zzhaVarW0.U(), hashSet);
            }
            if (!zzhaVarW0.W().isEmpty()) {
                w(builder, "mr_gbraid", zzhaVarW0.W(), hashSet);
            }
            if (!zzhaVarW0.Y().isEmpty()) {
                w(builder, "mr_gs", zzhaVarW0.Y(), hashSet);
            }
            if (zzhaVarW0.a0() > 0) {
                w(builder, "mr_click_ts", String.valueOf(zzhaVarW0.a0()), hashSet);
            }
        }
        return new zzoh(builder.build().toString(), jCurrentTimeMillis, 1);
    }

    public final com.google.android.gms.internal.measurement.zzhs G(zzbc zzbcVar) {
        com.google.android.gms.internal.measurement.zzhr zzhrVarO = com.google.android.gms.internal.measurement.zzhs.O();
        long j11 = zzbcVar.f12687f;
        zzhrVarO.m();
        ((com.google.android.gms.internal.measurement.zzhs) zzhrVarO.f11266b).W(j11);
        long j12 = zzbcVar.f12686e;
        zzhrVarO.m();
        ((com.google.android.gms.internal.measurement.zzhs) zzhrVarO.f11266b).y(j12);
        zzbf zzbfVar = zzbcVar.f12688g;
        zzbe zzbeVar = new zzbe(zzbfVar);
        Bundle bundle = zzbfVar.f12701a;
        while (true) {
            Iterator it = zzbeVar.f12700a;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            com.google.android.gms.internal.measurement.zzhv zzhvVarK = com.google.android.gms.internal.measurement.zzhw.K();
            zzhvVarK.s(str);
            Object obj = bundle.get(str);
            Preconditions.g(obj);
            E(zzhvVarK, obj);
            zzhrVarO.w(zzhvVarK);
        }
        String str2 = zzbcVar.f12684c;
        if (!TextUtils.isEmpty(str2) && bundle.get("_o") == null) {
            com.google.android.gms.internal.measurement.zzhv zzhvVarK2 = com.google.android.gms.internal.measurement.zzhw.K();
            zzhvVarK2.s("_o");
            zzhvVarK2.t(str2);
            zzhrVarO.v((com.google.android.gms.internal.measurement.zzhw) zzhvVarK2.p());
        }
        return (com.google.android.gms.internal.measurement.zzhs) zzhrVarO.p();
    }

    public final String I(com.google.android.gms.internal.measurement.zzfn zzfnVar) {
        StringBuilder sbN = a.n("\nproperty_filter {\n");
        if (zzfnVar.y()) {
            B(sbN, 0, "filter_id", Integer.valueOf(zzfnVar.z()));
        }
        B(sbN, 0, "property_name", this.f13202a.f13103j.c(zzfnVar.A()));
        String strX = x(zzfnVar.C(), zzfnVar.D(), zzfnVar.F());
        if (!strX.isEmpty()) {
            B(sbN, 0, "filter_type", strX);
        }
        u(sbN, 1, zzfnVar.B());
        sbN.append("}\n");
        return sbN.toString();
    }

    public final Parcelable J(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
        } catch (SafeParcelReader.ParseException unused) {
            zzgu zzguVar = this.f13202a.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12942f.a("Failed to load parcelable from buffer");
        } finally {
            parcelObtain.recycle();
        }
        return parcelable;
    }

    public final List N(zzaee zzaeeVar, List list) {
        int i11;
        ArrayList arrayList = new ArrayList(zzaeeVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int iIntValue = num.intValue();
            zzic zzicVar = this.f13202a;
            if (iIntValue < 0) {
                zzgu zzguVar = zzicVar.f13099f;
                zzic.m(zzguVar);
                zzguVar.f12945i.b(num, "Ignoring negative bit index to be cleared");
            } else {
                int iIntValue2 = num.intValue() / 64;
                if (iIntValue2 >= arrayList.size()) {
                    zzgu zzguVar2 = zzicVar.f13099f;
                    zzic.m(zzguVar2);
                    zzguVar2.f12945i.c(num, Integer.valueOf(arrayList.size()), "Ignoring bit index greater than bitSet size");
                } else {
                    arrayList.set(iIntValue2, Long.valueOf(((Long) arrayList.get(iIntValue2)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i12 = size2;
            i11 = size;
            size = i12;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i11);
    }

    public final boolean O(long j11, long j12) {
        if (j11 == 0 || j12 <= 0) {
            return true;
        }
        this.f13202a.f13104k.getClass();
        return Math.abs(System.currentTimeMillis() - j11) > j12;
    }

    public final long P(byte[] bArr) {
        Preconditions.g(bArr);
        zzic zzicVar = this.f13202a;
        zzpp zzppVar = zzicVar.f13102i;
        zzic.k(zzppVar);
        zzppVar.g();
        MessageDigest messageDigestZ = zzpp.z();
        if (messageDigestZ != null) {
            return zzpp.A(messageDigestZ.digest(bArr));
        }
        zzgu zzguVar = zzicVar.f13099f;
        zzic.m(zzguVar);
        zzguVar.f12942f.a("Failed to get MD5");
        return 0L;
    }

    public final byte[] Q(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e8) {
            zzgu zzguVar = this.f13202a.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12942f.b(e8, "Failed to gzip content");
            throw e8;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzos
    public final void j() {
    }

    public final void m(Map map) {
        long epochMilli;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            String strR = r(HttpHeaders.DATE, map);
            if (TextUtils.isEmpty(strR)) {
                return;
            }
            zzic zzicVar = this.f13202a;
            if (i11 >= 26) {
                try {
                    epochMilli = ZonedDateTime.parse(strR, DateTimeFormatter.RFC_1123_DATE_TIME).toInstant().toEpochMilli();
                } catch (DateTimeParseException unused) {
                    zzgu zzguVar = zzicVar.f13099f;
                    zzic.m(zzguVar);
                    zzguVar.f12945i.b(strR, "Unable to parse header time, time");
                    epochMilli = 0;
                }
            } else {
                epochMilli = 0;
            }
            if (epochMilli > 0) {
                zzicVar.f13104k.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                g();
                if (this.f13632e == 0) {
                    this.f13631d = jElapsedRealtime;
                    this.f13632e = epochMilli;
                }
            }
        }
    }

    public final long n(long j11) {
        g();
        long j12 = this.f13632e;
        if (j12 == 0 || j11 == 0) {
            return 0L;
        }
        return (j12 - this.f13631d) + j11;
    }

    public final void t(StringBuilder sb2, int i11, zzaef zzaefVar) {
        if (zzaefVar == null) {
            return;
        }
        int i12 = i11 + 1;
        Iterator<E> it = zzaefVar.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.zzhw zzhwVar = (com.google.android.gms.internal.measurement.zzhw) it.next();
            if (zzhwVar != null) {
                v(i12, sb2);
                sb2.append("param {\n");
                B(sb2, i12, "name", zzhwVar.y() ? this.f13202a.f13103j.b(zzhwVar.z()) : null);
                B(sb2, i12, "string_value", zzhwVar.A() ? zzhwVar.B() : null);
                B(sb2, i12, "int_value", zzhwVar.C() ? Long.valueOf(zzhwVar.D()) : null);
                B(sb2, i12, "double_value", zzhwVar.G() ? Double.valueOf(zzhwVar.H()) : null);
                if (zzhwVar.J() > 0) {
                    t(sb2, i12, zzhwVar.I());
                }
                v(i12, sb2);
                sb2.append("}\n");
            }
        }
    }

    public static final void C(StringBuilder sb2, int i11, String str, com.google.android.gms.internal.measurement.zzfl zzflVar) {
        String str2;
        if (zzflVar == null) {
            return;
        }
        v(i11, sb2);
        sb2.append(str);
        sb2.append(" {\n");
        if (zzflVar.y()) {
            int I = zzflVar.I();
            if (I == 1) {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            } else if (I == 2) {
                str2 = "LESS_THAN";
            } else if (I != 3) {
                str2 = I != 4 ? "BETWEEN" : "EQUAL";
            } else {
                str2 = "GREATER_THAN";
            }
            B(sb2, i11, "comparison_type", str2);
        }
        if (zzflVar.z()) {
            B(sb2, i11, "match_as_float", Boolean.valueOf(zzflVar.A()));
        }
        if (zzflVar.B()) {
            B(sb2, i11, "comparison_value", zzflVar.C());
        }
        if (zzflVar.D()) {
            B(sb2, i11, "min_comparison_value", zzflVar.E());
        }
        if (zzflVar.F()) {
            B(sb2, i11, "max_comparison_value", zzflVar.G());
        }
        v(i11, sb2);
        sb2.append(tcppUUQxZjFdy.nPthSvnZ);
    }

    public final String H(com.google.android.gms.internal.measurement.zzib zzibVar) {
        String str;
        String str2;
        String str3;
        com.google.android.gms.internal.measurement.zzhe zzheVarR0;
        if (zzibVar == null) {
            return BuildConfig.VERSION_NAME;
        }
        StringBuilder sbN = a.n("\nbatch {\n");
        if (zzibVar.D()) {
            B(sbN, 0, "upload_subdomain", zzibVar.E());
        }
        if (zzibVar.B()) {
            B(sbN, 0, "sgtm_join_id", zzibVar.C());
        }
        for (com.google.android.gms.internal.measurement.zzid zzidVar : zzibVar.y()) {
            if (zzidVar != null) {
                v(1, sbN);
                sbN.append("bundle {\n");
                if (zzidVar.Y()) {
                    B(sbN, 1, "protocol_version", Integer.valueOf(zzidVar.Z0()));
                }
                ((zzais) zzair.f11425b.f11426a.get()).getClass();
                zzic zzicVar = this.f13202a;
                zzal zzalVar = zzicVar.f13097d;
                zzgn zzgnVar = zzicVar.f13103j;
                if (zzalVar.r(zzidVar.y(), zzfy.M0) && zzidVar.E0()) {
                    B(sbN, 1, "session_stitching_token", zzidVar.F0());
                }
                B(sbN, 1, "platform", zzidVar.s2());
                if (zzidVar.A()) {
                    B(sbN, 1, "gmp_version", Long.valueOf(zzidVar.B()));
                }
                if (zzidVar.C()) {
                    B(sbN, 1, "uploading_gmp_version", Long.valueOf(zzidVar.D()));
                }
                if (zzidVar.A0()) {
                    B(sbN, 1, "dynamite_version", Long.valueOf(zzidVar.B0()));
                }
                if (zzidVar.U()) {
                    B(sbN, 1, "config_version", Long.valueOf(zzidVar.V()));
                }
                B(sbN, 1, "gmp_app_id", zzidVar.N());
                B(sbN, 1, "app_id", zzidVar.y());
                B(sbN, 1, "app_version", zzidVar.z());
                if (zzidVar.S()) {
                    B(sbN, 1, "app_version_major", Integer.valueOf(zzidVar.T()));
                }
                B(sbN, 1, "firebase_instance_id", zzidVar.R());
                if (zzidVar.I()) {
                    B(sbN, 1, "dev_cert_hash", Long.valueOf(zzidVar.J()));
                }
                B(sbN, 1, "app_store", zzidVar.y2());
                if (zzidVar.i2()) {
                    B(sbN, 1, "upload_timestamp_millis", Long.valueOf(zzidVar.j2()));
                }
                if (zzidVar.k2()) {
                    B(sbN, 1, "start_timestamp_millis", Long.valueOf(zzidVar.l2()));
                }
                if (zzidVar.m2()) {
                    B(sbN, 1, "end_timestamp_millis", Long.valueOf(zzidVar.n2()));
                }
                if (zzidVar.o2()) {
                    B(sbN, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzidVar.p2()));
                }
                if (zzidVar.q2()) {
                    B(sbN, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzidVar.r2()));
                }
                B(sbN, 1, "app_instance_id", zzidVar.H());
                B(sbN, 1, "resettable_device_id", zzidVar.E());
                B(sbN, 1, "ds_id", zzidVar.X());
                if (zzidVar.F()) {
                    B(sbN, 1, "limited_ad_tracking", Boolean.valueOf(zzidVar.G()));
                }
                B(sbN, 1, "os_version", zzidVar.t2());
                B(sbN, 1, shrCcjmOhAmRC.GBxyQtmoW, zzidVar.u2());
                B(sbN, 1, "user_default_language", zzidVar.v2());
                if (zzidVar.w2()) {
                    B(sbN, 1, "time_zone_offset_minutes", Integer.valueOf(zzidVar.x2()));
                }
                if (zzidVar.K()) {
                    B(sbN, 1, scNRoQgKSYX.IBFeCGNSlTkq, Integer.valueOf(zzidVar.L()));
                }
                if (zzidVar.T0()) {
                    B(sbN, 1, "delivery_index", Integer.valueOf(zzidVar.U0()));
                }
                if (zzidVar.O()) {
                    B(sbN, 1, "service_upload", Boolean.valueOf(zzidVar.P()));
                }
                B(sbN, 1, "health_monitor", zzidVar.M());
                if (zzidVar.y0()) {
                    B(sbN, 1, "retry_counter", Integer.valueOf(zzidVar.z0()));
                }
                if (zzidVar.C0()) {
                    B(sbN, 1, "consent_signals", zzidVar.D0());
                }
                if (zzidVar.L0()) {
                    B(sbN, 1, "is_dma_region", Boolean.valueOf(zzidVar.M0()));
                }
                if (zzidVar.N0()) {
                    B(sbN, 1, "core_platform_services", zzidVar.O0());
                }
                if (zzidVar.J0()) {
                    B(sbN, 1, "consent_diagnostics", zzidVar.K0());
                }
                if (zzidVar.G0()) {
                    B(sbN, 1, "target_os_version", Long.valueOf(zzidVar.H0()));
                }
                zzaif.a();
                if (zzalVar.r(zzidVar.y(), zzfy.O0)) {
                    B(sbN, 1, "ad_services_version", Integer.valueOf(zzidVar.P0()));
                    if (zzidVar.Q0() && (zzheVarR0 = zzidVar.R0()) != null) {
                        v(2, sbN);
                        sbN.append("attribution_eligibility_status {\n");
                        B(sbN, 2, "eligible", Boolean.valueOf(zzheVarR0.y()));
                        B(sbN, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(zzheVarR0.z()));
                        B(sbN, 2, "pre_r", Boolean.valueOf(zzheVarR0.A()));
                        B(sbN, 2, "r_extensions_too_old", Boolean.valueOf(zzheVarR0.B()));
                        B(sbN, 2, "adservices_extension_too_old", Boolean.valueOf(zzheVarR0.C()));
                        B(sbN, 2, "ad_storage_not_allowed", Boolean.valueOf(zzheVarR0.D()));
                        B(sbN, 2, "measurement_manager_disabled", Boolean.valueOf(zzheVarR0.E()));
                        v(2, sbN);
                        sbN.append("}\n");
                    }
                }
                if (zzidVar.V0()) {
                    com.google.android.gms.internal.measurement.zzha zzhaVarW0 = zzidVar.W0();
                    v(2, sbN);
                    sbN.append("ad_campaign_info {\n");
                    if (zzhaVarW0.L()) {
                        B(sbN, 2, "deep_link_gclid", zzhaVarW0.M());
                    }
                    if (zzhaVarW0.N()) {
                        B(sbN, 2, "deep_link_gbraid", zzhaVarW0.O());
                    }
                    if (zzhaVarW0.P()) {
                        B(sbN, 2, "deep_link_gad_source", zzhaVarW0.Q());
                    }
                    if (zzhaVarW0.b0()) {
                        B(sbN, 2, "deep_link_url", zzhaVarW0.c0());
                    }
                    if (zzhaVarW0.R()) {
                        B(sbN, 2, "deep_link_session_millis", Long.valueOf(zzhaVarW0.S()));
                    }
                    if (zzhaVarW0.T()) {
                        B(sbN, 2, "market_referrer_gclid", zzhaVarW0.U());
                    }
                    if (zzhaVarW0.V()) {
                        B(sbN, 2, "market_referrer_gbraid", zzhaVarW0.W());
                    }
                    if (zzhaVarW0.X()) {
                        B(sbN, 2, "market_referrer_gad_source", zzhaVarW0.Y());
                    }
                    if (zzhaVarW0.Z()) {
                        B(sbN, 2, "market_referrer_click_millis", Long.valueOf(zzhaVarW0.a0()));
                    }
                    v(2, sbN);
                    sbN.append("}\n");
                }
                if (zzidVar.Z()) {
                    B(sbN, 1, "batching_timestamp_millis", Long.valueOf(zzidVar.a0()));
                }
                if (zzidVar.X0()) {
                    com.google.android.gms.internal.measurement.zzis zzisVarY0 = zzidVar.Y0();
                    v(2, sbN);
                    sbN.append("sgtm_diagnostics {\n");
                    int iC = zzisVarY0.C();
                    if (iC == 1) {
                        str2 = "UPLOAD_TYPE_UNKNOWN";
                    } else if (iC == 2) {
                        str2 = "GA_UPLOAD";
                    } else if (iC != 3) {
                        str2 = iC != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD";
                    } else {
                        str2 = "SDK_CLIENT_UPLOAD";
                    }
                    B(sbN, 2, "upload_type", str2);
                    B(sbN, 2, "client_upload_eligibility", zzisVarY0.y().name());
                    int iD = zzisVarY0.D();
                    if (iD == 1) {
                        str3 = "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN";
                    } else if (iD == 2) {
                        str3 = "SERVICE_UPLOAD_ELIGIBLE";
                    } else if (iD == 3) {
                        str3 = "NOT_IN_ROLLOUT";
                    } else if (iD != 4) {
                        str3 = iD != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO";
                    } else {
                        str3 = "MISSING_SGTM_SETTINGS";
                    }
                    B(sbN, 2, "service_upload_eligibility", str3);
                    v(2, sbN);
                    sbN.append("}\n");
                }
                if (zzidVar.b0()) {
                    com.google.android.gms.internal.measurement.zzho zzhoVarC0 = zzidVar.c0();
                    v(2, sbN);
                    sbN.append("consent_info_extra {\n");
                    for (com.google.android.gms.internal.measurement.zzhl zzhlVar : zzhoVarC0.y()) {
                        v(3, sbN);
                        sbN.append("limited_data_modes {\n");
                        int iZ = zzhlVar.z();
                        if (iZ == 1) {
                            str = "CONSENT_TYPE_UNSPECIFIED";
                        } else if (iZ == 2) {
                            str = "AD_STORAGE";
                        } else if (iZ != 3) {
                            str = iZ != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA";
                        } else {
                            str = "ANALYTICS_STORAGE";
                        }
                        B(sbN, 3, "type", str);
                        int iA = zzhlVar.A();
                        B(sbN, 3, "mode", iA != 1 ? iA != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        v(3, sbN);
                        sbN.append("}\n");
                    }
                    v(2, sbN);
                    sbN.append("}\n");
                }
                zzaef<com.google.android.gms.internal.measurement.zziu> zzaefVarF2 = zzidVar.f2();
                if (zzaefVarF2 != null) {
                    for (com.google.android.gms.internal.measurement.zziu zziuVar : zzaefVarF2) {
                        if (zziuVar != null) {
                            v(2, sbN);
                            sbN.append("user_property {\n");
                            B(sbN, 2, "set_timestamp_millis", zziuVar.y() ? Long.valueOf(zziuVar.z()) : null);
                            B(sbN, 2, "name", zzgnVar.c(zziuVar.A()));
                            B(sbN, 2, "string_value", zziuVar.C());
                            B(sbN, 2, "int_value", zziuVar.D() ? Long.valueOf(zziuVar.E()) : null);
                            B(sbN, 2, "double_value", zziuVar.H() ? Double.valueOf(zziuVar.I()) : null);
                            v(2, sbN);
                            sbN.append("}\n");
                        }
                    }
                }
                zzaef<com.google.android.gms.internal.measurement.zzhg> zzaefVarQ = zzidVar.Q();
                if (zzaefVarQ != null) {
                    for (com.google.android.gms.internal.measurement.zzhg zzhgVar : zzaefVarQ) {
                        if (zzhgVar != null) {
                            v(2, sbN);
                            sbN.append("audience_membership {\n");
                            if (zzhgVar.y()) {
                                B(sbN, 2, "audience_id", Integer.valueOf(zzhgVar.z()));
                            }
                            if (zzhgVar.D()) {
                                B(sbN, 2, "new_audience", Boolean.valueOf(zzhgVar.E()));
                            }
                            A(sbN, "current_data", zzhgVar.A());
                            if (zzhgVar.B()) {
                                A(sbN, "previous_data", zzhgVar.C());
                            }
                            v(2, sbN);
                            sbN.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.zzhs> listZ1 = zzidVar.Z1();
                if (listZ1 != null) {
                    for (com.google.android.gms.internal.measurement.zzhs zzhsVar : listZ1) {
                        if (zzhsVar != null) {
                            v(2, sbN);
                            sbN.append("event {\n");
                            B(sbN, 2, "name", zzgnVar.a(zzhsVar.D()));
                            if (zzhsVar.E()) {
                                B(sbN, 2, "timestamp_millis", Long.valueOf(zzhsVar.F()));
                            }
                            if (zzalVar.r(null, zzfy.e1) && zzhsVar.K()) {
                                B(sbN, 2, "corrected_timestamp_millis", Long.valueOf(zzhsVar.L()));
                            }
                            if (zzhsVar.G()) {
                                B(sbN, 2, "previous_timestamp_millis", Long.valueOf(zzhsVar.H()));
                            }
                            if (zzhsVar.I()) {
                                B(sbN, 2, "count", Integer.valueOf(zzhsVar.J()));
                            }
                            if (zzhsVar.B() != 0) {
                                t(sbN, 2, (zzaef) zzhsVar.A());
                            }
                            v(2, sbN);
                            sbN.append("}\n");
                        }
                    }
                }
                v(1, sbN);
                sbN.append("}\n");
            }
        }
        sbN.append("} // End-of-batch\n");
        return sbN.toString();
    }

    public final void u(StringBuilder sb2, int i11, com.google.android.gms.internal.measurement.zzfh zzfhVar) {
        String str;
        if (zzfhVar == null) {
            return;
        }
        v(i11, sb2);
        sb2.append("filter {\n");
        if (zzfhVar.C()) {
            B(sb2, i11, DytezVyM.VTD, Boolean.valueOf(zzfhVar.D()));
        }
        if (zzfhVar.E()) {
            B(sb2, i11, "param_name", this.f13202a.f13103j.b(zzfhVar.F()));
        }
        if (zzfhVar.y()) {
            int i12 = i11 + 1;
            com.google.android.gms.internal.measurement.zzfr zzfrVarZ = zzfhVar.z();
            if (zzfrVarZ != null) {
                v(i12, sb2);
                sb2.append("string_filter {\n");
                if (zzfrVarZ.y()) {
                    switch (zzfrVarZ.G()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    B(sb2, i12, "match_type", str);
                }
                if (zzfrVarZ.z()) {
                    B(sb2, i12, "expression", zzfrVarZ.A());
                }
                if (zzfrVarZ.B()) {
                    B(sb2, i12, "case_sensitive", Boolean.valueOf(zzfrVarZ.C()));
                }
                if (zzfrVarZ.E() > 0) {
                    v(i11 + 2, sb2);
                    sb2.append("expression_list {\n");
                    for (String str2 : zzfrVarZ.D()) {
                        v(i11 + 3, sb2);
                        sb2.append(str2);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                v(i12, sb2);
                sb2.append("}\n");
            }
        }
        if (zzfhVar.A()) {
            C(sb2, i11 + 1, "number_filter", zzfhVar.B());
        }
        v(i11, sb2);
        sb2.append("}\n");
    }
}
