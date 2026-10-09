package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.Feature;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Feature f11635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Feature f11636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Feature f11637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Feature[] f11638d;

    static {
        Feature feature = new Feature("commit_to_configuration_v2_api", -1, 1L, true);
        f11635a = feature;
        Feature feature2 = new Feature("get_serving_version_api", -1, 1L, true);
        Feature feature3 = new Feature("get_experiment_tokens_api", -1, 1L, true);
        Feature feature4 = new Feature("register_flag_update_listener_api", -1, 2L, true);
        f11636b = feature4;
        Feature feature5 = new Feature("sync_after_api", -1, 1L, true);
        Feature feature6 = new Feature("sync_after_for_application_api", -1, 1L, true);
        Feature feature7 = new Feature("set_app_wide_properties_api", -1, 1L, true);
        Feature feature8 = new Feature("set_runtime_properties_api", -1, 1L, true);
        Feature feature9 = new Feature("get_storage_info_api", -1, 1L, true);
        f11637c = feature9;
        f11638d = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7, feature8, feature9};
    }
}
