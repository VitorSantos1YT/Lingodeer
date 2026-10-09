package com.google.android.material.color;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import com.adjust.sdk.Constants;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.m;
import v4.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class DynamicColors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f14285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f14286b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface DeviceSupportCondition {
        boolean a();
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface OnAppliedCallback {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface Precondition {
    }

    static {
        DeviceSupportCondition deviceSupportCondition = new DeviceSupportCondition() { // from class: com.google.android.material.color.DynamicColors.1
            @Override // com.google.android.material.color.DynamicColors.DeviceSupportCondition
            public final boolean a() {
                return true;
            }
        };
        DeviceSupportCondition deviceSupportCondition2 = new DeviceSupportCondition() { // from class: com.google.android.material.color.DynamicColors.2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Long f14287a;

            @Override // com.google.android.material.color.DynamicColors.DeviceSupportCondition
            public final boolean a() {
                if (this.f14287a == null) {
                    try {
                        Method declaredMethod = Build.class.getDeclaredMethod("getLong", String.class);
                        declaredMethod.setAccessible(true);
                        Long l9 = (Long) declaredMethod.invoke(null, "ro.build.version.oneui");
                        l9.longValue();
                        this.f14287a = l9;
                    } catch (Exception unused) {
                        this.f14287a = -1L;
                    }
                }
                return this.f14287a.longValue() >= 40100;
            }
        };
        HashMap map = new HashMap();
        map.put("fcnt", deviceSupportCondition);
        map.put(Constants.REFERRER_API_GOOGLE, deviceSupportCondition);
        map.put("hmd global", deviceSupportCondition);
        map.put("infinix", deviceSupportCondition);
        map.put("infinix mobility limited", deviceSupportCondition);
        map.put("itel", deviceSupportCondition);
        map.put("kyocera", deviceSupportCondition);
        map.put("lenovo", deviceSupportCondition);
        map.put("lge", deviceSupportCondition);
        map.put("meizu", deviceSupportCondition);
        map.put("motorola", deviceSupportCondition);
        map.put("nothing", deviceSupportCondition);
        map.put("oneplus", deviceSupportCondition);
        map.put("oppo", deviceSupportCondition);
        map.put("realme", deviceSupportCondition);
        map.put("robolectric", deviceSupportCondition);
        map.put(Constants.REFERRER_API_SAMSUNG, deviceSupportCondition2);
        map.put("sharp", deviceSupportCondition);
        map.put("shift", deviceSupportCondition);
        map.put("sony", deviceSupportCondition);
        map.put("tcl", deviceSupportCondition);
        map.put("tecno", deviceSupportCondition);
        map.put("tecno mobile limited", deviceSupportCondition);
        map.put(Constants.REFERRER_API_VIVO, deviceSupportCondition);
        map.put("wingtech", deviceSupportCondition);
        map.put(Constants.REFERRER_API_XIAOMI, deviceSupportCondition);
        f14285a = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("asus", deviceSupportCondition);
        map2.put("jio", deviceSupportCondition);
        f14286b = Collections.unmodifiableMap(map2);
    }

    private DynamicColors() {
    }

    public static void a(Activity activity) {
        Integer num = 0;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 31) {
            return;
        }
        int i12 = a.f53505a;
        if (i11 >= 33) {
            throw null;
        }
        if (i11 >= 32) {
            String CODENAME = Build.VERSION.CODENAME;
            m.e(CODENAME, "CODENAME");
            if (!"REL".equals(CODENAME)) {
                Locale locale = Locale.ROOT;
                String upperCase = CODENAME.toUpperCase(locale);
                m.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                Integer num2 = upperCase.equals("BAKLAVA") ? num : null;
                String upperCase2 = "Tiramisu".toUpperCase(locale);
                m.e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                num = upperCase2.equals("BAKLAVA") ? 0 : null;
                if (num2 == null || num == null) {
                    if (num2 == null && num == null) {
                        String upperCase3 = CODENAME.toUpperCase(locale);
                        m.e(upperCase3, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                        String upperCase4 = "Tiramisu".toUpperCase(locale);
                        m.e(upperCase4, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                        if (upperCase3.compareTo(upperCase4) >= 0) {
                            throw null;
                        }
                    } else if (num2 != null) {
                        throw null;
                    }
                } else if (num2.intValue() >= num.intValue()) {
                    throw null;
                }
            }
        }
        String str = Build.MANUFACTURER;
        Locale locale2 = Locale.ROOT;
        DeviceSupportCondition deviceSupportCondition = (DeviceSupportCondition) f14285a.get(str.toLowerCase(locale2));
        if (deviceSupportCondition == null) {
            deviceSupportCondition = (DeviceSupportCondition) f14286b.get(Build.BRAND.toLowerCase(locale2));
        }
        if (deviceSupportCondition != null && deviceSupportCondition.a()) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class DynamicColorsActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPreCreated(Activity activity, Bundle bundle) {
            DynamicColors.a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
