package com.google.firebase.remoteconfig.internal;

import androidx.fragment.app.d;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.util.BiConsumer;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ConfigGetParameterHandler {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f20731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f20732f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f20733a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f20734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConfigCacheClient f20735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConfigCacheClient f20736d;

    static {
        Charset.forName(Constants.ENCODING);
        f20731e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        f20732f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public ConfigGetParameterHandler(Executor executor, ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2) {
        this.f20734b = executor;
        this.f20735c = configCacheClient;
        this.f20736d = configCacheClient2;
    }

    public static String b(ConfigCacheClient configCacheClient, String str) {
        ConfigContainer configContainerC = configCacheClient.c();
        if (configContainerC == null) {
            return null;
        }
        try {
            return configContainerC.f20697b.getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void a(String str, ConfigContainer configContainer) {
        if (configContainer == null) {
            return;
        }
        synchronized (this.f20733a) {
            try {
                Iterator it = this.f20733a.iterator();
                while (it.hasNext()) {
                    this.f20734b.execute(new d((BiConsumer) it.next(), str, configContainer, 5));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
