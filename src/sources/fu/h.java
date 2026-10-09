package fu;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f28100b;

    public /* synthetic */ h(Context context, int i11) {
        this.f28099a = i11;
        this.f28100b = context;
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, java.util.Collection] */
    @Override // fz.c
    public final Object invoke(Object obj) {
        Boolean bool;
        switch (this.f28099a) {
            case 0:
                Uri uri = (Uri) obj;
                kotlin.jvm.internal.m.f(uri, "uri");
                ks.b.j(this.f28100b, uri);
                break;
            case 1:
                Bundle bundle = (Bundle) obj;
                j9.v vVarK = com.bumptech.glide.d.k(this.f28100b);
                if (bundle != null) {
                    bundle.setClassLoader(vVarK.f36256a.getClassLoader());
                }
                m9.g gVar = vVarK.f36257b;
                LinkedHashMap linkedHashMap = gVar.m;
                if (bundle == null) {
                    bool = null;
                } else {
                    gVar.f41073d = bundle.containsKey("android-support-nav:controller:navigatorState") ? com.bumptech.glide.f.v("android-support-nav:controller:navigatorState", bundle) : null;
                    gVar.f41074e = bundle.containsKey("android-support-nav:controller:backStack") ? (Bundle[]) com.bumptech.glide.f.u(bundle, "android-support-nav:controller:backStack", kotlin.jvm.internal.z.a(Bundle.class)).toArray(new Bundle[0]) : null;
                    linkedHashMap.clear();
                    if (bundle.containsKey("android-support-nav:controller:backStackDestIds") && bundle.containsKey("android-support-nav:controller:backStackIds")) {
                        int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
                        if (intArray == null) {
                            com.bumptech.glide.g.r("android-support-nav:controller:backStackDestIds");
                            throw null;
                        }
                        ArrayList arrayListX = com.bumptech.glide.f.x("android-support-nav:controller:backStackIds", bundle);
                        int length = intArray.length;
                        int i11 = 0;
                        int i12 = 0;
                        while (i11 < length) {
                            int i13 = i12 + 1;
                            gVar.f41081l.put(Integer.valueOf(intArray[i11]), !kotlin.jvm.internal.m.a(arrayListX.get(i12), BuildConfig.VERSION_NAME) ? (String) arrayListX.get(i12) : null);
                            i11++;
                            i12 = i13;
                        }
                    }
                    bool = null;
                    if (bundle.containsKey("android-support-nav:controller:backStackStates")) {
                        ArrayList arrayListX2 = com.bumptech.glide.f.x("android-support-nav:controller:backStackStates", bundle);
                        int size = arrayListX2.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj2 = arrayListX2.get(i14);
                            i14++;
                            String str = (String) obj2;
                            String key = "android-support-nav:controller:backStackStates:" + str;
                            kotlin.jvm.internal.m.f(key, "key");
                            if (bundle.containsKey(key)) {
                                String key2 = "android-support-nav:controller:backStackStates:" + str;
                                kotlin.jvm.internal.m.f(key2, "key");
                                ArrayList arrayListU = com.bumptech.glide.f.u(bundle, key2, kotlin.jvm.internal.z.a(Bundle.class));
                                ry.k kVar = new ry.k(arrayListU.size());
                                int size2 = arrayListU.size();
                                int i15 = 0;
                                while (i15 < size2) {
                                    Object obj3 = arrayListU.get(i15);
                                    i15++;
                                    kVar.addLast(new j9.f((Bundle) obj3));
                                }
                                linkedHashMap.put(str, kVar);
                            }
                        }
                    }
                }
                if (bundle != null) {
                    boolean z11 = bundle.getBoolean("android-support-nav:controller:deepLinkHandled", false);
                    Boolean boolValueOf = (z11 || !bundle.getBoolean("android-support-nav:controller:deepLinkHandled", true)) ? Boolean.valueOf(z11) : bool;
                    vVarK.f36260e = boolValueOf != null ? boolValueOf.booleanValue() : false;
                }
                return vVarK;
            case 2:
                x10.a module = (x10.a) obj;
                kotlin.jvm.internal.m.f(module, "$this$module");
                final Context context = this.f28100b;
                boolean z12 = context instanceof Application;
                b20.b bVar = c20.b.f6511e;
                if (z12) {
                    final int i16 = 0;
                    v10.d dVar = new v10.d(new u10.a(bVar, kotlin.jvm.internal.z.a(Application.class), new fz.e() { // from class: o10.a
                        @Override // fz.e
                        public final Object invoke(Object obj4, Object obj5) {
                            e20.a single = (e20.a) obj4;
                            a20.a it = (a20.a) obj5;
                            switch (i16) {
                                case 0:
                                    m.f(single, "$this$single");
                                    m.f(it, "it");
                                    return (Application) context;
                                default:
                                    m.f(single, "$this$single");
                                    m.f(it, "it");
                                    return context;
                            }
                        }
                    }, u10.b.Singleton));
                    module.a(dVar);
                    kotlin.jvm.internal.e eVarA = kotlin.jvm.internal.z.a(Context.class);
                    u10.a aVar = dVar.f53471a;
                    aVar.f52730e = ry.m.G0(eVarA, aVar.f52730e);
                    String mapping = f20.a.a(eVarA) + ':' + BuildConfig.VERSION_NAME + ':' + aVar.f52726a;
                    kotlin.jvm.internal.m.f(mapping, "mapping");
                    module.f55749c.put(mapping, dVar);
                } else {
                    final int i17 = 1;
                    module.a(new v10.d(new u10.a(bVar, kotlin.jvm.internal.z.a(Context.class), new fz.e() { // from class: o10.a
                        @Override // fz.e
                        public final Object invoke(Object obj4, Object obj5) {
                            e20.a single = (e20.a) obj4;
                            a20.a it = (a20.a) obj5;
                            switch (i17) {
                                case 0:
                                    m.f(single, "$this$single");
                                    m.f(it, "it");
                                    return (Application) context;
                                default:
                                    m.f(single, "$this$single");
                                    m.f(it, "it");
                                    return context;
                            }
                        }
                    }, u10.b.Singleton)));
                }
                return qy.b0.f48488a;
            case 3:
                Uri uri2 = (Uri) obj;
                kotlin.jvm.internal.m.f(uri2, "uri");
                ks.b.j(this.f28100b, uri2);
                break;
            default:
                Uri uri3 = (Uri) obj;
                kotlin.jvm.internal.m.f(uri3, "uri");
                ks.b.j(this.f28100b, uri3);
                break;
        }
        return qy.b0.f48488a;
    }
}
