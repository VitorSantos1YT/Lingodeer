package se;

import am.rVFB.LwKl;
import com.facebook.FacebookException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f51614b = ry.x.X(new qy.l(u.IAPParameters, new qy.l(ry.l.m0(new String[]{"fb_iap_package_name", "fb_iap_subs_auto_renewing", LwKl.WSxLN, "fb_intro_price_amount_micros", "fb_intro_price_cycles", "fb_iap_base_plan", "is_implicit_purchase_logging_enabled", "fb_iap_sdk_supported_library_versions", "is_autolog_app_events_enabled", "fb_iap_client_library_version", "fb_iap_subs_period", "fb_iap_purchase_token", "fb_iap_non_deduped_event_time", "fb_iap_actual_dedup_result", "fb_iap_actual_dedup_key_used", "fb_iap_test_dedup_result", "fb_iap_test_dedup_key_used"}), ry.l.m0(new String[]{"fb_iap_product_id", "fb_iap_product_type", "fb_iap_purchase_time"}))));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f51615a = new LinkedHashMap();

    public final void a(u type, String key, Object value) {
        LinkedHashMap linkedHashMap = this.f51615a;
        kotlin.jvm.internal.m.f(type, "type");
        kotlin.jvm.internal.m.f(key, "key");
        kotlin.jvm.internal.m.f(value, "value");
        try {
            HashSet hashSet = f.f51591f;
            ue.f.E(key);
            if (!(value instanceof String) && !(value instanceof Number)) {
                throw new FacebookException(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{value, key}, 2)));
            }
            if (!linkedHashMap.containsKey(type)) {
                linkedHashMap.put(type, new LinkedHashMap());
            }
            Map map = (Map) linkedHashMap.get(type);
            if (map != null) {
                map.put(key, value);
            }
        } catch (Exception unused) {
        }
    }
}
