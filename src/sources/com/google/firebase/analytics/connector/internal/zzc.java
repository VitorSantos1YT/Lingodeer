package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzjo;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ObjectArrays;
import com.google.common.collect.UnmodifiableListIterator;
import com.lingo.lingoskill.ruskill.ui.learn.mr.OCBJEWZHh;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ImmutableSet f17785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ImmutableList f17786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ImmutableList f17787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ImmutableList f17788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ImmutableList f17789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ImmutableList f17790f;

    public static boolean a(String str) {
        return !f17787c.contains(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean b(String str, Bundle bundle) {
        if (f17786b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        ImmutableList immutableList = f17788d;
        int size = immutableList.size();
        int i11 = 0;
        while (i11 < size) {
            boolean zContainsKey = bundle.containsKey((String) immutableList.get(i11));
            i11++;
            if (zContainsKey) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean c(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (f17789e.contains(str2)) {
            return false;
        }
        ImmutableList immutableList = f17790f;
        int size = immutableList.size();
        int i11 = 0;
        while (i11 < size) {
            boolean zMatches = str2.matches((String) immutableList.get(i11));
            i11++;
            if (zMatches) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean d(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!a(str) || bundle == null) {
            return false;
        }
        ImmutableList immutableList = f17788d;
        int size = immutableList.size();
        int i11 = 0;
        while (i11 < size) {
            boolean zContainsKey = bundle.containsKey((String) immutableList.get(i11));
            i11++;
            if (zContainsKey) {
                return false;
            }
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 101200) {
            if (iHashCode != 101230) {
                if (iHashCode == 3142703 && str.equals("fiam")) {
                    bundle.putString("_cis", "fiam_integration");
                    return true;
                }
            } else if (str.equals("fdl")) {
                bundle.putString("_cis", "fdl_integration");
                return true;
            }
        } else if (str.equals("fcm")) {
            bundle.putString("_cis", "fcm_integration");
            return true;
        }
        return false;
    }

    static {
        String[] strArr = {"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", OCBJEWZHh.aLRUIfotUPvsFot, "_exp_timeout", "_exp_expire"};
        int i11 = ImmutableSet.f16842c;
        Object[] objArr = new Object[15];
        objArr[0] = "_in";
        objArr[1] = "_xa";
        objArr[2] = "_xu";
        objArr[3] = "_aq";
        objArr[4] = "_aa";
        objArr[5] = "_ai";
        System.arraycopy(strArr, 0, objArr, 6, 9);
        f17785a = ImmutableSet.l(15, objArr);
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f16771b;
        Object[] objArr2 = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        ObjectArrays.a(7, objArr2);
        f17786b = ImmutableList.k(7, objArr2);
        Object[] objArr3 = {"auto", "app", "am"};
        ObjectArrays.a(3, objArr3);
        f17787c = ImmutableList.k(3, objArr3);
        f17788d = ImmutableList.v("_r", "_dbg");
        ImmutableList.Builder builder = new ImmutableList.Builder();
        builder.i(zzjo.f13218a);
        builder.i(zzjo.f13219b);
        f17789e = builder.j();
        f17790f = ImmutableList.v("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }
}
