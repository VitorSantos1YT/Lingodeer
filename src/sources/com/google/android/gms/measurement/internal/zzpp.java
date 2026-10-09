package com.google.android.gms.measurement.internal;

import a0.o0;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import androidx.lifecycle.lifecycle.viewmodel.anchor.hIIS.scqhIrGXy;
import b7.e0;
import com.adjust.sdk.Constants;
import com.alibaba.sdk.android.oss.common.OSSHeaders;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import ff.h;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.m;
import q9.b;
import s9.a;
import sz.xej.iFLeRCXvYCGdPW;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzpp extends zzjf {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f13645i = {"firebase_", "google_", "ga_"};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f13646j = {"_err"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SecureRandom f13647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f13648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f13650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Boolean f13651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f13652h;

    public zzpp(zzic zzicVar) {
        super(zzicVar);
        this.f13652h = null;
        this.f13648d = new AtomicLong(0L);
    }

    public static long A(byte[] bArr) {
        Preconditions.g(bArr);
        int length = bArr.length;
        int i11 = 0;
        Preconditions.j(length > 0);
        long j11 = 0;
        for (int i12 = length - 1; i12 >= 0 && i12 >= bArr.length - 8; i12--) {
            j11 += (((long) bArr[i12]) & 255) << i11;
            i11 += 8;
        }
        return j11;
    }

    public static boolean B(Context context) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) == null || !serviceInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static int D() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(1000000);
    }

    public static final boolean F(int i11, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i11);
        return true;
    }

    public static boolean I(String str, String[] strArr) {
        Preconditions.g(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean J(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equals("*") || Arrays.asList(str.split(",")).contains(str2);
    }

    public static boolean L(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static byte[] Q(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public static ArrayList b0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzah zzahVar = (zzah) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzahVar.f12620a);
            bundle.putString(OSSHeaders.ORIGIN, zzahVar.f12621b);
            bundle.putLong("creation_timestamp", zzahVar.f12623d);
            bundle.putString("name", zzahVar.f12622c.f13634b);
            Object objZza = zzahVar.f12622c.zza();
            Preconditions.g(objZza);
            zzjh.a(bundle, objZza);
            bundle.putBoolean("active", zzahVar.f12624e);
            String str = zzahVar.f12625f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzbh zzbhVar = zzahVar.f12626t;
            if (zzbhVar != null) {
                bundle.putString("timed_out_event_name", zzbhVar.f12702a);
                zzbf zzbfVar = zzbhVar.f12703b;
                if (zzbfVar != null) {
                    bundle.putBundle("timed_out_event_params", zzbfVar.G1());
                }
            }
            bundle.putLong("trigger_timeout", zzahVar.H);
            zzbh zzbhVar2 = zzahVar.K;
            if (zzbhVar2 != null) {
                bundle.putString("triggered_event_name", zzbhVar2.f12702a);
                zzbf zzbfVar2 = zzbhVar2.f12703b;
                if (zzbfVar2 != null) {
                    bundle.putBundle("triggered_event_params", zzbfVar2.G1());
                }
            }
            bundle.putLong("triggered_timestamp", zzahVar.f12622c.f13635c);
            bundle.putLong("time_to_live", zzahVar.L);
            zzbh zzbhVar3 = zzahVar.M;
            if (zzbhVar3 != null) {
                bundle.putString("expired_event_name", zzbhVar3.f12702a);
                zzbf zzbfVar3 = zzbhVar3.f12703b;
                if (zzbfVar3 != null) {
                    bundle.putBundle("expired_event_params", zzbfVar3.G1());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean c0(Context context) {
        ActivityInfo receiverInfo;
        Preconditions.g(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static void d0(zzlu zzluVar, Bundle bundle, boolean z11) {
        if (bundle != null && zzluVar != null) {
            if (!bundle.containsKey("_sc") || z11) {
                String str = zzluVar.f13355a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = zzluVar.f13356b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", zzluVar.f13357c);
                return;
            }
            z11 = false;
        }
        if (bundle != null && zzluVar == null && z11) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static boolean j0(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) {
            return true;
        }
        if (TextUtils.isEmpty(stringExtra)) {
            return false;
        }
        try {
            String host = new URL(stringExtra).getHost();
            if (TextUtils.isEmpty(host)) {
                return false;
            }
            return host.matches("^(www\\.)?google(\\.com?)?(\\.[a-z]{2}t?)?$");
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    public static String n(int i11, String str, boolean z11) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i11) {
            return str;
        }
        if (z11) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i11))).concat("...");
        }
        return null;
    }

    public static boolean t0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static void y(zzpo zzpoVar, String str, int i11, String str2, String str3, int i12) {
        Bundle bundle = new Bundle();
        F(i11, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i11 == 6 || i11 == 7 || i11 == 2) {
            bundle.putLong("_el", i12);
        }
        zzpoVar.a(str, "_err", bundle);
    }

    public static MessageDigest z() {
        for (int i11 = 0; i11 < 2; i11++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public final a C() {
        h bVar;
        Object objInvoke;
        if (this.f13650f == null) {
            Context context = this.f13202a.f13094a;
            m.f(context, "context");
            int i11 = Build.VERSION.SDK_INT;
            b bVar2 = b.f47591a;
            if (i11 >= 33) {
                bVar2.a();
            }
            if ((i11 >= 33 ? bVar2.a() : 0) >= 5) {
                bVar = new t9.b(context, 1);
            } else {
                q9.a aVar = q9.a.f47590a;
                if (((i11 == 31 || i11 == 32) ? aVar.a() : 0) >= 9) {
                    try {
                        objInvoke = new o0(context, 28).invoke(context);
                    } catch (NoClassDefFoundError unused) {
                        int i12 = Build.VERSION.SDK_INT;
                        if (i12 == 31 || i12 == 32) {
                            aVar.a();
                        }
                        objInvoke = null;
                    }
                    bVar = (h) objInvoke;
                } else {
                    bVar = null;
                }
            }
            this.f13650f = bVar != null ? new a(bVar) : null;
        }
        return this.f13650f;
    }

    public final long E() {
        long j11;
        boolean zBooleanValue;
        Integer num;
        Object e8;
        g();
        zzic zzicVar = this.f13202a;
        zzgi zzgiVarR = zzicVar.r();
        zzgu zzguVar = zzicVar.f13099f;
        if (!J((String) zzfy.f12876q0.a(null), zzgiVarR.m())) {
            return 0L;
        }
        if (Build.VERSION.SDK_INT < 30) {
            j11 = 4;
        } else if (SdkExtensions.getExtensionVersion(30) < 4) {
            j11 = 8;
        } else {
            j11 = D() < ((Integer) zzfy.f12865k0.a(null)).intValue() ? 16L : 0L;
        }
        if (!K("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j11 |= 2;
        }
        if (j11 == 0) {
            if (this.f13651g == null) {
                a aVarC = C();
                zBooleanValue = false;
                if (aVarC != null) {
                    try {
                        num = aVarC.b().get(10000L, TimeUnit.MILLISECONDS);
                        if (num != null) {
                            try {
                                if (num.intValue() == 1) {
                                    zBooleanValue = true;
                                }
                            } catch (InterruptedException e10) {
                                e8 = e10;
                                zzic.m(zzguVar);
                                zzguVar.f12945i.b(e8, "Measurement manager api exception");
                                this.f13651g = Boolean.FALSE;
                            } catch (CancellationException e11) {
                                e8 = e11;
                                zzic.m(zzguVar);
                                zzguVar.f12945i.b(e8, "Measurement manager api exception");
                                this.f13651g = Boolean.FALSE;
                            } catch (ExecutionException e12) {
                                e8 = e12;
                                zzic.m(zzguVar);
                                zzguVar.f12945i.b(e8, "Measurement manager api exception");
                                this.f13651g = Boolean.FALSE;
                            } catch (TimeoutException e13) {
                                e8 = e13;
                                zzic.m(zzguVar);
                                zzguVar.f12945i.b(e8, "Measurement manager api exception");
                                this.f13651g = Boolean.FALSE;
                            }
                        }
                        this.f13651g = Boolean.valueOf(zBooleanValue);
                    } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e14) {
                        num = null;
                        e8 = e14;
                    }
                    zzic.m(zzguVar);
                    zzguVar.f12949n.b(num, "Measurement manager api status result");
                    zBooleanValue = this.f13651g.booleanValue();
                }
            } else {
                zBooleanValue = this.f13651g.booleanValue();
            }
            if (!zBooleanValue) {
                j11 = 64;
            }
        }
        if (j11 == 0) {
            return 1L;
        }
        return j11;
    }

    public final Object G(int i11, Object obj, boolean z11, boolean z12) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return n(i11, obj.toString(), z11);
        }
        if (!z12) {
            return null;
        }
        if (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[])) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleN = N((Bundle) parcelable);
                if (!bundleN.isEmpty()) {
                    arrayList.add(bundleN);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final int H(String str) {
        boolean zEquals = "_ldl".equals(str);
        zzic zzicVar = this.f13202a;
        if (zEquals) {
            zzicVar.getClass();
            return 2048;
        }
        if ("_id".equals(str)) {
            zzicVar.getClass();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            zzicVar.getClass();
            return 100;
        }
        zzicVar.getClass();
        return 36;
    }

    public final boolean K(String str) {
        g();
        zzic zzicVar = this.f13202a;
        if (Wrappers.a(zzicVar.f13094a).f9142a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        zzgu zzguVar = zzicVar.f13099f;
        zzic.m(zzguVar);
        zzguVar.m.b(str, "Permission not granted");
        return false;
    }

    public final boolean M(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f13202a.f13097d.k("debug.firebase.analytics.app").equals(str);
    }

    public final Bundle N(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objP = p(bundle.get(str), str);
                if (objP == null) {
                    zzic zzicVar = this.f13202a;
                    zzgu zzguVar = zzicVar.f13099f;
                    zzic.m(zzguVar);
                    zzguVar.f12947k.b(zzicVar.f13103j.b(str), "Param value can't be null");
                } else {
                    x(bundle2, str, objP);
                }
            }
        }
        return bundle2;
    }

    public final zzbh O(String str, Bundle bundle, String str2, long j11, long j12, boolean z11) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (o0(str) != 0) {
            zzic zzicVar = this.f13202a;
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12942f.b(zzicVar.f13103j.c(str), "Invalid conditional property event name");
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle bundleQ = q(str, bundle2, Collections.singletonList("_o"), true);
        if (z11) {
            bundleQ = N(bundleQ);
        }
        Preconditions.g(bundleQ);
        return new zzbh(str, new zzbf(bundleQ), str2, j11, j12);
    }

    public final boolean P(Context context, String str) {
        Signature[] signatureArr;
        zzic zzicVar = this.f13202a;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoB = Wrappers.a(context).b(64, str);
            if (packageInfoB == null || (signatureArr = packageInfoB.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e8) {
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12942f.b(e8, "Package name not found");
            return true;
        } catch (CertificateException e10) {
            zzgu zzguVar2 = zzicVar.f13099f;
            zzic.m(zzguVar2);
            zzguVar2.f12942f.b(e10, "Error obtaining certificate");
            return true;
        }
    }

    public final boolean R(int i11) {
        Boolean bool = this.f13202a.p().f13490e;
        if (S() < i11 / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int S() {
        if (this.f13652h == null) {
            GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.f8646b;
            Context context = this.f13202a.f13094a;
            googleApiAvailabilityLight.getClass();
            AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.f8650a;
            int i11 = 0;
            try {
                i11 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
            }
            this.f13652h = Integer.valueOf(i11 / 1000);
        }
        return this.f13652h.intValue();
    }

    public final void T(Bundle bundle, long j11) {
        long j12 = bundle.getLong("_et");
        if (j12 != 0) {
            zzgu zzguVar = this.f13202a.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12945i.b(Long.valueOf(j12), "Params already contained engagement");
        } else {
            j12 = 0;
        }
        bundle.putLong("_et", j11 + j12);
    }

    public final void U(String str, com.google.android.gms.internal.measurement.zzcs zzcsVar) {
        try {
            zzcsVar.A0(e0.e("r", str));
        } catch (RemoteException e8) {
            zzgu zzguVar = this.f13202a.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12945i.b(e8, "Error returning string value to wrapper");
        }
    }

    public final void V(com.google.android.gms.internal.measurement.zzcs zzcsVar, long j11) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j11);
        try {
            zzcsVar.A0(bundle);
        } catch (RemoteException e8) {
            zzgu zzguVar = this.f13202a.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12945i.b(e8, "Error returning long value to wrapper");
        }
    }

    public final void W(com.google.android.gms.internal.measurement.zzcs zzcsVar, int i11) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i11);
        try {
            zzcsVar.A0(bundle);
        } catch (RemoteException e8) {
            zzgu zzguVar = this.f13202a.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12945i.b(e8, "Error returning int value to wrapper");
        }
    }

    public final void X(com.google.android.gms.internal.measurement.zzcs zzcsVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzcsVar.A0(bundle);
        } catch (RemoteException e8) {
            zzgu zzguVar = this.f13202a.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12945i.b(e8, "Error returning byte array to wrapper");
        }
    }

    public final void Y(com.google.android.gms.internal.measurement.zzcs zzcsVar, boolean z11) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z11);
        try {
            zzcsVar.A0(bundle);
        } catch (RemoteException e8) {
            zzgu zzguVar = this.f13202a.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12945i.b(e8, "Error returning boolean value to wrapper");
        }
    }

    public final void Z(com.google.android.gms.internal.measurement.zzcs zzcsVar, Bundle bundle) {
        try {
            zzcsVar.A0(bundle);
        } catch (RemoteException e8) {
            zzgu zzguVar = this.f13202a.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12945i.b(e8, "Error returning bundle value to wrapper");
        }
    }

    public final void a0(com.google.android.gms.internal.measurement.zzcs zzcsVar, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzcsVar.A0(bundle);
        } catch (RemoteException e8) {
            zzgu zzguVar = this.f13202a.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12945i.b(e8, "Error returning bundle list to wrapper");
        }
    }

    public final String e0() {
        byte[] bArr = new byte[16];
        g0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final long f0() {
        long andIncrement;
        long j11;
        AtomicLong atomicLong = this.f13648d;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.f13648d;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long jNanoTime = System.nanoTime();
            this.f13202a.f13104k.getClass();
            long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
            int i11 = this.f13649e + 1;
            this.f13649e = i11;
            j11 = jNextLong + ((long) i11);
        }
        return j11;
    }

    public final SecureRandom g0() {
        g();
        if (this.f13647c == null) {
            this.f13647c = new SecureRandom();
        }
        return this.f13647c;
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    public final boolean h() {
        return true;
    }

    public final Bundle i0(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        zzic zzicVar = this.f13202a;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    queryParameter = uri.getQueryParameter("utm_campaign");
                    queryParameter2 = uri.getQueryParameter("utm_source");
                    queryParameter3 = uri.getQueryParameter("utm_medium");
                    queryParameter4 = uri.getQueryParameter("gclid");
                    queryParameter5 = uri.getQueryParameter("gbraid");
                    queryParameter6 = uri.getQueryParameter("utm_id");
                    queryParameter7 = uri.getQueryParameter("dclid");
                    queryParameter8 = uri.getQueryParameter("srsltid");
                    queryParameter9 = uri.getQueryParameter("sfmc_id");
                } else {
                    queryParameter = null;
                    queryParameter2 = null;
                    queryParameter3 = null;
                    queryParameter4 = null;
                    queryParameter5 = null;
                    queryParameter6 = null;
                    queryParameter7 = null;
                    queryParameter8 = null;
                    queryParameter9 = null;
                }
                if (!TextUtils.isEmpty(queryParameter) || !TextUtils.isEmpty(queryParameter2) || !TextUtils.isEmpty(queryParameter3) || !TextUtils.isEmpty(queryParameter4) || !TextUtils.isEmpty(queryParameter5) || !TextUtils.isEmpty(queryParameter6) || !TextUtils.isEmpty(queryParameter7) || !TextUtils.isEmpty(queryParameter8) || !TextUtils.isEmpty(queryParameter9)) {
                    Bundle bundle = new Bundle();
                    if (!TextUtils.isEmpty(queryParameter)) {
                        bundle.putString("campaign", queryParameter);
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        bundle.putString("source", queryParameter2);
                    }
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        bundle.putString(Constants.MEDIUM, queryParameter3);
                    }
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        bundle.putString("gclid", queryParameter4);
                    }
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        bundle.putString("gbraid", queryParameter5);
                    }
                    String queryParameter10 = uri.getQueryParameter("gad_source");
                    if (!TextUtils.isEmpty(queryParameter10)) {
                        bundle.putString("gad_source", queryParameter10);
                    }
                    String queryParameter11 = uri.getQueryParameter("utm_term");
                    if (!TextUtils.isEmpty(queryParameter11)) {
                        bundle.putString("term", queryParameter11);
                    }
                    String queryParameter12 = uri.getQueryParameter("utm_content");
                    if (!TextUtils.isEmpty(queryParameter12)) {
                        bundle.putString("content", queryParameter12);
                    }
                    String queryParameter13 = uri.getQueryParameter("aclid");
                    if (!TextUtils.isEmpty(queryParameter13)) {
                        bundle.putString("aclid", queryParameter13);
                    }
                    String queryParameter14 = uri.getQueryParameter("cp1");
                    if (!TextUtils.isEmpty(queryParameter14)) {
                        bundle.putString("cp1", queryParameter14);
                    }
                    String queryParameter15 = uri.getQueryParameter("anid");
                    if (!TextUtils.isEmpty(queryParameter15)) {
                        bundle.putString("anid", queryParameter15);
                    }
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        bundle.putString("campaign_id", queryParameter6);
                    }
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        bundle.putString("dclid", queryParameter7);
                    }
                    String queryParameter16 = uri.getQueryParameter("utm_source_platform");
                    if (!TextUtils.isEmpty(queryParameter16)) {
                        bundle.putString("source_platform", queryParameter16);
                    }
                    String queryParameter17 = uri.getQueryParameter("utm_creative_format");
                    if (!TextUtils.isEmpty(queryParameter17)) {
                        bundle.putString("creative_format", queryParameter17);
                    }
                    String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
                    if (!TextUtils.isEmpty(queryParameter18)) {
                        bundle.putString("marketing_tactic", queryParameter18);
                    }
                    if (!TextUtils.isEmpty(queryParameter8)) {
                        bundle.putString("srsltid", queryParameter8);
                    }
                    if (!TextUtils.isEmpty(queryParameter9)) {
                        bundle.putString("sfmc_id", queryParameter9);
                    }
                    for (String str : uri.getQueryParameterNames()) {
                        if (str.startsWith("gad_")) {
                            String queryParameter19 = uri.getQueryParameter(str);
                            if (!TextUtils.isEmpty(queryParameter19)) {
                                bundle.putString(str, queryParameter19);
                            }
                        }
                    }
                    if (zzicVar.f13097d.r(null, zzfy.f12838a1)) {
                        String string = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath()).build().toString();
                        zzicVar.f13097d.getClass();
                        int iMax = Math.max(500, 256);
                        if (string.length() > iMax) {
                            string = n(iMax - 3, string, true);
                        }
                        if (!TextUtils.isEmpty(string)) {
                            bundle.putString("deep_link_url", string);
                        }
                    }
                    return bundle;
                }
            } catch (UnsupportedOperationException e8) {
                zzgu zzguVar = zzicVar.f13099f;
                zzic.m(zzguVar);
                zzguVar.f12945i.b(e8, "Install referrer url isn't a hierarchical URI");
                return null;
            }
        }
        return null;
    }

    public final boolean k(Object obj, int i11, String str, String str2) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String string = obj.toString();
        if (string.codePointCount(0, string.length()) > i11) {
            zzgu zzguVar = this.f13202a.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12947k.d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
            return false;
        }
        return true;
    }

    public final boolean k0(String str, String str2) {
        zzic zzicVar = this.f13202a;
        if (str2 == null) {
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12944h.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            zzgu zzguVar2 = zzicVar.f13099f;
            zzic.m(zzguVar2);
            zzguVar2.f12944h.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            zzgu zzguVar3 = zzicVar.f13099f;
            zzic.m(zzguVar3);
            zzguVar3.f12944h.c(str, str2, "Name must start with a letter. Type, name");
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                zzgu zzguVar4 = zzicVar.f13099f;
                zzic.m(zzguVar4);
                zzguVar4.f12944h.c(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final void l(String str, String str2, Bundle bundle, List list, boolean z11) {
        int iR0;
        int iO;
        list = list;
        if (bundle == null) {
            return;
        }
        zzic zzicVar = this.f13202a;
        zzal zzalVar = zzicVar.f13097d;
        zzgu zzguVar = zzicVar.f13099f;
        zzgn zzgnVar = zzicVar.f13103j;
        zzpp zzppVar = zzalVar.f13202a.f13102i;
        zzic.k(zzppVar);
        int i11 = true != zzppVar.R(231100000) ? 0 : 35;
        int i12 = 0;
        boolean z12 = false;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str3)) {
                iR0 = !z11 ? r0(str3) : 0;
                if (iR0 == 0) {
                    iR0 = s0(str3);
                }
            } else {
                iR0 = 0;
            }
            if (iR0 != 0) {
                u(bundle, iR0, str3, iR0 == 3 ? str3 : null);
                bundle.remove(str3);
            } else {
                if (t0(bundle.get(str3))) {
                    zzic.m(zzguVar);
                    zzguVar.f12947k.d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str3);
                    iO = 22;
                } else {
                    iO = o(str, str3, bundle.get(str3), bundle, list, z11, false);
                }
                if (iO != 0 && !"_ev".equals(str3)) {
                    u(bundle, iO, str3, bundle.get(str3));
                    bundle.remove(str3);
                } else if (h0(str3) && !I(str3, zzjn.f13217d)) {
                    i12++;
                    if (!R(231100000)) {
                        zzic.m(zzguVar);
                        zzguVar.f12944h.c(zzgnVar.a(str), zzgnVar.e(bundle), "Item array not supported on client's version of Google Play Services (Android Only)");
                        F(23, bundle);
                        bundle.remove(str3);
                    } else if (i12 > i11) {
                        if (!z12) {
                            zzic.m(zzguVar);
                            zzgs zzgsVar = zzguVar.f12944h;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 55);
                            sb2.append("Item can't contain more than ");
                            sb2.append(i11);
                            sb2.append(" item-scoped custom params");
                            zzgsVar.c(zzgnVar.a(str), zzgnVar.e(bundle), sb2.toString());
                        }
                        F(28, bundle);
                        bundle.remove(str3);
                        z12 = true;
                    }
                }
            }
        }
    }

    public final boolean l0(String str, String str2) {
        zzic zzicVar = this.f13202a;
        if (str2 == null) {
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12944h.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            zzgu zzguVar2 = zzicVar.f13099f;
            zzic.m(zzguVar2);
            zzguVar2.f12944h.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                zzgu zzguVar3 = zzicVar.f13099f;
                zzic.m(zzguVar3);
                zzguVar3.f12944h.c(str, str2, "Name must start with a letter or _ (underscore). Type, name");
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                zzgu zzguVar4 = zzicVar.f13099f;
                zzic.m(zzguVar4);
                zzguVar4.f12944h.c(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean m(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        zzic zzicVar = this.f13202a;
        if (zIsEmpty) {
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12944h.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        Preconditions.g(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        zzgu zzguVar2 = zzicVar.f13099f;
        zzic.m(zzguVar2);
        zzguVar2.f12944h.b(zzgu.o(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
        return false;
    }

    public final boolean n0(int i11, String str, String str2) {
        zzic zzicVar = this.f13202a;
        if (str2 == null) {
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12944h.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i11) {
            return true;
        }
        zzgu zzguVar2 = zzicVar.f13099f;
        zzic.m(zzguVar2);
        zzguVar2.f12944h.d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i11), str2);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0097  */
    public final int o(String str, String str2, Object obj, Bundle bundle, List list, boolean z11, boolean z12) {
        int i11;
        int size;
        g();
        boolean zT0 = t0(obj);
        zzic zzicVar = this.f13202a;
        int i12 = 0;
        if (!zT0) {
            i11 = 0;
        } else {
            if (!z12) {
                return 21;
            }
            if (!I(str2, zzjn.f13216c)) {
                return 20;
            }
            zznl zznlVarP = zzicVar.p();
            zznlVarP.g();
            zznlVarP.h();
            if (zznlVarP.n()) {
                zzpp zzppVar = zznlVarP.f13202a.f13102i;
                zzic.k(zzppVar);
                if (zzppVar.S() < 200900) {
                    return 25;
                }
            }
            boolean z13 = obj instanceof Parcelable[];
            if (z13) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            } else {
                i11 = 0;
            }
            if (size > 200) {
                zzgu zzguVar = zzicVar.f13099f;
                zzic.m(zzguVar);
                zzguVar.f12947k.d("Parameter array is too long; discarded. Value kind, name, array length", "param", str2, Integer.valueOf(size));
                i11 = 17;
                if (z13) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str2, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str2, new ArrayList<>(arrayList.subList(0, 200)));
                    }
                }
            } else {
                i11 = 0;
            }
        }
        int iMax = 500;
        if (L(str) || L(str2)) {
            zzicVar.f13097d.getClass();
            iMax = Math.max(500, 256);
        } else {
            zzicVar.f13097d.getClass();
        }
        if (!k(obj, iMax, "param", str2)) {
            if (!z12) {
                return 4;
            }
            if (obj instanceof Bundle) {
                l(str, str2, (Bundle) obj, list, z11);
                return i11;
            }
            if (obj instanceof Parcelable[]) {
                Parcelable[] parcelableArr2 = (Parcelable[]) obj;
                int length = parcelableArr2.length;
                while (i12 < length) {
                    Parcelable parcelable = parcelableArr2[i12];
                    if (!(parcelable instanceof Bundle)) {
                        zzgu zzguVar2 = zzicVar.f13099f;
                        zzic.m(zzguVar2);
                        zzguVar2.f12947k.c(parcelable.getClass(), str2, "All Parcelable[] elements must be of type Bundle. Value type, name");
                        return 4;
                    }
                    l(str, str2, (Bundle) parcelable, list, z11);
                    i12++;
                }
            } else {
                if (!(obj instanceof ArrayList)) {
                    return 4;
                }
                ArrayList arrayList2 = (ArrayList) obj;
                int size2 = arrayList2.size();
                while (i12 < size2) {
                    Object obj2 = arrayList2.get(i12);
                    if (!(obj2 instanceof Bundle)) {
                        zzgu zzguVar3 = zzicVar.f13099f;
                        zzic.m(zzguVar3);
                        zzguVar3.f12947k.c(obj2 != null ? obj2.getClass() : "null", str2, "All ArrayList elements must be of type Bundle. Value type, name");
                        return 4;
                    }
                    l(str, str2, (Bundle) obj2, list, z11);
                    i12++;
                }
            }
        }
        return i11;
    }

    public final int o0(String str) {
        if (!l0("event", str)) {
            return 2;
        }
        if (m0("event", zzjm.f13207a, this.f13202a.f13097d.r(null, zzfy.f1) ? zzjm.f13209c : zzjm.f13208b, str)) {
            return !n0(40, "event", str) ? 2 : 0;
        }
        return 13;
    }

    public final Object p(Object obj, String str) {
        boolean zEquals = "_ev".equals(str);
        int iMax = 500;
        zzic zzicVar = this.f13202a;
        if (zEquals) {
            zzicVar.f13097d.getClass();
            return G(Math.max(500, 256), obj, true, true);
        }
        if (L(str)) {
            zzicVar.f13097d.getClass();
            iMax = Math.max(500, 256);
        } else {
            zzicVar.f13097d.getClass();
        }
        return G(iMax, obj, false, true);
    }

    public final boolean p0(String str) {
        return this.f13202a.f13097d.r(null, zzfy.f1) ? I(str, zzjm.f13211e) : I(str, zzjm.f13210d);
    }

    public final Bundle q(String str, Bundle bundle, List list, boolean z11) {
        int iR0;
        boolean zI = I(str, zzjm.f13213g);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        zzic zzicVar = this.f13202a;
        zzal zzalVar = zzicVar.f13097d;
        zzgn zzgnVar = zzicVar.f13103j;
        zzpp zzppVar = zzalVar.f13202a.f13102i;
        zzic.k(zzppVar);
        int i11 = zzppVar.R(201500000) ? 100 : 25;
        int i12 = 0;
        boolean z12 = false;
        for (String str2 : new TreeSet(bundle.keySet())) {
            if (list == 0 || !list.contains(str2)) {
                iR0 = !z11 ? r0(str2) : 0;
                if (iR0 == 0) {
                    iR0 = s0(str2);
                }
            } else {
                iR0 = 0;
            }
            if (iR0 != 0) {
                u(bundle2, iR0, str2, iR0 == 3 ? str2 : null);
                bundle2.remove(str2);
            } else {
                int iO = o(str, str2, bundle.get(str2), bundle2, list, z11, zI);
                if (iO == 17) {
                    u(bundle2, 17, str2, Boolean.FALSE);
                } else if (iO != 0 && !"_ev".equals(str2)) {
                    u(bundle2, iO, iO == 21 ? str : str2, bundle.get(str2));
                    bundle2.remove(str2);
                }
                if (h0(str2)) {
                    i12++;
                    if (i12 > i11) {
                        if (!z12) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 37);
                            sb2.append("Event can't contain more than ");
                            sb2.append(i11);
                            sb2.append(" params");
                            String string = sb2.toString();
                            zzgu zzguVar = zzicVar.f13099f;
                            zzic.m(zzguVar);
                            zzguVar.f12944h.c(zzgnVar.a(str), zzgnVar.e(bundle), string);
                        }
                        F(5, bundle2);
                        bundle2.remove(str2);
                        z12 = true;
                    }
                }
            }
        }
        return bundle2;
    }

    public final int q0(String str) {
        if (!l0("user property", str)) {
            return 6;
        }
        if (!m0("user property", zzjo.f13218a, null, str)) {
            return 15;
        }
        this.f13202a.getClass();
        return !n0(24, "user property", str) ? 6 : 0;
    }

    public final void r(zzgv zzgvVar, int i11) {
        Bundle bundle = zzgvVar.f12954e;
        int i12 = 0;
        boolean z11 = false;
        for (String str : new TreeSet(bundle.keySet())) {
            if (h0(str) && (i12 = i12 + 1) > i11) {
                if (!z11) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 37);
                    sb2.append("Event can't contain more than ");
                    sb2.append(i11);
                    sb2.append(" params");
                    String string = sb2.toString();
                    zzic zzicVar = this.f13202a;
                    zzgu zzguVar = zzicVar.f13099f;
                    zzgn zzgnVar = zzicVar.f13103j;
                    zzic.m(zzguVar);
                    zzguVar.f12944h.c(zzgnVar.a(zzgvVar.f12950a), zzgnVar.e(bundle), string);
                    F(5, bundle);
                }
                bundle.remove(str);
                z11 = true;
            }
        }
    }

    public final int r0(String str) {
        if (!k0("event param", str)) {
            return 3;
        }
        if (!m0("event param", null, null, str)) {
            return 14;
        }
        this.f13202a.getClass();
        return !n0(40, "event param", str) ? 3 : 0;
    }

    public final void s(Parcelable[] parcelableArr, int i11) {
        Preconditions.g(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i12 = 0;
            boolean z11 = false;
            for (String str : new TreeSet(bundle.keySet())) {
                if (h0(str) && !I(str, zzjn.f13217d) && (i12 = i12 + 1) > i11) {
                    if (!z11) {
                        zzic zzicVar = this.f13202a;
                        zzgu zzguVar = zzicVar.f13099f;
                        zzgn zzgnVar = zzicVar.f13103j;
                        zzic.m(zzguVar);
                        zzgs zzgsVar = zzguVar.f12944h;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 60);
                        sb2.append("Param can't contain more than ");
                        sb2.append(i11);
                        sb2.append(" item-scoped custom parameters");
                        zzgsVar.c(zzgnVar.b(str), zzgnVar.e(bundle), sb2.toString());
                    }
                    F(28, bundle);
                    bundle.remove(str);
                    z11 = true;
                }
            }
        }
    }

    public final int s0(String str) {
        if (!l0("event param", str)) {
            return 3;
        }
        if (!m0("event param", null, null, str)) {
            return 14;
        }
        this.f13202a.getClass();
        return !n0(40, "event param", str) ? 3 : 0;
    }

    public final void t(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                zzpp zzppVar = this.f13202a.f13102i;
                zzic.k(zzppVar);
                zzppVar.x(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void u(Bundle bundle, int i11, String str, Object obj) {
        if (F(i11, bundle)) {
            this.f13202a.getClass();
            bundle.putString("_ev", n(40, str, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final int v(Object obj, String str) {
        return "_ldl".equals(str) ? k(obj, H(str), "user property referrer", str) : k(obj, H(str), "user property", str) ? 0 : 7;
    }

    public final Object w(Object obj, String str) {
        return "_ldl".equals(str) ? G(H(str), obj, true, false) : G(H(str), obj, false, false);
    }

    public final void x(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
            return;
        }
        if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            zzic zzicVar = this.f13202a;
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12947k.c(zzicVar.f13103j.b(str), simpleName, "Not putting event parameter. Invalid value type. name, type");
        }
    }

    public final boolean m0(String str, String[] strArr, String[] strArr2, String str2) {
        zzic zzicVar = this.f13202a;
        if (str2 == null) {
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12944h.b(str, "Name is required and can't be null. Type");
            return false;
        }
        for (int i11 = 0; i11 < 3; i11++) {
            if (str2.startsWith(f13645i[i11])) {
                zzgu zzguVar2 = zzicVar.f13099f;
                zzic.m(zzguVar2);
                zzguVar2.f12944h.c(str, str2, scqhIrGXy.VwBjEZlxbGf);
                return false;
            }
        }
        if (strArr == null || !I(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && I(str2, strArr2)) {
            return true;
        }
        zzgu zzguVar3 = zzicVar.f13099f;
        zzic.m(zzguVar3);
        zzguVar3.f12944h.c(str, str2, "Name is reserved. Type, name");
        return false;
    }

    public static boolean h0(String str) {
        Preconditions.d(str);
        if (str.charAt(0) == '_' && !str.equals(iFLeRCXvYCGdPW.dFuNJktaE)) {
            return false;
        }
        return true;
    }
}
