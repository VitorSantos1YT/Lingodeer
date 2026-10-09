package com.google.android.gms.internal.measurement;

import com.adjust.sdk.Constants;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzagu implements zzagt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzpo f11365a = new zzpo(zzagr.f11362d, 81);

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final String A() {
        return (String) f11365a.c(78, "measurement.upload.url", "https://app-measurement.com/a").get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long B() {
        return ((Long) f11365a.b(67, "measurement.upload.max_bundles", 100L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long C() {
        return ((Long) f11365a.b(38, "measurement.service_client.reconnect_millis", 1000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final String D() {
        return (String) f11365a.c(58, "measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion").get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long E() {
        return ((Long) f11365a.b(75, "measurement.upload.max_batch_size", 65536L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long F() {
        return ((Long) f11365a.b(28, "measurement.upload.minimum_delay", 500L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long G() {
        return ((Long) f11365a.b(21, "measurement.experiment.max_ids", 50L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long H() {
        return ((Long) f11365a.b(48, "measurement.sgtm.upload.min_delay_after_background", 600000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long I() {
        return ((Long) f11365a.b(68, "measurement.upload.max_conversions_per_day", 10000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long J() {
        return ((Long) f11365a.b(22, "measurement.audience.filter_result_max_count", 200L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long K() {
        return ((Long) f11365a.b(76, "measurement.upload.retry_count", 6L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long L() {
        return ((Long) f11365a.b(49, "measurement.sgtm.upload.min_delay_after_broadcast", 1000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long M() {
        return ((Long) f11365a.b(29, "measurement.monitoring.sample_period_millis", 86400000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long N() {
        return ((Long) f11365a.b(65, "measurement.upload.interval", 3600000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final String O() {
        return (String) f11365a.c(45, "measurement.sgtm.upload.backoff_http_codes", "404,429,503,504").get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final String P() {
        return (String) f11365a.c(56, "measurement.rb.attribution.uri_authority", "google-analytics.com").get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long Q() {
        return ((Long) f11365a.b(73, "measurement.upload.max_queue_time", 518400000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long R() {
        return ((Long) f11365a.b(34, "measurement.upload.refresh_blacklisted_config_interval", 604800000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long S() {
        return ((Long) f11365a.b(54, "measurement.rb.attribution.max_retry_delay_seconds", 16L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long T() {
        return ((Long) f11365a.b(46, "measurement.sgtm.upload.batches_retrieval_limit", 5L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long U() {
        return ((Long) f11365a.b(64, "measurement.upload.initial_upload_delay_time", 15000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long V() {
        return ((Long) f11365a.b(66, "measurement.upload.max_bundle_size", 65536L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long W() {
        return ((Long) f11365a.b(36, "measurement.service_client.idle_disconnect_millis", 5000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long X() {
        return ((Long) f11365a.b(55, "measurement.rb.attribution.client.min_time_after_boot_seconds", 90L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long Y() {
        return ((Long) f11365a.b(57, "measurement.rb.attribution.max_queue_time", 864000000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long Z() {
        return ((Long) f11365a.b(74, "measurement.upload.max_realtime_events_per_day", 10L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long a() {
        return ((Long) f11365a.b(40, "measurement.sgtm.batch.long_queuing_threshold", 240000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long a0() {
        return ((Long) f11365a.b(47, "measurement.sgtm.upload.max_queued_batches", 5000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long b() {
        return ((Long) f11365a.b(20, "measurement.store.max_stored_events_per_app", 100000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long b0() {
        return ((Long) f11365a.b(27, "measurement.alarm_manager.minimum_interval", 60000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long c() {
        return ((Long) f11365a.b(17, "measurement.lifetimevalue.max_currency_tracked", 4L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long d() {
        return ((Long) f11365a.b(71, "measurement.upload.max_events_per_day", 100000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final String e() {
        return (String) f11365a.c(32, "measurement.rb.attribution.app_allowlist", BuildConfig.VERSION_NAME).get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long f() {
        return ((Long) f11365a.b(52, "measurement.sgtm.upload.retry_max_wait", 21600000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long g() {
        return ((Long) f11365a.b(25, "measurement.rb.attribution.max_trigger_uris_queried_at_once", 0L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long h() {
        return ((Long) f11365a.b(62, "measurement.redaction.app_instance_id.ttl", 7200000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long i() {
        return ((Long) f11365a.b(79, "measurement.upload.window_interval", 3600000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long j() {
        return ((Long) f11365a.b(26, "measurement.rb.attribution.client.min_ad_services_version", 7L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long k() {
        return ((Long) f11365a.b(72, "measurement.upload.max_public_events_per_day", 50000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long l() {
        return ((Long) f11365a.b(33, "measurement.upload.realtime_upload_interval", 10000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long m() {
        return ((Long) f11365a.b(53, "measurement.upload.stale_data_deletion_interval", 86400000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long n() {
        return ((Long) f11365a.b(63, "measurement.upload.backoff_period", 43200000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final String o() {
        return (String) f11365a.c(80, "measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot").get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long p() {
        return ((Long) f11365a.b(69, "measurement.upload.max_error_events_per_day", 1000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long q() {
        return ((Long) f11365a.b(41, "measurement.sgtm.batch.retry_interval", 1800000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long r() {
        return ((Long) f11365a.b(23, "measurement.upload.max_item_scoped_custom_parameters", 27L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long s() {
        return ((Long) f11365a.b(77, "measurement.upload.retry_time", 1800000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long t() {
        return ((Long) f11365a.b(50, "measurement.sgtm.upload.min_delay_after_startup", 5000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long u() {
        return ((Long) f11365a.b(42, "measurement.sgtm.batch.retry_max_count", 10L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long v() {
        return ((Long) f11365a.b(70, "measurement.upload.max_events_per_bundle", 1000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final boolean w() {
        return ((Boolean) f11365a.a(31, "measurement.config.notify_trigger_uris_on_backgrounded", true).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long x() {
        return ((Long) f11365a.b(51, "measurement.sgtm.upload.retry_interval", 600000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long y() {
        return ((Long) f11365a.b(24, "measurement.rb.max_trigger_registrations_per_day", 1000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long z() {
        return ((Long) f11365a.b(61, "measurement.sdk.attribution.cache.ttl", 604800000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long zzD() {
        return ((Long) f11365a.b(30, "measurement.rb.attribution.notify_app_delay_millis", 3000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long zzN() {
        return ((Long) f11365a.b(43, "measurement.sgtm.batch.retry_max_wait", 21600000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final String zzO() {
        return (String) f11365a.c(44, "measurement.sgtm.service_upload_apps_list", BuildConfig.VERSION_NAME).get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long zza() {
        return ((Long) f11365a.b(0, "measurement.ad_id_cache_time", 10000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final String zzad() {
        return (String) f11365a.c(59, "measurement.rb.attribution.query_parameters_to_remove", BuildConfig.VERSION_NAME).get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final String zzae() {
        return (String) f11365a.c(60, "measurement.rb.attribution.uri_scheme", Constants.SCHEME).get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long zzb() {
        return ((Long) f11365a.b(1, "measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final boolean zzc() {
        return ((Boolean) f11365a.a(2, "measurement.config.bundle_for_all_apps_on_backgrounded", true).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long zzd() {
        return ((Long) f11365a.b(3, "measurement.max_bundles_per_iteration", 100L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final String zze() {
        return (String) f11365a.c(4, "measurement.gbraid_campaign.campaign_params_triggering_info_update", "gclid,gbraid,gad_campaignid").get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long zzf() {
        return ((Long) f11365a.b(5, "measurement.config.cache_time", 86400000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final String zzg() {
        return (String) f11365a.c(7, "measurement.config.url_authority", "app-measurement.com").get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final String zzh() {
        return (String) f11365a.c(8, "measurement.config.url_scheme", Constants.SCHEME).get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long zzi() {
        return ((Long) f11365a.b(9, "measurement.upload.debug_upload_interval", 1000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final boolean zzj() {
        return ((Boolean) f11365a.a(10, "measurement.config.default_flag_values", true).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long zzk() {
        return ((Long) f11365a.b(11, "45769094", 3600000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long zzl() {
        return ((Long) f11365a.b(12, "measurement.session.engagement_interval", 3600000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final String zzm() {
        return (String) f11365a.c(13, "measurement.rb.attribution.event_params", "value|currency").get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final String zzn() {
        return (String) f11365a.c(14, "measurement.edpb.events_cached_in_no_data_mode", "_f,_v,_cmp").get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long zzo() {
        return ((Long) f11365a.b(15, "measurement.upload.google_signal_max_queue_time", 605000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final String zzp() {
        return (String) f11365a.c(16, "measurement.sgtm.google_signal.url", "https://app-measurement.com/s/d").get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long zzr() {
        return ((Long) f11365a.b(18, "measurement.dma_consent.max_daily_dcu_realtime_events", 1L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long zzs() {
        return ((Long) f11365a.b(19, "measurement.upload.max_event_parameter_value_length", 500L).get()).longValue();
    }
}
