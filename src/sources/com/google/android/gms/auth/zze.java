package com.google.android.gms.auth;

import com.google.android.gms.common.Feature;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zze {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Feature f8558a = new Feature("account_capability_api", 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Feature f8559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Feature f8560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Feature f8561d;

    static {
        new Feature("account_data_service", 6L);
        new Feature("account_data_service_legacy", 1L);
        new Feature("account_data_service_token", 8L);
        new Feature("account_data_service_visibility", 1L);
        new Feature("config_sync", 1L);
        new Feature("device_account_api", 1L);
        new Feature("device_account_jwt_creation", 1L);
        new Feature("gaiaid_primary_email_api", 1L);
        new Feature("get_restricted_accounts_api", 1L);
        f8559b = new Feature("google_auth_service_accounts", 2L);
        f8560c = new Feature("google_auth_service_token", 3L);
        new Feature("hub_mode_api", 1L);
        f8561d = new Feature("work_account_client_is_whitelisted", 1L);
        new Feature("factory_reset_protection_api", 1L);
        new Feature("google_auth_api", 1L);
    }
}
