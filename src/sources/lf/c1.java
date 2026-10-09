package lf;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.google.zxing.pdf417.decoder.vBn.xTCJ;
import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import lt.AJC.PQgum;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c1 f39979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f39980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f39981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f39982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Integer[] f39983e;

    static {
        ArrayList arrayListB;
        c1 c1Var = new c1();
        f39979a = c1Var;
        f39980b = c1Var.a();
        HashMap map = null;
        if (qf.a.b(c1Var)) {
            arrayListB = null;
        } else {
            try {
                arrayListB = ns.o.b(new b1(0));
                arrayListB.addAll(c1Var.a());
            } catch (Throwable th2) {
                qf.a.a(c1Var, th2);
                arrayListB = null;
            }
        }
        c1 c1Var2 = f39979a;
        if (!qf.a.b(c1Var2)) {
            try {
                HashMap map2 = new HashMap();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new b1(3));
                ArrayList arrayList2 = f39980b;
                map2.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", arrayList2);
                map2.put("com.facebook.platform.action.request.FEED_DIALOG", arrayList2);
                map2.put("com.facebook.platform.action.request.LIKE_DIALOG", arrayList2);
                map2.put("com.facebook.platform.action.request.APPINVITES_DIALOG", arrayList2);
                map2.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList);
                map2.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList);
                map2.put("com.facebook.platform.action.request.CAMERA_EFFECT", arrayListB);
                map2.put("com.facebook.platform.action.request.SHARE_STORY", arrayList2);
                map = map2;
            } catch (Throwable th3) {
                qf.a.a(c1Var2, th3);
            }
        }
        f39981c = map;
        f39982d = new AtomicBoolean(false);
        f39983e = new Integer[]{20210906, 20171115, 20170417, 20170411, 20170213, 20161017, 20160327, 20150702, 20150401, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140313, 20140204, 20131107, 20131024, 20130618, 20130502, 20121101};
    }

    public static final int b(TreeSet treeSet, int i11, int[] iArr) {
        if (qf.a.b(c1.class)) {
            return 0;
        }
        if (treeSet != null) {
            try {
                int length = iArr.length - 1;
                Iterator itDescendingIterator = treeSet.descendingIterator();
                int iMax = -1;
                while (itDescendingIterator.hasNext()) {
                    Integer fbAppVersion = (Integer) itDescendingIterator.next();
                    kotlin.jvm.internal.m.e(fbAppVersion, "fbAppVersion");
                    iMax = Math.max(iMax, fbAppVersion.intValue());
                    while (length >= 0 && iArr[length] > fbAppVersion.intValue()) {
                        length--;
                    }
                    if (length < 0) {
                        break;
                    }
                    if (iArr[length] == fbAppVersion.intValue()) {
                        if (length % 2 != 0) {
                            break;
                        }
                        return Math.min(iMax, i11);
                    }
                }
            } catch (Throwable th2) {
                qf.a.a(c1.class, th2);
                return 0;
            }
        }
        return -1;
    }

    public static final Bundle c(FacebookException facebookException) {
        if (qf.a.b(c1.class) || facebookException == null) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("error_description", facebookException.toString());
            if (!(facebookException instanceof FacebookOperationCanceledException)) {
                return bundle;
            }
            bundle.putString("error_type", "UserCanceled");
            return bundle;
        } catch (Throwable th2) {
            qf.a.a(c1.class, th2);
            return null;
        }
    }

    public static final Intent e(Context context) {
        if (!qf.a.b(c1.class)) {
            try {
                kotlin.jvm.internal.m.f(context, "context");
                ArrayList arrayList = f39980b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    Intent intentAddCategory = new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(((b1) obj).b()).addCategory("android.intent.category.DEFAULT");
                    if (qf.a.b(c1.class) || intentAddCategory == null) {
                        intentAddCategory = null;
                    } else {
                        try {
                            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intentAddCategory, 0);
                            if (resolveInfoResolveService != null) {
                                String str = resolveInfoResolveService.serviceInfo.packageName;
                                kotlin.jvm.internal.m.e(str, "resolveInfo.serviceInfo.packageName");
                                if (!s.a(context, str)) {
                                }
                            }
                        } catch (Throwable th2) {
                            qf.a.a(c1.class, th2);
                        }
                        intentAddCategory = null;
                    }
                    if (intentAddCategory != null) {
                        return intentAddCategory;
                    }
                }
            } catch (Throwable th3) {
                qf.a.a(c1.class, th3);
                return null;
            }
        }
        return null;
    }

    public static final Bundle h(Intent intent) {
        if (qf.a.b(c1.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.m.f(intent, "intent");
            if (o(n(intent))) {
                return intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
            }
            return null;
        } catch (Throwable th2) {
            qf.a.a(c1.class, th2);
            return null;
        }
    }

    public static final FacebookException j(Bundle bundle) {
        if (qf.a.b(c1.class) || bundle == null) {
            return null;
        }
        try {
            String string = bundle.getString("error_type");
            if (string == null) {
                string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
            }
            String string2 = bundle.getString("error_description");
            if (string2 == null) {
                string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
            }
            return (string == null || !string.equalsIgnoreCase("UserCanceled")) ? new FacebookException(string2) : new FacebookOperationCanceledException(string2);
        } catch (Throwable th2) {
            qf.a.a(c1.class, th2);
            return null;
        }
    }

    public static final int l() {
        if (qf.a.b(c1.class)) {
            return 0;
        }
        try {
            return f39983e[0].intValue();
        } catch (Throwable th2) {
            qf.a.a(c1.class, th2);
            return 0;
        }
    }

    public static final Bundle m(Intent intent) {
        if (qf.a.b(c1.class)) {
            return null;
        }
        try {
            return !o(n(intent)) ? intent.getExtras() : intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        } catch (Throwable th2) {
            qf.a.a(c1.class, th2);
            return null;
        }
    }

    public static final int n(Intent intent) {
        if (qf.a.b(c1.class)) {
            return 0;
        }
        try {
            kotlin.jvm.internal.m.f(intent, "intent");
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        } catch (Throwable th2) {
            qf.a.a(c1.class, th2);
            return 0;
        }
    }

    public static final boolean o(int i11) {
        if (qf.a.b(c1.class)) {
            return false;
        }
        try {
            return ry.l.D(f39983e, Integer.valueOf(i11)) && i11 >= 20140701;
        } catch (Throwable th2) {
            qf.a.a(c1.class, th2);
            return false;
        }
    }

    public static final void p(Intent intent, String str, String str2, int i11, Bundle bundle) {
        if (qf.a.b(c1.class)) {
            return;
        }
        try {
            String strB = re.s.b();
            v0.m();
            String str3 = re.s.f49205e;
            intent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", i11).putExtra("com.facebook.platform.protocol.PROTOCOL_ACTION", str2).putExtra("com.facebook.platform.extra.APPLICATION_ID", strB);
            if (!o(i11)) {
                intent.putExtra("com.facebook.platform.protocol.CALL_ID", str);
                if (!j1.y(str3)) {
                    intent.putExtra("com.facebook.platform.extra.APPLICATION_NAME", str3);
                }
                if (bundle != null) {
                    intent.putExtras(bundle);
                    return;
                }
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("action_id", str);
            j1.G("app_name", str3, bundle2);
            intent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
            if (bundle == null) {
                bundle = new Bundle();
            }
            intent.putExtra("com.facebook.platform.protocol.METHOD_ARGS", bundle);
        } catch (Throwable th2) {
            qf.a.a(c1.class, th2);
        }
    }

    public static final void q() {
        if (qf.a.b(c1.class)) {
            return;
        }
        try {
            if (f39982d.compareAndSet(false, true)) {
                re.s.d().execute(new cf.c(10));
            }
        } catch (Throwable th2) {
            qf.a.a(c1.class, th2);
        }
    }

    public static final Intent r(Context context, Intent intent) {
        if (!qf.a.b(c1.class) && intent != null) {
            try {
                ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 0);
                if (resolveInfoResolveActivity != null) {
                    String str = resolveInfoResolveActivity.activityInfo.packageName;
                    kotlin.jvm.internal.m.e(str, "resolveInfo.activityInfo.packageName");
                    if (s.a(context, str)) {
                        return intent;
                    }
                }
            } catch (Throwable th2) {
                qf.a.a(c1.class, th2);
                return null;
            }
        }
        return null;
    }

    public final ArrayList a() {
        if (qf.a.b(this)) {
            return null;
        }
        try {
            return ns.o.b(new b1(2), new b1(4));
        } catch (Throwable th2) {
            qf.a.a(this, th2);
            return null;
        }
    }

    public final Intent d(b1 b1Var, String str, Collection collection, String str2, boolean z11, tf.e eVar, String str3, String str4, boolean z12, String str5, boolean z13, tf.h0 h0Var, boolean z14, boolean z15, String str6) {
        String str7;
        if (!qf.a.b(this)) {
            try {
                String str8 = "com.facebook.katana.ProxyAuth";
                switch (b1Var.f39971b) {
                    case 0:
                    case 3:
                        str8 = null;
                        break;
                    case 1:
                        str8 = "com.instagram.platform.AppAuthorizeActivity";
                        break;
                }
                if (str8 != null) {
                    Intent intentPutExtra = new Intent().setClassName(b1Var.b(), str8).putExtra("client_id", str);
                    kotlin.jvm.internal.m.e(intentPutExtra, "Intent()\n            .se…PP_ID_KEY, applicationId)");
                    re.s sVar = re.s.f49201a;
                    intentPutExtra.putExtra("facebook_sdk_version", "18.1.3");
                    if (!(collection == null || collection.isEmpty())) {
                        intentPutExtra.putExtra("scope", TextUtils.join(",", collection));
                    }
                    if (!j1.y(str2)) {
                        intentPutExtra.putExtra("e2e", str2);
                    }
                    intentPutExtra.putExtra("state", str3);
                    switch (b1Var.f39971b) {
                        case 1:
                            str7 = "token,signed_request,graph_domain,granted_scopes";
                            break;
                        default:
                            str7 = "id_token,token,signed_request,graph_domain";
                            break;
                    }
                    intentPutExtra.putExtra("response_type", str7);
                    intentPutExtra.putExtra("nonce", str6);
                    intentPutExtra.putExtra("return_scopes", "true");
                    if (z11) {
                        intentPutExtra.putExtra("default_audience", eVar.a());
                    }
                    intentPutExtra.putExtra("legacy_override", re.s.e());
                    intentPutExtra.putExtra("auth_type", str4);
                    if (z12) {
                        intentPutExtra.putExtra("fail_on_logged_out", true);
                    }
                    intentPutExtra.putExtra("messenger_page_id", str5);
                    intentPutExtra.putExtra("reset_messenger_state", z13);
                    if (z14) {
                        intentPutExtra.putExtra("fx_app", h0Var.toString());
                    }
                    if (z15) {
                        intentPutExtra.putExtra("skip_dedupe", true);
                    }
                    return intentPutExtra;
                }
            } catch (Throwable th2) {
                qf.a.a(this, th2);
                return null;
            }
        }
        return null;
    }

    public final TreeSet g(b1 b1Var) {
        Uri uri;
        Throwable th2;
        Cursor cursor;
        ProviderInfo providerInfoResolveContentProvider;
        Cursor cursorQuery;
        if (qf.a.b(this)) {
            return null;
        }
        try {
            TreeSet treeSet = new TreeSet();
            ContentResolver contentResolver = re.s.a().getContentResolver();
            String[] strArr = {"version"};
            if (qf.a.b(this)) {
                uri = null;
            } else {
                try {
                    Uri uri2 = Uri.parse("content://" + b1Var.b() + ".provider.PlatformProvider/versions");
                    kotlin.jvm.internal.m.e(uri2, "parse(CONTENT_SCHEME + a…ATFORM_PROVIDER_VERSIONS)");
                    uri = uri2;
                } catch (Throwable th3) {
                    qf.a.a(this, th3);
                    uri = null;
                }
            }
            try {
                try {
                    providerInfoResolveContentProvider = re.s.a().getPackageManager().resolveContentProvider(b1Var.b().concat(".provider.PlatformProvider"), 0);
                } catch (RuntimeException unused) {
                    providerInfoResolveContentProvider = null;
                }
                if (providerInfoResolveContentProvider != null) {
                    try {
                        cursorQuery = contentResolver.query(uri, strArr, null, null, null);
                    } catch (IllegalArgumentException | NullPointerException | SecurityException unused2) {
                        cursorQuery = null;
                    }
                    if (cursorQuery != null) {
                        while (cursorQuery.moveToNext()) {
                            try {
                                treeSet.add(Integer.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex("version"))));
                            } catch (Throwable th4) {
                                cursor = cursorQuery;
                                th2 = th4;
                                if (cursor == null) {
                                    throw th2;
                                }
                                cursor.close();
                                throw th2;
                            }
                        }
                    }
                } else {
                    cursorQuery = null;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return treeSet;
            } catch (Throwable th5) {
                th2 = th5;
                cursor = null;
            }
        } catch (Throwable th6) {
            qf.a.a(this, th6);
            return null;
        }
    }

    public final com.android.billingclient.api.c0 k(List list, int[] iArr) {
        if (qf.a.b(this)) {
            return null;
        }
        try {
            q();
            if (list == null) {
                com.android.billingclient.api.c0 c0Var = new com.android.billingclient.api.c0((char) 0, 8);
                c0Var.f7470b = -1;
                return c0Var;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b1 b1Var = (b1) it.next();
                TreeSet treeSet = b1Var.f39970a;
                if (treeSet == null || treeSet.isEmpty()) {
                    b1Var.a(false);
                }
                int iB = b(b1Var.f39970a, l(), iArr);
                if (iB != -1) {
                    com.android.billingclient.api.c0 c0Var2 = new com.android.billingclient.api.c0((char) 0, 8);
                    c0Var2.f7471c = b1Var;
                    c0Var2.f7470b = iB;
                    return c0Var2;
                }
            }
            com.android.billingclient.api.c0 c0Var3 = new com.android.billingclient.api.c0((char) 0, 8);
            c0Var3.f7470b = -1;
            return c0Var3;
        } catch (Throwable th2) {
            qf.a.a(this, th2);
            return null;
        }
    }

    public static final Intent f(Intent intent, Bundle bundle, FacebookException facebookException) {
        if (!qf.a.b(c1.class)) {
            try {
                UUID uuidI = i(intent);
                if (uuidI != null) {
                    Intent intent2 = new Intent();
                    intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", n(intent));
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("action_id", uuidI.toString());
                    if (facebookException != null) {
                        bundle2.putBundle(MzwEyWCkjXL.pZxrkrENsTc, c(facebookException));
                    }
                    intent2.putExtra(PQgum.IrYUZoLiU, bundle2);
                    if (bundle != null) {
                        intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
                    }
                    return intent2;
                }
            } catch (Throwable th2) {
                qf.a.a(c1.class, th2);
                return null;
            }
        }
        return null;
    }

    public static final UUID i(Intent intent) {
        String stringExtra;
        if (qf.a.b(c1.class) || intent == null) {
            return null;
        }
        try {
            if (o(n(intent))) {
                Bundle bundleExtra = intent.getBundleExtra(xTCJ.KDputk);
                stringExtra = bundleExtra != null ? bundleExtra.getString("action_id") : null;
            } else {
                stringExtra = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
            }
            if (stringExtra != null) {
                try {
                    return UUID.fromString(stringExtra);
                } catch (IllegalArgumentException unused) {
                }
            }
            return null;
        } catch (Throwable th2) {
            qf.a.a(c1.class, th2);
            return null;
        }
    }
}
