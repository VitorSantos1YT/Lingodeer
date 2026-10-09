package com.google.android.gms.fido;

import com.google.android.gms.common.Feature;
import com.google.zxing.aztec.detector.zTGP.gkbGsXmgaxRjJ;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zza {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Feature f9367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Feature f9368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Feature f9369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Feature f9370d;

    static {
        new Feature("cancel_target_direct_transfer", 1L);
        new Feature("delete_credential", 1L);
        new Feature("delete_device_public_key", 1L);
        new Feature("get_or_generate_device_public_key", 1L);
        new Feature("get_passkeys", 1L);
        new Feature("update_passkey", 1L);
        f9367a = new Feature("is_user_verifying_platform_authenticator_available_for_credential", 1L);
        f9368b = new Feature("is_user_verifying_platform_authenticator_available", 1L);
        f9369c = new Feature("privileged_api_list_credentials", 2L);
        new Feature("start_target_direct_transfer", 1L);
        new Feature("first_party_api_get_link_info", 1L);
        new Feature("zero_party_api_register", 3L);
        new Feature("zero_party_api_sign", 3L);
        new Feature("zero_party_api_list_discoverable_credentials", 2L);
        new Feature("zero_party_api_authenticate_passkey", 1L);
        new Feature("zero_party_api_register_passkey", 1L);
        new Feature("zero_party_api_register_passkey_with_sync_account", 1L);
        new Feature("zero_party_api_get_hybrid_client_registration_pending_intent", 1L);
        new Feature(gkbGsXmgaxRjJ.wbdMCeChBE, 1L);
        f9370d = new Feature("get_browser_hybrid_client_sign_pending_intent", 1L);
        new Feature("get_browser_hybrid_client_registration_pending_intent", 1L);
        new Feature("privileged_authenticate_passkey", 1L);
        new Feature("privileged_register_passkey_with_sync_account", 1L);
        new Feature("zero_party_api_get_privileged_hybrid_client_registration_pending_intent", 1L);
        new Feature("zero_party_api_get_privileged_hybrid_client_sign_pending_intent", 1L);
    }
}
