package com.google.android.gms.internal.p002firebaseauthapi;

import aj.uZCn.evRpcb;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.zzaq;
import defpackage.e;
import ep.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzady extends AsyncTask<Void, Void, zzaeb> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f9840g = new Logger("FirebaseAuth", "GetAuthDomainTask");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f9843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Uri.Builder f9844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f9845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FirebaseApp f9846f;

    public zzady(String str, String str2, Intent intent, FirebaseApp firebaseApp, zzaea zzaeaVar) {
        Preconditions.d(str);
        this.f9841a = str;
        this.f9846f = firebaseApp;
        Preconditions.d(str2);
        Preconditions.g(intent);
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        Preconditions.d(stringExtra);
        Uri.Builder builderBuildUpon = Uri.parse(zzaeaVar.zza(stringExtra)).buildUpon();
        Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendPath("getProjectConfig").appendQueryParameter("key", stringExtra).appendQueryParameter("androidPackageName", str);
        Preconditions.g(str2);
        builderAppendQueryParameter.appendQueryParameter("sha1Cert", str2);
        this.f9842b = builderBuildUpon.build().toString();
        this.f9843c = new WeakReference(zzaeaVar);
        this.f9844d = zzaeaVar.b(intent, str, str2);
        this.f9845e = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    public static String a(HttpURLConnection httpURLConnection) {
        try {
            if (httpURLConnection.getResponseCode() < 400) {
                return null;
            }
            InputStream errorStream = httpURLConnection.getErrorStream();
            return errorStream == null ? "WEB_INTERNAL_ERROR:Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again." : zzaej.b(new String(d(errorStream)));
        } catch (IOException e8) {
            f9840g.b("Error parsing error message from response body in getErrorMessageFromBody. ".concat(String.valueOf(e8)), new Object[0]);
            return null;
        }
    }

    public static boolean c(String str) {
        try {
            String host = new URI("https://" + str).getHost();
            return host != null && (host.endsWith("firebaseapp.com") || host.endsWith("web.app"));
        } catch (URISyntaxException e8) {
            f9840g.b(e.n("Error parsing URL for auth domain check: ", str, ". ", e8.getMessage()), new Object[0]);
        }
    }

    public static byte[] d(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[128];
            while (true) {
                int i11 = inputStream.read(bArr);
                if (i11 == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i11);
            }
        } finally {
            byteArrayOutputStream.close();
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void onPostExecute(zzaeb zzaebVar) {
        String str;
        String str2;
        Uri.Builder builder;
        zzaea zzaeaVar = (zzaea) this.f9843c.get();
        if (zzaebVar != null) {
            str = zzaebVar.f9849a;
            str2 = zzaebVar.f9850b;
        } else {
            str = null;
            str2 = null;
        }
        if (zzaeaVar == null) {
            f9840g.b("An error has occurred: the handler reference has returned null.", new Object[0]);
        } else if (TextUtils.isEmpty(str) || (builder = this.f9844d) == null) {
            zzaeaVar.a(zzaq.a(str2));
        } else {
            builder.authority(str);
            zzaeaVar.d(builder.build(), this.f9841a, FirebaseAuth.getInstance(this.f9846f).f17892p);
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onCancelled(zzaeb zzaebVar) {
        onPostExecute(null);
    }

    @Override // android.os.AsyncTask
    public final zzaeb doInBackground(Void[] voidArr) {
        String str = this.f9845e;
        Logger logger = f9840g;
        try {
            URL url = new URL(this.f9842b);
            zzaea zzaeaVar = (zzaea) this.f9843c.get();
            HttpURLConnection httpURLConnectionC = zzaeaVar.c(url);
            httpURLConnectionC.addRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json; charset=UTF-8");
            httpURLConnectionC.setConnectTimeout(60000);
            new zzaem(zzaeaVar.zza(), this.f9846f, zzaek.a().b()).a(httpURLConnectionC);
            int responseCode = httpURLConnectionC.getResponseCode();
            if (responseCode != 200) {
                String strA = a(httpURLConnectionC);
                logger.b("Error getting project config. Failed with " + strA + " " + responseCode, new Object[0]);
                return zzaeb.b(strA);
            }
            zzahc zzahcVar = new zzahc();
            zzahcVar.zza(new String(d(httpURLConnectionC.getInputStream())));
            if (!TextUtils.isEmpty(str)) {
                return !zzahcVar.f9957a.contains(str) ? zzaeb.b("UNAUTHORIZED_DOMAIN") : zzaeb.a(str);
            }
            ArrayList arrayList = zzahcVar.f9957a;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                String str2 = (String) obj;
                if (c(str2)) {
                    return zzaeb.a(str2);
                }
            }
            return null;
        } catch (zzabz e8) {
            logger.b(a.e("ConversionException encountered: ", e8.getMessage()), new Object[0]);
            return null;
        } catch (IOException e10) {
            logger.b(a.e("IOException occurred: ", e10.getMessage()), new Object[0]);
            return null;
        } catch (NullPointerException e11) {
            logger.b(a.e(evRpcb.QPKtFGBTbtUAxK, e11.getMessage()), new Object[0]);
            return null;
        }
    }
}
